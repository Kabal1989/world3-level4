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
@Table(name = "filetables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filetables.findAll", query = "SELECT f FROM Filetables f"),
    @NamedQuery(name = "Filetables.findByObjectId", query = "SELECT f FROM Filetables f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "Filetables.findByIsEnabled", query = "SELECT f FROM Filetables f WHERE f.isEnabled = :isEnabled"),
    @NamedQuery(name = "Filetables.findByDirectoryName", query = "SELECT f FROM Filetables f WHERE f.directoryName = :directoryName"),
    @NamedQuery(name = "Filetables.findByFilenameCollationId", query = "SELECT f FROM Filetables f WHERE f.filenameCollationId = :filenameCollationId"),
    @NamedQuery(name = "Filetables.findByFilenameCollationName", query = "SELECT f FROM Filetables f WHERE f.filenameCollationName = :filenameCollationName")})
public class Filetables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_enabled")
    private boolean isEnabled;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "directory_name")
    private String directoryName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filename_collation_id")
    private int filenameCollationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 129)
    @Column(name = "filename_collation_name")
    private String filenameCollationName;

    public Filetables() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public int getFilenameCollationId() {
        return filenameCollationId;
    }

    public void setFilenameCollationId(int filenameCollationId) {
        this.filenameCollationId = filenameCollationId;
    }

    public String getFilenameCollationName() {
        return filenameCollationName;
    }

    public void setFilenameCollationName(String filenameCollationName) {
        this.filenameCollationName = filenameCollationName;
    }
    
}
