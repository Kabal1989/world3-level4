/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_os_out_of_memory_events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findAll", query = "SELECT d FROM DmOsOutOfMemoryEvents d"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByEventTime", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.eventTime = :eventTime"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByOomCause", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.oomCause = :oomCause"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByOomCauseDesc", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.oomCauseDesc = :oomCauseDesc"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByAvailablePhysicalMemoryMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.availablePhysicalMemoryMb = :availablePhysicalMemoryMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByInitialJobObjectMemoryLimitMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.initialJobObjectMemoryLimitMb = :initialJobObjectMemoryLimitMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByCurrentJobObjectMemoryLimitMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.currentJobObjectMemoryLimitMb = :currentJobObjectMemoryLimitMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByProcessMemoryUsageMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.processMemoryUsageMb = :processMemoryUsageMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByNonSosMemoryUsageMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.nonSosMemoryUsageMb = :nonSosMemoryUsageMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByCommittedMemoryTargetMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.committedMemoryTargetMb = :committedMemoryTargetMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByCommittedMemoryMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.committedMemoryMb = :committedMemoryMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByAllocationPotentialMemoryMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.allocationPotentialMemoryMb = :allocationPotentialMemoryMb"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByOomFactor", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.oomFactor = :oomFactor"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByOomFactorDesc", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.oomFactorDesc = :oomFactorDesc"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByOomResourcePools", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.oomResourcePools = :oomResourcePools"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByTopMemoryClerks", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.topMemoryClerks = :topMemoryClerks"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByTopResourcePools", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.topResourcePools = :topResourcePools"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByPossibleLeakedMemoryClerks", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.possibleLeakedMemoryClerks = :possibleLeakedMemoryClerks"),
    @NamedQuery(name = "DmOsOutOfMemoryEvents.findByPossibleNonSosLeakedMemoryMb", query = "SELECT d FROM DmOsOutOfMemoryEvents d WHERE d.possibleNonSosLeakedMemoryMb = :possibleNonSosLeakedMemoryMb")})
public class DmOsOutOfMemoryEvents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oom_cause")
    private short oomCause;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "oom_cause_desc")
    private String oomCauseDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "available_physical_memory_mb")
    private int availablePhysicalMemoryMb;
    @Column(name = "initial_job_object_memory_limit_mb")
    private Integer initialJobObjectMemoryLimitMb;
    @Column(name = "current_job_object_memory_limit_mb")
    private Integer currentJobObjectMemoryLimitMb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_memory_usage_mb")
    private int processMemoryUsageMb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "non_sos_memory_usage_mb")
    private int nonSosMemoryUsageMb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "committed_memory_target_mb")
    private int committedMemoryTargetMb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "committed_memory_mb")
    private int committedMemoryMb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocation_potential_memory_mb")
    private int allocationPotentialMemoryMb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oom_factor")
    private short oomFactor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "oom_factor_desc")
    private String oomFactorDesc;
    @Size(max = 4000)
    @Column(name = "oom_resource_pools")
    private String oomResourcePools;
    @Size(max = 4000)
    @Column(name = "top_memory_clerks")
    private String topMemoryClerks;
    @Size(max = 4000)
    @Column(name = "top_resource_pools")
    private String topResourcePools;
    @Size(max = 4000)
    @Column(name = "possible_leaked_memory_clerks")
    private String possibleLeakedMemoryClerks;
    @Column(name = "possible_non_sos_leaked_memory_mb")
    private Integer possibleNonSosLeakedMemoryMb;

    public DmOsOutOfMemoryEvents() {
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public short getOomCause() {
        return oomCause;
    }

    public void setOomCause(short oomCause) {
        this.oomCause = oomCause;
    }

    public String getOomCauseDesc() {
        return oomCauseDesc;
    }

    public void setOomCauseDesc(String oomCauseDesc) {
        this.oomCauseDesc = oomCauseDesc;
    }

    public int getAvailablePhysicalMemoryMb() {
        return availablePhysicalMemoryMb;
    }

    public void setAvailablePhysicalMemoryMb(int availablePhysicalMemoryMb) {
        this.availablePhysicalMemoryMb = availablePhysicalMemoryMb;
    }

    public Integer getInitialJobObjectMemoryLimitMb() {
        return initialJobObjectMemoryLimitMb;
    }

    public void setInitialJobObjectMemoryLimitMb(Integer initialJobObjectMemoryLimitMb) {
        this.initialJobObjectMemoryLimitMb = initialJobObjectMemoryLimitMb;
    }

    public Integer getCurrentJobObjectMemoryLimitMb() {
        return currentJobObjectMemoryLimitMb;
    }

    public void setCurrentJobObjectMemoryLimitMb(Integer currentJobObjectMemoryLimitMb) {
        this.currentJobObjectMemoryLimitMb = currentJobObjectMemoryLimitMb;
    }

    public int getProcessMemoryUsageMb() {
        return processMemoryUsageMb;
    }

    public void setProcessMemoryUsageMb(int processMemoryUsageMb) {
        this.processMemoryUsageMb = processMemoryUsageMb;
    }

    public int getNonSosMemoryUsageMb() {
        return nonSosMemoryUsageMb;
    }

    public void setNonSosMemoryUsageMb(int nonSosMemoryUsageMb) {
        this.nonSosMemoryUsageMb = nonSosMemoryUsageMb;
    }

    public int getCommittedMemoryTargetMb() {
        return committedMemoryTargetMb;
    }

    public void setCommittedMemoryTargetMb(int committedMemoryTargetMb) {
        this.committedMemoryTargetMb = committedMemoryTargetMb;
    }

    public int getCommittedMemoryMb() {
        return committedMemoryMb;
    }

    public void setCommittedMemoryMb(int committedMemoryMb) {
        this.committedMemoryMb = committedMemoryMb;
    }

    public int getAllocationPotentialMemoryMb() {
        return allocationPotentialMemoryMb;
    }

    public void setAllocationPotentialMemoryMb(int allocationPotentialMemoryMb) {
        this.allocationPotentialMemoryMb = allocationPotentialMemoryMb;
    }

    public short getOomFactor() {
        return oomFactor;
    }

    public void setOomFactor(short oomFactor) {
        this.oomFactor = oomFactor;
    }

    public String getOomFactorDesc() {
        return oomFactorDesc;
    }

    public void setOomFactorDesc(String oomFactorDesc) {
        this.oomFactorDesc = oomFactorDesc;
    }

    public String getOomResourcePools() {
        return oomResourcePools;
    }

    public void setOomResourcePools(String oomResourcePools) {
        this.oomResourcePools = oomResourcePools;
    }

    public String getTopMemoryClerks() {
        return topMemoryClerks;
    }

    public void setTopMemoryClerks(String topMemoryClerks) {
        this.topMemoryClerks = topMemoryClerks;
    }

    public String getTopResourcePools() {
        return topResourcePools;
    }

    public void setTopResourcePools(String topResourcePools) {
        this.topResourcePools = topResourcePools;
    }

    public String getPossibleLeakedMemoryClerks() {
        return possibleLeakedMemoryClerks;
    }

    public void setPossibleLeakedMemoryClerks(String possibleLeakedMemoryClerks) {
        this.possibleLeakedMemoryClerks = possibleLeakedMemoryClerks;
    }

    public Integer getPossibleNonSosLeakedMemoryMb() {
        return possibleNonSosLeakedMemoryMb;
    }

    public void setPossibleNonSosLeakedMemoryMb(Integer possibleNonSosLeakedMemoryMb) {
        this.possibleNonSosLeakedMemoryMb = possibleNonSosLeakedMemoryMb;
    }
    
}
