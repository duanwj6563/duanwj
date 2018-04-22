package com.ybl.domain.secondary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by duanwj on 2018/4/17 0017 18:04
 */
@Data
public class BatPersonWageReportEntityPK implements Serializable {

    private static final long serialVersionUID = -3418018191853844919L;
    @Column(name = "CALC_DATE")
    @Id
    private Date calcDate;
    @Column(name = "PERSON_NO")
    @Id
    private String personNo;
    @Column(name = "IMPMEANSVER_NO")
    @Id
    private String impmeansverNo;
    @Column(name = "CALC_TYPE")
    @Id
    private String calcType;

}
