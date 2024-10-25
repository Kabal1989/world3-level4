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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "external_table_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalTableColumns.findAll", query = "SELECT e FROM ExternalTableColumns e"),
    @NamedQuery(name = "ExternalTableColumns.findByObjectId", query = "SELECT e FROM ExternalTableColumns e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalTableColumns.findByColumnId", query = "SELECT e FROM ExternalTableColumns e WHERE e.columnId = :columnId"),
    @NamedQuery(name = "ExternalTableColumns.findByPartitionColumnOrdinal", query = "SELECT e FROM ExternalTableColumns e WHERE e.partitionColumnOrdinal = :partitionColumnOrdinal"),
    @NamedQuery(name = "ExternalTableColumns.findByHashColumnOrdinal", query = "SELECT e FROM ExternalTableColumns e WHERE e.hashColumnOrdinal = :hashColumnOrdinal")})
public class ExternalTableColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Column(name = "partition_column_ordinal")
    private Integer partitionColumnOrdinal;
    @Column(name = "hash_column_ordinal")
    private Integer hashColumnOrdinal;

    public ExternalTableColumns() {
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

    public Integer getPartitionColumnOrdinal() {
        return partitionColumnOrdinal;
    }

    public void setPartitionColumnOrdinal(Integer partitionColumnOrdinal) {
        this.partitionColumnOrdinal = partitionColumnOrdinal;
    }

    public Integer getHashColumnOrdinal() {
        return hashColumnOrdinal;
    }

    public void setHashColumnOrdinal(Integer hashColumnOrdinal) {
        this.hashColumnOrdinal = hashColumnOrdinal;
    }
    
}
