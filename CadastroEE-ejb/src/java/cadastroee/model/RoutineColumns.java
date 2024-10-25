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
@Table(name = "ROUTINE_COLUMNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoutineColumns.findAll", query = "SELECT r FROM RoutineColumns r"),
    @NamedQuery(name = "RoutineColumns.findByTableCatalog", query = "SELECT r FROM RoutineColumns r WHERE r.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "RoutineColumns.findByTableSchema", query = "SELECT r FROM RoutineColumns r WHERE r.tableSchema = :tableSchema"),
    @NamedQuery(name = "RoutineColumns.findByTableName", query = "SELECT r FROM RoutineColumns r WHERE r.tableName = :tableName"),
    @NamedQuery(name = "RoutineColumns.findByColumnName", query = "SELECT r FROM RoutineColumns r WHERE r.columnName = :columnName"),
    @NamedQuery(name = "RoutineColumns.findByOrdinalPosition", query = "SELECT r FROM RoutineColumns r WHERE r.ordinalPosition = :ordinalPosition"),
    @NamedQuery(name = "RoutineColumns.findByColumnDefault", query = "SELECT r FROM RoutineColumns r WHERE r.columnDefault = :columnDefault"),
    @NamedQuery(name = "RoutineColumns.findByIsNullable", query = "SELECT r FROM RoutineColumns r WHERE r.isNullable = :isNullable"),
    @NamedQuery(name = "RoutineColumns.findByDataType", query = "SELECT r FROM RoutineColumns r WHERE r.dataType = :dataType"),
    @NamedQuery(name = "RoutineColumns.findByCharacterMaximumLength", query = "SELECT r FROM RoutineColumns r WHERE r.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "RoutineColumns.findByCharacterOctetLength", query = "SELECT r FROM RoutineColumns r WHERE r.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "RoutineColumns.findByNumericPrecision", query = "SELECT r FROM RoutineColumns r WHERE r.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "RoutineColumns.findByNumericPrecisionRadix", query = "SELECT r FROM RoutineColumns r WHERE r.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "RoutineColumns.findByNumericScale", query = "SELECT r FROM RoutineColumns r WHERE r.numericScale = :numericScale"),
    @NamedQuery(name = "RoutineColumns.findByDatetimePrecision", query = "SELECT r FROM RoutineColumns r WHERE r.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "RoutineColumns.findByCharacterSetCatalog", query = "SELECT r FROM RoutineColumns r WHERE r.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "RoutineColumns.findByCharacterSetSchema", query = "SELECT r FROM RoutineColumns r WHERE r.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "RoutineColumns.findByCharacterSetName", query = "SELECT r FROM RoutineColumns r WHERE r.characterSetName = :characterSetName"),
    @NamedQuery(name = "RoutineColumns.findByCollationCatalog", query = "SELECT r FROM RoutineColumns r WHERE r.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "RoutineColumns.findByCollationSchema", query = "SELECT r FROM RoutineColumns r WHERE r.collationSchema = :collationSchema"),
    @NamedQuery(name = "RoutineColumns.findByCollationName", query = "SELECT r FROM RoutineColumns r WHERE r.collationName = :collationName"),
    @NamedQuery(name = "RoutineColumns.findByDomainCatalog", query = "SELECT r FROM RoutineColumns r WHERE r.domainCatalog = :domainCatalog"),
    @NamedQuery(name = "RoutineColumns.findByDomainSchema", query = "SELECT r FROM RoutineColumns r WHERE r.domainSchema = :domainSchema"),
    @NamedQuery(name = "RoutineColumns.findByDomainName", query = "SELECT r FROM RoutineColumns r WHERE r.domainName = :domainName")})
public class RoutineColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 128)
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDINAL_POSITION")
    private int ordinalPosition;
    @Size(max = 4000)
    @Column(name = "COLUMN_DEFAULT")
    private String columnDefault;
    @Size(max = 3)
    @Column(name = "IS_NULLABLE")
    private String isNullable;
    @Size(max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Integer characterMaximumLength;
    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Integer characterOctetLength;
    @Column(name = "NUMERIC_PRECISION")
    private Short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Column(name = "DATETIME_PRECISION")
    private Short datetimePrecision;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
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
    @Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;
    @Size(max = 128)
    @Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;
    @Size(max = 128)
    @Column(name = "DOMAIN_NAME")
    private String domainName;

    public RoutineColumns() {
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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
    
}
