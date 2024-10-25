/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "syscharsets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscharsets.findAll", query = "SELECT s FROM Syscharsets s"),
    @NamedQuery(name = "Syscharsets.findByType", query = "SELECT s FROM Syscharsets s WHERE s.type = :type"),
    @NamedQuery(name = "Syscharsets.findById", query = "SELECT s FROM Syscharsets s WHERE s.id = :id"),
    @NamedQuery(name = "Syscharsets.findByCsid", query = "SELECT s FROM Syscharsets s WHERE s.csid = :csid"),
    @NamedQuery(name = "Syscharsets.findByStatus", query = "SELECT s FROM Syscharsets s WHERE s.status = :status"),
    @NamedQuery(name = "Syscharsets.findByName", query = "SELECT s FROM Syscharsets s WHERE s.name = :name"),
    @NamedQuery(name = "Syscharsets.findByDescription", query = "SELECT s FROM Syscharsets s WHERE s.description = :description")})
public class Syscharsets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private short id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "csid")
    private short csid;
    @Column(name = "status")
    private Short status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "binarydefinition")
    private byte[] binarydefinition;
    @Lob
    @Column(name = "definition")
    private byte[] definition;

    public Syscharsets() {
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getCsid() {
        return csid;
    }

    public void setCsid(short csid) {
        this.csid = csid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getBinarydefinition() {
        return binarydefinition;
    }

    public void setBinarydefinition(byte[] binarydefinition) {
        this.binarydefinition = binarydefinition;
    }

    public byte[] getDefinition() {
        return definition;
    }

    public void setDefinition(byte[] definition) {
        this.definition = definition;
    }
    
}
