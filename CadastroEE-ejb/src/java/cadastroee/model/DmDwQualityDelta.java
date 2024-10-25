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
@Table(name = "dm_dw_quality_delta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwQualityDelta.findAll", query = "SELECT d FROM DmDwQualityDelta d"),
    @NamedQuery(name = "DmDwQualityDelta.findByObjectId", query = "SELECT d FROM DmDwQualityDelta d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDwQualityDelta.findByIndexId", query = "SELECT d FROM DmDwQualityDelta d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDwQualityDelta.findByPartitionId", query = "SELECT d FROM DmDwQualityDelta d WHERE d.partitionId = :partitionId"),
    @NamedQuery(name = "DmDwQualityDelta.findByTotalRowsAnalyzed", query = "SELECT d FROM DmDwQualityDelta d WHERE d.totalRowsAnalyzed = :totalRowsAnalyzed"),
    @NamedQuery(name = "DmDwQualityDelta.findByQuality", query = "SELECT d FROM DmDwQualityDelta d WHERE d.quality = :quality"),
    @NamedQuery(name = "DmDwQualityDelta.findByUnitOfWork", query = "SELECT d FROM DmDwQualityDelta d WHERE d.unitOfWork = :unitOfWork")})
public class DmDwQualityDelta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Column(name = "partition_id")
    private BigInteger partitionId;
    @Column(name = "total_rows_analyzed")
    private BigInteger totalRowsAnalyzed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quality")
    private Double quality;
    @Column(name = "unit_of_work")
    private BigInteger unitOfWork;

    public DmDwQualityDelta() {
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

    public BigInteger getTotalRowsAnalyzed() {
        return totalRowsAnalyzed;
    }

    public void setTotalRowsAnalyzed(BigInteger totalRowsAnalyzed) {
        this.totalRowsAnalyzed = totalRowsAnalyzed;
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
