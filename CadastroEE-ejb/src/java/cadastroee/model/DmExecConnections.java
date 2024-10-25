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
@Table(name = "dm_exec_connections")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecConnections.findAll", query = "SELECT d FROM DmExecConnections d"),
    @NamedQuery(name = "DmExecConnections.findBySessionId", query = "SELECT d FROM DmExecConnections d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmExecConnections.findByMostRecentSessionId", query = "SELECT d FROM DmExecConnections d WHERE d.mostRecentSessionId = :mostRecentSessionId"),
    @NamedQuery(name = "DmExecConnections.findByConnectTime", query = "SELECT d FROM DmExecConnections d WHERE d.connectTime = :connectTime"),
    @NamedQuery(name = "DmExecConnections.findByNetTransport", query = "SELECT d FROM DmExecConnections d WHERE d.netTransport = :netTransport"),
    @NamedQuery(name = "DmExecConnections.findByProtocolType", query = "SELECT d FROM DmExecConnections d WHERE d.protocolType = :protocolType"),
    @NamedQuery(name = "DmExecConnections.findByProtocolVersion", query = "SELECT d FROM DmExecConnections d WHERE d.protocolVersion = :protocolVersion"),
    @NamedQuery(name = "DmExecConnections.findByEndpointId", query = "SELECT d FROM DmExecConnections d WHERE d.endpointId = :endpointId"),
    @NamedQuery(name = "DmExecConnections.findByEncryptOption", query = "SELECT d FROM DmExecConnections d WHERE d.encryptOption = :encryptOption"),
    @NamedQuery(name = "DmExecConnections.findByAuthScheme", query = "SELECT d FROM DmExecConnections d WHERE d.authScheme = :authScheme"),
    @NamedQuery(name = "DmExecConnections.findByNodeAffinity", query = "SELECT d FROM DmExecConnections d WHERE d.nodeAffinity = :nodeAffinity"),
    @NamedQuery(name = "DmExecConnections.findByNumReads", query = "SELECT d FROM DmExecConnections d WHERE d.numReads = :numReads"),
    @NamedQuery(name = "DmExecConnections.findByNumWrites", query = "SELECT d FROM DmExecConnections d WHERE d.numWrites = :numWrites"),
    @NamedQuery(name = "DmExecConnections.findByLastRead", query = "SELECT d FROM DmExecConnections d WHERE d.lastRead = :lastRead"),
    @NamedQuery(name = "DmExecConnections.findByLastWrite", query = "SELECT d FROM DmExecConnections d WHERE d.lastWrite = :lastWrite"),
    @NamedQuery(name = "DmExecConnections.findByNetPacketSize", query = "SELECT d FROM DmExecConnections d WHERE d.netPacketSize = :netPacketSize"),
    @NamedQuery(name = "DmExecConnections.findByClientNetAddress", query = "SELECT d FROM DmExecConnections d WHERE d.clientNetAddress = :clientNetAddress"),
    @NamedQuery(name = "DmExecConnections.findByClientTcpPort", query = "SELECT d FROM DmExecConnections d WHERE d.clientTcpPort = :clientTcpPort"),
    @NamedQuery(name = "DmExecConnections.findByLocalNetAddress", query = "SELECT d FROM DmExecConnections d WHERE d.localNetAddress = :localNetAddress"),
    @NamedQuery(name = "DmExecConnections.findByLocalTcpPort", query = "SELECT d FROM DmExecConnections d WHERE d.localTcpPort = :localTcpPort"),
    @NamedQuery(name = "DmExecConnections.findByConnectionId", query = "SELECT d FROM DmExecConnections d WHERE d.connectionId = :connectionId"),
    @NamedQuery(name = "DmExecConnections.findByParentConnectionId", query = "SELECT d FROM DmExecConnections d WHERE d.parentConnectionId = :parentConnectionId")})
public class DmExecConnections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Integer sessionId;
    @Column(name = "most_recent_session_id")
    private Integer mostRecentSessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "connect_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date connectTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "net_transport")
    private String netTransport;
    @Size(max = 40)
    @Column(name = "protocol_type")
    private String protocolType;
    @Column(name = "protocol_version")
    private Integer protocolVersion;
    @Column(name = "endpoint_id")
    private Integer endpointId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "encrypt_option")
    private String encryptOption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "auth_scheme")
    private String authScheme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "node_affinity")
    private short nodeAffinity;
    @Column(name = "num_reads")
    private Integer numReads;
    @Column(name = "num_writes")
    private Integer numWrites;
    @Column(name = "last_read")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRead;
    @Column(name = "last_write")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastWrite;
    @Column(name = "net_packet_size")
    private Integer netPacketSize;
    @Size(max = 48)
    @Column(name = "client_net_address")
    private String clientNetAddress;
    @Column(name = "client_tcp_port")
    private Integer clientTcpPort;
    @Size(max = 48)
    @Column(name = "local_net_address")
    private String localNetAddress;
    @Column(name = "local_tcp_port")
    private Integer localTcpPort;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "connection_id")
    private String connectionId;
    @Size(max = 36)
    @Column(name = "parent_connection_id")
    private String parentConnectionId;
    @Lob
    @Column(name = "most_recent_sql_handle")
    private byte[] mostRecentSqlHandle;

    public DmExecConnections() {
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getMostRecentSessionId() {
        return mostRecentSessionId;
    }

    public void setMostRecentSessionId(Integer mostRecentSessionId) {
        this.mostRecentSessionId = mostRecentSessionId;
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public String getNetTransport() {
        return netTransport;
    }

    public void setNetTransport(String netTransport) {
        this.netTransport = netTransport;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public Integer getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(Integer protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public Integer getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
    }

    public String getEncryptOption() {
        return encryptOption;
    }

    public void setEncryptOption(String encryptOption) {
        this.encryptOption = encryptOption;
    }

    public String getAuthScheme() {
        return authScheme;
    }

    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme;
    }

    public short getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(short nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public Integer getNumReads() {
        return numReads;
    }

    public void setNumReads(Integer numReads) {
        this.numReads = numReads;
    }

    public Integer getNumWrites() {
        return numWrites;
    }

    public void setNumWrites(Integer numWrites) {
        this.numWrites = numWrites;
    }

    public Date getLastRead() {
        return lastRead;
    }

    public void setLastRead(Date lastRead) {
        this.lastRead = lastRead;
    }

    public Date getLastWrite() {
        return lastWrite;
    }

    public void setLastWrite(Date lastWrite) {
        this.lastWrite = lastWrite;
    }

    public Integer getNetPacketSize() {
        return netPacketSize;
    }

    public void setNetPacketSize(Integer netPacketSize) {
        this.netPacketSize = netPacketSize;
    }

    public String getClientNetAddress() {
        return clientNetAddress;
    }

    public void setClientNetAddress(String clientNetAddress) {
        this.clientNetAddress = clientNetAddress;
    }

    public Integer getClientTcpPort() {
        return clientTcpPort;
    }

    public void setClientTcpPort(Integer clientTcpPort) {
        this.clientTcpPort = clientTcpPort;
    }

    public String getLocalNetAddress() {
        return localNetAddress;
    }

    public void setLocalNetAddress(String localNetAddress) {
        this.localNetAddress = localNetAddress;
    }

    public Integer getLocalTcpPort() {
        return localTcpPort;
    }

    public void setLocalTcpPort(Integer localTcpPort) {
        this.localTcpPort = localTcpPort;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getParentConnectionId() {
        return parentConnectionId;
    }

    public void setParentConnectionId(String parentConnectionId) {
        this.parentConnectionId = parentConnectionId;
    }

    public byte[] getMostRecentSqlHandle() {
        return mostRecentSqlHandle;
    }

    public void setMostRecentSqlHandle(byte[] mostRecentSqlHandle) {
        this.mostRecentSqlHandle = mostRecentSqlHandle;
    }
    
}
