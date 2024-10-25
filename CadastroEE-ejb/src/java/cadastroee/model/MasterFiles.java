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
@Table(name = "master_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterFiles.findAll", query = "SELECT m FROM MasterFiles m"),
    @NamedQuery(name = "MasterFiles.findByDatabaseId", query = "SELECT m FROM MasterFiles m WHERE m.databaseId = :databaseId"),
    @NamedQuery(name = "MasterFiles.findByFileId", query = "SELECT m FROM MasterFiles m WHERE m.fileId = :fileId"),
    @NamedQuery(name = "MasterFiles.findByFileGuid", query = "SELECT m FROM MasterFiles m WHERE m.fileGuid = :fileGuid"),
    @NamedQuery(name = "MasterFiles.findByType", query = "SELECT m FROM MasterFiles m WHERE m.type = :type"),
    @NamedQuery(name = "MasterFiles.findByTypeDesc", query = "SELECT m FROM MasterFiles m WHERE m.typeDesc = :typeDesc"),
    @NamedQuery(name = "MasterFiles.findByDataSpaceId", query = "SELECT m FROM MasterFiles m WHERE m.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "MasterFiles.findByName", query = "SELECT m FROM MasterFiles m WHERE m.name = :name"),
    @NamedQuery(name = "MasterFiles.findByPhysicalName", query = "SELECT m FROM MasterFiles m WHERE m.physicalName = :physicalName"),
    @NamedQuery(name = "MasterFiles.findByState", query = "SELECT m FROM MasterFiles m WHERE m.state = :state"),
    @NamedQuery(name = "MasterFiles.findByStateDesc", query = "SELECT m FROM MasterFiles m WHERE m.stateDesc = :stateDesc"),
    @NamedQuery(name = "MasterFiles.findBySize", query = "SELECT m FROM MasterFiles m WHERE m.size = :size"),
    @NamedQuery(name = "MasterFiles.findByMaxSize", query = "SELECT m FROM MasterFiles m WHERE m.maxSize = :maxSize"),
    @NamedQuery(name = "MasterFiles.findByGrowth", query = "SELECT m FROM MasterFiles m WHERE m.growth = :growth"),
    @NamedQuery(name = "MasterFiles.findByIsMediaReadOnly", query = "SELECT m FROM MasterFiles m WHERE m.isMediaReadOnly = :isMediaReadOnly"),
    @NamedQuery(name = "MasterFiles.findByIsReadOnly", query = "SELECT m FROM MasterFiles m WHERE m.isReadOnly = :isReadOnly"),
    @NamedQuery(name = "MasterFiles.findByIsSparse", query = "SELECT m FROM MasterFiles m WHERE m.isSparse = :isSparse"),
    @NamedQuery(name = "MasterFiles.findByIsPercentGrowth", query = "SELECT m FROM MasterFiles m WHERE m.isPercentGrowth = :isPercentGrowth"),
    @NamedQuery(name = "MasterFiles.findByIsNameReserved", query = "SELECT m FROM MasterFiles m WHERE m.isNameReserved = :isNameReserved"),
    @NamedQuery(name = "MasterFiles.findByIsPersistentLogBuffer", query = "SELECT m FROM MasterFiles m WHERE m.isPersistentLogBuffer = :isPersistentLogBuffer"),
    @NamedQuery(name = "MasterFiles.findByCreateLsn", query = "SELECT m FROM MasterFiles m WHERE m.createLsn = :createLsn"),
    @NamedQuery(name = "MasterFiles.findByDropLsn", query = "SELECT m FROM MasterFiles m WHERE m.dropLsn = :dropLsn"),
    @NamedQuery(name = "MasterFiles.findByReadOnlyLsn", query = "SELECT m FROM MasterFiles m WHERE m.readOnlyLsn = :readOnlyLsn"),
    @NamedQuery(name = "MasterFiles.findByReadWriteLsn", query = "SELECT m FROM MasterFiles m WHERE m.readWriteLsn = :readWriteLsn"),
    @NamedQuery(name = "MasterFiles.findByDifferentialBaseLsn", query = "SELECT m FROM MasterFiles m WHERE m.differentialBaseLsn = :differentialBaseLsn"),
    @NamedQuery(name = "MasterFiles.findByDifferentialBaseGuid", query = "SELECT m FROM MasterFiles m WHERE m.differentialBaseGuid = :differentialBaseGuid"),
    @NamedQuery(name = "MasterFiles.findByDifferentialBaseTime", query = "SELECT m FROM MasterFiles m WHERE m.differentialBaseTime = :differentialBaseTime"),
    @NamedQuery(name = "MasterFiles.findByRedoStartLsn", query = "SELECT m FROM MasterFiles m WHERE m.redoStartLsn = :redoStartLsn"),
    @NamedQuery(name = "MasterFiles.findByRedoStartForkGuid", query = "SELECT m FROM MasterFiles m WHERE m.redoStartForkGuid = :redoStartForkGuid"),
    @NamedQuery(name = "MasterFiles.findByRedoTargetLsn", query = "SELECT m FROM MasterFiles m WHERE m.redoTargetLsn = :redoTargetLsn"),
    @NamedQuery(name = "MasterFiles.findByRedoTargetForkGuid", query = "SELECT m FROM MasterFiles m WHERE m.redoTargetForkGuid = :redoTargetForkGuid"),
    @NamedQuery(name = "MasterFiles.findByBackupLsn", query = "SELECT m FROM MasterFiles m WHERE m.backupLsn = :backupLsn"),
    @NamedQuery(name = "MasterFiles.findByCredentialId", query = "SELECT m FROM MasterFiles m WHERE m.credentialId = :credentialId")})
public class MasterFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_id")
    private int fileId;
    @Size(max = 36)
    @Column(name = "file_guid")
    private String fileGuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "physical_name")
    private String physicalName;
    @Column(name = "state")
    private Short state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size")
    private int size;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_size")
    private int maxSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "growth")
    private int growth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_media_read_only")
    private boolean isMediaReadOnly;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_read_only")
    private boolean isReadOnly;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sparse")
    private boolean isSparse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_percent_growth")
    private boolean isPercentGrowth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_name_reserved")
    private boolean isNameReserved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_persistent_log_buffer")
    private boolean isPersistentLogBuffer;
    @Column(name = "create_lsn")
    private BigInteger createLsn;
    @Column(name = "drop_lsn")
    private BigInteger dropLsn;
    @Column(name = "read_only_lsn")
    private BigInteger readOnlyLsn;
    @Column(name = "read_write_lsn")
    private BigInteger readWriteLsn;
    @Column(name = "differential_base_lsn")
    private BigInteger differentialBaseLsn;
    @Size(max = 36)
    @Column(name = "differential_base_guid")
    private String differentialBaseGuid;
    @Column(name = "differential_base_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date differentialBaseTime;
    @Column(name = "redo_start_lsn")
    private BigInteger redoStartLsn;
    @Size(max = 36)
    @Column(name = "redo_start_fork_guid")
    private String redoStartForkGuid;
    @Column(name = "redo_target_lsn")
    private BigInteger redoTargetLsn;
    @Size(max = 36)
    @Column(name = "redo_target_fork_guid")
    private String redoTargetForkGuid;
    @Column(name = "backup_lsn")
    private BigInteger backupLsn;
    @Column(name = "credential_id")
    private Integer credentialId;

    public MasterFiles() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getFileGuid() {
        return fileGuid;
    }

    public void setFileGuid(String fileGuid) {
        this.fileGuid = fileGuid;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public boolean getIsMediaReadOnly() {
        return isMediaReadOnly;
    }

    public void setIsMediaReadOnly(boolean isMediaReadOnly) {
        this.isMediaReadOnly = isMediaReadOnly;
    }

    public boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(boolean isSparse) {
        this.isSparse = isSparse;
    }

    public boolean getIsPercentGrowth() {
        return isPercentGrowth;
    }

    public void setIsPercentGrowth(boolean isPercentGrowth) {
        this.isPercentGrowth = isPercentGrowth;
    }

    public boolean getIsNameReserved() {
        return isNameReserved;
    }

    public void setIsNameReserved(boolean isNameReserved) {
        this.isNameReserved = isNameReserved;
    }

    public boolean getIsPersistentLogBuffer() {
        return isPersistentLogBuffer;
    }

    public void setIsPersistentLogBuffer(boolean isPersistentLogBuffer) {
        this.isPersistentLogBuffer = isPersistentLogBuffer;
    }

    public BigInteger getCreateLsn() {
        return createLsn;
    }

    public void setCreateLsn(BigInteger createLsn) {
        this.createLsn = createLsn;
    }

    public BigInteger getDropLsn() {
        return dropLsn;
    }

    public void setDropLsn(BigInteger dropLsn) {
        this.dropLsn = dropLsn;
    }

    public BigInteger getReadOnlyLsn() {
        return readOnlyLsn;
    }

    public void setReadOnlyLsn(BigInteger readOnlyLsn) {
        this.readOnlyLsn = readOnlyLsn;
    }

    public BigInteger getReadWriteLsn() {
        return readWriteLsn;
    }

    public void setReadWriteLsn(BigInteger readWriteLsn) {
        this.readWriteLsn = readWriteLsn;
    }

    public BigInteger getDifferentialBaseLsn() {
        return differentialBaseLsn;
    }

    public void setDifferentialBaseLsn(BigInteger differentialBaseLsn) {
        this.differentialBaseLsn = differentialBaseLsn;
    }

    public String getDifferentialBaseGuid() {
        return differentialBaseGuid;
    }

    public void setDifferentialBaseGuid(String differentialBaseGuid) {
        this.differentialBaseGuid = differentialBaseGuid;
    }

    public Date getDifferentialBaseTime() {
        return differentialBaseTime;
    }

    public void setDifferentialBaseTime(Date differentialBaseTime) {
        this.differentialBaseTime = differentialBaseTime;
    }

    public BigInteger getRedoStartLsn() {
        return redoStartLsn;
    }

    public void setRedoStartLsn(BigInteger redoStartLsn) {
        this.redoStartLsn = redoStartLsn;
    }

    public String getRedoStartForkGuid() {
        return redoStartForkGuid;
    }

    public void setRedoStartForkGuid(String redoStartForkGuid) {
        this.redoStartForkGuid = redoStartForkGuid;
    }

    public BigInteger getRedoTargetLsn() {
        return redoTargetLsn;
    }

    public void setRedoTargetLsn(BigInteger redoTargetLsn) {
        this.redoTargetLsn = redoTargetLsn;
    }

    public String getRedoTargetForkGuid() {
        return redoTargetForkGuid;
    }

    public void setRedoTargetForkGuid(String redoTargetForkGuid) {
        this.redoTargetForkGuid = redoTargetForkGuid;
    }

    public BigInteger getBackupLsn() {
        return backupLsn;
    }

    public void setBackupLsn(BigInteger backupLsn) {
        this.backupLsn = backupLsn;
    }

    public Integer getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }
    
}
