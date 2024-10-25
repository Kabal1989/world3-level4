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
@Table(name = "sql_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SqlModules.findAll", query = "SELECT s FROM SqlModules s"),
    @NamedQuery(name = "SqlModules.findByObjectId", query = "SELECT s FROM SqlModules s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SqlModules.findByDefinition", query = "SELECT s FROM SqlModules s WHERE s.definition = :definition"),
    @NamedQuery(name = "SqlModules.findByUsesAnsiNulls", query = "SELECT s FROM SqlModules s WHERE s.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "SqlModules.findByUsesQuotedIdentifier", query = "SELECT s FROM SqlModules s WHERE s.usesQuotedIdentifier = :usesQuotedIdentifier"),
    @NamedQuery(name = "SqlModules.findByIsSchemaBound", query = "SELECT s FROM SqlModules s WHERE s.isSchemaBound = :isSchemaBound"),
    @NamedQuery(name = "SqlModules.findByUsesDatabaseCollation", query = "SELECT s FROM SqlModules s WHERE s.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "SqlModules.findByIsRecompiled", query = "SELECT s FROM SqlModules s WHERE s.isRecompiled = :isRecompiled"),
    @NamedQuery(name = "SqlModules.findByNullOnNullInput", query = "SELECT s FROM SqlModules s WHERE s.nullOnNullInput = :nullOnNullInput"),
    @NamedQuery(name = "SqlModules.findByExecuteAsPrincipalId", query = "SELECT s FROM SqlModules s WHERE s.executeAsPrincipalId = :executeAsPrincipalId"),
    @NamedQuery(name = "SqlModules.findByUsesNativeCompilation", query = "SELECT s FROM SqlModules s WHERE s.usesNativeCompilation = :usesNativeCompilation"),
    @NamedQuery(name = "SqlModules.findByInlineType", query = "SELECT s FROM SqlModules s WHERE s.inlineType = :inlineType"),
    @NamedQuery(name = "SqlModules.findByIsInlineable", query = "SELECT s FROM SqlModules s WHERE s.isInlineable = :isInlineable")})
public class SqlModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Column(name = "uses_ansi_nulls")
    private Boolean usesAnsiNulls;
    @Column(name = "uses_quoted_identifier")
    private Boolean usesQuotedIdentifier;
    @Column(name = "is_schema_bound")
    private Boolean isSchemaBound;
    @Column(name = "uses_database_collation")
    private Boolean usesDatabaseCollation;
    @Column(name = "is_recompiled")
    private Boolean isRecompiled;
    @Column(name = "null_on_null_input")
    private Boolean nullOnNullInput;
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;
    @Column(name = "uses_native_compilation")
    private Boolean usesNativeCompilation;
    @Column(name = "inline_type")
    private Boolean inlineType;
    @Column(name = "is_inlineable")
    private Boolean isInlineable;

    public SqlModules() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public Boolean getUsesQuotedIdentifier() {
        return usesQuotedIdentifier;
    }

    public void setUsesQuotedIdentifier(Boolean usesQuotedIdentifier) {
        this.usesQuotedIdentifier = usesQuotedIdentifier;
    }

    public Boolean getIsSchemaBound() {
        return isSchemaBound;
    }

    public void setIsSchemaBound(Boolean isSchemaBound) {
        this.isSchemaBound = isSchemaBound;
    }

    public Boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(Boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public Boolean getIsRecompiled() {
        return isRecompiled;
    }

    public void setIsRecompiled(Boolean isRecompiled) {
        this.isRecompiled = isRecompiled;
    }

    public Boolean getNullOnNullInput() {
        return nullOnNullInput;
    }

    public void setNullOnNullInput(Boolean nullOnNullInput) {
        this.nullOnNullInput = nullOnNullInput;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }

    public Boolean getUsesNativeCompilation() {
        return usesNativeCompilation;
    }

    public void setUsesNativeCompilation(Boolean usesNativeCompilation) {
        this.usesNativeCompilation = usesNativeCompilation;
    }

    public Boolean getInlineType() {
        return inlineType;
    }

    public void setInlineType(Boolean inlineType) {
        this.inlineType = inlineType;
    }

    public Boolean getIsInlineable() {
        return isInlineable;
    }

    public void setIsInlineable(Boolean isInlineable) {
        this.isInlineable = isInlineable;
    }
    
}
