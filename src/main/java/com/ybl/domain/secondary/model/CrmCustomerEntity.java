package com.ybl.domain.secondary.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "crm_customer", schema = "lifecore")
@Data
public class CrmCustomerEntity implements Serializable {
    private int seqId;
    private String customerId;
    private String customerType;
    private String name;
    private String title;
    private String gender;
    private Timestamp birthday;
    private String certiType;
    private String certiNo;
    private Timestamp certiValiddate;
    private String education;
    private String nationality;
    private String nation;
    private String homeplace;
    private String seatAddress;
    private String height;
    private String weight;
    private String political;
    private String education2;
    private String maritalStat;
    private String health;
    private String jobType;
    private String jobCode;
    private String incomeType;
    private String bankCode;
    private String bankAccountNo;
    private String bankAccountName;
    private String isTelmsgservice;
    private String status;
    private String remark;
    private String createuser;
    private Timestamp createdate;
    private String modifyuser;
    private Timestamp modifydate;
    private String memberId;
    private String isLong;
    private String branchNo;

    @Id
    @Column(name = "SEQ_ID")
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
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
    @Column(name = "CUSTOMER_TYPE")
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "GENDER")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "BIRTHDAY")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "CERTI_TYPE")
    public String getCertiType() {
        return certiType;
    }

    public void setCertiType(String certiType) {
        this.certiType = certiType;
    }

    @Basic
    @Column(name = "CERTI_NO")
    public String getCertiNo() {
        return certiNo;
    }

    public void setCertiNo(String certiNo) {
        this.certiNo = certiNo;
    }

    @Basic
    @Column(name = "CERTI_VALIDDATE")
    public Timestamp getCertiValiddate() {
        return certiValiddate;
    }

    public void setCertiValiddate(Timestamp certiValiddate) {
        this.certiValiddate = certiValiddate;
    }

    @Basic
    @Column(name = "EDUCATION")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "NATION")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "HOMEPLACE")
    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    @Basic
    @Column(name = "SEAT_ADDRESS")
    public String getSeatAddress() {
        return seatAddress;
    }

    public void setSeatAddress(String seatAddress) {
        this.seatAddress = seatAddress;
    }

    @Basic
    @Column(name = "HEIGHT")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "WEIGHT")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "POLITICAL")
    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    @Basic
    @Column(name = "EDUCATION2")
    public String getEducation2() {
        return education2;
    }

    public void setEducation2(String education2) {
        this.education2 = education2;
    }

    @Basic
    @Column(name = "MARITAL_STAT")
    public String getMaritalStat() {
        return maritalStat;
    }

    public void setMaritalStat(String maritalStat) {
        this.maritalStat = maritalStat;
    }

    @Basic
    @Column(name = "HEALTH")
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Basic
    @Column(name = "JOB_TYPE")
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Basic
    @Column(name = "JOB_CODE")
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    @Basic
    @Column(name = "INCOME_TYPE")
    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    @Basic
    @Column(name = "BANK_CODE")
    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @Basic
    @Column(name = "BANK_ACCOUNT_NO")
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    @Basic
    @Column(name = "BANK_ACCOUNT_NAME")
    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    @Basic
    @Column(name = "IS_TELMSGSERVICE")
    public String getIsTelmsgservice() {
        return isTelmsgservice;
    }

    public void setIsTelmsgservice(String isTelmsgservice) {
        this.isTelmsgservice = isTelmsgservice;
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
    @Column(name = "MEMBER_ID")
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "IS_LONG")
    public String getIsLong() {
        return isLong;
    }

    public void setIsLong(String isLong) {
        this.isLong = isLong;
    }

    @Basic
    @Column(name = "BRANCH_NO")
    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrmCustomerEntity that = (CrmCustomerEntity) o;
        return seqId == that.seqId &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(customerType, that.customerType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(title, that.title) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(certiType, that.certiType) &&
                Objects.equals(certiNo, that.certiNo) &&
                Objects.equals(certiValiddate, that.certiValiddate) &&
                Objects.equals(education, that.education) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(homeplace, that.homeplace) &&
                Objects.equals(seatAddress, that.seatAddress) &&
                Objects.equals(height, that.height) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(political, that.political) &&
                Objects.equals(education2, that.education2) &&
                Objects.equals(maritalStat, that.maritalStat) &&
                Objects.equals(health, that.health) &&
                Objects.equals(jobType, that.jobType) &&
                Objects.equals(jobCode, that.jobCode) &&
                Objects.equals(incomeType, that.incomeType) &&
                Objects.equals(bankCode, that.bankCode) &&
                Objects.equals(bankAccountNo, that.bankAccountNo) &&
                Objects.equals(bankAccountName, that.bankAccountName) &&
                Objects.equals(isTelmsgservice, that.isTelmsgservice) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(createuser, that.createuser) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(modifyuser, that.modifyuser) &&
                Objects.equals(modifydate, that.modifydate) &&
                Objects.equals(memberId, that.memberId) &&
                Objects.equals(isLong, that.isLong) &&
                Objects.equals(branchNo, that.branchNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqId, customerId, customerType, name, title, gender, birthday, certiType, certiNo, certiValiddate, education, nationality, nation, homeplace, seatAddress, height, weight, political, education2, maritalStat, health, jobType, jobCode, incomeType, bankCode, bankAccountNo, bankAccountName, isTelmsgservice, status, remark, createuser, createdate, modifyuser, modifydate, memberId, isLong, branchNo);
    }
}
