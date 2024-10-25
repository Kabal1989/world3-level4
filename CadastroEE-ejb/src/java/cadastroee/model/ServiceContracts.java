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
@Table(name = "service_contracts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceContracts.findAll", query = "SELECT s FROM ServiceContracts s"),
    @NamedQuery(name = "ServiceContracts.findByName", query = "SELECT s FROM ServiceContracts s WHERE s.name = :name"),
    @NamedQuery(name = "ServiceContracts.findByServiceContractId", query = "SELECT s FROM ServiceContracts s WHERE s.serviceContractId = :serviceContractId"),
    @NamedQuery(name = "ServiceContracts.findByPrincipalId", query = "SELECT s FROM ServiceContracts s WHERE s.principalId = :principalId")})
public class ServiceContracts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;
    @Column(name = "principal_id")
    private Integer principalId;

    public ServiceContracts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
