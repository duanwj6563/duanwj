package com.ybl.domain.secondary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by duanwj on 2018/4/17 0017 18:03
 */
@Entity
@Table(name = "bat_person_wage_report", schema = "lifecore")
@IdClass(BatPersonWageReportEntityPK.class)
@Data
@ApiModel("员工薪水")
public class BatPersonWageReportEntity implements Serializable {
    private static final long serialVersionUID = -5382029262964106179L;
    @Id
    @Column(name = "CALC_DATE")
    @ApiModelProperty("日期")
    @JsonIgnore
    private Date calcDate;
    @Column(name = "PERSON_NO")
    @Id
    @JsonIgnore
    private String personNo;
    @Column(name = "IMPMEANSVER_NO")
    @Id
    @JsonIgnore
    private String impmeansverNo;
    @Column(name = "CALC_TYPE")
    @Id
    @JsonIgnore
    private String calcType;

    @ApiModelProperty("本人初年度佣金")
    @Column(name = "IP_XZ_I1008")
    private String ipXzI1008;
    @ApiModelProperty("本人续年度佣金")
    @Column(name = "ZM_XZ_I1004")
    private String zmXzI1004;
    @ApiModelProperty("新人底薪")
    @Column(name = "IP_XZ_I1001")
    private String ipXzI1001;
    @ApiModelProperty("伯乐奖")
    @Column(name = "IP_XZ_I1017")
    private String ipXzI1017;
    @ApiModelProperty("增员奖")
    @Column(name = "IP_XZ_I1018")
    private String ipXzI1018;
    @ApiModelProperty("育成奖")
    @Column(name = "IP_XZ_I1019")
    private String ipXzI1019;
    @ApiModelProperty("育成津贴")
    @Column(name = "IP_XZ_I1020")
    private String ipXzI1020;
    @ApiModelProperty("孤儿单续期利益部分回归")
    @Column(name = "IP_XZ_I1021")
    private String ipXzI1021;
    @ApiModelProperty("职务津贴")
    @Column(name = "ZM_XZ_I1017")
    private String zmXzI1017;
    @ApiModelProperty("个人所得税")
    @Column(name = "IP_XZ_I1022")
    private String ipXzI1022;
    @ApiModelProperty("部管理津贴")
    @Column(name = "IP_XZ_I1023")
    private String ipXzI1023;
    @ApiModelProperty("区管理津贴")
    @Column(name = "IP_XZ_I1024")
    private String ipXzI1024;
    @ApiModelProperty("督导区管理津贴")
    @Column(name = "IP_XZ_I1025")
    private String ipXzI1025;
    @ApiModelProperty("总计")
    @Column(name = "IP_XZ_I1026")
    private String ipXzI1026;
}
