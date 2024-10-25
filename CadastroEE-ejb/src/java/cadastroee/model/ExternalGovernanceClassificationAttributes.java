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
@Table(name = "external_governance_classification_attributes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalGovernanceClassificationAttributes.findAll", query = "SELECT e FROM ExternalGovernanceClassificationAttributes e"),
    @NamedQuery(name = "ExternalGovernanceClassificationAttributes.findByObjectId", query = "SELECT e FROM ExternalGovernanceClassificationAttributes e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalGovernanceClassificationAttributes.findByType", query = "SELECT e FROM ExternalGovernanceClassificationAttributes e WHERE e.type = :type"),
    @NamedQuery(name = "ExternalGovernanceClassificationAttributes.findByTypeDesc", query = "SELECT e FROM ExternalGovernanceClassificationAttributes e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "ExternalGovernanceClassificationAttributes.findByObjectAttributes", query = "SELECT e FROM ExternalGovernanceClassificationAttributes e WHERE e.objectAttributes = :objectAttributes")})
public class ExternalGovernanceClassificationAttributes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Size(max = 2147483647)
    @Column(name = "object_attributes")
    private String objectAttributes;

    public ExternalGovernanceClassificationAttributes() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getObjectAttributes() {
        return objectAttributes;
    }

    public void setObjectAttributes(String objectAttributes) {
        this.objectAttributes = objectAttributes;
    }
    
}
