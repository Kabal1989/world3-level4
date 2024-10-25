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
@Table(name = "dm_dw_quality_clustering")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwQualityClustering.findAll", query = "SELECT d FROM DmDwQualityClustering d"),
    @NamedQuery(name = "DmDwQualityClustering.findByObjectId", query = "SELECT d FROM DmDwQualityClustering d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDwQualityClustering.findByIndexId", query = "SELECT d FROM DmDwQualityClustering d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDwQualityClustering.findByPartitionId", query = "SELECT d FROM DmDwQualityClustering d WHERE d.partitionId = :partitionId"),
    @NamedQuery(name = "DmDwQualityClustering.findByTotalRowGroupsAnalyzed", query = "SELECT d FROM DmDwQualityClustering d WHERE d.totalRowGroupsAnalyzed = :totalRowGroupsAnalyzed"),
    @NamedQuery(name = "DmDwQualityClustering.findByMaxOverlap", query = "SELECT d FROM DmDwQualityClustering d WHERE d.maxOverlap = :maxOverlap"),
    @NamedQuery(name = "DmDwQualityClustering.findByTotalOverlap", query = "SELECT d FROM DmDwQualityClustering d WHERE d.totalOverlap = :totalOverlap"),
    @NamedQuery(name = "DmDwQualityClustering.findByTotalCellCount", query = "SELECT d FROM DmDwQualityClustering d WHERE d.totalCellCount = :totalCellCount"),
    @NamedQuery(name = "DmDwQualityClustering.findByQuality", query = "SELECT d FROM DmDwQualityClustering d WHERE d.quality = :quality"),
    @NamedQuery(name = "DmDwQualityClustering.findByUnitOfWork", query = "SELECT d FROM DmDwQualityClustering d WHERE d.unitOfWork = :unitOfWork")})
public class DmDwQualityClustering implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Column(name = "partition_id")
    private BigInteger partitionId;
    @Column(name = "total_row_groups_analyzed")
    private BigInteger totalRowGroupsAnalyzed;
    @Column(name = "max_overlap")
    private BigInteger maxOverlap;
    @Column(name = "total_overlap")
    private BigInteger totalOverlap;
    @Column(name = "total_cell_count")
    private Short totalCellCount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quality")
    private Double quality;
    @Column(name = "unit_of_work")
    private BigInteger unitOfWork;

    public DmDwQualityClustering() {
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public BigInteger getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(BigInteger partitionId) {
        this.partitionId = partitionId;
    }

    public BigInteger getTotalRowGroupsAnalyzed() {
        return totalRowGroupsAnalyzed;
    }

    public void setTotalRowGroupsAnalyzed(BigInteger totalRowGroupsAnalyzed) {
        this.totalRowGroupsAnalyzed = totalRowGroupsAnalyzed;
    }

    public BigInteger getMaxOverlap() {
        return maxOverlap;
    }

    public void setMaxOverlap(BigInteger maxOverlap) {
        this.maxOverlap = maxOverlap;
    }

    public BigInteger getTotalOverlap() {
        return totalOverlap;
    }

    public void setTotalOverlap(BigInteger totalOverlap) {
        this.totalOverlap = totalOverlap;
    }

    public Short getTotalCellCount() {
        return totalCellCount;
    }

    public void setTotalCellCount(Short totalCellCount) {
        this.totalCellCount = totalCellCount;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public BigInteger getUnitOfWork() {
        return unitOfWork;
    }

    public void setUnitOfWork(BigInteger unitOfWork) {
        this.unitOfWork = unitOfWork;
    }
    
}
