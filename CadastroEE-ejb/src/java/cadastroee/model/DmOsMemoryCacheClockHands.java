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
@Table(name = "dm_os_memory_cache_clock_hands")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findAll", query = "SELECT d FROM DmOsMemoryCacheClockHands d"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByName", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByType", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByClockHand", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.clockHand = :clockHand"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByClockStatus", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.clockStatus = :clockStatus"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.roundsCount = :roundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByRemovedAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.removedAllRoundsCount = :removedAllRoundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByUpdatedLastRoundCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.updatedLastRoundCount = :updatedLastRoundCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByRemovedLastRoundCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.removedLastRoundCount = :removedLastRoundCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByLastTickTime", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.lastTickTime = :lastTickTime"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByRoundStartTime", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.roundStartTime = :roundStartTime"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByLastRoundStartTime", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.lastRoundStartTime = :lastRoundStartTime"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByEntriesVisitedAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.entriesVisitedAllRoundsCount = :entriesVisitedAllRoundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByInuseAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.inuseAllRoundsCount = :inuseAllRoundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByPinnedAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.pinnedAllRoundsCount = :pinnedAllRoundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByDoNotRemoveAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.doNotRemoveAllRoundsCount = :doNotRemoveAllRoundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByInvisibleAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.invisibleAllRoundsCount = :invisibleAllRoundsCount"),
    @NamedQuery(name = "DmOsMemoryCacheClockHands.findByDifferentPoolAllRoundsCount", query = "SELECT d FROM DmOsMemoryCacheClockHands d WHERE d.differentPoolAllRoundsCount = :differentPoolAllRoundsCount")})
public class DmOsMemoryCacheClockHands implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "cache_address")
    private byte[] cacheAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "clock_hand")
    private String clockHand;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "clock_status")
    private String clockStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rounds_count")
    private long roundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "removed_all_rounds_count")
    private long removedAllRoundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updated_last_round_count")
    private long updatedLastRoundCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "removed_last_round_count")
    private long removedLastRoundCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_tick_time")
    private long lastTickTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "round_start_time")
    private long roundStartTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_round_start_time")
    private long lastRoundStartTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entries_visited_all_rounds_count")
    private long entriesVisitedAllRoundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inuse_all_rounds_count")
    private long inuseAllRoundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pinned_all_rounds_count")
    private long pinnedAllRoundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "do_not_remove_all_rounds_count")
    private long doNotRemoveAllRoundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "invisible_all_rounds_count")
    private long invisibleAllRoundsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "different_pool_all_rounds_count")
    private long differentPoolAllRoundsCount;

    public DmOsMemoryCacheClockHands() {
    }

    public byte[] getCacheAddress() {
        return cacheAddress;
    }

    public void setCacheAddress(byte[] cacheAddress) {
        this.cacheAddress = cacheAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClockHand() {
        return clockHand;
    }

    public void setClockHand(String clockHand) {
        this.clockHand = clockHand;
    }

    public String getClockStatus() {
        return clockStatus;
    }

    public void setClockStatus(String clockStatus) {
        this.clockStatus = clockStatus;
    }

    public long getRoundsCount() {
        return roundsCount;
    }

    public void setRoundsCount(long roundsCount) {
        this.roundsCount = roundsCount;
    }

    public long getRemovedAllRoundsCount() {
        return removedAllRoundsCount;
    }

    public void setRemovedAllRoundsCount(long removedAllRoundsCount) {
        this.removedAllRoundsCount = removedAllRoundsCount;
    }

    public long getUpdatedLastRoundCount() {
        return updatedLastRoundCount;
    }

    public void setUpdatedLastRoundCount(long updatedLastRoundCount) {
        this.updatedLastRoundCount = updatedLastRoundCount;
    }

    public long getRemovedLastRoundCount() {
        return removedLastRoundCount;
    }

    public void setRemovedLastRoundCount(long removedLastRoundCount) {
        this.removedLastRoundCount = removedLastRoundCount;
    }

    public long getLastTickTime() {
        return lastTickTime;
    }

    public void setLastTickTime(long lastTickTime) {
        this.lastTickTime = lastTickTime;
    }

    public long getRoundStartTime() {
        return roundStartTime;
    }

    public void setRoundStartTime(long roundStartTime) {
        this.roundStartTime = roundStartTime;
    }

    public long getLastRoundStartTime() {
        return lastRoundStartTime;
    }

    public void setLastRoundStartTime(long lastRoundStartTime) {
        this.lastRoundStartTime = lastRoundStartTime;
    }

    public long getEntriesVisitedAllRoundsCount() {
        return entriesVisitedAllRoundsCount;
    }

    public void setEntriesVisitedAllRoundsCount(long entriesVisitedAllRoundsCount) {
        this.entriesVisitedAllRoundsCount = entriesVisitedAllRoundsCount;
    }

    public long getInuseAllRoundsCount() {
        return inuseAllRoundsCount;
    }

    public void setInuseAllRoundsCount(long inuseAllRoundsCount) {
        this.inuseAllRoundsCount = inuseAllRoundsCount;
    }

    public long getPinnedAllRoundsCount() {
        return pinnedAllRoundsCount;
    }

    public void setPinnedAllRoundsCount(long pinnedAllRoundsCount) {
        this.pinnedAllRoundsCount = pinnedAllRoundsCount;
    }

    public long getDoNotRemoveAllRoundsCount() {
        return doNotRemoveAllRoundsCount;
    }

    public void setDoNotRemoveAllRoundsCount(long doNotRemoveAllRoundsCount) {
        this.doNotRemoveAllRoundsCount = doNotRemoveAllRoundsCount;
    }

    public long getInvisibleAllRoundsCount() {
        return invisibleAllRoundsCount;
    }

    public void setInvisibleAllRoundsCount(long invisibleAllRoundsCount) {
        this.invisibleAllRoundsCount = invisibleAllRoundsCount;
    }

    public long getDifferentPoolAllRoundsCount() {
        return differentPoolAllRoundsCount;
    }

    public void setDifferentPoolAllRoundsCount(long differentPoolAllRoundsCount) {
        this.differentPoolAllRoundsCount = differentPoolAllRoundsCount;
    }
    
}
