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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_resource_governor_configuration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorConfiguration.findAll", query = "SELECT d FROM DmResourceGovernorConfiguration d"),
    @NamedQuery(name = "DmResourceGovernorConfiguration.findByClassifierFunctionId", query = "SELECT d FROM DmResourceGovernorConfiguration d WHERE d.classifierFunctionId = :classifierFunctionId"),
    @NamedQuery(name = "DmResourceGovernorConfiguration.findByIsReconfigurationPending", query = "SELECT d FROM DmResourceGovernorConfiguration d WHERE d.isReconfigurationPending = :isReconfigurationPending"),
    @NamedQuery(name = "DmResourceGovernorConfiguration.findByMaxOutstandingIoPerVolume", query = "SELECT d FROM DmResourceGovernorConfiguration d WHERE d.maxOutstandingIoPerVolume = :maxOutstandingIoPerVolume")})
public class DmResourceGovernorConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "classifier_function_id")
    private int classifierFunctionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_reconfiguration_pending")
    private short isReconfigurationPending;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_outstanding_io_per_volume")
    private int maxOutstandingIoPerVolume;

    public DmResourceGovernorConfiguration() {
    }

    public int getClassifierFunctionId() {
        return classifierFunctionId;
    }

    public void setClassifierFunctionId(int classifierFunctionId) {
        this.classifierFunctionId = classifierFunctionId;
    }

    public short getIsReconfigurationPending() {
        return isReconfigurationPending;
    }

    public void setIsReconfigurationPending(short isReconfigurationPending) {
        this.isReconfigurationPending = isReconfigurationPending;
    }

    public int getMaxOutstandingIoPerVolume() {
        return maxOutstandingIoPerVolume;
    }

    public void setMaxOutstandingIoPerVolume(int maxOutstandingIoPerVolume) {
        this.maxOutstandingIoPerVolume = maxOutstandingIoPerVolume;
    }
    
}
