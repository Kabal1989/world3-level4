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
@Table(name = "dm_db_session_space_usage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbSessionSpaceUsage.findAll", query = "SELECT d FROM DmDbSessionSpaceUsage d"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findBySessionId", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findByDatabaseId", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findByUserObjectsAllocPageCount", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.userObjectsAllocPageCount = :userObjectsAllocPageCount"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findByUserObjectsDeallocPageCount", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.userObjectsDeallocPageCount = :userObjectsDeallocPageCount"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findByInternalObjectsAllocPageCount", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.internalObjectsAllocPageCount = :internalObjectsAllocPageCount"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findByInternalObjectsDeallocPageCount", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.internalObjectsDeallocPageCount = :internalObjectsDeallocPageCount"),
    @NamedQuery(name = "DmDbSessionSpaceUsage.findByUserObjectsDeferredDeallocPageCount", query = "SELECT d FROM DmDbSessionSpaceUsage d WHERE d.userObjectsDeferredDeallocPageCount = :userObjectsDeferredDeallocPageCount")})
public class DmDbSessionSpaceUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Short sessionId;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "user_objects_alloc_page_count")
    private BigInteger userObjectsAllocPageCount;
    @Column(name = "user_objects_dealloc_page_count")
    private BigInteger userObjectsDeallocPageCount;
    @Column(name = "internal_objects_alloc_page_count")
    private BigInteger internalObjectsAllocPageCount;
    @Column(name = "internal_objects_dealloc_page_count")
    private BigInteger internalObjectsDeallocPageCount;
    @Column(name = "user_objects_deferred_dealloc_page_count")
    private BigInteger userObjectsDeferredDeallocPageCount;

    public DmDbSessionSpaceUsage() {
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getUserObjectsAllocPageCount() {
        return userObjectsAllocPageCount;
    }

    public void setUserObjectsAllocPageCount(BigInteger userObjectsAllocPageCount) {
        this.userObjectsAllocPageCount = userObjectsAllocPageCount;
    }

    public BigInteger getUserObjectsDeallocPageCount() {
        return userObjectsDeallocPageCount;
    }

    public void setUserObjectsDeallocPageCount(BigInteger userObjectsDeallocPageCount) {
        this.userObjectsDeallocPageCount = userObjectsDeallocPageCount;
    }

    public BigInteger getInternalObjectsAllocPageCount() {
        return internalObjectsAllocPageCount;
    }

    public void setInternalObjectsAllocPageCount(BigInteger internalObjectsAllocPageCount) {
        this.internalObjectsAllocPageCount = internalObjectsAllocPageCount;
    }

    public BigInteger getInternalObjectsDeallocPageCount() {
        return internalObjectsDeallocPageCount;
    }

    public void setInternalObjectsDeallocPageCount(BigInteger internalObjectsDeallocPageCount) {
        this.internalObjectsDeallocPageCount = internalObjectsDeallocPageCount;
    }

    public BigInteger getUserObjectsDeferredDeallocPageCount() {
        return userObjectsDeferredDeallocPageCount;
    }

    public void setUserObjectsDeferredDeallocPageCount(BigInteger userObjectsDeferredDeallocPageCount) {
        this.userObjectsDeferredDeallocPageCount = userObjectsDeferredDeallocPageCount;
    }
    
}
