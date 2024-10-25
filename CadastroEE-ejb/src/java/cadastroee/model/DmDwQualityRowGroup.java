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
@Table(name = "dm_dw_quality_row_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwQualityRowGroup.findAll", query = "SELECT d FROM DmDwQualityRowGroup d"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByObjectId", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByIndexId", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByPartitionId", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.partitionId = :partitionId"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByTotalRowGroupsAnalyzed", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.totalRowGroupsAnalyzed = :totalRowGroupsAnalyzed"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByTotalPoorRowGroupsAnalyzed", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.totalPoorRowGroupsAnalyzed = :totalPoorRowGroupsAnalyzed"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByAverageRows", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.averageRows = :averageRows"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByQuality", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.quality = :quality"),
    @NamedQuery(name = "DmDwQualityRowGroup.findByUnitOfWork", query = "SELECT d FROM DmDwQualityRowGroup d WHERE d.unitOfWork = :unitOfWork")})
public class DmDwQualityRowGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Column(name = "partition_id")
    private BigInteger partitionId;
    @Column(name = "total_row_groups_analyzed")
    private BigInteger totalRowGroupsAnalyzed;
    @Column(name = "total_poor_row_groups_analyzed")
    private BigInteger totalPoorRowGroupsAnalyzed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "average_rows")
    private Double averageRows;
    @Column(name = "quality")
    private Double quality;
    @Column(name = "unit_of_work")
    private BigInteger unitOfWork;

    public DmDwQualityRowGroup() {
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

    public BigInteger getTotalPoorRowGroupsAnalyzed() {
        return totalPoorRowGroupsAnalyzed;
    }

    public void setTotalPoorRowGroupsAnalyzed(BigInteger totalPoorRowGroupsAnalyzed) {
        this.totalPoorRowGroupsAnalyzed = totalPoorRowGroupsAnalyzed;
    }

    public Double getAverageRows() {
        return averageRows;
    }

    public void setAverageRows(Double averageRows) {
        this.averageRows = averageRows;
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
