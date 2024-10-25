/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "filegroups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filegroups.findAll", query = "SELECT f FROM Filegroups f"),
    @NamedQuery(name = "Filegroups.findByName", query = "SELECT f FROM Filegroups f WHERE f.name = :name"),
    @NamedQuery(name = "Filegroups.findByDataSpaceId", query = "SELECT f FROM Filegroups f WHERE f.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "Filegroups.findByType", query = "SELECT f FROM Filegroups f WHERE f.type = :type"),
    @NamedQuery(name = "Filegroups.findByTypeDesc", query = "SELECT f FROM Filegroups f WHERE f.typeDesc = :typeDesc"),
    @NamedQuery(name = "Filegroups.findByIsDefault", query = "SELECT f FROM Filegroups f WHERE f.isDefault = :isDefault"),
    @NamedQuery(name = "Filegroups.findByIsSystem", query = "SELECT f FROM Filegroups f WHERE f.isSystem = :isSystem"),
    @NamedQuery(name = "Filegroups.findByFilegroupGuid", query = "SELECT f FROM Filegroups f WHERE f.filegroupGuid = :filegroupGuid"),
    @NamedQuery(name = "Filegroups.findByLogFilegroupId", query = "SELECT f FROM Filegroups f WHERE f.logFilegroupId = :logFilegroupId"),
    @NamedQuery(name = "Filegroups.findByIsReadOnly", query = "SELECT f FROM Filegroups f WHERE f.isReadOnly = :isReadOnly"),
    @NamedQuery(name = "Filegroups.findByIsAutogrowAllFiles", query = "SELECT f FROM Filegroups f WHERE f.isAutogrowAllFiles = :isAutogrowAllFiles")})
public class Filegroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "is_default")
    private Boolean isDefault;
    @Column(name = "is_system")
    private Boolean isSystem;
    @Size(max = 36)
    @Column(name = "filegroup_guid")
    private String filegroupGuid;
    @Column(name = "log_filegroup_id")
    private Integer logFilegroupId;
    @Column(name = "is_read_only")
    private Boolean isReadOnly;
    @Column(name = "is_autogrow_all_files")
    private Boolean isAutogrowAllFiles;

    public Filegroups() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getFilegroupGuid() {
        return filegroupGuid;
    }

    public void setFilegroupGuid(String filegroupGuid) {
        this.filegroupGuid = filegroupGuid;
    }

    public Integer getLogFilegroupId() {
        return logFilegroupId;
    }

    public void setLogFilegroupId(Integer logFilegroupId) {
        this.logFilegroupId = logFilegroupId;
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public Boolean getIsAutogrowAllFiles() {
        return isAutogrowAllFiles;
    }

    public void setIsAutogrowAllFiles(Boolean isAutogrowAllFiles) {
        this.isAutogrowAllFiles = isAutogrowAllFiles;
    }
    
}
