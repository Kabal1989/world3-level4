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
import javax.persistence.Lob;
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
@Table(name = "dm_os_dispatchers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsDispatchers.findAll", query = "SELECT d FROM DmOsDispatchers d"),
    @NamedQuery(name = "DmOsDispatchers.findByState", query = "SELECT d FROM DmOsDispatchers d WHERE d.state = :state"),
    @NamedQuery(name = "DmOsDispatchers.findByWaitDuration", query = "SELECT d FROM DmOsDispatchers d WHERE d.waitDuration = :waitDuration"),
    @NamedQuery(name = "DmOsDispatchers.findByCurrentItemDuration", query = "SELECT d FROM DmOsDispatchers d WHERE d.currentItemDuration = :currentItemDuration"),
    @NamedQuery(name = "DmOsDispatchers.findByItemsProcessed", query = "SELECT d FROM DmOsDispatchers d WHERE d.itemsProcessed = :itemsProcessed"),
    @NamedQuery(name = "DmOsDispatchers.findByFadeEndTime", query = "SELECT d FROM DmOsDispatchers d WHERE d.fadeEndTime = :fadeEndTime")})
public class DmOsDispatchers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dispatcher_pool_address")
    private byte[] dispatcherPoolAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "state")
    private String state;
    @Column(name = "wait_duration")
    private BigInteger waitDuration;
    @Column(name = "current_item_duration")
    private BigInteger currentItemDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "items_processed")
    private long itemsProcessed;
    @Column(name = "fade_end_time")
    private Integer fadeEndTime;

    public DmOsDispatchers() {
    }

    public byte[] getDispatcherPoolAddress() {
        return dispatcherPoolAddress;
    }

    public void setDispatcherPoolAddress(byte[] dispatcherPoolAddress) {
        this.dispatcherPoolAddress = dispatcherPoolAddress;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigInteger getWaitDuration() {
        return waitDuration;
    }

    public void setWaitDuration(BigInteger waitDuration) {
        this.waitDuration = waitDuration;
    }

    public BigInteger getCurrentItemDuration() {
        return currentItemDuration;
    }

    public void setCurrentItemDuration(BigInteger currentItemDuration) {
        this.currentItemDuration = currentItemDuration;
    }

    public long getItemsProcessed() {
        return itemsProcessed;
    }

    public void setItemsProcessed(long itemsProcessed) {
        this.itemsProcessed = itemsProcessed;
    }

    public Integer getFadeEndTime() {
        return fadeEndTime;
    }

    public void setFadeEndTime(Integer fadeEndTime) {
        this.fadeEndTime = fadeEndTime;
    }
    
}
