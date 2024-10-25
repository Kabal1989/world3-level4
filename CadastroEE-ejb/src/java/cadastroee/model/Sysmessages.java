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
@Table(name = "sysmessages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysmessages.findAll", query = "SELECT s FROM Sysmessages s"),
    @NamedQuery(name = "Sysmessages.findByError", query = "SELECT s FROM Sysmessages s WHERE s.error = :error"),
    @NamedQuery(name = "Sysmessages.findBySeverity", query = "SELECT s FROM Sysmessages s WHERE s.severity = :severity"),
    @NamedQuery(name = "Sysmessages.findByDlevel", query = "SELECT s FROM Sysmessages s WHERE s.dlevel = :dlevel"),
    @NamedQuery(name = "Sysmessages.findByDescription", query = "SELECT s FROM Sysmessages s WHERE s.description = :description"),
    @NamedQuery(name = "Sysmessages.findByMsglangid", query = "SELECT s FROM Sysmessages s WHERE s.msglangid = :msglangid")})
public class Sysmessages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "error")
    private int error;
    @Column(name = "severity")
    private Short severity;
    @Column(name = "dlevel")
    private Short dlevel;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "msglangid")
    private short msglangid;

    public Sysmessages() {
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public Short getSeverity() {
        return severity;
    }

    public void setSeverity(Short severity) {
        this.severity = severity;
    }

    public Short getDlevel() {
        return dlevel;
    }

    public void setDlevel(Short dlevel) {
        this.dlevel = dlevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getMsglangid() {
        return msglangid;
    }

    public void setMsglangid(short msglangid) {
        this.msglangid = msglangid;
    }
    
}
