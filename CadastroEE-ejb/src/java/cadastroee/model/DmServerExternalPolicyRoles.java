/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_server_external_policy_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerExternalPolicyRoles.findAll", query = "SELECT d FROM DmServerExternalPolicyRoles d"),
    @NamedQuery(name = "DmServerExternalPolicyRoles.findByRoleName", query = "SELECT d FROM DmServerExternalPolicyRoles d WHERE d.roleName = :roleName"),
    @NamedQuery(name = "DmServerExternalPolicyRoles.findByRoleGuid", query = "SELECT d FROM DmServerExternalPolicyRoles d WHERE d.roleGuid = :roleGuid"),
    @NamedQuery(name = "DmServerExternalPolicyRoles.findByModifyDate", query = "SELECT d FROM DmServerExternalPolicyRoles d WHERE d.modifyDate = :modifyDate")})
public class DmServerExternalPolicyRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "role_name")
    private String roleName;
    @Size(max = 128)
    @Column(name = "role_guid")
    private String roleGuid;
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public DmServerExternalPolicyRoles() {
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

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}
