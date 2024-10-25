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
@Table(name = "registered_search_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegisteredSearchProperties.findAll", query = "SELECT r FROM RegisteredSearchProperties r"),
    @NamedQuery(name = "RegisteredSearchProperties.findByPropertyListId", query = "SELECT r FROM RegisteredSearchProperties r WHERE r.propertyListId = :propertyListId"),
    @NamedQuery(name = "RegisteredSearchProperties.findByPropertyId", query = "SELECT r FROM RegisteredSearchProperties r WHERE r.propertyId = :propertyId"),
    @NamedQuery(name = "RegisteredSearchProperties.findByPropertyName", query = "SELECT r FROM RegisteredSearchProperties r WHERE r.propertyName = :propertyName"),
    @NamedQuery(name = "RegisteredSearchProperties.findByPropertySetGuid", query = "SELECT r FROM RegisteredSearchProperties r WHERE r.propertySetGuid = :propertySetGuid"),
    @NamedQuery(name = "RegisteredSearchProperties.findByPropertyIntId", query = "SELECT r FROM RegisteredSearchProperties r WHERE r.propertyIntId = :propertyIntId"),
    @NamedQuery(name = "RegisteredSearchProperties.findByPropertyDescription", query = "SELECT r FROM RegisteredSearchProperties r WHERE r.propertyDescription = :propertyDescription")})
public class RegisteredSearchProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "property_list_id")
    private int propertyListId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "property_id")
    private int propertyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "property_name")
    private String propertyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "property_set_guid")
    private String propertySetGuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "property_int_id")
    private int propertyIntId;
    @Size(max = 512)
    @Column(name = "property_description")
    private String propertyDescription;

    public RegisteredSearchProperties() {
    }

    public int getPropertyListId() {
        return propertyListId;
    }

    public void setPropertyListId(int propertyListId) {
        this.propertyListId = propertyListId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertySetGuid() {
        return propertySetGuid;
    }

    public void setPropertySetGuid(String propertySetGuid) {
        this.propertySetGuid = propertySetGuid;
    }

    public int getPropertyIntId() {
        return propertyIntId;
    }

    public void setPropertyIntId(int propertyIntId) {
        this.propertyIntId = propertyIntId;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }
    
}
