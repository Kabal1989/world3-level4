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
@Table(name = "registered_search_property_lists")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegisteredSearchPropertyLists.findAll", query = "SELECT r FROM RegisteredSearchPropertyLists r"),
    @NamedQuery(name = "RegisteredSearchPropertyLists.findByPropertyListId", query = "SELECT r FROM RegisteredSearchPropertyLists r WHERE r.propertyListId = :propertyListId"),
    @NamedQuery(name = "RegisteredSearchPropertyLists.findByName", query = "SELECT r FROM RegisteredSearchPropertyLists r WHERE r.name = :name"),
    @NamedQuery(name = "RegisteredSearchPropertyLists.findByCreateDate", query = "SELECT r FROM RegisteredSearchPropertyLists r WHERE r.createDate = :createDate"),
    @NamedQuery(name = "RegisteredSearchPropertyLists.findByModifyDate", query = "SELECT r FROM RegisteredSearchPropertyLists r WHERE r.modifyDate = :modifyDate"),
    @NamedQuery(name = "RegisteredSearchPropertyLists.findByPrincipalId", query = "SELECT r FROM RegisteredSearchPropertyLists r WHERE r.principalId = :principalId")})
public class RegisteredSearchPropertyLists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "property_list_id")
    private int propertyListId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
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
    @Column(name = "principal_id")
    private Integer principalId;

    public RegisteredSearchPropertyLists() {
    }

    public int getPropertyListId() {
        return propertyListId;
    }

    public void setPropertyListId(int propertyListId) {
        this.propertyListId = propertyListId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
