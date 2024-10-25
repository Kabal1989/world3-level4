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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_pal_spinlock_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalSpinlockStats.findAll", query = "SELECT d FROM DmPalSpinlockStats d"),
    @NamedQuery(name = "DmPalSpinlockStats.findByName", query = "SELECT d FROM DmPalSpinlockStats d WHERE d.name = :name"),
    @NamedQuery(name = "DmPalSpinlockStats.findByCollisions", query = "SELECT d FROM DmPalSpinlockStats d WHERE d.collisions = :collisions"),
    @NamedQuery(name = "DmPalSpinlockStats.findBySpins", query = "SELECT d FROM DmPalSpinlockStats d WHERE d.spins = :spins"),
    @NamedQuery(name = "DmPalSpinlockStats.findBySpinsPerCollision", query = "SELECT d FROM DmPalSpinlockStats d WHERE d.spinsPerCollision = :spinsPerCollision"),
    @NamedQuery(name = "DmPalSpinlockStats.findBySleepTime", query = "SELECT d FROM DmPalSpinlockStats d WHERE d.sleepTime = :sleepTime"),
    @NamedQuery(name = "DmPalSpinlockStats.findByBackoffs", query = "SELECT d FROM DmPalSpinlockStats d WHERE d.backoffs = :backoffs")})
public class DmPalSpinlockStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "collisions")
    private long collisions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spins")
    private long spins;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spins_per_collision")
    private double spinsPerCollision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sleep_time")
    private long sleepTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "backoffs")
    private long backoffs;

    public DmPalSpinlockStats() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCollisions() {
        return collisions;
    }

    public void setCollisions(long collisions) {
        this.collisions = collisions;
    }

    public long getSpins() {
        return spins;
    }

    public void setSpins(long spins) {
        this.spins = spins;
    }

    public double getSpinsPerCollision() {
        return spinsPerCollision;
    }

    public void setSpinsPerCollision(double spinsPerCollision) {
        this.spinsPerCollision = spinsPerCollision;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public long getBackoffs() {
        return backoffs;
    }

    public void setBackoffs(long backoffs) {
        this.backoffs = backoffs;
    }
    
}
