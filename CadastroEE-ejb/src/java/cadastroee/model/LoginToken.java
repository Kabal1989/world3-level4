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
@Table(name = "login_token")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginToken.findAll", query = "SELECT l FROM LoginToken l"),
    @NamedQuery(name = "LoginToken.findByPrincipalId", query = "SELECT l FROM LoginToken l WHERE l.principalId = :principalId"),
    @NamedQuery(name = "LoginToken.findByName", query = "SELECT l FROM LoginToken l WHERE l.name = :name"),
    @NamedQuery(name = "LoginToken.findByType", query = "SELECT l FROM LoginToken l WHERE l.type = :type"),
    @NamedQuery(name = "LoginToken.findByUsage", query = "SELECT l FROM LoginToken l WHERE l.usage = :usage")})
public class LoginToken implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "principal_id")
    private Integer principalId;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "type")
    private String type;
    @Size(max = 128)
    @Column(name = "usage")
    private String usage;

    public LoginToken() {
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
    
}
