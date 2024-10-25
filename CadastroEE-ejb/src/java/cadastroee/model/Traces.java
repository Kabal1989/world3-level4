/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "traces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Traces.findAll", query = "SELECT t FROM Traces t"),
    @NamedQuery(name = "Traces.findById", query = "SELECT t FROM Traces t WHERE t.id = :id"),
    @NamedQuery(name = "Traces.findByStatus", query = "SELECT t FROM Traces t WHERE t.status = :status"),
    @NamedQuery(name = "Traces.findByPath", query = "SELECT t FROM Traces t WHERE t.path = :path"),
    @NamedQuery(name = "Traces.findByMaxSize", query = "SELECT t FROM Traces t WHERE t.maxSize = :maxSize"),
    @NamedQuery(name = "Traces.findByStopTime", query = "SELECT t FROM Traces t WHERE t.stopTime = :stopTime"),
    @NamedQuery(name = "Traces.findByMaxFiles", query = "SELECT t FROM Traces t WHERE t.maxFiles = :maxFiles"),
    @NamedQuery(name = "Traces.findByIsRowset", query = "SELECT t FROM Traces t WHERE t.isRowset = :isRowset"),
    @NamedQuery(name = "Traces.findByIsRollover", query = "SELECT t FROM Traces t WHERE t.isRollover = :isRollover"),
    @NamedQuery(name = "Traces.findByIsShutdown", query = "SELECT t FROM Traces t WHERE t.isShutdown = :isShutdown"),
    @NamedQuery(name = "Traces.findByIsDefault", query = "SELECT t FROM Traces t WHERE t.isDefault = :isDefault"),
    @NamedQuery(name = "Traces.findByBufferCount", query = "SELECT t FROM Traces t WHERE t.bufferCount = :bufferCount"),
    @NamedQuery(name = "Traces.findByBufferSize", query = "SELECT t FROM Traces t WHERE t.bufferSize = :bufferSize"),
    @NamedQuery(name = "Traces.findByFilePosition", query = "SELECT t FROM Traces t WHERE t.filePosition = :filePosition"),
    @NamedQuery(name = "Traces.findByReaderSpid", query = "SELECT t FROM Traces t WHERE t.readerSpid = :readerSpid"),
    @NamedQuery(name = "Traces.findByStartTime", query = "SELECT t FROM Traces t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "Traces.findByLastEventTime", query = "SELECT t FROM Traces t WHERE t.lastEventTime = :lastEventTime"),
    @NamedQuery(name = "Traces.findByEventCount", query = "SELECT t FROM Traces t WHERE t.eventCount = :eventCount"),
    @NamedQuery(name = "Traces.findByDroppedEventCount", query = "SELECT t FROM Traces t WHERE t.droppedEventCount = :droppedEventCount")})
public class Traces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Size(max = 260)
    @Column(name = "path")
    private String path;
    @Column(name = "max_size")
    private BigInteger maxSize;
    @Column(name = "stop_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stopTime;
    @Column(name = "max_files")
    private Integer maxFiles;
    @Column(name = "is_rowset")
    private Boolean isRowset;
    @Column(name = "is_rollover")
    private Boolean isRollover;
    @Column(name = "is_shutdown")
    private Boolean isShutdown;
    @Column(name = "is_default")
    private Boolean isDefault;
    @Column(name = "buffer_count")
    private Integer bufferCount;
    @Column(name = "buffer_size")
    private Integer bufferSize;
    @Column(name = "file_position")
    private BigInteger filePosition;
    @Column(name = "reader_spid")
    private Integer readerSpid;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "last_event_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEventTime;
    @Column(name = "event_count")
    private BigInteger eventCount;
    @Column(name = "dropped_event_count")
    private Integer droppedEventCount;

    public Traces() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigInteger getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(BigInteger maxSize) {
        this.maxSize = maxSize;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Integer getMaxFiles() {
        return maxFiles;
    }

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }

    public Boolean getIsRowset() {
        return isRowset;
    }

    public void setIsRowset(Boolean isRowset) {
        this.isRowset = isRowset;
    }

    public Boolean getIsRollover() {
        return isRollover;
    }

    public void setIsRollover(Boolean isRollover) {
        this.isRollover = isRollover;
    }

    public Boolean getIsShutdown() {
        return isShutdown;
    }

    public void setIsShutdown(Boolean isShutdown) {
        this.isShutdown = isShutdown;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getBufferCount() {
        return bufferCount;
    }

    public void setBufferCount(Integer bufferCount) {
        this.bufferCount = bufferCount;
    }

    public Integer getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }

    public BigInteger getFilePosition() {
        return filePosition;
    }

    public void setFilePosition(BigInteger filePosition) {
        this.filePosition = filePosition;
    }

    public Integer getReaderSpid() {
        return readerSpid;
    }

    public void setReaderSpid(Integer readerSpid) {
        this.readerSpid = readerSpid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getLastEventTime() {
        return lastEventTime;
    }

    public void setLastEventTime(Date lastEventTime) {
        this.lastEventTime = lastEventTime;
    }

    public BigInteger getEventCount() {
        return eventCount;
    }

    public void setEventCount(BigInteger eventCount) {
        this.eventCount = eventCount;
    }

    public Integer getDroppedEventCount() {
        return droppedEventCount;
    }

    public void setDroppedEventCount(Integer droppedEventCount) {
        this.droppedEventCount = droppedEventCount;
    }
    
}
