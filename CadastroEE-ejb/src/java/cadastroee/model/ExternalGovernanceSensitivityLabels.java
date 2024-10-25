/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "external_governance_sensitivity_labels")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalGovernanceSensitivityLabels.findAll", query = "SELECT e FROM ExternalGovernanceSensitivityLabels e"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabels.findByLabel", query = "SELECT e FROM ExternalGovernanceSensitivityLabels e WHERE e.label = :label"),
    @NamedQuery(name = "ExternalGovernanceSensitivityLabels.findByLabelId", query = "SELECT e FROM ExternalGovernanceSensitivityLabels e WHERE e.labelId = :labelId")})
public class ExternalGovernanceSensitivityLabels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4000)
    @Column(name = "label")
    private String label;
    @Size(max = 36)
    @Column(name = "label_id")
    private String labelId;

    public ExternalGovernanceSensitivityLabels() {
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
    
}
