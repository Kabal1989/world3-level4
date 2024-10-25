/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_tran_current_transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranCurrentTransaction.findAll", query = "SELECT d FROM DmTranCurrentTransaction d"),
    @NamedQuery(name = "DmTranCurrentTransaction.findByTransactionId", query = "SELECT d FROM DmTranCurrentTransaction d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranCurrentTransaction.findByTransactionSequenceNum", query = "SELECT d FROM DmTranCurrentTransaction d WHERE d.transactionSequenceNum = :transactionSequenceNum"),
    @NamedQuery(name = "DmTranCurrentTransaction.findByTransactionIsSnapshot", query = "SELECT d FROM DmTranCurrentTransaction d WHERE d.transactionIsSnapshot = :transactionIsSnapshot"),
    @NamedQuery(name = "DmTranCurrentTransaction.findByFirstSnapshotSequenceNum", query = "SELECT d FROM DmTranCurrentTransaction d WHERE d.firstSnapshotSequenceNum = :firstSnapshotSequenceNum"),
    @NamedQuery(name = "DmTranCurrentTransaction.findByLastTransactionSequenceNum", query = "SELECT d FROM DmTranCurrentTransaction d WHERE d.lastTransactionSequenceNum = :lastTransactionSequenceNum"),
    @NamedQuery(name = "DmTranCurrentTransaction.findByFirstUsefulSequenceNum", query = "SELECT d FROM DmTranCurrentTransaction d WHERE d.firstUsefulSequenceNum = :firstUsefulSequenceNum")})
public class DmTranCurrentTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_id")
    private BigInteger transactionId;
    @Column(name = "transaction_sequence_num")
    private BigInteger transactionSequenceNum;
    @Column(name = "transaction_is_snapshot")
    private Boolean transactionIsSnapshot;
    @Column(name = "first_snapshot_sequence_num")
    private BigInteger firstSnapshotSequenceNum;
    @Column(name = "last_transaction_sequence_num")
    private BigInteger lastTransactionSequenceNum;
    @Column(name = "first_useful_sequence_num")
    private BigInteger firstUsefulSequenceNum;

    public DmTranCurrentTransaction() {
    }

    public BigInteger getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(BigInteger transactionId) {
        this.transactionId = transactionId;
    }

    public BigInteger getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(BigInteger transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public Boolean getTransactionIsSnapshot() {
        return transactionIsSnapshot;
    }

    public void setTransactionIsSnapshot(Boolean transactionIsSnapshot) {
        this.transactionIsSnapshot = transactionIsSnapshot;
    }

    public BigInteger getFirstSnapshotSequenceNum() {
        return firstSnapshotSequenceNum;
    }

    public void setFirstSnapshotSequenceNum(BigInteger firstSnapshotSequenceNum) {
        this.firstSnapshotSequenceNum = firstSnapshotSequenceNum;
    }

    public BigInteger getLastTransactionSequenceNum() {
        return lastTransactionSequenceNum;
    }

    public void setLastTransactionSequenceNum(BigInteger lastTransactionSequenceNum) {
        this.lastTransactionSequenceNum = lastTransactionSequenceNum;
    }

    public BigInteger getFirstUsefulSequenceNum() {
        return firstUsefulSequenceNum;
    }

    public void setFirstUsefulSequenceNum(BigInteger firstUsefulSequenceNum) {
        this.firstUsefulSequenceNum = firstUsefulSequenceNum;
    }
    
}
