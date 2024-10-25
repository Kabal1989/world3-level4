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
@Table(name = "index_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndexColumns.findAll", query = "SELECT i FROM IndexColumns i"),
    @NamedQuery(name = "IndexColumns.findByObjectId", query = "SELECT i FROM IndexColumns i WHERE i.objectId = :objectId"),
    @NamedQuery(name = "IndexColumns.findByIndexId", query = "SELECT i FROM IndexColumns i WHERE i.indexId = :indexId"),
    @NamedQuery(name = "IndexColumns.findByIndexColumnId", query = "SELECT i FROM IndexColumns i WHERE i.indexColumnId = :indexColumnId"),
    @NamedQuery(name = "IndexColumns.findByColumnId", query = "SELECT i FROM IndexColumns i WHERE i.columnId = :columnId"),
    @NamedQuery(name = "IndexColumns.findByKeyOrdinal", query = "SELECT i FROM IndexColumns i WHERE i.keyOrdinal = :keyOrdinal"),
    @NamedQuery(name = "IndexColumns.findByPartitionOrdinal", query = "SELECT i FROM IndexColumns i WHERE i.partitionOrdinal = :partitionOrdinal"),
    @NamedQuery(name = "IndexColumns.findByIsDescendingKey", query = "SELECT i FROM IndexColumns i WHERE i.isDescendingKey = :isDescendingKey"),
    @NamedQuery(name = "IndexColumns.findByIsIncludedColumn", query = "SELECT i FROM IndexColumns i WHERE i.isIncludedColumn = :isIncludedColumn"),
    @NamedQuery(name = "IndexColumns.findByColumnStoreOrderOrdinal", query = "SELECT i FROM IndexColumns i WHERE i.columnStoreOrderOrdinal = :columnStoreOrderOrdinal")})
public class IndexColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_column_id")
    private int indexColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "key_ordinal")
    private short keyOrdinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_ordinal")
    private short partitionOrdinal;
    @Column(name = "is_descending_key")
    private Boolean isDescendingKey;
    @Column(name = "is_included_column")
    private Boolean isIncludedColumn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_store_order_ordinal")
    private short columnStoreOrderOrdinal;

    public IndexColumns() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public int getIndexColumnId() {
        return indexColumnId;
    }

    public void setIndexColumnId(int indexColumnId) {
        this.indexColumnId = indexColumnId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public short getKeyOrdinal() {
        return keyOrdinal;
    }

    public void setKeyOrdinal(short keyOrdinal) {
        this.keyOrdinal = keyOrdinal;
    }

    public short getPartitionOrdinal() {
        return partitionOrdinal;
    }

    public void setPartitionOrdinal(short partitionOrdinal) {
        this.partitionOrdinal = partitionOrdinal;
    }

    public Boolean getIsDescendingKey() {
        return isDescendingKey;
    }

    public void setIsDescendingKey(Boolean isDescendingKey) {
        this.isDescendingKey = isDescendingKey;
    }

    public Boolean getIsIncludedColumn() {
        return isIncludedColumn;
    }

    public void setIsIncludedColumn(Boolean isIncludedColumn) {
        this.isIncludedColumn = isIncludedColumn;
    }

    public short getColumnStoreOrderOrdinal() {
        return columnStoreOrderOrdinal;
    }

    public void setColumnStoreOrderOrdinal(short columnStoreOrderOrdinal) {
        this.columnStoreOrderOrdinal = columnStoreOrderOrdinal;
    }
    
}
