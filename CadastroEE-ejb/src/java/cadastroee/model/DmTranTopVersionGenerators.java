/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_tran_top_version_generators")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranTopVersionGenerators.findAll", query = "SELECT d FROM DmTranTopVersionGenerators d"),
    @NamedQuery(name = "DmTranTopVersionGenerators.findByDatabaseId", query = "SELECT d FROM DmTranTopVersionGenerators d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranTopVersionGenerators.findByRowsetId", query = "SELECT d FROM DmTranTopVersionGenerators d WHERE d.rowsetId = :rowsetId"),
    @NamedQuery(name = "DmTranTopVersionGenerators.findByAggregatedRecordLengthInBytes", query = "SELECT d FROM DmTranTopVersionGenerators d WHERE d.aggregatedRecordLengthInBytes = :aggregatedRecordLengthInBytes")})
public class DmTranTopVersionGenerators implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Short databaseId;
    @Column(name = "rowset_id")
    private BigInteger rowsetId;
    @Column(name = "aggregated_record_length_in_bytes")
    private Integer aggregatedRecordLengthInBytes;

    public DmTranTopVersionGenerators() {
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(BigInteger rowsetId) {
        this.rowsetId = rowsetId;
    }

    public Integer getAggregatedRecordLengthInBytes() {
        return aggregatedRecordLengthInBytes;
    }

    public void setAggregatedRecordLengthInBytes(Integer aggregatedRecordLengthInBytes) {
        this.aggregatedRecordLengthInBytes = aggregatedRecordLengthInBytes;
    }
    
}
