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
@Table(name = "dm_hadr_db_threads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrDbThreads.findAll", query = "SELECT d FROM DmHadrDbThreads d"),
    @NamedQuery(name = "DmHadrDbThreads.findByGroupId", query = "SELECT d FROM DmHadrDbThreads d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmHadrDbThreads.findByAgDbId", query = "SELECT d FROM DmHadrDbThreads d WHERE d.agDbId = :agDbId"),
    @NamedQuery(name = "DmHadrDbThreads.findByName", query = "SELECT d FROM DmHadrDbThreads d WHERE d.name = :name"),
    @NamedQuery(name = "DmHadrDbThreads.findByNumCaptureThreads", query = "SELECT d FROM DmHadrDbThreads d WHERE d.numCaptureThreads = :numCaptureThreads"),
    @NamedQuery(name = "DmHadrDbThreads.findByNumRedoThreads", query = "SELECT d FROM DmHadrDbThreads d WHERE d.numRedoThreads = :numRedoThreads"),
    @NamedQuery(name = "DmHadrDbThreads.findByNumParallelRedoThreads", query = "SELECT d FROM DmHadrDbThreads d WHERE d.numParallelRedoThreads = :numParallelRedoThreads")})
public class DmHadrDbThreads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "ag_db_id")
    private String agDbId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "num_capture_threads")
    private Integer numCaptureThreads;
    @Column(name = "num_redo_threads")
    private Integer numRedoThreads;
    @Column(name = "num_parallel_redo_threads")
    private Integer numParallelRedoThreads;

    public DmHadrDbThreads() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getAgDbId() {
        return agDbId;
    }

    public void setAgDbId(String agDbId) {
        this.agDbId = agDbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumCaptureThreads() {
        return numCaptureThreads;
    }

    public void setNumCaptureThreads(Integer numCaptureThreads) {
        this.numCaptureThreads = numCaptureThreads;
    }

    public Integer getNumRedoThreads() {
        return numRedoThreads;
    }

    public void setNumRedoThreads(Integer numRedoThreads) {
        this.numRedoThreads = numRedoThreads;
    }

    public Integer getNumParallelRedoThreads() {
        return numParallelRedoThreads;
    }

    public void setNumParallelRedoThreads(Integer numParallelRedoThreads) {
        this.numParallelRedoThreads = numParallelRedoThreads;
    }
    
}
