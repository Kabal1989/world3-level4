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
@Table(name = "dm_hadr_ag_threads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAgThreads.findAll", query = "SELECT d FROM DmHadrAgThreads d"),
    @NamedQuery(name = "DmHadrAgThreads.findByGroupId", query = "SELECT d FROM DmHadrAgThreads d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmHadrAgThreads.findByName", query = "SELECT d FROM DmHadrAgThreads d WHERE d.name = :name"),
    @NamedQuery(name = "DmHadrAgThreads.findByNumDatabases", query = "SELECT d FROM DmHadrAgThreads d WHERE d.numDatabases = :numDatabases"),
    @NamedQuery(name = "DmHadrAgThreads.findByNumCaptureThreads", query = "SELECT d FROM DmHadrAgThreads d WHERE d.numCaptureThreads = :numCaptureThreads"),
    @NamedQuery(name = "DmHadrAgThreads.findByNumRedoThreads", query = "SELECT d FROM DmHadrAgThreads d WHERE d.numRedoThreads = :numRedoThreads"),
    @NamedQuery(name = "DmHadrAgThreads.findByNumParallelRedoThreads", query = "SELECT d FROM DmHadrAgThreads d WHERE d.numParallelRedoThreads = :numParallelRedoThreads"),
    @NamedQuery(name = "DmHadrAgThreads.findByNumHadrThreads", query = "SELECT d FROM DmHadrAgThreads d WHERE d.numHadrThreads = :numHadrThreads")})
public class DmHadrAgThreads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "num_databases")
    private Integer numDatabases;
    @Column(name = "num_capture_threads")
    private Integer numCaptureThreads;
    @Column(name = "num_redo_threads")
    private Integer numRedoThreads;
    @Column(name = "num_parallel_redo_threads")
    private Integer numParallelRedoThreads;
    @Column(name = "num_hadr_threads")
    private Integer numHadrThreads;

    public DmHadrAgThreads() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumDatabases() {
        return numDatabases;
    }

    public void setNumDatabases(Integer numDatabases) {
        this.numDatabases = numDatabases;
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

    public Integer getNumHadrThreads() {
        return numHadrThreads;
    }

    public void setNumHadrThreads(Integer numHadrThreads) {
        this.numHadrThreads = numHadrThreads;
    }
    
}
