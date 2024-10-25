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
@Table(name = "dm_db_file_space_usage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbFileSpaceUsage.findAll", query = "SELECT d FROM DmDbFileSpaceUsage d"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByDatabaseId", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByFileId", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.fileId = :fileId"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByFilegroupId", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.filegroupId = :filegroupId"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByTotalPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.totalPageCount = :totalPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByAllocatedExtentPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.allocatedExtentPageCount = :allocatedExtentPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByUnallocatedExtentPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.unallocatedExtentPageCount = :unallocatedExtentPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByVersionStoreReservedPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.versionStoreReservedPageCount = :versionStoreReservedPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByUserObjectReservedPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.userObjectReservedPageCount = :userObjectReservedPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByInternalObjectReservedPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.internalObjectReservedPageCount = :internalObjectReservedPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByMixedExtentPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.mixedExtentPageCount = :mixedExtentPageCount"),
    @NamedQuery(name = "DmDbFileSpaceUsage.findByModifiedExtentPageCount", query = "SELECT d FROM DmDbFileSpaceUsage d WHERE d.modifiedExtentPageCount = :modifiedExtentPageCount")})
public class DmDbFileSpaceUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "file_id")
    private Short fileId;
    @Column(name = "filegroup_id")
    private Short filegroupId;
    @Column(name = "total_page_count")
    private BigInteger totalPageCount;
    @Column(name = "allocated_extent_page_count")
    private BigInteger allocatedExtentPageCount;
    @Column(name = "unallocated_extent_page_count")
    private BigInteger unallocatedExtentPageCount;
    @Column(name = "version_store_reserved_page_count")
    private BigInteger versionStoreReservedPageCount;
    @Column(name = "user_object_reserved_page_count")
    private BigInteger userObjectReservedPageCount;
    @Column(name = "internal_object_reserved_page_count")
    private BigInteger internalObjectReservedPageCount;
    @Column(name = "mixed_extent_page_count")
    private BigInteger mixedExtentPageCount;
    @Column(name = "modified_extent_page_count")
    private BigInteger modifiedExtentPageCount;

    public DmDbFileSpaceUsage() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Short getFileId() {
        return fileId;
    }

    public void setFileId(Short fileId) {
        this.fileId = fileId;
    }

    public Short getFilegroupId() {
        return filegroupId;
    }

    public void setFilegroupId(Short filegroupId) {
        this.filegroupId = filegroupId;
    }

    public BigInteger getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(BigInteger totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public BigInteger getAllocatedExtentPageCount() {
        return allocatedExtentPageCount;
    }

    public void setAllocatedExtentPageCount(BigInteger allocatedExtentPageCount) {
        this.allocatedExtentPageCount = allocatedExtentPageCount;
    }

    public BigInteger getUnallocatedExtentPageCount() {
        return unallocatedExtentPageCount;
    }

    public void setUnallocatedExtentPageCount(BigInteger unallocatedExtentPageCount) {
        this.unallocatedExtentPageCount = unallocatedExtentPageCount;
    }

    public BigInteger getVersionStoreReservedPageCount() {
        return versionStoreReservedPageCount;
    }

    public void setVersionStoreReservedPageCount(BigInteger versionStoreReservedPageCount) {
        this.versionStoreReservedPageCount = versionStoreReservedPageCount;
    }

    public BigInteger getUserObjectReservedPageCount() {
        return userObjectReservedPageCount;
    }

    public void setUserObjectReservedPageCount(BigInteger userObjectReservedPageCount) {
        this.userObjectReservedPageCount = userObjectReservedPageCount;
    }

    public BigInteger getInternalObjectReservedPageCount() {
        return internalObjectReservedPageCount;
    }

    public void setInternalObjectReservedPageCount(BigInteger internalObjectReservedPageCount) {
        this.internalObjectReservedPageCount = internalObjectReservedPageCount;
    }

    public BigInteger getMixedExtentPageCount() {
        return mixedExtentPageCount;
    }

    public void setMixedExtentPageCount(BigInteger mixedExtentPageCount) {
        this.mixedExtentPageCount = mixedExtentPageCount;
    }

    public BigInteger getModifiedExtentPageCount() {
        return modifiedExtentPageCount;
    }

    public void setModifiedExtentPageCount(BigInteger modifiedExtentPageCount) {
        this.modifiedExtentPageCount = modifiedExtentPageCount;
    }
    
}
