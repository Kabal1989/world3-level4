/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "server_file_audits")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerFileAudits.findAll", query = "SELECT s FROM ServerFileAudits s"),
    @NamedQuery(name = "ServerFileAudits.findByAuditId", query = "SELECT s FROM ServerFileAudits s WHERE s.auditId = :auditId"),
    @NamedQuery(name = "ServerFileAudits.findByName", query = "SELECT s FROM ServerFileAudits s WHERE s.name = :name"),
    @NamedQuery(name = "ServerFileAudits.findByAuditGuid", query = "SELECT s FROM ServerFileAudits s WHERE s.auditGuid = :auditGuid"),
    @NamedQuery(name = "ServerFileAudits.findByCreateDate", query = "SELECT s FROM ServerFileAudits s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerFileAudits.findByModifyDate", query = "SELECT s FROM ServerFileAudits s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerFileAudits.findByPrincipalId", query = "SELECT s FROM ServerFileAudits s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServerFileAudits.findByType", query = "SELECT s FROM ServerFileAudits s WHERE s.type = :type"),
    @NamedQuery(name = "ServerFileAudits.findByTypeDesc", query = "SELECT s FROM ServerFileAudits s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServerFileAudits.findByOnFailure", query = "SELECT s FROM ServerFileAudits s WHERE s.onFailure = :onFailure"),
    @NamedQuery(name = "ServerFileAudits.findByOnFailureDesc", query = "SELECT s FROM ServerFileAudits s WHERE s.onFailureDesc = :onFailureDesc"),
    @NamedQuery(name = "ServerFileAudits.findByIsStateEnabled", query = "SELECT s FROM ServerFileAudits s WHERE s.isStateEnabled = :isStateEnabled"),
    @NamedQuery(name = "ServerFileAudits.findByQueueDelay", query = "SELECT s FROM ServerFileAudits s WHERE s.queueDelay = :queueDelay"),
    @NamedQuery(name = "ServerFileAudits.findByPredicate", query = "SELECT s FROM ServerFileAudits s WHERE s.predicate = :predicate"),
    @NamedQuery(name = "ServerFileAudits.findByMaxFileSize", query = "SELECT s FROM ServerFileAudits s WHERE s.maxFileSize = :maxFileSize"),
    @NamedQuery(name = "ServerFileAudits.findByMaxRolloverFiles", query = "SELECT s FROM ServerFileAudits s WHERE s.maxRolloverFiles = :maxRolloverFiles"),
    @NamedQuery(name = "ServerFileAudits.findByMaxFiles", query = "SELECT s FROM ServerFileAudits s WHERE s.maxFiles = :maxFiles"),
    @NamedQuery(name = "ServerFileAudits.findByReserveDiskSpace", query = "SELECT s FROM ServerFileAudits s WHERE s.reserveDiskSpace = :reserveDiskSpace"),
    @NamedQuery(name = "ServerFileAudits.findByLogFilePath", query = "SELECT s FROM ServerFileAudits s WHERE s.logFilePath = :logFilePath"),
    @NamedQuery(name = "ServerFileAudits.findByLogFileName", query = "SELECT s FROM ServerFileAudits s WHERE s.logFileName = :logFileName"),
    @NamedQuery(name = "ServerFileAudits.findByRetentionDays", query = "SELECT s FROM ServerFileAudits s WHERE s.retentionDays = :retentionDays")})
public class ServerFileAudits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "audit_id")
    private int auditId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 36)
    @Column(name = "audit_guid")
    private String auditGuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "on_failure")
    private Short onFailure;
    @Size(max = 60)
    @Column(name = "on_failure_desc")
    private String onFailureDesc;
    @Column(name = "is_state_enabled")
    private Boolean isStateEnabled;
    @Column(name = "queue_delay")
    private Integer queueDelay;
    @Size(max = 3000)
    @Column(name = "predicate")
    private String predicate;
    @Column(name = "max_file_size")
    private BigInteger maxFileSize;
    @Column(name = "max_rollover_files")
    private Integer maxRolloverFiles;
    @Column(name = "max_files")
    private Integer maxFiles;
    @Column(name = "reserve_disk_space")
    private Boolean reserveDiskSpace;
    @Size(max = 260)
    @Column(name = "log_file_path")
    private String logFilePath;
    @Size(max = 260)
    @Column(name = "log_file_name")
    private String logFileName;
    @Column(name = "retention_days")
    private Integer retentionDays;

    public ServerFileAudits() {
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Short getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(Short onFailure) {
        this.onFailure = onFailure;
    }

    public String getOnFailureDesc() {
        return onFailureDesc;
    }

    public void setOnFailureDesc(String onFailureDesc) {
        this.onFailureDesc = onFailureDesc;
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }

    public Integer getQueueDelay() {
        return queueDelay;
    }

    public void setQueueDelay(Integer queueDelay) {
        this.queueDelay = queueDelay;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public BigInteger getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(BigInteger maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public Integer getMaxRolloverFiles() {
        return maxRolloverFiles;
    }

    public void setMaxRolloverFiles(Integer maxRolloverFiles) {
        this.maxRolloverFiles = maxRolloverFiles;
    }

    public Integer getMaxFiles() {
        return maxFiles;
    }

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }

    public Boolean getReserveDiskSpace() {
        return reserveDiskSpace;
    }

    public void setReserveDiskSpace(Boolean reserveDiskSpace) {
        this.reserveDiskSpace = reserveDiskSpace;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }
    
}
