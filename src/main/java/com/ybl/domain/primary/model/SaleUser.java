package com.ybl.domain.primary.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 销售人员信息 ref SMIS_Sales
 */
@Data
@Entity
@Table(name = "sale_user")
@ApiModel("登录人员信息")
public class SaleUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -6185482328197632932L;
    @NotBlank(message = "销售人员代码不能为空")
    @ApiModelProperty(value = "销售人员代码", required = true)
    private String username;
    @ApiModelProperty(value = "销售人员姓名")
    private String salesName;
    @NotBlank(message = "登录密码不能为空")
    @ApiModelProperty(value = "登录密码", required = true)
    private String password;
    @NotBlank(message = "手机号不能为空")
    @Size(max = 11, message = "手机号格式不正确")
    @ApiModelProperty(value = "手机号", required = true)
    private String mobile;
}
