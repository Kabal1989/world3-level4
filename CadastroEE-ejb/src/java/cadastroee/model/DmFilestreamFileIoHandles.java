/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_filestream_file_io_handles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFilestreamFileIoHandles.findAll", query = "SELECT d FROM DmFilestreamFileIoHandles d"),
    @NamedQuery(name = "DmFilestreamFileIoHandles.findByCreationRequestId", query = "SELECT d FROM DmFilestreamFileIoHandles d WHERE d.creationRequestId = :creationRequestId"),
    @NamedQuery(name = "DmFilestreamFileIoHandles.findByCreationIrpId", query = "SELECT d FROM DmFilestreamFileIoHandles d WHERE d.creationIrpId = :creationIrpId"),
    @NamedQuery(name = "DmFilestreamFileIoHandles.findByHandleId", query = "SELECT d FROM DmFilestreamFileIoHandles d WHERE d.handleId = :handleId"),
    @NamedQuery(name = "DmFilestreamFileIoHandles.findByAccessType", query = "SELECT d FROM DmFilestreamFileIoHandles d WHERE d.accessType = :accessType"),
    @NamedQuery(name = "DmFilestreamFileIoHandles.findByLogicalPath", query = "SELECT d FROM DmFilestreamFileIoHandles d WHERE d.logicalPath = :logicalPath"),
    @NamedQuery(name = "DmFilestreamFileIoHandles.findByPhysicalPath", query = "SELECT d FROM DmFilestreamFileIoHandles d WHERE d.physicalPath = :physicalPath")})
public class DmFilestreamFileIoHandles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "handle_context_address")
    private byte[] handleContextAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_request_id")
    private int creationRequestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_irp_id")
    private int creationIrpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "handle_id")
    private int handleId;
    @Lob
    @Column(name = "creation_client_thread_id")
    private byte[] creationClientThreadId;
    @Lob
    @Column(name = "creation_client_process_id")
    private byte[] creationClientProcessId;
    @Lob
    @Column(name = "filestream_transaction_id")
    private byte[] filestreamTransactionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "access_type")
    private String accessType;
    @Size(max = 256)
    @Column(name = "logical_path")
    private String logicalPath;
    @Size(max = 256)
    @Column(name = "physical_path")
    private String physicalPath;

    public DmFilestreamFileIoHandles() {
    }

    public byte[] getHandleContextAddress() {
        return handleContextAddress;
    }

    public void setHandleContextAddress(byte[] handleContextAddress) {
        this.handleContextAddress = handleContextAddress;
    }

    public int getCreationRequestId() {
        return creationRequestId;
    }

    public void setCreationRequestId(int creationRequestId) {
        this.creationRequestId = creationRequestId;
    }

    public int getCreationIrpId() {
        return creationIrpId;
    }

    public void setCreationIrpId(int creationIrpId) {
        this.creationIrpId = creationIrpId;
    }

    public int getHandleId() {
        return handleId;
    }

    public void setHandleId(int handleId) {
        this.handleId = handleId;
    }

    public byte[] getCreationClientThreadId() {
        return creationClientThreadId;
    }

    public void setCreationClientThreadId(byte[] creationClientThreadId) {
        this.creationClientThreadId = creationClientThreadId;
    }

    public byte[] getCreationClientProcessId() {
        return creationClientProcessId;
    }

    public void setCreationClientProcessId(byte[] creationClientProcessId) {
        this.creationClientProcessId = creationClientProcessId;
    }

    public byte[] getFilestreamTransactionId() {
        return filestreamTransactionId;
    }

    public void setFilestreamTransactionId(byte[] filestreamTransactionId) {
        this.filestreamTransactionId = filestreamTransactionId;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getLogicalPath() {
        return logicalPath;
    }

    public void setLogicalPath(String logicalPath) {
        this.logicalPath = logicalPath;
    }

    public String getPhysicalPath() {
        return physicalPath;
    }

    public void setPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
    }
    
}
