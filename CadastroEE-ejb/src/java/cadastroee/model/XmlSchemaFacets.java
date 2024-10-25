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
@Table(name = "xml_schema_facets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaFacets.findAll", query = "SELECT x FROM XmlSchemaFacets x"),
    @NamedQuery(name = "XmlSchemaFacets.findByXmlComponentId", query = "SELECT x FROM XmlSchemaFacets x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaFacets.findByFacetId", query = "SELECT x FROM XmlSchemaFacets x WHERE x.facetId = :facetId"),
    @NamedQuery(name = "XmlSchemaFacets.findByKind", query = "SELECT x FROM XmlSchemaFacets x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaFacets.findByKindDesc", query = "SELECT x FROM XmlSchemaFacets x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaFacets.findByIsFixed", query = "SELECT x FROM XmlSchemaFacets x WHERE x.isFixed = :isFixed"),
    @NamedQuery(name = "XmlSchemaFacets.findByValue", query = "SELECT x FROM XmlSchemaFacets x WHERE x.value = :value")})
public class XmlSchemaFacets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "facet_id")
    private int facetId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "kind")
    private String kind;
    @Size(max = 60)
    @Column(name = "kind_desc")
    private String kindDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_fixed")
    private boolean isFixed;
    @Size(max = 4000)
    @Column(name = "value")
    private String value;

    public XmlSchemaFacets() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public int getFacetId() {
        return facetId;
    }

    public void setFacetId(int facetId) {
        this.facetId = facetId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
    }

    public boolean getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(boolean isFixed) {
        this.isFixed = isFixed;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
