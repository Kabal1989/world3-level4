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
@Table(name = "dm_io_pending_io_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmIoPendingIoRequests.findAll", query = "SELECT d FROM DmIoPendingIoRequests d"),
    @NamedQuery(name = "DmIoPendingIoRequests.findByIoType", query = "SELECT d FROM DmIoPendingIoRequests d WHERE d.ioType = :ioType"),
    @NamedQuery(name = "DmIoPendingIoRequests.findByIoPendingMsTicks", query = "SELECT d FROM DmIoPendingIoRequests d WHERE d.ioPendingMsTicks = :ioPendingMsTicks"),
    @NamedQuery(name = "DmIoPendingIoRequests.findByIoPending", query = "SELECT d FROM DmIoPendingIoRequests d WHERE d.ioPending = :ioPending"),
    @NamedQuery(name = "DmIoPendingIoRequests.findByIoOffset", query = "SELECT d FROM DmIoPendingIoRequests d WHERE d.ioOffset = :ioOffset"),
    @NamedQuery(name = "DmIoPendingIoRequests.findByIoHandlePath", query = "SELECT d FROM DmIoPendingIoRequests d WHERE d.ioHandlePath = :ioHandlePath")})
public class DmIoPendingIoRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "io_completion_request_address")
    private byte[] ioCompletionRequestAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "io_type")
    private String ioType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_pending_ms_ticks")
    private long ioPendingMsTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_pending")
    private int ioPending;
    @Lob
    @Column(name = "io_completion_routine_address")
    private byte[] ioCompletionRoutineAddress;
    @Lob
    @Column(name = "io_user_data_address")
    private byte[] ioUserDataAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "scheduler_address")
    private byte[] schedulerAddress;
    @Lob
    @Column(name = "io_handle")
    private byte[] ioHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_offset")
    private long ioOffset;
    @Size(max = 256)
    @Column(name = "io_handle_path")
    private String ioHandlePath;

    public DmIoPendingIoRequests() {
    }

    public byte[] getIoCompletionRequestAddress() {
        return ioCompletionRequestAddress;
    }

    public void setIoCompletionRequestAddress(byte[] ioCompletionRequestAddress) {
        this.ioCompletionRequestAddress = ioCompletionRequestAddress;
    }

    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType;
    }

    public long getIoPendingMsTicks() {
        return ioPendingMsTicks;
    }

    public void setIoPendingMsTicks(long ioPendingMsTicks) {
        this.ioPendingMsTicks = ioPendingMsTicks;
    }

    public int getIoPending() {
        return ioPending;
    }

    public void setIoPending(int ioPending) {
        this.ioPending = ioPending;
    }

    public byte[] getIoCompletionRoutineAddress() {
        return ioCompletionRoutineAddress;
    }

    public void setIoCompletionRoutineAddress(byte[] ioCompletionRoutineAddress) {
        this.ioCompletionRoutineAddress = ioCompletionRoutineAddress;
    }

    public byte[] getIoUserDataAddress() {
        return ioUserDataAddress;
    }

    public void setIoUserDataAddress(byte[] ioUserDataAddress) {
        this.ioUserDataAddress = ioUserDataAddress;
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public byte[] getIoHandle() {
        return ioHandle;
    }

    public void setIoHandle(byte[] ioHandle) {
        this.ioHandle = ioHandle;
    }

    public long getIoOffset() {
        return ioOffset;
    }

    public void setIoOffset(long ioOffset) {
        this.ioOffset = ioOffset;
    }

    public String getIoHandlePath() {
        return ioHandlePath;
    }

    public void setIoHandlePath(String ioHandlePath) {
        this.ioHandlePath = ioHandlePath;
    }
    
}
