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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "external_library_setup_errors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibrarySetupErrors.findAll", query = "SELECT e FROM ExternalLibrarySetupErrors e"),
    @NamedQuery(name = "ExternalLibrarySetupErrors.findByDbId", query = "SELECT e FROM ExternalLibrarySetupErrors e WHERE e.dbId = :dbId"),
    @NamedQuery(name = "ExternalLibrarySetupErrors.findByPrincipalId", query = "SELECT e FROM ExternalLibrarySetupErrors e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalLibrarySetupErrors.findByExternalLibraryId", query = "SELECT e FROM ExternalLibrarySetupErrors e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibrarySetupErrors.findByErrorCode", query = "SELECT e FROM ExternalLibrarySetupErrors e WHERE e.errorCode = :errorCode"),
    @NamedQuery(name = "ExternalLibrarySetupErrors.findByErrorTimestamp", query = "SELECT e FROM ExternalLibrarySetupErrors e WHERE e.errorTimestamp = :errorTimestamp"),
    @NamedQuery(name = "ExternalLibrarySetupErrors.findByErrorMessage", query = "SELECT e FROM ExternalLibrarySetupErrors e WHERE e.errorMessage = :errorMessage")})
public class ExternalLibrarySetupErrors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "db_id")
    private int dbId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "error_code")
    private int errorCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "error_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date errorTimestamp;
    @Size(max = 1024)
    @Column(name = "error_message")
    private String errorMessage;

    public ExternalLibrarySetupErrors() {
    }

    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getExternalLibraryId() {
        return externalLibraryId;
    }

    public void setExternalLibraryId(int externalLibraryId) {
        this.externalLibraryId = externalLibraryId;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Date getErrorTimestamp() {
        return errorTimestamp;
    }

    public void setErrorTimestamp(Date errorTimestamp) {
        this.errorTimestamp = errorTimestamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
}
