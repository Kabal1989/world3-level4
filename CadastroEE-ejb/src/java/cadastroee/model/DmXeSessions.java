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
@Table(name = "dm_xe_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXeSessions.findAll", query = "SELECT d FROM DmXeSessions d"),
    @NamedQuery(name = "DmXeSessions.findByName", query = "SELECT d FROM DmXeSessions d WHERE d.name = :name"),
    @NamedQuery(name = "DmXeSessions.findByPendingBuffers", query = "SELECT d FROM DmXeSessions d WHERE d.pendingBuffers = :pendingBuffers"),
    @NamedQuery(name = "DmXeSessions.findByTotalRegularBuffers", query = "SELECT d FROM DmXeSessions d WHERE d.totalRegularBuffers = :totalRegularBuffers"),
    @NamedQuery(name = "DmXeSessions.findByRegularBufferSize", query = "SELECT d FROM DmXeSessions d WHERE d.regularBufferSize = :regularBufferSize"),
    @NamedQuery(name = "DmXeSessions.findByTotalLargeBuffers", query = "SELECT d FROM DmXeSessions d WHERE d.totalLargeBuffers = :totalLargeBuffers"),
    @NamedQuery(name = "DmXeSessions.findByLargeBufferSize", query = "SELECT d FROM DmXeSessions d WHERE d.largeBufferSize = :largeBufferSize"),
    @NamedQuery(name = "DmXeSessions.findByTotalBufferSize", query = "SELECT d FROM DmXeSessions d WHERE d.totalBufferSize = :totalBufferSize"),
    @NamedQuery(name = "DmXeSessions.findByBufferPolicyFlags", query = "SELECT d FROM DmXeSessions d WHERE d.bufferPolicyFlags = :bufferPolicyFlags"),
    @NamedQuery(name = "DmXeSessions.findByBufferPolicyDesc", query = "SELECT d FROM DmXeSessions d WHERE d.bufferPolicyDesc = :bufferPolicyDesc"),
    @NamedQuery(name = "DmXeSessions.findByFlags", query = "SELECT d FROM DmXeSessions d WHERE d.flags = :flags"),
    @NamedQuery(name = "DmXeSessions.findByFlagDesc", query = "SELECT d FROM DmXeSessions d WHERE d.flagDesc = :flagDesc"),
    @NamedQuery(name = "DmXeSessions.findByDroppedEventCount", query = "SELECT d FROM DmXeSessions d WHERE d.droppedEventCount = :droppedEventCount"),
    @NamedQuery(name = "DmXeSessions.findByDroppedBufferCount", query = "SELECT d FROM DmXeSessions d WHERE d.droppedBufferCount = :droppedBufferCount"),
    @NamedQuery(name = "DmXeSessions.findByBlockedEventFireTime", query = "SELECT d FROM DmXeSessions d WHERE d.blockedEventFireTime = :blockedEventFireTime"),
    @NamedQuery(name = "DmXeSessions.findByCreateTime", query = "SELECT d FROM DmXeSessions d WHERE d.createTime = :createTime"),
    @NamedQuery(name = "DmXeSessions.findByLargestEventDroppedSize", query = "SELECT d FROM DmXeSessions d WHERE d.largestEventDroppedSize = :largestEventDroppedSize"),
    @NamedQuery(name = "DmXeSessions.findBySessionSource", query = "SELECT d FROM DmXeSessions d WHERE d.sessionSource = :sessionSource"),
    @NamedQuery(name = "DmXeSessions.findByBufferProcessedCount", query = "SELECT d FROM DmXeSessions d WHERE d.bufferProcessedCount = :bufferProcessedCount"),
    @NamedQuery(name = "DmXeSessions.findByBufferFullCount", query = "SELECT d FROM DmXeSessions d WHERE d.bufferFullCount = :bufferFullCount"),
    @NamedQuery(name = "DmXeSessions.findByTotalBytesGenerated", query = "SELECT d FROM DmXeSessions d WHERE d.totalBytesGenerated = :totalBytesGenerated"),
    @NamedQuery(name = "DmXeSessions.findByTotalTargetMemory", query = "SELECT d FROM DmXeSessions d WHERE d.totalTargetMemory = :totalTargetMemory")})
public class DmXeSessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "address")
    private byte[] address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_buffers")
    private int pendingBuffers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_regular_buffers")
    private int totalRegularBuffers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regular_buffer_size")
    private long regularBufferSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_large_buffers")
    private int totalLargeBuffers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "large_buffer_size")
    private long largeBufferSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_buffer_size")
    private long totalBufferSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buffer_policy_flags")
    private int bufferPolicyFlags;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "buffer_policy_desc")
    private String bufferPolicyDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "flags")
    private int flags;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "flag_desc")
    private String flagDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dropped_event_count")
    private int droppedEventCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dropped_buffer_count")
    private int droppedBufferCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blocked_event_fire_time")
    private int blockedEventFireTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "largest_event_dropped_size")
    private int largestEventDroppedSize;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "session_source")
    private String sessionSource;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buffer_processed_count")
    private long bufferProcessedCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buffer_full_count")
    private long bufferFullCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_bytes_generated")
    private long totalBytesGenerated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_target_memory")
    private long totalTargetMemory;

    public DmXeSessions() {
    }

    public byte[] getAddress() {
        return address;
    }

    public void setAddress(byte[] address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPendingBuffers() {
        return pendingBuffers;
    }

    public void setPendingBuffers(int pendingBuffers) {
        this.pendingBuffers = pendingBuffers;
    }

    public int getTotalRegularBuffers() {
        return totalRegularBuffers;
    }

    public void setTotalRegularBuffers(int totalRegularBuffers) {
        this.totalRegularBuffers = totalRegularBuffers;
    }

    public long getRegularBufferSize() {
        return regularBufferSize;
    }

    public void setRegularBufferSize(long regularBufferSize) {
        this.regularBufferSize = regularBufferSize;
    }

    public int getTotalLargeBuffers() {
        return totalLargeBuffers;
    }

    public void setTotalLargeBuffers(int totalLargeBuffers) {
        this.totalLargeBuffers = totalLargeBuffers;
    }

    public long getLargeBufferSize() {
        return largeBufferSize;
    }

    public void setLargeBufferSize(long largeBufferSize) {
        this.largeBufferSize = largeBufferSize;
    }

    public long getTotalBufferSize() {
        return totalBufferSize;
    }

    public void setTotalBufferSize(long totalBufferSize) {
        this.totalBufferSize = totalBufferSize;
    }

    public int getBufferPolicyFlags() {
        return bufferPolicyFlags;
    }

    public void setBufferPolicyFlags(int bufferPolicyFlags) {
        this.bufferPolicyFlags = bufferPolicyFlags;
    }

    public String getBufferPolicyDesc() {
        return bufferPolicyDesc;
    }

    public void setBufferPolicyDesc(String bufferPolicyDesc) {
        this.bufferPolicyDesc = bufferPolicyDesc;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public String getFlagDesc() {
        return flagDesc;
    }

    public void setFlagDesc(String flagDesc) {
        this.flagDesc = flagDesc;
    }

    public int getDroppedEventCount() {
        return droppedEventCount;
    }

    public void setDroppedEventCount(int droppedEventCount) {
        this.droppedEventCount = droppedEventCount;
    }

    public int getDroppedBufferCount() {
        return droppedBufferCount;
    }

    public void setDroppedBufferCount(int droppedBufferCount) {
        this.droppedBufferCount = droppedBufferCount;
    }

    public int getBlockedEventFireTime() {
        return blockedEventFireTime;
    }

    public void setBlockedEventFireTime(int blockedEventFireTime) {
        this.blockedEventFireTime = blockedEventFireTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getLargestEventDroppedSize() {
        return largestEventDroppedSize;
    }

    public void setLargestEventDroppedSize(int largestEventDroppedSize) {
        this.largestEventDroppedSize = largestEventDroppedSize;
    }

    public String getSessionSource() {
        return sessionSource;
    }

    public void setSessionSource(String sessionSource) {
        this.sessionSource = sessionSource;
    }

    public long getBufferProcessedCount() {
        return bufferProcessedCount;
    }

    public void setBufferProcessedCount(long bufferProcessedCount) {
        this.bufferProcessedCount = bufferProcessedCount;
    }

    public long getBufferFullCount() {
        return bufferFullCount;
    }

    public void setBufferFullCount(long bufferFullCount) {
        this.bufferFullCount = bufferFullCount;
    }

    public long getTotalBytesGenerated() {
        return totalBytesGenerated;
    }

    public void setTotalBytesGenerated(long totalBytesGenerated) {
        this.totalBytesGenerated = totalBytesGenerated;
    }

    public long getTotalTargetMemory() {
        return totalTargetMemory;
    }

    public void setTotalTargetMemory(long totalTargetMemory) {
        this.totalTargetMemory = totalTargetMemory;
    }
    
}
