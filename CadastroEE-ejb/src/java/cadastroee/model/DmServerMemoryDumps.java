/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_server_memory_dumps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerMemoryDumps.findAll", query = "SELECT d FROM DmServerMemoryDumps d"),
    @NamedQuery(name = "DmServerMemoryDumps.findByFilename", query = "SELECT d FROM DmServerMemoryDumps d WHERE d.filename = :filename"),
    @NamedQuery(name = "DmServerMemoryDumps.findByCreationTime", query = "SELECT d FROM DmServerMemoryDumps d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "DmServerMemoryDumps.findBySizeInBytes", query = "SELECT d FROM DmServerMemoryDumps d WHERE d.sizeInBytes = :sizeInBytes")})
public class DmServerMemoryDumps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_time")
    private Serializable creationTime;
    @Column(name = "size_in_bytes")
    private BigInteger sizeInBytes;

    public DmServerMemoryDumps() {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Serializable getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Serializable creationTime) {
        this.creationTime = creationTime;
    }

    public BigInteger getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(BigInteger sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
    
}
