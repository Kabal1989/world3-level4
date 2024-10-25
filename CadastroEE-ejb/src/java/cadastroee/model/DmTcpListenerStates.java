/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_tcp_listener_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTcpListenerStates.findAll", query = "SELECT d FROM DmTcpListenerStates d"),
    @NamedQuery(name = "DmTcpListenerStates.findByListenerId", query = "SELECT d FROM DmTcpListenerStates d WHERE d.listenerId = :listenerId"),
    @NamedQuery(name = "DmTcpListenerStates.findByIpAddress", query = "SELECT d FROM DmTcpListenerStates d WHERE d.ipAddress = :ipAddress"),
    @NamedQuery(name = "DmTcpListenerStates.findByIsIpv4", query = "SELECT d FROM DmTcpListenerStates d WHERE d.isIpv4 = :isIpv4"),
    @NamedQuery(name = "DmTcpListenerStates.findByPort", query = "SELECT d FROM DmTcpListenerStates d WHERE d.port = :port"),
    @NamedQuery(name = "DmTcpListenerStates.findByType", query = "SELECT d FROM DmTcpListenerStates d WHERE d.type = :type"),
    @NamedQuery(name = "DmTcpListenerStates.findByTypeDesc", query = "SELECT d FROM DmTcpListenerStates d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DmTcpListenerStates.findByState", query = "SELECT d FROM DmTcpListenerStates d WHERE d.state = :state"),
    @NamedQuery(name = "DmTcpListenerStates.findByStateDesc", query = "SELECT d FROM DmTcpListenerStates d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmTcpListenerStates.findByStartTime", query = "SELECT d FROM DmTcpListenerStates d WHERE d.startTime = :startTime")})
public class DmTcpListenerStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "listener_id")
    private int listenerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 48)
    @Column(name = "ip_address")
    private String ipAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ipv4")
    private boolean isIpv4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "port")
    private int port;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private short state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    public DmTcpListenerStates() {
    }

    public int getListenerId() {
        return listenerId;
    }

    public void setListenerId(int listenerId) {
        this.listenerId = listenerId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public boolean getIsIpv4() {
        return isIpv4;
    }

    public void setIsIpv4(boolean isIpv4) {
        this.isIpv4 = isIpv4;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
}
