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
@Table(name = "dm_tran_current_snapshot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranCurrentSnapshot.findAll", query = "SELECT d FROM DmTranCurrentSnapshot d"),
    @NamedQuery(name = "DmTranCurrentSnapshot.findByTransactionSequenceNum", query = "SELECT d FROM DmTranCurrentSnapshot d WHERE d.transactionSequenceNum = :transactionSequenceNum")})
public class DmTranCurrentSnapshot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_sequence_num")
    private BigInteger transactionSequenceNum;

    public DmTranCurrentSnapshot() {
    }

    public BigInteger getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(BigInteger transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }
    
}
