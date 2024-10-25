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
@Table(name = "external_governance_sensitivity_classifications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findAll", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByClass1", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.class1 = :class1"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByClassDesc", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.classDesc = :classDesc"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByMajorId", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.majorId = :majorId"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByMinorId", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.minorId = :minorId"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByLabel", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.label = :label"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByLabelId", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.labelId = :labelId"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByInformationType", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.informationType = :informationType"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByInformationTypeId", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.informationTypeId = :informationTypeId"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByRank", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.rank = :rank"),
    @NamedQuery(name = "ExternalGovernanceSensitivityClassifications.findByRankDesc", query = "SELECT e FROM ExternalGovernanceSensitivityClassifications e WHERE e.rankDesc = :rankDesc")})
public class ExternalGovernanceSensitivityClassifications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "class")
    private int class1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
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
    @Size(max = 128)
    @Column(name = "label")
    private String label;
    @Size(max = 128)
    @Column(name = "label_id")
    private String labelId;
    @Size(max = 128)
    @Column(name = "information_type")
    private String informationType;
    @Size(max = 128)
    @Column(name = "information_type_id")
    private String informationTypeId;
    @Column(name = "rank")
    private Integer rank;
    @Size(max = 8)
    @Column(name = "rank_desc")
    private String rankDesc;

    public ExternalGovernanceSensitivityClassifications() {
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

    public int getMinorId() {
        return minorId;
    }

    public void setMinorId(int minorId) {
        this.minorId = minorId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getInformationType() {
        return informationType;
    }

    public void setInformationType(String informationType) {
        this.informationType = informationType;
    }

    public String getInformationTypeId() {
        return informationTypeId;
    }

    public void setInformationTypeId(String informationTypeId) {
        this.informationTypeId = informationTypeId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRankDesc() {
        return rankDesc;
    }

    public void setRankDesc(String rankDesc) {
        this.rankDesc = rankDesc;
    }
    
}
