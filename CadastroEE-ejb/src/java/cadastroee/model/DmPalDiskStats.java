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
@Table(name = "dm_pal_disk_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalDiskStats.findAll", query = "SELECT d FROM DmPalDiskStats d"),
    @NamedQuery(name = "DmPalDiskStats.findByDevName", query = "SELECT d FROM DmPalDiskStats d WHERE d.devName = :devName"),
    @NamedQuery(name = "DmPalDiskStats.findByMajorNum", query = "SELECT d FROM DmPalDiskStats d WHERE d.majorNum = :majorNum"),
    @NamedQuery(name = "DmPalDiskStats.findByMinorNum", query = "SELECT d FROM DmPalDiskStats d WHERE d.minorNum = :minorNum"),
    @NamedQuery(name = "DmPalDiskStats.findByReadsCompleted", query = "SELECT d FROM DmPalDiskStats d WHERE d.readsCompleted = :readsCompleted"),
    @NamedQuery(name = "DmPalDiskStats.findByReadsMerged", query = "SELECT d FROM DmPalDiskStats d WHERE d.readsMerged = :readsMerged"),
    @NamedQuery(name = "DmPalDiskStats.findBySectorsRead", query = "SELECT d FROM DmPalDiskStats d WHERE d.sectorsRead = :sectorsRead"),
    @NamedQuery(name = "DmPalDiskStats.findByReadTimeMs", query = "SELECT d FROM DmPalDiskStats d WHERE d.readTimeMs = :readTimeMs"),
    @NamedQuery(name = "DmPalDiskStats.findByWritesCompleted", query = "SELECT d FROM DmPalDiskStats d WHERE d.writesCompleted = :writesCompleted"),
    @NamedQuery(name = "DmPalDiskStats.findByWritesMerged", query = "SELECT d FROM DmPalDiskStats d WHERE d.writesMerged = :writesMerged"),
    @NamedQuery(name = "DmPalDiskStats.findBySectorsWritten", query = "SELECT d FROM DmPalDiskStats d WHERE d.sectorsWritten = :sectorsWritten"),
    @NamedQuery(name = "DmPalDiskStats.findByWriteTimeMs", query = "SELECT d FROM DmPalDiskStats d WHERE d.writeTimeMs = :writeTimeMs"),
    @NamedQuery(name = "DmPalDiskStats.findByIosInProgess", query = "SELECT d FROM DmPalDiskStats d WHERE d.iosInProgess = :iosInProgess"),
    @NamedQuery(name = "DmPalDiskStats.findByIoTimeMs", query = "SELECT d FROM DmPalDiskStats d WHERE d.ioTimeMs = :ioTimeMs"),
    @NamedQuery(name = "DmPalDiskStats.findByWeightedIoTimeMs", query = "SELECT d FROM DmPalDiskStats d WHERE d.weightedIoTimeMs = :weightedIoTimeMs")})
public class DmPalDiskStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "dev_name")
    private String devName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "major_num")
    private long majorNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minor_num")
    private long minorNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reads_completed")
    private long readsCompleted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reads_merged")
    private long readsMerged;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sectors_read")
    private long sectorsRead;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_time_ms")
    private long readTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "writes_completed")
    private long writesCompleted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "writes_merged")
    private long writesMerged;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sectors_written")
    private long sectorsWritten;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_time_ms")
    private long writeTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ios_in_progess")
    private long iosInProgess;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_time_ms")
    private long ioTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weighted_io_time_ms")
    private long weightedIoTimeMs;

    public DmPalDiskStats() {
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public long getMajorNum() {
        return majorNum;
    }

    public void setMajorNum(long majorNum) {
        this.majorNum = majorNum;
    }

    public long getMinorNum() {
        return minorNum;
    }

    public void setMinorNum(long minorNum) {
        this.minorNum = minorNum;
    }

    public long getReadsCompleted() {
        return readsCompleted;
    }

    public void setReadsCompleted(long readsCompleted) {
        this.readsCompleted = readsCompleted;
    }

    public long getReadsMerged() {
        return readsMerged;
    }

    public void setReadsMerged(long readsMerged) {
        this.readsMerged = readsMerged;
    }

    public long getSectorsRead() {
        return sectorsRead;
    }

    public void setSectorsRead(long sectorsRead) {
        this.sectorsRead = sectorsRead;
    }

    public long getReadTimeMs() {
        return readTimeMs;
    }

    public void setReadTimeMs(long readTimeMs) {
        this.readTimeMs = readTimeMs;
    }

    public long getWritesCompleted() {
        return writesCompleted;
    }

    public void setWritesCompleted(long writesCompleted) {
        this.writesCompleted = writesCompleted;
    }

    public long getWritesMerged() {
        return writesMerged;
    }

    public void setWritesMerged(long writesMerged) {
        this.writesMerged = writesMerged;
    }

    public long getSectorsWritten() {
        return sectorsWritten;
    }

    public void setSectorsWritten(long sectorsWritten) {
        this.sectorsWritten = sectorsWritten;
    }

    public long getWriteTimeMs() {
        return writeTimeMs;
    }

    public void setWriteTimeMs(long writeTimeMs) {
        this.writeTimeMs = writeTimeMs;
    }

    public long getIosInProgess() {
        return iosInProgess;
    }

    public void setIosInProgess(long iosInProgess) {
        this.iosInProgess = iosInProgess;
    }

    public long getIoTimeMs() {
        return ioTimeMs;
    }

    public void setIoTimeMs(long ioTimeMs) {
        this.ioTimeMs = ioTimeMs;
    }

    public long getWeightedIoTimeMs() {
        return weightedIoTimeMs;
    }

    public void setWeightedIoTimeMs(long weightedIoTimeMs) {
        this.weightedIoTimeMs = weightedIoTimeMs;
    }
    
}
