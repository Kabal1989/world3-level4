/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_broker_activated_tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmBrokerActivatedTasks.findAll", query = "SELECT d FROM DmBrokerActivatedTasks d"),
    @NamedQuery(name = "DmBrokerActivatedTasks.findBySpid", query = "SELECT d FROM DmBrokerActivatedTasks d WHERE d.spid = :spid"),
    @NamedQuery(name = "DmBrokerActivatedTasks.findByDatabaseId", query = "SELECT d FROM DmBrokerActivatedTasks d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmBrokerActivatedTasks.findByQueueId", query = "SELECT d FROM DmBrokerActivatedTasks d WHERE d.queueId = :queueId"),
    @NamedQuery(name = "DmBrokerActivatedTasks.findByProcedureName", query = "SELECT d FROM DmBrokerActivatedTasks d WHERE d.procedureName = :procedureName"),
    @NamedQuery(name = "DmBrokerActivatedTasks.findByExecuteAs", query = "SELECT d FROM DmBrokerActivatedTasks d WHERE d.executeAs = :executeAs")})
public class DmBrokerActivatedTasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "spid")
    private Integer spid;
    @Column(name = "database_id")
    private Short databaseId;
    @Column(name = "queue_id")
    private Integer queueId;
    @Size(max = 325)
    @Column(name = "procedure_name")
    private String procedureName;
    @Column(name = "execute_as")
    private Integer executeAs;

    public DmBrokerActivatedTasks() {
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public Integer getExecuteAs() {
        return executeAs;
    }

    public void setExecuteAs(Integer executeAs) {
        this.executeAs = executeAs;
    }
    
}
