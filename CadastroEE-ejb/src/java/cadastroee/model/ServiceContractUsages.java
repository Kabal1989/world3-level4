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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "service_contract_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceContractUsages.findAll", query = "SELECT s FROM ServiceContractUsages s"),
    @NamedQuery(name = "ServiceContractUsages.findByServiceId", query = "SELECT s FROM ServiceContractUsages s WHERE s.serviceId = :serviceId"),
    @NamedQuery(name = "ServiceContractUsages.findByServiceContractId", query = "SELECT s FROM ServiceContractUsages s WHERE s.serviceContractId = :serviceContractId")})
public class ServiceContractUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;

    public ServiceContractUsages() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }
    
}
