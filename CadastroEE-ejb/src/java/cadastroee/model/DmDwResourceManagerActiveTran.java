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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_dw_resource_manager_active_tran")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findAll", query = "SELECT d FROM DmDwResourceManagerActiveTran d"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByReadVersion", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.readVersion = :readVersion"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByWriteVersion", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.writeVersion = :writeVersion"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByNestedId", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.nestedId = :nestedId"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByCurrentReadVersion", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.currentReadVersion = :currentReadVersion"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByIsPit", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.isPit = :isPit"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByTxnType", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.txnType = :txnType"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByTxnTag", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.txnTag = :txnTag"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByIsTxnOwner", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.isTxnOwner = :isTxnOwner"),
    @NamedQuery(name = "DmDwResourceManagerActiveTran.findByDdlStep", query = "SELECT d FROM DmDwResourceManagerActiveTran d WHERE d.ddlStep = :ddlStep")})
public class DmDwResourceManagerActiveTran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_version")
    private long readVersion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_version")
    private long writeVersion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nested_id")
    private long nestedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_read_version")
    private long currentReadVersion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_pit")
    private short isPit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "txn_type")
    private short txnType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "txn_tag")
    private short txnTag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_txn_owner")
    private short isTxnOwner;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ddl_step")
    private short ddlStep;

    public DmDwResourceManagerActiveTran() {
    }

    public long getReadVersion() {
        return readVersion;
    }

    public void setReadVersion(long readVersion) {
        this.readVersion = readVersion;
    }

    public long getWriteVersion() {
        return writeVersion;
    }

    public void setWriteVersion(long writeVersion) {
        this.writeVersion = writeVersion;
    }

    public long getNestedId() {
        return nestedId;
    }

    public void setNestedId(long nestedId) {
        this.nestedId = nestedId;
    }

    public long getCurrentReadVersion() {
        return currentReadVersion;
    }

    public void setCurrentReadVersion(long currentReadVersion) {
        this.currentReadVersion = currentReadVersion;
    }

    public short getIsPit() {
        return isPit;
    }

    public void setIsPit(short isPit) {
        this.isPit = isPit;
    }

    public short getTxnType() {
        return txnType;
    }

    public void setTxnType(short txnType) {
        this.txnType = txnType;
    }

    public short getTxnTag() {
        return txnTag;
    }

    public void setTxnTag(short txnTag) {
        this.txnTag = txnTag;
    }

    public short getIsTxnOwner() {
        return isTxnOwner;
    }

    public void setIsTxnOwner(short isTxnOwner) {
        this.isTxnOwner = isTxnOwner;
    }

    public short getDdlStep() {
        return ddlStep;
    }

    public void setDdlStep(short ddlStep) {
        this.ddlStep = ddlStep;
    }
    
}
