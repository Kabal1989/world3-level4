/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_tuning_recommendations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbTuningRecommendations.findAll", query = "SELECT d FROM DmDbTuningRecommendations d"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByName", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByType", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.type = :type"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByReason", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.reason = :reason"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByValidSince", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.validSince = :validSince"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByLastRefresh", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.lastRefresh = :lastRefresh"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByState", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByIsExecutableAction", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.isExecutableAction = :isExecutableAction"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByIsRevertableAction", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.isRevertableAction = :isRevertableAction"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByExecuteActionStartTime", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.executeActionStartTime = :executeActionStartTime"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByExecuteActionDuration", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.executeActionDuration = :executeActionDuration"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByExecuteActionInitiatedBy", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.executeActionInitiatedBy = :executeActionInitiatedBy"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByExecuteActionInitiatedTime", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.executeActionInitiatedTime = :executeActionInitiatedTime"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByRevertActionStartTime", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.revertActionStartTime = :revertActionStartTime"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByRevertActionDuration", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.revertActionDuration = :revertActionDuration"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByRevertActionInitiatedBy", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.revertActionInitiatedBy = :revertActionInitiatedBy"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByRevertActionInitiatedTime", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.revertActionInitiatedTime = :revertActionInitiatedTime"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByScore", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.score = :score"),
    @NamedQuery(name = "DmDbTuningRecommendations.findByDetails", query = "SELECT d FROM DmDbTuningRecommendations d WHERE d.details = :details")})
public class DmDbTuningRecommendations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4000)
    @Column(name = "name")
    private String name;
    @Size(max = 4000)
    @Column(name = "type")
    private String type;
    @Size(max = 4000)
    @Column(name = "reason")
    private String reason;
    @Column(name = "valid_since")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validSince;
    @Column(name = "last_refresh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRefresh;
    @Size(max = 4000)
    @Column(name = "state")
    private String state;
    @Column(name = "is_executable_action")
    private Boolean isExecutableAction;
    @Column(name = "is_revertable_action")
    private Boolean isRevertableAction;
    @Column(name = "execute_action_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date executeActionStartTime;
    @Column(name = "execute_action_duration")
    @Temporal(TemporalType.TIME)
    private Date executeActionDuration;
    @Size(max = 4000)
    @Column(name = "execute_action_initiated_by")
    private String executeActionInitiatedBy;
    @Column(name = "execute_action_initiated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date executeActionInitiatedTime;
    @Column(name = "revert_action_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revertActionStartTime;
    @Column(name = "revert_action_duration")
    @Temporal(TemporalType.TIME)
    private Date revertActionDuration;
    @Size(max = 4000)
    @Column(name = "revert_action_initiated_by")
    private String revertActionInitiatedBy;
    @Column(name = "revert_action_initiated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revertActionInitiatedTime;
    @Column(name = "score")
    private Integer score;
    @Size(max = 2147483647)
    @Column(name = "details")
    private String details;

    public DmDbTuningRecommendations() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getValidSince() {
        return validSince;
    }

    public void setValidSince(Date validSince) {
        this.validSince = validSince;
    }

    public Date getLastRefresh() {
        return lastRefresh;
    }

    public void setLastRefresh(Date lastRefresh) {
        this.lastRefresh = lastRefresh;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getIsExecutableAction() {
        return isExecutableAction;
    }

    public void setIsExecutableAction(Boolean isExecutableAction) {
        this.isExecutableAction = isExecutableAction;
    }

    public Boolean getIsRevertableAction() {
        return isRevertableAction;
    }

    public void setIsRevertableAction(Boolean isRevertableAction) {
        this.isRevertableAction = isRevertableAction;
    }

    public Date getExecuteActionStartTime() {
        return executeActionStartTime;
    }

    public void setExecuteActionStartTime(Date executeActionStartTime) {
        this.executeActionStartTime = executeActionStartTime;
    }

    public Date getExecuteActionDuration() {
        return executeActionDuration;
    }

    public void setExecuteActionDuration(Date executeActionDuration) {
        this.executeActionDuration = executeActionDuration;
    }

    public String getExecuteActionInitiatedBy() {
        return executeActionInitiatedBy;
    }

    public void setExecuteActionInitiatedBy(String executeActionInitiatedBy) {
        this.executeActionInitiatedBy = executeActionInitiatedBy;
    }

    public Date getExecuteActionInitiatedTime() {
        return executeActionInitiatedTime;
    }

    public void setExecuteActionInitiatedTime(Date executeActionInitiatedTime) {
        this.executeActionInitiatedTime = executeActionInitiatedTime;
    }

    public Date getRevertActionStartTime() {
        return revertActionStartTime;
    }

    public void setRevertActionStartTime(Date revertActionStartTime) {
        this.revertActionStartTime = revertActionStartTime;
    }

    public Date getRevertActionDuration() {
        return revertActionDuration;
    }

    public void setRevertActionDuration(Date revertActionDuration) {
        this.revertActionDuration = revertActionDuration;
    }

    public String getRevertActionInitiatedBy() {
        return revertActionInitiatedBy;
    }

    public void setRevertActionInitiatedBy(String revertActionInitiatedBy) {
        this.revertActionInitiatedBy = revertActionInitiatedBy;
    }

    public Date getRevertActionInitiatedTime() {
        return revertActionInitiatedTime;
    }

    public void setRevertActionInitiatedTime(Date revertActionInitiatedTime) {
        this.revertActionInitiatedTime = revertActionInitiatedTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
}
