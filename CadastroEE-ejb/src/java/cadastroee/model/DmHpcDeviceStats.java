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
@Table(name = "dm_hpc_device_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHpcDeviceStats.findAll", query = "SELECT d FROM DmHpcDeviceStats d"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDeviceLogicalId", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.deviceLogicalId = :deviceLogicalId"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDeviceType", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.deviceType = :deviceType"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDeviceProvider", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.deviceProvider = :deviceProvider"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDevicePhysicalId", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.devicePhysicalId = :devicePhysicalId"),
    @NamedQuery(name = "DmHpcDeviceStats.findByVersion", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.version = :version"),
    @NamedQuery(name = "DmHpcDeviceStats.findByComputeUnits", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.computeUnits = :computeUnits"),
    @NamedQuery(name = "DmHpcDeviceStats.findByMaxThreadProxies", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.maxThreadProxies = :maxThreadProxies"),
    @NamedQuery(name = "DmHpcDeviceStats.findByClockFrequency", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.clockFrequency = :clockFrequency"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDeviceMemoryBytes", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.deviceMemoryBytes = :deviceMemoryBytes"),
    @NamedQuery(name = "DmHpcDeviceStats.findByRowsHandled", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.rowsHandled = :rowsHandled"),
    @NamedQuery(name = "DmHpcDeviceStats.findByCyclesUsed", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.cyclesUsed = :cyclesUsed"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDeviceToHostBytes", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.deviceToHostBytes = :deviceToHostBytes"),
    @NamedQuery(name = "DmHpcDeviceStats.findByHostToDeviceBytes", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.hostToDeviceBytes = :hostToDeviceBytes"),
    @NamedQuery(name = "DmHpcDeviceStats.findByDeviceReady", query = "SELECT d FROM DmHpcDeviceStats d WHERE d.deviceReady = :deviceReady")})
public class DmHpcDeviceStats implements Serializable {

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
    @Column(name = "device_physical_id")
    private long devicePhysicalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private long version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_units")
    private int computeUnits;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_thread_proxies")
    private int maxThreadProxies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clock_frequency")
    private long clockFrequency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_memory_bytes")
    private long deviceMemoryBytes;
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
    @Column(name = "device_to_host_bytes")
    private long deviceToHostBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "host_to_device_bytes")
    private long hostToDeviceBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "device_ready")
    private boolean deviceReady;

    public DmHpcDeviceStats() {
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

    public long getDevicePhysicalId() {
        return devicePhysicalId;
    }

    public void setDevicePhysicalId(long devicePhysicalId) {
        this.devicePhysicalId = devicePhysicalId;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public int getComputeUnits() {
        return computeUnits;
    }

    public void setComputeUnits(int computeUnits) {
        this.computeUnits = computeUnits;
    }

    public int getMaxThreadProxies() {
        return maxThreadProxies;
    }

    public void setMaxThreadProxies(int maxThreadProxies) {
        this.maxThreadProxies = maxThreadProxies;
    }

    public long getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(long clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public long getDeviceMemoryBytes() {
        return deviceMemoryBytes;
    }

    public void setDeviceMemoryBytes(long deviceMemoryBytes) {
        this.deviceMemoryBytes = deviceMemoryBytes;
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

    public long getDeviceToHostBytes() {
        return deviceToHostBytes;
    }

    public void setDeviceToHostBytes(long deviceToHostBytes) {
        this.deviceToHostBytes = deviceToHostBytes;
    }

    public long getHostToDeviceBytes() {
        return hostToDeviceBytes;
    }

    public void setHostToDeviceBytes(long hostToDeviceBytes) {
        this.hostToDeviceBytes = hostToDeviceBytes;
    }

    public boolean getDeviceReady() {
        return deviceReady;
    }

    public void setDeviceReady(boolean deviceReady) {
        this.deviceReady = deviceReady;
    }
    
}
