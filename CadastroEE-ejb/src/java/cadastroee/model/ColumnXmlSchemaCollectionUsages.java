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
@Table(name = "column_xml_schema_collection_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findAll", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c"),
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findByObjectId", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findByColumnId", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findByXmlCollectionId", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c WHERE c.xmlCollectionId = :xmlCollectionId")})
public class ColumnXmlSchemaCollectionUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;

    public ColumnXmlSchemaCollectionUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }
    
}
