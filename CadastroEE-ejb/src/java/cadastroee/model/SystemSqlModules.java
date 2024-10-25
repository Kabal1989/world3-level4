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
@Table(name = "system_sql_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemSqlModules.findAll", query = "SELECT s FROM SystemSqlModules s"),
    @NamedQuery(name = "SystemSqlModules.findByObjectId", query = "SELECT s FROM SystemSqlModules s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SystemSqlModules.findByDefinition", query = "SELECT s FROM SystemSqlModules s WHERE s.definition = :definition"),
    @NamedQuery(name = "SystemSqlModules.findByUsesAnsiNulls", query = "SELECT s FROM SystemSqlModules s WHERE s.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "SystemSqlModules.findByUsesQuotedIdentifier", query = "SELECT s FROM SystemSqlModules s WHERE s.usesQuotedIdentifier = :usesQuotedIdentifier"),
    @NamedQuery(name = "SystemSqlModules.findByIsSchemaBound", query = "SELECT s FROM SystemSqlModules s WHERE s.isSchemaBound = :isSchemaBound"),
    @NamedQuery(name = "SystemSqlModules.findByUsesDatabaseCollation", query = "SELECT s FROM SystemSqlModules s WHERE s.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "SystemSqlModules.findByIsRecompiled", query = "SELECT s FROM SystemSqlModules s WHERE s.isRecompiled = :isRecompiled"),
    @NamedQuery(name = "SystemSqlModules.findByNullOnNullInput", query = "SELECT s FROM SystemSqlModules s WHERE s.nullOnNullInput = :nullOnNullInput"),
    @NamedQuery(name = "SystemSqlModules.findByExecuteAsPrincipalId", query = "SELECT s FROM SystemSqlModules s WHERE s.executeAsPrincipalId = :executeAsPrincipalId"),
    @NamedQuery(name = "SystemSqlModules.findByUsesNativeCompilation", query = "SELECT s FROM SystemSqlModules s WHERE s.usesNativeCompilation = :usesNativeCompilation"),
    @NamedQuery(name = "SystemSqlModules.findByInlineType", query = "SELECT s FROM SystemSqlModules s WHERE s.inlineType = :inlineType"),
    @NamedQuery(name = "SystemSqlModules.findByIsInlineable", query = "SELECT s FROM SystemSqlModules s WHERE s.isInlineable = :isInlineable")})
public class SystemSqlModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_ansi_nulls")
    private boolean usesAnsiNulls;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_quoted_identifier")
    private boolean usesQuotedIdentifier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_schema_bound")
    private boolean isSchemaBound;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_database_collation")
    private boolean usesDatabaseCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_recompiled")
    private boolean isRecompiled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "null_on_null_input")
    private boolean nullOnNullInput;
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_native_compilation")
    private boolean usesNativeCompilation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inline_type")
    private boolean inlineType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_inlineable")
    private boolean isInlineable;

    public SystemSqlModules() {
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

    public boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public boolean getUsesQuotedIdentifier() {
        return usesQuotedIdentifier;
    }

    public void setUsesQuotedIdentifier(boolean usesQuotedIdentifier) {
        this.usesQuotedIdentifier = usesQuotedIdentifier;
    }

    public boolean getIsSchemaBound() {
        return isSchemaBound;
    }

    public void setIsSchemaBound(boolean isSchemaBound) {
        this.isSchemaBound = isSchemaBound;
    }

    public boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public boolean getIsRecompiled() {
        return isRecompiled;
    }

    public void setIsRecompiled(boolean isRecompiled) {
        this.isRecompiled = isRecompiled;
    }

    public boolean getNullOnNullInput() {
        return nullOnNullInput;
    }

    public void setNullOnNullInput(boolean nullOnNullInput) {
        this.nullOnNullInput = nullOnNullInput;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }

    public boolean getUsesNativeCompilation() {
        return usesNativeCompilation;
    }

    public void setUsesNativeCompilation(boolean usesNativeCompilation) {
        this.usesNativeCompilation = usesNativeCompilation;
    }

    public boolean getInlineType() {
        return inlineType;
    }

    public void setInlineType(boolean inlineType) {
        this.inlineType = inlineType;
    }

    public boolean getIsInlineable() {
        return isInlineable;
    }

    public void setIsInlineable(boolean isInlineable) {
        this.isInlineable = isInlineable;
    }
    
}
