package com.ybl.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "user_name")
    private String name;
    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date brithday;
}
