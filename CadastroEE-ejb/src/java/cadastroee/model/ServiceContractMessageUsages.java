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
@Table(name = "service_contract_message_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceContractMessageUsages.findAll", query = "SELECT s FROM ServiceContractMessageUsages s"),
    @NamedQuery(name = "ServiceContractMessageUsages.findByServiceContractId", query = "SELECT s FROM ServiceContractMessageUsages s WHERE s.serviceContractId = :serviceContractId"),
    @NamedQuery(name = "ServiceContractMessageUsages.findByMessageTypeId", query = "SELECT s FROM ServiceContractMessageUsages s WHERE s.messageTypeId = :messageTypeId"),
    @NamedQuery(name = "ServiceContractMessageUsages.findByIsSentByInitiator", query = "SELECT s FROM ServiceContractMessageUsages s WHERE s.isSentByInitiator = :isSentByInitiator"),
    @NamedQuery(name = "ServiceContractMessageUsages.findByIsSentByTarget", query = "SELECT s FROM ServiceContractMessageUsages s WHERE s.isSentByTarget = :isSentByTarget")})
public class ServiceContractMessageUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_type_id")
    private int messageTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sent_by_initiator")
    private boolean isSentByInitiator;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sent_by_target")
    private boolean isSentByTarget;

    public ServiceContractMessageUsages() {
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public int getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(int messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public boolean getIsSentByInitiator() {
        return isSentByInitiator;
    }

    public void setIsSentByInitiator(boolean isSentByInitiator) {
        this.isSentByInitiator = isSentByInitiator;
    }

    public boolean getIsSentByTarget() {
        return isSentByTarget;
    }

    public void setIsSentByTarget(boolean isSentByTarget) {
        this.isSentByTarget = isSentByTarget;
    }
    
}
