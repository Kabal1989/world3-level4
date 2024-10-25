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
@Table(name = "xml_schema_component_placements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaComponentPlacements.findAll", query = "SELECT x FROM XmlSchemaComponentPlacements x"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByXmlComponentId", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByPlacementId", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.placementId = :placementId"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByPlacedXmlComponentId", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.placedXmlComponentId = :placedXmlComponentId"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByIsDefaultFixed", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.isDefaultFixed = :isDefaultFixed"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByMinOccurences", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.minOccurences = :minOccurences"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByMaxOccurences", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.maxOccurences = :maxOccurences"),
    @NamedQuery(name = "XmlSchemaComponentPlacements.findByDefaultValue", query = "SELECT x FROM XmlSchemaComponentPlacements x WHERE x.defaultValue = :defaultValue")})
public class XmlSchemaComponentPlacements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "placement_id")
    private int placementId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "placed_xml_component_id")
    private int placedXmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_default_fixed")
    private boolean isDefaultFixed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_occurences")
    private int minOccurences;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_occurences")
    private int maxOccurences;
    @Size(max = 4000)
    @Column(name = "default_value")
    private String defaultValue;

    public XmlSchemaComponentPlacements() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public int getPlacementId() {
        return placementId;
    }

    public void setPlacementId(int placementId) {
        this.placementId = placementId;
    }

    public int getPlacedXmlComponentId() {
        return placedXmlComponentId;
    }

    public void setPlacedXmlComponentId(int placedXmlComponentId) {
        this.placedXmlComponentId = placedXmlComponentId;
    }

    public boolean getIsDefaultFixed() {
        return isDefaultFixed;
    }

    public void setIsDefaultFixed(boolean isDefaultFixed) {
        this.isDefaultFixed = isDefaultFixed;
    }

    public int getMinOccurences() {
        return minOccurences;
    }

    public void setMinOccurences(int minOccurences) {
        this.minOccurences = minOccurences;
    }

    public int getMaxOccurences() {
        return maxOccurences;
    }

    public void setMaxOccurences(int maxOccurences) {
        this.maxOccurences = maxOccurences;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
}
