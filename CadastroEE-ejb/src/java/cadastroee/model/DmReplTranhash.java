/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_repl_tranhash")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmReplTranhash.findAll", query = "SELECT d FROM DmReplTranhash d"),
    @NamedQuery(name = "DmReplTranhash.findByBuckets", query = "SELECT d FROM DmReplTranhash d WHERE d.buckets = :buckets"),
    @NamedQuery(name = "DmReplTranhash.findByHashedTrans", query = "SELECT d FROM DmReplTranhash d WHERE d.hashedTrans = :hashedTrans"),
    @NamedQuery(name = "DmReplTranhash.findByCompletedTrans", query = "SELECT d FROM DmReplTranhash d WHERE d.completedTrans = :completedTrans"),
    @NamedQuery(name = "DmReplTranhash.findByCompensatedTrans", query = "SELECT d FROM DmReplTranhash d WHERE d.compensatedTrans = :compensatedTrans"),
    @NamedQuery(name = "DmReplTranhash.findByFirstBeginLsn", query = "SELECT d FROM DmReplTranhash d WHERE d.firstBeginLsn = :firstBeginLsn"),
    @NamedQuery(name = "DmReplTranhash.findByLastCommitLsn", query = "SELECT d FROM DmReplTranhash d WHERE d.lastCommitLsn = :lastCommitLsn")})
public class DmReplTranhash implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "buckets")
    private Integer buckets;
    @Column(name = "hashed_trans")
    private Integer hashedTrans;
    @Column(name = "completed_trans")
    private Integer completedTrans;
    @Column(name = "compensated_trans")
    private Integer compensatedTrans;
    @Size(max = 24)
    @Column(name = "first_begin_lsn")
    private String firstBeginLsn;
    @Size(max = 24)
    @Column(name = "last_commit_lsn")
    private String lastCommitLsn;

    public DmReplTranhash() {
    }

    public Integer getBuckets() {
        return buckets;
    }

    public void setBuckets(Integer buckets) {
        this.buckets = buckets;
    }

    public Integer getHashedTrans() {
        return hashedTrans;
    }

    public void setHashedTrans(Integer hashedTrans) {
        this.hashedTrans = hashedTrans;
    }

    public Integer getCompletedTrans() {
        return completedTrans;
    }

    public void setCompletedTrans(Integer completedTrans) {
        this.completedTrans = completedTrans;
    }

    public Integer getCompensatedTrans() {
        return compensatedTrans;
    }

    public void setCompensatedTrans(Integer compensatedTrans) {
        this.compensatedTrans = compensatedTrans;
    }

    public String getFirstBeginLsn() {
        return firstBeginLsn;
    }

    public void setFirstBeginLsn(String firstBeginLsn) {
        this.firstBeginLsn = firstBeginLsn;
    }

    public String getLastCommitLsn() {
        return lastCommitLsn;
    }

    public void setLastCommitLsn(String lastCommitLsn) {
        this.lastCommitLsn = lastCommitLsn;
    }
    
}
