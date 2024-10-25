/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "sysservers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysservers.findAll", query = "SELECT s FROM Sysservers s"),
    @NamedQuery(name = "Sysservers.findBySrvid", query = "SELECT s FROM Sysservers s WHERE s.srvid = :srvid"),
    @NamedQuery(name = "Sysservers.findBySrvstatus", query = "SELECT s FROM Sysservers s WHERE s.srvstatus = :srvstatus"),
    @NamedQuery(name = "Sysservers.findBySrvname", query = "SELECT s FROM Sysservers s WHERE s.srvname = :srvname"),
    @NamedQuery(name = "Sysservers.findBySrvproduct", query = "SELECT s FROM Sysservers s WHERE s.srvproduct = :srvproduct"),
    @NamedQuery(name = "Sysservers.findByProvidername", query = "SELECT s FROM Sysservers s WHERE s.providername = :providername"),
    @NamedQuery(name = "Sysservers.findByDatasource", query = "SELECT s FROM Sysservers s WHERE s.datasource = :datasource"),
    @NamedQuery(name = "Sysservers.findByLocation", query = "SELECT s FROM Sysservers s WHERE s.location = :location"),
    @NamedQuery(name = "Sysservers.findByProviderstring", query = "SELECT s FROM Sysservers s WHERE s.providerstring = :providerstring"),
    @NamedQuery(name = "Sysservers.findBySchemadate", query = "SELECT s FROM Sysservers s WHERE s.schemadate = :schemadate"),
    @NamedQuery(name = "Sysservers.findByTopologyx", query = "SELECT s FROM Sysservers s WHERE s.topologyx = :topologyx"),
    @NamedQuery(name = "Sysservers.findByTopologyy", query = "SELECT s FROM Sysservers s WHERE s.topologyy = :topologyy"),
    @NamedQuery(name = "Sysservers.findByCatalog", query = "SELECT s FROM Sysservers s WHERE s.catalog = :catalog"),
    @NamedQuery(name = "Sysservers.findBySrvcollation", query = "SELECT s FROM Sysservers s WHERE s.srvcollation = :srvcollation"),
    @NamedQuery(name = "Sysservers.findByConnecttimeout", query = "SELECT s FROM Sysservers s WHERE s.connecttimeout = :connecttimeout"),
    @NamedQuery(name = "Sysservers.findByQuerytimeout", query = "SELECT s FROM Sysservers s WHERE s.querytimeout = :querytimeout"),
    @NamedQuery(name = "Sysservers.findBySrvnetname", query = "SELECT s FROM Sysservers s WHERE s.srvnetname = :srvnetname"),
    @NamedQuery(name = "Sysservers.findByIsremote", query = "SELECT s FROM Sysservers s WHERE s.isremote = :isremote"),
    @NamedQuery(name = "Sysservers.findByRpc", query = "SELECT s FROM Sysservers s WHERE s.rpc = :rpc"),
    @NamedQuery(name = "Sysservers.findByPub", query = "SELECT s FROM Sysservers s WHERE s.pub = :pub"),
    @NamedQuery(name = "Sysservers.findBySub", query = "SELECT s FROM Sysservers s WHERE s.sub = :sub"),
    @NamedQuery(name = "Sysservers.findByDist", query = "SELECT s FROM Sysservers s WHERE s.dist = :dist"),
    @NamedQuery(name = "Sysservers.findByDpub", query = "SELECT s FROM Sysservers s WHERE s.dpub = :dpub"),
    @NamedQuery(name = "Sysservers.findByRpcout", query = "SELECT s FROM Sysservers s WHERE s.rpcout = :rpcout"),
    @NamedQuery(name = "Sysservers.findByDataaccess", query = "SELECT s FROM Sysservers s WHERE s.dataaccess = :dataaccess"),
    @NamedQuery(name = "Sysservers.findByCollationcompatible", query = "SELECT s FROM Sysservers s WHERE s.collationcompatible = :collationcompatible"),
    @NamedQuery(name = "Sysservers.findBySystem", query = "SELECT s FROM Sysservers s WHERE s.system = :system"),
    @NamedQuery(name = "Sysservers.findByUseremotecollation", query = "SELECT s FROM Sysservers s WHERE s.useremotecollation = :useremotecollation"),
    @NamedQuery(name = "Sysservers.findByLazyschemavalidation", query = "SELECT s FROM Sysservers s WHERE s.lazyschemavalidation = :lazyschemavalidation"),
    @NamedQuery(name = "Sysservers.findByCollation", query = "SELECT s FROM Sysservers s WHERE s.collation = :collation"),
    @NamedQuery(name = "Sysservers.findByNonsqlsub", query = "SELECT s FROM Sysservers s WHERE s.nonsqlsub = :nonsqlsub")})
public class Sysservers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "srvid")
    private Short srvid;
    @Column(name = "srvstatus")
    private Short srvstatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "srvname")
    private String srvname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "srvproduct")
    private String srvproduct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "providername")
    private String providername;
    @Size(max = 4000)
    @Column(name = "datasource")
    private String datasource;
    @Size(max = 4000)
    @Column(name = "location")
    private String location;
    @Size(max = 4000)
    @Column(name = "providerstring")
    private String providerstring;
    @Basic(optional = false)
    @NotNull
    @Column(name = "schemadate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date schemadate;
    @Column(name = "topologyx")
    private Integer topologyx;
    @Column(name = "topologyy")
    private Integer topologyy;
    @Size(max = 128)
    @Column(name = "catalog")
    private String catalog;
    @Size(max = 128)
    @Column(name = "srvcollation")
    private String srvcollation;
    @Column(name = "connecttimeout")
    private Integer connecttimeout;
    @Column(name = "querytimeout")
    private Integer querytimeout;
    @Size(max = 30)
    @Column(name = "srvnetname")
    private String srvnetname;
    @Column(name = "isremote")
    private Boolean isremote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rpc")
    private boolean rpc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pub")
    private boolean pub;
    @Column(name = "sub")
    private Boolean sub;
    @Column(name = "dist")
    private Boolean dist;
    @Column(name = "dpub")
    private Boolean dpub;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rpcout")
    private boolean rpcout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataaccess")
    private boolean dataaccess;
    @Basic(optional = false)
    @NotNull
    @Column(name = "collationcompatible")
    private boolean collationcompatible;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system")
    private boolean system;
    @Basic(optional = false)
    @NotNull
    @Column(name = "useremotecollation")
    private boolean useremotecollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lazyschemavalidation")
    private boolean lazyschemavalidation;
    @Size(max = 128)
    @Column(name = "collation")
    private String collation;
    @Column(name = "nonsqlsub")
    private Boolean nonsqlsub;

    public Sysservers() {
    }

    public Short getSrvid() {
        return srvid;
    }

    public void setSrvid(Short srvid) {
        this.srvid = srvid;
    }

    public Short getSrvstatus() {
        return srvstatus;
    }

    public void setSrvstatus(Short srvstatus) {
        this.srvstatus = srvstatus;
    }

    public String getSrvname() {
        return srvname;
    }

    public void setSrvname(String srvname) {
        this.srvname = srvname;
    }

    public String getSrvproduct() {
        return srvproduct;
    }

    public void setSrvproduct(String srvproduct) {
        this.srvproduct = srvproduct;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProviderstring() {
        return providerstring;
    }

    public void setProviderstring(String providerstring) {
        this.providerstring = providerstring;
    }

    public Date getSchemadate() {
        return schemadate;
    }

    public void setSchemadate(Date schemadate) {
        this.schemadate = schemadate;
    }

    public Integer getTopologyx() {
        return topologyx;
    }

    public void setTopologyx(Integer topologyx) {
        this.topologyx = topologyx;
    }

    public Integer getTopologyy() {
        return topologyy;
    }

    public void setTopologyy(Integer topologyy) {
        this.topologyy = topologyy;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getSrvcollation() {
        return srvcollation;
    }

    public void setSrvcollation(String srvcollation) {
        this.srvcollation = srvcollation;
    }

    public Integer getConnecttimeout() {
        return connecttimeout;
    }

    public void setConnecttimeout(Integer connecttimeout) {
        this.connecttimeout = connecttimeout;
    }

    public Integer getQuerytimeout() {
        return querytimeout;
    }

    public void setQuerytimeout(Integer querytimeout) {
        this.querytimeout = querytimeout;
    }

    public String getSrvnetname() {
        return srvnetname;
    }

    public void setSrvnetname(String srvnetname) {
        this.srvnetname = srvnetname;
    }

    public Boolean getIsremote() {
        return isremote;
    }

    public void setIsremote(Boolean isremote) {
        this.isremote = isremote;
    }

    public boolean getRpc() {
        return rpc;
    }

    public void setRpc(boolean rpc) {
        this.rpc = rpc;
    }

    public boolean getPub() {
        return pub;
    }

    public void setPub(boolean pub) {
        this.pub = pub;
    }

    public Boolean getSub() {
        return sub;
    }

    public void setSub(Boolean sub) {
        this.sub = sub;
    }

    public Boolean getDist() {
        return dist;
    }

    public void setDist(Boolean dist) {
        this.dist = dist;
    }

    public Boolean getDpub() {
        return dpub;
    }

    public void setDpub(Boolean dpub) {
        this.dpub = dpub;
    }

    public boolean getRpcout() {
        return rpcout;
    }

    public void setRpcout(boolean rpcout) {
        this.rpcout = rpcout;
    }

    public boolean getDataaccess() {
        return dataaccess;
    }

    public void setDataaccess(boolean dataaccess) {
        this.dataaccess = dataaccess;
    }

    public boolean getCollationcompatible() {
        return collationcompatible;
    }

    public void setCollationcompatible(boolean collationcompatible) {
        this.collationcompatible = collationcompatible;
    }

    public boolean getSystem() {
        return system;
    }

    public void setSystem(boolean system) {
        this.system = system;
    }

    public boolean getUseremotecollation() {
        return useremotecollation;
    }

    public void setUseremotecollation(boolean useremotecollation) {
        this.useremotecollation = useremotecollation;
    }

    public boolean getLazyschemavalidation() {
        return lazyschemavalidation;
    }

    public void setLazyschemavalidation(boolean lazyschemavalidation) {
        this.lazyschemavalidation = lazyschemavalidation;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public Boolean getNonsqlsub() {
        return nonsqlsub;
    }

    public void setNonsqlsub(Boolean nonsqlsub) {
        this.nonsqlsub = nonsqlsub;
    }
    
}
