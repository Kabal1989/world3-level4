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
@Table(name = "dm_audit_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmAuditActions.findAll", query = "SELECT d FROM DmAuditActions d"),
    @NamedQuery(name = "DmAuditActions.findByActionId", query = "SELECT d FROM DmAuditActions d WHERE d.actionId = :actionId"),
    @NamedQuery(name = "DmAuditActions.findByName", query = "SELECT d FROM DmAuditActions d WHERE d.name = :name"),
    @NamedQuery(name = "DmAuditActions.findByClassDesc", query = "SELECT d FROM DmAuditActions d WHERE d.classDesc = :classDesc"),
    @NamedQuery(name = "DmAuditActions.findByCoveringActionName", query = "SELECT d FROM DmAuditActions d WHERE d.coveringActionName = :coveringActionName"),
    @NamedQuery(name = "DmAuditActions.findByParentClassDesc", query = "SELECT d FROM DmAuditActions d WHERE d.parentClassDesc = :parentClassDesc"),
    @NamedQuery(name = "DmAuditActions.findByCoveringParentActionName", query = "SELECT d FROM DmAuditActions d WHERE d.coveringParentActionName = :coveringParentActionName"),
    @NamedQuery(name = "DmAuditActions.findByConfigurationLevel", query = "SELECT d FROM DmAuditActions d WHERE d.configurationLevel = :configurationLevel"),
    @NamedQuery(name = "DmAuditActions.findByContainingGroupName", query = "SELECT d FROM DmAuditActions d WHERE d.containingGroupName = :containingGroupName"),
    @NamedQuery(name = "DmAuditActions.findByActionInLog", query = "SELECT d FROM DmAuditActions d WHERE d.actionInLog = :actionInLog")})
public class DmAuditActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4)
    @Column(name = "action_id")
    private String actionId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 35)
    @Column(name = "class_desc")
    private String classDesc;
    @Size(max = 128)
    @Column(name = "covering_action_name")
    private String coveringActionName;
    @Size(max = 35)
    @Column(name = "parent_class_desc")
    private String parentClassDesc;
    @Size(max = 128)
    @Column(name = "covering_parent_action_name")
    private String coveringParentActionName;
    @Size(max = 128)
    @Column(name = "configuration_level")
    private String configurationLevel;
    @Size(max = 128)
    @Column(name = "containing_group_name")
    private String containingGroupName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "action_in_log")
    private boolean actionInLog;

    public DmAuditActions() {
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public String getCoveringActionName() {
        return coveringActionName;
    }

    public void setCoveringActionName(String coveringActionName) {
        this.coveringActionName = coveringActionName;
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc;
    }

    public String getCoveringParentActionName() {
        return coveringParentActionName;
    }

    public void setCoveringParentActionName(String coveringParentActionName) {
        this.coveringParentActionName = coveringParentActionName;
    }

    public String getConfigurationLevel() {
        return configurationLevel;
    }

    public void setConfigurationLevel(String configurationLevel) {
        this.configurationLevel = configurationLevel;
    }

    public String getContainingGroupName() {
        return containingGroupName;
    }

    public void setContainingGroupName(String containingGroupName) {
        this.containingGroupName = containingGroupName;
    }

    public boolean getActionInLog() {
        return actionInLog;
    }

    public void setActionInLog(boolean actionInLog) {
        this.actionInLog = actionInLog;
    }
    
}
