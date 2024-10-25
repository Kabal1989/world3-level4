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
@Table(name = "fulltext_index_catalog_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextIndexCatalogUsages.findAll", query = "SELECT f FROM FulltextIndexCatalogUsages f"),
    @NamedQuery(name = "FulltextIndexCatalogUsages.findByObjectId", query = "SELECT f FROM FulltextIndexCatalogUsages f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FulltextIndexCatalogUsages.findByIndexId", query = "SELECT f FROM FulltextIndexCatalogUsages f WHERE f.indexId = :indexId"),
    @NamedQuery(name = "FulltextIndexCatalogUsages.findByFulltextCatalogId", query = "SELECT f FROM FulltextIndexCatalogUsages f WHERE f.fulltextCatalogId = :fulltextCatalogId")})
public class FulltextIndexCatalogUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fulltext_catalog_id")
    private int fulltextCatalogId;

    public FulltextIndexCatalogUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public int getFulltextCatalogId() {
        return fulltextCatalogId;
    }

    public void setFulltextCatalogId(int fulltextCatalogId) {
        this.fulltextCatalogId = fulltextCatalogId;
    }
    
}
