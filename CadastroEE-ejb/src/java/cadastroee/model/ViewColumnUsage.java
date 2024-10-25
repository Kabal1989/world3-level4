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
@Table(name = "VIEW_COLUMN_USAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewColumnUsage.findAll", query = "SELECT v FROM ViewColumnUsage v"),
    @NamedQuery(name = "ViewColumnUsage.findByViewCatalog", query = "SELECT v FROM ViewColumnUsage v WHERE v.viewCatalog = :viewCatalog"),
    @NamedQuery(name = "ViewColumnUsage.findByViewSchema", query = "SELECT v FROM ViewColumnUsage v WHERE v.viewSchema = :viewSchema"),
    @NamedQuery(name = "ViewColumnUsage.findByViewName", query = "SELECT v FROM ViewColumnUsage v WHERE v.viewName = :viewName"),
    @NamedQuery(name = "ViewColumnUsage.findByTableCatalog", query = "SELECT v FROM ViewColumnUsage v WHERE v.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "ViewColumnUsage.findByTableSchema", query = "SELECT v FROM ViewColumnUsage v WHERE v.tableSchema = :tableSchema"),
    @NamedQuery(name = "ViewColumnUsage.findByTableName", query = "SELECT v FROM ViewColumnUsage v WHERE v.tableName = :tableName"),
    @NamedQuery(name = "ViewColumnUsage.findByColumnName", query = "SELECT v FROM ViewColumnUsage v WHERE v.columnName = :columnName")})
public class ViewColumnUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "VIEW_CATALOG")
    private String viewCatalog;
    @Size(max = 128)
    @Column(name = "VIEW_SCHEMA")
    private String viewSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "VIEW_NAME")
    private String viewName;
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

    public ViewColumnUsage() {
    }

    public String getViewCatalog() {
        return viewCatalog;
    }

    public void setViewCatalog(String viewCatalog) {
        this.viewCatalog = viewCatalog;
    }

    public String getViewSchema() {
        return viewSchema;
    }

    public void setViewSchema(String viewSchema) {
        this.viewSchema = viewSchema;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
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
    
}
