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
@Table(name = "events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e"),
    @NamedQuery(name = "Events.findByObjectId", query = "SELECT e FROM Events e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "Events.findByType", query = "SELECT e FROM Events e WHERE e.type = :type"),
    @NamedQuery(name = "Events.findByTypeDesc", query = "SELECT e FROM Events e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "Events.findByIsTriggerEvent", query = "SELECT e FROM Events e WHERE e.isTriggerEvent = :isTriggerEvent"),
    @NamedQuery(name = "Events.findByEventGroupType", query = "SELECT e FROM Events e WHERE e.eventGroupType = :eventGroupType"),
    @NamedQuery(name = "Events.findByEventGroupTypeDesc", query = "SELECT e FROM Events e WHERE e.eventGroupTypeDesc = :eventGroupTypeDesc")})
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "is_trigger_event")
    private Boolean isTriggerEvent;
    @Column(name = "event_group_type")
    private Integer eventGroupType;
    @Size(max = 128)
    @Column(name = "event_group_type_desc")
    private String eventGroupTypeDesc;

    public Events() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getIsTriggerEvent() {
        return isTriggerEvent;
    }

    public void setIsTriggerEvent(Boolean isTriggerEvent) {
        this.isTriggerEvent = isTriggerEvent;
    }

    public Integer getEventGroupType() {
        return eventGroupType;
    }

    public void setEventGroupType(Integer eventGroupType) {
        this.eventGroupType = eventGroupType;
    }

    public String getEventGroupTypeDesc() {
        return eventGroupTypeDesc;
    }

    public void setEventGroupTypeDesc(String eventGroupTypeDesc) {
        this.eventGroupTypeDesc = eventGroupTypeDesc;
    }
    
}
