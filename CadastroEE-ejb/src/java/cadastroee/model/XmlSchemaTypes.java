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
@Table(name = "xml_schema_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaTypes.findAll", query = "SELECT x FROM XmlSchemaTypes x"),
    @NamedQuery(name = "XmlSchemaTypes.findByXmlComponentId", query = "SELECT x FROM XmlSchemaTypes x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaTypes.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaTypes x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaTypes.findByXmlNamespaceId", query = "SELECT x FROM XmlSchemaTypes x WHERE x.xmlNamespaceId = :xmlNamespaceId"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsQualified", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isQualified = :isQualified"),
    @NamedQuery(name = "XmlSchemaTypes.findByName", query = "SELECT x FROM XmlSchemaTypes x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaTypes.findBySymbolSpace", query = "SELECT x FROM XmlSchemaTypes x WHERE x.symbolSpace = :symbolSpace"),
    @NamedQuery(name = "XmlSchemaTypes.findBySymbolSpaceDesc", query = "SELECT x FROM XmlSchemaTypes x WHERE x.symbolSpaceDesc = :symbolSpaceDesc"),
    @NamedQuery(name = "XmlSchemaTypes.findByKind", query = "SELECT x FROM XmlSchemaTypes x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaTypes.findByKindDesc", query = "SELECT x FROM XmlSchemaTypes x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaTypes.findByDerivation", query = "SELECT x FROM XmlSchemaTypes x WHERE x.derivation = :derivation"),
    @NamedQuery(name = "XmlSchemaTypes.findByDerivationDesc", query = "SELECT x FROM XmlSchemaTypes x WHERE x.derivationDesc = :derivationDesc"),
    @NamedQuery(name = "XmlSchemaTypes.findByBaseXmlComponentId", query = "SELECT x FROM XmlSchemaTypes x WHERE x.baseXmlComponentId = :baseXmlComponentId"),
    @NamedQuery(name = "XmlSchemaTypes.findByScopingXmlComponentId", query = "SELECT x FROM XmlSchemaTypes x WHERE x.scopingXmlComponentId = :scopingXmlComponentId"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsAbstract", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isAbstract = :isAbstract"),
    @NamedQuery(name = "XmlSchemaTypes.findByAllowsMixedContent", query = "SELECT x FROM XmlSchemaTypes x WHERE x.allowsMixedContent = :allowsMixedContent"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsExtensionBlocked", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isExtensionBlocked = :isExtensionBlocked"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsRestrictionBlocked", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isRestrictionBlocked = :isRestrictionBlocked"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsFinalExtension", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isFinalExtension = :isFinalExtension"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsFinalRestriction", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isFinalRestriction = :isFinalRestriction"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsFinalListMember", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isFinalListMember = :isFinalListMember"),
    @NamedQuery(name = "XmlSchemaTypes.findByIsFinalUnionMember", query = "SELECT x FROM XmlSchemaTypes x WHERE x.isFinalUnionMember = :isFinalUnionMember")})
public class XmlSchemaTypes implements Serializable {

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
    @Column(name = "is_abstract")
    private boolean isAbstract;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allows_mixed_content")
    private boolean allowsMixedContent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_extension_blocked")
    private boolean isExtensionBlocked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_restriction_blocked")
    private boolean isRestrictionBlocked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_final_extension")
    private boolean isFinalExtension;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_final_restriction")
    private boolean isFinalRestriction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_final_list_member")
    private boolean isFinalListMember;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_final_union_member")
    private boolean isFinalUnionMember;

    public XmlSchemaTypes() {
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

    public boolean getIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public boolean getAllowsMixedContent() {
        return allowsMixedContent;
    }

    public void setAllowsMixedContent(boolean allowsMixedContent) {
        this.allowsMixedContent = allowsMixedContent;
    }

    public boolean getIsExtensionBlocked() {
        return isExtensionBlocked;
    }

    public void setIsExtensionBlocked(boolean isExtensionBlocked) {
        this.isExtensionBlocked = isExtensionBlocked;
    }

    public boolean getIsRestrictionBlocked() {
        return isRestrictionBlocked;
    }

    public void setIsRestrictionBlocked(boolean isRestrictionBlocked) {
        this.isRestrictionBlocked = isRestrictionBlocked;
    }

    public boolean getIsFinalExtension() {
        return isFinalExtension;
    }

    public void setIsFinalExtension(boolean isFinalExtension) {
        this.isFinalExtension = isFinalExtension;
    }

    public boolean getIsFinalRestriction() {
        return isFinalRestriction;
    }

    public void setIsFinalRestriction(boolean isFinalRestriction) {
        this.isFinalRestriction = isFinalRestriction;
    }

    public boolean getIsFinalListMember() {
        return isFinalListMember;
    }

    public void setIsFinalListMember(boolean isFinalListMember) {
        this.isFinalListMember = isFinalListMember;
    }

    public boolean getIsFinalUnionMember() {
        return isFinalUnionMember;
    }

    public void setIsFinalUnionMember(boolean isFinalUnionMember) {
        this.isFinalUnionMember = isFinalUnionMember;
    }
    
}
