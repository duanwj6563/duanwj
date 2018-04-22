package com.ybl.ports.rest.controller;

import com.ybl.application.service.CrmCustomerService;
import com.ybl.application.service.SaleUserService;
import com.ybl.common.AssertUtil;
import com.ybl.common.CodeTypeConst;
import com.ybl.common.ResultUtil;
import com.ybl.domain.dto.CrmCustomerDto;
import com.ybl.domain.dto.SmisSalesEntityDto;
import com.ybl.domain.primary.model.Result;
import com.ybl.domain.secondary.model.CrmCustomerContactEntity;
import com.ybl.domain.secondary.model.CrmCustomerEntity;
import com.ybl.domain.secondary.model.CrmCustomerLogEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 客户维护控制层
 */
@RestController
@RequestMapping("crmCustomerController")
@Api("客户controller")
public class CrmCustomerController {

    @Autowired
    private CrmCustomerService crmCustomerService;

    @Autowired
    private SaleUserService saleUserService;


    @ApiOperation("客户录入接口")
    @PostMapping("/addCrmCustomer")
    public Result<Integer> addCrmCustomer(@Valid @RequestBody CrmCustomerDto crmCustomerDto , @AuthenticationPrincipal UserDetails user, BindingResult bindingResult) {
        AssertUtil.bindingResult(bindingResult);
        //客户基本信息
        CrmCustomerContactEntity crmCustomerContactEntity = new CrmCustomerContactEntity();
        //客户联系信息
        CrmCustomerEntity crmCustomerEntity = new CrmCustomerEntity();
        //客户基本信息
        CrmCustomerLogEntity crmCustomerLogEntity = new CrmCustomerLogEntity();


        SmisSalesEntityDto smisSalesEntityDto = saleUserService.getOneself(user.getUsername());

        crmCustomerEntity.setName(crmCustomerDto.getName());
        crmCustomerEntity.setMemberId(crmCustomerDto.getMemberId());
        crmCustomerEntity.setTitle(crmCustomerDto.getTitle());
        crmCustomerEntity.setGender(crmCustomerDto.getGender());
        crmCustomerEntity.setBirthday(crmCustomerDto.getBirthday());
        crmCustomerEntity.setCustomerType(crmCustomerDto.getCustomerType());
        crmCustomerEntity.setCertiType(crmCustomerDto.getCertiType());
        crmCustomerEntity.setCertiNo(crmCustomerDto.getCertiNo());
        crmCustomerEntity.setEducation(crmCustomerDto.getEducation());
        crmCustomerEntity.setNationality(crmCustomerDto.getNationality());
        crmCustomerEntity.setNation(crmCustomerDto.getNation());
        crmCustomerEntity.setHomeplace(crmCustomerDto.getHomeplace());
        crmCustomerEntity.setSeatAddress(crmCustomerDto.getSeatAddress());
        crmCustomerEntity.setHeight(crmCustomerDto.getHeight());
        crmCustomerEntity.setWeight(crmCustomerDto.getWeight());
        crmCustomerEntity.setPolitical(crmCustomerDto.getPolitical());
        crmCustomerEntity.setEducation2(crmCustomerDto.getEducation2());
        crmCustomerEntity.setMaritalStat(crmCustomerDto.getMaritalStat());
        crmCustomerEntity.setHealth(crmCustomerDto.getHealth());
        crmCustomerEntity.setJobType(crmCustomerDto.getJobType());
        crmCustomerEntity.setJobCode(crmCustomerDto.getJobCode());
        crmCustomerEntity.setIncomeType(crmCustomerDto.getIncomeType());
        crmCustomerEntity.setBankCode(crmCustomerDto.getBankCode());
        crmCustomerEntity.setBankAccountNo(crmCustomerDto.getBankAccountNo());
        crmCustomerEntity.setBankAccountName(crmCustomerDto.getBankAccountName());
        crmCustomerEntity.setRemark(crmCustomerDto.getRemark());
        //model1.setCustomer_id(customer_id.substring(3, 12));
        crmCustomerEntity.setCertiValiddate(crmCustomerDto.getCertiValiddate());
        crmCustomerEntity.setIsTelmsgservice(crmCustomerDto.getIsTelmsgservice());
        crmCustomerEntity.setBranchNo("");
        crmCustomerEntity.setStatus(CodeTypeConst.CUSTOMER_STATUS_VALID);
        crmCustomerEntity.setCreateuser(user.getUsername());
        crmCustomerEntity.setModifyuser(user.getUsername());


        //客户联系信息

        crmCustomerContactEntity.setBranchId(smisSalesEntityDto.getBranchId());
        crmCustomerContactEntity.setAddress(crmCustomerDto.getAddress());
        crmCustomerContactEntity.setZip(crmCustomerDto.getZip());
        crmCustomerContactEntity.setMobile(crmCustomerDto.getMobile());
        crmCustomerContactEntity.setFax(crmCustomerDto.getFax());
        crmCustomerContactEntity.setTelphone(crmCustomerDto.getTelphone());
        crmCustomerContactEntity.setEmail(crmCustomerDto.getEmail());
        crmCustomerContactEntity.setJobCom(crmCustomerDto.getJobCode());
        crmCustomerContactEntity.setJobTel(crmCustomerDto.getJobType());
        crmCustomerContactEntity.setStatus(CodeTypeConst.CUSTOMER_STATUS_VALID);
        crmCustomerContactEntity.setCreateuser(user.getUsername());
        crmCustomerContactEntity.setModifyuser(user.getUsername());


        //客户基本信息日志表
        crmCustomerLogEntity.setName(crmCustomerDto.getName());
        crmCustomerLogEntity.setMemberId(crmCustomerDto.getMemberId());
        crmCustomerLogEntity.setTitle(crmCustomerDto.getTitle());
        crmCustomerLogEntity.setGender(crmCustomerDto.getGender());
        crmCustomerLogEntity.setBirthday(crmCustomerDto.getBirthday());
        crmCustomerLogEntity.setCustomerType(crmCustomerDto.getCustomerType());
        crmCustomerLogEntity.setCertiType(crmCustomerDto.getCertiType());
        crmCustomerLogEntity.setCertiNo(crmCustomerDto.getCertiNo());
        crmCustomerLogEntity.setEducation(crmCustomerDto.getEducation());
        crmCustomerLogEntity.setNationality(crmCustomerDto.getNationality());
        crmCustomerLogEntity.setNation(crmCustomerDto.getNation());
        crmCustomerLogEntity.setHomeplace(crmCustomerDto.getHomeplace());
        crmCustomerLogEntity.setSeatAddress(crmCustomerDto.getSeatAddress());
        crmCustomerLogEntity.setHeight(crmCustomerDto.getHeight());
        crmCustomerLogEntity.setWeight(crmCustomerDto.getWeight());
        crmCustomerLogEntity.setPolitical(crmCustomerDto.getPolitical());
        crmCustomerLogEntity.setEducation2(crmCustomerDto.getEducation2());
        crmCustomerLogEntity.setMaritalStat(crmCustomerDto.getMaritalStat());
        crmCustomerLogEntity.setHealth(crmCustomerDto.getHealth());
        crmCustomerLogEntity.setJobType(crmCustomerDto.getJobType());
        crmCustomerLogEntity.setJobCode(crmCustomerDto.getJobCode());
        crmCustomerLogEntity.setIncomeType(crmCustomerDto.getIncomeType());
        crmCustomerLogEntity.setBankCode(crmCustomerDto.getBankCode());
        crmCustomerLogEntity.setBankAccountNo(crmCustomerDto.getBankAccountNo());
        crmCustomerLogEntity.setBankAccountName(crmCustomerDto.getBankAccountName());
        crmCustomerLogEntity.setRemark(crmCustomerDto.getRemark());
        //model3.setCustomer_id(customer_id.substring(3, 12));
        crmCustomerLogEntity.setCertiValiddate(crmCustomerDto.getCertiValiddate());
        crmCustomerLogEntity.setIsTelmsgservice(crmCustomerDto.getIsTelmsgservice());

        crmCustomerContactEntity.setLogBustype(CodeTypeConst.CUSTOMER_STATUS_VALID);//备份业务类型
        if(crmCustomerContactEntity.getLogRemark() == null || "".equals(crmCustomerContactEntity.getLogRemark())){
            crmCustomerContactEntity.setLogRemark("添加客户联系信息时进行备注");//备份备注
        }


        int token = crmCustomerService.addCrmCustomer(crmCustomerContactEntity , crmCustomerEntity,crmCustomerLogEntity,smisSalesEntityDto);

        return ResultUtil.success(token);
    }
}
