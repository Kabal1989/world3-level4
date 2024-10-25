/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_broker_forwarded_messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmBrokerForwardedMessages.findAll", query = "SELECT d FROM DmBrokerForwardedMessages d"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByConversationId", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.conversationId = :conversationId"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByIsInitiator", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.isInitiator = :isInitiator"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByToServiceName", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.toServiceName = :toServiceName"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByToBrokerInstance", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.toBrokerInstance = :toBrokerInstance"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByFromServiceName", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.fromServiceName = :fromServiceName"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByFromBrokerInstance", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.fromBrokerInstance = :fromBrokerInstance"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByAdjacentBrokerAddress", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.adjacentBrokerAddress = :adjacentBrokerAddress"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByMessageSequenceNumber", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.messageSequenceNumber = :messageSequenceNumber"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByMessageFragmentNumber", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.messageFragmentNumber = :messageFragmentNumber"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByHopsRemaining", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.hopsRemaining = :hopsRemaining"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByTimeToLive", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.timeToLive = :timeToLive"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByTimeConsumed", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.timeConsumed = :timeConsumed"),
    @NamedQuery(name = "DmBrokerForwardedMessages.findByMessageId", query = "SELECT d FROM DmBrokerForwardedMessages d WHERE d.messageId = :messageId")})
public class DmBrokerForwardedMessages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "conversation_id")
    private String conversationId;
    @Column(name = "is_initiator")
    private Boolean isInitiator;
    @Size(max = 256)
    @Column(name = "to_service_name")
    private String toServiceName;
    @Size(max = 256)
    @Column(name = "to_broker_instance")
    private String toBrokerInstance;
    @Size(max = 256)
    @Column(name = "from_service_name")
    private String fromServiceName;
    @Size(max = 256)
    @Column(name = "from_broker_instance")
    private String fromBrokerInstance;
    @Size(max = 256)
    @Column(name = "adjacent_broker_address")
    private String adjacentBrokerAddress;
    @Column(name = "message_sequence_number")
    private BigInteger messageSequenceNumber;
    @Column(name = "message_fragment_number")
    private Integer messageFragmentNumber;
    @Column(name = "hops_remaining")
    private Short hopsRemaining;
    @Column(name = "time_to_live")
    private Integer timeToLive;
    @Column(name = "time_consumed")
    private Integer timeConsumed;
    @Size(max = 36)
    @Column(name = "message_id")
    private String messageId;

    public DmBrokerForwardedMessages() {
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Boolean getIsInitiator() {
        return isInitiator;
    }

    public void setIsInitiator(Boolean isInitiator) {
        this.isInitiator = isInitiator;
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

    public String getFromBrokerInstance() {
        return fromBrokerInstance;
    }

    public void setFromBrokerInstance(String fromBrokerInstance) {
        this.fromBrokerInstance = fromBrokerInstance;
    }

    public String getAdjacentBrokerAddress() {
        return adjacentBrokerAddress;
    }

    public void setAdjacentBrokerAddress(String adjacentBrokerAddress) {
        this.adjacentBrokerAddress = adjacentBrokerAddress;
    }

    public BigInteger getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    public void setMessageSequenceNumber(BigInteger messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }

    public Integer getMessageFragmentNumber() {
        return messageFragmentNumber;
    }

    public void setMessageFragmentNumber(Integer messageFragmentNumber) {
        this.messageFragmentNumber = messageFragmentNumber;
    }

    public Short getHopsRemaining() {
        return hopsRemaining;
    }

    public void setHopsRemaining(Short hopsRemaining) {
        this.hopsRemaining = hopsRemaining;
    }

    public Integer getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    public Integer getTimeConsumed() {
        return timeConsumed;
    }

    public void setTimeConsumed(Integer timeConsumed) {
        this.timeConsumed = timeConsumed;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
}
