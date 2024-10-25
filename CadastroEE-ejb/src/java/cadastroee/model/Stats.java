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
@Table(name = "stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stats.findAll", query = "SELECT s FROM Stats s"),
    @NamedQuery(name = "Stats.findByObjectId", query = "SELECT s FROM Stats s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "Stats.findByName", query = "SELECT s FROM Stats s WHERE s.name = :name"),
    @NamedQuery(name = "Stats.findByStatsId", query = "SELECT s FROM Stats s WHERE s.statsId = :statsId"),
    @NamedQuery(name = "Stats.findByAutoCreated", query = "SELECT s FROM Stats s WHERE s.autoCreated = :autoCreated"),
    @NamedQuery(name = "Stats.findByUserCreated", query = "SELECT s FROM Stats s WHERE s.userCreated = :userCreated"),
    @NamedQuery(name = "Stats.findByNoRecompute", query = "SELECT s FROM Stats s WHERE s.noRecompute = :noRecompute"),
    @NamedQuery(name = "Stats.findByHasFilter", query = "SELECT s FROM Stats s WHERE s.hasFilter = :hasFilter"),
    @NamedQuery(name = "Stats.findByFilterDefinition", query = "SELECT s FROM Stats s WHERE s.filterDefinition = :filterDefinition"),
    @NamedQuery(name = "Stats.findByIsTemporary", query = "SELECT s FROM Stats s WHERE s.isTemporary = :isTemporary"),
    @NamedQuery(name = "Stats.findByIsIncremental", query = "SELECT s FROM Stats s WHERE s.isIncremental = :isIncremental"),
    @NamedQuery(name = "Stats.findByHasPersistedSample", query = "SELECT s FROM Stats s WHERE s.hasPersistedSample = :hasPersistedSample"),
    @NamedQuery(name = "Stats.findByStatsGenerationMethod", query = "SELECT s FROM Stats s WHERE s.statsGenerationMethod = :statsGenerationMethod"),
    @NamedQuery(name = "Stats.findByStatsGenerationMethodDesc", query = "SELECT s FROM Stats s WHERE s.statsGenerationMethodDesc = :statsGenerationMethodDesc"),
    @NamedQuery(name = "Stats.findByAutoDrop", query = "SELECT s FROM Stats s WHERE s.autoDrop = :autoDrop")})
public class Stats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stats_id")
    private int statsId;
    @Column(name = "auto_created")
    private Boolean autoCreated;
    @Column(name = "user_created")
    private Boolean userCreated;
    @Column(name = "no_recompute")
    private Boolean noRecompute;
    @Column(name = "has_filter")
    private Boolean hasFilter;
    @Size(max = 2147483647)
    @Column(name = "filter_definition")
    private String filterDefinition;
    @Column(name = "is_temporary")
    private Boolean isTemporary;
    @Column(name = "is_incremental")
    private Boolean isIncremental;
    @Column(name = "has_persisted_sample")
    private Boolean hasPersistedSample;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stats_generation_method")
    private int statsGenerationMethod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "stats_generation_method_desc")
    private String statsGenerationMethodDesc;
    @Column(name = "auto_drop")
    private Boolean autoDrop;

    public Stats() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatsId() {
        return statsId;
    }

    public void setStatsId(int statsId) {
        this.statsId = statsId;
    }

    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }

    public Boolean getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Boolean userCreated) {
        this.userCreated = userCreated;
    }

    public Boolean getNoRecompute() {
        return noRecompute;
    }

    public void setNoRecompute(Boolean noRecompute) {
        this.noRecompute = noRecompute;
    }

    public Boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(Boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public String getFilterDefinition() {
        return filterDefinition;
    }

    public void setFilterDefinition(String filterDefinition) {
        this.filterDefinition = filterDefinition;
    }

    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    public Boolean getIsIncremental() {
        return isIncremental;
    }

    public void setIsIncremental(Boolean isIncremental) {
        this.isIncremental = isIncremental;
    }

    public Boolean getHasPersistedSample() {
        return hasPersistedSample;
    }

    public void setHasPersistedSample(Boolean hasPersistedSample) {
        this.hasPersistedSample = hasPersistedSample;
    }

    public int getStatsGenerationMethod() {
        return statsGenerationMethod;
    }

    public void setStatsGenerationMethod(int statsGenerationMethod) {
        this.statsGenerationMethod = statsGenerationMethod;
    }

    public String getStatsGenerationMethodDesc() {
        return statsGenerationMethodDesc;
    }

    public void setStatsGenerationMethodDesc(String statsGenerationMethodDesc) {
        this.statsGenerationMethodDesc = statsGenerationMethodDesc;
    }

    public Boolean getAutoDrop() {
        return autoDrop;
    }

    public void setAutoDrop(Boolean autoDrop) {
        this.autoDrop = autoDrop;
    }
    
}
