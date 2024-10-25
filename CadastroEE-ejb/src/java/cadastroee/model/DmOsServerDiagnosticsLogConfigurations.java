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
@Table(name = "dm_os_server_diagnostics_log_configurations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findAll", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByIsEnabled", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.isEnabled = :isEnabled"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByPath", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.path = :path"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByMaxSize", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.maxSize = :maxSize"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByMaxFiles", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.maxFiles = :maxFiles")})
public class DmOsServerDiagnosticsLogConfigurations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "is_enabled")
    private Integer isEnabled;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "path")
    private String path;
    @Column(name = "max_size")
    private Integer maxSize;
    @Column(name = "max_files")
    private Integer maxFiles;

    public DmOsServerDiagnosticsLogConfigurations() {
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getMaxFiles() {
        return maxFiles;
    }

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }
    
}
