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
import javax.persistence.Lob;
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
@Table(name = "conversation_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConversationEndpoints.findAll", query = "SELECT c FROM ConversationEndpoints c"),
    @NamedQuery(name = "ConversationEndpoints.findByConversationHandle", query = "SELECT c FROM ConversationEndpoints c WHERE c.conversationHandle = :conversationHandle"),
    @NamedQuery(name = "ConversationEndpoints.findByConversationId", query = "SELECT c FROM ConversationEndpoints c WHERE c.conversationId = :conversationId"),
    @NamedQuery(name = "ConversationEndpoints.findByIsInitiator", query = "SELECT c FROM ConversationEndpoints c WHERE c.isInitiator = :isInitiator"),
    @NamedQuery(name = "ConversationEndpoints.findByServiceContractId", query = "SELECT c FROM ConversationEndpoints c WHERE c.serviceContractId = :serviceContractId"),
    @NamedQuery(name = "ConversationEndpoints.findByConversationGroupId", query = "SELECT c FROM ConversationEndpoints c WHERE c.conversationGroupId = :conversationGroupId"),
    @NamedQuery(name = "ConversationEndpoints.findByServiceId", query = "SELECT c FROM ConversationEndpoints c WHERE c.serviceId = :serviceId"),
    @NamedQuery(name = "ConversationEndpoints.findByLifetime", query = "SELECT c FROM ConversationEndpoints c WHERE c.lifetime = :lifetime"),
    @NamedQuery(name = "ConversationEndpoints.findByState", query = "SELECT c FROM ConversationEndpoints c WHERE c.state = :state"),
    @NamedQuery(name = "ConversationEndpoints.findByStateDesc", query = "SELECT c FROM ConversationEndpoints c WHERE c.stateDesc = :stateDesc"),
    @NamedQuery(name = "ConversationEndpoints.findByFarService", query = "SELECT c FROM ConversationEndpoints c WHERE c.farService = :farService"),
    @NamedQuery(name = "ConversationEndpoints.findByFarBrokerInstance", query = "SELECT c FROM ConversationEndpoints c WHERE c.farBrokerInstance = :farBrokerInstance"),
    @NamedQuery(name = "ConversationEndpoints.findByPrincipalId", query = "SELECT c FROM ConversationEndpoints c WHERE c.principalId = :principalId"),
    @NamedQuery(name = "ConversationEndpoints.findByFarPrincipalId", query = "SELECT c FROM ConversationEndpoints c WHERE c.farPrincipalId = :farPrincipalId"),
    @NamedQuery(name = "ConversationEndpoints.findByOutboundSessionKeyIdentifier", query = "SELECT c FROM ConversationEndpoints c WHERE c.outboundSessionKeyIdentifier = :outboundSessionKeyIdentifier"),
    @NamedQuery(name = "ConversationEndpoints.findByInboundSessionKeyIdentifier", query = "SELECT c FROM ConversationEndpoints c WHERE c.inboundSessionKeyIdentifier = :inboundSessionKeyIdentifier"),
    @NamedQuery(name = "ConversationEndpoints.findBySecurityTimestamp", query = "SELECT c FROM ConversationEndpoints c WHERE c.securityTimestamp = :securityTimestamp"),
    @NamedQuery(name = "ConversationEndpoints.findByDialogTimer", query = "SELECT c FROM ConversationEndpoints c WHERE c.dialogTimer = :dialogTimer"),
    @NamedQuery(name = "ConversationEndpoints.findBySendSequence", query = "SELECT c FROM ConversationEndpoints c WHERE c.sendSequence = :sendSequence"),
    @NamedQuery(name = "ConversationEndpoints.findByEndDialogSequence", query = "SELECT c FROM ConversationEndpoints c WHERE c.endDialogSequence = :endDialogSequence"),
    @NamedQuery(name = "ConversationEndpoints.findByReceiveSequence", query = "SELECT c FROM ConversationEndpoints c WHERE c.receiveSequence = :receiveSequence"),
    @NamedQuery(name = "ConversationEndpoints.findByReceiveSequenceFrag", query = "SELECT c FROM ConversationEndpoints c WHERE c.receiveSequenceFrag = :receiveSequenceFrag"),
    @NamedQuery(name = "ConversationEndpoints.findBySystemSequence", query = "SELECT c FROM ConversationEndpoints c WHERE c.systemSequence = :systemSequence"),
    @NamedQuery(name = "ConversationEndpoints.findByFirstOutOfOrderSequence", query = "SELECT c FROM ConversationEndpoints c WHERE c.firstOutOfOrderSequence = :firstOutOfOrderSequence"),
    @NamedQuery(name = "ConversationEndpoints.findByLastOutOfOrderSequence", query = "SELECT c FROM ConversationEndpoints c WHERE c.lastOutOfOrderSequence = :lastOutOfOrderSequence"),
    @NamedQuery(name = "ConversationEndpoints.findByLastOutOfOrderFrag", query = "SELECT c FROM ConversationEndpoints c WHERE c.lastOutOfOrderFrag = :lastOutOfOrderFrag"),
    @NamedQuery(name = "ConversationEndpoints.findByIsSystem", query = "SELECT c FROM ConversationEndpoints c WHERE c.isSystem = :isSystem"),
    @NamedQuery(name = "ConversationEndpoints.findByPriority", query = "SELECT c FROM ConversationEndpoints c WHERE c.priority = :priority")})
public class ConversationEndpoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "conversation_handle")
    private String conversationHandle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "conversation_id")
    private String conversationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_initiator")
    private boolean isInitiator;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "conversation_group_id")
    private String conversationGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lifetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lifetime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "state")
    private String state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "far_service")
    private String farService;
    @Size(max = 128)
    @Column(name = "far_broker_instance")
    private String farBrokerInstance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "far_principal_id")
    private int farPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "outbound_session_key_identifier")
    private String outboundSessionKeyIdentifier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "inbound_session_key_identifier")
    private String inboundSessionKeyIdentifier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "security_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date securityTimestamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dialog_timer")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dialogTimer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "send_sequence")
    private long sendSequence;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "last_send_tran_id")
    private byte[] lastSendTranId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_dialog_sequence")
    private long endDialogSequence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "receive_sequence")
    private long receiveSequence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "receive_sequence_frag")
    private int receiveSequenceFrag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_sequence")
    private long systemSequence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "first_out_of_order_sequence")
    private long firstOutOfOrderSequence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_out_of_order_sequence")
    private long lastOutOfOrderSequence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_out_of_order_frag")
    private int lastOutOfOrderFrag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system")
    private boolean isSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority")
    private short priority;

    public ConversationEndpoints() {
    }

    public String getConversationHandle() {
        return conversationHandle;
    }

    public void setConversationHandle(String conversationHandle) {
        this.conversationHandle = conversationHandle;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public boolean getIsInitiator() {
        return isInitiator;
    }

    public void setIsInitiator(boolean isInitiator) {
        this.isInitiator = isInitiator;
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public String getConversationGroupId() {
        return conversationGroupId;
    }

    public void setConversationGroupId(String conversationGroupId) {
        this.conversationGroupId = conversationGroupId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public String getFarService() {
        return farService;
    }

    public void setFarService(String farService) {
        this.farService = farService;
    }

    public String getFarBrokerInstance() {
        return farBrokerInstance;
    }

    public void setFarBrokerInstance(String farBrokerInstance) {
        this.farBrokerInstance = farBrokerInstance;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getFarPrincipalId() {
        return farPrincipalId;
    }

    public void setFarPrincipalId(int farPrincipalId) {
        this.farPrincipalId = farPrincipalId;
    }

    public String getOutboundSessionKeyIdentifier() {
        return outboundSessionKeyIdentifier;
    }

    public void setOutboundSessionKeyIdentifier(String outboundSessionKeyIdentifier) {
        this.outboundSessionKeyIdentifier = outboundSessionKeyIdentifier;
    }

    public String getInboundSessionKeyIdentifier() {
        return inboundSessionKeyIdentifier;
    }

    public void setInboundSessionKeyIdentifier(String inboundSessionKeyIdentifier) {
        this.inboundSessionKeyIdentifier = inboundSessionKeyIdentifier;
    }

    public Date getSecurityTimestamp() {
        return securityTimestamp;
    }

    public void setSecurityTimestamp(Date securityTimestamp) {
        this.securityTimestamp = securityTimestamp;
    }

    public Date getDialogTimer() {
        return dialogTimer;
    }

    public void setDialogTimer(Date dialogTimer) {
        this.dialogTimer = dialogTimer;
    }

    public long getSendSequence() {
        return sendSequence;
    }

    public void setSendSequence(long sendSequence) {
        this.sendSequence = sendSequence;
    }

    public byte[] getLastSendTranId() {
        return lastSendTranId;
    }

    public void setLastSendTranId(byte[] lastSendTranId) {
        this.lastSendTranId = lastSendTranId;
    }

    public long getEndDialogSequence() {
        return endDialogSequence;
    }

    public void setEndDialogSequence(long endDialogSequence) {
        this.endDialogSequence = endDialogSequence;
    }

    public long getReceiveSequence() {
        return receiveSequence;
    }

    public void setReceiveSequence(long receiveSequence) {
        this.receiveSequence = receiveSequence;
    }

    public int getReceiveSequenceFrag() {
        return receiveSequenceFrag;
    }

    public void setReceiveSequenceFrag(int receiveSequenceFrag) {
        this.receiveSequenceFrag = receiveSequenceFrag;
    }

    public long getSystemSequence() {
        return systemSequence;
    }

    public void setSystemSequence(long systemSequence) {
        this.systemSequence = systemSequence;
    }

    public long getFirstOutOfOrderSequence() {
        return firstOutOfOrderSequence;
    }

    public void setFirstOutOfOrderSequence(long firstOutOfOrderSequence) {
        this.firstOutOfOrderSequence = firstOutOfOrderSequence;
    }

    public long getLastOutOfOrderSequence() {
        return lastOutOfOrderSequence;
    }

    public void setLastOutOfOrderSequence(long lastOutOfOrderSequence) {
        this.lastOutOfOrderSequence = lastOutOfOrderSequence;
    }

    public int getLastOutOfOrderFrag() {
        return lastOutOfOrderFrag;
    }

    public void setLastOutOfOrderFrag(int lastOutOfOrderFrag) {
        this.lastOutOfOrderFrag = lastOutOfOrderFrag;
    }

    public boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(boolean isSystem) {
        this.isSystem = isSystem;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }
    
}
