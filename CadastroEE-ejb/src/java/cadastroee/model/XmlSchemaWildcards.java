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
@Table(name = "xml_schema_wildcards")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaWildcards.findAll", query = "SELECT x FROM XmlSchemaWildcards x"),
    @NamedQuery(name = "XmlSchemaWildcards.findByXmlComponentId", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaWildcards.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaWildcards.findByXmlNamespaceId", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.xmlNamespaceId = :xmlNamespaceId"),
    @NamedQuery(name = "XmlSchemaWildcards.findByIsQualified", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.isQualified = :isQualified"),
    @NamedQuery(name = "XmlSchemaWildcards.findByName", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaWildcards.findBySymbolSpace", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.symbolSpace = :symbolSpace"),
    @NamedQuery(name = "XmlSchemaWildcards.findBySymbolSpaceDesc", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.symbolSpaceDesc = :symbolSpaceDesc"),
    @NamedQuery(name = "XmlSchemaWildcards.findByKind", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaWildcards.findByKindDesc", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaWildcards.findByDerivation", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.derivation = :derivation"),
    @NamedQuery(name = "XmlSchemaWildcards.findByDerivationDesc", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.derivationDesc = :derivationDesc"),
    @NamedQuery(name = "XmlSchemaWildcards.findByBaseXmlComponentId", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.baseXmlComponentId = :baseXmlComponentId"),
    @NamedQuery(name = "XmlSchemaWildcards.findByScopingXmlComponentId", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.scopingXmlComponentId = :scopingXmlComponentId"),
    @NamedQuery(name = "XmlSchemaWildcards.findByProcessContent", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.processContent = :processContent"),
    @NamedQuery(name = "XmlSchemaWildcards.findByProcessContentDesc", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.processContentDesc = :processContentDesc"),
    @NamedQuery(name = "XmlSchemaWildcards.findByDisallowNamespaces", query = "SELECT x FROM XmlSchemaWildcards x WHERE x.disallowNamespaces = :disallowNamespaces")})
public class XmlSchemaWildcards implements Serializable {

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
    @Column(name = "process_content")
    private Character processContent;
    @Size(max = 60)
    @Column(name = "process_content_desc")
    private String processContentDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "disallow_namespaces")
    private boolean disallowNamespaces;

    public XmlSchemaWildcards() {
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

    public Character getProcessContent() {
        return processContent;
    }

    public void setProcessContent(Character processContent) {
        this.processContent = processContent;
    }

    public String getProcessContentDesc() {
        return processContentDesc;
    }

    public void setProcessContentDesc(String processContentDesc) {
        this.processContentDesc = processContentDesc;
    }

    public boolean getDisallowNamespaces() {
        return disallowNamespaces;
    }

    public void setDisallowNamespaces(boolean disallowNamespaces) {
        this.disallowNamespaces = disallowNamespaces;
    }
    
}
