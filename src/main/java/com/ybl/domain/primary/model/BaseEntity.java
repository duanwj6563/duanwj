package com.ybl.domain.primary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * 基类 包含id createTime，updateTime 等基础信息
 * Created by duanwj on 2018/4/12 0012 16:27
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue
    @JsonIgnore
    private long id;// 主键
    @CreatedDate
    @JsonIgnore
    private Date createTime;

    @LastModifiedDate
    @JsonIgnore
    private Date updateTime;
}
