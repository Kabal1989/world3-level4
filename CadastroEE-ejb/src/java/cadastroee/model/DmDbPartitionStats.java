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
@Table(name = "dm_db_partition_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbPartitionStats.findAll", query = "SELECT d FROM DmDbPartitionStats d"),
    @NamedQuery(name = "DmDbPartitionStats.findByPartitionId", query = "SELECT d FROM DmDbPartitionStats d WHERE d.partitionId = :partitionId"),
    @NamedQuery(name = "DmDbPartitionStats.findByObjectId", query = "SELECT d FROM DmDbPartitionStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbPartitionStats.findByIndexId", query = "SELECT d FROM DmDbPartitionStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbPartitionStats.findByPartitionNumber", query = "SELECT d FROM DmDbPartitionStats d WHERE d.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "DmDbPartitionStats.findByInRowDataPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.inRowDataPageCount = :inRowDataPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByInRowUsedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.inRowUsedPageCount = :inRowUsedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByInRowReservedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.inRowReservedPageCount = :inRowReservedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByLobUsedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.lobUsedPageCount = :lobUsedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByLobReservedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.lobReservedPageCount = :lobReservedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByRowOverflowUsedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.rowOverflowUsedPageCount = :rowOverflowUsedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByRowOverflowReservedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.rowOverflowReservedPageCount = :rowOverflowReservedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByUsedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.usedPageCount = :usedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByReservedPageCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.reservedPageCount = :reservedPageCount"),
    @NamedQuery(name = "DmDbPartitionStats.findByRowCount", query = "SELECT d FROM DmDbPartitionStats d WHERE d.rowCount = :rowCount")})
public class DmDbPartitionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "partition_id")
    private BigInteger partitionId;
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
    @Column(name = "partition_number")
    private int partitionNumber;
    @Column(name = "in_row_data_page_count")
    private BigInteger inRowDataPageCount;
    @Column(name = "in_row_used_page_count")
    private BigInteger inRowUsedPageCount;
    @Column(name = "in_row_reserved_page_count")
    private BigInteger inRowReservedPageCount;
    @Column(name = "lob_used_page_count")
    private BigInteger lobUsedPageCount;
    @Column(name = "lob_reserved_page_count")
    private BigInteger lobReservedPageCount;
    @Column(name = "row_overflow_used_page_count")
    private BigInteger rowOverflowUsedPageCount;
    @Column(name = "row_overflow_reserved_page_count")
    private BigInteger rowOverflowReservedPageCount;
    @Column(name = "used_page_count")
    private BigInteger usedPageCount;
    @Column(name = "reserved_page_count")
    private BigInteger reservedPageCount;
    @Column(name = "row_count")
    private BigInteger rowCount;

    public DmDbPartitionStats() {
    }

    public BigInteger getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(BigInteger partitionId) {
        this.partitionId = partitionId;
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

    public int getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(int partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public BigInteger getInRowDataPageCount() {
        return inRowDataPageCount;
    }

    public void setInRowDataPageCount(BigInteger inRowDataPageCount) {
        this.inRowDataPageCount = inRowDataPageCount;
    }

    public BigInteger getInRowUsedPageCount() {
        return inRowUsedPageCount;
    }

    public void setInRowUsedPageCount(BigInteger inRowUsedPageCount) {
        this.inRowUsedPageCount = inRowUsedPageCount;
    }

    public BigInteger getInRowReservedPageCount() {
        return inRowReservedPageCount;
    }

    public void setInRowReservedPageCount(BigInteger inRowReservedPageCount) {
        this.inRowReservedPageCount = inRowReservedPageCount;
    }

    public BigInteger getLobUsedPageCount() {
        return lobUsedPageCount;
    }

    public void setLobUsedPageCount(BigInteger lobUsedPageCount) {
        this.lobUsedPageCount = lobUsedPageCount;
    }

    public BigInteger getLobReservedPageCount() {
        return lobReservedPageCount;
    }

    public void setLobReservedPageCount(BigInteger lobReservedPageCount) {
        this.lobReservedPageCount = lobReservedPageCount;
    }

    public BigInteger getRowOverflowUsedPageCount() {
        return rowOverflowUsedPageCount;
    }

    public void setRowOverflowUsedPageCount(BigInteger rowOverflowUsedPageCount) {
        this.rowOverflowUsedPageCount = rowOverflowUsedPageCount;
    }

    public BigInteger getRowOverflowReservedPageCount() {
        return rowOverflowReservedPageCount;
    }

    public void setRowOverflowReservedPageCount(BigInteger rowOverflowReservedPageCount) {
        this.rowOverflowReservedPageCount = rowOverflowReservedPageCount;
    }

    public BigInteger getUsedPageCount() {
        return usedPageCount;
    }

    public void setUsedPageCount(BigInteger usedPageCount) {
        this.usedPageCount = usedPageCount;
    }

    public BigInteger getReservedPageCount() {
        return reservedPageCount;
    }

    public void setReservedPageCount(BigInteger reservedPageCount) {
        this.reservedPageCount = reservedPageCount;
    }

    public BigInteger getRowCount() {
        return rowCount;
    }

    public void setRowCount(BigInteger rowCount) {
        this.rowCount = rowCount;
    }
    
}
