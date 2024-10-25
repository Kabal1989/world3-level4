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
@Table(name = "xml_schema_attributes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaAttributes.findAll", query = "SELECT x FROM XmlSchemaAttributes x"),
    @NamedQuery(name = "XmlSchemaAttributes.findByXmlComponentId", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaAttributes.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaAttributes.findByXmlNamespaceId", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.xmlNamespaceId = :xmlNamespaceId"),
    @NamedQuery(name = "XmlSchemaAttributes.findByIsQualified", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.isQualified = :isQualified"),
    @NamedQuery(name = "XmlSchemaAttributes.findByName", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaAttributes.findBySymbolSpace", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.symbolSpace = :symbolSpace"),
    @NamedQuery(name = "XmlSchemaAttributes.findBySymbolSpaceDesc", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.symbolSpaceDesc = :symbolSpaceDesc"),
    @NamedQuery(name = "XmlSchemaAttributes.findByKind", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaAttributes.findByKindDesc", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaAttributes.findByDerivation", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.derivation = :derivation"),
    @NamedQuery(name = "XmlSchemaAttributes.findByDerivationDesc", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.derivationDesc = :derivationDesc"),
    @NamedQuery(name = "XmlSchemaAttributes.findByBaseXmlComponentId", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.baseXmlComponentId = :baseXmlComponentId"),
    @NamedQuery(name = "XmlSchemaAttributes.findByScopingXmlComponentId", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.scopingXmlComponentId = :scopingXmlComponentId"),
    @NamedQuery(name = "XmlSchemaAttributes.findByIsDefaultFixed", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.isDefaultFixed = :isDefaultFixed"),
    @NamedQuery(name = "XmlSchemaAttributes.findByMustBeQualified", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.mustBeQualified = :mustBeQualified"),
    @NamedQuery(name = "XmlSchemaAttributes.findByDefaultValue", query = "SELECT x FROM XmlSchemaAttributes x WHERE x.defaultValue = :defaultValue")})
public class XmlSchemaAttributes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_namespace_id")
    private int xmlNamespaceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_qualified")
    private boolean isQualified;
    @Size(max = 4000)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "symbol_space")
    private Character symbolSpace;
    @Size(max = 60)
    @Column(name = "symbol_space_desc")
    private String symbolSpaceDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kind")
    private Character kind;
    @Size(max = 60)
    @Column(name = "kind_desc")
    private String kindDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "derivation")
    private Character derivation;
    @Size(max = 60)
    @Column(name = "derivation_desc")
    private String derivationDesc;
    @Column(name = "base_xml_component_id")
    private Integer baseXmlComponentId;
    @Column(name = "scoping_xml_component_id")
    private Integer scopingXmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_default_fixed")
    private boolean isDefaultFixed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "must_be_qualified")
    private boolean mustBeQualified;
    @Size(max = 4000)
    @Column(name = "default_value")
    private String defaultValue;

    public XmlSchemaAttributes() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public int getXmlNamespaceId() {
        return xmlNamespaceId;
    }

    public void setXmlNamespaceId(int xmlNamespaceId) {
        this.xmlNamespaceId = xmlNamespaceId;
    }

    public boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(boolean isQualified) {
        this.isQualified = isQualified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSymbolSpace() {
        return symbolSpace;
    }

    public void setSymbolSpace(Character symbolSpace) {
        this.symbolSpace = symbolSpace;
    }

    public String getSymbolSpaceDesc() {
        return symbolSpaceDesc;
    }

    public void setSymbolSpaceDesc(String symbolSpaceDesc) {
        this.symbolSpaceDesc = symbolSpaceDesc;
    }

    public Character getKind() {
        return kind;
    }

    public void setKind(Character kind) {
        this.kind = kind;
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
    }

    public Character getDerivation() {
        return derivation;
    }

    public void setDerivation(Character derivation) {
        this.derivation = derivation;
    }

    public String getDerivationDesc() {
        return derivationDesc;
    }

    public void setDerivationDesc(String derivationDesc) {
        this.derivationDesc = derivationDesc;
    }

    public Integer getBaseXmlComponentId() {
        return baseXmlComponentId;
    }

    public void setBaseXmlComponentId(Integer baseXmlComponentId) {
        this.baseXmlComponentId = baseXmlComponentId;
    }

    public Integer getScopingXmlComponentId() {
        return scopingXmlComponentId;
    }

    public void setScopingXmlComponentId(Integer scopingXmlComponentId) {
        this.scopingXmlComponentId = scopingXmlComponentId;
    }

    public boolean getIsDefaultFixed() {
        return isDefaultFixed;
    }

    public void setIsDefaultFixed(boolean isDefaultFixed) {
        this.isDefaultFixed = isDefaultFixed;
    }

    public boolean getMustBeQualified() {
        return mustBeQualified;
    }

    public void setMustBeQualified(boolean mustBeQualified) {
        this.mustBeQualified = mustBeQualified;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
}
