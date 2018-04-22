package com.ybl.application.impl;

import com.ybl.application.service.CrmCustomerService;
import com.ybl.common.CodeTypeConst;
import com.ybl.common.Message;
import com.ybl.common.StringUtil;
import com.ybl.domain.dto.SmisSalesEntityDto;
import com.ybl.domain.exception.ServerStatus;
import com.ybl.domain.exception.UserDefinedException;
import com.ybl.domain.secondary.model.CrmCustomerContactEntity;
import com.ybl.domain.secondary.model.CrmCustomerEntity;
import com.ybl.domain.secondary.model.CrmCustomerLogEntity;
import com.ybl.domain.secondary.model.SysBranchEntity;
import com.ybl.domain.secondary.repository.CrmCustomerContactRepository;
import com.ybl.domain.secondary.repository.CrmCustomerLogRepository;
import com.ybl.domain.secondary.repository.CrmCustomerRepository;
import com.ybl.domain.secondary.repository.SysBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class CrmCustomerServiceImpl implements CrmCustomerService {


    @Autowired
    private CrmCustomerContactRepository crmCustomerContactRepository;
    @Autowired
    private CrmCustomerRepository crmCustomerRepository;
    @Autowired
    private CrmCustomerLogRepository crmCustomerLogRepository;

    @Autowired
    private SysBranchRepository branchRepository;

    @Override
    public int addCrmCustomer(CrmCustomerContactEntity crmCustomerContactEntity, CrmCustomerEntity crmCustomerEntity, CrmCustomerLogEntity crmCustomerLogEntity, SmisSalesEntityDto smisSalesEntityDto){

        int a = 0;

        //机构信息
        SysBranchEntity sysBranchEntity = branchRepository.findByBranchId(crmCustomerContactEntity.getBranchId());
        String customer_id = createId(smisSalesEntityDto.getBranchId(),CodeTypeConst.POLICYLIFE_CUSTOMER_IDENTIFIER);
        crmCustomerEntity.setCustomerId(customer_id);

        /*if(sysBranchEntity != null){  //校验录入的机构代码是否正确
            throw new UserDefinedException(ServerStatus.OPERATION_FAILED, "录入的机构代码错误，请重新录入");
        }*/
        boolean  identity = verifyIsExistIdentityAndType(crmCustomerEntity);

        if(identity){
            throw new UserDefinedException(ServerStatus.OPERATION_FAILED,"客户已存在，请重新录入");
        }
        crmCustomerRepository.save(crmCustomerEntity);
        CrmCustomerEntity crmCustomerModel =  crmCustomerRepository.findByCustomerId(crmCustomerEntity.getCustomerId());
        crmCustomerContactEntity.setLogSeqId(crmCustomerModel.getSeqId());//备份数据主键

        crmCustomerContactRepository.save(crmCustomerContactEntity);

        crmCustomerLogRepository.save(crmCustomerLogEntity);

        a++;

        return a;
    }

    /**
     *
     * @param crmCustomerEntity
     * @return
     * @description:插入	效验证件号码与证件类型是否一致存在   存在 true 不存在 false
     */
    public boolean verifyIsExistIdentityAndType(CrmCustomerEntity crmCustomerEntity) {

        boolean returnbooean = true;


        List<CrmCustomerEntity> model0  = crmCustomerRepository.findByCertiTypeAndCertiNoAndNameAndBirthdayAndGenderAndBranchNo(crmCustomerEntity.getCertiType(),crmCustomerEntity.getCertiNo(),crmCustomerEntity.getName(),crmCustomerEntity.getBirthday(),crmCustomerEntity.getGender(),crmCustomerEntity.getBranchNo());


        if(StringUtil.isNull(crmCustomerEntity.getSeqId())){//如果是插入操作
            if(model0.size()==0){
                returnbooean = false;
            }else{
                returnbooean = true;
            }
        }else{	//如果是更新操作
            if(model0.size()==0){
                returnbooean = false;
            }else if(model0.size()==1  && model0.get(0).getSeqId() == crmCustomerEntity.getSeqId()){//如果没有更改 允许
                returnbooean = false;
            }else{
                returnbooean = true;
            }
        }
        return returnbooean;

    }


    //生成15位客户id号码  序列号默认是 series_code : 04
    public String createId(String branch_id,String series_code){
        String seq_code=queryCommonSeq("seq_id");

        //调用现成的方法对取出的识别码进行10位补0
        try {
            seq_code=StringUtil.alignLeft(seq_code, 10);
        } catch (Message message) {
            message.printStackTrace();
        }

        return branch_id.substring(0, 3)+series_code+seq_code;
    }

    public String queryCommonSeq(String seq_name) {
        // return
        // (String)this.getSqlMapClientTemplate().queryForObject("Seq.queryNextVal",
        // seq_name);
        // 数据库为mysql 没有序列，修改为八位数随机数
        String seq_id = getRandom(8);
        return seq_id;
    }

    public  static String getRandom(int leng) {
        StringBuilder str = new StringBuilder();// 定义变长字符串
        Random random = new Random();
        // 随机生成数字，并添加到字符串
        for (int i = 0; i < leng; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

}
