/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_mirroring_connections")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMirroringConnections.findAll", query = "SELECT d FROM DmDbMirroringConnections d"),
    @NamedQuery(name = "DmDbMirroringConnections.findByConnectionId", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.connectionId = :connectionId"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTransportStreamId", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.transportStreamId = :transportStreamId"),
    @NamedQuery(name = "DmDbMirroringConnections.findByState", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbMirroringConnections.findByStateDesc", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmDbMirroringConnections.findByConnectTime", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.connectTime = :connectTime"),
    @NamedQuery(name = "DmDbMirroringConnections.findByLoginTime", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.loginTime = :loginTime"),
    @NamedQuery(name = "DmDbMirroringConnections.findByAuthenticationMethod", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.authenticationMethod = :authenticationMethod"),
    @NamedQuery(name = "DmDbMirroringConnections.findByPrincipalName", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.principalName = :principalName"),
    @NamedQuery(name = "DmDbMirroringConnections.findByRemoteUserName", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.remoteUserName = :remoteUserName"),
    @NamedQuery(name = "DmDbMirroringConnections.findByLastActivityTime", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.lastActivityTime = :lastActivityTime"),
    @NamedQuery(name = "DmDbMirroringConnections.findByIsAccept", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.isAccept = :isAccept"),
    @NamedQuery(name = "DmDbMirroringConnections.findByLoginState", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.loginState = :loginState"),
    @NamedQuery(name = "DmDbMirroringConnections.findByLoginStateDesc", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.loginStateDesc = :loginStateDesc"),
    @NamedQuery(name = "DmDbMirroringConnections.findByPeerCertificateId", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.peerCertificateId = :peerCertificateId"),
    @NamedQuery(name = "DmDbMirroringConnections.findByEncryptionAlgorithm", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.encryptionAlgorithm = :encryptionAlgorithm"),
    @NamedQuery(name = "DmDbMirroringConnections.findByEncryptionAlgorithmDesc", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.encryptionAlgorithmDesc = :encryptionAlgorithmDesc"),
    @NamedQuery(name = "DmDbMirroringConnections.findByReceivesPosted", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.receivesPosted = :receivesPosted"),
    @NamedQuery(name = "DmDbMirroringConnections.findByIsReceiveFlowControlled", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.isReceiveFlowControlled = :isReceiveFlowControlled"),
    @NamedQuery(name = "DmDbMirroringConnections.findBySendsPosted", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.sendsPosted = :sendsPosted"),
    @NamedQuery(name = "DmDbMirroringConnections.findByIsSendFlowControlled", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.isSendFlowControlled = :isSendFlowControlled"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTotalBytesSent", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.totalBytesSent = :totalBytesSent"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTotalBytesReceived", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.totalBytesReceived = :totalBytesReceived"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTotalFragmentsSent", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.totalFragmentsSent = :totalFragmentsSent"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTotalFragmentsReceived", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.totalFragmentsReceived = :totalFragmentsReceived"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTotalSends", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.totalSends = :totalSends"),
    @NamedQuery(name = "DmDbMirroringConnections.findByTotalReceives", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.totalReceives = :totalReceives"),
    @NamedQuery(name = "DmDbMirroringConnections.findByPeerArbitrationId", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.peerArbitrationId = :peerArbitrationId"),
    @NamedQuery(name = "DmDbMirroringConnections.findByAddress", query = "SELECT d FROM DmDbMirroringConnections d WHERE d.address = :address")})
public class DmDbMirroringConnections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "connection_id")
    private String connectionId;
    @Size(max = 36)
    @Column(name = "transport_stream_id")
    private String transportStreamId;
    @Column(name = "state")
    private Short state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Column(name = "connect_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date connectTime;
    @Column(name = "login_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;
    @Size(max = 128)
    @Column(name = "authentication_method")
    private String authenticationMethod;
    @Size(max = 128)
    @Column(name = "principal_name")
    private String principalName;
    @Size(max = 128)
    @Column(name = "remote_user_name")
    private String remoteUserName;
    @Column(name = "last_activity_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityTime;
    @Column(name = "is_accept")
    private Boolean isAccept;
    @Column(name = "login_state")
    private Short loginState;
    @Size(max = 60)
    @Column(name = "login_state_desc")
    private String loginStateDesc;
    @Column(name = "peer_certificate_id")
    private Integer peerCertificateId;
    @Column(name = "encryption_algorithm")
    private Short encryptionAlgorithm;
    @Size(max = 60)
    @Column(name = "encryption_algorithm_desc")
    private String encryptionAlgorithmDesc;
    @Column(name = "receives_posted")
    private Short receivesPosted;
    @Column(name = "is_receive_flow_controlled")
    private Boolean isReceiveFlowControlled;
    @Column(name = "sends_posted")
    private Short sendsPosted;
    @Column(name = "is_send_flow_controlled")
    private Boolean isSendFlowControlled;
    @Column(name = "total_bytes_sent")
    private BigInteger totalBytesSent;
    @Column(name = "total_bytes_received")
    private BigInteger totalBytesReceived;
    @Column(name = "total_fragments_sent")
    private BigInteger totalFragmentsSent;
    @Column(name = "total_fragments_received")
    private BigInteger totalFragmentsReceived;
    @Column(name = "total_sends")
    private BigInteger totalSends;
    @Column(name = "total_receives")
    private BigInteger totalReceives;
    @Size(max = 36)
    @Column(name = "peer_arbitration_id")
    private String peerArbitrationId;
    @Size(max = 256)
    @Column(name = "address")
    private String address;

    public DmDbMirroringConnections() {
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getTransportStreamId() {
        return transportStreamId;
    }

    public void setTransportStreamId(String transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getRemoteUserName() {
        return remoteUserName;
    }

    public void setRemoteUserName(String remoteUserName) {
        this.remoteUserName = remoteUserName;
    }

    public Date getLastActivityTime() {
        return lastActivityTime;
    }

    public void setLastActivityTime(Date lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public Short getLoginState() {
        return loginState;
    }

    public void setLoginState(Short loginState) {
        this.loginState = loginState;
    }

    public String getLoginStateDesc() {
        return loginStateDesc;
    }

    public void setLoginStateDesc(String loginStateDesc) {
        this.loginStateDesc = loginStateDesc;
    }

    public Integer getPeerCertificateId() {
        return peerCertificateId;
    }

    public void setPeerCertificateId(Integer peerCertificateId) {
        this.peerCertificateId = peerCertificateId;
    }

    public Short getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(Short encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String getEncryptionAlgorithmDesc() {
        return encryptionAlgorithmDesc;
    }

    public void setEncryptionAlgorithmDesc(String encryptionAlgorithmDesc) {
        this.encryptionAlgorithmDesc = encryptionAlgorithmDesc;
    }

    public Short getReceivesPosted() {
        return receivesPosted;
    }

    public void setReceivesPosted(Short receivesPosted) {
        this.receivesPosted = receivesPosted;
    }

    public Boolean getIsReceiveFlowControlled() {
        return isReceiveFlowControlled;
    }

    public void setIsReceiveFlowControlled(Boolean isReceiveFlowControlled) {
        this.isReceiveFlowControlled = isReceiveFlowControlled;
    }

    public Short getSendsPosted() {
        return sendsPosted;
    }

    public void setSendsPosted(Short sendsPosted) {
        this.sendsPosted = sendsPosted;
    }

    public Boolean getIsSendFlowControlled() {
        return isSendFlowControlled;
    }

    public void setIsSendFlowControlled(Boolean isSendFlowControlled) {
        this.isSendFlowControlled = isSendFlowControlled;
    }

    public BigInteger getTotalBytesSent() {
        return totalBytesSent;
    }

    public void setTotalBytesSent(BigInteger totalBytesSent) {
        this.totalBytesSent = totalBytesSent;
    }

    public BigInteger getTotalBytesReceived() {
        return totalBytesReceived;
    }

    public void setTotalBytesReceived(BigInteger totalBytesReceived) {
        this.totalBytesReceived = totalBytesReceived;
    }

    public BigInteger getTotalFragmentsSent() {
        return totalFragmentsSent;
    }

    public void setTotalFragmentsSent(BigInteger totalFragmentsSent) {
        this.totalFragmentsSent = totalFragmentsSent;
    }

    public BigInteger getTotalFragmentsReceived() {
        return totalFragmentsReceived;
    }

    public void setTotalFragmentsReceived(BigInteger totalFragmentsReceived) {
        this.totalFragmentsReceived = totalFragmentsReceived;
    }

    public BigInteger getTotalSends() {
        return totalSends;
    }

    public void setTotalSends(BigInteger totalSends) {
        this.totalSends = totalSends;
    }

    public BigInteger getTotalReceives() {
        return totalReceives;
    }

    public void setTotalReceives(BigInteger totalReceives) {
        this.totalReceives = totalReceives;
    }

    public String getPeerArbitrationId() {
        return peerArbitrationId;
    }

    public void setPeerArbitrationId(String peerArbitrationId) {
        this.peerArbitrationId = peerArbitrationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
