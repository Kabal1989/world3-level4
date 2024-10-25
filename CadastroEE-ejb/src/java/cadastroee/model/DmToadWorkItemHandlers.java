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
@Table(name = "dm_toad_work_item_handlers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmToadWorkItemHandlers.findAll", query = "SELECT d FROM DmToadWorkItemHandlers d"),
    @NamedQuery(name = "DmToadWorkItemHandlers.findByMessageId", query = "SELECT d FROM DmToadWorkItemHandlers d WHERE d.messageId = :messageId"),
    @NamedQuery(name = "DmToadWorkItemHandlers.findByWorkitemType", query = "SELECT d FROM DmToadWorkItemHandlers d WHERE d.workitemType = :workitemType"),
    @NamedQuery(name = "DmToadWorkItemHandlers.findByProducerType", query = "SELECT d FROM DmToadWorkItemHandlers d WHERE d.producerType = :producerType"),
    @NamedQuery(name = "DmToadWorkItemHandlers.findByProducerId", query = "SELECT d FROM DmToadWorkItemHandlers d WHERE d.producerId = :producerId"),
    @NamedQuery(name = "DmToadWorkItemHandlers.findByState", query = "SELECT d FROM DmToadWorkItemHandlers d WHERE d.state = :state")})
public class DmToadWorkItemHandlers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_id")
    private int messageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "workitem_type")
    private String workitemType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "producer_type")
    private String producerType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "producer_id")
    private int producerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private int state;

    public DmToadWorkItemHandlers() {
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getWorkitemType() {
        return workitemType;
    }

    public void setWorkitemType(String workitemType) {
        this.workitemType = workitemType;
    }

    public String getProducerType() {
        return producerType;
    }

    public void setProducerType(String producerType) {
        this.producerType = producerType;
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int producerId) {
        this.producerId = producerId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
}
