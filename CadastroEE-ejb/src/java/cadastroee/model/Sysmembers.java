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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "sysmembers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysmembers.findAll", query = "SELECT s FROM Sysmembers s"),
    @NamedQuery(name = "Sysmembers.findByMemberuid", query = "SELECT s FROM Sysmembers s WHERE s.memberuid = :memberuid"),
    @NamedQuery(name = "Sysmembers.findByGroupuid", query = "SELECT s FROM Sysmembers s WHERE s.groupuid = :groupuid")})
public class Sysmembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "memberuid")
    private Short memberuid;
    @Column(name = "groupuid")
    private Short groupuid;

    public Sysmembers() {
    }

    public Short getMemberuid() {
        return memberuid;
    }

    public void setMemberuid(Short memberuid) {
        this.memberuid = memberuid;
    }

    public Short getGroupuid() {
        return groupuid;
    }

    public void setGroupuid(Short groupuid) {
        this.groupuid = groupuid;
    }
    
}
