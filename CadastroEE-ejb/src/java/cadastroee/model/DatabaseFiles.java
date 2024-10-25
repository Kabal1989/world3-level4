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
@Table(name = "database_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseFiles.findAll", query = "SELECT d FROM DatabaseFiles d"),
    @NamedQuery(name = "DatabaseFiles.findByFileId", query = "SELECT d FROM DatabaseFiles d WHERE d.fileId = :fileId"),
    @NamedQuery(name = "DatabaseFiles.findByFileGuid", query = "SELECT d FROM DatabaseFiles d WHERE d.fileGuid = :fileGuid"),
    @NamedQuery(name = "DatabaseFiles.findByType", query = "SELECT d FROM DatabaseFiles d WHERE d.type = :type"),
    @NamedQuery(name = "DatabaseFiles.findByTypeDesc", query = "SELECT d FROM DatabaseFiles d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DatabaseFiles.findByDataSpaceId", query = "SELECT d FROM DatabaseFiles d WHERE d.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "DatabaseFiles.findByName", query = "SELECT d FROM DatabaseFiles d WHERE d.name = :name"),
    @NamedQuery(name = "DatabaseFiles.findByPhysicalName", query = "SELECT d FROM DatabaseFiles d WHERE d.physicalName = :physicalName"),
    @NamedQuery(name = "DatabaseFiles.findByState", query = "SELECT d FROM DatabaseFiles d WHERE d.state = :state"),
    @NamedQuery(name = "DatabaseFiles.findByStateDesc", query = "SELECT d FROM DatabaseFiles d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DatabaseFiles.findBySize", query = "SELECT d FROM DatabaseFiles d WHERE d.size = :size"),
    @NamedQuery(name = "DatabaseFiles.findByMaxSize", query = "SELECT d FROM DatabaseFiles d WHERE d.maxSize = :maxSize"),
    @NamedQuery(name = "DatabaseFiles.findByGrowth", query = "SELECT d FROM DatabaseFiles d WHERE d.growth = :growth"),
    @NamedQuery(name = "DatabaseFiles.findByIsMediaReadOnly", query = "SELECT d FROM DatabaseFiles d WHERE d.isMediaReadOnly = :isMediaReadOnly"),
    @NamedQuery(name = "DatabaseFiles.findByIsReadOnly", query = "SELECT d FROM DatabaseFiles d WHERE d.isReadOnly = :isReadOnly"),
    @NamedQuery(name = "DatabaseFiles.findByIsSparse", query = "SELECT d FROM DatabaseFiles d WHERE d.isSparse = :isSparse"),
    @NamedQuery(name = "DatabaseFiles.findByIsPercentGrowth", query = "SELECT d FROM DatabaseFiles d WHERE d.isPercentGrowth = :isPercentGrowth"),
    @NamedQuery(name = "DatabaseFiles.findByIsNameReserved", query = "SELECT d FROM DatabaseFiles d WHERE d.isNameReserved = :isNameReserved"),
    @NamedQuery(name = "DatabaseFiles.findByIsPersistentLogBuffer", query = "SELECT d FROM DatabaseFiles d WHERE d.isPersistentLogBuffer = :isPersistentLogBuffer"),
    @NamedQuery(name = "DatabaseFiles.findByCreateLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.createLsn = :createLsn"),
    @NamedQuery(name = "DatabaseFiles.findByDropLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.dropLsn = :dropLsn"),
    @NamedQuery(name = "DatabaseFiles.findByReadOnlyLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.readOnlyLsn = :readOnlyLsn"),
    @NamedQuery(name = "DatabaseFiles.findByReadWriteLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.readWriteLsn = :readWriteLsn"),
    @NamedQuery(name = "DatabaseFiles.findByDifferentialBaseLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.differentialBaseLsn = :differentialBaseLsn"),
    @NamedQuery(name = "DatabaseFiles.findByDifferentialBaseGuid", query = "SELECT d FROM DatabaseFiles d WHERE d.differentialBaseGuid = :differentialBaseGuid"),
    @NamedQuery(name = "DatabaseFiles.findByDifferentialBaseTime", query = "SELECT d FROM DatabaseFiles d WHERE d.differentialBaseTime = :differentialBaseTime"),
    @NamedQuery(name = "DatabaseFiles.findByRedoStartLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.redoStartLsn = :redoStartLsn"),
    @NamedQuery(name = "DatabaseFiles.findByRedoStartForkGuid", query = "SELECT d FROM DatabaseFiles d WHERE d.redoStartForkGuid = :redoStartForkGuid"),
    @NamedQuery(name = "DatabaseFiles.findByRedoTargetLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.redoTargetLsn = :redoTargetLsn"),
    @NamedQuery(name = "DatabaseFiles.findByRedoTargetForkGuid", query = "SELECT d FROM DatabaseFiles d WHERE d.redoTargetForkGuid = :redoTargetForkGuid"),
    @NamedQuery(name = "DatabaseFiles.findByBackupLsn", query = "SELECT d FROM DatabaseFiles d WHERE d.backupLsn = :backupLsn")})
public class DatabaseFiles implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Size(max = 260)
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

    public DatabaseFiles() {
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
    
}
