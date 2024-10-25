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
@Table(name = "database_automatic_tuning_options")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findAll", query = "SELECT d FROM DatabaseAutomaticTuningOptions d"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByName", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.name = :name"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByDesiredState", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.desiredState = :desiredState"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByDesiredStateDesc", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.desiredStateDesc = :desiredStateDesc"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByActualState", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.actualState = :actualState"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByActualStateDesc", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.actualStateDesc = :actualStateDesc"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByReason", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.reason = :reason"),
    @NamedQuery(name = "DatabaseAutomaticTuningOptions.findByReasonDesc", query = "SELECT d FROM DatabaseAutomaticTuningOptions d WHERE d.reasonDesc = :reasonDesc")})
public class DatabaseAutomaticTuningOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "desired_state")
    private Short desiredState;
    @Size(max = 60)
    @Column(name = "desired_state_desc")
    private String desiredStateDesc;
    @Column(name = "actual_state")
    private Short actualState;
    @Size(max = 60)
    @Column(name = "actual_state_desc")
    private String actualStateDesc;
    @Column(name = "reason")
    private Short reason;
    @Size(max = 60)
    @Column(name = "reason_desc")
    private String reasonDesc;

    public DatabaseAutomaticTuningOptions() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(Short desiredState) {
        this.desiredState = desiredState;
    }

    public String getDesiredStateDesc() {
        return desiredStateDesc;
    }

    public void setDesiredStateDesc(String desiredStateDesc) {
        this.desiredStateDesc = desiredStateDesc;
    }

    public Short getActualState() {
        return actualState;
    }

    public void setActualState(Short actualState) {
        this.actualState = actualState;
    }

    public String getActualStateDesc() {
        return actualStateDesc;
    }

    public void setActualStateDesc(String actualStateDesc) {
        this.actualStateDesc = actualStateDesc;
    }

    public Short getReason() {
        return reason;
    }

    public void setReason(Short reason) {
        this.reason = reason;
    }

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }
    
}
