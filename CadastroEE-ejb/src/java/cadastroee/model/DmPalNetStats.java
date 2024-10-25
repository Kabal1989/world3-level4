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
@Table(name = "dm_pal_net_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalNetStats.findAll", query = "SELECT d FROM DmPalNetStats d"),
    @NamedQuery(name = "DmPalNetStats.findByInterface1", query = "SELECT d FROM DmPalNetStats d WHERE d.interface1 = :interface1"),
    @NamedQuery(name = "DmPalNetStats.findByRecvBytes", query = "SELECT d FROM DmPalNetStats d WHERE d.recvBytes = :recvBytes"),
    @NamedQuery(name = "DmPalNetStats.findByRecvPackets", query = "SELECT d FROM DmPalNetStats d WHERE d.recvPackets = :recvPackets"),
    @NamedQuery(name = "DmPalNetStats.findByRecvErrors", query = "SELECT d FROM DmPalNetStats d WHERE d.recvErrors = :recvErrors"),
    @NamedQuery(name = "DmPalNetStats.findByRecvDrops", query = "SELECT d FROM DmPalNetStats d WHERE d.recvDrops = :recvDrops"),
    @NamedQuery(name = "DmPalNetStats.findByRecvFifo", query = "SELECT d FROM DmPalNetStats d WHERE d.recvFifo = :recvFifo"),
    @NamedQuery(name = "DmPalNetStats.findByRecvFrame", query = "SELECT d FROM DmPalNetStats d WHERE d.recvFrame = :recvFrame"),
    @NamedQuery(name = "DmPalNetStats.findByRecvCompressed", query = "SELECT d FROM DmPalNetStats d WHERE d.recvCompressed = :recvCompressed"),
    @NamedQuery(name = "DmPalNetStats.findByRecvMulticast", query = "SELECT d FROM DmPalNetStats d WHERE d.recvMulticast = :recvMulticast"),
    @NamedQuery(name = "DmPalNetStats.findByTxBytes", query = "SELECT d FROM DmPalNetStats d WHERE d.txBytes = :txBytes"),
    @NamedQuery(name = "DmPalNetStats.findByTxPackets", query = "SELECT d FROM DmPalNetStats d WHERE d.txPackets = :txPackets"),
    @NamedQuery(name = "DmPalNetStats.findByTxErrors", query = "SELECT d FROM DmPalNetStats d WHERE d.txErrors = :txErrors"),
    @NamedQuery(name = "DmPalNetStats.findByTxDrop", query = "SELECT d FROM DmPalNetStats d WHERE d.txDrop = :txDrop"),
    @NamedQuery(name = "DmPalNetStats.findByTxFifo", query = "SELECT d FROM DmPalNetStats d WHERE d.txFifo = :txFifo"),
    @NamedQuery(name = "DmPalNetStats.findByTxCollisions", query = "SELECT d FROM DmPalNetStats d WHERE d.txCollisions = :txCollisions"),
    @NamedQuery(name = "DmPalNetStats.findByTxCarrier", query = "SELECT d FROM DmPalNetStats d WHERE d.txCarrier = :txCarrier"),
    @NamedQuery(name = "DmPalNetStats.findByTxCompressed", query = "SELECT d FROM DmPalNetStats d WHERE d.txCompressed = :txCompressed")})
public class DmPalNetStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "interface")
    private String interface1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_bytes")
    private long recvBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_packets")
    private long recvPackets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_errors")
    private long recvErrors;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_drops")
    private long recvDrops;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_fifo")
    private long recvFifo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_frame")
    private long recvFrame;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_compressed")
    private long recvCompressed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recv_multicast")
    private long recvMulticast;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_bytes")
    private long txBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_packets")
    private long txPackets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_errors")
    private long txErrors;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_drop")
    private long txDrop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_fifo")
    private long txFifo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_collisions")
    private long txCollisions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_carrier")
    private long txCarrier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tx_compressed")
    private long txCompressed;

    public DmPalNetStats() {
    }

    public String getInterface1() {
        return interface1;
    }

    public void setInterface1(String interface1) {
        this.interface1 = interface1;
    }

    public long getRecvBytes() {
        return recvBytes;
    }

    public void setRecvBytes(long recvBytes) {
        this.recvBytes = recvBytes;
    }

    public long getRecvPackets() {
        return recvPackets;
    }

    public void setRecvPackets(long recvPackets) {
        this.recvPackets = recvPackets;
    }

    public long getRecvErrors() {
        return recvErrors;
    }

    public void setRecvErrors(long recvErrors) {
        this.recvErrors = recvErrors;
    }

    public long getRecvDrops() {
        return recvDrops;
    }

    public void setRecvDrops(long recvDrops) {
        this.recvDrops = recvDrops;
    }

    public long getRecvFifo() {
        return recvFifo;
    }

    public void setRecvFifo(long recvFifo) {
        this.recvFifo = recvFifo;
    }

    public long getRecvFrame() {
        return recvFrame;
    }

    public void setRecvFrame(long recvFrame) {
        this.recvFrame = recvFrame;
    }

    public long getRecvCompressed() {
        return recvCompressed;
    }

    public void setRecvCompressed(long recvCompressed) {
        this.recvCompressed = recvCompressed;
    }

    public long getRecvMulticast() {
        return recvMulticast;
    }

    public void setRecvMulticast(long recvMulticast) {
        this.recvMulticast = recvMulticast;
    }

    public long getTxBytes() {
        return txBytes;
    }

    public void setTxBytes(long txBytes) {
        this.txBytes = txBytes;
    }

    public long getTxPackets() {
        return txPackets;
    }

    public void setTxPackets(long txPackets) {
        this.txPackets = txPackets;
    }

    public long getTxErrors() {
        return txErrors;
    }

    public void setTxErrors(long txErrors) {
        this.txErrors = txErrors;
    }

    public long getTxDrop() {
        return txDrop;
    }

    public void setTxDrop(long txDrop) {
        this.txDrop = txDrop;
    }

    public long getTxFifo() {
        return txFifo;
    }

    public void setTxFifo(long txFifo) {
        this.txFifo = txFifo;
    }

    public long getTxCollisions() {
        return txCollisions;
    }

    public void setTxCollisions(long txCollisions) {
        this.txCollisions = txCollisions;
    }

    public long getTxCarrier() {
        return txCarrier;
    }

    public void setTxCarrier(long txCarrier) {
        this.txCarrier = txCarrier;
    }

    public long getTxCompressed() {
        return txCompressed;
    }

    public void setTxCompressed(long txCompressed) {
        this.txCompressed = txCompressed;
    }
    
}
