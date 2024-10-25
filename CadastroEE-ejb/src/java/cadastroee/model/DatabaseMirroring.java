/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "database_mirroring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseMirroring.findAll", query = "SELECT d FROM DatabaseMirroring d"),
    @NamedQuery(name = "DatabaseMirroring.findByDatabaseId", query = "SELECT d FROM DatabaseMirroring d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringGuid", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringGuid = :mirroringGuid"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringState", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringState = :mirroringState"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringStateDesc", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringStateDesc = :mirroringStateDesc"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringRole", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringRole = :mirroringRole"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringRoleDesc", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringRoleDesc = :mirroringRoleDesc"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringRoleSequence", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringRoleSequence = :mirroringRoleSequence"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringSafetyLevel", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringSafetyLevel = :mirroringSafetyLevel"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringSafetyLevelDesc", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringSafetyLevelDesc = :mirroringSafetyLevelDesc"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringSafetySequence", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringSafetySequence = :mirroringSafetySequence"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringPartnerName", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringPartnerName = :mirroringPartnerName"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringPartnerInstance", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringPartnerInstance = :mirroringPartnerInstance"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringWitnessName", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringWitnessName = :mirroringWitnessName"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringWitnessState", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringWitnessState = :mirroringWitnessState"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringWitnessStateDesc", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringWitnessStateDesc = :mirroringWitnessStateDesc"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringFailoverLsn", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringFailoverLsn = :mirroringFailoverLsn"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringConnectionTimeout", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringConnectionTimeout = :mirroringConnectionTimeout"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringRedoQueue", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringRedoQueue = :mirroringRedoQueue"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringRedoQueueType", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringRedoQueueType = :mirroringRedoQueueType"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringEndOfLogLsn", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringEndOfLogLsn = :mirroringEndOfLogLsn"),
    @NamedQuery(name = "DatabaseMirroring.findByMirroringReplicationLsn", query = "SELECT d FROM DatabaseMirroring d WHERE d.mirroringReplicationLsn = :mirroringReplicationLsn")})
public class DatabaseMirroring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Size(max = 36)
    @Column(name = "mirroring_guid")
    private String mirroringGuid;
    @Column(name = "mirroring_state")
    private Short mirroringState;
    @Size(max = 60)
    @Column(name = "mirroring_state_desc")
    private String mirroringStateDesc;
    @Column(name = "mirroring_role")
    private Short mirroringRole;
    @Size(max = 60)
    @Column(name = "mirroring_role_desc")
    private String mirroringRoleDesc;
    @Column(name = "mirroring_role_sequence")
    private Integer mirroringRoleSequence;
    @Column(name = "mirroring_safety_level")
    private Short mirroringSafetyLevel;
    @Size(max = 60)
    @Column(name = "mirroring_safety_level_desc")
    private String mirroringSafetyLevelDesc;
    @Column(name = "mirroring_safety_sequence")
    private Integer mirroringSafetySequence;
    @Size(max = 128)
    @Column(name = "mirroring_partner_name")
    private String mirroringPartnerName;
    @Size(max = 128)
    @Column(name = "mirroring_partner_instance")
    private String mirroringPartnerInstance;
    @Size(max = 128)
    @Column(name = "mirroring_witness_name")
    private String mirroringWitnessName;
    @Column(name = "mirroring_witness_state")
    private Short mirroringWitnessState;
    @Size(max = 60)
    @Column(name = "mirroring_witness_state_desc")
    private String mirroringWitnessStateDesc;
    @Column(name = "mirroring_failover_lsn")
    private BigInteger mirroringFailoverLsn;
    @Column(name = "mirroring_connection_timeout")
    private Integer mirroringConnectionTimeout;
    @Column(name = "mirroring_redo_queue")
    private Integer mirroringRedoQueue;
    @Size(max = 60)
    @Column(name = "mirroring_redo_queue_type")
    private String mirroringRedoQueueType;
    @Column(name = "mirroring_end_of_log_lsn")
    private BigInteger mirroringEndOfLogLsn;
    @Column(name = "mirroring_replication_lsn")
    private BigInteger mirroringReplicationLsn;

    public DatabaseMirroring() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid;
    }

    public Short getMirroringState() {
        return mirroringState;
    }

    public void setMirroringState(Short mirroringState) {
        this.mirroringState = mirroringState;
    }

    public String getMirroringStateDesc() {
        return mirroringStateDesc;
    }

    public void setMirroringStateDesc(String mirroringStateDesc) {
        this.mirroringStateDesc = mirroringStateDesc;
    }

    public Short getMirroringRole() {
        return mirroringRole;
    }

    public void setMirroringRole(Short mirroringRole) {
        this.mirroringRole = mirroringRole;
    }

    public String getMirroringRoleDesc() {
        return mirroringRoleDesc;
    }

    public void setMirroringRoleDesc(String mirroringRoleDesc) {
        this.mirroringRoleDesc = mirroringRoleDesc;
    }

    public Integer getMirroringRoleSequence() {
        return mirroringRoleSequence;
    }

    public void setMirroringRoleSequence(Integer mirroringRoleSequence) {
        this.mirroringRoleSequence = mirroringRoleSequence;
    }

    public Short getMirroringSafetyLevel() {
        return mirroringSafetyLevel;
    }

    public void setMirroringSafetyLevel(Short mirroringSafetyLevel) {
        this.mirroringSafetyLevel = mirroringSafetyLevel;
    }

    public String getMirroringSafetyLevelDesc() {
        return mirroringSafetyLevelDesc;
    }

    public void setMirroringSafetyLevelDesc(String mirroringSafetyLevelDesc) {
        this.mirroringSafetyLevelDesc = mirroringSafetyLevelDesc;
    }

    public Integer getMirroringSafetySequence() {
        return mirroringSafetySequence;
    }

    public void setMirroringSafetySequence(Integer mirroringSafetySequence) {
        this.mirroringSafetySequence = mirroringSafetySequence;
    }

    public String getMirroringPartnerName() {
        return mirroringPartnerName;
    }

    public void setMirroringPartnerName(String mirroringPartnerName) {
        this.mirroringPartnerName = mirroringPartnerName;
    }

    public String getMirroringPartnerInstance() {
        return mirroringPartnerInstance;
    }

    public void setMirroringPartnerInstance(String mirroringPartnerInstance) {
        this.mirroringPartnerInstance = mirroringPartnerInstance;
    }

    public String getMirroringWitnessName() {
        return mirroringWitnessName;
    }

    public void setMirroringWitnessName(String mirroringWitnessName) {
        this.mirroringWitnessName = mirroringWitnessName;
    }

    public Short getMirroringWitnessState() {
        return mirroringWitnessState;
    }

    public void setMirroringWitnessState(Short mirroringWitnessState) {
        this.mirroringWitnessState = mirroringWitnessState;
    }

    public String getMirroringWitnessStateDesc() {
        return mirroringWitnessStateDesc;
    }

    public void setMirroringWitnessStateDesc(String mirroringWitnessStateDesc) {
        this.mirroringWitnessStateDesc = mirroringWitnessStateDesc;
    }

    public BigInteger getMirroringFailoverLsn() {
        return mirroringFailoverLsn;
    }

    public void setMirroringFailoverLsn(BigInteger mirroringFailoverLsn) {
        this.mirroringFailoverLsn = mirroringFailoverLsn;
    }

    public Integer getMirroringConnectionTimeout() {
        return mirroringConnectionTimeout;
    }

    public void setMirroringConnectionTimeout(Integer mirroringConnectionTimeout) {
        this.mirroringConnectionTimeout = mirroringConnectionTimeout;
    }

    public Integer getMirroringRedoQueue() {
        return mirroringRedoQueue;
    }

    public void setMirroringRedoQueue(Integer mirroringRedoQueue) {
        this.mirroringRedoQueue = mirroringRedoQueue;
    }

    public String getMirroringRedoQueueType() {
        return mirroringRedoQueueType;
    }

    public void setMirroringRedoQueueType(String mirroringRedoQueueType) {
        this.mirroringRedoQueueType = mirroringRedoQueueType;
    }

    public BigInteger getMirroringEndOfLogLsn() {
        return mirroringEndOfLogLsn;
    }

    public void setMirroringEndOfLogLsn(BigInteger mirroringEndOfLogLsn) {
        this.mirroringEndOfLogLsn = mirroringEndOfLogLsn;
    }

    public BigInteger getMirroringReplicationLsn() {
        return mirroringReplicationLsn;
    }

    public void setMirroringReplicationLsn(BigInteger mirroringReplicationLsn) {
        this.mirroringReplicationLsn = mirroringReplicationLsn;
    }
    
}
