/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_xe_session_events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXeSessionEvents.findAll", query = "SELECT d FROM DmXeSessionEvents d"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventName", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventName = :eventName"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventPackageGuid", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventPackageGuid = :eventPackageGuid"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventPredicate", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventPredicate = :eventPredicate"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventFireCount", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventFireCount = :eventFireCount"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventFireAverageTime", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventFireAverageTime = :eventFireAverageTime"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventFireMinTime", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventFireMinTime = :eventFireMinTime"),
    @NamedQuery(name = "DmXeSessionEvents.findByEventFireMaxTime", query = "SELECT d FROM DmXeSessionEvents d WHERE d.eventFireMaxTime = :eventFireMaxTime")})
public class DmXeSessionEvents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "event_session_address")
    private byte[] eventSessionAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "event_package_guid")
    private String eventPackageGuid;
    @Size(max = 3072)
    @Column(name = "event_predicate")
    private String eventPredicate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_fire_count")
    private long eventFireCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_fire_average_time")
    private long eventFireAverageTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_fire_min_time")
    private long eventFireMinTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_fire_max_time")
    private long eventFireMaxTime;

    public DmXeSessionEvents() {
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPackageGuid() {
        return eventPackageGuid;
    }

    public void setEventPackageGuid(String eventPackageGuid) {
        this.eventPackageGuid = eventPackageGuid;
    }

    public String getEventPredicate() {
        return eventPredicate;
    }

    public void setEventPredicate(String eventPredicate) {
        this.eventPredicate = eventPredicate;
    }

    public long getEventFireCount() {
        return eventFireCount;
    }

    public void setEventFireCount(long eventFireCount) {
        this.eventFireCount = eventFireCount;
    }

    public long getEventFireAverageTime() {
        return eventFireAverageTime;
    }

    public void setEventFireAverageTime(long eventFireAverageTime) {
        this.eventFireAverageTime = eventFireAverageTime;
    }

    public long getEventFireMinTime() {
        return eventFireMinTime;
    }

    public void setEventFireMinTime(long eventFireMinTime) {
        this.eventFireMinTime = eventFireMinTime;
    }

    public long getEventFireMaxTime() {
        return eventFireMaxTime;
    }

    public void setEventFireMaxTime(long eventFireMaxTime) {
        this.eventFireMaxTime = eventFireMaxTime;
    }
    
}
