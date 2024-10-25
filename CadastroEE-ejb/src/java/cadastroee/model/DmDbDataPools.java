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
@Table(name = "dm_db_data_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbDataPools.findAll", query = "SELECT d FROM DmDbDataPools d"),
    @NamedQuery(name = "DmDbDataPools.findByDataPoolId", query = "SELECT d FROM DmDbDataPools d WHERE d.dataPoolId = :dataPoolId"),
    @NamedQuery(name = "DmDbDataPools.findByName", query = "SELECT d FROM DmDbDataPools d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbDataPools.findByLocation", query = "SELECT d FROM DmDbDataPools d WHERE d.location = :location")})
public class DmDbDataPools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_pool_id")
    private int dataPoolId;
    @Size(max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "location")
    private String location;

    public DmDbDataPools() {
    }

    public int getDataPoolId() {
        return dataPoolId;
    }

    public void setDataPoolId(int dataPoolId) {
        this.dataPoolId = dataPoolId;
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
