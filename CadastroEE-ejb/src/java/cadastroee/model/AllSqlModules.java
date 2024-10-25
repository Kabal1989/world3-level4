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
@Table(name = "all_sql_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllSqlModules.findAll", query = "SELECT a FROM AllSqlModules a"),
    @NamedQuery(name = "AllSqlModules.findByObjectId", query = "SELECT a FROM AllSqlModules a WHERE a.objectId = :objectId"),
    @NamedQuery(name = "AllSqlModules.findByDefinition", query = "SELECT a FROM AllSqlModules a WHERE a.definition = :definition"),
    @NamedQuery(name = "AllSqlModules.findByUsesAnsiNulls", query = "SELECT a FROM AllSqlModules a WHERE a.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "AllSqlModules.findByUsesQuotedIdentifier", query = "SELECT a FROM AllSqlModules a WHERE a.usesQuotedIdentifier = :usesQuotedIdentifier"),
    @NamedQuery(name = "AllSqlModules.findByIsSchemaBound", query = "SELECT a FROM AllSqlModules a WHERE a.isSchemaBound = :isSchemaBound"),
    @NamedQuery(name = "AllSqlModules.findByUsesDatabaseCollation", query = "SELECT a FROM AllSqlModules a WHERE a.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "AllSqlModules.findByIsRecompiled", query = "SELECT a FROM AllSqlModules a WHERE a.isRecompiled = :isRecompiled"),
    @NamedQuery(name = "AllSqlModules.findByNullOnNullInput", query = "SELECT a FROM AllSqlModules a WHERE a.nullOnNullInput = :nullOnNullInput"),
    @NamedQuery(name = "AllSqlModules.findByExecuteAsPrincipalId", query = "SELECT a FROM AllSqlModules a WHERE a.executeAsPrincipalId = :executeAsPrincipalId"),
    @NamedQuery(name = "AllSqlModules.findByUsesNativeCompilation", query = "SELECT a FROM AllSqlModules a WHERE a.usesNativeCompilation = :usesNativeCompilation"),
    @NamedQuery(name = "AllSqlModules.findByInlineType", query = "SELECT a FROM AllSqlModules a WHERE a.inlineType = :inlineType"),
    @NamedQuery(name = "AllSqlModules.findByIsInlineable", query = "SELECT a FROM AllSqlModules a WHERE a.isInlineable = :isInlineable")})
public class AllSqlModules implements Serializable {

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

    public AllSqlModules() {
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
