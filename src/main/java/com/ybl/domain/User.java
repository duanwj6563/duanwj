package com.ybl.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = -6185482328197632932L;
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
