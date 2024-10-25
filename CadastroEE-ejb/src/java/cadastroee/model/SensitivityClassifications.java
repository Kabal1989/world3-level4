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
@Table(name = "sensitivity_classifications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SensitivityClassifications.findAll", query = "SELECT s FROM SensitivityClassifications s"),
    @NamedQuery(name = "SensitivityClassifications.findByClass1", query = "SELECT s FROM SensitivityClassifications s WHERE s.class1 = :class1"),
    @NamedQuery(name = "SensitivityClassifications.findByClassDesc", query = "SELECT s FROM SensitivityClassifications s WHERE s.classDesc = :classDesc"),
    @NamedQuery(name = "SensitivityClassifications.findByMajorId", query = "SELECT s FROM SensitivityClassifications s WHERE s.majorId = :majorId"),
    @NamedQuery(name = "SensitivityClassifications.findByMinorId", query = "SELECT s FROM SensitivityClassifications s WHERE s.minorId = :minorId"),
    @NamedQuery(name = "SensitivityClassifications.findByLabel", query = "SELECT s FROM SensitivityClassifications s WHERE s.label = :label"),
    @NamedQuery(name = "SensitivityClassifications.findByLabelId", query = "SELECT s FROM SensitivityClassifications s WHERE s.labelId = :labelId"),
    @NamedQuery(name = "SensitivityClassifications.findByInformationType", query = "SELECT s FROM SensitivityClassifications s WHERE s.informationType = :informationType"),
    @NamedQuery(name = "SensitivityClassifications.findByInformationTypeId", query = "SELECT s FROM SensitivityClassifications s WHERE s.informationTypeId = :informationTypeId"),
    @NamedQuery(name = "SensitivityClassifications.findByRank", query = "SELECT s FROM SensitivityClassifications s WHERE s.rank = :rank"),
    @NamedQuery(name = "SensitivityClassifications.findByRankDesc", query = "SELECT s FROM SensitivityClassifications s WHERE s.rankDesc = :rankDesc")})
public class SensitivityClassifications implements Serializable {

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

    public SensitivityClassifications() {
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
