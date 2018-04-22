package com.ybl.application.service;

import com.ybl.domain.dto.SmisPerformanceDto;
import com.ybl.domain.dto.SmisSalesEntityDto;
import com.ybl.domain.secondary.model.BatPersonWageReportEntity;

import java.text.ParseException;

/**
 * Created by duanwj on 2018/4/15 0015 17:40
 */
public interface SaleUserService {
    /**
     * 获取自身信息
     *
     * @return
     */
    SmisSalesEntityDto getOneself(String username);

    /**
     * 根据月份得到销售人员的薪水明细
     *
     * @param username
     * @param date
     * @return
     * @throws ParseException
     */
    BatPersonWageReportEntity getSalaryDetail(String username, String date);

    /**
     * 查询个人业绩
     *
     * @param username
     * @param year
     * @param month
     * @return
     */
    SmisPerformanceDto getPersonalPerformance(String username, String year, String month);

    /**
     * 查询团队业绩
     *
     * @param username
     * @param year
     * @param month
     * @return
     */
    SmisPerformanceDto getTeamPerformance(String username, String year, String month);

    /**
     * 查询个人/团队业绩
     *
     * @param username
     * @param year
     * @param month
     * @return
     */
    SmisPerformanceDto getPerformance(String type, String username, String year, String month);

    //SmisPerformanceDto getSmisByTeamId(String teamId);

}
