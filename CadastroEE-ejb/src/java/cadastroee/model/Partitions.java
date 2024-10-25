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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "partitions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partitions.findAll", query = "SELECT p FROM Partitions p"),
    @NamedQuery(name = "Partitions.findByPartitionId", query = "SELECT p FROM Partitions p WHERE p.partitionId = :partitionId"),
    @NamedQuery(name = "Partitions.findByObjectId", query = "SELECT p FROM Partitions p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "Partitions.findByIndexId", query = "SELECT p FROM Partitions p WHERE p.indexId = :indexId"),
    @NamedQuery(name = "Partitions.findByPartitionNumber", query = "SELECT p FROM Partitions p WHERE p.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "Partitions.findByHobtId", query = "SELECT p FROM Partitions p WHERE p.hobtId = :hobtId"),
    @NamedQuery(name = "Partitions.findByRows", query = "SELECT p FROM Partitions p WHERE p.rows = :rows"),
    @NamedQuery(name = "Partitions.findByFilestreamFilegroupId", query = "SELECT p FROM Partitions p WHERE p.filestreamFilegroupId = :filestreamFilegroupId"),
    @NamedQuery(name = "Partitions.findByDataCompression", query = "SELECT p FROM Partitions p WHERE p.dataCompression = :dataCompression"),
    @NamedQuery(name = "Partitions.findByDataCompressionDesc", query = "SELECT p FROM Partitions p WHERE p.dataCompressionDesc = :dataCompressionDesc"),
    @NamedQuery(name = "Partitions.findByXmlCompression", query = "SELECT p FROM Partitions p WHERE p.xmlCompression = :xmlCompression"),
    @NamedQuery(name = "Partitions.findByXmlCompressionDesc", query = "SELECT p FROM Partitions p WHERE p.xmlCompressionDesc = :xmlCompressionDesc")})
public class Partitions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_id")
    private long partitionId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "hobt_id")
    private long hobtId;
    @Column(name = "rows")
    private BigInteger rows;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filestream_filegroup_id")
    private short filestreamFilegroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_compression")
    private short dataCompression;
    @Size(max = 60)
    @Column(name = "data_compression_desc")
    private String dataCompressionDesc;
    @Column(name = "xml_compression")
    private Boolean xmlCompression;
    @Size(max = 3)
    @Column(name = "xml_compression_desc")
    private String xmlCompressionDesc;

    public Partitions() {
    }

    public long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(long partitionId) {
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

    public long getHobtId() {
        return hobtId;
    }

    public void setHobtId(long hobtId) {
        this.hobtId = hobtId;
    }

    public BigInteger getRows() {
        return rows;
    }

    public void setRows(BigInteger rows) {
        this.rows = rows;
    }

    public short getFilestreamFilegroupId() {
        return filestreamFilegroupId;
    }

    public void setFilestreamFilegroupId(short filestreamFilegroupId) {
        this.filestreamFilegroupId = filestreamFilegroupId;
    }

    public short getDataCompression() {
        return dataCompression;
    }

    public void setDataCompression(short dataCompression) {
        this.dataCompression = dataCompression;
    }

    public String getDataCompressionDesc() {
        return dataCompressionDesc;
    }

    public void setDataCompressionDesc(String dataCompressionDesc) {
        this.dataCompressionDesc = dataCompressionDesc;
    }

    public Boolean getXmlCompression() {
        return xmlCompression;
    }

    public void setXmlCompression(Boolean xmlCompression) {
        this.xmlCompression = xmlCompression;
    }

    public String getXmlCompressionDesc() {
        return xmlCompressionDesc;
    }

    public void setXmlCompressionDesc(String xmlCompressionDesc) {
        this.xmlCompressionDesc = xmlCompressionDesc;
    }
    
}
