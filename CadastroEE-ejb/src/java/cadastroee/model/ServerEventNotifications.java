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
import javax.persistence.Lob;
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
@Table(name = "server_event_notifications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerEventNotifications.findAll", query = "SELECT s FROM ServerEventNotifications s"),
    @NamedQuery(name = "ServerEventNotifications.findByName", query = "SELECT s FROM ServerEventNotifications s WHERE s.name = :name"),
    @NamedQuery(name = "ServerEventNotifications.findByObjectId", query = "SELECT s FROM ServerEventNotifications s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServerEventNotifications.findByParentClass", query = "SELECT s FROM ServerEventNotifications s WHERE s.parentClass = :parentClass"),
    @NamedQuery(name = "ServerEventNotifications.findByParentClassDesc", query = "SELECT s FROM ServerEventNotifications s WHERE s.parentClassDesc = :parentClassDesc"),
    @NamedQuery(name = "ServerEventNotifications.findByParentId", query = "SELECT s FROM ServerEventNotifications s WHERE s.parentId = :parentId"),
    @NamedQuery(name = "ServerEventNotifications.findByCreateDate", query = "SELECT s FROM ServerEventNotifications s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerEventNotifications.findByModifyDate", query = "SELECT s FROM ServerEventNotifications s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerEventNotifications.findByServiceName", query = "SELECT s FROM ServerEventNotifications s WHERE s.serviceName = :serviceName"),
    @NamedQuery(name = "ServerEventNotifications.findByBrokerInstance", query = "SELECT s FROM ServerEventNotifications s WHERE s.brokerInstance = :brokerInstance"),
    @NamedQuery(name = "ServerEventNotifications.findByPrincipalId", query = "SELECT s FROM ServerEventNotifications s WHERE s.principalId = :principalId")})
public class ServerEventNotifications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_class")
    private short parentClass;
    @Size(max = 60)
    @Column(name = "parent_class_desc")
    private String parentClassDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Size(max = 256)
    @Column(name = "service_name")
    private String serviceName;
    @Size(max = 128)
    @Column(name = "broker_instance")
    private String brokerInstance;
    @Lob
    @Column(name = "creator_sid")
    private byte[] creatorSid;
    @Column(name = "principal_id")
    private Integer principalId;

    public ServerEventNotifications() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public short getParentClass() {
        return parentClass;
    }

    public void setParentClass(short parentClass) {
        this.parentClass = parentClass;
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getBrokerInstance() {
        return brokerInstance;
    }

    public void setBrokerInstance(String brokerInstance) {
        this.brokerInstance = brokerInstance;
    }

    public byte[] getCreatorSid() {
        return creatorSid;
    }

    public void setCreatorSid(byte[] creatorSid) {
        this.creatorSid = creatorSid;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
