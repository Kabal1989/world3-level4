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
@Table(name = "dm_xe_session_targets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXeSessionTargets.findAll", query = "SELECT d FROM DmXeSessionTargets d"),
    @NamedQuery(name = "DmXeSessionTargets.findByTargetName", query = "SELECT d FROM DmXeSessionTargets d WHERE d.targetName = :targetName"),
    @NamedQuery(name = "DmXeSessionTargets.findByTargetPackageGuid", query = "SELECT d FROM DmXeSessionTargets d WHERE d.targetPackageGuid = :targetPackageGuid"),
    @NamedQuery(name = "DmXeSessionTargets.findByExecutionCount", query = "SELECT d FROM DmXeSessionTargets d WHERE d.executionCount = :executionCount"),
    @NamedQuery(name = "DmXeSessionTargets.findByExecutionDurationMs", query = "SELECT d FROM DmXeSessionTargets d WHERE d.executionDurationMs = :executionDurationMs"),
    @NamedQuery(name = "DmXeSessionTargets.findByTargetData", query = "SELECT d FROM DmXeSessionTargets d WHERE d.targetData = :targetData"),
    @NamedQuery(name = "DmXeSessionTargets.findByBytesWritten", query = "SELECT d FROM DmXeSessionTargets d WHERE d.bytesWritten = :bytesWritten")})
public class DmXeSessionTargets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "event_session_address")
    private byte[] eventSessionAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "target_name")
    private String targetName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "target_package_guid")
    private String targetPackageGuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "execution_count")
    private long executionCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "execution_duration_ms")
    private long executionDurationMs;
    @Size(max = 2147483647)
    @Column(name = "target_data")
    private String targetData;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bytes_written")
    private long bytesWritten;

    public DmXeSessionTargets() {
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetPackageGuid() {
        return targetPackageGuid;
    }

    public void setTargetPackageGuid(String targetPackageGuid) {
        this.targetPackageGuid = targetPackageGuid;
    }

    public long getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(long executionCount) {
        this.executionCount = executionCount;
    }

    public long getExecutionDurationMs() {
        return executionDurationMs;
    }

    public void setExecutionDurationMs(long executionDurationMs) {
        this.executionDurationMs = executionDurationMs;
    }

    public String getTargetData() {
        return targetData;
    }

    public void setTargetData(String targetData) {
        this.targetData = targetData;
    }

    public long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }
    
}
