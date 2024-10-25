/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_mirroring_auto_page_repair")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findAll", query = "SELECT d FROM DmDbMirroringAutoPageRepair d"),
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findByDatabaseId", query = "SELECT d FROM DmDbMirroringAutoPageRepair d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findByFileId", query = "SELECT d FROM DmDbMirroringAutoPageRepair d WHERE d.fileId = :fileId"),
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findByPageId", query = "SELECT d FROM DmDbMirroringAutoPageRepair d WHERE d.pageId = :pageId"),
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findByErrorType", query = "SELECT d FROM DmDbMirroringAutoPageRepair d WHERE d.errorType = :errorType"),
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findByPageStatus", query = "SELECT d FROM DmDbMirroringAutoPageRepair d WHERE d.pageStatus = :pageStatus"),
    @NamedQuery(name = "DmDbMirroringAutoPageRepair.findByModificationTime", query = "SELECT d FROM DmDbMirroringAutoPageRepair d WHERE d.modificationTime = :modificationTime")})
public class DmDbMirroringAutoPageRepair implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_id")
    private int fileId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_id")
    private long pageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "error_type")
    private short errorType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_status")
    private short pageStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modification_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificationTime;

    public DmDbMirroringAutoPageRepair() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public long getPageId() {
        return pageId;
    }

    public void setPageId(long pageId) {
        this.pageId = pageId;
    }

    public short getErrorType() {
        return errorType;
    }

    public void setErrorType(short errorType) {
        this.errorType = errorType;
    }

    public short getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(short pageStatus) {
        this.pageStatus = pageStatus;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }
    
}
