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
@Table(name = "dm_tran_persistent_version_store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranPersistentVersionStore.findAll", query = "SELECT d FROM DmTranPersistentVersionStore d"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findByXdesTsPush", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.xdesTsPush = :xdesTsPush"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findByXdesTsTran", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.xdesTsTran = :xdesTsTran"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findBySubidPush", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.subidPush = :subidPush"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findBySubidTran", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.subidTran = :subidTran"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findByRowsetId", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.rowsetId = :rowsetId"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findByMinLen", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.minLen = :minLen"),
    @NamedQuery(name = "DmTranPersistentVersionStore.findBySeqNum", query = "SELECT d FROM DmTranPersistentVersionStore d WHERE d.seqNum = :seqNum")})
public class DmTranPersistentVersionStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xdes_ts_push")
    private long xdesTsPush;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xdes_ts_tran")
    private long xdesTsTran;
    @Column(name = "subid_push")
    private Integer subidPush;
    @Column(name = "subid_tran")
    private Integer subidTran;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowset_id")
    private long rowsetId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sec_version_rid")
    private byte[] secVersionRid;
    @Column(name = "min_len")
    private Short minLen;
    @Column(name = "seq_num")
    private BigInteger seqNum;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "prev_row_in_chain")
    private byte[] prevRowInChain;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "row_version")
    private byte[] rowVersion;

    public DmTranPersistentVersionStore() {
    }

    public long getXdesTsPush() {
        return xdesTsPush;
    }

    public void setXdesTsPush(long xdesTsPush) {
        this.xdesTsPush = xdesTsPush;
    }

    public long getXdesTsTran() {
        return xdesTsTran;
    }

    public void setXdesTsTran(long xdesTsTran) {
        this.xdesTsTran = xdesTsTran;
    }

    public Integer getSubidPush() {
        return subidPush;
    }

    public void setSubidPush(Integer subidPush) {
        this.subidPush = subidPush;
    }

    public Integer getSubidTran() {
        return subidTran;
    }

    public void setSubidTran(Integer subidTran) {
        this.subidTran = subidTran;
    }

    public long getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(long rowsetId) {
        this.rowsetId = rowsetId;
    }

    public byte[] getSecVersionRid() {
        return secVersionRid;
    }

    public void setSecVersionRid(byte[] secVersionRid) {
        this.secVersionRid = secVersionRid;
    }

    public Short getMinLen() {
        return minLen;
    }

    public void setMinLen(Short minLen) {
        this.minLen = minLen;
    }

    public BigInteger getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(BigInteger seqNum) {
        this.seqNum = seqNum;
    }

    public byte[] getPrevRowInChain() {
        return prevRowInChain;
    }

    public void setPrevRowInChain(byte[] prevRowInChain) {
        this.prevRowInChain = prevRowInChain;
    }

    public byte[] getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(byte[] rowVersion) {
        this.rowVersion = rowVersion;
    }
    
}
