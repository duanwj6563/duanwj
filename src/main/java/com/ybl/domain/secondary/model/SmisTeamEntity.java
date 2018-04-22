package com.ybl.domain.secondary.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by duanwj on 2018/4/19 0019 15:05
 */
@Entity
@Table(name = "smis_team", schema = "lifecore")
public class SmisTeamEntity {
    private int seqId;
    private String channelId;
    private String branchId;
    private String parentTeamId;
    private String teamId;
    private String teamName;
    private String teamAbbr;
    private String teamLvl;
    private String leaderId;
    private Timestamp leaderPositionDate;
    private String address;
    private String zip;
    private String telephone;
    private String fax;
    private Timestamp foundDate;
    private Timestamp recallDate;
    private String directly;
    private String status;
    private String basicVersionId;
    private String remark;
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
    @Column(name = "PARENT_TEAM_ID")
    public String getParentTeamId() {
        return parentTeamId;
    }

    public void setParentTeamId(String parentTeamId) {
        this.parentTeamId = parentTeamId;
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
    @Column(name = "TEAM_NAME")
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Basic
    @Column(name = "TEAM_ABBR")
    public String getTeamAbbr() {
        return teamAbbr;
    }

    public void setTeamAbbr(String teamAbbr) {
        this.teamAbbr = teamAbbr;
    }

    @Basic
    @Column(name = "TEAM_LVL")
    public String getTeamLvl() {
        return teamLvl;
    }

    public void setTeamLvl(String teamLvl) {
        this.teamLvl = teamLvl;
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
    @Column(name = "LEADER_POSITION_DATE")
    public Timestamp getLeaderPositionDate() {
        return leaderPositionDate;
    }

    public void setLeaderPositionDate(Timestamp leaderPositionDate) {
        this.leaderPositionDate = leaderPositionDate;
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
    @Column(name = "DIRECTLY")
    public String getDirectly() {
        return directly;
    }

    public void setDirectly(String directly) {
        this.directly = directly;
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
    @Column(name = "BASIC_VERSION_ID")
    public String getBasicVersionId() {
        return basicVersionId;
    }

    public void setBasicVersionId(String basicVersionId) {
        this.basicVersionId = basicVersionId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmisTeamEntity that = (SmisTeamEntity) o;
        return seqId == that.seqId &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(branchId, that.branchId) &&
                Objects.equals(parentTeamId, that.parentTeamId) &&
                Objects.equals(teamId, that.teamId) &&
                Objects.equals(teamName, that.teamName) &&
                Objects.equals(teamAbbr, that.teamAbbr) &&
                Objects.equals(teamLvl, that.teamLvl) &&
                Objects.equals(leaderId, that.leaderId) &&
                Objects.equals(leaderPositionDate, that.leaderPositionDate) &&
                Objects.equals(address, that.address) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(foundDate, that.foundDate) &&
                Objects.equals(recallDate, that.recallDate) &&
                Objects.equals(directly, that.directly) &&
                Objects.equals(status, that.status) &&
                Objects.equals(basicVersionId, that.basicVersionId) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(createuser, that.createuser) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(modifyuser, that.modifyuser) &&
                Objects.equals(modifydate, that.modifydate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqId, channelId, branchId, parentTeamId, teamId, teamName, teamAbbr, teamLvl, leaderId, leaderPositionDate, address, zip, telephone, fax, foundDate, recallDate, directly, status, basicVersionId, remark, createuser, createdate, modifyuser, modifydate);
    }
}
