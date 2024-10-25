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
@Table(name = "database_audit_specification_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findAll", query = "SELECT d FROM DatabaseAuditSpecificationDetails d"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByDatabaseSpecificationId", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.databaseSpecificationId = :databaseSpecificationId"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByAuditActionId", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.auditActionId = :auditActionId"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByAuditActionName", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.auditActionName = :auditActionName"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByClass1", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.class1 = :class1"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByClassDesc", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.classDesc = :classDesc"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByMajorId", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.majorId = :majorId"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByMinorId", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.minorId = :minorId"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByAuditedPrincipalId", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.auditedPrincipalId = :auditedPrincipalId"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByAuditedResult", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.auditedResult = :auditedResult"),
    @NamedQuery(name = "DatabaseAuditSpecificationDetails.findByIsGroup", query = "SELECT d FROM DatabaseAuditSpecificationDetails d WHERE d.isGroup = :isGroup")})
public class DatabaseAuditSpecificationDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_specification_id")
    private int databaseSpecificationId;
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

    public DatabaseAuditSpecificationDetails() {
    }

    public int getDatabaseSpecificationId() {
        return databaseSpecificationId;
    }

    public void setDatabaseSpecificationId(int databaseSpecificationId) {
        this.databaseSpecificationId = databaseSpecificationId;
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
