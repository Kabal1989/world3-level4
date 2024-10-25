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
@Table(name = "stats_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatsColumns.findAll", query = "SELECT s FROM StatsColumns s"),
    @NamedQuery(name = "StatsColumns.findByObjectId", query = "SELECT s FROM StatsColumns s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "StatsColumns.findByStatsId", query = "SELECT s FROM StatsColumns s WHERE s.statsId = :statsId"),
    @NamedQuery(name = "StatsColumns.findByStatsColumnId", query = "SELECT s FROM StatsColumns s WHERE s.statsColumnId = :statsColumnId"),
    @NamedQuery(name = "StatsColumns.findByColumnId", query = "SELECT s FROM StatsColumns s WHERE s.columnId = :columnId")})
public class StatsColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stats_id")
    private int statsId;
    @Column(name = "stats_column_id")
    private Integer statsColumnId;
    @Column(name = "column_id")
    private Integer columnId;

    public StatsColumns() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getStatsId() {
        return statsId;
    }

    public void setStatsId(int statsId) {
        this.statsId = statsId;
    }

    public Integer getStatsColumnId() {
        return statsColumnId;
    }

    public void setStatsColumnId(Integer statsColumnId) {
        this.statsColumnId = statsColumnId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }
    
}
