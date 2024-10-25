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
@Table(name = "external_language_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLanguageFiles.findAll", query = "SELECT e FROM ExternalLanguageFiles e"),
    @NamedQuery(name = "ExternalLanguageFiles.findByExternalLanguageId", query = "SELECT e FROM ExternalLanguageFiles e WHERE e.externalLanguageId = :externalLanguageId"),
    @NamedQuery(name = "ExternalLanguageFiles.findByFileName", query = "SELECT e FROM ExternalLanguageFiles e WHERE e.fileName = :fileName"),
    @NamedQuery(name = "ExternalLanguageFiles.findByPlatform", query = "SELECT e FROM ExternalLanguageFiles e WHERE e.platform = :platform"),
    @NamedQuery(name = "ExternalLanguageFiles.findByPlatformDesc", query = "SELECT e FROM ExternalLanguageFiles e WHERE e.platformDesc = :platformDesc"),
    @NamedQuery(name = "ExternalLanguageFiles.findByParameters", query = "SELECT e FROM ExternalLanguageFiles e WHERE e.parameters = :parameters"),
    @NamedQuery(name = "ExternalLanguageFiles.findByEnvironmentVariables", query = "SELECT e FROM ExternalLanguageFiles e WHERE e.environmentVariables = :environmentVariables")})
public class ExternalLanguageFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_language_id")
    private int externalLanguageId;
    @Lob
    @Column(name = "content")
    private byte[] content;
    @Size(max = 128)
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "platform")
    private Short platform;
    @Size(max = 60)
    @Column(name = "platform_desc")
    private String platformDesc;
    @Size(max = 128)
    @Column(name = "parameters")
    private String parameters;
    @Size(max = 128)
    @Column(name = "environment_variables")
    private String environmentVariables;

    public ExternalLanguageFiles() {
    }

    public int getExternalLanguageId() {
        return externalLanguageId;
    }

    public void setExternalLanguageId(int externalLanguageId) {
        this.externalLanguageId = externalLanguageId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(String environmentVariables) {
        this.environmentVariables = environmentVariables;
    }
    
}
