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
@Table(name = "resource_governor_configuration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResourceGovernorConfiguration.findAll", query = "SELECT r FROM ResourceGovernorConfiguration r"),
    @NamedQuery(name = "ResourceGovernorConfiguration.findByClassifierFunctionId", query = "SELECT r FROM ResourceGovernorConfiguration r WHERE r.classifierFunctionId = :classifierFunctionId"),
    @NamedQuery(name = "ResourceGovernorConfiguration.findByIsEnabled", query = "SELECT r FROM ResourceGovernorConfiguration r WHERE r.isEnabled = :isEnabled"),
    @NamedQuery(name = "ResourceGovernorConfiguration.findByMaxOutstandingIoPerVolume", query = "SELECT r FROM ResourceGovernorConfiguration r WHERE r.maxOutstandingIoPerVolume = :maxOutstandingIoPerVolume")})
public class ResourceGovernorConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "classifier_function_id")
    private int classifierFunctionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_enabled")
    private boolean isEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_outstanding_io_per_volume")
    private int maxOutstandingIoPerVolume;

    public ResourceGovernorConfiguration() {
    }

    public int getClassifierFunctionId() {
        return classifierFunctionId;
    }

    public void setClassifierFunctionId(int classifierFunctionId) {
        this.classifierFunctionId = classifierFunctionId;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public int getMaxOutstandingIoPerVolume() {
        return maxOutstandingIoPerVolume;
    }

    public void setMaxOutstandingIoPerVolume(int maxOutstandingIoPerVolume) {
        this.maxOutstandingIoPerVolume = maxOutstandingIoPerVolume;
    }
    
}
