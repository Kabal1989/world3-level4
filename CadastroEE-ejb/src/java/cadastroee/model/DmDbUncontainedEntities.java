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
@Table(name = "dm_db_uncontained_entities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbUncontainedEntities.findAll", query = "SELECT d FROM DmDbUncontainedEntities d"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByClass1", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.class1 = :class1"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByClassDesc", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.classDesc = :classDesc"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByMajorId", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.majorId = :majorId"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByStatementLineNumber", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.statementLineNumber = :statementLineNumber"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByStatementOffsetBegin", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.statementOffsetBegin = :statementOffsetBegin"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByStatementOffsetEnd", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.statementOffsetEnd = :statementOffsetEnd"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByStatementType", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.statementType = :statementType"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByFeatureName", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.featureName = :featureName"),
    @NamedQuery(name = "DmDbUncontainedEntities.findByFeatureTypeName", query = "SELECT d FROM DmDbUncontainedEntities d WHERE d.featureTypeName = :featureTypeName")})
public class DmDbUncontainedEntities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "class")
    private int class1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "class_desc")
    private String classDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "major_id")
    private int majorId;
    @Column(name = "statement_line_number")
    private Integer statementLineNumber;
    @Column(name = "statement_offset_begin")
    private Integer statementOffsetBegin;
    @Column(name = "statement_offset_end")
    private Integer statementOffsetEnd;
    @Size(max = 256)
    @Column(name = "statement_type")
    private String statementType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "feature_name")
    private String featureName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "feature_type_name")
    private String featureTypeName;

    public DmDbUncontainedEntities() {
    }

    public int getClass1() {
        return class1;
    }

    public void setClass1(int class1) {
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

    public Integer getStatementLineNumber() {
        return statementLineNumber;
    }

    public void setStatementLineNumber(Integer statementLineNumber) {
        this.statementLineNumber = statementLineNumber;
    }

    public Integer getStatementOffsetBegin() {
        return statementOffsetBegin;
    }

    public void setStatementOffsetBegin(Integer statementOffsetBegin) {
        this.statementOffsetBegin = statementOffsetBegin;
    }

    public Integer getStatementOffsetEnd() {
        return statementOffsetEnd;
    }

    public void setStatementOffsetEnd(Integer statementOffsetEnd) {
        this.statementOffsetEnd = statementOffsetEnd;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getFeatureTypeName() {
        return featureTypeName;
    }

    public void setFeatureTypeName(String featureTypeName) {
        this.featureTypeName = featureTypeName;
    }
    
}
