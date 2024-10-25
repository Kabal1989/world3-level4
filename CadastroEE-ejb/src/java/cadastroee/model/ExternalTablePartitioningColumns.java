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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "external_table_partitioning_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalTablePartitioningColumns.findAll", query = "SELECT e FROM ExternalTablePartitioningColumns e"),
    @NamedQuery(name = "ExternalTablePartitioningColumns.findByObjectId", query = "SELECT e FROM ExternalTablePartitioningColumns e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalTablePartitioningColumns.findByColumnId", query = "SELECT e FROM ExternalTablePartitioningColumns e WHERE e.columnId = :columnId"),
    @NamedQuery(name = "ExternalTablePartitioningColumns.findByOrdinalId", query = "SELECT e FROM ExternalTablePartitioningColumns e WHERE e.ordinalId = :ordinalId")})
public class ExternalTablePartitioningColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Column(name = "ordinal_id")
    private BigInteger ordinalId;

    public ExternalTablePartitioningColumns() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public BigInteger getOrdinalId() {
        return ordinalId;
    }

    public void setOrdinalId(BigInteger ordinalId) {
        this.ordinalId = ordinalId;
    }
    
}
