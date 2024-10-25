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
@Table(name = "dm_db_storage_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbStoragePools.findAll", query = "SELECT d FROM DmDbStoragePools d"),
    @NamedQuery(name = "DmDbStoragePools.findByStoragePoolId", query = "SELECT d FROM DmDbStoragePools d WHERE d.storagePoolId = :storagePoolId"),
    @NamedQuery(name = "DmDbStoragePools.findByName", query = "SELECT d FROM DmDbStoragePools d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbStoragePools.findByLocation", query = "SELECT d FROM DmDbStoragePools d WHERE d.location = :location")})
public class DmDbStoragePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "storage_pool_id")
    private int storagePoolId;
    @Size(max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "location")
    private String location;

    public DmDbStoragePools() {
    }

    public int getStoragePoolId() {
        return storagePoolId;
    }

    public void setStoragePoolId(int storagePoolId) {
        this.storagePoolId = storagePoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
