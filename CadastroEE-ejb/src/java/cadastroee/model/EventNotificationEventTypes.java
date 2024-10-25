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
@Table(name = "event_notification_event_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventNotificationEventTypes.findAll", query = "SELECT e FROM EventNotificationEventTypes e"),
    @NamedQuery(name = "EventNotificationEventTypes.findByType", query = "SELECT e FROM EventNotificationEventTypes e WHERE e.type = :type"),
    @NamedQuery(name = "EventNotificationEventTypes.findByTypeName", query = "SELECT e FROM EventNotificationEventTypes e WHERE e.typeName = :typeName"),
    @NamedQuery(name = "EventNotificationEventTypes.findByParentType", query = "SELECT e FROM EventNotificationEventTypes e WHERE e.parentType = :parentType")})
public class EventNotificationEventTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private int type;
    @Size(max = 64)
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "parent_type")
    private Integer parentType;

    public EventNotificationEventTypes() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getParentType() {
        return parentType;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }
    
}
