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
@Table(name = "dm_exec_query_parallel_workers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryParallelWorkers.findAll", query = "SELECT d FROM DmExecQueryParallelWorkers d"),
    @NamedQuery(name = "DmExecQueryParallelWorkers.findByNodeId", query = "SELECT d FROM DmExecQueryParallelWorkers d WHERE d.nodeId = :nodeId"),
    @NamedQuery(name = "DmExecQueryParallelWorkers.findBySchedulerCount", query = "SELECT d FROM DmExecQueryParallelWorkers d WHERE d.schedulerCount = :schedulerCount"),
    @NamedQuery(name = "DmExecQueryParallelWorkers.findByMaxWorkerCount", query = "SELECT d FROM DmExecQueryParallelWorkers d WHERE d.maxWorkerCount = :maxWorkerCount"),
    @NamedQuery(name = "DmExecQueryParallelWorkers.findByReservedWorkerCount", query = "SELECT d FROM DmExecQueryParallelWorkers d WHERE d.reservedWorkerCount = :reservedWorkerCount"),
    @NamedQuery(name = "DmExecQueryParallelWorkers.findByFreeWorkerCount", query = "SELECT d FROM DmExecQueryParallelWorkers d WHERE d.freeWorkerCount = :freeWorkerCount"),
    @NamedQuery(name = "DmExecQueryParallelWorkers.findByUsedWorkerCount", query = "SELECT d FROM DmExecQueryParallelWorkers d WHERE d.usedWorkerCount = :usedWorkerCount")})
public class DmExecQueryParallelWorkers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "node_id")
    private int nodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_count")
    private int schedulerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_worker_count")
    private int maxWorkerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reserved_worker_count")
    private int reservedWorkerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "free_worker_count")
    private int freeWorkerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "used_worker_count")
    private int usedWorkerCount;

    public DmExecQueryParallelWorkers() {
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getSchedulerCount() {
        return schedulerCount;
    }

    public void setSchedulerCount(int schedulerCount) {
        this.schedulerCount = schedulerCount;
    }

    public int getMaxWorkerCount() {
        return maxWorkerCount;
    }

    public void setMaxWorkerCount(int maxWorkerCount) {
        this.maxWorkerCount = maxWorkerCount;
    }

    public int getReservedWorkerCount() {
        return reservedWorkerCount;
    }

    public void setReservedWorkerCount(int reservedWorkerCount) {
        this.reservedWorkerCount = reservedWorkerCount;
    }

    public int getFreeWorkerCount() {
        return freeWorkerCount;
    }

    public void setFreeWorkerCount(int freeWorkerCount) {
        this.freeWorkerCount = freeWorkerCount;
    }

    public int getUsedWorkerCount() {
        return usedWorkerCount;
    }

    public void setUsedWorkerCount(int usedWorkerCount) {
        this.usedWorkerCount = usedWorkerCount;
    }
    
}
