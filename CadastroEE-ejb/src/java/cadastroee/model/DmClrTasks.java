/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_clr_tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmClrTasks.findAll", query = "SELECT d FROM DmClrTasks d"),
    @NamedQuery(name = "DmClrTasks.findByState", query = "SELECT d FROM DmClrTasks d WHERE d.state = :state"),
    @NamedQuery(name = "DmClrTasks.findByAbortState", query = "SELECT d FROM DmClrTasks d WHERE d.abortState = :abortState"),
    @NamedQuery(name = "DmClrTasks.findByType", query = "SELECT d FROM DmClrTasks d WHERE d.type = :type"),
    @NamedQuery(name = "DmClrTasks.findByAffinityCount", query = "SELECT d FROM DmClrTasks d WHERE d.affinityCount = :affinityCount"),
    @NamedQuery(name = "DmClrTasks.findByForcedYieldCount", query = "SELECT d FROM DmClrTasks d WHERE d.forcedYieldCount = :forcedYieldCount")})
public class DmClrTasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Lob
    @Column(name = "sos_task_address")
    private byte[] sosTaskAddress;
    @Lob
    @Column(name = "appdomain_address")
    private byte[] appdomainAddress;
    @Size(max = 128)
    @Column(name = "state")
    private String state;
    @Size(max = 128)
    @Column(name = "abort_state")
    private String abortState;
    @Size(max = 128)
    @Column(name = "type")
    private String type;
    @Column(name = "affinity_count")
    private Integer affinityCount;
    @Column(name = "forced_yield_count")
    private Integer forcedYieldCount;

    public DmClrTasks() {
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public byte[] getSosTaskAddress() {
        return sosTaskAddress;
    }

    public void setSosTaskAddress(byte[] sosTaskAddress) {
        this.sosTaskAddress = sosTaskAddress;
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAbortState() {
        return abortState;
    }

    public void setAbortState(String abortState) {
        this.abortState = abortState;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAffinityCount() {
        return affinityCount;
    }

    public void setAffinityCount(Integer affinityCount) {
        this.affinityCount = affinityCount;
    }

    public Integer getForcedYieldCount() {
        return forcedYieldCount;
    }

    public void setForcedYieldCount(Integer forcedYieldCount) {
        this.forcedYieldCount = forcedYieldCount;
    }
    
}
