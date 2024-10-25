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
@Table(name = "dm_db_external_script_execution_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findAll", query = "SELECT d FROM DmDbExternalScriptExecutionStats d"),
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findByExternalLanguageId", query = "SELECT d FROM DmDbExternalScriptExecutionStats d WHERE d.externalLanguageId = :externalLanguageId"),
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findByCounterName", query = "SELECT d FROM DmDbExternalScriptExecutionStats d WHERE d.counterName = :counterName"),
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findByCounterValue", query = "SELECT d FROM DmDbExternalScriptExecutionStats d WHERE d.counterValue = :counterValue")})
public class DmDbExternalScriptExecutionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_language_id")
    private int externalLanguageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "counter_name")
    private String counterName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "counter_value")
    private long counterValue;

    public DmDbExternalScriptExecutionStats() {
    }

    public int getExternalLanguageId() {
        return externalLanguageId;
    }

    public void setExternalLanguageId(int externalLanguageId) {
        this.externalLanguageId = externalLanguageId;
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    public long getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(long counterValue) {
        this.counterValue = counterValue;
    }
    
}
