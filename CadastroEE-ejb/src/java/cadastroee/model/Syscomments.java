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
@Table(name = "syscomments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscomments.findAll", query = "SELECT s FROM Syscomments s"),
    @NamedQuery(name = "Syscomments.findById", query = "SELECT s FROM Syscomments s WHERE s.id = :id"),
    @NamedQuery(name = "Syscomments.findByNumber", query = "SELECT s FROM Syscomments s WHERE s.number = :number"),
    @NamedQuery(name = "Syscomments.findByColid", query = "SELECT s FROM Syscomments s WHERE s.colid = :colid"),
    @NamedQuery(name = "Syscomments.findByStatus", query = "SELECT s FROM Syscomments s WHERE s.status = :status"),
    @NamedQuery(name = "Syscomments.findByTexttype", query = "SELECT s FROM Syscomments s WHERE s.texttype = :texttype"),
    @NamedQuery(name = "Syscomments.findByLanguage", query = "SELECT s FROM Syscomments s WHERE s.language = :language"),
    @NamedQuery(name = "Syscomments.findByEncrypted", query = "SELECT s FROM Syscomments s WHERE s.encrypted = :encrypted"),
    @NamedQuery(name = "Syscomments.findByCompressed", query = "SELECT s FROM Syscomments s WHERE s.compressed = :compressed"),
    @NamedQuery(name = "Syscomments.findByText", query = "SELECT s FROM Syscomments s WHERE s.text = :text")})
public class Syscomments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "number")
    private Short number;
    @Basic(optional = false)
    @NotNull
    @Column(name = "colid")
    private short colid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Lob
    @Column(name = "ctext")
    private byte[] ctext;
    @Column(name = "texttype")
    private Short texttype;
    @Column(name = "language")
    private Short language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "encrypted")
    private boolean encrypted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compressed")
    private boolean compressed;
    @Size(max = 4000)
    @Column(name = "text")
    private String text;

    public Syscomments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public short getColid() {
        return colid;
    }

    public void setColid(short colid) {
        this.colid = colid;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public byte[] getCtext() {
        return ctext;
    }

    public void setCtext(byte[] ctext) {
        this.ctext = ctext;
    }

    public Short getTexttype() {
        return texttype;
    }

    public void setTexttype(Short texttype) {
        this.texttype = texttype;
    }

    public Short getLanguage() {
        return language;
    }

    public void setLanguage(Short language) {
        this.language = language;
    }

    public boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public boolean getCompressed() {
        return compressed;
    }

    public void setCompressed(boolean compressed) {
        this.compressed = compressed;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
