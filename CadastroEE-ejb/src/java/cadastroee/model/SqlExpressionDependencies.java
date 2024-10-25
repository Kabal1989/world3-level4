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
@Table(name = "sql_expression_dependencies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SqlExpressionDependencies.findAll", query = "SELECT s FROM SqlExpressionDependencies s"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencingId", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencingId = :referencingId"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencingMinorId", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencingMinorId = :referencingMinorId"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencingClass", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencingClass = :referencingClass"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencingClassDesc", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencingClassDesc = :referencingClassDesc"),
    @NamedQuery(name = "SqlExpressionDependencies.findByIsSchemaBoundReference", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.isSchemaBoundReference = :isSchemaBoundReference"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedClass", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedClass = :referencedClass"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedClassDesc", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedClassDesc = :referencedClassDesc"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedServerName", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedServerName = :referencedServerName"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedDatabaseName", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedDatabaseName = :referencedDatabaseName"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedSchemaName", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedSchemaName = :referencedSchemaName"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedEntityName", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedEntityName = :referencedEntityName"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedId", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedId = :referencedId"),
    @NamedQuery(name = "SqlExpressionDependencies.findByReferencedMinorId", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.referencedMinorId = :referencedMinorId"),
    @NamedQuery(name = "SqlExpressionDependencies.findByIsCallerDependent", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.isCallerDependent = :isCallerDependent"),
    @NamedQuery(name = "SqlExpressionDependencies.findByIsAmbiguous", query = "SELECT s FROM SqlExpressionDependencies s WHERE s.isAmbiguous = :isAmbiguous")})
public class SqlExpressionDependencies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referencing_id")
    private int referencingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referencing_minor_id")
    private int referencingMinorId;
    @Column(name = "referencing_class")
    private Short referencingClass;
    @Size(max = 60)
    @Column(name = "referencing_class_desc")
    private String referencingClassDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_schema_bound_reference")
    private boolean isSchemaBoundReference;
    @Column(name = "referenced_class")
    private Short referencedClass;
    @Size(max = 60)
    @Column(name = "referenced_class_desc")
    private String referencedClassDesc;
    @Size(max = 128)
    @Column(name = "referenced_server_name")
    private String referencedServerName;
    @Size(max = 128)
    @Column(name = "referenced_database_name")
    private String referencedDatabaseName;
    @Size(max = 128)
    @Column(name = "referenced_schema_name")
    private String referencedSchemaName;
    @Size(max = 128)
    @Column(name = "referenced_entity_name")
    private String referencedEntityName;
    @Column(name = "referenced_id")
    private Integer referencedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referenced_minor_id")
    private int referencedMinorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_caller_dependent")
    private boolean isCallerDependent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ambiguous")
    private boolean isAmbiguous;

    public SqlExpressionDependencies() {
    }

    public int getReferencingId() {
        return referencingId;
    }

    public void setReferencingId(int referencingId) {
        this.referencingId = referencingId;
    }

    public int getReferencingMinorId() {
        return referencingMinorId;
    }

    public void setReferencingMinorId(int referencingMinorId) {
        this.referencingMinorId = referencingMinorId;
    }

    public Short getReferencingClass() {
        return referencingClass;
    }

    public void setReferencingClass(Short referencingClass) {
        this.referencingClass = referencingClass;
    }

    public String getReferencingClassDesc() {
        return referencingClassDesc;
    }

    public void setReferencingClassDesc(String referencingClassDesc) {
        this.referencingClassDesc = referencingClassDesc;
    }

    public boolean getIsSchemaBoundReference() {
        return isSchemaBoundReference;
    }

    public void setIsSchemaBoundReference(boolean isSchemaBoundReference) {
        this.isSchemaBoundReference = isSchemaBoundReference;
    }

    public Short getReferencedClass() {
        return referencedClass;
    }

    public void setReferencedClass(Short referencedClass) {
        this.referencedClass = referencedClass;
    }

    public String getReferencedClassDesc() {
        return referencedClassDesc;
    }

    public void setReferencedClassDesc(String referencedClassDesc) {
        this.referencedClassDesc = referencedClassDesc;
    }

    public String getReferencedServerName() {
        return referencedServerName;
    }

    public void setReferencedServerName(String referencedServerName) {
        this.referencedServerName = referencedServerName;
    }

    public String getReferencedDatabaseName() {
        return referencedDatabaseName;
    }

    public void setReferencedDatabaseName(String referencedDatabaseName) {
        this.referencedDatabaseName = referencedDatabaseName;
    }

    public String getReferencedSchemaName() {
        return referencedSchemaName;
    }

    public void setReferencedSchemaName(String referencedSchemaName) {
        this.referencedSchemaName = referencedSchemaName;
    }

    public String getReferencedEntityName() {
        return referencedEntityName;
    }

    public void setReferencedEntityName(String referencedEntityName) {
        this.referencedEntityName = referencedEntityName;
    }

    public Integer getReferencedId() {
        return referencedId;
    }

    public void setReferencedId(Integer referencedId) {
        this.referencedId = referencedId;
    }

    public int getReferencedMinorId() {
        return referencedMinorId;
    }

    public void setReferencedMinorId(int referencedMinorId) {
        this.referencedMinorId = referencedMinorId;
    }

    public boolean getIsCallerDependent() {
        return isCallerDependent;
    }

    public void setIsCallerDependent(boolean isCallerDependent) {
        this.isCallerDependent = isCallerDependent;
    }

    public boolean getIsAmbiguous() {
        return isAmbiguous;
    }

    public void setIsAmbiguous(boolean isAmbiguous) {
        this.isAmbiguous = isAmbiguous;
    }
    
}
