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
@Table(name = "external_governance_sensitivity_labels_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalGovernanceSensitivityLabelsMapping.findAll", query = "SELECT e FROM ExternalGovernanceSensitivityLabelsMapping e"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabelsMapping.findByClass1", query = "SELECT e FROM ExternalGovernanceSensitivityLabelsMapping e WHERE e.class1 = :class1"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabelsMapping.findByClassDesc", query = "SELECT e FROM ExternalGovernanceSensitivityLabelsMapping e WHERE e.classDesc = :classDesc"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabelsMapping.findByMajorId", query = "SELECT e FROM ExternalGovernanceSensitivityLabelsMapping e WHERE e.majorId = :majorId"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabelsMapping.findByMinorId", query = "SELECT e FROM ExternalGovernanceSensitivityLabelsMapping e WHERE e.minorId = :minorId"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabelsMapping.findByLabelId", query = "SELECT e FROM ExternalGovernanceSensitivityLabelsMapping e WHERE e.labelId = :labelId")})
public class ExternalGovernanceSensitivityLabelsMapping implements Serializable {

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
    @Size(max = 36)
    @Column(name = "label_id")
    private String labelId;

    public ExternalGovernanceSensitivityLabelsMapping() {
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

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }
    
}
