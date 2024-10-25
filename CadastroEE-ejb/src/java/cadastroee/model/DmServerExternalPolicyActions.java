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
@Table(name = "dm_server_external_policy_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerExternalPolicyActions.findAll", query = "SELECT d FROM DmServerExternalPolicyActions d"),
    @NamedQuery(name = "DmServerExternalPolicyActions.findBySqlActionId", query = "SELECT d FROM DmServerExternalPolicyActions d WHERE d.sqlActionId = :sqlActionId"),
    @NamedQuery(name = "DmServerExternalPolicyActions.findByActionNamespace", query = "SELECT d FROM DmServerExternalPolicyActions d WHERE d.actionNamespace = :actionNamespace"),
    @NamedQuery(name = "DmServerExternalPolicyActions.findByActionType", query = "SELECT d FROM DmServerExternalPolicyActions d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DmServerExternalPolicyActions.findByActionProviderString", query = "SELECT d FROM DmServerExternalPolicyActions d WHERE d.actionProviderString = :actionProviderString")})
public class DmServerExternalPolicyActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "sql_action_id")
    private Integer sqlActionId;
    @Size(max = 256)
    @Column(name = "action_namespace")
    private String actionNamespace;
    @Size(max = 32)
    @Column(name = "action_type")
    private String actionType;
    @Size(max = 20)
    @Column(name = "action_provider_string")
    private String actionProviderString;

    public DmServerExternalPolicyActions() {
    }

    public Integer getSqlActionId() {
        return sqlActionId;
    }

    public void setSqlActionId(Integer sqlActionId) {
        this.sqlActionId = sqlActionId;
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

    public String getActionProviderString() {
        return actionProviderString;
    }

    public void setActionProviderString(String actionProviderString) {
        this.actionProviderString = actionProviderString;
    }
    
}
