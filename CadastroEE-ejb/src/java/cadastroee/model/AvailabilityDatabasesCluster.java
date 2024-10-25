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
@Table(name = "availability_databases_cluster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvailabilityDatabasesCluster.findAll", query = "SELECT a FROM AvailabilityDatabasesCluster a"),
    @NamedQuery(name = "AvailabilityDatabasesCluster.findByGroupId", query = "SELECT a FROM AvailabilityDatabasesCluster a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "AvailabilityDatabasesCluster.findByGroupDatabaseId", query = "SELECT a FROM AvailabilityDatabasesCluster a WHERE a.groupDatabaseId = :groupDatabaseId"),
    @NamedQuery(name = "AvailabilityDatabasesCluster.findByDatabaseName", query = "SELECT a FROM AvailabilityDatabasesCluster a WHERE a.databaseName = :databaseName"),
    @NamedQuery(name = "AvailabilityDatabasesCluster.findByTruncationLsn", query = "SELECT a FROM AvailabilityDatabasesCluster a WHERE a.truncationLsn = :truncationLsn")})
public class AvailabilityDatabasesCluster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_database_id")
    private String groupDatabaseId;
    @Size(max = 128)
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "truncation_lsn")
    private BigInteger truncationLsn;

    public AvailabilityDatabasesCluster() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupDatabaseId() {
        return groupDatabaseId;
    }

    public void setGroupDatabaseId(String groupDatabaseId) {
        this.groupDatabaseId = groupDatabaseId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public BigInteger getTruncationLsn() {
        return truncationLsn;
    }

    public void setTruncationLsn(BigInteger truncationLsn) {
        this.truncationLsn = truncationLsn;
    }
    
}
