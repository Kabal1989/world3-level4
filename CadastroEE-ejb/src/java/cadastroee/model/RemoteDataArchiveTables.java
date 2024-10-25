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
@Table(name = "remote_data_archive_tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RemoteDataArchiveTables.findAll", query = "SELECT r FROM RemoteDataArchiveTables r"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByObjectId", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.objectId = :objectId"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByRemoteDatabaseId", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.remoteDatabaseId = :remoteDatabaseId"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByRemoteTableName", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.remoteTableName = :remoteTableName"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByFilterPredicate", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.filterPredicate = :filterPredicate"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByMigrationDirection", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.migrationDirection = :migrationDirection"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByMigrationDirectionDesc", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.migrationDirectionDesc = :migrationDirectionDesc"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByIsMigrationPaused", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.isMigrationPaused = :isMigrationPaused"),
    @NamedQuery(name = "RemoteDataArchiveTables.findByIsReconciled", query = "SELECT r FROM RemoteDataArchiveTables r WHERE r.isReconciled = :isReconciled")})
public class RemoteDataArchiveTables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "remote_database_id")
    private int remoteDatabaseId;
    @Size(max = 128)
    @Column(name = "remote_table_name")
    private String remoteTableName;
    @Size(max = 2147483647)
    @Column(name = "filter_predicate")
    private String filterPredicate;
    @Column(name = "migration_direction")
    private Short migrationDirection;
    @Size(max = 60)
    @Column(name = "migration_direction_desc")
    private String migrationDirectionDesc;
    @Column(name = "is_migration_paused")
    private Boolean isMigrationPaused;
    @Column(name = "is_reconciled")
    private Boolean isReconciled;

    public RemoteDataArchiveTables() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getRemoteDatabaseId() {
        return remoteDatabaseId;
    }

    public void setRemoteDatabaseId(int remoteDatabaseId) {
        this.remoteDatabaseId = remoteDatabaseId;
    }

    public String getRemoteTableName() {
        return remoteTableName;
    }

    public void setRemoteTableName(String remoteTableName) {
        this.remoteTableName = remoteTableName;
    }

    public String getFilterPredicate() {
        return filterPredicate;
    }

    public void setFilterPredicate(String filterPredicate) {
        this.filterPredicate = filterPredicate;
    }

    public Short getMigrationDirection() {
        return migrationDirection;
    }

    public void setMigrationDirection(Short migrationDirection) {
        this.migrationDirection = migrationDirection;
    }

    public String getMigrationDirectionDesc() {
        return migrationDirectionDesc;
    }

    public void setMigrationDirectionDesc(String migrationDirectionDesc) {
        this.migrationDirectionDesc = migrationDirectionDesc;
    }

    public Boolean getIsMigrationPaused() {
        return isMigrationPaused;
    }

    public void setIsMigrationPaused(Boolean isMigrationPaused) {
        this.isMigrationPaused = isMigrationPaused;
    }

    public Boolean getIsReconciled() {
        return isReconciled;
    }

    public void setIsReconciled(Boolean isReconciled) {
        this.isReconciled = isReconciled;
    }
    
}
