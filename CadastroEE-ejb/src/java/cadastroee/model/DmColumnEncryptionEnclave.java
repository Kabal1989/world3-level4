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
@Table(name = "dm_column_encryption_enclave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmColumnEncryptionEnclave.findAll", query = "SELECT d FROM DmColumnEncryptionEnclave d"),
    @NamedQuery(name = "DmColumnEncryptionEnclave.findByCurrentEnclaveSessionCount", query = "SELECT d FROM DmColumnEncryptionEnclave d WHERE d.currentEnclaveSessionCount = :currentEnclaveSessionCount"),
    @NamedQuery(name = "DmColumnEncryptionEnclave.findByCurrentColumnEncryptionKeyCount", query = "SELECT d FROM DmColumnEncryptionEnclave d WHERE d.currentColumnEncryptionKeyCount = :currentColumnEncryptionKeyCount"),
    @NamedQuery(name = "DmColumnEncryptionEnclave.findByCurrentMemorySizeKb", query = "SELECT d FROM DmColumnEncryptionEnclave d WHERE d.currentMemorySizeKb = :currentMemorySizeKb"),
    @NamedQuery(name = "DmColumnEncryptionEnclave.findByTotalEvictedSessionCount", query = "SELECT d FROM DmColumnEncryptionEnclave d WHERE d.totalEvictedSessionCount = :totalEvictedSessionCount")})
public class DmColumnEncryptionEnclave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "current_enclave_session_count")
    private Integer currentEnclaveSessionCount;
    @Column(name = "current_column_encryption_key_count")
    private Integer currentColumnEncryptionKeyCount;
    @Column(name = "current_memory_size_kb")
    private BigInteger currentMemorySizeKb;
    @Column(name = "total_evicted_session_count")
    private BigInteger totalEvictedSessionCount;

    public DmColumnEncryptionEnclave() {
    }

    public Integer getCurrentEnclaveSessionCount() {
        return currentEnclaveSessionCount;
    }

    public void setCurrentEnclaveSessionCount(Integer currentEnclaveSessionCount) {
        this.currentEnclaveSessionCount = currentEnclaveSessionCount;
    }

    public Integer getCurrentColumnEncryptionKeyCount() {
        return currentColumnEncryptionKeyCount;
    }

    public void setCurrentColumnEncryptionKeyCount(Integer currentColumnEncryptionKeyCount) {
        this.currentColumnEncryptionKeyCount = currentColumnEncryptionKeyCount;
    }

    public BigInteger getCurrentMemorySizeKb() {
        return currentMemorySizeKb;
    }

    public void setCurrentMemorySizeKb(BigInteger currentMemorySizeKb) {
        this.currentMemorySizeKb = currentMemorySizeKb;
    }

    public BigInteger getTotalEvictedSessionCount() {
        return totalEvictedSessionCount;
    }

    public void setTotalEvictedSessionCount(BigInteger totalEvictedSessionCount) {
        this.totalEvictedSessionCount = totalEvictedSessionCount;
    }
    
}
