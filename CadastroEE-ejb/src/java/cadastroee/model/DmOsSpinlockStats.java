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
@Table(name = "dm_os_spinlock_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsSpinlockStats.findAll", query = "SELECT d FROM DmOsSpinlockStats d"),
    @NamedQuery(name = "DmOsSpinlockStats.findByName", query = "SELECT d FROM DmOsSpinlockStats d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsSpinlockStats.findByCollisions", query = "SELECT d FROM DmOsSpinlockStats d WHERE d.collisions = :collisions"),
    @NamedQuery(name = "DmOsSpinlockStats.findBySpins", query = "SELECT d FROM DmOsSpinlockStats d WHERE d.spins = :spins"),
    @NamedQuery(name = "DmOsSpinlockStats.findBySpinsPerCollision", query = "SELECT d FROM DmOsSpinlockStats d WHERE d.spinsPerCollision = :spinsPerCollision"),
    @NamedQuery(name = "DmOsSpinlockStats.findBySleepTime", query = "SELECT d FROM DmOsSpinlockStats d WHERE d.sleepTime = :sleepTime"),
    @NamedQuery(name = "DmOsSpinlockStats.findByBackoffs", query = "SELECT d FROM DmOsSpinlockStats d WHERE d.backoffs = :backoffs")})
public class DmOsSpinlockStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Column(name = "collisions")
    private BigInteger collisions;
    @Column(name = "spins")
    private BigInteger spins;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "spins_per_collision")
    private Float spinsPerCollision;
    @Column(name = "sleep_time")
    private BigInteger sleepTime;
    @Column(name = "backoffs")
    private BigInteger backoffs;

    public DmOsSpinlockStats() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getCollisions() {
        return collisions;
    }

    public void setCollisions(BigInteger collisions) {
        this.collisions = collisions;
    }

    public BigInteger getSpins() {
        return spins;
    }

    public void setSpins(BigInteger spins) {
        this.spins = spins;
    }

    public Float getSpinsPerCollision() {
        return spinsPerCollision;
    }

    public void setSpinsPerCollision(Float spinsPerCollision) {
        this.spinsPerCollision = spinsPerCollision;
    }

    public BigInteger getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(BigInteger sleepTime) {
        this.sleepTime = sleepTime;
    }

    public BigInteger getBackoffs() {
        return backoffs;
    }

    public void setBackoffs(BigInteger backoffs) {
        this.backoffs = backoffs;
    }
    
}
