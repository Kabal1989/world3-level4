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
@Table(name = "dm_db_script_level")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbScriptLevel.findAll", query = "SELECT d FROM DmDbScriptLevel d"),
    @NamedQuery(name = "DmDbScriptLevel.findByDatabaseId", query = "SELECT d FROM DmDbScriptLevel d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbScriptLevel.findByScriptId", query = "SELECT d FROM DmDbScriptLevel d WHERE d.scriptId = :scriptId"),
    @NamedQuery(name = "DmDbScriptLevel.findByScriptName", query = "SELECT d FROM DmDbScriptLevel d WHERE d.scriptName = :scriptName"),
    @NamedQuery(name = "DmDbScriptLevel.findByVersion", query = "SELECT d FROM DmDbScriptLevel d WHERE d.version = :version"),
    @NamedQuery(name = "DmDbScriptLevel.findByScriptLevel", query = "SELECT d FROM DmDbScriptLevel d WHERE d.scriptLevel = :scriptLevel"),
    @NamedQuery(name = "DmDbScriptLevel.findByDowngradeStartLevel", query = "SELECT d FROM DmDbScriptLevel d WHERE d.downgradeStartLevel = :downgradeStartLevel"),
    @NamedQuery(name = "DmDbScriptLevel.findByDowngradeTargetLevel", query = "SELECT d FROM DmDbScriptLevel d WHERE d.downgradeTargetLevel = :downgradeTargetLevel"),
    @NamedQuery(name = "DmDbScriptLevel.findByUpgradeStartLevel", query = "SELECT d FROM DmDbScriptLevel d WHERE d.upgradeStartLevel = :upgradeStartLevel"),
    @NamedQuery(name = "DmDbScriptLevel.findByUpgradeTargetLevel", query = "SELECT d FROM DmDbScriptLevel d WHERE d.upgradeTargetLevel = :upgradeTargetLevel")})
public class DmDbScriptLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "script_id")
    private int scriptId;
    @Size(max = 128)
    @Column(name = "script_name")
    private String scriptName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "script_level")
    private int scriptLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "downgrade_start_level")
    private int downgradeStartLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "downgrade_target_level")
    private int downgradeTargetLevel;
    @Column(name = "upgrade_start_level")
    private Integer upgradeStartLevel;
    @Column(name = "upgrade_target_level")
    private Integer upgradeTargetLevel;

    public DmDbScriptLevel() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getScriptId() {
        return scriptId;
    }

    public void setScriptId(int scriptId) {
        this.scriptId = scriptId;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getScriptLevel() {
        return scriptLevel;
    }

    public void setScriptLevel(int scriptLevel) {
        this.scriptLevel = scriptLevel;
    }

    public int getDowngradeStartLevel() {
        return downgradeStartLevel;
    }

    public void setDowngradeStartLevel(int downgradeStartLevel) {
        this.downgradeStartLevel = downgradeStartLevel;
    }

    public int getDowngradeTargetLevel() {
        return downgradeTargetLevel;
    }

    public void setDowngradeTargetLevel(int downgradeTargetLevel) {
        this.downgradeTargetLevel = downgradeTargetLevel;
    }

    public Integer getUpgradeStartLevel() {
        return upgradeStartLevel;
    }

    public void setUpgradeStartLevel(Integer upgradeStartLevel) {
        this.upgradeStartLevel = upgradeStartLevel;
    }

    public Integer getUpgradeTargetLevel() {
        return upgradeTargetLevel;
    }

    public void setUpgradeTargetLevel(Integer upgradeTargetLevel) {
        this.upgradeTargetLevel = upgradeTargetLevel;
    }
    
}
