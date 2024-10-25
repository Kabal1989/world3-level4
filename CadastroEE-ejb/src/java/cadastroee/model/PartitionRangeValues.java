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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "partition_range_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartitionRangeValues.findAll", query = "SELECT p FROM PartitionRangeValues p"),
    @NamedQuery(name = "PartitionRangeValues.findByFunctionId", query = "SELECT p FROM PartitionRangeValues p WHERE p.functionId = :functionId"),
    @NamedQuery(name = "PartitionRangeValues.findByBoundaryId", query = "SELECT p FROM PartitionRangeValues p WHERE p.boundaryId = :boundaryId"),
    @NamedQuery(name = "PartitionRangeValues.findByParameterId", query = "SELECT p FROM PartitionRangeValues p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "PartitionRangeValues.findByValue", query = "SELECT p FROM PartitionRangeValues p WHERE p.value = :value")})
public class PartitionRangeValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "function_id")
    private int functionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boundary_id")
    private int boundaryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parameter_id")
    private int parameterId;
    @Column(name = "value")
    private Serializable value;

    public PartitionRangeValues() {
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public int getBoundaryId() {
        return boundaryId;
    }

    public void setBoundaryId(int boundaryId) {
        this.boundaryId = boundaryId;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
    
}
