/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_db_xtp_checkpoint_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findAll", query = "SELECT d FROM DmDbXtpCheckpointFiles d"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByContainerId", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.containerId = :containerId"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByContainerGuid", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.containerGuid = :containerGuid"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByCheckpointFileId", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.checkpointFileId = :checkpointFileId"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByRelativeFilePath", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.relativeFilePath = :relativeFilePath"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByFileType", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.fileType = :fileType"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByFileTypeDesc", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.fileTypeDesc = :fileTypeDesc"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByInternalStorageSlot", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.internalStorageSlot = :internalStorageSlot"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByCheckpointPairFileId", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.checkpointPairFileId = :checkpointPairFileId"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByFileSizeInBytes", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.fileSizeInBytes = :fileSizeInBytes"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByFileSizeUsedInBytes", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.fileSizeUsedInBytes = :fileSizeUsedInBytes"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByLogicalRowCount", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.logicalRowCount = :logicalRowCount"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByState", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByStateDesc", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByLowerBoundTsn", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.lowerBoundTsn = :lowerBoundTsn"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByUpperBoundTsn", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.upperBoundTsn = :upperBoundTsn"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByBeginCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.beginCheckpointId = :beginCheckpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByEndCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.endCheckpointId = :endCheckpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByLastUpdatedCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.lastUpdatedCheckpointId = :lastUpdatedCheckpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByEncryptionStatus", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.encryptionStatus = :encryptionStatus"),
    @NamedQuery(name = "DmDbXtpCheckpointFiles.findByEncryptionStatusDesc", query = "SELECT d FROM DmDbXtpCheckpointFiles d WHERE d.encryptionStatusDesc = :encryptionStatusDesc")})
public class DmDbXtpCheckpointFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "container_id")
    private int containerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "container_guid")
    private String containerGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "checkpoint_file_id")
    private String checkpointFileId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "relative_file_path")
    private String relativeFilePath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_type")
    private short fileType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "file_type_desc")
    private String fileTypeDesc;
    @Column(name = "internal_storage_slot")
    private Integer internalStorageSlot;
    @Size(max = 36)
    @Column(name = "checkpoint_pair_file_id")
    private String checkpointPairFileId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_size_in_bytes")
    private long fileSizeInBytes;
    @Column(name = "file_size_used_in_bytes")
    private BigInteger fileSizeUsedInBytes;
    @Column(name = "logical_row_count")
    private BigInteger logicalRowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private short state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Column(name = "lower_bound_tsn")
    private BigInteger lowerBoundTsn;
    @Column(name = "upper_bound_tsn")
    private BigInteger upperBoundTsn;
    @Column(name = "begin_checkpoint_id")
    private BigInteger beginCheckpointId;
    @Column(name = "end_checkpoint_id")
    private BigInteger endCheckpointId;
    @Column(name = "last_updated_checkpoint_id")
    private BigInteger lastUpdatedCheckpointId;
    @Column(name = "encryption_status")
    private Short encryptionStatus;
    @Size(max = 60)
    @Column(name = "encryption_status_desc")
    private String encryptionStatusDesc;

    public DmDbXtpCheckpointFiles() {
    }

    public int getContainerId() {
        return containerId;
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

    public String getContainerGuid() {
        return containerGuid;
    }

    public void setContainerGuid(String containerGuid) {
        this.containerGuid = containerGuid;
    }

    public String getCheckpointFileId() {
        return checkpointFileId;
    }

    public void setCheckpointFileId(String checkpointFileId) {
        this.checkpointFileId = checkpointFileId;
    }

    public String getRelativeFilePath() {
        return relativeFilePath;
    }

    public void setRelativeFilePath(String relativeFilePath) {
        this.relativeFilePath = relativeFilePath;
    }

    public short getFileType() {
        return fileType;
    }

    public void setFileType(short fileType) {
        this.fileType = fileType;
    }

    public String getFileTypeDesc() {
        return fileTypeDesc;
    }

    public void setFileTypeDesc(String fileTypeDesc) {
        this.fileTypeDesc = fileTypeDesc;
    }

    public Integer getInternalStorageSlot() {
        return internalStorageSlot;
    }

    public void setInternalStorageSlot(Integer internalStorageSlot) {
        this.internalStorageSlot = internalStorageSlot;
    }

    public String getCheckpointPairFileId() {
        return checkpointPairFileId;
    }

    public void setCheckpointPairFileId(String checkpointPairFileId) {
        this.checkpointPairFileId = checkpointPairFileId;
    }

    public long getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    public void setFileSizeInBytes(long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public BigInteger getFileSizeUsedInBytes() {
        return fileSizeUsedInBytes;
    }

    public void setFileSizeUsedInBytes(BigInteger fileSizeUsedInBytes) {
        this.fileSizeUsedInBytes = fileSizeUsedInBytes;
    }

    public BigInteger getLogicalRowCount() {
        return logicalRowCount;
    }

    public void setLogicalRowCount(BigInteger logicalRowCount) {
        this.logicalRowCount = logicalRowCount;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public BigInteger getLowerBoundTsn() {
        return lowerBoundTsn;
    }

    public void setLowerBoundTsn(BigInteger lowerBoundTsn) {
        this.lowerBoundTsn = lowerBoundTsn;
    }

    public BigInteger getUpperBoundTsn() {
        return upperBoundTsn;
    }

    public void setUpperBoundTsn(BigInteger upperBoundTsn) {
        this.upperBoundTsn = upperBoundTsn;
    }

    public BigInteger getBeginCheckpointId() {
        return beginCheckpointId;
    }

    public void setBeginCheckpointId(BigInteger beginCheckpointId) {
        this.beginCheckpointId = beginCheckpointId;
    }

    public BigInteger getEndCheckpointId() {
        return endCheckpointId;
    }

    public void setEndCheckpointId(BigInteger endCheckpointId) {
        this.endCheckpointId = endCheckpointId;
    }

    public BigInteger getLastUpdatedCheckpointId() {
        return lastUpdatedCheckpointId;
    }

    public void setLastUpdatedCheckpointId(BigInteger lastUpdatedCheckpointId) {
        this.lastUpdatedCheckpointId = lastUpdatedCheckpointId;
    }

    public Short getEncryptionStatus() {
        return encryptionStatus;
    }

    public void setEncryptionStatus(Short encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
    }

    public String getEncryptionStatusDesc() {
        return encryptionStatusDesc;
    }

    public void setEncryptionStatusDesc(String encryptionStatusDesc) {
        this.encryptionStatusDesc = encryptionStatusDesc;
    }
    
}
