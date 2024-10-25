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
@Table(name = "assembly_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssemblyFiles.findAll", query = "SELECT a FROM AssemblyFiles a"),
    @NamedQuery(name = "AssemblyFiles.findByAssemblyId", query = "SELECT a FROM AssemblyFiles a WHERE a.assemblyId = :assemblyId"),
    @NamedQuery(name = "AssemblyFiles.findByName", query = "SELECT a FROM AssemblyFiles a WHERE a.name = :name"),
    @NamedQuery(name = "AssemblyFiles.findByFileId", query = "SELECT a FROM AssemblyFiles a WHERE a.fileId = :fileId")})
public class AssemblyFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;
    @Size(max = 260)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_id")
    private int fileId;
    @Lob
    @Column(name = "content")
    private byte[] content;
    @Lob
    @Column(name = "sha2_256")
    private byte[] sha2256;
    @Lob
    @Column(name = "sha2_512")
    private byte[] sha2512;

    public AssemblyFiles() {
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getSha2256() {
        return sha2256;
    }

    public void setSha2256(byte[] sha2256) {
        this.sha2256 = sha2256;
    }

    public byte[] getSha2512() {
        return sha2512;
    }

    public void setSha2512(byte[] sha2512) {
        this.sha2512 = sha2512;
    }
    
}
