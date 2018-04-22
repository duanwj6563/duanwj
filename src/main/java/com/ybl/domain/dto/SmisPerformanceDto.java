package com.ybl.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by duanwj on 2018/4/18 0018 10:35
 */
@Data
public class SmisPerformanceDto implements Serializable {

    private static final long serialVersionUID = 8512831000653848876L;
    @ApiModelProperty("保单件数")
    private int number;
    @ApiModelProperty("保单保费")
    private BigDecimal money;
    @ApiModelProperty("增员人数")
    private long increaseNumber;
}
