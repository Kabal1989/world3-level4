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
@Table(name = "fulltext_document_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextDocumentTypes.findAll", query = "SELECT f FROM FulltextDocumentTypes f"),
    @NamedQuery(name = "FulltextDocumentTypes.findByDocumentType", query = "SELECT f FROM FulltextDocumentTypes f WHERE f.documentType = :documentType"),
    @NamedQuery(name = "FulltextDocumentTypes.findByClassId", query = "SELECT f FROM FulltextDocumentTypes f WHERE f.classId = :classId"),
    @NamedQuery(name = "FulltextDocumentTypes.findByPath", query = "SELECT f FROM FulltextDocumentTypes f WHERE f.path = :path"),
    @NamedQuery(name = "FulltextDocumentTypes.findByVersion", query = "SELECT f FROM FulltextDocumentTypes f WHERE f.version = :version"),
    @NamedQuery(name = "FulltextDocumentTypes.findByManufacturer", query = "SELECT f FROM FulltextDocumentTypes f WHERE f.manufacturer = :manufacturer")})
public class FulltextDocumentTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "document_type")
    private String documentType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "class_id")
    private String classId;
    @Size(max = 260)
    @Column(name = "path")
    private String path;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "version")
    private String version;
    @Size(max = 128)
    @Column(name = "manufacturer")
    private String manufacturer;

    public FulltextDocumentTypes() {
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
}
