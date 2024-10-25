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
@Table(name = "server_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerPermissions.findAll", query = "SELECT s FROM ServerPermissions s"),
    @NamedQuery(name = "ServerPermissions.findByClass1", query = "SELECT s FROM ServerPermissions s WHERE s.class1 = :class1"),
    @NamedQuery(name = "ServerPermissions.findByClassDesc", query = "SELECT s FROM ServerPermissions s WHERE s.classDesc = :classDesc"),
    @NamedQuery(name = "ServerPermissions.findByMajorId", query = "SELECT s FROM ServerPermissions s WHERE s.majorId = :majorId"),
    @NamedQuery(name = "ServerPermissions.findByMinorId", query = "SELECT s FROM ServerPermissions s WHERE s.minorId = :minorId"),
    @NamedQuery(name = "ServerPermissions.findByGranteePrincipalId", query = "SELECT s FROM ServerPermissions s WHERE s.granteePrincipalId = :granteePrincipalId"),
    @NamedQuery(name = "ServerPermissions.findByGrantorPrincipalId", query = "SELECT s FROM ServerPermissions s WHERE s.grantorPrincipalId = :grantorPrincipalId"),
    @NamedQuery(name = "ServerPermissions.findByType", query = "SELECT s FROM ServerPermissions s WHERE s.type = :type"),
    @NamedQuery(name = "ServerPermissions.findByPermissionName", query = "SELECT s FROM ServerPermissions s WHERE s.permissionName = :permissionName"),
    @NamedQuery(name = "ServerPermissions.findByState", query = "SELECT s FROM ServerPermissions s WHERE s.state = :state"),
    @NamedQuery(name = "ServerPermissions.findByStateDesc", query = "SELECT s FROM ServerPermissions s WHERE s.stateDesc = :stateDesc")})
public class ServerPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "class")
    private short class1;
    @Size(max = 60)
    @Column(name = "class_desc")
    private String classDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "major_id")
    private int majorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minor_id")
    private int minorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grantee_principal_id")
    private int granteePrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grantor_principal_id")
    private int grantorPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "type")
    private String type;
    @Size(max = 128)
    @Column(name = "permission_name")
    private String permissionName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private Character state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;

    public ServerPermissions() {
    }

    public short getClass1() {
        return class1;
    }

    public void setClass1(short class1) {
        this.class1 = class1;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getMinorId() {
        return minorId;
    }

    public void setMinorId(int minorId) {
        this.minorId = minorId;
    }

    public int getGranteePrincipalId() {
        return granteePrincipalId;
    }

    public void setGranteePrincipalId(int granteePrincipalId) {
        this.granteePrincipalId = granteePrincipalId;
    }

    public int getGrantorPrincipalId() {
        return grantorPrincipalId;
    }

    public void setGrantorPrincipalId(int grantorPrincipalId) {
        this.grantorPrincipalId = grantorPrincipalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }
    
}
