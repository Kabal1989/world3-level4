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
@Table(name = "dm_hpc_thread_proxy_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHpcThreadProxyStats.findAll", query = "SELECT d FROM DmHpcThreadProxyStats d"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByDeviceLogicalId", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.deviceLogicalId = :deviceLogicalId"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByDeviceType", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.deviceType = :deviceType"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByDeviceProvider", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.deviceProvider = :deviceProvider"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByProxyId", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.proxyId = :proxyId"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByRowsHandled", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.rowsHandled = :rowsHandled"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByCyclesUsed", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.cyclesUsed = :cyclesUsed"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByHostToDeviceBytes", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.hostToDeviceBytes = :hostToDeviceBytes"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByDeviceToHostBytes", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.deviceToHostBytes = :deviceToHostBytes"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByDeviceMemoryBytes", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.deviceMemoryBytes = :deviceMemoryBytes"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findBySessionId", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByRequestId", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmHpcThreadProxyStats.findByActive", query = "SELECT d FROM DmHpcThreadProxyStats d WHERE d.active = :active")})
public class DmHpcThreadProxyStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_logical_id")
    private int deviceLogicalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_type")
    private int deviceType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_provider")
    private int deviceProvider;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proxy_id")
    private int proxyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_handled")
    private long rowsHandled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cycles_used")
    private long cyclesUsed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "host_to_device_bytes")
    private long hostToDeviceBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_to_host_bytes")
    private long deviceToHostBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_memory_bytes")
    private long deviceMemoryBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_id")
    private int requestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active;

    public DmHpcThreadProxyStats() {
    }

    public int getDeviceLogicalId() {
        return deviceLogicalId;
    }

    public void setDeviceLogicalId(int deviceLogicalId) {
        this.deviceLogicalId = deviceLogicalId;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public int getDeviceProvider() {
        return deviceProvider;
    }

    public void setDeviceProvider(int deviceProvider) {
        this.deviceProvider = deviceProvider;
    }

    public int getProxyId() {
        return proxyId;
    }

    public void setProxyId(int proxyId) {
        this.proxyId = proxyId;
    }

    public long getRowsHandled() {
        return rowsHandled;
    }

    public void setRowsHandled(long rowsHandled) {
        this.rowsHandled = rowsHandled;
    }

    public long getCyclesUsed() {
        return cyclesUsed;
    }

    public void setCyclesUsed(long cyclesUsed) {
        this.cyclesUsed = cyclesUsed;
    }

    public long getHostToDeviceBytes() {
        return hostToDeviceBytes;
    }

    public void setHostToDeviceBytes(long hostToDeviceBytes) {
        this.hostToDeviceBytes = hostToDeviceBytes;
    }

    public long getDeviceToHostBytes() {
        return deviceToHostBytes;
    }

    public void setDeviceToHostBytes(long deviceToHostBytes) {
        this.deviceToHostBytes = deviceToHostBytes;
    }

    public long getDeviceMemoryBytes() {
        return deviceMemoryBytes;
    }

    public void setDeviceMemoryBytes(long deviceMemoryBytes) {
        this.deviceMemoryBytes = deviceMemoryBytes;
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
