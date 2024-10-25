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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "resource_governor_resource_pool_affinity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResourceGovernorResourcePoolAffinity.findAll", query = "SELECT r FROM ResourceGovernorResourcePoolAffinity r"),
    @NamedQuery(name = "ResourceGovernorResourcePoolAffinity.findByPoolId", query = "SELECT r FROM ResourceGovernorResourcePoolAffinity r WHERE r.poolId = :poolId"),
    @NamedQuery(name = "ResourceGovernorResourcePoolAffinity.findByProcessorGroup", query = "SELECT r FROM ResourceGovernorResourcePoolAffinity r WHERE r.processorGroup = :processorGroup"),
    @NamedQuery(name = "ResourceGovernorResourcePoolAffinity.findBySchedulerMask", query = "SELECT r FROM ResourceGovernorResourcePoolAffinity r WHERE r.schedulerMask = :schedulerMask")})
public class ResourceGovernorResourcePoolAffinity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_mask")
    private long schedulerMask;

    public ResourceGovernorResourcePoolAffinity() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public long getSchedulerMask() {
        return schedulerMask;
    }

    public void setSchedulerMask(long schedulerMask) {
        this.schedulerMask = schedulerMask;
    }
    
}
