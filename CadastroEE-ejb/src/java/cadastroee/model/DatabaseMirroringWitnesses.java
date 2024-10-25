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
@Table(name = "database_mirroring_witnesses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseMirroringWitnesses.findAll", query = "SELECT d FROM DatabaseMirroringWitnesses d"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByDatabaseName", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.databaseName = :databaseName"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByPrincipalServerName", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.principalServerName = :principalServerName"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByMirrorServerName", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.mirrorServerName = :mirrorServerName"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findBySafetyLevel", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.safetyLevel = :safetyLevel"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findBySafetyLevelDesc", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.safetyLevelDesc = :safetyLevelDesc"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findBySafetySequenceNumber", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.safetySequenceNumber = :safetySequenceNumber"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByRoleSequenceNumber", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.roleSequenceNumber = :roleSequenceNumber"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByMirroringGuid", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.mirroringGuid = :mirroringGuid"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByFamilyGuid", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.familyGuid = :familyGuid"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByIsSuspended", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.isSuspended = :isSuspended"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByIsSuspendedSequenceNumber", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.isSuspendedSequenceNumber = :isSuspendedSequenceNumber"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByPartnerSyncState", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.partnerSyncState = :partnerSyncState"),
    @NamedQuery(name = "DatabaseMirroringWitnesses.findByPartnerSyncStateDesc", query = "SELECT d FROM DatabaseMirroringWitnesses d WHERE d.partnerSyncStateDesc = :partnerSyncStateDesc")})
public class DatabaseMirroringWitnesses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "database_name")
    private String databaseName;
    @Size(max = 128)
    @Column(name = "principal_server_name")
    private String principalServerName;
    @Size(max = 128)
    @Column(name = "mirror_server_name")
    private String mirrorServerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "safety_level")
    private short safetyLevel;
    @Size(max = 60)
    @Column(name = "safety_level_desc")
    private String safetyLevelDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "safety_sequence_number")
    private int safetySequenceNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_sequence_number")
    private int roleSequenceNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "mirroring_guid")
    private String mirroringGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "family_guid")
    private String familyGuid;
    @Column(name = "is_suspended")
    private Boolean isSuspended;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_suspended_sequence_number")
    private int isSuspendedSequenceNumber;
    @Column(name = "partner_sync_state")
    private Short partnerSyncState;
    @Size(max = 60)
    @Column(name = "partner_sync_state_desc")
    private String partnerSyncStateDesc;

    public DatabaseMirroringWitnesses() {
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getPrincipalServerName() {
        return principalServerName;
    }

    public void setPrincipalServerName(String principalServerName) {
        this.principalServerName = principalServerName;
    }

    public String getMirrorServerName() {
        return mirrorServerName;
    }

    public void setMirrorServerName(String mirrorServerName) {
        this.mirrorServerName = mirrorServerName;
    }

    public short getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(short safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    public String getSafetyLevelDesc() {
        return safetyLevelDesc;
    }

    public void setSafetyLevelDesc(String safetyLevelDesc) {
        this.safetyLevelDesc = safetyLevelDesc;
    }

    public int getSafetySequenceNumber() {
        return safetySequenceNumber;
    }

    public void setSafetySequenceNumber(int safetySequenceNumber) {
        this.safetySequenceNumber = safetySequenceNumber;
    }

    public int getRoleSequenceNumber() {
        return roleSequenceNumber;
    }

    public void setRoleSequenceNumber(int roleSequenceNumber) {
        this.roleSequenceNumber = roleSequenceNumber;
    }

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid;
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid;
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    public int getIsSuspendedSequenceNumber() {
        return isSuspendedSequenceNumber;
    }

    public void setIsSuspendedSequenceNumber(int isSuspendedSequenceNumber) {
        this.isSuspendedSequenceNumber = isSuspendedSequenceNumber;
    }

    public Short getPartnerSyncState() {
        return partnerSyncState;
    }

    public void setPartnerSyncState(Short partnerSyncState) {
        this.partnerSyncState = partnerSyncState;
    }

    public String getPartnerSyncStateDesc() {
        return partnerSyncStateDesc;
    }

    public void setPartnerSyncStateDesc(String partnerSyncStateDesc) {
        this.partnerSyncStateDesc = partnerSyncStateDesc;
    }
    
}
