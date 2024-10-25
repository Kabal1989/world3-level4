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
@Table(name = "remote_data_archive_databases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RemoteDataArchiveDatabases.findAll", query = "SELECT r FROM RemoteDataArchiveDatabases r"),
    @NamedQuery(name = "RemoteDataArchiveDatabases.findByRemoteDatabaseId", query = "SELECT r FROM RemoteDataArchiveDatabases r WHERE r.remoteDatabaseId = :remoteDatabaseId"),
    @NamedQuery(name = "RemoteDataArchiveDatabases.findByRemoteDatabaseName", query = "SELECT r FROM RemoteDataArchiveDatabases r WHERE r.remoteDatabaseName = :remoteDatabaseName"),
    @NamedQuery(name = "RemoteDataArchiveDatabases.findByDataSourceId", query = "SELECT r FROM RemoteDataArchiveDatabases r WHERE r.dataSourceId = :dataSourceId"),
    @NamedQuery(name = "RemoteDataArchiveDatabases.findByFederatedServiceAccount", query = "SELECT r FROM RemoteDataArchiveDatabases r WHERE r.federatedServiceAccount = :federatedServiceAccount")})
public class RemoteDataArchiveDatabases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "remote_database_id")
    private int remoteDatabaseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "remote_database_name")
    private String remoteDatabaseName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_source_id")
    private int dataSourceId;
    @Column(name = "federated_service_account")
    private Boolean federatedServiceAccount;

    public RemoteDataArchiveDatabases() {
    }

    public int getRemoteDatabaseId() {
        return remoteDatabaseId;
    }

    public void setRemoteDatabaseId(int remoteDatabaseId) {
        this.remoteDatabaseId = remoteDatabaseId;
    }

    public String getRemoteDatabaseName() {
        return remoteDatabaseName;
    }

    public void setRemoteDatabaseName(String remoteDatabaseName) {
        this.remoteDatabaseName = remoteDatabaseName;
    }

    public int getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Boolean getFederatedServiceAccount() {
        return federatedServiceAccount;
    }

    public void setFederatedServiceAccount(Boolean federatedServiceAccount) {
        this.federatedServiceAccount = federatedServiceAccount;
    }
    
}
