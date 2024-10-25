/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "query_store_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStorePlan.findAll", query = "SELECT q FROM QueryStorePlan q"),
    @NamedQuery(name = "QueryStorePlan.findByPlanId", query = "SELECT q FROM QueryStorePlan q WHERE q.planId = :planId"),
    @NamedQuery(name = "QueryStorePlan.findByQueryId", query = "SELECT q FROM QueryStorePlan q WHERE q.queryId = :queryId"),
    @NamedQuery(name = "QueryStorePlan.findByPlanGroupId", query = "SELECT q FROM QueryStorePlan q WHERE q.planGroupId = :planGroupId"),
    @NamedQuery(name = "QueryStorePlan.findByEngineVersion", query = "SELECT q FROM QueryStorePlan q WHERE q.engineVersion = :engineVersion"),
    @NamedQuery(name = "QueryStorePlan.findByCompatibilityLevel", query = "SELECT q FROM QueryStorePlan q WHERE q.compatibilityLevel = :compatibilityLevel"),
    @NamedQuery(name = "QueryStorePlan.findByQueryPlan", query = "SELECT q FROM QueryStorePlan q WHERE q.queryPlan = :queryPlan"),
    @NamedQuery(name = "QueryStorePlan.findByIsOnlineIndexPlan", query = "SELECT q FROM QueryStorePlan q WHERE q.isOnlineIndexPlan = :isOnlineIndexPlan"),
    @NamedQuery(name = "QueryStorePlan.findByIsTrivialPlan", query = "SELECT q FROM QueryStorePlan q WHERE q.isTrivialPlan = :isTrivialPlan"),
    @NamedQuery(name = "QueryStorePlan.findByIsParallelPlan", query = "SELECT q FROM QueryStorePlan q WHERE q.isParallelPlan = :isParallelPlan"),
    @NamedQuery(name = "QueryStorePlan.findByIsForcedPlan", query = "SELECT q FROM QueryStorePlan q WHERE q.isForcedPlan = :isForcedPlan"),
    @NamedQuery(name = "QueryStorePlan.findByIsNativelyCompiled", query = "SELECT q FROM QueryStorePlan q WHERE q.isNativelyCompiled = :isNativelyCompiled"),
    @NamedQuery(name = "QueryStorePlan.findByForceFailureCount", query = "SELECT q FROM QueryStorePlan q WHERE q.forceFailureCount = :forceFailureCount"),
    @NamedQuery(name = "QueryStorePlan.findByLastForceFailureReason", query = "SELECT q FROM QueryStorePlan q WHERE q.lastForceFailureReason = :lastForceFailureReason"),
    @NamedQuery(name = "QueryStorePlan.findByLastForceFailureReasonDesc", query = "SELECT q FROM QueryStorePlan q WHERE q.lastForceFailureReasonDesc = :lastForceFailureReasonDesc"),
    @NamedQuery(name = "QueryStorePlan.findByCountCompiles", query = "SELECT q FROM QueryStorePlan q WHERE q.countCompiles = :countCompiles"),
    @NamedQuery(name = "QueryStorePlan.findByInitialCompileStartTime", query = "SELECT q FROM QueryStorePlan q WHERE q.initialCompileStartTime = :initialCompileStartTime"),
    @NamedQuery(name = "QueryStorePlan.findByLastCompileStartTime", query = "SELECT q FROM QueryStorePlan q WHERE q.lastCompileStartTime = :lastCompileStartTime"),
    @NamedQuery(name = "QueryStorePlan.findByLastExecutionTime", query = "SELECT q FROM QueryStorePlan q WHERE q.lastExecutionTime = :lastExecutionTime"),
    @NamedQuery(name = "QueryStorePlan.findByAvgCompileDuration", query = "SELECT q FROM QueryStorePlan q WHERE q.avgCompileDuration = :avgCompileDuration"),
    @NamedQuery(name = "QueryStorePlan.findByLastCompileDuration", query = "SELECT q FROM QueryStorePlan q WHERE q.lastCompileDuration = :lastCompileDuration"),
    @NamedQuery(name = "QueryStorePlan.findByPlanForcingType", query = "SELECT q FROM QueryStorePlan q WHERE q.planForcingType = :planForcingType"),
    @NamedQuery(name = "QueryStorePlan.findByPlanForcingTypeDesc", query = "SELECT q FROM QueryStorePlan q WHERE q.planForcingTypeDesc = :planForcingTypeDesc"),
    @NamedQuery(name = "QueryStorePlan.findByHasCompileReplayScript", query = "SELECT q FROM QueryStorePlan q WHERE q.hasCompileReplayScript = :hasCompileReplayScript"),
    @NamedQuery(name = "QueryStorePlan.findByIsOptimizedPlanForcingDisabled", query = "SELECT q FROM QueryStorePlan q WHERE q.isOptimizedPlanForcingDisabled = :isOptimizedPlanForcingDisabled"),
    @NamedQuery(name = "QueryStorePlan.findByPlanType", query = "SELECT q FROM QueryStorePlan q WHERE q.planType = :planType"),
    @NamedQuery(name = "QueryStorePlan.findByPlanTypeDesc", query = "SELECT q FROM QueryStorePlan q WHERE q.planTypeDesc = :planTypeDesc")})
public class QueryStorePlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_id")
    private long planId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_id")
    private long queryId;
    @Column(name = "plan_group_id")
    private BigInteger planGroupId;
    @Size(max = 32)
    @Column(name = "engine_version")
    private String engineVersion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compatibility_level")
    private short compatibilityLevel;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "query_plan_hash")
    private byte[] queryPlanHash;
    @Size(max = 2147483647)
    @Column(name = "query_plan")
    private String queryPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_online_index_plan")
    private boolean isOnlineIndexPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_trivial_plan")
    private boolean isTrivialPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_parallel_plan")
    private boolean isParallelPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_forced_plan")
    private boolean isForcedPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_natively_compiled")
    private boolean isNativelyCompiled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "force_failure_count")
    private long forceFailureCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_force_failure_reason")
    private int lastForceFailureReason;
    @Size(max = 128)
    @Column(name = "last_force_failure_reason_desc")
    private String lastForceFailureReasonDesc;
    @Column(name = "count_compiles")
    private BigInteger countCompiles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "initial_compile_start_time")
    private Serializable initialCompileStartTime;
    @Column(name = "last_compile_start_time")
    private Serializable lastCompileStartTime;
    @Column(name = "last_execution_time")
    private Serializable lastExecutionTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_compile_duration")
    private Double avgCompileDuration;
    @Column(name = "last_compile_duration")
    private BigInteger lastCompileDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_forcing_type")
    private int planForcingType;
    @Size(max = 60)
    @Column(name = "plan_forcing_type_desc")
    private String planForcingTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_compile_replay_script")
    private boolean hasCompileReplayScript;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_optimized_plan_forcing_disabled")
    private boolean isOptimizedPlanForcingDisabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_type")
    private int planType;
    @Size(max = 60)
    @Column(name = "plan_type_desc")
    private String planTypeDesc;

    public QueryStorePlan() {
    }

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }

    public BigInteger getPlanGroupId() {
        return planGroupId;
    }

    public void setPlanGroupId(BigInteger planGroupId) {
        this.planGroupId = planGroupId;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public short getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(short compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public byte[] getQueryPlanHash() {
        return queryPlanHash;
    }

    public void setQueryPlanHash(byte[] queryPlanHash) {
        this.queryPlanHash = queryPlanHash;
    }

    public String getQueryPlan() {
        return queryPlan;
    }

    public void setQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
    }

    public boolean getIsOnlineIndexPlan() {
        return isOnlineIndexPlan;
    }

    public void setIsOnlineIndexPlan(boolean isOnlineIndexPlan) {
        this.isOnlineIndexPlan = isOnlineIndexPlan;
    }

    public boolean getIsTrivialPlan() {
        return isTrivialPlan;
    }

    public void setIsTrivialPlan(boolean isTrivialPlan) {
        this.isTrivialPlan = isTrivialPlan;
    }

    public boolean getIsParallelPlan() {
        return isParallelPlan;
    }

    public void setIsParallelPlan(boolean isParallelPlan) {
        this.isParallelPlan = isParallelPlan;
    }

    public boolean getIsForcedPlan() {
        return isForcedPlan;
    }

    public void setIsForcedPlan(boolean isForcedPlan) {
        this.isForcedPlan = isForcedPlan;
    }

    public boolean getIsNativelyCompiled() {
        return isNativelyCompiled;
    }

    public void setIsNativelyCompiled(boolean isNativelyCompiled) {
        this.isNativelyCompiled = isNativelyCompiled;
    }

    public long getForceFailureCount() {
        return forceFailureCount;
    }

    public void setForceFailureCount(long forceFailureCount) {
        this.forceFailureCount = forceFailureCount;
    }

    public int getLastForceFailureReason() {
        return lastForceFailureReason;
    }

    public void setLastForceFailureReason(int lastForceFailureReason) {
        this.lastForceFailureReason = lastForceFailureReason;
    }

    public String getLastForceFailureReasonDesc() {
        return lastForceFailureReasonDesc;
    }

    public void setLastForceFailureReasonDesc(String lastForceFailureReasonDesc) {
        this.lastForceFailureReasonDesc = lastForceFailureReasonDesc;
    }

    public BigInteger getCountCompiles() {
        return countCompiles;
    }

    public void setCountCompiles(BigInteger countCompiles) {
        this.countCompiles = countCompiles;
    }

    public Serializable getInitialCompileStartTime() {
        return initialCompileStartTime;
    }

    public void setInitialCompileStartTime(Serializable initialCompileStartTime) {
        this.initialCompileStartTime = initialCompileStartTime;
    }

    public Serializable getLastCompileStartTime() {
        return lastCompileStartTime;
    }

    public void setLastCompileStartTime(Serializable lastCompileStartTime) {
        this.lastCompileStartTime = lastCompileStartTime;
    }

    public Serializable getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(Serializable lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public Double getAvgCompileDuration() {
        return avgCompileDuration;
    }

    public void setAvgCompileDuration(Double avgCompileDuration) {
        this.avgCompileDuration = avgCompileDuration;
    }

    public BigInteger getLastCompileDuration() {
        return lastCompileDuration;
    }

    public void setLastCompileDuration(BigInteger lastCompileDuration) {
        this.lastCompileDuration = lastCompileDuration;
    }

    public int getPlanForcingType() {
        return planForcingType;
    }

    public void setPlanForcingType(int planForcingType) {
        this.planForcingType = planForcingType;
    }

    public String getPlanForcingTypeDesc() {
        return planForcingTypeDesc;
    }

    public void setPlanForcingTypeDesc(String planForcingTypeDesc) {
        this.planForcingTypeDesc = planForcingTypeDesc;
    }

    public boolean getHasCompileReplayScript() {
        return hasCompileReplayScript;
    }

    public void setHasCompileReplayScript(boolean hasCompileReplayScript) {
        this.hasCompileReplayScript = hasCompileReplayScript;
    }

    public boolean getIsOptimizedPlanForcingDisabled() {
        return isOptimizedPlanForcingDisabled;
    }

    public void setIsOptimizedPlanForcingDisabled(boolean isOptimizedPlanForcingDisabled) {
        this.isOptimizedPlanForcingDisabled = isOptimizedPlanForcingDisabled;
    }

    public int getPlanType() {
        return planType;
    }

    public void setPlanType(int planType) {
        this.planType = planType;
    }

    public String getPlanTypeDesc() {
        return planTypeDesc;
    }

    public void setPlanTypeDesc(String planTypeDesc) {
        this.planTypeDesc = planTypeDesc;
    }
    
}
