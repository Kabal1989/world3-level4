/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_io_backup_tapes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmIoBackupTapes.findAll", query = "SELECT d FROM DmIoBackupTapes d"),
    @NamedQuery(name = "DmIoBackupTapes.findByPhysicalDeviceName", query = "SELECT d FROM DmIoBackupTapes d WHERE d.physicalDeviceName = :physicalDeviceName"),
    @NamedQuery(name = "DmIoBackupTapes.findByLogicalDeviceName", query = "SELECT d FROM DmIoBackupTapes d WHERE d.logicalDeviceName = :logicalDeviceName"),
    @NamedQuery(name = "DmIoBackupTapes.findByStatus", query = "SELECT d FROM DmIoBackupTapes d WHERE d.status = :status"),
    @NamedQuery(name = "DmIoBackupTapes.findByStatusDesc", query = "SELECT d FROM DmIoBackupTapes d WHERE d.statusDesc = :statusDesc"),
    @NamedQuery(name = "DmIoBackupTapes.findByMountRequestTime", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mountRequestTime = :mountRequestTime"),
    @NamedQuery(name = "DmIoBackupTapes.findByMountExpirationTime", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mountExpirationTime = :mountExpirationTime"),
    @NamedQuery(name = "DmIoBackupTapes.findByDatabaseName", query = "SELECT d FROM DmIoBackupTapes d WHERE d.databaseName = :databaseName"),
    @NamedQuery(name = "DmIoBackupTapes.findBySpid", query = "SELECT d FROM DmIoBackupTapes d WHERE d.spid = :spid"),
    @NamedQuery(name = "DmIoBackupTapes.findByCommand", query = "SELECT d FROM DmIoBackupTapes d WHERE d.command = :command"),
    @NamedQuery(name = "DmIoBackupTapes.findByCommandDesc", query = "SELECT d FROM DmIoBackupTapes d WHERE d.commandDesc = :commandDesc"),
    @NamedQuery(name = "DmIoBackupTapes.findByMediaFamilyId", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mediaFamilyId = :mediaFamilyId"),
    @NamedQuery(name = "DmIoBackupTapes.findByMediaSetName", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mediaSetName = :mediaSetName"),
    @NamedQuery(name = "DmIoBackupTapes.findByMediaSetGuid", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mediaSetGuid = :mediaSetGuid"),
    @NamedQuery(name = "DmIoBackupTapes.findByMediaSequenceNumber", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mediaSequenceNumber = :mediaSequenceNumber"),
    @NamedQuery(name = "DmIoBackupTapes.findByTapeOperation", query = "SELECT d FROM DmIoBackupTapes d WHERE d.tapeOperation = :tapeOperation"),
    @NamedQuery(name = "DmIoBackupTapes.findByTapeOperationDesc", query = "SELECT d FROM DmIoBackupTapes d WHERE d.tapeOperationDesc = :tapeOperationDesc"),
    @NamedQuery(name = "DmIoBackupTapes.findByMountRequestType", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mountRequestType = :mountRequestType"),
    @NamedQuery(name = "DmIoBackupTapes.findByMountRequestTypeDesc", query = "SELECT d FROM DmIoBackupTapes d WHERE d.mountRequestTypeDesc = :mountRequestTypeDesc")})
public class DmIoBackupTapes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "physical_device_name")
    private String physicalDeviceName;
    @Size(max = 128)
    @Column(name = "logical_device_name")
    private String logicalDeviceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "status_desc")
    private String statusDesc;
    @Column(name = "mount_request_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mountRequestTime;
    @Column(name = "mount_expiration_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mountExpirationTime;
    @Size(max = 128)
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "spid")
    private Integer spid;
    @Column(name = "command")
    private Integer command;
    @Size(max = 60)
    @Column(name = "command_desc")
    private String commandDesc;
    @Column(name = "media_family_id")
    private Integer mediaFamilyId;
    @Size(max = 128)
    @Column(name = "media_set_name")
    private String mediaSetName;
    @Size(max = 36)
    @Column(name = "media_set_guid")
    private String mediaSetGuid;
    @Column(name = "media_sequence_number")
    private Integer mediaSequenceNumber;
    @Column(name = "tape_operation")
    private Integer tapeOperation;
    @Size(max = 60)
    @Column(name = "tape_operation_desc")
    private String tapeOperationDesc;
    @Column(name = "mount_request_type")
    private Integer mountRequestType;
    @Size(max = 60)
    @Column(name = "mount_request_type_desc")
    private String mountRequestTypeDesc;

    public DmIoBackupTapes() {
    }

    public String getPhysicalDeviceName() {
        return physicalDeviceName;
    }

    public void setPhysicalDeviceName(String physicalDeviceName) {
        this.physicalDeviceName = physicalDeviceName;
    }

    public String getLogicalDeviceName() {
        return logicalDeviceName;
    }

    public void setLogicalDeviceName(String logicalDeviceName) {
        this.logicalDeviceName = logicalDeviceName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Date getMountRequestTime() {
        return mountRequestTime;
    }

    public void setMountRequestTime(Date mountRequestTime) {
        this.mountRequestTime = mountRequestTime;
    }

    public Date getMountExpirationTime() {
        return mountExpirationTime;
    }

    public void setMountExpirationTime(Date mountExpirationTime) {
        this.mountExpirationTime = mountExpirationTime;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getCommand() {
        return command;
    }

    public void setCommand(Integer command) {
        this.command = command;
    }

    public String getCommandDesc() {
        return commandDesc;
    }

    public void setCommandDesc(String commandDesc) {
        this.commandDesc = commandDesc;
    }

    public Integer getMediaFamilyId() {
        return mediaFamilyId;
    }

    public void setMediaFamilyId(Integer mediaFamilyId) {
        this.mediaFamilyId = mediaFamilyId;
    }

    public String getMediaSetName() {
        return mediaSetName;
    }

    public void setMediaSetName(String mediaSetName) {
        this.mediaSetName = mediaSetName;
    }

    public String getMediaSetGuid() {
        return mediaSetGuid;
    }

    public void setMediaSetGuid(String mediaSetGuid) {
        this.mediaSetGuid = mediaSetGuid;
    }

    public Integer getMediaSequenceNumber() {
        return mediaSequenceNumber;
    }

    public void setMediaSequenceNumber(Integer mediaSequenceNumber) {
        this.mediaSequenceNumber = mediaSequenceNumber;
    }

    public Integer getTapeOperation() {
        return tapeOperation;
    }

    public void setTapeOperation(Integer tapeOperation) {
        this.tapeOperation = tapeOperation;
    }

    public String getTapeOperationDesc() {
        return tapeOperationDesc;
    }

    public void setTapeOperationDesc(String tapeOperationDesc) {
        this.tapeOperationDesc = tapeOperationDesc;
    }

    public Integer getMountRequestType() {
        return mountRequestType;
    }

    public void setMountRequestType(Integer mountRequestType) {
        this.mountRequestType = mountRequestType;
    }

    public String getMountRequestTypeDesc() {
        return mountRequestTypeDesc;
    }

    public void setMountRequestTypeDesc(String mountRequestTypeDesc) {
        this.mountRequestTypeDesc = mountRequestTypeDesc;
    }
    
}
