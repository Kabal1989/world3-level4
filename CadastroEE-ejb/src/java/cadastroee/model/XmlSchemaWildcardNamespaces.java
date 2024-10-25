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
@Table(name = "xml_schema_wildcard_namespaces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findAll", query = "SELECT x FROM XmlSchemaWildcardNamespaces x"),
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findByXmlComponentId", query = "SELECT x FROM XmlSchemaWildcardNamespaces x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findByNamespace", query = "SELECT x FROM XmlSchemaWildcardNamespaces x WHERE x.namespace = :namespace")})
public class XmlSchemaWildcardNamespaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "namespace")
    private String namespace;

    public XmlSchemaWildcardNamespaces() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
}
