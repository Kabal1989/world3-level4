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
@Table(name = "dm_tran_session_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranSessionTransactions.findAll", query = "SELECT d FROM DmTranSessionTransactions d"),
    @NamedQuery(name = "DmTranSessionTransactions.findBySessionId", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmTranSessionTransactions.findByTransactionId", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranSessionTransactions.findByEnlistCount", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.enlistCount = :enlistCount"),
    @NamedQuery(name = "DmTranSessionTransactions.findByIsUserTransaction", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.isUserTransaction = :isUserTransaction"),
    @NamedQuery(name = "DmTranSessionTransactions.findByIsLocal", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.isLocal = :isLocal"),
    @NamedQuery(name = "DmTranSessionTransactions.findByIsEnlisted", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.isEnlisted = :isEnlisted"),
    @NamedQuery(name = "DmTranSessionTransactions.findByIsBound", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.isBound = :isBound"),
    @NamedQuery(name = "DmTranSessionTransactions.findByOpenTransactionCount", query = "SELECT d FROM DmTranSessionTransactions d WHERE d.openTransactionCount = :openTransactionCount")})
public class DmTranSessionTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private int sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "transaction_descriptor")
    private byte[] transactionDescriptor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enlist_count")
    private int enlistCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_user_transaction")
    private boolean isUserTransaction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_local")
    private boolean isLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_enlisted")
    private boolean isEnlisted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_bound")
    private boolean isBound;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_transaction_count")
    private int openTransactionCount;

    public DmTranSessionTransactions() {
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public byte[] getTransactionDescriptor() {
        return transactionDescriptor;
    }

    public void setTransactionDescriptor(byte[] transactionDescriptor) {
        this.transactionDescriptor = transactionDescriptor;
    }

    public int getEnlistCount() {
        return enlistCount;
    }

    public void setEnlistCount(int enlistCount) {
        this.enlistCount = enlistCount;
    }

    public boolean getIsUserTransaction() {
        return isUserTransaction;
    }

    public void setIsUserTransaction(boolean isUserTransaction) {
        this.isUserTransaction = isUserTransaction;
    }

    public boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    public boolean getIsEnlisted() {
        return isEnlisted;
    }

    public void setIsEnlisted(boolean isEnlisted) {
        this.isEnlisted = isEnlisted;
    }

    public boolean getIsBound() {
        return isBound;
    }

    public void setIsBound(boolean isBound) {
        this.isBound = isBound;
    }

    public int getOpenTransactionCount() {
        return openTransactionCount;
    }

    public void setOpenTransactionCount(int openTransactionCount) {
        this.openTransactionCount = openTransactionCount;
    }
    
}
