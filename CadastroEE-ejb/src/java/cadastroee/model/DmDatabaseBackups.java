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
@Table(name = "dm_database_backups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDatabaseBackups.findAll", query = "SELECT d FROM DmDatabaseBackups d"),
    @NamedQuery(name = "DmDatabaseBackups.findByBackupFileId", query = "SELECT d FROM DmDatabaseBackups d WHERE d.backupFileId = :backupFileId"),
    @NamedQuery(name = "DmDatabaseBackups.findByDatabaseGuid", query = "SELECT d FROM DmDatabaseBackups d WHERE d.databaseGuid = :databaseGuid"),
    @NamedQuery(name = "DmDatabaseBackups.findByPhysicalDatabaseName", query = "SELECT d FROM DmDatabaseBackups d WHERE d.physicalDatabaseName = :physicalDatabaseName"),
    @NamedQuery(name = "DmDatabaseBackups.findByPhysicalServerName", query = "SELECT d FROM DmDatabaseBackups d WHERE d.physicalServerName = :physicalServerName"),
    @NamedQuery(name = "DmDatabaseBackups.findByBackupStartDate", query = "SELECT d FROM DmDatabaseBackups d WHERE d.backupStartDate = :backupStartDate"),
    @NamedQuery(name = "DmDatabaseBackups.findByBackupFinishDate", query = "SELECT d FROM DmDatabaseBackups d WHERE d.backupFinishDate = :backupFinishDate"),
    @NamedQuery(name = "DmDatabaseBackups.findByBackupType", query = "SELECT d FROM DmDatabaseBackups d WHERE d.backupType = :backupType"),
    @NamedQuery(name = "DmDatabaseBackups.findByInRetention", query = "SELECT d FROM DmDatabaseBackups d WHERE d.inRetention = :inRetention")})
public class DmDatabaseBackups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "backup_file_id")
    private String backupFileId;
    @Size(max = 36)
    @Column(name = "database_guid")
    private String databaseGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "physical_database_name")
    private String physicalDatabaseName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "physical_server_name")
    private String physicalServerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "backup_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date backupStartDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "backup_finish_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date backupFinishDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "backup_type")
    private Character backupType;
    @Column(name = "in_retention")
    private Boolean inRetention;

    public DmDatabaseBackups() {
    }

    public String getBackupFileId() {
        return backupFileId;
    }

    public void setBackupFileId(String backupFileId) {
        this.backupFileId = backupFileId;
    }

    public String getDatabaseGuid() {
        return databaseGuid;
    }

    public void setDatabaseGuid(String databaseGuid) {
        this.databaseGuid = databaseGuid;
    }

    public String getPhysicalDatabaseName() {
        return physicalDatabaseName;
    }

    public void setPhysicalDatabaseName(String physicalDatabaseName) {
        this.physicalDatabaseName = physicalDatabaseName;
    }

    public String getPhysicalServerName() {
        return physicalServerName;
    }

    public void setPhysicalServerName(String physicalServerName) {
        this.physicalServerName = physicalServerName;
    }

    public Date getBackupStartDate() {
        return backupStartDate;
    }

    public void setBackupStartDate(Date backupStartDate) {
        this.backupStartDate = backupStartDate;
    }

    public Date getBackupFinishDate() {
        return backupFinishDate;
    }

    public void setBackupFinishDate(Date backupFinishDate) {
        this.backupFinishDate = backupFinishDate;
    }

    public Character getBackupType() {
        return backupType;
    }

    public void setBackupType(Character backupType) {
        this.backupType = backupType;
    }

    public Boolean getInRetention() {
        return inRetention;
    }

    public void setInRetention(Boolean inRetention) {
        this.inRetention = inRetention;
    }
    
}
