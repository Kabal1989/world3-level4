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
@Table(name = "fulltext_index_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextIndexColumns.findAll", query = "SELECT f FROM FulltextIndexColumns f"),
    @NamedQuery(name = "FulltextIndexColumns.findByObjectId", query = "SELECT f FROM FulltextIndexColumns f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FulltextIndexColumns.findByColumnId", query = "SELECT f FROM FulltextIndexColumns f WHERE f.columnId = :columnId"),
    @NamedQuery(name = "FulltextIndexColumns.findByTypeColumnId", query = "SELECT f FROM FulltextIndexColumns f WHERE f.typeColumnId = :typeColumnId"),
    @NamedQuery(name = "FulltextIndexColumns.findByLanguageId", query = "SELECT f FROM FulltextIndexColumns f WHERE f.languageId = :languageId"),
    @NamedQuery(name = "FulltextIndexColumns.findByStatisticalSemantics", query = "SELECT f FROM FulltextIndexColumns f WHERE f.statisticalSemantics = :statisticalSemantics")})
public class FulltextIndexColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Column(name = "type_column_id")
    private Integer typeColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statistical_semantics")
    private int statisticalSemantics;

    public FulltextIndexColumns() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public Integer getTypeColumnId() {
        return typeColumnId;
    }

    public void setTypeColumnId(Integer typeColumnId) {
        this.typeColumnId = typeColumnId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getStatisticalSemantics() {
        return statisticalSemantics;
    }

    public void setStatisticalSemantics(int statisticalSemantics) {
        this.statisticalSemantics = statisticalSemantics;
    }
    
}
