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
@Table(name = "dm_db_persisted_sku_features")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbPersistedSkuFeatures.findAll", query = "SELECT d FROM DmDbPersistedSkuFeatures d"),
    @NamedQuery(name = "DmDbPersistedSkuFeatures.findByFeatureName", query = "SELECT d FROM DmDbPersistedSkuFeatures d WHERE d.featureName = :featureName"),
    @NamedQuery(name = "DmDbPersistedSkuFeatures.findByFeatureId", query = "SELECT d FROM DmDbPersistedSkuFeatures d WHERE d.featureId = :featureId")})
public class DmDbPersistedSkuFeatures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4000)
    @Column(name = "feature_name")
    private String featureName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feature_id")
    private int featureId;

    public DmDbPersistedSkuFeatures() {
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }
    
}
