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
@Table(name = "numbered_procedure_parameters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NumberedProcedureParameters.findAll", query = "SELECT n FROM NumberedProcedureParameters n"),
    @NamedQuery(name = "NumberedProcedureParameters.findByObjectId", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.objectId = :objectId"),
    @NamedQuery(name = "NumberedProcedureParameters.findByProcedureNumber", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.procedureNumber = :procedureNumber"),
    @NamedQuery(name = "NumberedProcedureParameters.findByName", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.name = :name"),
    @NamedQuery(name = "NumberedProcedureParameters.findByParameterId", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.parameterId = :parameterId"),
    @NamedQuery(name = "NumberedProcedureParameters.findBySystemTypeId", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "NumberedProcedureParameters.findByUserTypeId", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.userTypeId = :userTypeId"),
    @NamedQuery(name = "NumberedProcedureParameters.findByMaxLength", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.maxLength = :maxLength"),
    @NamedQuery(name = "NumberedProcedureParameters.findByPrecision", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.precision = :precision"),
    @NamedQuery(name = "NumberedProcedureParameters.findByScale", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.scale = :scale"),
    @NamedQuery(name = "NumberedProcedureParameters.findByIsOutput", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.isOutput = :isOutput"),
    @NamedQuery(name = "NumberedProcedureParameters.findByIsCursorRef", query = "SELECT n FROM NumberedProcedureParameters n WHERE n.isCursorRef = :isCursorRef")})
public class NumberedProcedureParameters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "procedure_number")
    private short procedureNumber;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
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
    @Column(name = "user_type_id")
    private int userTypeId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_output")
    private boolean isOutput;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_cursor_ref")
    private boolean isCursorRef;

    public NumberedProcedureParameters() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public short getProcedureNumber() {
        return procedureNumber;
    }

    public void setProcedureNumber(short procedureNumber) {
        this.procedureNumber = procedureNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
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

    public boolean getIsOutput() {
        return isOutput;
    }

    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    public boolean getIsCursorRef() {
        return isCursorRef;
    }

    public void setIsCursorRef(boolean isCursorRef) {
        this.isCursorRef = isCursorRef;
    }
    
}
