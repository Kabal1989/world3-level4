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
@Table(name = "plan_guides")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanGuides.findAll", query = "SELECT p FROM PlanGuides p"),
    @NamedQuery(name = "PlanGuides.findByPlanGuideId", query = "SELECT p FROM PlanGuides p WHERE p.planGuideId = :planGuideId"),
    @NamedQuery(name = "PlanGuides.findByName", query = "SELECT p FROM PlanGuides p WHERE p.name = :name"),
    @NamedQuery(name = "PlanGuides.findByCreateDate", query = "SELECT p FROM PlanGuides p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "PlanGuides.findByModifyDate", query = "SELECT p FROM PlanGuides p WHERE p.modifyDate = :modifyDate"),
    @NamedQuery(name = "PlanGuides.findByIsDisabled", query = "SELECT p FROM PlanGuides p WHERE p.isDisabled = :isDisabled"),
    @NamedQuery(name = "PlanGuides.findByQueryText", query = "SELECT p FROM PlanGuides p WHERE p.queryText = :queryText"),
    @NamedQuery(name = "PlanGuides.findByScopeType", query = "SELECT p FROM PlanGuides p WHERE p.scopeType = :scopeType"),
    @NamedQuery(name = "PlanGuides.findByScopeTypeDesc", query = "SELECT p FROM PlanGuides p WHERE p.scopeTypeDesc = :scopeTypeDesc"),
    @NamedQuery(name = "PlanGuides.findByScopeObjectId", query = "SELECT p FROM PlanGuides p WHERE p.scopeObjectId = :scopeObjectId"),
    @NamedQuery(name = "PlanGuides.findByScopeBatch", query = "SELECT p FROM PlanGuides p WHERE p.scopeBatch = :scopeBatch"),
    @NamedQuery(name = "PlanGuides.findByParameters", query = "SELECT p FROM PlanGuides p WHERE p.parameters = :parameters"),
    @NamedQuery(name = "PlanGuides.findByHints", query = "SELECT p FROM PlanGuides p WHERE p.hints = :hints")})
public class PlanGuides implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_guide_id")
    private int planGuideId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_disabled")
    private boolean isDisabled;
    @Size(max = 2147483647)
    @Column(name = "query_text")
    private String queryText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scope_type")
    private short scopeType;
    @Size(max = 60)
    @Column(name = "scope_type_desc")
    private String scopeTypeDesc;
    @Column(name = "scope_object_id")
    private Integer scopeObjectId;
    @Size(max = 2147483647)
    @Column(name = "scope_batch")
    private String scopeBatch;
    @Size(max = 2147483647)
    @Column(name = "parameters")
    private String parameters;
    @Size(max = 2147483647)
    @Column(name = "hints")
    private String hints;

    public PlanGuides() {
    }

    public int getPlanGuideId() {
        return planGuideId;
    }

    public void setPlanGuideId(int planGuideId) {
        this.planGuideId = planGuideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public short getScopeType() {
        return scopeType;
    }

    public void setScopeType(short scopeType) {
        this.scopeType = scopeType;
    }

    public String getScopeTypeDesc() {
        return scopeTypeDesc;
    }

    public void setScopeTypeDesc(String scopeTypeDesc) {
        this.scopeTypeDesc = scopeTypeDesc;
    }

    public Integer getScopeObjectId() {
        return scopeObjectId;
    }

    public void setScopeObjectId(Integer scopeObjectId) {
        this.scopeObjectId = scopeObjectId;
    }

    public String getScopeBatch() {
        return scopeBatch;
    }

    public void setScopeBatch(String scopeBatch) {
        this.scopeBatch = scopeBatch;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints;
    }
    
}
