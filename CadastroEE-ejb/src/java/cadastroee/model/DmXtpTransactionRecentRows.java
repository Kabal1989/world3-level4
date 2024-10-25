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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_xtp_transaction_recent_rows")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXtpTransactionRecentRows.findAll", query = "SELECT d FROM DmXtpTransactionRecentRows d"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByNodeId", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.nodeId = :nodeId"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByXtpTransactionId", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.xtpTransactionId = :xtpTransactionId"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByBeforeBegin", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.beforeBegin = :beforeBegin"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByBeforeEnd", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.beforeEnd = :beforeEnd"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByBeforeLinks", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.beforeLinks = :beforeLinks"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByBeforeTime", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.beforeTime = :beforeTime"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByAfterBegin", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.afterBegin = :afterBegin"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByAfterEnd", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.afterEnd = :afterEnd"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByAfterLinks", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.afterLinks = :afterLinks"),
    @NamedQuery(name = "DmXtpTransactionRecentRows.findByAfterTime", query = "SELECT d FROM DmXtpTransactionRecentRows d WHERE d.afterTime = :afterTime")})
public class DmXtpTransactionRecentRows implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "node_id")
    private short nodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_transaction_id")
    private long xtpTransactionId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "row_address")
    private byte[] rowAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "table_address")
    private byte[] tableAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "before_begin")
    private long beforeBegin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "before_end")
    private long beforeEnd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "before_links")
    private int beforeLinks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "before_time")
    private long beforeTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "after_begin")
    private long afterBegin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "after_end")
    private long afterEnd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "after_links")
    private int afterLinks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "after_time")
    private long afterTime;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "outcome")
    private byte[] outcome;

    public DmXtpTransactionRecentRows() {
    }

    public short getNodeId() {
        return nodeId;
    }

    public void setNodeId(short nodeId) {
        this.nodeId = nodeId;
    }

    public long getXtpTransactionId() {
        return xtpTransactionId;
    }

    public void setXtpTransactionId(long xtpTransactionId) {
        this.xtpTransactionId = xtpTransactionId;
    }

    public byte[] getRowAddress() {
        return rowAddress;
    }

    public void setRowAddress(byte[] rowAddress) {
        this.rowAddress = rowAddress;
    }

    public byte[] getTableAddress() {
        return tableAddress;
    }

    public void setTableAddress(byte[] tableAddress) {
        this.tableAddress = tableAddress;
    }

    public long getBeforeBegin() {
        return beforeBegin;
    }

    public void setBeforeBegin(long beforeBegin) {
        this.beforeBegin = beforeBegin;
    }

    public long getBeforeEnd() {
        return beforeEnd;
    }

    public void setBeforeEnd(long beforeEnd) {
        this.beforeEnd = beforeEnd;
    }

    public int getBeforeLinks() {
        return beforeLinks;
    }

    public void setBeforeLinks(int beforeLinks) {
        this.beforeLinks = beforeLinks;
    }

    public long getBeforeTime() {
        return beforeTime;
    }

    public void setBeforeTime(long beforeTime) {
        this.beforeTime = beforeTime;
    }

    public long getAfterBegin() {
        return afterBegin;
    }

    public void setAfterBegin(long afterBegin) {
        this.afterBegin = afterBegin;
    }

    public long getAfterEnd() {
        return afterEnd;
    }

    public void setAfterEnd(long afterEnd) {
        this.afterEnd = afterEnd;
    }

    public int getAfterLinks() {
        return afterLinks;
    }

    public void setAfterLinks(int afterLinks) {
        this.afterLinks = afterLinks;
    }

    public long getAfterTime() {
        return afterTime;
    }

    public void setAfterTime(long afterTime) {
        this.afterTime = afterTime;
    }

    public byte[] getOutcome() {
        return outcome;
    }

    public void setOutcome(byte[] outcome) {
        this.outcome = outcome;
    }
    
}
