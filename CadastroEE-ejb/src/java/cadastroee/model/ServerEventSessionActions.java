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
@Table(name = "server_event_session_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerEventSessionActions.findAll", query = "SELECT s FROM ServerEventSessionActions s"),
    @NamedQuery(name = "ServerEventSessionActions.findByEventSessionId", query = "SELECT s FROM ServerEventSessionActions s WHERE s.eventSessionId = :eventSessionId"),
    @NamedQuery(name = "ServerEventSessionActions.findByEventId", query = "SELECT s FROM ServerEventSessionActions s WHERE s.eventId = :eventId"),
    @NamedQuery(name = "ServerEventSessionActions.findByName", query = "SELECT s FROM ServerEventSessionActions s WHERE s.name = :name"),
    @NamedQuery(name = "ServerEventSessionActions.findByPackage1", query = "SELECT s FROM ServerEventSessionActions s WHERE s.package1 = :package1"),
    @NamedQuery(name = "ServerEventSessionActions.findByModule", query = "SELECT s FROM ServerEventSessionActions s WHERE s.module = :module")})
public class ServerEventSessionActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_session_id")
    private int eventSessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_id")
    private int eventId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "package")
    private String package1;
    @Size(max = 128)
    @Column(name = "module")
    private String module;

    public ServerEventSessionActions() {
    }

    public int getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(int eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackage1() {
        return package1;
    }

    public void setPackage1(String package1) {
        this.package1 = package1;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
    
}
