/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_rda_migration_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbRdaMigrationStatus.findAll", query = "SELECT d FROM DmDbRdaMigrationStatus d"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByTableId", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByDatabaseId", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByMigratedRows", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.migratedRows = :migratedRows"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByStartTimeUtc", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.startTimeUtc = :startTimeUtc"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByEndTimeUtc", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.endTimeUtc = :endTimeUtc"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByErrorNumber", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.errorNumber = :errorNumber"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByErrorSeverity", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.errorSeverity = :errorSeverity"),
    @NamedQuery(name = "DmDbRdaMigrationStatus.findByErrorState", query = "SELECT d FROM DmDbRdaMigrationStatus d WHERE d.errorState = :errorState")})
public class DmDbRdaMigrationStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_id")
    private Integer tableId;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "migrated_rows")
    private BigInteger migratedRows;
    @Column(name = "start_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTimeUtc;
    @Column(name = "end_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTimeUtc;
    @Column(name = "error_number")
    private Integer errorNumber;
    @Column(name = "error_severity")
    private Integer errorSeverity;
    @Column(name = "error_state")
    private Integer errorState;

    public DmDbRdaMigrationStatus() {
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getMigratedRows() {
        return migratedRows;
    }

    public void setMigratedRows(BigInteger migratedRows) {
        this.migratedRows = migratedRows;
    }

    public Date getStartTimeUtc() {
        return startTimeUtc;
    }

    public void setStartTimeUtc(Date startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public Date getEndTimeUtc() {
        return endTimeUtc;
    }

    public void setEndTimeUtc(Date endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
    }

    public Integer getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    public Integer getErrorSeverity() {
        return errorSeverity;
    }

    public void setErrorSeverity(Integer errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

    public Integer getErrorState() {
        return errorState;
    }

    public void setErrorState(Integer errorState) {
        this.errorState = errorState;
    }
    
}
