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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "filetable_system_defined_objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FiletableSystemDefinedObjects.findAll", query = "SELECT f FROM FiletableSystemDefinedObjects f"),
    @NamedQuery(name = "FiletableSystemDefinedObjects.findByObjectId", query = "SELECT f FROM FiletableSystemDefinedObjects f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FiletableSystemDefinedObjects.findByParentObjectId", query = "SELECT f FROM FiletableSystemDefinedObjects f WHERE f.parentObjectId = :parentObjectId")})
public class FiletableSystemDefinedObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_object_id")
    private int parentObjectId;

    public FiletableSystemDefinedObjects() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
    }
    
}
