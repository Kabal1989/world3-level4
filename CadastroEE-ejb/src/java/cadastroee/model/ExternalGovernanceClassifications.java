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
@Table(name = "external_governance_classifications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalGovernanceClassifications.findAll", query = "SELECT e FROM ExternalGovernanceClassifications e"),
    @NamedQuery(name = "ExternalGovernanceClassifications.findByClassification", query = "SELECT e FROM ExternalGovernanceClassifications e WHERE e.classification = :classification"),
    @NamedQuery(name = "ExternalGovernanceClassifications.findByClassificationId", query = "SELECT e FROM ExternalGovernanceClassifications e WHERE e.classificationId = :classificationId")})
public class ExternalGovernanceClassifications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4000)
    @Column(name = "classification")
    private String classification;
    @Size(max = 36)
    @Column(name = "classification_id")
    private String classificationId;

    public ExternalGovernanceClassifications() {
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }
    
}
