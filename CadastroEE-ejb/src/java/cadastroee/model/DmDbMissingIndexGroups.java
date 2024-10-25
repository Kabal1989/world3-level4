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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_missing_index_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMissingIndexGroups.findAll", query = "SELECT d FROM DmDbMissingIndexGroups d"),
    @NamedQuery(name = "DmDbMissingIndexGroups.findByIndexGroupHandle", query = "SELECT d FROM DmDbMissingIndexGroups d WHERE d.indexGroupHandle = :indexGroupHandle"),
    @NamedQuery(name = "DmDbMissingIndexGroups.findByIndexHandle", query = "SELECT d FROM DmDbMissingIndexGroups d WHERE d.indexHandle = :indexHandle")})
public class DmDbMissingIndexGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_group_handle")
    private int indexGroupHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_handle")
    private int indexHandle;

    public DmDbMissingIndexGroups() {
    }

    public int getIndexGroupHandle() {
        return indexGroupHandle;
    }

    public void setIndexGroupHandle(int indexGroupHandle) {
        this.indexGroupHandle = indexGroupHandle;
    }

    public int getIndexHandle() {
        return indexHandle;
    }

    public void setIndexHandle(int indexHandle) {
        this.indexHandle = indexHandle;
    }
    
}
