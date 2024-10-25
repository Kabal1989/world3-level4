/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_filestream_non_transacted_handles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findAll", query = "SELECT d FROM DmFilestreamNonTransactedHandles d"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByDatabaseId", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByObjectId", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByHandleId", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.handleId = :handleId"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByFileObjectType", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.fileObjectType = :fileObjectType"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByFileObjectTypeDesc", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.fileObjectTypeDesc = :fileObjectTypeDesc"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByState", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.state = :state"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByStateDesc", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByCurrentWorkitemType", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.currentWorkitemType = :currentWorkitemType"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByCurrentWorkitemTypeDesc", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.currentWorkitemTypeDesc = :currentWorkitemTypeDesc"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByFcbId", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.fcbId = :fcbId"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByIsDirectory", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.isDirectory = :isDirectory"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByItemName", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.itemName = :itemName"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByOpenedFileName", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.openedFileName = :openedFileName"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByDatabaseDirectoryName", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.databaseDirectoryName = :databaseDirectoryName"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByTableDirectoryName", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.tableDirectoryName = :tableDirectoryName"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByRemainingFileName", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.remainingFileName = :remainingFileName"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByOpenTime", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.openTime = :openTime"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByFlags", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.flags = :flags"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByLoginId", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.loginId = :loginId"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByLoginName", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.loginName = :loginName"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByReadAccess", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.readAccess = :readAccess"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByWriteAccess", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.writeAccess = :writeAccess"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByDeleteAccess", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.deleteAccess = :deleteAccess"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByShareRead", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.shareRead = :shareRead"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByShareWrite", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.shareWrite = :shareWrite"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByShareDelete", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.shareDelete = :shareDelete"),
    @NamedQuery(name = "DmFilestreamNonTransactedHandles.findByCreateDisposition", query = "SELECT d FROM DmFilestreamNonTransactedHandles d WHERE d.createDisposition = :createDisposition")})
public class DmFilestreamNonTransactedHandles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "handle_id")
    private Integer handleId;
    @Column(name = "file_object_type")
    private Integer fileObjectType;
    @Size(max = 60)
    @Column(name = "file_object_type_desc")
    private String fileObjectTypeDesc;
    @Lob
    @Column(name = "correlation_process_id")
    private byte[] correlationProcessId;
    @Lob
    @Column(name = "correlation_thread_id")
    private byte[] correlationThreadId;
    @Lob
    @Column(name = "file_context")
    private byte[] fileContext;
    @Column(name = "state")
    private Integer state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Column(name = "current_workitem_type")
    private Integer currentWorkitemType;
    @Size(max = 60)
    @Column(name = "current_workitem_type_desc")
    private String currentWorkitemTypeDesc;
    @Column(name = "fcb_id")
    private BigInteger fcbId;
    @Lob
    @Column(name = "item_id")
    private byte[] itemId;
    @Column(name = "is_directory")
    private Boolean isDirectory;
    @Size(max = 256)
    @Column(name = "item_name")
    private String itemName;
    @Size(max = 256)
    @Column(name = "opened_file_name")
    private String openedFileName;
    @Size(max = 256)
    @Column(name = "database_directory_name")
    private String databaseDirectoryName;
    @Size(max = 256)
    @Column(name = "table_directory_name")
    private String tableDirectoryName;
    @Size(max = 256)
    @Column(name = "remaining_file_name")
    private String remainingFileName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openTime;
    @Column(name = "flags")
    private Integer flags;
    @Column(name = "login_id")
    private Integer loginId;
    @Size(max = 256)
    @Column(name = "login_name")
    private String loginName;
    @Lob
    @Column(name = "login_sid")
    private byte[] loginSid;
    @Column(name = "read_access")
    private Boolean readAccess;
    @Column(name = "write_access")
    private Boolean writeAccess;
    @Column(name = "delete_access")
    private Boolean deleteAccess;
    @Column(name = "share_read")
    private Boolean shareRead;
    @Column(name = "share_write")
    private Boolean shareWrite;
    @Column(name = "share_delete")
    private Boolean shareDelete;
    @Column(name = "create_disposition")
    private Integer createDisposition;

    public DmFilestreamNonTransactedHandles() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getHandleId() {
        return handleId;
    }

    public void setHandleId(Integer handleId) {
        this.handleId = handleId;
    }

    public Integer getFileObjectType() {
        return fileObjectType;
    }

    public void setFileObjectType(Integer fileObjectType) {
        this.fileObjectType = fileObjectType;
    }

    public String getFileObjectTypeDesc() {
        return fileObjectTypeDesc;
    }

    public void setFileObjectTypeDesc(String fileObjectTypeDesc) {
        this.fileObjectTypeDesc = fileObjectTypeDesc;
    }

    public byte[] getCorrelationProcessId() {
        return correlationProcessId;
    }

    public void setCorrelationProcessId(byte[] correlationProcessId) {
        this.correlationProcessId = correlationProcessId;
    }

    public byte[] getCorrelationThreadId() {
        return correlationThreadId;
    }

    public void setCorrelationThreadId(byte[] correlationThreadId) {
        this.correlationThreadId = correlationThreadId;
    }

    public byte[] getFileContext() {
        return fileContext;
    }

    public void setFileContext(byte[] fileContext) {
        this.fileContext = fileContext;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Integer getCurrentWorkitemType() {
        return currentWorkitemType;
    }

    public void setCurrentWorkitemType(Integer currentWorkitemType) {
        this.currentWorkitemType = currentWorkitemType;
    }

    public String getCurrentWorkitemTypeDesc() {
        return currentWorkitemTypeDesc;
    }

    public void setCurrentWorkitemTypeDesc(String currentWorkitemTypeDesc) {
        this.currentWorkitemTypeDesc = currentWorkitemTypeDesc;
    }

    public BigInteger getFcbId() {
        return fcbId;
    }

    public void setFcbId(BigInteger fcbId) {
        this.fcbId = fcbId;
    }

    public byte[] getItemId() {
        return itemId;
    }

    public void setItemId(byte[] itemId) {
        this.itemId = itemId;
    }

    public Boolean getIsDirectory() {
        return isDirectory;
    }

    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getOpenedFileName() {
        return openedFileName;
    }

    public void setOpenedFileName(String openedFileName) {
        this.openedFileName = openedFileName;
    }

    public String getDatabaseDirectoryName() {
        return databaseDirectoryName;
    }

    public void setDatabaseDirectoryName(String databaseDirectoryName) {
        this.databaseDirectoryName = databaseDirectoryName;
    }

    public String getTableDirectoryName() {
        return tableDirectoryName;
    }

    public void setTableDirectoryName(String tableDirectoryName) {
        this.tableDirectoryName = tableDirectoryName;
    }

    public String getRemainingFileName() {
        return remainingFileName;
    }

    public void setRemainingFileName(String remainingFileName) {
        this.remainingFileName = remainingFileName;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public byte[] getLoginSid() {
        return loginSid;
    }

    public void setLoginSid(byte[] loginSid) {
        this.loginSid = loginSid;
    }

    public Boolean getReadAccess() {
        return readAccess;
    }

    public void setReadAccess(Boolean readAccess) {
        this.readAccess = readAccess;
    }

    public Boolean getWriteAccess() {
        return writeAccess;
    }

    public void setWriteAccess(Boolean writeAccess) {
        this.writeAccess = writeAccess;
    }

    public Boolean getDeleteAccess() {
        return deleteAccess;
    }

    public void setDeleteAccess(Boolean deleteAccess) {
        this.deleteAccess = deleteAccess;
    }

    public Boolean getShareRead() {
        return shareRead;
    }

    public void setShareRead(Boolean shareRead) {
        this.shareRead = shareRead;
    }

    public Boolean getShareWrite() {
        return shareWrite;
    }

    public void setShareWrite(Boolean shareWrite) {
        this.shareWrite = shareWrite;
    }

    public Boolean getShareDelete() {
        return shareDelete;
    }

    public void setShareDelete(Boolean shareDelete) {
        this.shareDelete = shareDelete;
    }

    public Integer getCreateDisposition() {
        return createDisposition;
    }

    public void setCreateDisposition(Integer createDisposition) {
        this.createDisposition = createDisposition;
    }
    
}
