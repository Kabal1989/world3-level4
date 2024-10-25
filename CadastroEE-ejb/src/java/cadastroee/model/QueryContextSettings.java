/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "query_context_settings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryContextSettings.findAll", query = "SELECT q FROM QueryContextSettings q"),
    @NamedQuery(name = "QueryContextSettings.findByContextSettingsId", query = "SELECT q FROM QueryContextSettings q WHERE q.contextSettingsId = :contextSettingsId"),
    @NamedQuery(name = "QueryContextSettings.findByLanguageId", query = "SELECT q FROM QueryContextSettings q WHERE q.languageId = :languageId"),
    @NamedQuery(name = "QueryContextSettings.findByDateFormat", query = "SELECT q FROM QueryContextSettings q WHERE q.dateFormat = :dateFormat"),
    @NamedQuery(name = "QueryContextSettings.findByDateFirst", query = "SELECT q FROM QueryContextSettings q WHERE q.dateFirst = :dateFirst"),
    @NamedQuery(name = "QueryContextSettings.findByRequiredCursorOptions", query = "SELECT q FROM QueryContextSettings q WHERE q.requiredCursorOptions = :requiredCursorOptions"),
    @NamedQuery(name = "QueryContextSettings.findByAcceptableCursorOptions", query = "SELECT q FROM QueryContextSettings q WHERE q.acceptableCursorOptions = :acceptableCursorOptions"),
    @NamedQuery(name = "QueryContextSettings.findByMergeActionType", query = "SELECT q FROM QueryContextSettings q WHERE q.mergeActionType = :mergeActionType"),
    @NamedQuery(name = "QueryContextSettings.findByDefaultSchemaId", query = "SELECT q FROM QueryContextSettings q WHERE q.defaultSchemaId = :defaultSchemaId"),
    @NamedQuery(name = "QueryContextSettings.findByIsReplicationSpecific", query = "SELECT q FROM QueryContextSettings q WHERE q.isReplicationSpecific = :isReplicationSpecific")})
public class QueryContextSettings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "context_settings_id")
    private long contextSettingsId;
    @Lob
    @Column(name = "set_options")
    private byte[] setOptions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private short languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_format")
    private short dateFormat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_first")
    private short dateFirst;
    @Lob
    @Column(name = "status")
    private byte[] status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "required_cursor_options")
    private int requiredCursorOptions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acceptable_cursor_options")
    private int acceptableCursorOptions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "merge_action_type")
    private short mergeActionType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "default_schema_id")
    private int defaultSchemaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_replication_specific")
    private boolean isReplicationSpecific;
    @Lob
    @Column(name = "is_contained")
    private byte[] isContained;

    public QueryContextSettings() {
    }

    public long getContextSettingsId() {
        return contextSettingsId;
    }

    public void setContextSettingsId(long contextSettingsId) {
        this.contextSettingsId = contextSettingsId;
    }

    public byte[] getSetOptions() {
        return setOptions;
    }

    public void setSetOptions(byte[] setOptions) {
        this.setOptions = setOptions;
    }

    public short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(short languageId) {
        this.languageId = languageId;
    }

    public short getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(short dateFormat) {
        this.dateFormat = dateFormat;
    }

    public short getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(short dateFirst) {
        this.dateFirst = dateFirst;
    }

    public byte[] getStatus() {
        return status;
    }

    public void setStatus(byte[] status) {
        this.status = status;
    }

    public int getRequiredCursorOptions() {
        return requiredCursorOptions;
    }

    public void setRequiredCursorOptions(int requiredCursorOptions) {
        this.requiredCursorOptions = requiredCursorOptions;
    }

    public int getAcceptableCursorOptions() {
        return acceptableCursorOptions;
    }

    public void setAcceptableCursorOptions(int acceptableCursorOptions) {
        this.acceptableCursorOptions = acceptableCursorOptions;
    }

    public short getMergeActionType() {
        return mergeActionType;
    }

    public void setMergeActionType(short mergeActionType) {
        this.mergeActionType = mergeActionType;
    }

    public int getDefaultSchemaId() {
        return defaultSchemaId;
    }

    public void setDefaultSchemaId(int defaultSchemaId) {
        this.defaultSchemaId = defaultSchemaId;
    }

    public boolean getIsReplicationSpecific() {
        return isReplicationSpecific;
    }

    public void setIsReplicationSpecific(boolean isReplicationSpecific) {
        this.isReplicationSpecific = isReplicationSpecific;
    }

    public byte[] getIsContained() {
        return isContained;
    }

    public void setIsContained(byte[] isContained) {
        this.isContained = isContained;
    }
    
}
