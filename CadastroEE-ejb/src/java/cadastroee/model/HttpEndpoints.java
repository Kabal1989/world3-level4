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
@Table(name = "http_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HttpEndpoints.findAll", query = "SELECT h FROM HttpEndpoints h"),
    @NamedQuery(name = "HttpEndpoints.findByName", query = "SELECT h FROM HttpEndpoints h WHERE h.name = :name"),
    @NamedQuery(name = "HttpEndpoints.findByEndpointId", query = "SELECT h FROM HttpEndpoints h WHERE h.endpointId = :endpointId"),
    @NamedQuery(name = "HttpEndpoints.findByPrincipalId", query = "SELECT h FROM HttpEndpoints h WHERE h.principalId = :principalId"),
    @NamedQuery(name = "HttpEndpoints.findByProtocol", query = "SELECT h FROM HttpEndpoints h WHERE h.protocol = :protocol"),
    @NamedQuery(name = "HttpEndpoints.findByProtocolDesc", query = "SELECT h FROM HttpEndpoints h WHERE h.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "HttpEndpoints.findByType", query = "SELECT h FROM HttpEndpoints h WHERE h.type = :type"),
    @NamedQuery(name = "HttpEndpoints.findByTypeDesc", query = "SELECT h FROM HttpEndpoints h WHERE h.typeDesc = :typeDesc"),
    @NamedQuery(name = "HttpEndpoints.findByState", query = "SELECT h FROM HttpEndpoints h WHERE h.state = :state"),
    @NamedQuery(name = "HttpEndpoints.findByStateDesc", query = "SELECT h FROM HttpEndpoints h WHERE h.stateDesc = :stateDesc"),
    @NamedQuery(name = "HttpEndpoints.findByIsAdminEndpoint", query = "SELECT h FROM HttpEndpoints h WHERE h.isAdminEndpoint = :isAdminEndpoint"),
    @NamedQuery(name = "HttpEndpoints.findBySite", query = "SELECT h FROM HttpEndpoints h WHERE h.site = :site"),
    @NamedQuery(name = "HttpEndpoints.findByUrlPath", query = "SELECT h FROM HttpEndpoints h WHERE h.urlPath = :urlPath"),
    @NamedQuery(name = "HttpEndpoints.findByIsClearPortEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isClearPortEnabled = :isClearPortEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByClearPort", query = "SELECT h FROM HttpEndpoints h WHERE h.clearPort = :clearPort"),
    @NamedQuery(name = "HttpEndpoints.findByIsSslPortEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isSslPortEnabled = :isSslPortEnabled"),
    @NamedQuery(name = "HttpEndpoints.findBySslPort", query = "SELECT h FROM HttpEndpoints h WHERE h.sslPort = :sslPort"),
    @NamedQuery(name = "HttpEndpoints.findByIsAnonymousEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isAnonymousEnabled = :isAnonymousEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByIsBasicAuthEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isBasicAuthEnabled = :isBasicAuthEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByIsDigestAuthEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isDigestAuthEnabled = :isDigestAuthEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByIsKerberosAuthEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isKerberosAuthEnabled = :isKerberosAuthEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByIsNtlmAuthEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isNtlmAuthEnabled = :isNtlmAuthEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByIsIntegratedAuthEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isIntegratedAuthEnabled = :isIntegratedAuthEnabled"),
    @NamedQuery(name = "HttpEndpoints.findByAuthorizationRealm", query = "SELECT h FROM HttpEndpoints h WHERE h.authorizationRealm = :authorizationRealm"),
    @NamedQuery(name = "HttpEndpoints.findByDefaultLogonDomain", query = "SELECT h FROM HttpEndpoints h WHERE h.defaultLogonDomain = :defaultLogonDomain"),
    @NamedQuery(name = "HttpEndpoints.findByIsCompressionEnabled", query = "SELECT h FROM HttpEndpoints h WHERE h.isCompressionEnabled = :isCompressionEnabled")})
public class HttpEndpoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "endpoint_id")
    private int endpointId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "protocol")
    private short protocol;
    @Size(max = 60)
    @Column(name = "protocol_desc")
    private String protocolDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "state")
    private Short state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_admin_endpoint")
    private boolean isAdminEndpoint;
    @Size(max = 128)
    @Column(name = "site")
    private String site;
    @Size(max = 4000)
    @Column(name = "url_path")
    private String urlPath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_clear_port_enabled")
    private boolean isClearPortEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clear_port")
    private int clearPort;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ssl_port_enabled")
    private boolean isSslPortEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ssl_port")
    private int sslPort;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_anonymous_enabled")
    private boolean isAnonymousEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_basic_auth_enabled")
    private boolean isBasicAuthEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_digest_auth_enabled")
    private boolean isDigestAuthEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_kerberos_auth_enabled")
    private boolean isKerberosAuthEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ntlm_auth_enabled")
    private boolean isNtlmAuthEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_integrated_auth_enabled")
    private boolean isIntegratedAuthEnabled;
    @Size(max = 128)
    @Column(name = "authorization_realm")
    private String authorizationRealm;
    @Size(max = 128)
    @Column(name = "default_logon_domain")
    private String defaultLogonDomain;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_compression_enabled")
    private boolean isCompressionEnabled;

    public HttpEndpoints() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(int endpointId) {
        this.endpointId = endpointId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public short getProtocol() {
        return protocol;
    }

    public void setProtocol(short protocol) {
        this.protocol = protocol;
    }

    public String getProtocolDesc() {
        return protocolDesc;
    }

    public void setProtocolDesc(String protocolDesc) {
        this.protocolDesc = protocolDesc;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public boolean getIsAdminEndpoint() {
        return isAdminEndpoint;
    }

    public void setIsAdminEndpoint(boolean isAdminEndpoint) {
        this.isAdminEndpoint = isAdminEndpoint;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public boolean getIsClearPortEnabled() {
        return isClearPortEnabled;
    }

    public void setIsClearPortEnabled(boolean isClearPortEnabled) {
        this.isClearPortEnabled = isClearPortEnabled;
    }

    public int getClearPort() {
        return clearPort;
    }

    public void setClearPort(int clearPort) {
        this.clearPort = clearPort;
    }

    public boolean getIsSslPortEnabled() {
        return isSslPortEnabled;
    }

    public void setIsSslPortEnabled(boolean isSslPortEnabled) {
        this.isSslPortEnabled = isSslPortEnabled;
    }

    public int getSslPort() {
        return sslPort;
    }

    public void setSslPort(int sslPort) {
        this.sslPort = sslPort;
    }

    public boolean getIsAnonymousEnabled() {
        return isAnonymousEnabled;
    }

    public void setIsAnonymousEnabled(boolean isAnonymousEnabled) {
        this.isAnonymousEnabled = isAnonymousEnabled;
    }

    public boolean getIsBasicAuthEnabled() {
        return isBasicAuthEnabled;
    }

    public void setIsBasicAuthEnabled(boolean isBasicAuthEnabled) {
        this.isBasicAuthEnabled = isBasicAuthEnabled;
    }

    public boolean getIsDigestAuthEnabled() {
        return isDigestAuthEnabled;
    }

    public void setIsDigestAuthEnabled(boolean isDigestAuthEnabled) {
        this.isDigestAuthEnabled = isDigestAuthEnabled;
    }

    public boolean getIsKerberosAuthEnabled() {
        return isKerberosAuthEnabled;
    }

    public void setIsKerberosAuthEnabled(boolean isKerberosAuthEnabled) {
        this.isKerberosAuthEnabled = isKerberosAuthEnabled;
    }

    public boolean getIsNtlmAuthEnabled() {
        return isNtlmAuthEnabled;
    }

    public void setIsNtlmAuthEnabled(boolean isNtlmAuthEnabled) {
        this.isNtlmAuthEnabled = isNtlmAuthEnabled;
    }

    public boolean getIsIntegratedAuthEnabled() {
        return isIntegratedAuthEnabled;
    }

    public void setIsIntegratedAuthEnabled(boolean isIntegratedAuthEnabled) {
        this.isIntegratedAuthEnabled = isIntegratedAuthEnabled;
    }

    public String getAuthorizationRealm() {
        return authorizationRealm;
    }

    public void setAuthorizationRealm(String authorizationRealm) {
        this.authorizationRealm = authorizationRealm;
    }

    public String getDefaultLogonDomain() {
        return defaultLogonDomain;
    }

    public void setDefaultLogonDomain(String defaultLogonDomain) {
        this.defaultLogonDomain = defaultLogonDomain;
    }

    public boolean getIsCompressionEnabled() {
        return isCompressionEnabled;
    }

    public void setIsCompressionEnabled(boolean isCompressionEnabled) {
        this.isCompressionEnabled = isCompressionEnabled;
    }
    
}
