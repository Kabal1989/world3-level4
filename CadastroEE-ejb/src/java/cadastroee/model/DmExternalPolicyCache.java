/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_external_policy_cache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalPolicyCache.findAll", query = "SELECT d FROM DmExternalPolicyCache d"),
    @NamedQuery(name = "DmExternalPolicyCache.findByPolicyCacheState", query = "SELECT d FROM DmExternalPolicyCache d WHERE d.policyCacheState = :policyCacheState"),
    @NamedQuery(name = "DmExternalPolicyCache.findByPolicyCacheStateDesc", query = "SELECT d FROM DmExternalPolicyCache d WHERE d.policyCacheStateDesc = :policyCacheStateDesc"),
    @NamedQuery(name = "DmExternalPolicyCache.findByLastPolicyCacheUpdateTime", query = "SELECT d FROM DmExternalPolicyCache d WHERE d.lastPolicyCacheUpdateTime = :lastPolicyCacheUpdateTime"),
    @NamedQuery(name = "DmExternalPolicyCache.findByLastPullType", query = "SELECT d FROM DmExternalPolicyCache d WHERE d.lastPullType = :lastPullType"),
    @NamedQuery(name = "DmExternalPolicyCache.findByLastPullTypeDesc", query = "SELECT d FROM DmExternalPolicyCache d WHERE d.lastPullTypeDesc = :lastPullTypeDesc"),
    @NamedQuery(name = "DmExternalPolicyCache.findByNumberOfCachedPolicies", query = "SELECT d FROM DmExternalPolicyCache d WHERE d.numberOfCachedPolicies = :numberOfCachedPolicies")})
public class DmExternalPolicyCache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "policy_cache_state")
    private Integer policyCacheState;
    @Size(max = 16)
    @Column(name = "policy_cache_state_desc")
    private String policyCacheStateDesc;
    @Column(name = "last_policy_cache_update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPolicyCacheUpdateTime;
    @Column(name = "last_pull_type")
    private Integer lastPullType;
    @Size(max = 16)
    @Column(name = "last_pull_type_desc")
    private String lastPullTypeDesc;
    @Column(name = "number_of_cached_policies")
    private Integer numberOfCachedPolicies;

    public DmExternalPolicyCache() {
    }

    public Integer getPolicyCacheState() {
        return policyCacheState;
    }

    public void setPolicyCacheState(Integer policyCacheState) {
        this.policyCacheState = policyCacheState;
    }

    public String getPolicyCacheStateDesc() {
        return policyCacheStateDesc;
    }

    public void setPolicyCacheStateDesc(String policyCacheStateDesc) {
        this.policyCacheStateDesc = policyCacheStateDesc;
    }

    public Date getLastPolicyCacheUpdateTime() {
        return lastPolicyCacheUpdateTime;
    }

    public void setLastPolicyCacheUpdateTime(Date lastPolicyCacheUpdateTime) {
        this.lastPolicyCacheUpdateTime = lastPolicyCacheUpdateTime;
    }

    public Integer getLastPullType() {
        return lastPullType;
    }

    public void setLastPullType(Integer lastPullType) {
        this.lastPullType = lastPullType;
    }

    public String getLastPullTypeDesc() {
        return lastPullTypeDesc;
    }

    public void setLastPullTypeDesc(String lastPullTypeDesc) {
        this.lastPullTypeDesc = lastPullTypeDesc;
    }

    public Integer getNumberOfCachedPolicies() {
        return numberOfCachedPolicies;
    }

    public void setNumberOfCachedPolicies(Integer numberOfCachedPolicies) {
        this.numberOfCachedPolicies = numberOfCachedPolicies;
    }
    
}
