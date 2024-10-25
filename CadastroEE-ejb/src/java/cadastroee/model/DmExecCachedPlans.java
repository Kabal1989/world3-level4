/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "dm_exec_cached_plans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecCachedPlans.findAll", query = "SELECT d FROM DmExecCachedPlans d"),
    @NamedQuery(name = "DmExecCachedPlans.findByBucketid", query = "SELECT d FROM DmExecCachedPlans d WHERE d.bucketid = :bucketid"),
    @NamedQuery(name = "DmExecCachedPlans.findByRefcounts", query = "SELECT d FROM DmExecCachedPlans d WHERE d.refcounts = :refcounts"),
    @NamedQuery(name = "DmExecCachedPlans.findByUsecounts", query = "SELECT d FROM DmExecCachedPlans d WHERE d.usecounts = :usecounts"),
    @NamedQuery(name = "DmExecCachedPlans.findBySizeInBytes", query = "SELECT d FROM DmExecCachedPlans d WHERE d.sizeInBytes = :sizeInBytes"),
    @NamedQuery(name = "DmExecCachedPlans.findByCacheobjtype", query = "SELECT d FROM DmExecCachedPlans d WHERE d.cacheobjtype = :cacheobjtype"),
    @NamedQuery(name = "DmExecCachedPlans.findByObjtype", query = "SELECT d FROM DmExecCachedPlans d WHERE d.objtype = :objtype"),
    @NamedQuery(name = "DmExecCachedPlans.findByPoolId", query = "SELECT d FROM DmExecCachedPlans d WHERE d.poolId = :poolId")})
public class DmExecCachedPlans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bucketid")
    private int bucketid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "refcounts")
    private int refcounts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usecounts")
    private int usecounts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size_in_bytes")
    private int sizeInBytes;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cacheobjtype")
    private String cacheobjtype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "objtype")
    private String objtype;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "plan_handle")
    private byte[] planHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Lob
    @Column(name = "parent_plan_handle")
    private byte[] parentPlanHandle;

    public DmExecCachedPlans() {
    }

    public int getBucketid() {
        return bucketid;
    }

    public void setBucketid(int bucketid) {
        this.bucketid = bucketid;
    }

    public int getRefcounts() {
        return refcounts;
    }

    public void setRefcounts(int refcounts) {
        this.refcounts = refcounts;
    }

    public int getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(int usecounts) {
        this.usecounts = usecounts;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public String getCacheobjtype() {
        return cacheobjtype;
    }

    public void setCacheobjtype(String cacheobjtype) {
        this.cacheobjtype = cacheobjtype;
    }

    public String getObjtype() {
        return objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public byte[] getParentPlanHandle() {
        return parentPlanHandle;
    }

    public void setParentPlanHandle(byte[] parentPlanHandle) {
        this.parentPlanHandle = parentPlanHandle;
    }
    
}
