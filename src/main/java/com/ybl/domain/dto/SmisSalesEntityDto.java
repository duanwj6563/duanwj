package com.ybl.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * Created by duanwj on 2018/4/13 0013 16:32
 */
@ApiModel("销售人员dto")
@Data
public class SmisSalesEntityDto implements Serializable {

    private static final long serialVersionUID = -6087789138992308491L;
    private String branchId;
    private String branchParentid;
    @ApiModelProperty("机构名字")
    private String branchName;
    @ApiModelProperty("机构简写")
    private String branchAbbr;
    private String parentTeamId;
    private String teamId;
    @ApiModelProperty("团队名字")
    private String teamName;
    @ApiModelProperty("团队简写")
    private String teamAbbr;
    @ApiModelProperty("主管代码")
    private String leaderId;
    @ApiModelProperty("人员代码")
    @Column(name = "sales_id")
    private String salesId;
    @ApiModelProperty("人员姓名")
    @Column(name = "sales_name")
    private String salesName;
}
