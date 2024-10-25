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
@Table(name = "service_message_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceMessageTypes.findAll", query = "SELECT s FROM ServiceMessageTypes s"),
    @NamedQuery(name = "ServiceMessageTypes.findByName", query = "SELECT s FROM ServiceMessageTypes s WHERE s.name = :name"),
    @NamedQuery(name = "ServiceMessageTypes.findByMessageTypeId", query = "SELECT s FROM ServiceMessageTypes s WHERE s.messageTypeId = :messageTypeId"),
    @NamedQuery(name = "ServiceMessageTypes.findByPrincipalId", query = "SELECT s FROM ServiceMessageTypes s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServiceMessageTypes.findByValidation", query = "SELECT s FROM ServiceMessageTypes s WHERE s.validation = :validation"),
    @NamedQuery(name = "ServiceMessageTypes.findByValidationDesc", query = "SELECT s FROM ServiceMessageTypes s WHERE s.validationDesc = :validationDesc"),
    @NamedQuery(name = "ServiceMessageTypes.findByXmlCollectionId", query = "SELECT s FROM ServiceMessageTypes s WHERE s.xmlCollectionId = :xmlCollectionId")})
public class ServiceMessageTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_type_id")
    private int messageTypeId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "validation")
    private String validation;
    @Size(max = 60)
    @Column(name = "validation_desc")
    private String validationDesc;
    @Column(name = "xml_collection_id")
    private Integer xmlCollectionId;

    public ServiceMessageTypes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(int messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public String getValidationDesc() {
        return validationDesc;
    }

    public void setValidationDesc(String validationDesc) {
        this.validationDesc = validationDesc;
    }

    public Integer getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(Integer xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }
    
}
