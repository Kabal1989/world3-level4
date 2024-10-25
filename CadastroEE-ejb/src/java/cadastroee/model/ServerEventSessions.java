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
@Table(name = "server_event_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerEventSessions.findAll", query = "SELECT s FROM ServerEventSessions s"),
    @NamedQuery(name = "ServerEventSessions.findByEventSessionId", query = "SELECT s FROM ServerEventSessions s WHERE s.eventSessionId = :eventSessionId"),
    @NamedQuery(name = "ServerEventSessions.findByName", query = "SELECT s FROM ServerEventSessions s WHERE s.name = :name"),
    @NamedQuery(name = "ServerEventSessions.findByEventRetentionMode", query = "SELECT s FROM ServerEventSessions s WHERE s.eventRetentionMode = :eventRetentionMode"),
    @NamedQuery(name = "ServerEventSessions.findByEventRetentionModeDesc", query = "SELECT s FROM ServerEventSessions s WHERE s.eventRetentionModeDesc = :eventRetentionModeDesc"),
    @NamedQuery(name = "ServerEventSessions.findByMaxDispatchLatency", query = "SELECT s FROM ServerEventSessions s WHERE s.maxDispatchLatency = :maxDispatchLatency"),
    @NamedQuery(name = "ServerEventSessions.findByMaxMemory", query = "SELECT s FROM ServerEventSessions s WHERE s.maxMemory = :maxMemory"),
    @NamedQuery(name = "ServerEventSessions.findByMaxEventSize", query = "SELECT s FROM ServerEventSessions s WHERE s.maxEventSize = :maxEventSize"),
    @NamedQuery(name = "ServerEventSessions.findByMemoryPartitionMode", query = "SELECT s FROM ServerEventSessions s WHERE s.memoryPartitionMode = :memoryPartitionMode"),
    @NamedQuery(name = "ServerEventSessions.findByMemoryPartitionModeDesc", query = "SELECT s FROM ServerEventSessions s WHERE s.memoryPartitionModeDesc = :memoryPartitionModeDesc"),
    @NamedQuery(name = "ServerEventSessions.findByTrackCausality", query = "SELECT s FROM ServerEventSessions s WHERE s.trackCausality = :trackCausality"),
    @NamedQuery(name = "ServerEventSessions.findByStartupState", query = "SELECT s FROM ServerEventSessions s WHERE s.startupState = :startupState"),
    @NamedQuery(name = "ServerEventSessions.findByHasLongRunningTarget", query = "SELECT s FROM ServerEventSessions s WHERE s.hasLongRunningTarget = :hasLongRunningTarget")})
public class ServerEventSessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_session_id")
    private int eventSessionId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "event_retention_mode")
    private Character eventRetentionMode;
    @Size(max = 60)
    @Column(name = "event_retention_mode_desc")
    private String eventRetentionModeDesc;
    @Column(name = "max_dispatch_latency")
    private Integer maxDispatchLatency;
    @Column(name = "max_memory")
    private Integer maxMemory;
    @Column(name = "max_event_size")
    private Integer maxEventSize;
    @Column(name = "memory_partition_mode")
    private Character memoryPartitionMode;
    @Size(max = 60)
    @Column(name = "memory_partition_mode_desc")
    private String memoryPartitionModeDesc;
    @Column(name = "track_causality")
    private Boolean trackCausality;
    @Column(name = "startup_state")
    private Boolean startupState;
    @Column(name = "has_long_running_target")
    private Boolean hasLongRunningTarget;

    public ServerEventSessions() {
    }

    public int getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(int eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getEventRetentionMode() {
        return eventRetentionMode;
    }

    public void setEventRetentionMode(Character eventRetentionMode) {
        this.eventRetentionMode = eventRetentionMode;
    }

    public String getEventRetentionModeDesc() {
        return eventRetentionModeDesc;
    }

    public void setEventRetentionModeDesc(String eventRetentionModeDesc) {
        this.eventRetentionModeDesc = eventRetentionModeDesc;
    }

    public Integer getMaxDispatchLatency() {
        return maxDispatchLatency;
    }

    public void setMaxDispatchLatency(Integer maxDispatchLatency) {
        this.maxDispatchLatency = maxDispatchLatency;
    }

    public Integer getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
    }

    public Integer getMaxEventSize() {
        return maxEventSize;
    }

    public void setMaxEventSize(Integer maxEventSize) {
        this.maxEventSize = maxEventSize;
    }

    public Character getMemoryPartitionMode() {
        return memoryPartitionMode;
    }

    public void setMemoryPartitionMode(Character memoryPartitionMode) {
        this.memoryPartitionMode = memoryPartitionMode;
    }

    public String getMemoryPartitionModeDesc() {
        return memoryPartitionModeDesc;
    }

    public void setMemoryPartitionModeDesc(String memoryPartitionModeDesc) {
        this.memoryPartitionModeDesc = memoryPartitionModeDesc;
    }

    public Boolean getTrackCausality() {
        return trackCausality;
    }

    public void setTrackCausality(Boolean trackCausality) {
        this.trackCausality = trackCausality;
    }

    public Boolean getStartupState() {
        return startupState;
    }

    public void setStartupState(Boolean startupState) {
        this.startupState = startupState;
    }

    public Boolean getHasLongRunningTarget() {
        return hasLongRunningTarget;
    }

    public void setHasLongRunningTarget(Boolean hasLongRunningTarget) {
        this.hasLongRunningTarget = hasLongRunningTarget;
    }
    
}
