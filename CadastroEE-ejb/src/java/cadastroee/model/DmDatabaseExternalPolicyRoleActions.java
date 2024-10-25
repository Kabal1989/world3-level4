/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_database_external_policy_role_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDatabaseExternalPolicyRoleActions.findAll", query = "SELECT d FROM DmDatabaseExternalPolicyRoleActions d"),
    @NamedQuery(name = "DmDatabaseExternalPolicyRoleActions.findByRoleGuid", query = "SELECT d FROM DmDatabaseExternalPolicyRoleActions d WHERE d.roleGuid = :roleGuid"),
    @NamedQuery(name = "DmDatabaseExternalPolicyRoleActions.findBySqlActionId", query = "SELECT d FROM DmDatabaseExternalPolicyRoleActions d WHERE d.sqlActionId = :sqlActionId")})
public class DmDatabaseExternalPolicyRoleActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "role_guid")
    private String roleGuid;
    @Column(name = "sql_action_id")
    private Integer sqlActionId;

    public DmDatabaseExternalPolicyRoleActions() {
    }

    public String getRoleGuid() {
        return roleGuid;
    }

    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid;
    }

    public Integer getSqlActionId() {
        return sqlActionId;
    }

    public void setSqlActionId(Integer sqlActionId) {
        this.sqlActionId = sqlActionId;
    }
    
}
