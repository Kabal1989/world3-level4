/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_os_buffer_descriptors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsBufferDescriptors.findAll", query = "SELECT d FROM DmOsBufferDescriptors d"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByDatabaseId", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByFileId", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.fileId = :fileId"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByPageId", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.pageId = :pageId"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByPageLevel", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.pageLevel = :pageLevel"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByAllocationUnitId", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.allocationUnitId = :allocationUnitId"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByPageType", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.pageType = :pageType"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByRowCount", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByFreeSpaceInBytes", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.freeSpaceInBytes = :freeSpaceInBytes"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByIsModified", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.isModified = :isModified"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByNumaNode", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.numaNode = :numaNode"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByReadMicrosec", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.readMicrosec = :readMicrosec"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByIsInBpoolExtension", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.isInBpoolExtension = :isInBpoolExtension"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByErrorCode", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.errorCode = :errorCode"),
    @NamedQuery(name = "DmOsBufferDescriptors.findByLatchDesc", query = "SELECT d FROM DmOsBufferDescriptors d WHERE d.latchDesc = :latchDesc")})
public class DmOsBufferDescriptors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "file_id")
    private Integer fileId;
    @Column(name = "page_id")
    private Integer pageId;
    @Column(name = "page_level")
    private Integer pageLevel;
    @Column(name = "allocation_unit_id")
    private BigInteger allocationUnitId;
    @Size(max = 60)
    @Column(name = "page_type")
    private String pageType;
    @Column(name = "row_count")
    private Integer rowCount;
    @Column(name = "free_space_in_bytes")
    private Integer freeSpaceInBytes;
    @Column(name = "is_modified")
    private Boolean isModified;
    @Column(name = "numa_node")
    private Integer numaNode;
    @Column(name = "read_microsec")
    private BigInteger readMicrosec;
    @Column(name = "is_in_bpool_extension")
    private Boolean isInBpoolExtension;
    @Column(name = "error_code")
    private Integer errorCode;
    @Lob
    @Column(name = "op_history")
    private byte[] opHistory;
    @Lob
    @Column(name = "buffer_address")
    private byte[] bufferAddress;
    @Lob
    @Column(name = "latch_address")
    private byte[] latchAddress;
    @Size(max = 256)
    @Column(name = "latch_desc")
    private String latchDesc;

    public DmOsBufferDescriptors() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getPageLevel() {
        return pageLevel;
    }

    public void setPageLevel(Integer pageLevel) {
        this.pageLevel = pageLevel;
    }

    public BigInteger getAllocationUnitId() {
        return allocationUnitId;
    }

    public void setAllocationUnitId(BigInteger allocationUnitId) {
        this.allocationUnitId = allocationUnitId;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getFreeSpaceInBytes() {
        return freeSpaceInBytes;
    }

    public void setFreeSpaceInBytes(Integer freeSpaceInBytes) {
        this.freeSpaceInBytes = freeSpaceInBytes;
    }

    public Boolean getIsModified() {
        return isModified;
    }

    public void setIsModified(Boolean isModified) {
        this.isModified = isModified;
    }

    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public BigInteger getReadMicrosec() {
        return readMicrosec;
    }

    public void setReadMicrosec(BigInteger readMicrosec) {
        this.readMicrosec = readMicrosec;
    }

    public Boolean getIsInBpoolExtension() {
        return isInBpoolExtension;
    }

    public void setIsInBpoolExtension(Boolean isInBpoolExtension) {
        this.isInBpoolExtension = isInBpoolExtension;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public byte[] getOpHistory() {
        return opHistory;
    }

    public void setOpHistory(byte[] opHistory) {
        this.opHistory = opHistory;
    }

    public byte[] getBufferAddress() {
        return bufferAddress;
    }

    public void setBufferAddress(byte[] bufferAddress) {
        this.bufferAddress = bufferAddress;
    }

    public byte[] getLatchAddress() {
        return latchAddress;
    }

    public void setLatchAddress(byte[] latchAddress) {
        this.latchAddress = latchAddress;
    }

    public String getLatchDesc() {
        return latchDesc;
    }

    public void setLatchDesc(String latchDesc) {
        this.latchDesc = latchDesc;
    }
    
}
