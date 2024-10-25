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
@Table(name = "DOMAINS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Domains.findAll", query = "SELECT d FROM Domains d"),
    @NamedQuery(name = "Domains.findByDomainCatalog", query = "SELECT d FROM Domains d WHERE d.domainCatalog = :domainCatalog"),
    @NamedQuery(name = "Domains.findByDomainSchema", query = "SELECT d FROM Domains d WHERE d.domainSchema = :domainSchema"),
    @NamedQuery(name = "Domains.findByDomainName", query = "SELECT d FROM Domains d WHERE d.domainName = :domainName"),
    @NamedQuery(name = "Domains.findByDataType", query = "SELECT d FROM Domains d WHERE d.dataType = :dataType"),
    @NamedQuery(name = "Domains.findByCharacterMaximumLength", query = "SELECT d FROM Domains d WHERE d.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "Domains.findByCharacterOctetLength", query = "SELECT d FROM Domains d WHERE d.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "Domains.findByCollationCatalog", query = "SELECT d FROM Domains d WHERE d.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "Domains.findByCollationSchema", query = "SELECT d FROM Domains d WHERE d.collationSchema = :collationSchema"),
    @NamedQuery(name = "Domains.findByCollationName", query = "SELECT d FROM Domains d WHERE d.collationName = :collationName"),
    @NamedQuery(name = "Domains.findByCharacterSetCatalog", query = "SELECT d FROM Domains d WHERE d.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "Domains.findByCharacterSetSchema", query = "SELECT d FROM Domains d WHERE d.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "Domains.findByCharacterSetName", query = "SELECT d FROM Domains d WHERE d.characterSetName = :characterSetName"),
    @NamedQuery(name = "Domains.findByNumericPrecision", query = "SELECT d FROM Domains d WHERE d.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Domains.findByNumericPrecisionRadix", query = "SELECT d FROM Domains d WHERE d.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Domains.findByNumericScale", query = "SELECT d FROM Domains d WHERE d.numericScale = :numericScale"),
    @NamedQuery(name = "Domains.findByDatetimePrecision", query = "SELECT d FROM Domains d WHERE d.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "Domains.findByDomainDefault", query = "SELECT d FROM Domains d WHERE d.domainDefault = :domainDefault")})
public class Domains implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Size(max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Integer characterMaximumLength;
    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Integer characterOctetLength;
    @Size(max = 128)
    @Column(name = "COLLATION_CATALOG")
    private String collationCatalog;
    @Size(max = 128)
    @Column(name = "COLLATION_SCHEMA")
    private String collationSchema;
    @Size(max = 128)
    @Column(name = "COLLATION_NAME")
    private String collationName;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
    @Column(name = "NUMERIC_PRECISION")
    private Short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Column(name = "DATETIME_PRECISION")
    private Short datetimePrecision;
    @Size(max = 4000)
    @Column(name = "DOMAIN_DEFAULT")
    private String domainDefault;

    public Domains() {
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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public String getCollationCatalog() {
        return collationCatalog;
    }

    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    public String getCollationSchema() {
        return collationSchema;
    }

    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public String getCharacterSetCatalog() {
        return characterSetCatalog;
    }

    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    public String getCharacterSetSchema() {
        return characterSetSchema;
    }

    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public Short getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Short numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Short getNumericPrecisionRadix() {
        return numericPrecisionRadix;
    }

    public void setNumericPrecisionRadix(Short numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public Short getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Short datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getDomainDefault() {
        return domainDefault;
    }

    public void setDomainDefault(String domainDefault) {
        this.domainDefault = domainDefault;
    }
    
}
