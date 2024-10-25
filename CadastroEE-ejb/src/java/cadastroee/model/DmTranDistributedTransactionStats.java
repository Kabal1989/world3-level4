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
@Table(name = "dm_tran_distributed_transaction_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranDistributedTransactionStats.findAll", query = "SELECT d FROM DmTranDistributedTransactionStats d"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByAborted", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.aborted = :aborted"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByAbortedMax", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.abortedMax = :abortedMax"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByForcedAbort", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.forcedAbort = :forcedAbort"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByCommitted", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.committed = :committed"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByCommittedMax", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.committedMax = :committedMax"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByForcedCommit", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.forcedCommit = :forcedCommit"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByHeuristic", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.heuristic = :heuristic"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByHeuristicMax", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.heuristicMax = :heuristicMax"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByInDoubt", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.inDoubt = :inDoubt"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByInDoubtMax", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.inDoubtMax = :inDoubtMax"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByOpen", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.open = :open"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findByOpenMax", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.openMax = :openMax"),
    @NamedQuery(name = "DmTranDistributedTransactionStats.findBySinglePhaseInDoubt", query = "SELECT d FROM DmTranDistributedTransactionStats d WHERE d.singlePhaseInDoubt = :singlePhaseInDoubt")})
public class DmTranDistributedTransactionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aborted")
    private int aborted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aborted_max")
    private int abortedMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forced_abort")
    private int forcedAbort;
    @Basic(optional = false)
    @NotNull
    @Column(name = "committed")
    private int committed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "committed_max")
    private int committedMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "forced_commit")
    private int forcedCommit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heuristic")
    private int heuristic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heuristic_max")
    private int heuristicMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_doubt")
    private int inDoubt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_doubt_max")
    private int inDoubtMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open")
    private int open;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_max")
    private int openMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "single_phase_in_doubt")
    private int singlePhaseInDoubt;

    public DmTranDistributedTransactionStats() {
    }

    public int getAborted() {
        return aborted;
    }

    public void setAborted(int aborted) {
        this.aborted = aborted;
    }

    public int getAbortedMax() {
        return abortedMax;
    }

    public void setAbortedMax(int abortedMax) {
        this.abortedMax = abortedMax;
    }

    public int getForcedAbort() {
        return forcedAbort;
    }

    public void setForcedAbort(int forcedAbort) {
        this.forcedAbort = forcedAbort;
    }

    public int getCommitted() {
        return committed;
    }

    public void setCommitted(int committed) {
        this.committed = committed;
    }

    public int getCommittedMax() {
        return committedMax;
    }

    public void setCommittedMax(int committedMax) {
        this.committedMax = committedMax;
    }

    public int getForcedCommit() {
        return forcedCommit;
    }

    public void setForcedCommit(int forcedCommit) {
        this.forcedCommit = forcedCommit;
    }

    public int getHeuristic() {
        return heuristic;
    }

    public void setHeuristic(int heuristic) {
        this.heuristic = heuristic;
    }

    public int getHeuristicMax() {
        return heuristicMax;
    }

    public void setHeuristicMax(int heuristicMax) {
        this.heuristicMax = heuristicMax;
    }

    public int getInDoubt() {
        return inDoubt;
    }

    public void setInDoubt(int inDoubt) {
        this.inDoubt = inDoubt;
    }

    public int getInDoubtMax() {
        return inDoubtMax;
    }

    public void setInDoubtMax(int inDoubtMax) {
        this.inDoubtMax = inDoubtMax;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getOpenMax() {
        return openMax;
    }

    public void setOpenMax(int openMax) {
        this.openMax = openMax;
    }

    public int getSinglePhaseInDoubt() {
        return singlePhaseInDoubt;
    }

    public void setSinglePhaseInDoubt(int singlePhaseInDoubt) {
        this.singlePhaseInDoubt = singlePhaseInDoubt;
    }
    
}
