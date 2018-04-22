package com.ybl.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;


@ApiModel("客户dto")
@Data
public class CrmCustomerDto implements Serializable {

    private int seqId;

    private String customerId;

    private String customerType;
    @ApiModelProperty("客户型么")
    private String name;
    @ApiModelProperty("称呼")
    private String title;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("出生日期")
    private Timestamp birthday;
    @ApiModelProperty("客户类型")
    private String certiType;
    @ApiModelProperty("证件号码")
    private String certiNo;
    @ApiModelProperty("证件有效时间")
    private Timestamp certiValiddate;
    @ApiModelProperty("教育程度")
    private String education;
    @ApiModelProperty("国籍")
    private String nationality;
    @ApiModelProperty("民族")
    private String nation;
    @ApiModelProperty("籍贯")
    private String homeplace;
    @ApiModelProperty("户口所在地")
    private String seatAddress;
    @ApiModelProperty("身高")
    private String height;
    @ApiModelProperty("体重")
    private String weight;
    @ApiModelProperty("政治面貌")
    private String political;
    @ApiModelProperty("教育程度")
    private String education2;
    private String maritalStat;
    @ApiModelProperty("健康状况")
    private String health;
    @ApiModelProperty("职业类别")
    private String jobType;
    @ApiModelProperty("职业")
    private String jobCode;
    @ApiModelProperty("收入")
    private String incomeType;
    @ApiModelProperty("银行编码")
    private String bankCode;
    @ApiModelProperty("银行账号")
    private String bankAccountNo;
    @ApiModelProperty("银行姓名")
    private String bankAccountName;
    @ApiModelProperty("是否接受短信服务")
    private String isTelmsgservice;
    private String status;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("创建人")
    private String createuser;
    @ApiModelProperty("创建时间")
    private Timestamp createdate;
    @ApiModelProperty("修改人")
    private String modifyuser;
    @ApiModelProperty("修改时间")
    private Timestamp modifydate;
    @ApiModelProperty("会员编号")
    private String memberId;
    private String isLong;
    @ApiModelProperty("机构代码")
    private String branchNo;
    @ApiModelProperty("婚姻状况")
    private String maritalstat;
    @ApiModelProperty("家庭地址")
    private String address;
    @ApiModelProperty("邮政编码")
    private String zip;
    @ApiModelProperty("移动电话")
    private String mobile;
    @ApiModelProperty("传真电话")
    private String fax;
    @ApiModelProperty("住宅电话")
    private String telphone;
    @ApiModelProperty("电子邮箱")
    private String email;
    @ApiModelProperty("工作单位名称")
    private String jobcom;
    @ApiModelProperty("办公电话")
    private String jobtel;



}
