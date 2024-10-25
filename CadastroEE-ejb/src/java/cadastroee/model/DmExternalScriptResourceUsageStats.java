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
@Table(name = "dm_external_script_resource_usage_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findAll", query = "SELECT d FROM DmExternalScriptResourceUsageStats d"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByPackageName", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.packageName = :packageName"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByMemoryUsage", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.memoryUsage = :memoryUsage"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByCpuUsage", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.cpuUsage = :cpuUsage")})
public class DmExternalScriptResourceUsageStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "package_name")
    private String packageName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_usage")
    private long memoryUsage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_usage")
    private long cpuUsage;

    public DmExternalScriptResourceUsageStats() {
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public long getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(long memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public long getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(long cpuUsage) {
        this.cpuUsage = cpuUsage;
    }
    
}
