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
@Table(name = "conversation_priorities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConversationPriorities.findAll", query = "SELECT c FROM ConversationPriorities c"),
    @NamedQuery(name = "ConversationPriorities.findByPriorityId", query = "SELECT c FROM ConversationPriorities c WHERE c.priorityId = :priorityId"),
    @NamedQuery(name = "ConversationPriorities.findByName", query = "SELECT c FROM ConversationPriorities c WHERE c.name = :name"),
    @NamedQuery(name = "ConversationPriorities.findByServiceContractId", query = "SELECT c FROM ConversationPriorities c WHERE c.serviceContractId = :serviceContractId"),
    @NamedQuery(name = "ConversationPriorities.findByLocalServiceId", query = "SELECT c FROM ConversationPriorities c WHERE c.localServiceId = :localServiceId"),
    @NamedQuery(name = "ConversationPriorities.findByRemoteServiceName", query = "SELECT c FROM ConversationPriorities c WHERE c.remoteServiceName = :remoteServiceName"),
    @NamedQuery(name = "ConversationPriorities.findByPriority", query = "SELECT c FROM ConversationPriorities c WHERE c.priority = :priority")})
public class ConversationPriorities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority_id")
    private int priorityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "service_contract_id")
    private Integer serviceContractId;
    @Column(name = "local_service_id")
    private Integer localServiceId;
    @Size(max = 256)
    @Column(name = "remote_service_name")
    private String remoteServiceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority")
    private short priority;

    public ConversationPriorities() {
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(Integer serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getLocalServiceId() {
        return localServiceId;
    }

    public void setLocalServiceId(Integer localServiceId) {
        this.localServiceId = localServiceId;
    }

    public String getRemoteServiceName() {
        return remoteServiceName;
    }

    public void setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }
    
}
