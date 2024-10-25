/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_server_external_policy_principal_assigned_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findAll", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByPrincipalAadObjectId", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.principalAadObjectId = :principalAadObjectId"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByActionNamespace", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.actionNamespace = :actionNamespace"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByActionType", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByRoleName", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.roleName = :roleName"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByRoleGuid", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.roleGuid = :roleGuid"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByPolicyGuid", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.policyGuid = :policyGuid"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByRoleAssignmentScope", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.roleAssignmentScope = :roleAssignmentScope"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByRoleAssignmentType", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.roleAssignmentType = :roleAssignmentType"),
    @NamedQuery(name = "DmServerExternalPolicyPrincipalAssignedActions.findByRoleAssignmentTypeDesc", query = "SELECT d FROM DmServerExternalPolicyPrincipalAssignedActions d WHERE d.roleAssignmentTypeDesc = :roleAssignmentTypeDesc")})
public class DmServerExternalPolicyPrincipalAssignedActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "principal_sid")
    private byte[] principalSid;
    @Size(max = 36)
    @Column(name = "principal_aad_object_id")
    private String principalAadObjectId;
    @Size(max = 256)
    @Column(name = "action_namespace")
    private String actionNamespace;
    @Size(max = 32)
    @Column(name = "action_type")
    private String actionType;
    @Size(max = 128)
    @Column(name = "role_name")
    private String roleName;
    @Size(max = 128)
    @Column(name = "role_guid")
    private String roleGuid;
    @Size(max = 128)
    @Column(name = "policy_guid")
    private String policyGuid;
    @Size(max = 4000)
    @Column(name = "role_assignment_scope")
    private String roleAssignmentScope;
    @Column(name = "role_assignment_type")
    private Integer roleAssignmentType;
    @Size(max = 5)
    @Column(name = "role_assignment_type_desc")
    private String roleAssignmentTypeDesc;

    public DmServerExternalPolicyPrincipalAssignedActions() {
    }

    public byte[] getPrincipalSid() {
        return principalSid;
    }

    public void setPrincipalSid(byte[] principalSid) {
        this.principalSid = principalSid;
    }

    public String getPrincipalAadObjectId() {
        return principalAadObjectId;
    }

    public void setPrincipalAadObjectId(String principalAadObjectId) {
        this.principalAadObjectId = principalAadObjectId;
    }

    public String getActionNamespace() {
        return actionNamespace;
    }

    public void setActionNamespace(String actionNamespace) {
        this.actionNamespace = actionNamespace;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleGuid() {
        return roleGuid;
    }

    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid;
    }

    public String getPolicyGuid() {
        return policyGuid;
    }

    public void setPolicyGuid(String policyGuid) {
        this.policyGuid = policyGuid;
    }

    public String getRoleAssignmentScope() {
        return roleAssignmentScope;
    }

    public void setRoleAssignmentScope(String roleAssignmentScope) {
        this.roleAssignmentScope = roleAssignmentScope;
    }

    public Integer getRoleAssignmentType() {
        return roleAssignmentType;
    }

    public void setRoleAssignmentType(Integer roleAssignmentType) {
        this.roleAssignmentType = roleAssignmentType;
    }

    public String getRoleAssignmentTypeDesc() {
        return roleAssignmentTypeDesc;
    }

    public void setRoleAssignmentTypeDesc(String roleAssignmentTypeDesc) {
        this.roleAssignmentTypeDesc = roleAssignmentTypeDesc;
    }
    
}
