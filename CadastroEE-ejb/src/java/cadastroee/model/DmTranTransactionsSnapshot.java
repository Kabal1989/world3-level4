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
@Table(name = "dm_tran_transactions_snapshot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranTransactionsSnapshot.findAll", query = "SELECT d FROM DmTranTransactionsSnapshot d"),
    @NamedQuery(name = "DmTranTransactionsSnapshot.findByTransactionSequenceNum", query = "SELECT d FROM DmTranTransactionsSnapshot d WHERE d.transactionSequenceNum = :transactionSequenceNum"),
    @NamedQuery(name = "DmTranTransactionsSnapshot.findBySnapshotId", query = "SELECT d FROM DmTranTransactionsSnapshot d WHERE d.snapshotId = :snapshotId"),
    @NamedQuery(name = "DmTranTransactionsSnapshot.findBySnapshotSequenceNum", query = "SELECT d FROM DmTranTransactionsSnapshot d WHERE d.snapshotSequenceNum = :snapshotSequenceNum")})
public class DmTranTransactionsSnapshot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_sequence_num")
    private BigInteger transactionSequenceNum;
    @Column(name = "snapshot_id")
    private Integer snapshotId;
    @Column(name = "snapshot_sequence_num")
    private BigInteger snapshotSequenceNum;

    public DmTranTransactionsSnapshot() {
    }

    public BigInteger getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(BigInteger transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public Integer getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(Integer snapshotId) {
        this.snapshotId = snapshotId;
    }

    public BigInteger getSnapshotSequenceNum() {
        return snapshotSequenceNum;
    }

    public void setSnapshotSequenceNum(BigInteger snapshotSequenceNum) {
        this.snapshotSequenceNum = snapshotSequenceNum;
    }
    
}
