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
@Table(name = "dm_dw_databases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwDatabases.findAll", query = "SELECT d FROM DmDwDatabases d"),
    @NamedQuery(name = "DmDwDatabases.findByLogicalDatabaseId", query = "SELECT d FROM DmDwDatabases d WHERE d.logicalDatabaseId = :logicalDatabaseId"),
    @NamedQuery(name = "DmDwDatabases.findByLogicalDbName", query = "SELECT d FROM DmDwDatabases d WHERE d.logicalDbName = :logicalDbName"),
    @NamedQuery(name = "DmDwDatabases.findByDatabaseType", query = "SELECT d FROM DmDwDatabases d WHERE d.databaseType = :databaseType"),
    @NamedQuery(name = "DmDwDatabases.findBySyncPoint", query = "SELECT d FROM DmDwDatabases d WHERE d.syncPoint = :syncPoint")})
public class DmDwDatabases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "logical_database_id")
    private String logicalDatabaseId;
    @Size(max = 129)
    @Column(name = "logical_db_name")
    private String logicalDbName;
    @Size(max = 100)
    @Column(name = "database_type")
    private String databaseType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sync_point")
    private long syncPoint;

    public DmDwDatabases() {
    }

    public String getLogicalDatabaseId() {
        return logicalDatabaseId;
    }

    public void setLogicalDatabaseId(String logicalDatabaseId) {
        this.logicalDatabaseId = logicalDatabaseId;
    }

    public String getLogicalDbName() {
        return logicalDbName;
    }

    public void setLogicalDbName(String logicalDbName) {
        this.logicalDbName = logicalDbName;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public long getSyncPoint() {
        return syncPoint;
    }

    public void setSyncPoint(long syncPoint) {
        this.syncPoint = syncPoint;
    }
    
}
