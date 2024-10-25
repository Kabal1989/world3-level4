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
@Table(name = "servers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servers.findAll", query = "SELECT s FROM Servers s"),
    @NamedQuery(name = "Servers.findByServerId", query = "SELECT s FROM Servers s WHERE s.serverId = :serverId"),
    @NamedQuery(name = "Servers.findByName", query = "SELECT s FROM Servers s WHERE s.name = :name"),
    @NamedQuery(name = "Servers.findByProduct", query = "SELECT s FROM Servers s WHERE s.product = :product"),
    @NamedQuery(name = "Servers.findByProvider", query = "SELECT s FROM Servers s WHERE s.provider = :provider"),
    @NamedQuery(name = "Servers.findByDataSource", query = "SELECT s FROM Servers s WHERE s.dataSource = :dataSource"),
    @NamedQuery(name = "Servers.findByLocation", query = "SELECT s FROM Servers s WHERE s.location = :location"),
    @NamedQuery(name = "Servers.findByProviderString", query = "SELECT s FROM Servers s WHERE s.providerString = :providerString"),
    @NamedQuery(name = "Servers.findByCatalog", query = "SELECT s FROM Servers s WHERE s.catalog = :catalog"),
    @NamedQuery(name = "Servers.findByConnectTimeout", query = "SELECT s FROM Servers s WHERE s.connectTimeout = :connectTimeout"),
    @NamedQuery(name = "Servers.findByQueryTimeout", query = "SELECT s FROM Servers s WHERE s.queryTimeout = :queryTimeout"),
    @NamedQuery(name = "Servers.findByIsLinked", query = "SELECT s FROM Servers s WHERE s.isLinked = :isLinked"),
    @NamedQuery(name = "Servers.findByIsRemoteLoginEnabled", query = "SELECT s FROM Servers s WHERE s.isRemoteLoginEnabled = :isRemoteLoginEnabled"),
    @NamedQuery(name = "Servers.findByIsRpcOutEnabled", query = "SELECT s FROM Servers s WHERE s.isRpcOutEnabled = :isRpcOutEnabled"),
    @NamedQuery(name = "Servers.findByIsDataAccessEnabled", query = "SELECT s FROM Servers s WHERE s.isDataAccessEnabled = :isDataAccessEnabled"),
    @NamedQuery(name = "Servers.findByIsCollationCompatible", query = "SELECT s FROM Servers s WHERE s.isCollationCompatible = :isCollationCompatible"),
    @NamedQuery(name = "Servers.findByUsesRemoteCollation", query = "SELECT s FROM Servers s WHERE s.usesRemoteCollation = :usesRemoteCollation"),
    @NamedQuery(name = "Servers.findByCollationName", query = "SELECT s FROM Servers s WHERE s.collationName = :collationName"),
    @NamedQuery(name = "Servers.findByLazySchemaValidation", query = "SELECT s FROM Servers s WHERE s.lazySchemaValidation = :lazySchemaValidation"),
    @NamedQuery(name = "Servers.findByIsSystem", query = "SELECT s FROM Servers s WHERE s.isSystem = :isSystem"),
    @NamedQuery(name = "Servers.findByIsPublisher", query = "SELECT s FROM Servers s WHERE s.isPublisher = :isPublisher"),
    @NamedQuery(name = "Servers.findByIsSubscriber", query = "SELECT s FROM Servers s WHERE s.isSubscriber = :isSubscriber"),
    @NamedQuery(name = "Servers.findByIsDistributor", query = "SELECT s FROM Servers s WHERE s.isDistributor = :isDistributor"),
    @NamedQuery(name = "Servers.findByIsNonsqlSubscriber", query = "SELECT s FROM Servers s WHERE s.isNonsqlSubscriber = :isNonsqlSubscriber"),
    @NamedQuery(name = "Servers.findByIsRemoteProcTransactionPromotionEnabled", query = "SELECT s FROM Servers s WHERE s.isRemoteProcTransactionPromotionEnabled = :isRemoteProcTransactionPromotionEnabled"),
    @NamedQuery(name = "Servers.findByModifyDate", query = "SELECT s FROM Servers s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "Servers.findByIsRdaServer", query = "SELECT s FROM Servers s WHERE s.isRdaServer = :isRdaServer")})
public class Servers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "server_id")
    private int serverId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "product")
    private String product;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "provider")
    private String provider;
    @Size(max = 4000)
    @Column(name = "data_source")
    private String dataSource;
    @Size(max = 4000)
    @Column(name = "location")
    private String location;
    @Size(max = 4000)
    @Column(name = "provider_string")
    private String providerString;
    @Size(max = 128)
    @Column(name = "catalog")
    private String catalog;
    @Column(name = "connect_timeout")
    private Integer connectTimeout;
    @Column(name = "query_timeout")
    private Integer queryTimeout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_linked")
    private boolean isLinked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_remote_login_enabled")
    private boolean isRemoteLoginEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_rpc_out_enabled")
    private boolean isRpcOutEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_data_access_enabled")
    private boolean isDataAccessEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_collation_compatible")
    private boolean isCollationCompatible;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_remote_collation")
    private boolean usesRemoteCollation;
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lazy_schema_validation")
    private boolean lazySchemaValidation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system")
    private boolean isSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_publisher")
    private boolean isPublisher;
    @Column(name = "is_subscriber")
    private Boolean isSubscriber;
    @Column(name = "is_distributor")
    private Boolean isDistributor;
    @Column(name = "is_nonsql_subscriber")
    private Boolean isNonsqlSubscriber;
    @Column(name = "is_remote_proc_transaction_promotion_enabled")
    private Boolean isRemoteProcTransactionPromotionEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "is_rda_server")
    private Boolean isRdaServer;

    public Servers() {
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProviderString() {
        return providerString;
    }

    public void setProviderString(String providerString) {
        this.providerString = providerString;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getQueryTimeout() {
        return queryTimeout;
    }

    public void setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    public boolean getIsLinked() {
        return isLinked;
    }

    public void setIsLinked(boolean isLinked) {
        this.isLinked = isLinked;
    }

    public boolean getIsRemoteLoginEnabled() {
        return isRemoteLoginEnabled;
    }

    public void setIsRemoteLoginEnabled(boolean isRemoteLoginEnabled) {
        this.isRemoteLoginEnabled = isRemoteLoginEnabled;
    }

    public boolean getIsRpcOutEnabled() {
        return isRpcOutEnabled;
    }

    public void setIsRpcOutEnabled(boolean isRpcOutEnabled) {
        this.isRpcOutEnabled = isRpcOutEnabled;
    }

    public boolean getIsDataAccessEnabled() {
        return isDataAccessEnabled;
    }

    public void setIsDataAccessEnabled(boolean isDataAccessEnabled) {
        this.isDataAccessEnabled = isDataAccessEnabled;
    }

    public boolean getIsCollationCompatible() {
        return isCollationCompatible;
    }

    public void setIsCollationCompatible(boolean isCollationCompatible) {
        this.isCollationCompatible = isCollationCompatible;
    }

    public boolean getUsesRemoteCollation() {
        return usesRemoteCollation;
    }

    public void setUsesRemoteCollation(boolean usesRemoteCollation) {
        this.usesRemoteCollation = usesRemoteCollation;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public boolean getLazySchemaValidation() {
        return lazySchemaValidation;
    }

    public void setLazySchemaValidation(boolean lazySchemaValidation) {
        this.lazySchemaValidation = lazySchemaValidation;
    }

    public boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(boolean isSystem) {
        this.isSystem = isSystem;
    }

    public boolean getIsPublisher() {
        return isPublisher;
    }

    public void setIsPublisher(boolean isPublisher) {
        this.isPublisher = isPublisher;
    }

    public Boolean getIsSubscriber() {
        return isSubscriber;
    }

    public void setIsSubscriber(Boolean isSubscriber) {
        this.isSubscriber = isSubscriber;
    }

    public Boolean getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(Boolean isDistributor) {
        this.isDistributor = isDistributor;
    }

    public Boolean getIsNonsqlSubscriber() {
        return isNonsqlSubscriber;
    }

    public void setIsNonsqlSubscriber(Boolean isNonsqlSubscriber) {
        this.isNonsqlSubscriber = isNonsqlSubscriber;
    }

    public Boolean getIsRemoteProcTransactionPromotionEnabled() {
        return isRemoteProcTransactionPromotionEnabled;
    }

    public void setIsRemoteProcTransactionPromotionEnabled(Boolean isRemoteProcTransactionPromotionEnabled) {
        this.isRemoteProcTransactionPromotionEnabled = isRemoteProcTransactionPromotionEnabled;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getIsRdaServer() {
        return isRdaServer;
    }

    public void setIsRdaServer(Boolean isRdaServer) {
        this.isRdaServer = isRdaServer;
    }
    
}
