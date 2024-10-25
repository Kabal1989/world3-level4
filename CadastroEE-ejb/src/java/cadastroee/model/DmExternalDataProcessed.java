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
@Table(name = "dm_external_data_processed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalDataProcessed.findAll", query = "SELECT d FROM DmExternalDataProcessed d"),
    @NamedQuery(name = "DmExternalDataProcessed.findByType", query = "SELECT d FROM DmExternalDataProcessed d WHERE d.type = :type"),
    @NamedQuery(name = "DmExternalDataProcessed.findByDataProcessedMb", query = "SELECT d FROM DmExternalDataProcessed d WHERE d.dataProcessedMb = :dataProcessedMb")})
public class DmExternalDataProcessed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_processed_mb")
    private long dataProcessedMb;

    public DmExternalDataProcessed() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDataProcessedMb() {
        return dataProcessedMb;
    }

    public void setDataProcessedMb(long dataProcessedMb) {
        this.dataProcessedMb = dataProcessedMb;
    }
    
}
