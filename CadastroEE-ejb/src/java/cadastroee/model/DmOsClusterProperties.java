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
@Table(name = "dm_os_cluster_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsClusterProperties.findAll", query = "SELECT d FROM DmOsClusterProperties d"),
    @NamedQuery(name = "DmOsClusterProperties.findByVerboseLogging", query = "SELECT d FROM DmOsClusterProperties d WHERE d.verboseLogging = :verboseLogging"),
    @NamedQuery(name = "DmOsClusterProperties.findBySqlDumperDumpFlags", query = "SELECT d FROM DmOsClusterProperties d WHERE d.sqlDumperDumpFlags = :sqlDumperDumpFlags"),
    @NamedQuery(name = "DmOsClusterProperties.findBySqlDumperDumpPath", query = "SELECT d FROM DmOsClusterProperties d WHERE d.sqlDumperDumpPath = :sqlDumperDumpPath"),
    @NamedQuery(name = "DmOsClusterProperties.findBySqlDumperDumpTimeOut", query = "SELECT d FROM DmOsClusterProperties d WHERE d.sqlDumperDumpTimeOut = :sqlDumperDumpTimeOut"),
    @NamedQuery(name = "DmOsClusterProperties.findByFailureConditionLevel", query = "SELECT d FROM DmOsClusterProperties d WHERE d.failureConditionLevel = :failureConditionLevel"),
    @NamedQuery(name = "DmOsClusterProperties.findByHealthCheckTimeout", query = "SELECT d FROM DmOsClusterProperties d WHERE d.healthCheckTimeout = :healthCheckTimeout")})
public class DmOsClusterProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "VerboseLogging")
    private BigInteger verboseLogging;
    @Column(name = "SqlDumperDumpFlags")
    private BigInteger sqlDumperDumpFlags;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "SqlDumperDumpPath")
    private String sqlDumperDumpPath;
    @Column(name = "SqlDumperDumpTimeOut")
    private BigInteger sqlDumperDumpTimeOut;
    @Column(name = "FailureConditionLevel")
    private BigInteger failureConditionLevel;
    @Column(name = "HealthCheckTimeout")
    private BigInteger healthCheckTimeout;

    public DmOsClusterProperties() {
    }

    public BigInteger getVerboseLogging() {
        return verboseLogging;
    }

    public void setVerboseLogging(BigInteger verboseLogging) {
        this.verboseLogging = verboseLogging;
    }

    public BigInteger getSqlDumperDumpFlags() {
        return sqlDumperDumpFlags;
    }

    public void setSqlDumperDumpFlags(BigInteger sqlDumperDumpFlags) {
        this.sqlDumperDumpFlags = sqlDumperDumpFlags;
    }

    public String getSqlDumperDumpPath() {
        return sqlDumperDumpPath;
    }

    public void setSqlDumperDumpPath(String sqlDumperDumpPath) {
        this.sqlDumperDumpPath = sqlDumperDumpPath;
    }

    public BigInteger getSqlDumperDumpTimeOut() {
        return sqlDumperDumpTimeOut;
    }

    public void setSqlDumperDumpTimeOut(BigInteger sqlDumperDumpTimeOut) {
        this.sqlDumperDumpTimeOut = sqlDumperDumpTimeOut;
    }

    public BigInteger getFailureConditionLevel() {
        return failureConditionLevel;
    }

    public void setFailureConditionLevel(BigInteger failureConditionLevel) {
        this.failureConditionLevel = failureConditionLevel;
    }

    public BigInteger getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    public void setHealthCheckTimeout(BigInteger healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }
    
}
