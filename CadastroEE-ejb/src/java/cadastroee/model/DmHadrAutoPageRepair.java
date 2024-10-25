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
@Table(name = "dm_hadr_auto_page_repair")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAutoPageRepair.findAll", query = "SELECT d FROM DmHadrAutoPageRepair d"),
    @NamedQuery(name = "DmHadrAutoPageRepair.findByDatabaseId", query = "SELECT d FROM DmHadrAutoPageRepair d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmHadrAutoPageRepair.findByFileId", query = "SELECT d FROM DmHadrAutoPageRepair d WHERE d.fileId = :fileId"),
    @NamedQuery(name = "DmHadrAutoPageRepair.findByPageId", query = "SELECT d FROM DmHadrAutoPageRepair d WHERE d.pageId = :pageId"),
    @NamedQuery(name = "DmHadrAutoPageRepair.findByErrorType", query = "SELECT d FROM DmHadrAutoPageRepair d WHERE d.errorType = :errorType"),
    @NamedQuery(name = "DmHadrAutoPageRepair.findByPageStatus", query = "SELECT d FROM DmHadrAutoPageRepair d WHERE d.pageStatus = :pageStatus"),
    @NamedQuery(name = "DmHadrAutoPageRepair.findByModificationTime", query = "SELECT d FROM DmHadrAutoPageRepair d WHERE d.modificationTime = :modificationTime")})
public class DmHadrAutoPageRepair implements Serializable {

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

    public DmHadrAutoPageRepair() {
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
