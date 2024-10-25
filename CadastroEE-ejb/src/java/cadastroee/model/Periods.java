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
@Table(name = "periods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periods.findAll", query = "SELECT p FROM Periods p"),
    @NamedQuery(name = "Periods.findByName", query = "SELECT p FROM Periods p WHERE p.name = :name"),
    @NamedQuery(name = "Periods.findByPeriodType", query = "SELECT p FROM Periods p WHERE p.periodType = :periodType"),
    @NamedQuery(name = "Periods.findByPeriodTypeDesc", query = "SELECT p FROM Periods p WHERE p.periodTypeDesc = :periodTypeDesc"),
    @NamedQuery(name = "Periods.findByObjectId", query = "SELECT p FROM Periods p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "Periods.findByStartColumnId", query = "SELECT p FROM Periods p WHERE p.startColumnId = :startColumnId"),
    @NamedQuery(name = "Periods.findByEndColumnId", query = "SELECT p FROM Periods p WHERE p.endColumnId = :endColumnId")})
public class Periods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "period_type")
    private Short periodType;
    @Size(max = 60)
    @Column(name = "period_type_desc")
    private String periodTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_column_id")
    private int startColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_column_id")
    private int endColumnId;

    public Periods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Short periodType) {
        this.periodType = periodType;
    }

    public String getPeriodTypeDesc() {
        return periodTypeDesc;
    }

    public void setPeriodTypeDesc(String periodTypeDesc) {
        this.periodTypeDesc = periodTypeDesc;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getStartColumnId() {
        return startColumnId;
    }

    public void setStartColumnId(int startColumnId) {
        this.startColumnId = startColumnId;
    }

    public int getEndColumnId() {
        return endColumnId;
    }

    public void setEndColumnId(int endColumnId) {
        this.endColumnId = endColumnId;
    }
    
}
