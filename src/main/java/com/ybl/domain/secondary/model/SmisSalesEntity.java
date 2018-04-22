package com.ybl.domain.secondary.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by duanwj on 2018/4/19 0019 15:05
 */
@Entity
@Table(name = "smis_sales", schema = "lifecore")
public class SmisSalesEntity {
    private int seqId;
    private String channelId;
    private String branchId;
    private String teamId;
    private String leaderId;
    private String salesId;
    private String salesName;
    private String contractType;
    private String sex;
    private Timestamp birthday;
    private String certiType;
    private String certiNo;
    private String nation;
    private String political;
    private String education;
    private String maritalStat;
    private String health;
    private String graduateSchool;
    private String degree;
    private String major;
    private String province;
    private String city;
    private String domicile;
    private String homeAddress;
    private String homeZipcode;
    private String mobile;
    private String fixedLine;
    private String email;
    private String oldJob;
    private String oldCompany;
    private String workExperience;
    private Timestamp workDate;
    private String bizYears;
    private String isResigned;
    private String isGreen;
    private String isSamevocation;
    private String isFulltime;
    private String enterRankId;
    private String rankId;
    private Timestamp probationDate;
    private Timestamp assessStartDate;
    private Timestamp fullMemeberDate;
    private Timestamp dutyDate;
    private Timestamp predismissalDate;
    private Timestamp dismissDate;
    private BigInteger dismissTimes;
    private String recommendId;
    private String salesStatus;
    private String createuser;
    private Timestamp createdate;
    private String modifyuser;
    private Timestamp modifydate;
    private String bankCode;
    private String bankAccountNo;
    private String bankAccountName;
    private String wechat;
    private String twitter;
    private String bankLink;
    private String bankProvice;

    @Id
    @Column(name = "SEQ_ID")
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "CHANNEL_ID")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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
    @Column(name = "TEAM_ID")
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "LEADER_ID")
    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    @Basic
    @Column(name = "SALES_ID")
    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    @Basic
    @Column(name = "SALES_NAME")
    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    @Basic
    @Column(name = "CONTRACT_TYPE")
    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
    @Column(name = "NATION")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
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
    @Column(name = "EDUCATION")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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
    @Column(name = "GRADUATE_SCHOOL")
    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Basic
    @Column(name = "DEGREE")
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "MAJOR")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "PROVINCE")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "DOMICILE")
    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    @Basic
    @Column(name = "HOME_ADDRESS")
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Basic
    @Column(name = "HOME_ZIPCODE")
    public String getHomeZipcode() {
        return homeZipcode;
    }

    public void setHomeZipcode(String homeZipcode) {
        this.homeZipcode = homeZipcode;
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
    @Column(name = "FIXED_LINE")
    public String getFixedLine() {
        return fixedLine;
    }

    public void setFixedLine(String fixedLine) {
        this.fixedLine = fixedLine;
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
    @Column(name = "OLD_JOB")
    public String getOldJob() {
        return oldJob;
    }

    public void setOldJob(String oldJob) {
        this.oldJob = oldJob;
    }

    @Basic
    @Column(name = "OLD_COMPANY")
    public String getOldCompany() {
        return oldCompany;
    }

    public void setOldCompany(String oldCompany) {
        this.oldCompany = oldCompany;
    }

    @Basic
    @Column(name = "WORK_EXPERIENCE")
    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Basic
    @Column(name = "WORK_DATE")
    public Timestamp getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Timestamp workDate) {
        this.workDate = workDate;
    }

    @Basic
    @Column(name = "BIZ_YEARS")
    public String getBizYears() {
        return bizYears;
    }

    public void setBizYears(String bizYears) {
        this.bizYears = bizYears;
    }

    @Basic
    @Column(name = "IS_RESIGNED")
    public String getIsResigned() {
        return isResigned;
    }

    public void setIsResigned(String isResigned) {
        this.isResigned = isResigned;
    }

    @Basic
    @Column(name = "IS_GREEN")
    public String getIsGreen() {
        return isGreen;
    }

    public void setIsGreen(String isGreen) {
        this.isGreen = isGreen;
    }

    @Basic
    @Column(name = "IS_SAMEVOCATION")
    public String getIsSamevocation() {
        return isSamevocation;
    }

    public void setIsSamevocation(String isSamevocation) {
        this.isSamevocation = isSamevocation;
    }

    @Basic
    @Column(name = "IS_FULLTIME")
    public String getIsFulltime() {
        return isFulltime;
    }

    public void setIsFulltime(String isFulltime) {
        this.isFulltime = isFulltime;
    }

    @Basic
    @Column(name = "ENTER_RANK_ID")
    public String getEnterRankId() {
        return enterRankId;
    }

    public void setEnterRankId(String enterRankId) {
        this.enterRankId = enterRankId;
    }

    @Basic
    @Column(name = "RANK_ID")
    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    @Basic
    @Column(name = "PROBATION_DATE")
    public Timestamp getProbationDate() {
        return probationDate;
    }

    public void setProbationDate(Timestamp probationDate) {
        this.probationDate = probationDate;
    }

    @Basic
    @Column(name = "ASSESS_START_DATE")
    public Timestamp getAssessStartDate() {
        return assessStartDate;
    }

    public void setAssessStartDate(Timestamp assessStartDate) {
        this.assessStartDate = assessStartDate;
    }

    @Basic
    @Column(name = "FULL_MEMEBER_DATE")
    public Timestamp getFullMemeberDate() {
        return fullMemeberDate;
    }

    public void setFullMemeberDate(Timestamp fullMemeberDate) {
        this.fullMemeberDate = fullMemeberDate;
    }

    @Basic
    @Column(name = "DUTY_DATE")
    public Timestamp getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(Timestamp dutyDate) {
        this.dutyDate = dutyDate;
    }

    @Basic
    @Column(name = "PREDISMISSAL_DATE")
    public Timestamp getPredismissalDate() {
        return predismissalDate;
    }

    public void setPredismissalDate(Timestamp predismissalDate) {
        this.predismissalDate = predismissalDate;
    }

    @Basic
    @Column(name = "DISMISS_DATE")
    public Timestamp getDismissDate() {
        return dismissDate;
    }

    public void setDismissDate(Timestamp dismissDate) {
        this.dismissDate = dismissDate;
    }

    @Basic
    @Column(name = "DISMISS_TIMES")
    public BigInteger getDismissTimes() {
        return dismissTimes;
    }

    public void setDismissTimes(BigInteger dismissTimes) {
        this.dismissTimes = dismissTimes;
    }

    @Basic
    @Column(name = "RECOMMEND_ID")
    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId;
    }

    @Basic
    @Column(name = "SALES_STATUS")
    public String getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus;
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
    @Column(name = "WECHAT")
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "TWITTER")
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Basic
    @Column(name = "BANK_LINK")
    public String getBankLink() {
        return bankLink;
    }

    public void setBankLink(String bankLink) {
        this.bankLink = bankLink;
    }

    @Basic
    @Column(name = "BANK_PROVICE")
    public String getBankProvice() {
        return bankProvice;
    }

    public void setBankProvice(String bankProvice) {
        this.bankProvice = bankProvice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmisSalesEntity that = (SmisSalesEntity) o;
        return seqId == that.seqId &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(teamId, that.teamId) &&
                Objects.equals(leaderId, that.leaderId) &&
                Objects.equals(salesId, that.salesId) &&
                Objects.equals(salesName, that.salesName) &&
                Objects.equals(contractType, that.contractType) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(certiType, that.certiType) &&
                Objects.equals(certiNo, that.certiNo) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(political, that.political) &&
                Objects.equals(education, that.education) &&
                Objects.equals(maritalStat, that.maritalStat) &&
                Objects.equals(health, that.health) &&
                Objects.equals(graduateSchool, that.graduateSchool) &&
                Objects.equals(degree, that.degree) &&
                Objects.equals(major, that.major) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(domicile, that.domicile) &&
                Objects.equals(homeAddress, that.homeAddress) &&
                Objects.equals(homeZipcode, that.homeZipcode) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(fixedLine, that.fixedLine) &&
                Objects.equals(email, that.email) &&
                Objects.equals(oldJob, that.oldJob) &&
                Objects.equals(oldCompany, that.oldCompany) &&
                Objects.equals(workExperience, that.workExperience) &&
                Objects.equals(workDate, that.workDate) &&
                Objects.equals(bizYears, that.bizYears) &&
                Objects.equals(isResigned, that.isResigned) &&
                Objects.equals(isGreen, that.isGreen) &&
                Objects.equals(isSamevocation, that.isSamevocation) &&
                Objects.equals(isFulltime, that.isFulltime) &&
                Objects.equals(enterRankId, that.enterRankId) &&
                Objects.equals(rankId, that.rankId) &&
                Objects.equals(probationDate, that.probationDate) &&
                Objects.equals(assessStartDate, that.assessStartDate) &&
                Objects.equals(fullMemeberDate, that.fullMemeberDate) &&
                Objects.equals(dutyDate, that.dutyDate) &&
                Objects.equals(predismissalDate, that.predismissalDate) &&
                Objects.equals(dismissDate, that.dismissDate) &&
                Objects.equals(dismissTimes, that.dismissTimes) &&
                Objects.equals(recommendId, that.recommendId) &&
                Objects.equals(salesStatus, that.salesStatus) &&
                Objects.equals(createuser, that.createuser) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(modifyuser, that.modifyuser) &&
                Objects.equals(modifydate, that.modifydate) &&
                Objects.equals(bankCode, that.bankCode) &&
                Objects.equals(bankAccountNo, that.bankAccountNo) &&
                Objects.equals(bankAccountName, that.bankAccountName) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(twitter, that.twitter) &&
                Objects.equals(bankLink, that.bankLink) &&
                Objects.equals(bankProvice, that.bankProvice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqId, channelId, branchId, teamId, leaderId, salesId, salesName, contractType, sex, birthday, certiType, certiNo, nation, political, education, maritalStat, health, graduateSchool, degree, major, province, city, domicile, homeAddress, homeZipcode, mobile, fixedLine, email, oldJob, oldCompany, workExperience, workDate, bizYears, isResigned, isGreen, isSamevocation, isFulltime, enterRankId, rankId, probationDate, assessStartDate, fullMemeberDate, dutyDate, predismissalDate, dismissDate, dismissTimes, recommendId, salesStatus, createuser, createdate, modifyuser, modifydate, bankCode, bankAccountNo, bankAccountName, wechat, twitter, bankLink, bankProvice);
    }
}
