package com.ybl.ports.rest.controller;

import com.ybl.application.service.SaleUserService;
import com.ybl.common.AssertUtil;
import com.ybl.common.ResultUtil;
import com.ybl.domain.dto.SmisPerformanceDto;
import com.ybl.domain.dto.SmisSalesEntityDto;
import com.ybl.domain.primary.model.Result;
import com.ybl.domain.secondary.model.BatPersonWageReportEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * 登录注册控制层
 */
@RestController
@RequestMapping("users")
@Api("销售人员controller")
public class SaleUserController {
    @Autowired
    private SaleUserService userService;

    @ApiOperation("获取当前登录用户信息接口")
    @GetMapping("/current")
    public Result<SmisSalesEntityDto> getCurrentInfo(@AuthenticationPrincipal UserDetails user) {
        return ResultUtil.success(userService.getOneself(user.getUsername()));
    }

    @ApiOperation("工资明细接口")
    @GetMapping("/salaryDetail")
    public Result<BatPersonWageReportEntity> getSalaryDetail(@AuthenticationPrincipal UserDetails user,
                                                             @ApiParam(value = "月份 格式 2018-01", required = true)
                                                             @RequestParam(value = "date") String date) throws ParseException {
        AssertUtil.isNotNull(date, "查询月份不能为空");
        return ResultUtil.success(userService.getSalaryDetail(user.getUsername(), date));
    }

    @ApiOperation("查询个人/团队业绩")
    @GetMapping("/performance")
    public Result<SmisPerformanceDto> getPerformance(@AuthenticationPrincipal UserDetails user,
                                                     @ApiParam(value = "年份 2018")
                                                     @RequestParam(value = "year", required = false) String year,
                                                     @ApiParam(value = "月份 2018-02")
                                                     @RequestParam(value = "month", required = false) String month,
                                                     @ApiParam(value = "类型 1-个人，2-团队", required = true)
                                                     @RequestParam(value = "type") String type
    ) {
        AssertUtil.isNotNull(type, "查询类型不能为空");
        return ResultUtil.success(userService.getPerformance(type, user.getUsername(), year, month));
    }
}
