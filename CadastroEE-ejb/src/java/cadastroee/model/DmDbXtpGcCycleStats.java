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
@Table(name = "dm_db_xtp_gc_cycle_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpGcCycleStats.findAll", query = "SELECT d FROM DmDbXtpGcCycleStats d"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByCycleId", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.cycleId = :cycleId"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByTicksAtCycleStart", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.ticksAtCycleStart = :ticksAtCycleStart"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByTicksAtCycleEnd", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.ticksAtCycleEnd = :ticksAtCycleEnd"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByNodeId", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.nodeId = :nodeId"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByBaseGeneration", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.baseGeneration = :baseGeneration"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsCopiedToLocal", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsCopiedToLocal = :xactsCopiedToLocal"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen0", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen0 = :xactsInGen0"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen1", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen1 = :xactsInGen1"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen2", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen2 = :xactsInGen2"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen3", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen3 = :xactsInGen3"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen4", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen4 = :xactsInGen4"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen5", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen5 = :xactsInGen5"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen6", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen6 = :xactsInGen6"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen7", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen7 = :xactsInGen7"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen8", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen8 = :xactsInGen8"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen9", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen9 = :xactsInGen9"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen10", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen10 = :xactsInGen10"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen11", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen11 = :xactsInGen11"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen12", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen12 = :xactsInGen12"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen13", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen13 = :xactsInGen13"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen14", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen14 = :xactsInGen14"),
    @NamedQuery(name = "DmDbXtpGcCycleStats.findByXactsInGen15", query = "SELECT d FROM DmDbXtpGcCycleStats d WHERE d.xactsInGen15 = :xactsInGen15")})
public class DmDbXtpGcCycleStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cycle_id")
    private long cycleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ticks_at_cycle_start")
    private long ticksAtCycleStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ticks_at_cycle_end")
    private long ticksAtCycleEnd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "node_id")
    private int nodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "base_generation")
    private long baseGeneration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_copied_to_local")
    private long xactsCopiedToLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_0")
    private long xactsInGen0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_1")
    private long xactsInGen1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_2")
    private long xactsInGen2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_3")
    private long xactsInGen3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_4")
    private long xactsInGen4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_5")
    private long xactsInGen5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_6")
    private long xactsInGen6;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_7")
    private long xactsInGen7;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_8")
    private long xactsInGen8;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_9")
    private long xactsInGen9;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_10")
    private long xactsInGen10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_11")
    private long xactsInGen11;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_12")
    private long xactsInGen12;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_13")
    private long xactsInGen13;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_14")
    private long xactsInGen14;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xacts_in_gen_15")
    private long xactsInGen15;

    public DmDbXtpGcCycleStats() {
    }

    public long getCycleId() {
        return cycleId;
    }

    public void setCycleId(long cycleId) {
        this.cycleId = cycleId;
    }

    public long getTicksAtCycleStart() {
        return ticksAtCycleStart;
    }

    public void setTicksAtCycleStart(long ticksAtCycleStart) {
        this.ticksAtCycleStart = ticksAtCycleStart;
    }

    public long getTicksAtCycleEnd() {
        return ticksAtCycleEnd;
    }

    public void setTicksAtCycleEnd(long ticksAtCycleEnd) {
        this.ticksAtCycleEnd = ticksAtCycleEnd;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public long getBaseGeneration() {
        return baseGeneration;
    }

    public void setBaseGeneration(long baseGeneration) {
        this.baseGeneration = baseGeneration;
    }

    public long getXactsCopiedToLocal() {
        return xactsCopiedToLocal;
    }

    public void setXactsCopiedToLocal(long xactsCopiedToLocal) {
        this.xactsCopiedToLocal = xactsCopiedToLocal;
    }

    public long getXactsInGen0() {
        return xactsInGen0;
    }

    public void setXactsInGen0(long xactsInGen0) {
        this.xactsInGen0 = xactsInGen0;
    }

    public long getXactsInGen1() {
        return xactsInGen1;
    }

    public void setXactsInGen1(long xactsInGen1) {
        this.xactsInGen1 = xactsInGen1;
    }

    public long getXactsInGen2() {
        return xactsInGen2;
    }

    public void setXactsInGen2(long xactsInGen2) {
        this.xactsInGen2 = xactsInGen2;
    }

    public long getXactsInGen3() {
        return xactsInGen3;
    }

    public void setXactsInGen3(long xactsInGen3) {
        this.xactsInGen3 = xactsInGen3;
    }

    public long getXactsInGen4() {
        return xactsInGen4;
    }

    public void setXactsInGen4(long xactsInGen4) {
        this.xactsInGen4 = xactsInGen4;
    }

    public long getXactsInGen5() {
        return xactsInGen5;
    }

    public void setXactsInGen5(long xactsInGen5) {
        this.xactsInGen5 = xactsInGen5;
    }

    public long getXactsInGen6() {
        return xactsInGen6;
    }

    public void setXactsInGen6(long xactsInGen6) {
        this.xactsInGen6 = xactsInGen6;
    }

    public long getXactsInGen7() {
        return xactsInGen7;
    }

    public void setXactsInGen7(long xactsInGen7) {
        this.xactsInGen7 = xactsInGen7;
    }

    public long getXactsInGen8() {
        return xactsInGen8;
    }

    public void setXactsInGen8(long xactsInGen8) {
        this.xactsInGen8 = xactsInGen8;
    }

    public long getXactsInGen9() {
        return xactsInGen9;
    }

    public void setXactsInGen9(long xactsInGen9) {
        this.xactsInGen9 = xactsInGen9;
    }

    public long getXactsInGen10() {
        return xactsInGen10;
    }

    public void setXactsInGen10(long xactsInGen10) {
        this.xactsInGen10 = xactsInGen10;
    }

    public long getXactsInGen11() {
        return xactsInGen11;
    }

    public void setXactsInGen11(long xactsInGen11) {
        this.xactsInGen11 = xactsInGen11;
    }

    public long getXactsInGen12() {
        return xactsInGen12;
    }

    public void setXactsInGen12(long xactsInGen12) {
        this.xactsInGen12 = xactsInGen12;
    }

    public long getXactsInGen13() {
        return xactsInGen13;
    }

    public void setXactsInGen13(long xactsInGen13) {
        this.xactsInGen13 = xactsInGen13;
    }

    public long getXactsInGen14() {
        return xactsInGen14;
    }

    public void setXactsInGen14(long xactsInGen14) {
        this.xactsInGen14 = xactsInGen14;
    }

    public long getXactsInGen15() {
        return xactsInGen15;
    }

    public void setXactsInGen15(long xactsInGen15) {
        this.xactsInGen15 = xactsInGen15;
    }
    
}
