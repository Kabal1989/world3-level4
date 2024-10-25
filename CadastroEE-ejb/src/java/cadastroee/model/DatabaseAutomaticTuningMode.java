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
@Table(name = "database_automatic_tuning_mode")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseAutomaticTuningMode.findAll", query = "SELECT d FROM DatabaseAutomaticTuningMode d"),
    @NamedQuery(name = "DatabaseAutomaticTuningMode.findByDesiredState", query = "SELECT d FROM DatabaseAutomaticTuningMode d WHERE d.desiredState = :desiredState"),
    @NamedQuery(name = "DatabaseAutomaticTuningMode.findByDesiredStateDesc", query = "SELECT d FROM DatabaseAutomaticTuningMode d WHERE d.desiredStateDesc = :desiredStateDesc"),
    @NamedQuery(name = "DatabaseAutomaticTuningMode.findByActualState", query = "SELECT d FROM DatabaseAutomaticTuningMode d WHERE d.actualState = :actualState"),
    @NamedQuery(name = "DatabaseAutomaticTuningMode.findByActualStateDesc", query = "SELECT d FROM DatabaseAutomaticTuningMode d WHERE d.actualStateDesc = :actualStateDesc")})
public class DatabaseAutomaticTuningMode implements Serializable {

    private static final long serialVersionUID = 1L;
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

    public DatabaseAutomaticTuningMode() {
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
    
}
