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
@Table(name = "dm_pal_vm_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalVmStats.findAll", query = "SELECT d FROM DmPalVmStats d"),
    @NamedQuery(name = "DmPalVmStats.findByVmMetricName", query = "SELECT d FROM DmPalVmStats d WHERE d.vmMetricName = :vmMetricName"),
    @NamedQuery(name = "DmPalVmStats.findByCount", query = "SELECT d FROM DmPalVmStats d WHERE d.count = :count")})
public class DmPalVmStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "vm_metric_name")
    private String vmMetricName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count")
    private long count;

    public DmPalVmStats() {
    }

    public String getVmMetricName() {
        return vmMetricName;
    }

    public void setVmMetricName(String vmMetricName) {
        this.vmMetricName = vmMetricName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
    
}
