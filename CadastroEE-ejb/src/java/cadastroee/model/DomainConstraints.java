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
@Table(name = "DOMAIN_CONSTRAINTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DomainConstraints.findAll", query = "SELECT d FROM DomainConstraints d"),
    @NamedQuery(name = "DomainConstraints.findByConstraintCatalog", query = "SELECT d FROM DomainConstraints d WHERE d.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "DomainConstraints.findByConstraintSchema", query = "SELECT d FROM DomainConstraints d WHERE d.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "DomainConstraints.findByConstraintName", query = "SELECT d FROM DomainConstraints d WHERE d.constraintName = :constraintName"),
    @NamedQuery(name = "DomainConstraints.findByDomainCatalog", query = "SELECT d FROM DomainConstraints d WHERE d.domainCatalog = :domainCatalog"),
    @NamedQuery(name = "DomainConstraints.findByDomainSchema", query = "SELECT d FROM DomainConstraints d WHERE d.domainSchema = :domainSchema"),
    @NamedQuery(name = "DomainConstraints.findByDomainName", query = "SELECT d FROM DomainConstraints d WHERE d.domainName = :domainName"),
    @NamedQuery(name = "DomainConstraints.findByIsDeferrable", query = "SELECT d FROM DomainConstraints d WHERE d.isDeferrable = :isDeferrable"),
    @NamedQuery(name = "DomainConstraints.findByInitiallyDeferred", query = "SELECT d FROM DomainConstraints d WHERE d.initiallyDeferred = :initiallyDeferred")})
public class DomainConstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Size(max = 128)
    @Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;
    @Size(max = 128)
    @Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DOMAIN_NAME")
    private String domainName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "IS_DEFERRABLE")
    private String isDeferrable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "INITIALLY_DEFERRED")
    private String initiallyDeferred;

    public DomainConstraints() {
    }

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public String getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getIsDeferrable() {
        return isDeferrable;
    }

    public void setIsDeferrable(String isDeferrable) {
        this.isDeferrable = isDeferrable;
    }

    public String getInitiallyDeferred() {
        return initiallyDeferred;
    }

    public void setInitiallyDeferred(String initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }
    
}
