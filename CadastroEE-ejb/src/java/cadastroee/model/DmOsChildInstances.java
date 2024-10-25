/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_os_child_instances")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsChildInstances.findAll", query = "SELECT d FROM DmOsChildInstances d"),
    @NamedQuery(name = "DmOsChildInstances.findByOwningPrincipalName", query = "SELECT d FROM DmOsChildInstances d WHERE d.owningPrincipalName = :owningPrincipalName"),
    @NamedQuery(name = "DmOsChildInstances.findByOwningPrincipalSid", query = "SELECT d FROM DmOsChildInstances d WHERE d.owningPrincipalSid = :owningPrincipalSid"),
    @NamedQuery(name = "DmOsChildInstances.findByInstanceName", query = "SELECT d FROM DmOsChildInstances d WHERE d.instanceName = :instanceName"),
    @NamedQuery(name = "DmOsChildInstances.findByInstancePipeName", query = "SELECT d FROM DmOsChildInstances d WHERE d.instancePipeName = :instancePipeName"),
    @NamedQuery(name = "DmOsChildInstances.findByOSprocessid", query = "SELECT d FROM DmOsChildInstances d WHERE d.oSprocessid = :oSprocessid"),
    @NamedQuery(name = "DmOsChildInstances.findByOSprocesscreationdate", query = "SELECT d FROM DmOsChildInstances d WHERE d.oSprocesscreationdate = :oSprocesscreationdate"),
    @NamedQuery(name = "DmOsChildInstances.findByHeartBeat", query = "SELECT d FROM DmOsChildInstances d WHERE d.heartBeat = :heartBeat")})
public class DmOsChildInstances implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 256)
    @Column(name = "owning_principal_name")
    private String owningPrincipalName;
    @Size(max = 256)
    @Column(name = "owning_principal_sid")
    private String owningPrincipalSid;
    @Lob
    @Column(name = "owning_principal_sid_binary")
    private byte[] owningPrincipalSidBinary;
    @Size(max = 128)
    @Column(name = "instance_name")
    private String instanceName;
    @Size(max = 260)
    @Column(name = "instance_pipe_name")
    private String instancePipeName;
    @Column(name = "OS_process_id")
    private Integer oSprocessid;
    @Column(name = "OS_process_creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oSprocesscreationdate;
    @Size(max = 5)
    @Column(name = "heart_beat")
    private String heartBeat;

    public DmOsChildInstances() {
    }

    public String getOwningPrincipalName() {
        return owningPrincipalName;
    }

    public void setOwningPrincipalName(String owningPrincipalName) {
        this.owningPrincipalName = owningPrincipalName;
    }

    public String getOwningPrincipalSid() {
        return owningPrincipalSid;
    }

    public void setOwningPrincipalSid(String owningPrincipalSid) {
        this.owningPrincipalSid = owningPrincipalSid;
    }

    public byte[] getOwningPrincipalSidBinary() {
        return owningPrincipalSidBinary;
    }

    public void setOwningPrincipalSidBinary(byte[] owningPrincipalSidBinary) {
        this.owningPrincipalSidBinary = owningPrincipalSidBinary;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstancePipeName() {
        return instancePipeName;
    }

    public void setInstancePipeName(String instancePipeName) {
        this.instancePipeName = instancePipeName;
    }

    public Integer getOSprocessid() {
        return oSprocessid;
    }

    public void setOSprocessid(Integer oSprocessid) {
        this.oSprocessid = oSprocessid;
    }

    public Date getOSprocesscreationdate() {
        return oSprocesscreationdate;
    }

    public void setOSprocesscreationdate(Date oSprocesscreationdate) {
        this.oSprocesscreationdate = oSprocesscreationdate;
    }

    public String getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(String heartBeat) {
        this.heartBeat = heartBeat;
    }
    
}
