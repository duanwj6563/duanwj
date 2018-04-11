package com.ybl.domain.secondary.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by duanwj on 2018/4/11 0011 10:37
 */
@Entity
@Table(name = "user")
public class Users implements Serializable {
    private static final long serialVersionUID = -8073402063323171864L;
    @Id
    @GeneratedValue
    private int id;
    //@Column(name = "user_name")
    private String name;
    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date brithday;
    private String password;
}
