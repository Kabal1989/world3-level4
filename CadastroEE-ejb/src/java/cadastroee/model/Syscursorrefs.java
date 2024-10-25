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
@Table(name = "syscursorrefs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscursorrefs.findAll", query = "SELECT s FROM Syscursorrefs s"),
    @NamedQuery(name = "Syscursorrefs.findByReferenceName", query = "SELECT s FROM Syscursorrefs s WHERE s.referenceName = :referenceName"),
    @NamedQuery(name = "Syscursorrefs.findByCursorScope", query = "SELECT s FROM Syscursorrefs s WHERE s.cursorScope = :cursorScope"),
    @NamedQuery(name = "Syscursorrefs.findByCursorHandl", query = "SELECT s FROM Syscursorrefs s WHERE s.cursorHandl = :cursorHandl")})
public class Syscursorrefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "reference_name")
    private String referenceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_scope")
    private short cursorScope;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_handl")
    private int cursorHandl;

    public Syscursorrefs() {
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public short getCursorScope() {
        return cursorScope;
    }

    public void setCursorScope(short cursorScope) {
        this.cursorScope = cursorScope;
    }

    public int getCursorHandl() {
        return cursorHandl;
    }

    public void setCursorHandl(int cursorHandl) {
        this.cursorHandl = cursorHandl;
    }
    
}
