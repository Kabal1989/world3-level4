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
@Table(name = "transmission_queue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransmissionQueue.findAll", query = "SELECT t FROM TransmissionQueue t"),
    @NamedQuery(name = "TransmissionQueue.findByConversationHandle", query = "SELECT t FROM TransmissionQueue t WHERE t.conversationHandle = :conversationHandle"),
    @NamedQuery(name = "TransmissionQueue.findByToServiceName", query = "SELECT t FROM TransmissionQueue t WHERE t.toServiceName = :toServiceName"),
    @NamedQuery(name = "TransmissionQueue.findByToBrokerInstance", query = "SELECT t FROM TransmissionQueue t WHERE t.toBrokerInstance = :toBrokerInstance"),
    @NamedQuery(name = "TransmissionQueue.findByFromServiceName", query = "SELECT t FROM TransmissionQueue t WHERE t.fromServiceName = :fromServiceName"),
    @NamedQuery(name = "TransmissionQueue.findByServiceContractName", query = "SELECT t FROM TransmissionQueue t WHERE t.serviceContractName = :serviceContractName"),
    @NamedQuery(name = "TransmissionQueue.findByEnqueueTime", query = "SELECT t FROM TransmissionQueue t WHERE t.enqueueTime = :enqueueTime"),
    @NamedQuery(name = "TransmissionQueue.findByMessageSequenceNumber", query = "SELECT t FROM TransmissionQueue t WHERE t.messageSequenceNumber = :messageSequenceNumber"),
    @NamedQuery(name = "TransmissionQueue.findByMessageTypeName", query = "SELECT t FROM TransmissionQueue t WHERE t.messageTypeName = :messageTypeName"),
    @NamedQuery(name = "TransmissionQueue.findByIsConversationError", query = "SELECT t FROM TransmissionQueue t WHERE t.isConversationError = :isConversationError"),
    @NamedQuery(name = "TransmissionQueue.findByIsEndOfDialog", query = "SELECT t FROM TransmissionQueue t WHERE t.isEndOfDialog = :isEndOfDialog"),
    @NamedQuery(name = "TransmissionQueue.findByTransmissionStatus", query = "SELECT t FROM TransmissionQueue t WHERE t.transmissionStatus = :transmissionStatus"),
    @NamedQuery(name = "TransmissionQueue.findByPriority", query = "SELECT t FROM TransmissionQueue t WHERE t.priority = :priority")})
public class TransmissionQueue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "conversation_handle")
    private String conversationHandle;
    @Size(max = 256)
    @Column(name = "to_service_name")
    private String toServiceName;
    @Size(max = 128)
    @Column(name = "to_broker_instance")
    private String toBrokerInstance;
    @Size(max = 256)
    @Column(name = "from_service_name")
    private String fromServiceName;
    @Size(max = 256)
    @Column(name = "service_contract_name")
    private String serviceContractName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enqueue_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enqueueTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_sequence_number")
    private long messageSequenceNumber;
    @Size(max = 256)
    @Column(name = "message_type_name")
    private String messageTypeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_conversation_error")
    private boolean isConversationError;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_end_of_dialog")
    private boolean isEndOfDialog;
    @Lob
    @Column(name = "message_body")
    private byte[] messageBody;
    @Size(max = 4000)
    @Column(name = "transmission_status")
    private String transmissionStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority")
    private short priority;

    public TransmissionQueue() {
    }

    public String getConversationHandle() {
        return conversationHandle;
    }

    public void setConversationHandle(String conversationHandle) {
        this.conversationHandle = conversationHandle;
    }

    public String getToServiceName() {
        return toServiceName;
    }

    public void setToServiceName(String toServiceName) {
        this.toServiceName = toServiceName;
    }

    public String getToBrokerInstance() {
        return toBrokerInstance;
    }

    public void setToBrokerInstance(String toBrokerInstance) {
        this.toBrokerInstance = toBrokerInstance;
    }

    public String getFromServiceName() {
        return fromServiceName;
    }

    public void setFromServiceName(String fromServiceName) {
        this.fromServiceName = fromServiceName;
    }

    public String getServiceContractName() {
        return serviceContractName;
    }

    public void setServiceContractName(String serviceContractName) {
        this.serviceContractName = serviceContractName;
    }

    public Date getEnqueueTime() {
        return enqueueTime;
    }

    public void setEnqueueTime(Date enqueueTime) {
        this.enqueueTime = enqueueTime;
    }

    public long getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    public void setMessageSequenceNumber(long messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }

    public String getMessageTypeName() {
        return messageTypeName;
    }

    public void setMessageTypeName(String messageTypeName) {
        this.messageTypeName = messageTypeName;
    }

    public boolean getIsConversationError() {
        return isConversationError;
    }

    public void setIsConversationError(boolean isConversationError) {
        this.isConversationError = isConversationError;
    }

    public boolean getIsEndOfDialog() {
        return isEndOfDialog;
    }

    public void setIsEndOfDialog(boolean isEndOfDialog) {
        this.isEndOfDialog = isEndOfDialog;
    }

    public byte[] getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(byte[] messageBody) {
        this.messageBody = messageBody;
    }

    public String getTransmissionStatus() {
        return transmissionStatus;
    }

    public void setTransmissionStatus(String transmissionStatus) {
        this.transmissionStatus = transmissionStatus;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }
    
}
