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
@Table(name = "dm_dw_quality_index")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwQualityIndex.findAll", query = "SELECT d FROM DmDwQualityIndex d"),
    @NamedQuery(name = "DmDwQualityIndex.findByObjectId", query = "SELECT d FROM DmDwQualityIndex d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDwQualityIndex.findByIndexId", query = "SELECT d FROM DmDwQualityIndex d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDwQualityIndex.findByPartitionId", query = "SELECT d FROM DmDwQualityIndex d WHERE d.partitionId = :partitionId"),
    @NamedQuery(name = "DmDwQualityIndex.findByOverallQuality", query = "SELECT d FROM DmDwQualityIndex d WHERE d.overallQuality = :overallQuality"),
    @NamedQuery(name = "DmDwQualityIndex.findByClusteringQuality", query = "SELECT d FROM DmDwQualityIndex d WHERE d.clusteringQuality = :clusteringQuality"),
    @NamedQuery(name = "DmDwQualityIndex.findByDeltaQuality", query = "SELECT d FROM DmDwQualityIndex d WHERE d.deltaQuality = :deltaQuality"),
    @NamedQuery(name = "DmDwQualityIndex.findByRowGroupQuality", query = "SELECT d FROM DmDwQualityIndex d WHERE d.rowGroupQuality = :rowGroupQuality"),
    @NamedQuery(name = "DmDwQualityIndex.findByUnitOfWork", query = "SELECT d FROM DmDwQualityIndex d WHERE d.unitOfWork = :unitOfWork")})
public class DmDwQualityIndex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Column(name = "partition_id")
    private BigInteger partitionId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "overall_quality")
    private Double overallQuality;
    @Column(name = "clustering_quality")
    private Double clusteringQuality;
    @Column(name = "delta_quality")
    private Double deltaQuality;
    @Column(name = "row_group_quality")
    private Double rowGroupQuality;
    @Column(name = "unit_of_work")
    private BigInteger unitOfWork;

    public DmDwQualityIndex() {
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

    public Double getOverallQuality() {
        return overallQuality;
    }

    public void setOverallQuality(Double overallQuality) {
        this.overallQuality = overallQuality;
    }

    public Double getClusteringQuality() {
        return clusteringQuality;
    }

    public void setClusteringQuality(Double clusteringQuality) {
        this.clusteringQuality = clusteringQuality;
    }

    public Double getDeltaQuality() {
        return deltaQuality;
    }

    public void setDeltaQuality(Double deltaQuality) {
        this.deltaQuality = deltaQuality;
    }

    public Double getRowGroupQuality() {
        return rowGroupQuality;
    }

    public void setRowGroupQuality(Double rowGroupQuality) {
        this.rowGroupQuality = rowGroupQuality;
    }

    public BigInteger getUnitOfWork() {
        return unitOfWork;
    }

    public void setUnitOfWork(BigInteger unitOfWork) {
        this.unitOfWork = unitOfWork;
    }
    
}
