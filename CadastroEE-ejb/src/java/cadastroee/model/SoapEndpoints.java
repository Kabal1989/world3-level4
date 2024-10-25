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
@Table(name = "soap_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoapEndpoints.findAll", query = "SELECT s FROM SoapEndpoints s"),
    @NamedQuery(name = "SoapEndpoints.findByName", query = "SELECT s FROM SoapEndpoints s WHERE s.name = :name"),
    @NamedQuery(name = "SoapEndpoints.findByEndpointId", query = "SELECT s FROM SoapEndpoints s WHERE s.endpointId = :endpointId"),
    @NamedQuery(name = "SoapEndpoints.findByPrincipalId", query = "SELECT s FROM SoapEndpoints s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "SoapEndpoints.findByProtocol", query = "SELECT s FROM SoapEndpoints s WHERE s.protocol = :protocol"),
    @NamedQuery(name = "SoapEndpoints.findByProtocolDesc", query = "SELECT s FROM SoapEndpoints s WHERE s.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "SoapEndpoints.findByType", query = "SELECT s FROM SoapEndpoints s WHERE s.type = :type"),
    @NamedQuery(name = "SoapEndpoints.findByTypeDesc", query = "SELECT s FROM SoapEndpoints s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SoapEndpoints.findByState", query = "SELECT s FROM SoapEndpoints s WHERE s.state = :state"),
    @NamedQuery(name = "SoapEndpoints.findByStateDesc", query = "SELECT s FROM SoapEndpoints s WHERE s.stateDesc = :stateDesc"),
    @NamedQuery(name = "SoapEndpoints.findByIsAdminEndpoint", query = "SELECT s FROM SoapEndpoints s WHERE s.isAdminEndpoint = :isAdminEndpoint"),
    @NamedQuery(name = "SoapEndpoints.findByIsSqlLanguageEnabled", query = "SELECT s FROM SoapEndpoints s WHERE s.isSqlLanguageEnabled = :isSqlLanguageEnabled"),
    @NamedQuery(name = "SoapEndpoints.findByWsdlGeneratorProcedure", query = "SELECT s FROM SoapEndpoints s WHERE s.wsdlGeneratorProcedure = :wsdlGeneratorProcedure"),
    @NamedQuery(name = "SoapEndpoints.findByDefaultDatabase", query = "SELECT s FROM SoapEndpoints s WHERE s.defaultDatabase = :defaultDatabase"),
    @NamedQuery(name = "SoapEndpoints.findByDefaultNamespace", query = "SELECT s FROM SoapEndpoints s WHERE s.defaultNamespace = :defaultNamespace"),
    @NamedQuery(name = "SoapEndpoints.findByDefaultResultSchema", query = "SELECT s FROM SoapEndpoints s WHERE s.defaultResultSchema = :defaultResultSchema"),
    @NamedQuery(name = "SoapEndpoints.findByDefaultResultSchemaDesc", query = "SELECT s FROM SoapEndpoints s WHERE s.defaultResultSchemaDesc = :defaultResultSchemaDesc"),
    @NamedQuery(name = "SoapEndpoints.findByIsXmlCharsetEnforced", query = "SELECT s FROM SoapEndpoints s WHERE s.isXmlCharsetEnforced = :isXmlCharsetEnforced"),
    @NamedQuery(name = "SoapEndpoints.findByIsSessionEnabled", query = "SELECT s FROM SoapEndpoints s WHERE s.isSessionEnabled = :isSessionEnabled"),
    @NamedQuery(name = "SoapEndpoints.findBySessionTimeout", query = "SELECT s FROM SoapEndpoints s WHERE s.sessionTimeout = :sessionTimeout"),
    @NamedQuery(name = "SoapEndpoints.findByLoginType", query = "SELECT s FROM SoapEndpoints s WHERE s.loginType = :loginType"),
    @NamedQuery(name = "SoapEndpoints.findByHeaderLimit", query = "SELECT s FROM SoapEndpoints s WHERE s.headerLimit = :headerLimit")})
public class SoapEndpoints implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sql_language_enabled")
    private boolean isSqlLanguageEnabled;
    @Size(max = 776)
    @Column(name = "wsdl_generator_procedure")
    private String wsdlGeneratorProcedure;
    @Size(max = 128)
    @Column(name = "default_database")
    private String defaultDatabase;
    @Size(max = 384)
    @Column(name = "default_namespace")
    private String defaultNamespace;
    @Column(name = "default_result_schema")
    private Short defaultResultSchema;
    @Size(max = 60)
    @Column(name = "default_result_schema_desc")
    private String defaultResultSchemaDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_xml_charset_enforced")
    private boolean isXmlCharsetEnforced;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_session_enabled")
    private boolean isSessionEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_timeout")
    private int sessionTimeout;
    @Size(max = 60)
    @Column(name = "login_type")
    private String loginType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "header_limit")
    private int headerLimit;

    public SoapEndpoints() {
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

    public boolean getIsSqlLanguageEnabled() {
        return isSqlLanguageEnabled;
    }

    public void setIsSqlLanguageEnabled(boolean isSqlLanguageEnabled) {
        this.isSqlLanguageEnabled = isSqlLanguageEnabled;
    }

    public String getWsdlGeneratorProcedure() {
        return wsdlGeneratorProcedure;
    }

    public void setWsdlGeneratorProcedure(String wsdlGeneratorProcedure) {
        this.wsdlGeneratorProcedure = wsdlGeneratorProcedure;
    }

    public String getDefaultDatabase() {
        return defaultDatabase;
    }

    public void setDefaultDatabase(String defaultDatabase) {
        this.defaultDatabase = defaultDatabase;
    }

    public String getDefaultNamespace() {
        return defaultNamespace;
    }

    public void setDefaultNamespace(String defaultNamespace) {
        this.defaultNamespace = defaultNamespace;
    }

    public Short getDefaultResultSchema() {
        return defaultResultSchema;
    }

    public void setDefaultResultSchema(Short defaultResultSchema) {
        this.defaultResultSchema = defaultResultSchema;
    }

    public String getDefaultResultSchemaDesc() {
        return defaultResultSchemaDesc;
    }

    public void setDefaultResultSchemaDesc(String defaultResultSchemaDesc) {
        this.defaultResultSchemaDesc = defaultResultSchemaDesc;
    }

    public boolean getIsXmlCharsetEnforced() {
        return isXmlCharsetEnforced;
    }

    public void setIsXmlCharsetEnforced(boolean isXmlCharsetEnforced) {
        this.isXmlCharsetEnforced = isXmlCharsetEnforced;
    }

    public boolean getIsSessionEnabled() {
        return isSessionEnabled;
    }

    public void setIsSessionEnabled(boolean isSessionEnabled) {
        this.isSessionEnabled = isSessionEnabled;
    }

    public int getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public int getHeaderLimit() {
        return headerLimit;
    }

    public void setHeaderLimit(int headerLimit) {
        this.headerLimit = headerLimit;
    }
    
}
