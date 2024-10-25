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
@Table(name = "message_type_xml_schema_collection_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MessageTypeXmlSchemaCollectionUsages.findAll", query = "SELECT m FROM MessageTypeXmlSchemaCollectionUsages m"),
    @NamedQuery(name = "MessageTypeXmlSchemaCollectionUsages.findByMessageTypeId", query = "SELECT m FROM MessageTypeXmlSchemaCollectionUsages m WHERE m.messageTypeId = :messageTypeId"),
    @NamedQuery(name = "MessageTypeXmlSchemaCollectionUsages.findByXmlCollectionId", query = "SELECT m FROM MessageTypeXmlSchemaCollectionUsages m WHERE m.xmlCollectionId = :xmlCollectionId")})
public class MessageTypeXmlSchemaCollectionUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_type_id")
    private int messageTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;

    public MessageTypeXmlSchemaCollectionUsages() {
    }

    public int getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(int messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }
    
}
