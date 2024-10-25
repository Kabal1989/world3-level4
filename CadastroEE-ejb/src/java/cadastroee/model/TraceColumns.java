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
@Table(name = "trace_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraceColumns.findAll", query = "SELECT t FROM TraceColumns t"),
    @NamedQuery(name = "TraceColumns.findByTraceColumnId", query = "SELECT t FROM TraceColumns t WHERE t.traceColumnId = :traceColumnId"),
    @NamedQuery(name = "TraceColumns.findByName", query = "SELECT t FROM TraceColumns t WHERE t.name = :name"),
    @NamedQuery(name = "TraceColumns.findByTypeName", query = "SELECT t FROM TraceColumns t WHERE t.typeName = :typeName"),
    @NamedQuery(name = "TraceColumns.findByMaxSize", query = "SELECT t FROM TraceColumns t WHERE t.maxSize = :maxSize"),
    @NamedQuery(name = "TraceColumns.findByIsFilterable", query = "SELECT t FROM TraceColumns t WHERE t.isFilterable = :isFilterable"),
    @NamedQuery(name = "TraceColumns.findByIsRepeatable", query = "SELECT t FROM TraceColumns t WHERE t.isRepeatable = :isRepeatable"),
    @NamedQuery(name = "TraceColumns.findByIsRepeatedBase", query = "SELECT t FROM TraceColumns t WHERE t.isRepeatedBase = :isRepeatedBase")})
public class TraceColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trace_column_id")
    private short traceColumnId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "max_size")
    private Integer maxSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_filterable")
    private boolean isFilterable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_repeatable")
    private boolean isRepeatable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_repeated_base")
    private boolean isRepeatedBase;

    public TraceColumns() {
    }

    public short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public boolean getIsFilterable() {
        return isFilterable;
    }

    public void setIsFilterable(boolean isFilterable) {
        this.isFilterable = isFilterable;
    }

    public boolean getIsRepeatable() {
        return isRepeatable;
    }

    public void setIsRepeatable(boolean isRepeatable) {
        this.isRepeatable = isRepeatable;
    }

    public boolean getIsRepeatedBase() {
        return isRepeatedBase;
    }

    public void setIsRepeatedBase(boolean isRepeatedBase) {
        this.isRepeatedBase = isRepeatedBase;
    }
    
}
