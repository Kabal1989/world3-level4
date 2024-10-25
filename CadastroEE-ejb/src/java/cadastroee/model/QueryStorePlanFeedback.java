/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "query_store_plan_feedback")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStorePlanFeedback.findAll", query = "SELECT q FROM QueryStorePlanFeedback q"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByPlanFeedbackId", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.planFeedbackId = :planFeedbackId"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByPlanId", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.planId = :planId"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByFeatureId", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.featureId = :featureId"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByFeatureDesc", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.featureDesc = :featureDesc"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByFeedbackData", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.feedbackData = :feedbackData"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByState", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.state = :state"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByStateDesc", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.stateDesc = :stateDesc"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByCreateTime", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.createTime = :createTime"),
    @NamedQuery(name = "QueryStorePlanFeedback.findByLastUpdatedTime", query = "SELECT q FROM QueryStorePlanFeedback q WHERE q.lastUpdatedTime = :lastUpdatedTime")})
public class QueryStorePlanFeedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_feedback_id")
    private long planFeedbackId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_id")
    private long planId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feature_id")
    private short featureId;
    @Size(max = 60)
    @Column(name = "feature_desc")
    private String featureDesc;
    @Size(max = 2147483647)
    @Column(name = "feedback_data")
    private String feedbackData;
    @Column(name = "state")
    private Integer state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_time")
    private Serializable createTime;
    @Column(name = "last_updated_time")
    private Serializable lastUpdatedTime;

    public QueryStorePlanFeedback() {
    }

    public long getPlanFeedbackId() {
        return planFeedbackId;
    }

    public void setPlanFeedbackId(long planFeedbackId) {
        this.planFeedbackId = planFeedbackId;
    }

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public short getFeatureId() {
        return featureId;
    }

    public void setFeatureId(short featureId) {
        this.featureId = featureId;
    }

    public String getFeatureDesc() {
        return featureDesc;
    }

    public void setFeatureDesc(String featureDesc) {
        this.featureDesc = featureDesc;
    }

    public String getFeedbackData() {
        return feedbackData;
    }

    public void setFeedbackData(String feedbackData) {
        this.feedbackData = feedbackData;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Serializable getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Serializable createTime) {
        this.createTime = createTime;
    }

    public Serializable getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Serializable lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
    
}
