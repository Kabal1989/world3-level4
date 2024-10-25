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
@Table(name = "xml_schema_model_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaModelGroups.findAll", query = "SELECT x FROM XmlSchemaModelGroups x"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByXmlComponentId", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByXmlNamespaceId", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.xmlNamespaceId = :xmlNamespaceId"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByIsQualified", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.isQualified = :isQualified"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByName", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaModelGroups.findBySymbolSpace", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.symbolSpace = :symbolSpace"),
    @NamedQuery(name = "XmlSchemaModelGroups.findBySymbolSpaceDesc", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.symbolSpaceDesc = :symbolSpaceDesc"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByKind", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByKindDesc", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByDerivation", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.derivation = :derivation"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByDerivationDesc", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.derivationDesc = :derivationDesc"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByBaseXmlComponentId", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.baseXmlComponentId = :baseXmlComponentId"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByScopingXmlComponentId", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.scopingXmlComponentId = :scopingXmlComponentId"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByCompositor", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.compositor = :compositor"),
    @NamedQuery(name = "XmlSchemaModelGroups.findByCompositorDesc", query = "SELECT x FROM XmlSchemaModelGroups x WHERE x.compositorDesc = :compositorDesc")})
public class XmlSchemaModelGroups implements Serializable {

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
    @Column(name = "compositor")
    private Character compositor;
    @Size(max = 60)
    @Column(name = "compositor_desc")
    private String compositorDesc;

    public XmlSchemaModelGroups() {
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

    public Character getCompositor() {
        return compositor;
    }

    public void setCompositor(Character compositor) {
        this.compositor = compositor;
    }

    public String getCompositorDesc() {
        return compositorDesc;
    }

    public void setCompositorDesc(String compositorDesc) {
        this.compositorDesc = compositorDesc;
    }
    
}
