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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "sysindexes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysindexes.findAll", query = "SELECT s FROM Sysindexes s"),
    @NamedQuery(name = "Sysindexes.findById", query = "SELECT s FROM Sysindexes s WHERE s.id = :id"),
    @NamedQuery(name = "Sysindexes.findByStatus", query = "SELECT s FROM Sysindexes s WHERE s.status = :status"),
    @NamedQuery(name = "Sysindexes.findByIndid", query = "SELECT s FROM Sysindexes s WHERE s.indid = :indid"),
    @NamedQuery(name = "Sysindexes.findByMinlen", query = "SELECT s FROM Sysindexes s WHERE s.minlen = :minlen"),
    @NamedQuery(name = "Sysindexes.findByKeycnt", query = "SELECT s FROM Sysindexes s WHERE s.keycnt = :keycnt"),
    @NamedQuery(name = "Sysindexes.findByGroupid", query = "SELECT s FROM Sysindexes s WHERE s.groupid = :groupid"),
    @NamedQuery(name = "Sysindexes.findByDpages", query = "SELECT s FROM Sysindexes s WHERE s.dpages = :dpages"),
    @NamedQuery(name = "Sysindexes.findByReserved", query = "SELECT s FROM Sysindexes s WHERE s.reserved = :reserved"),
    @NamedQuery(name = "Sysindexes.findByUsed", query = "SELECT s FROM Sysindexes s WHERE s.used = :used"),
    @NamedQuery(name = "Sysindexes.findByRowcnt", query = "SELECT s FROM Sysindexes s WHERE s.rowcnt = :rowcnt"),
    @NamedQuery(name = "Sysindexes.findByRowmodctr", query = "SELECT s FROM Sysindexes s WHERE s.rowmodctr = :rowmodctr"),
    @NamedQuery(name = "Sysindexes.findByReserved3", query = "SELECT s FROM Sysindexes s WHERE s.reserved3 = :reserved3"),
    @NamedQuery(name = "Sysindexes.findByReserved4", query = "SELECT s FROM Sysindexes s WHERE s.reserved4 = :reserved4"),
    @NamedQuery(name = "Sysindexes.findByXmaxlen", query = "SELECT s FROM Sysindexes s WHERE s.xmaxlen = :xmaxlen"),
    @NamedQuery(name = "Sysindexes.findByMaxirow", query = "SELECT s FROM Sysindexes s WHERE s.maxirow = :maxirow"),
    @NamedQuery(name = "Sysindexes.findByOrigFillFactor", query = "SELECT s FROM Sysindexes s WHERE s.origFillFactor = :origFillFactor"),
    @NamedQuery(name = "Sysindexes.findByStatVersion", query = "SELECT s FROM Sysindexes s WHERE s.statVersion = :statVersion"),
    @NamedQuery(name = "Sysindexes.findByReserved2", query = "SELECT s FROM Sysindexes s WHERE s.reserved2 = :reserved2"),
    @NamedQuery(name = "Sysindexes.findByImpid", query = "SELECT s FROM Sysindexes s WHERE s.impid = :impid"),
    @NamedQuery(name = "Sysindexes.findByLockflags", query = "SELECT s FROM Sysindexes s WHERE s.lockflags = :lockflags"),
    @NamedQuery(name = "Sysindexes.findByPgmodctr", query = "SELECT s FROM Sysindexes s WHERE s.pgmodctr = :pgmodctr"),
    @NamedQuery(name = "Sysindexes.findByName", query = "SELECT s FROM Sysindexes s WHERE s.name = :name"),
    @NamedQuery(name = "Sysindexes.findByMaxlen", query = "SELECT s FROM Sysindexes s WHERE s.maxlen = :maxlen"),
    @NamedQuery(name = "Sysindexes.findByRows", query = "SELECT s FROM Sysindexes s WHERE s.rows = :rows")})
public class Sysindexes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "status")
    private Integer status;
    @Lob
    @Column(name = "first")
    private byte[] first;
    @Column(name = "indid")
    private Short indid;
    @Lob
    @Column(name = "root")
    private byte[] root;
    @Column(name = "minlen")
    private Short minlen;
    @Column(name = "keycnt")
    private Short keycnt;
    @Column(name = "groupid")
    private Short groupid;
    @Column(name = "dpages")
    private Integer dpages;
    @Column(name = "reserved")
    private Integer reserved;
    @Column(name = "used")
    private Integer used;
    @Column(name = "rowcnt")
    private BigInteger rowcnt;
    @Column(name = "rowmodctr")
    private Integer rowmodctr;
    @Column(name = "reserved3")
    private Short reserved3;
    @Column(name = "reserved4")
    private Short reserved4;
    @Column(name = "xmaxlen")
    private Short xmaxlen;
    @Column(name = "maxirow")
    private Short maxirow;
    @Column(name = "OrigFillFactor")
    private Short origFillFactor;
    @Column(name = "StatVersion")
    private Short statVersion;
    @Column(name = "reserved2")
    private Integer reserved2;
    @Lob
    @Column(name = "FirstIAM")
    private byte[] firstIAM;
    @Column(name = "impid")
    private Short impid;
    @Column(name = "lockflags")
    private Short lockflags;
    @Column(name = "pgmodctr")
    private Integer pgmodctr;
    @Lob
    @Column(name = "keys")
    private byte[] keys;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "statblob")
    private byte[] statblob;
    @Column(name = "maxlen")
    private Integer maxlen;
    @Column(name = "rows")
    private Integer rows;

    public Sysindexes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public byte[] getFirst() {
        return first;
    }

    public void setFirst(byte[] first) {
        this.first = first;
    }

    public Short getIndid() {
        return indid;
    }

    public void setIndid(Short indid) {
        this.indid = indid;
    }

    public byte[] getRoot() {
        return root;
    }

    public void setRoot(byte[] root) {
        this.root = root;
    }

    public Short getMinlen() {
        return minlen;
    }

    public void setMinlen(Short minlen) {
        this.minlen = minlen;
    }

    public Short getKeycnt() {
        return keycnt;
    }

    public void setKeycnt(Short keycnt) {
        this.keycnt = keycnt;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Integer getDpages() {
        return dpages;
    }

    public void setDpages(Integer dpages) {
        this.dpages = dpages;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public BigInteger getRowcnt() {
        return rowcnt;
    }

    public void setRowcnt(BigInteger rowcnt) {
        this.rowcnt = rowcnt;
    }

    public Integer getRowmodctr() {
        return rowmodctr;
    }

    public void setRowmodctr(Integer rowmodctr) {
        this.rowmodctr = rowmodctr;
    }

    public Short getReserved3() {
        return reserved3;
    }

    public void setReserved3(Short reserved3) {
        this.reserved3 = reserved3;
    }

    public Short getReserved4() {
        return reserved4;
    }

    public void setReserved4(Short reserved4) {
        this.reserved4 = reserved4;
    }

    public Short getXmaxlen() {
        return xmaxlen;
    }

    public void setXmaxlen(Short xmaxlen) {
        this.xmaxlen = xmaxlen;
    }

    public Short getMaxirow() {
        return maxirow;
    }

    public void setMaxirow(Short maxirow) {
        this.maxirow = maxirow;
    }

    public Short getOrigFillFactor() {
        return origFillFactor;
    }

    public void setOrigFillFactor(Short origFillFactor) {
        this.origFillFactor = origFillFactor;
    }

    public Short getStatVersion() {
        return statVersion;
    }

    public void setStatVersion(Short statVersion) {
        this.statVersion = statVersion;
    }

    public Integer getReserved2() {
        return reserved2;
    }

    public void setReserved2(Integer reserved2) {
        this.reserved2 = reserved2;
    }

    public byte[] getFirstIAM() {
        return firstIAM;
    }

    public void setFirstIAM(byte[] firstIAM) {
        this.firstIAM = firstIAM;
    }

    public Short getImpid() {
        return impid;
    }

    public void setImpid(Short impid) {
        this.impid = impid;
    }

    public Short getLockflags() {
        return lockflags;
    }

    public void setLockflags(Short lockflags) {
        this.lockflags = lockflags;
    }

    public Integer getPgmodctr() {
        return pgmodctr;
    }

    public void setPgmodctr(Integer pgmodctr) {
        this.pgmodctr = pgmodctr;
    }

    public byte[] getKeys() {
        return keys;
    }

    public void setKeys(byte[] keys) {
        this.keys = keys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getStatblob() {
        return statblob;
    }

    public void setStatblob(byte[] statblob) {
        this.statblob = statblob;
    }

    public Integer getMaxlen() {
        return maxlen;
    }

    public void setMaxlen(Integer maxlen) {
        this.maxlen = maxlen;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
    
}
