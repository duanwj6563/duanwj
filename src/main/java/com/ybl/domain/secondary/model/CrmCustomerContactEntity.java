package com.ybl.domain.secondary.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "crm_customer_contact", schema = "lifecore")
public class CrmCustomerContactEntity  implements Serializable {
    private int seqId;
    private String branchId;
    private String customerId;
    private String address;
    private String zip;
    private String mobile;
    private String fax;
    private String telphone;
    private String email;
    private String jobCom;
    private String jobTel;
    private String status;
    private String remark;
    private Integer logSeqId;
    private String logBustype;
    private Timestamp logBusdate;
    private Timestamp logDate;
    private String logRemark;
    private String createuser;
    private Timestamp createdate;
    private String modifyuser;
    private Timestamp modifydate;

    @Id
    @Column(name = "SEQ_ID")
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "BRANCH_ID")
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "CUSTOMER_ID")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "TELPHONE")
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "JOB_COM")
    public String getJobCom() {
        return jobCom;
    }

    public void setJobCom(String jobCom) {
        this.jobCom = jobCom;
    }

    @Basic
    @Column(name = "JOB_TEL")
    public String getJobTel() {
        return jobTel;
    }

    public void setJobTel(String jobTel) {
        this.jobTel = jobTel;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "LOG_SEQ_ID")
    public Integer getLogSeqId() {
        return logSeqId;
    }

    public void setLogSeqId(Integer logSeqId) {
        this.logSeqId = logSeqId;
    }

    @Basic
    @Column(name = "LOG_BUSTYPE")
    public String getLogBustype() {
        return logBustype;
    }

    public void setLogBustype(String logBustype) {
        this.logBustype = logBustype;
    }

    @Basic
    @Column(name = "LOG_BUSDATE")
    public Timestamp getLogBusdate() {
        return logBusdate;
    }

    public void setLogBusdate(Timestamp logBusdate) {
        this.logBusdate = logBusdate;
    }

    @Basic
    @Column(name = "LOG_DATE")
    public Timestamp getLogDate() {
        return logDate;
    }

    public void setLogDate(Timestamp logDate) {
        this.logDate = logDate;
    }

    @Basic
    @Column(name = "LOG_REMARK")
    public String getLogRemark() {
        return logRemark;
    }

    public void setLogRemark(String logRemark) {
        this.logRemark = logRemark;
    }

    @Basic
    @Column(name = "CREATEUSER")
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Basic
    @Column(name = "CREATEDATE")
    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "MODIFYUSER")
    public String getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser;
    }

    @Basic
    @Column(name = "MODIFYDATE")
    public Timestamp getModifydate() {
        return modifydate;
    }

    public void setModifydate(Timestamp modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrmCustomerContactEntity that = (CrmCustomerContactEntity) o;
        return seqId == that.seqId &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(address, that.address) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(telphone, that.telphone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(jobCom, that.jobCom) &&
                Objects.equals(jobTel, that.jobTel) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(logSeqId, that.logSeqId) &&
                Objects.equals(logBustype, that.logBustype) &&
                Objects.equals(logBusdate, that.logBusdate) &&
                Objects.equals(logDate, that.logDate) &&
                Objects.equals(logRemark, that.logRemark) &&
                Objects.equals(createuser, that.createuser) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(modifyuser, that.modifyuser) &&
                Objects.equals(modifydate, that.modifydate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqId, branchId, customerId, address, zip, mobile, fax, telphone, email, jobCom, jobTel, status, remark, logSeqId, logBustype, logBusdate, logDate, logRemark, createuser, createdate, modifyuser, modifydate);
    }
}
