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
@Table(name = "dm_exec_query_transformation_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryTransformationStats.findAll", query = "SELECT d FROM DmExecQueryTransformationStats d"),
    @NamedQuery(name = "DmExecQueryTransformationStats.findByName", query = "SELECT d FROM DmExecQueryTransformationStats d WHERE d.name = :name"),
    @NamedQuery(name = "DmExecQueryTransformationStats.findByPromiseTotal", query = "SELECT d FROM DmExecQueryTransformationStats d WHERE d.promiseTotal = :promiseTotal"),
    @NamedQuery(name = "DmExecQueryTransformationStats.findByPromiseAvg", query = "SELECT d FROM DmExecQueryTransformationStats d WHERE d.promiseAvg = :promiseAvg"),
    @NamedQuery(name = "DmExecQueryTransformationStats.findByPromised", query = "SELECT d FROM DmExecQueryTransformationStats d WHERE d.promised = :promised"),
    @NamedQuery(name = "DmExecQueryTransformationStats.findByBuiltSubstitute", query = "SELECT d FROM DmExecQueryTransformationStats d WHERE d.builtSubstitute = :builtSubstitute"),
    @NamedQuery(name = "DmExecQueryTransformationStats.findBySucceeded", query = "SELECT d FROM DmExecQueryTransformationStats d WHERE d.succeeded = :succeeded")})
public class DmExecQueryTransformationStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8000)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "promise_total")
    private long promiseTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "promise_avg")
    private double promiseAvg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "promised")
    private long promised;
    @Basic(optional = false)
    @NotNull
    @Column(name = "built_substitute")
    private long builtSubstitute;
    @Basic(optional = false)
    @NotNull
    @Column(name = "succeeded")
    private long succeeded;

    public DmExecQueryTransformationStats() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPromiseTotal() {
        return promiseTotal;
    }

    public void setPromiseTotal(long promiseTotal) {
        this.promiseTotal = promiseTotal;
    }

    public double getPromiseAvg() {
        return promiseAvg;
    }

    public void setPromiseAvg(double promiseAvg) {
        this.promiseAvg = promiseAvg;
    }

    public long getPromised() {
        return promised;
    }

    public void setPromised(long promised) {
        this.promised = promised;
    }

    public long getBuiltSubstitute() {
        return builtSubstitute;
    }

    public void setBuiltSubstitute(long builtSubstitute) {
        this.builtSubstitute = builtSubstitute;
    }

    public long getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(long succeeded) {
        this.succeeded = succeeded;
    }
    
}
