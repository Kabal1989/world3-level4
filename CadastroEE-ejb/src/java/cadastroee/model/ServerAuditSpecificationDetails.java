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
@Table(name = "server_audit_specification_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerAuditSpecificationDetails.findAll", query = "SELECT s FROM ServerAuditSpecificationDetails s"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByServerSpecificationId", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.serverSpecificationId = :serverSpecificationId"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByAuditActionId", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.auditActionId = :auditActionId"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByAuditActionName", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.auditActionName = :auditActionName"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByClass1", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.class1 = :class1"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByClassDesc", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.classDesc = :classDesc"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByMajorId", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.majorId = :majorId"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByMinorId", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.minorId = :minorId"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByAuditedPrincipalId", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.auditedPrincipalId = :auditedPrincipalId"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByAuditedResult", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.auditedResult = :auditedResult"),
    @NamedQuery(name = "ServerAuditSpecificationDetails.findByIsGroup", query = "SELECT s FROM ServerAuditSpecificationDetails s WHERE s.isGroup = :isGroup")})
public class ServerAuditSpecificationDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "server_specification_id")
    private int serverSpecificationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "audit_action_id")
    private String auditActionId;
    @Size(max = 60)
    @Column(name = "audit_action_name")
    private String auditActionName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "class")
    private short class1;
    @Size(max = 60)
    @Column(name = "class_desc")
    private String classDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "major_id")
    private int majorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minor_id")
    private int minorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "audited_principal_id")
    private int auditedPrincipalId;
    @Size(max = 60)
    @Column(name = "audited_result")
    private String auditedResult;
    @Column(name = "is_group")
    private Boolean isGroup;

    public ServerAuditSpecificationDetails() {
    }

    public int getServerSpecificationId() {
        return serverSpecificationId;
    }

    public void setServerSpecificationId(int serverSpecificationId) {
        this.serverSpecificationId = serverSpecificationId;
    }

    public String getAuditActionId() {
        return auditActionId;
    }

    public void setAuditActionId(String auditActionId) {
        this.auditActionId = auditActionId;
    }

    public String getAuditActionName() {
        return auditActionName;
    }

    public void setAuditActionName(String auditActionName) {
        this.auditActionName = auditActionName;
    }

    public short getClass1() {
        return class1;
    }

    public void setClass1(short class1) {
        this.class1 = class1;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getMinorId() {
        return minorId;
    }

    public void setMinorId(int minorId) {
        this.minorId = minorId;
    }

    public int getAuditedPrincipalId() {
        return auditedPrincipalId;
    }

    public void setAuditedPrincipalId(int auditedPrincipalId) {
        this.auditedPrincipalId = auditedPrincipalId;
    }

    public String getAuditedResult() {
        return auditedResult;
    }

    public void setAuditedResult(String auditedResult) {
        this.auditedResult = auditedResult;
    }

    public Boolean getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }
    
}
