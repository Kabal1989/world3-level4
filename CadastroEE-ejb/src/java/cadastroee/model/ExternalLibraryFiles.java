/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "external_library_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibraryFiles.findAll", query = "SELECT e FROM ExternalLibraryFiles e"),
    @NamedQuery(name = "ExternalLibraryFiles.findByExternalLibraryId", query = "SELECT e FROM ExternalLibraryFiles e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibraryFiles.findByPlatform", query = "SELECT e FROM ExternalLibraryFiles e WHERE e.platform = :platform"),
    @NamedQuery(name = "ExternalLibraryFiles.findByPlatformDesc", query = "SELECT e FROM ExternalLibraryFiles e WHERE e.platformDesc = :platformDesc")})
public class ExternalLibraryFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Lob
    @Column(name = "content")
    private byte[] content;
    @Column(name = "platform")
    private Short platform;
    @Size(max = 60)
    @Column(name = "platform_desc")
    private String platformDesc;

    public ExternalLibraryFiles() {
    }

    public int getExternalLibraryId() {
        return externalLibraryId;
    }

    public void setExternalLibraryId(int externalLibraryId) {
        this.externalLibraryId = externalLibraryId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public String getPlatformDesc() {
        return platformDesc;
    }

    public void setPlatformDesc(String platformDesc) {
        this.platformDesc = platformDesc;
    }
    
}
