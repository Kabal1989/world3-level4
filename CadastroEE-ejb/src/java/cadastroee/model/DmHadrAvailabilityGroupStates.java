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
@Table(name = "dm_hadr_availability_group_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findAll", query = "SELECT d FROM DmHadrAvailabilityGroupStates d"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findByGroupId", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findByPrimaryReplica", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.primaryReplica = :primaryReplica"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findByPrimaryRecoveryHealth", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.primaryRecoveryHealth = :primaryRecoveryHealth"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findByPrimaryRecoveryHealthDesc", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.primaryRecoveryHealthDesc = :primaryRecoveryHealthDesc"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findBySecondaryRecoveryHealth", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.secondaryRecoveryHealth = :secondaryRecoveryHealth"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findBySecondaryRecoveryHealthDesc", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.secondaryRecoveryHealthDesc = :secondaryRecoveryHealthDesc"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findBySynchronizationHealth", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.synchronizationHealth = :synchronizationHealth"),
    @NamedQuery(name = "DmHadrAvailabilityGroupStates.findBySynchronizationHealthDesc", query = "SELECT d FROM DmHadrAvailabilityGroupStates d WHERE d.synchronizationHealthDesc = :synchronizationHealthDesc")})
public class DmHadrAvailabilityGroupStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Size(max = 128)
    @Column(name = "primary_replica")
    private String primaryReplica;
    @Column(name = "primary_recovery_health")
    private Short primaryRecoveryHealth;
    @Size(max = 60)
    @Column(name = "primary_recovery_health_desc")
    private String primaryRecoveryHealthDesc;
    @Column(name = "secondary_recovery_health")
    private Short secondaryRecoveryHealth;
    @Size(max = 60)
    @Column(name = "secondary_recovery_health_desc")
    private String secondaryRecoveryHealthDesc;
    @Column(name = "synchronization_health")
    private Short synchronizationHealth;
    @Size(max = 60)
    @Column(name = "synchronization_health_desc")
    private String synchronizationHealthDesc;

    public DmHadrAvailabilityGroupStates() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPrimaryReplica() {
        return primaryReplica;
    }

    public void setPrimaryReplica(String primaryReplica) {
        this.primaryReplica = primaryReplica;
    }

    public Short getPrimaryRecoveryHealth() {
        return primaryRecoveryHealth;
    }

    public void setPrimaryRecoveryHealth(Short primaryRecoveryHealth) {
        this.primaryRecoveryHealth = primaryRecoveryHealth;
    }

    public String getPrimaryRecoveryHealthDesc() {
        return primaryRecoveryHealthDesc;
    }

    public void setPrimaryRecoveryHealthDesc(String primaryRecoveryHealthDesc) {
        this.primaryRecoveryHealthDesc = primaryRecoveryHealthDesc;
    }

    public Short getSecondaryRecoveryHealth() {
        return secondaryRecoveryHealth;
    }

    public void setSecondaryRecoveryHealth(Short secondaryRecoveryHealth) {
        this.secondaryRecoveryHealth = secondaryRecoveryHealth;
    }

    public String getSecondaryRecoveryHealthDesc() {
        return secondaryRecoveryHealthDesc;
    }

    public void setSecondaryRecoveryHealthDesc(String secondaryRecoveryHealthDesc) {
        this.secondaryRecoveryHealthDesc = secondaryRecoveryHealthDesc;
    }

    public Short getSynchronizationHealth() {
        return synchronizationHealth;
    }

    public void setSynchronizationHealth(Short synchronizationHealth) {
        this.synchronizationHealth = synchronizationHealth;
    }

    public String getSynchronizationHealthDesc() {
        return synchronizationHealthDesc;
    }

    public void setSynchronizationHealthDesc(String synchronizationHealthDesc) {
        this.synchronizationHealthDesc = synchronizationHealthDesc;
    }
    
}
