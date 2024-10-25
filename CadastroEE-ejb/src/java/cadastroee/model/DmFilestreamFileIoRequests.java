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
@Table(name = "dm_filestream_file_io_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFilestreamFileIoRequests.findAll", query = "SELECT d FROM DmFilestreamFileIoRequests d"),
    @NamedQuery(name = "DmFilestreamFileIoRequests.findByCurrentSpid", query = "SELECT d FROM DmFilestreamFileIoRequests d WHERE d.currentSpid = :currentSpid"),
    @NamedQuery(name = "DmFilestreamFileIoRequests.findByRequestType", query = "SELECT d FROM DmFilestreamFileIoRequests d WHERE d.requestType = :requestType"),
    @NamedQuery(name = "DmFilestreamFileIoRequests.findByRequestState", query = "SELECT d FROM DmFilestreamFileIoRequests d WHERE d.requestState = :requestState"),
    @NamedQuery(name = "DmFilestreamFileIoRequests.findByRequestId", query = "SELECT d FROM DmFilestreamFileIoRequests d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmFilestreamFileIoRequests.findByIrpId", query = "SELECT d FROM DmFilestreamFileIoRequests d WHERE d.irpId = :irpId"),
    @NamedQuery(name = "DmFilestreamFileIoRequests.findByHandleId", query = "SELECT d FROM DmFilestreamFileIoRequests d WHERE d.handleId = :handleId")})
public class DmFilestreamFileIoRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "request_context_address")
    private byte[] requestContextAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_spid")
    private short currentSpid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_type")
    private String requestType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_state")
    private String requestState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_id")
    private int requestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "irp_id")
    private int irpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "handle_id")
    private int handleId;
    @Lob
    @Column(name = "client_thread_id")
    private byte[] clientThreadId;
    @Lob
    @Column(name = "client_process_id")
    private byte[] clientProcessId;
    @Lob
    @Column(name = "handle_context_address")
    private byte[] handleContextAddress;
    @Lob
    @Column(name = "filestream_transaction_id")
    private byte[] filestreamTransactionId;

    public DmFilestreamFileIoRequests() {
    }

    public byte[] getRequestContextAddress() {
        return requestContextAddress;
    }

    public void setRequestContextAddress(byte[] requestContextAddress) {
        this.requestContextAddress = requestContextAddress;
    }

    public short getCurrentSpid() {
        return currentSpid;
    }

    public void setCurrentSpid(short currentSpid) {
        this.currentSpid = currentSpid;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestState() {
        return requestState;
    }

    public void setRequestState(String requestState) {
        this.requestState = requestState;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getIrpId() {
        return irpId;
    }

    public void setIrpId(int irpId) {
        this.irpId = irpId;
    }

    public int getHandleId() {
        return handleId;
    }

    public void setHandleId(int handleId) {
        this.handleId = handleId;
    }

    public byte[] getClientThreadId() {
        return clientThreadId;
    }

    public void setClientThreadId(byte[] clientThreadId) {
        this.clientThreadId = clientThreadId;
    }

    public byte[] getClientProcessId() {
        return clientProcessId;
    }

    public void setClientProcessId(byte[] clientProcessId) {
        this.clientProcessId = clientProcessId;
    }

    public byte[] getHandleContextAddress() {
        return handleContextAddress;
    }

    public void setHandleContextAddress(byte[] handleContextAddress) {
        this.handleContextAddress = handleContextAddress;
    }

    public byte[] getFilestreamTransactionId() {
        return filestreamTransactionId;
    }

    public void setFilestreamTransactionId(byte[] filestreamTransactionId) {
        this.filestreamTransactionId = filestreamTransactionId;
    }
    
}
