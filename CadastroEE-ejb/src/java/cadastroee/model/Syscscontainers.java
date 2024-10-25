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
@Table(name = "syscscontainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscscontainers.findAll", query = "SELECT s FROM Syscscontainers s"),
    @NamedQuery(name = "Syscscontainers.findByBlobContainerId", query = "SELECT s FROM Syscscontainers s WHERE s.blobContainerId = :blobContainerId"),
    @NamedQuery(name = "Syscscontainers.findByBlobContainerUrl", query = "SELECT s FROM Syscscontainers s WHERE s.blobContainerUrl = :blobContainerUrl"),
    @NamedQuery(name = "Syscscontainers.findByBlobContainerType", query = "SELECT s FROM Syscscontainers s WHERE s.blobContainerType = :blobContainerType")})
public class Syscscontainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blob_container_id")
    private short blobContainerId;
    @Size(max = 261)
    @Column(name = "blob_container_url")
    private String blobContainerUrl;
    @Column(name = "blob_container_type")
    private Short blobContainerType;

    public Syscscontainers() {
    }

    public short getBlobContainerId() {
        return blobContainerId;
    }

    public void setBlobContainerId(short blobContainerId) {
        this.blobContainerId = blobContainerId;
    }

    public String getBlobContainerUrl() {
        return blobContainerUrl;
    }

    public void setBlobContainerUrl(String blobContainerUrl) {
        this.blobContainerUrl = blobContainerUrl;
    }

    public Short getBlobContainerType() {
        return blobContainerType;
    }

    public void setBlobContainerType(Short blobContainerType) {
        this.blobContainerType = blobContainerType;
    }
    
}
