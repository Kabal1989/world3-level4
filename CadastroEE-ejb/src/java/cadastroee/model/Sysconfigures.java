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
@Table(name = "sysconfigures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysconfigures.findAll", query = "SELECT s FROM Sysconfigures s"),
    @NamedQuery(name = "Sysconfigures.findByValue", query = "SELECT s FROM Sysconfigures s WHERE s.value = :value"),
    @NamedQuery(name = "Sysconfigures.findByConfig", query = "SELECT s FROM Sysconfigures s WHERE s.config = :config"),
    @NamedQuery(name = "Sysconfigures.findByComment", query = "SELECT s FROM Sysconfigures s WHERE s.comment = :comment"),
    @NamedQuery(name = "Sysconfigures.findByStatus", query = "SELECT s FROM Sysconfigures s WHERE s.status = :status")})
public class Sysconfigures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "value")
    private Integer value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "config")
    private int config;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "comment")
    private String comment;
    @Column(name = "status")
    private Short status;

    public Sysconfigures() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public int getConfig() {
        return config;
    }

    public void setConfig(int config) {
        this.config = config;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
    
}
