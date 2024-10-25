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
@Table(name = "partition_parameters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartitionParameters.findAll", query = "SELECT p FROM PartitionParameters p"),
    @NamedQuery(name = "PartitionParameters.findByFunctionId", query = "SELECT p FROM PartitionParameters p WHERE p.functionId = :functionId"),
    @NamedQuery(name = "PartitionParameters.findByParameterId", query = "SELECT p FROM PartitionParameters p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "PartitionParameters.findBySystemTypeId", query = "SELECT p FROM PartitionParameters p WHERE p.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "PartitionParameters.findByMaxLength", query = "SELECT p FROM PartitionParameters p WHERE p.maxLength = :maxLength"),
    @NamedQuery(name = "PartitionParameters.findByPrecision", query = "SELECT p FROM PartitionParameters p WHERE p.precision = :precision"),
    @NamedQuery(name = "PartitionParameters.findByScale", query = "SELECT p FROM PartitionParameters p WHERE p.scale = :scale"),
    @NamedQuery(name = "PartitionParameters.findByCollationName", query = "SELECT p FROM PartitionParameters p WHERE p.collationName = :collationName"),
    @NamedQuery(name = "PartitionParameters.findByUserTypeId", query = "SELECT p FROM PartitionParameters p WHERE p.userTypeId = :userTypeId")})
public class PartitionParameters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "function_id")
    private int functionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parameter_id")
    private int parameterId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_type_id")
    private short systemTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_length")
    private short maxLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precision")
    private short precision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scale")
    private short scale;
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type_id")
    private int userTypeId;

    public PartitionParameters() {
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public short getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(short systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public short getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(short maxLength) {
        this.maxLength = maxLength;
    }

    public short getPrecision() {
        return precision;
    }

    public void setPrecision(short precision) {
        this.precision = precision;
    }

    public short getScale() {
        return scale;
    }

    public void setScale(short scale) {
        this.scale = scale;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
    
}
