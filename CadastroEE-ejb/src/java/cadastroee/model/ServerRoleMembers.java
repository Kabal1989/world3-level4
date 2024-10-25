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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "server_role_members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerRoleMembers.findAll", query = "SELECT s FROM ServerRoleMembers s"),
    @NamedQuery(name = "ServerRoleMembers.findByRolePrincipalId", query = "SELECT s FROM ServerRoleMembers s WHERE s.rolePrincipalId = :rolePrincipalId"),
    @NamedQuery(name = "ServerRoleMembers.findByMemberPrincipalId", query = "SELECT s FROM ServerRoleMembers s WHERE s.memberPrincipalId = :memberPrincipalId")})
public class ServerRoleMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_principal_id")
    private int rolePrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "member_principal_id")
    private int memberPrincipalId;

    public ServerRoleMembers() {
    }

    public int getRolePrincipalId() {
        return rolePrincipalId;
    }

    public void setRolePrincipalId(int rolePrincipalId) {
        this.rolePrincipalId = rolePrincipalId;
    }

    public int getMemberPrincipalId() {
        return memberPrincipalId;
    }

    public void setMemberPrincipalId(int memberPrincipalId) {
        this.memberPrincipalId = memberPrincipalId;
    }
    
}
