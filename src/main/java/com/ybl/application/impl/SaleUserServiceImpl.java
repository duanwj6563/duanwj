package com.ybl.application.impl;

import com.ybl.application.service.SaleUserService;
import com.ybl.domain.dto.SmisPerformanceDto;
import com.ybl.domain.dto.SmisSalesEntityDto;
import com.ybl.domain.secondary.model.*;
import com.ybl.domain.secondary.repository.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by duanwj on 2018/4/15 0015 17:43
 */
@Service
public class SaleUserServiceImpl implements SaleUserService {
    @Autowired
    private SmisSalesRepository smisSalesRepository;
    @Autowired
    private SmisTeamRepository teamRepository;
    @Autowired
    private SysBranchRepository branchRepository;
    @Autowired
    private SmisSalaryRepository salaryRepository;
    @Autowired
    private CbsContractlifeRepository contractlifeRepository;

    @Override
    public SmisSalesEntityDto getOneself(String username) {
        SmisSalesEntityDto smisSalesEntityDto = new SmisSalesEntityDto();
        //人员信息
        SmisSalesEntity salesEntity = smisSalesRepository.findBySalesId(username);
        BeanUtils.copyProperties(salesEntity, smisSalesEntityDto);
        //机构信息
        SysBranchEntity sysBranchEntity = branchRepository.findByBranchId(salesEntity.getBranchId());
        BeanUtils.copyProperties(sysBranchEntity, smisSalesEntityDto);
        //团队信息
        SmisTeamEntity smisTeamEntity = teamRepository.findByBranchIdAndTeamId(salesEntity.getBranchId(), salesEntity.getTeamId());
        BeanUtils.copyProperties(smisTeamEntity, smisSalesEntityDto);
        return smisSalesEntityDto;
    }

    @Override
    public BatPersonWageReportEntity getSalaryDetail(String username, String date) {
        BatPersonWageReportEntity batPersonWageReportEntity = new BatPersonWageReportEntity();
        batPersonWageReportEntity = salaryRepository.findByPersonNoAndCalcDateAndCalcType(username, date, "ZS");
        return batPersonWageReportEntity;
    }

    @Override
    public SmisPerformanceDto getPersonalPerformance(String username, String year, String month) {
        SmisPerformanceDto smisPerformanceDto = new SmisPerformanceDto();
        if (!StringUtils.isEmpty(year)) {
            List<CbsContractlifeEntity> lists = contractlifeRepository.year(username, year);
            BigDecimal money = new BigDecimal("0.00");
            //todo lambar 表达式实现
            for (CbsContractlifeEntity cb : lists) {
                money = money.add(cb.getPeriodPrem());
            }
            smisPerformanceDto.setMoney(money);
            smisPerformanceDto.setNumber(lists.size());
            smisPerformanceDto.setIncreaseNumber(smisSalesRepository.year(username, year).size());
        }
        if (!StringUtils.isEmpty(month)) {
            List<CbsContractlifeEntity> lists = contractlifeRepository.month(username, year);
            BigDecimal money = new BigDecimal("0.00");
            for (CbsContractlifeEntity cb : lists) {
                money = money.add(cb.getPeriodPrem());
            }
            smisPerformanceDto.setMoney(money);
            smisPerformanceDto.setNumber(lists.size());
            smisPerformanceDto.setIncreaseNumber(smisSalesRepository.month(username, year).size());
        }
        return smisPerformanceDto;
    }

    @Override
    public SmisPerformanceDto getTeamPerformance(String username, String year, String month) {
        return null;
    }

    @Override
    public SmisPerformanceDto getPerformance(String type, String username, String year, String month) {
        SmisPerformanceDto smisPerformanceDto = new SmisPerformanceDto();
        if ("1".equals(type)) {
            smisPerformanceDto = getPersonalPerformance(username, year, month);
        } else if ("2".equals(type)) {
            smisPerformanceDto = getTeamPerformance(username, year, month);
        }
        return smisPerformanceDto;
    }
}
