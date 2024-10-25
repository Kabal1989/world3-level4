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
@Table(name = "CONSTRAINT_TABLE_USAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConstraintTableUsage.findAll", query = "SELECT c FROM ConstraintTableUsage c"),
    @NamedQuery(name = "ConstraintTableUsage.findByTableCatalog", query = "SELECT c FROM ConstraintTableUsage c WHERE c.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "ConstraintTableUsage.findByTableSchema", query = "SELECT c FROM ConstraintTableUsage c WHERE c.tableSchema = :tableSchema"),
    @NamedQuery(name = "ConstraintTableUsage.findByTableName", query = "SELECT c FROM ConstraintTableUsage c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "ConstraintTableUsage.findByConstraintCatalog", query = "SELECT c FROM ConstraintTableUsage c WHERE c.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "ConstraintTableUsage.findByConstraintSchema", query = "SELECT c FROM ConstraintTableUsage c WHERE c.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "ConstraintTableUsage.findByConstraintName", query = "SELECT c FROM ConstraintTableUsage c WHERE c.constraintName = :constraintName")})
public class ConstraintTableUsage implements Serializable {

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

    public ConstraintTableUsage() {
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
    
}
