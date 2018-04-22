package com.ybl.domain.secondary.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by duanwj on 2018/4/19 0019 15:05
 */
@Entity
@Table(name = "sys_branch", schema = "lifecore")
public class SysBranchEntity {
    private int seqId;
    private String branchId;
    private String branchParentid;
    private String branchAllpath;
    private String branchLevel;
    private String branchName;
    private String branchAbbr;
    private String zip;
    private String address;
    private String telephone;
    private String fax;
    private Timestamp foundDate;
    private Timestamp recallDate;
    private String status;
    private String remark;
    private String createuser;
    private Timestamp createdate;
    private String modifyuser;
    private Timestamp modifydate;
    private String delegate;
    private String email;

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
    @Column(name = "BRANCH_PARENTID")
    public String getBranchParentid() {
        return branchParentid;
    }

    public void setBranchParentid(String branchParentid) {
        this.branchParentid = branchParentid;
    }

    @Basic
    @Column(name = "BRANCH_ALLPATH")
    public String getBranchAllpath() {
        return branchAllpath;
    }

    public void setBranchAllpath(String branchAllpath) {
        this.branchAllpath = branchAllpath;
    }

    @Basic
    @Column(name = "BRANCH_LEVEL")
    public String getBranchLevel() {
        return branchLevel;
    }

    public void setBranchLevel(String branchLevel) {
        this.branchLevel = branchLevel;
    }

    @Basic
    @Column(name = "BRANCH_NAME")
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Basic
    @Column(name = "BRANCH_ABBR")
    public String getBranchAbbr() {
        return branchAbbr;
    }

    public void setBranchAbbr(String branchAbbr) {
        this.branchAbbr = branchAbbr;
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
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "TELEPHONE")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
    @Column(name = "FOUND_DATE")
    public Timestamp getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Timestamp foundDate) {
        this.foundDate = foundDate;
    }

    @Basic
    @Column(name = "RECALL_DATE")
    public Timestamp getRecallDate() {
        return recallDate;
    }

    public void setRecallDate(Timestamp recallDate) {
        this.recallDate = recallDate;
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

    @Basic
    @Column(name = "DELEGATE")
    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(String delegate) {
        this.delegate = delegate;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysBranchEntity that = (SysBranchEntity) o;
        return seqId == that.seqId &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(branchParentid, that.branchParentid) &&
                Objects.equals(branchAllpath, that.branchAllpath) &&
                Objects.equals(branchLevel, that.branchLevel) &&
                Objects.equals(branchName, that.branchName) &&
                Objects.equals(branchAbbr, that.branchAbbr) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(address, that.address) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(foundDate, that.foundDate) &&
                Objects.equals(recallDate, that.recallDate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(createuser, that.createuser) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(modifyuser, that.modifyuser) &&
                Objects.equals(modifydate, that.modifydate) &&
                Objects.equals(delegate, that.delegate) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqId, branchId, branchParentid, branchAllpath, branchLevel, branchName, branchAbbr, zip, address, telephone, fax, foundDate, recallDate, status, remark, createuser, createdate, modifyuser, modifydate, delegate, email);
    }
}
