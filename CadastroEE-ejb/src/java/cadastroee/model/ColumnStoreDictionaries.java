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
@Table(name = "column_store_dictionaries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnStoreDictionaries.findAll", query = "SELECT c FROM ColumnStoreDictionaries c"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByPartitionId", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.partitionId = :partitionId"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByHobtId", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.hobtId = :hobtId"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByColumnId", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByDictionaryId", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.dictionaryId = :dictionaryId"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByVersion", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.version = :version"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByType", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.type = :type"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByLastId", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.lastId = :lastId"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByEntryCount", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.entryCount = :entryCount"),
    @NamedQuery(name = "ColumnStoreDictionaries.findByOnDiskSize", query = "SELECT c FROM ColumnStoreDictionaries c WHERE c.onDiskSize = :onDiskSize")})
public class ColumnStoreDictionaries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "partition_id")
    private BigInteger partitionId;
    @Column(name = "hobt_id")
    private BigInteger hobtId;
    @Column(name = "column_id")
    private Integer columnId;
    @Column(name = "dictionary_id")
    private Integer dictionaryId;
    @Column(name = "version")
    private Integer version;
    @Column(name = "type")
    private Integer type;
    @Column(name = "last_id")
    private Integer lastId;
    @Column(name = "entry_count")
    private BigInteger entryCount;
    @Column(name = "on_disk_size")
    private BigInteger onDiskSize;

    public ColumnStoreDictionaries() {
    }

    public BigInteger getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(BigInteger partitionId) {
        this.partitionId = partitionId;
    }

    public BigInteger getHobtId() {
        return hobtId;
    }

    public void setHobtId(BigInteger hobtId) {
        this.hobtId = hobtId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Integer dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastId) {
        this.lastId = lastId;
    }

    public BigInteger getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(BigInteger entryCount) {
        this.entryCount = entryCount;
    }

    public BigInteger getOnDiskSize() {
        return onDiskSize;
    }

    public void setOnDiskSize(BigInteger onDiskSize) {
        this.onDiskSize = onDiskSize;
    }
    
}
