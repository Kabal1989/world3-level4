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
@Table(name = "sysperfinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysperfinfo.findAll", query = "SELECT s FROM Sysperfinfo s"),
    @NamedQuery(name = "Sysperfinfo.findByObjectName", query = "SELECT s FROM Sysperfinfo s WHERE s.objectName = :objectName"),
    @NamedQuery(name = "Sysperfinfo.findByCounterName", query = "SELECT s FROM Sysperfinfo s WHERE s.counterName = :counterName"),
    @NamedQuery(name = "Sysperfinfo.findByInstanceName", query = "SELECT s FROM Sysperfinfo s WHERE s.instanceName = :instanceName"),
    @NamedQuery(name = "Sysperfinfo.findByCntrValue", query = "SELECT s FROM Sysperfinfo s WHERE s.cntrValue = :cntrValue"),
    @NamedQuery(name = "Sysperfinfo.findByCntrType", query = "SELECT s FROM Sysperfinfo s WHERE s.cntrType = :cntrType")})
public class Sysperfinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "object_name")
    private String objectName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "counter_name")
    private String counterName;
    @Size(max = 128)
    @Column(name = "instance_name")
    private String instanceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cntr_value")
    private long cntrValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cntr_type")
    private int cntrType;

    public Sysperfinfo() {
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public long getCntrValue() {
        return cntrValue;
    }

    public void setCntrValue(long cntrValue) {
        this.cntrValue = cntrValue;
    }

    public int getCntrType() {
        return cntrType;
    }

    public void setCntrType(int cntrType) {
        this.cntrType = cntrType;
    }
    
}
