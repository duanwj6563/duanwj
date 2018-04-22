package com.ybl.domain.dto;

import com.ybl.domain.primary.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 销售人员信息 ref SMIS_Sales
 */
@Data
@Entity
@Table(name = "sale_user")
@ApiModel("登录人员信息")
public class SaleUserDto extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 3278534711617134468L;
    @ApiModelProperty(value = "销售人员代码")
    private String username;
    @ApiModelProperty(value = "手机号")
    private String mobile;
}
