package com.ybl.domain.secondary.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by duanwj on 2018/4/19 0019 16:10
 */
@Entity
@Table(name = "cbs_contractlife", schema = "lifecore")
public class CbsContractlifeEntity {
    private int seqId;
    private BigInteger policyId;
    private String branchId;
    private String insbranchId;
    private String sendCode;
    private String policyCode;
    private String agentId;
    private String serviceId;
    private String holderId;
    private String insurantId;
    private String relationId;
    private String sellWay;
    private String payMode;
    private String payModeNext;
    private BigInteger policyYear;
    private int policyPeriod;
    private BigDecimal periodPrem;
    private String moneyId;
    private String bankCode;
    private String accountType;
    private String bankAccname;
    private String bankAccount;
    private String overdueManage;
    private Timestamp holdDate;
    private Timestamp scanTime;
    private Timestamp validateDate;
    private Timestamp signDate;
    private Timestamp rtnDate;
    private Timestamp endDate;
    private Timestamp pauseTime;
    private String isAnswered;
    private String highPolicy;
    private String status;
    private String remark;
    private String createuser;
    private Timestamp createdate;
    private String modifyuser;
    private Timestamp modifydate;
    private String innerPolicyCode;
    private String singlePolicy;
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
    @Column(name = "POLICY_ID")
    public BigInteger getPolicyId() {
        return policyId;
    }

    public void setPolicyId(BigInteger policyId) {
        this.policyId = policyId;
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
    @Column(name = "INSBRANCH_ID")
    public String getInsbranchId() {
        return insbranchId;
    }

    public void setInsbranchId(String insbranchId) {
        this.insbranchId = insbranchId;
    }

    @Basic
    @Column(name = "SEND_CODE")
    public String getSendCode() {
        return sendCode;
    }

    public void setSendCode(String sendCode) {
        this.sendCode = sendCode;
    }

    @Basic
    @Column(name = "POLICY_CODE")
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    @Basic
    @Column(name = "AGENT_ID")
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @Basic
    @Column(name = "SERVICE_ID")
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "HOLDER_ID")
    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    @Basic
    @Column(name = "INSURANT_ID")
    public String getInsurantId() {
        return insurantId;
    }

    public void setInsurantId(String insurantId) {
        this.insurantId = insurantId;
    }

    @Basic
    @Column(name = "RELATION_ID")
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    @Basic
    @Column(name = "SELL_WAY")
    public String getSellWay() {
        return sellWay;
    }

    public void setSellWay(String sellWay) {
        this.sellWay = sellWay;
    }

    @Basic
    @Column(name = "PAY_MODE")
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    @Basic
    @Column(name = "PAY_MODE_NEXT")
    public String getPayModeNext() {
        return payModeNext;
    }

    public void setPayModeNext(String payModeNext) {
        this.payModeNext = payModeNext;
    }

    @Basic
    @Column(name = "POLICY_YEAR")
    public BigInteger getPolicyYear() {
        return policyYear;
    }

    public void setPolicyYear(BigInteger policyYear) {
        this.policyYear = policyYear;
    }

    @Basic
    @Column(name = "POLICY_PERIOD")
    public int getPolicyPeriod() {
        return policyPeriod;
    }

    public void setPolicyPeriod(int policyPeriod) {
        this.policyPeriod = policyPeriod;
    }

    @Basic
    @Column(name = "PERIOD_PREM")
    public BigDecimal getPeriodPrem() {
        return periodPrem;
    }

    public void setPeriodPrem(BigDecimal periodPrem) {
        this.periodPrem = periodPrem;
    }

    @Basic
    @Column(name = "MONEY_ID")
    public String getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(String moneyId) {
        this.moneyId = moneyId;
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
    @Column(name = "ACCOUNT_TYPE")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "BANK_ACCNAME")
    public String getBankAccname() {
        return bankAccname;
    }

    public void setBankAccname(String bankAccname) {
        this.bankAccname = bankAccname;
    }

    @Basic
    @Column(name = "BANK_ACCOUNT")
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "OVERDUE_MANAGE")
    public String getOverdueManage() {
        return overdueManage;
    }

    public void setOverdueManage(String overdueManage) {
        this.overdueManage = overdueManage;
    }

    @Basic
    @Column(name = "HOLD_DATE")
    public Timestamp getHoldDate() {
        return holdDate;
    }

    public void setHoldDate(Timestamp holdDate) {
        this.holdDate = holdDate;
    }

    @Basic
    @Column(name = "SCAN_TIME")
    public Timestamp getScanTime() {
        return scanTime;
    }

    public void setScanTime(Timestamp scanTime) {
        this.scanTime = scanTime;
    }

    @Basic
    @Column(name = "VALIDATE_DATE")
    public Timestamp getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(Timestamp validateDate) {
        this.validateDate = validateDate;
    }

    @Basic
    @Column(name = "SIGN_DATE")
    public Timestamp getSignDate() {
        return signDate;
    }

    public void setSignDate(Timestamp signDate) {
        this.signDate = signDate;
    }

    @Basic
    @Column(name = "RTN_DATE")
    public Timestamp getRtnDate() {
        return rtnDate;
    }

    public void setRtnDate(Timestamp rtnDate) {
        this.rtnDate = rtnDate;
    }

    @Basic
    @Column(name = "END_DATE")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "PAUSE_TIME")
    public Timestamp getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Timestamp pauseTime) {
        this.pauseTime = pauseTime;
    }

    @Basic
    @Column(name = "IS_ANSWERED")
    public String getIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(String isAnswered) {
        this.isAnswered = isAnswered;
    }

    @Basic
    @Column(name = "HIGH_POLICY")
    public String getHighPolicy() {
        return highPolicy;
    }

    public void setHighPolicy(String highPolicy) {
        this.highPolicy = highPolicy;
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
    @Column(name = "INNER_POLICY_CODE")
    public String getInnerPolicyCode() {
        return innerPolicyCode;
    }

    public void setInnerPolicyCode(String innerPolicyCode) {
        this.innerPolicyCode = innerPolicyCode;
    }

    @Basic
    @Column(name = "single_policy")
    public String getSinglePolicy() {
        return singlePolicy;
    }

    public void setSinglePolicy(String singlePolicy) {
        this.singlePolicy = singlePolicy;
    }

    @Basic
    @Column(name = "branch_no")
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
        CbsContractlifeEntity that = (CbsContractlifeEntity) o;
        return seqId == that.seqId &&
                policyPeriod == that.policyPeriod &&
                Objects.equals(policyId, that.policyId) &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(insbranchId, that.insbranchId) &&
                Objects.equals(sendCode, that.sendCode) &&
                Objects.equals(policyCode, that.policyCode) &&
                Objects.equals(agentId, that.agentId) &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(holderId, that.holderId) &&
                Objects.equals(insurantId, that.insurantId) &&
                Objects.equals(relationId, that.relationId) &&
                Objects.equals(sellWay, that.sellWay) &&
                Objects.equals(payMode, that.payMode) &&
                Objects.equals(payModeNext, that.payModeNext) &&
                Objects.equals(policyYear, that.policyYear) &&
                Objects.equals(periodPrem, that.periodPrem) &&
                Objects.equals(moneyId, that.moneyId) &&
                Objects.equals(bankCode, that.bankCode) &&
                Objects.equals(accountType, that.accountType) &&
                Objects.equals(bankAccname, that.bankAccname) &&
                Objects.equals(bankAccount, that.bankAccount) &&
                Objects.equals(overdueManage, that.overdueManage) &&
                Objects.equals(holdDate, that.holdDate) &&
                Objects.equals(scanTime, that.scanTime) &&
                Objects.equals(validateDate, that.validateDate) &&
                Objects.equals(signDate, that.signDate) &&
                Objects.equals(rtnDate, that.rtnDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(pauseTime, that.pauseTime) &&
                Objects.equals(isAnswered, that.isAnswered) &&
                Objects.equals(highPolicy, that.highPolicy) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(createuser, that.createuser) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(modifyuser, that.modifyuser) &&
                Objects.equals(modifydate, that.modifydate) &&
                Objects.equals(innerPolicyCode, that.innerPolicyCode) &&
                Objects.equals(singlePolicy, that.singlePolicy) &&
                Objects.equals(branchNo, that.branchNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqId, policyId, branchId, insbranchId, sendCode, policyCode, agentId, serviceId, holderId, insurantId, relationId, sellWay, payMode, payModeNext, policyYear, policyPeriod, periodPrem, moneyId, bankCode, accountType, bankAccname, bankAccount, overdueManage, holdDate, scanTime, validateDate, signDate, rtnDate, endDate, pauseTime, isAnswered, highPolicy, status, remark, createuser, createdate, modifyuser, modifydate, innerPolicyCode, singlePolicy, branchNo);
    }
}
