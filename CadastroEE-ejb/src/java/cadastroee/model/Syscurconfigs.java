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
@Table(name = "syscurconfigs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscurconfigs.findAll", query = "SELECT s FROM Syscurconfigs s"),
    @NamedQuery(name = "Syscurconfigs.findByValue", query = "SELECT s FROM Syscurconfigs s WHERE s.value = :value"),
    @NamedQuery(name = "Syscurconfigs.findByConfig", query = "SELECT s FROM Syscurconfigs s WHERE s.config = :config"),
    @NamedQuery(name = "Syscurconfigs.findByComment", query = "SELECT s FROM Syscurconfigs s WHERE s.comment = :comment"),
    @NamedQuery(name = "Syscurconfigs.findByStatus", query = "SELECT s FROM Syscurconfigs s WHERE s.status = :status")})
public class Syscurconfigs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private int value;
    @Column(name = "config")
    private Short config;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "comment")
    private String comment;
    @Column(name = "status")
    private Short status;

    public Syscurconfigs() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Short getConfig() {
        return config;
    }

    public void setConfig(Short config) {
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
