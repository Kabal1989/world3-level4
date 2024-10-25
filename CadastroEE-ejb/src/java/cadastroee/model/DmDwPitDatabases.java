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
@Table(name = "dm_dw_pit_databases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwPitDatabases.findAll", query = "SELECT d FROM DmDwPitDatabases d"),
    @NamedQuery(name = "DmDwPitDatabases.findByLogicalDatabaseId", query = "SELECT d FROM DmDwPitDatabases d WHERE d.logicalDatabaseId = :logicalDatabaseId"),
    @NamedQuery(name = "DmDwPitDatabases.findBySqlDbId", query = "SELECT d FROM DmDwPitDatabases d WHERE d.sqlDbId = :sqlDbId"),
    @NamedQuery(name = "DmDwPitDatabases.findByPitKey", query = "SELECT d FROM DmDwPitDatabases d WHERE d.pitKey = :pitKey"),
    @NamedQuery(name = "DmDwPitDatabases.findByPitDbName", query = "SELECT d FROM DmDwPitDatabases d WHERE d.pitDbName = :pitDbName"),
    @NamedQuery(name = "DmDwPitDatabases.findByDatabaseType", query = "SELECT d FROM DmDwPitDatabases d WHERE d.databaseType = :databaseType")})
public class DmDwPitDatabases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "logical_database_id")
    private String logicalDatabaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sql_db_id")
    private short sqlDbId;
    @Size(max = 4000)
    @Column(name = "pit_key")
    private String pitKey;
    @Size(max = 129)
    @Column(name = "pit_db_name")
    private String pitDbName;
    @Size(max = 100)
    @Column(name = "database_type")
    private String databaseType;

    public DmDwPitDatabases() {
    }

    public String getLogicalDatabaseId() {
        return logicalDatabaseId;
    }

    public void setLogicalDatabaseId(String logicalDatabaseId) {
        this.logicalDatabaseId = logicalDatabaseId;
    }

    public short getSqlDbId() {
        return sqlDbId;
    }

    public void setSqlDbId(short sqlDbId) {
        this.sqlDbId = sqlDbId;
    }

    public String getPitKey() {
        return pitKey;
    }

    public void setPitKey(String pitKey) {
        this.pitKey = pitKey;
    }

    public String getPitDbName() {
        return pitDbName;
    }

    public void setPitDbName(String pitDbName) {
        this.pitDbName = pitDbName;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }
    
}
