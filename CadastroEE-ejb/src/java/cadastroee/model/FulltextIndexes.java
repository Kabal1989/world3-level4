/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "fulltext_indexes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextIndexes.findAll", query = "SELECT f FROM FulltextIndexes f"),
    @NamedQuery(name = "FulltextIndexes.findByObjectId", query = "SELECT f FROM FulltextIndexes f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FulltextIndexes.findByUniqueIndexId", query = "SELECT f FROM FulltextIndexes f WHERE f.uniqueIndexId = :uniqueIndexId"),
    @NamedQuery(name = "FulltextIndexes.findByFulltextCatalogId", query = "SELECT f FROM FulltextIndexes f WHERE f.fulltextCatalogId = :fulltextCatalogId"),
    @NamedQuery(name = "FulltextIndexes.findByIsEnabled", query = "SELECT f FROM FulltextIndexes f WHERE f.isEnabled = :isEnabled"),
    @NamedQuery(name = "FulltextIndexes.findByChangeTrackingState", query = "SELECT f FROM FulltextIndexes f WHERE f.changeTrackingState = :changeTrackingState"),
    @NamedQuery(name = "FulltextIndexes.findByChangeTrackingStateDesc", query = "SELECT f FROM FulltextIndexes f WHERE f.changeTrackingStateDesc = :changeTrackingStateDesc"),
    @NamedQuery(name = "FulltextIndexes.findByHasCrawlCompleted", query = "SELECT f FROM FulltextIndexes f WHERE f.hasCrawlCompleted = :hasCrawlCompleted"),
    @NamedQuery(name = "FulltextIndexes.findByCrawlType", query = "SELECT f FROM FulltextIndexes f WHERE f.crawlType = :crawlType"),
    @NamedQuery(name = "FulltextIndexes.findByCrawlTypeDesc", query = "SELECT f FROM FulltextIndexes f WHERE f.crawlTypeDesc = :crawlTypeDesc"),
    @NamedQuery(name = "FulltextIndexes.findByCrawlStartDate", query = "SELECT f FROM FulltextIndexes f WHERE f.crawlStartDate = :crawlStartDate"),
    @NamedQuery(name = "FulltextIndexes.findByCrawlEndDate", query = "SELECT f FROM FulltextIndexes f WHERE f.crawlEndDate = :crawlEndDate"),
    @NamedQuery(name = "FulltextIndexes.findByStoplistId", query = "SELECT f FROM FulltextIndexes f WHERE f.stoplistId = :stoplistId"),
    @NamedQuery(name = "FulltextIndexes.findByPropertyListId", query = "SELECT f FROM FulltextIndexes f WHERE f.propertyListId = :propertyListId"),
    @NamedQuery(name = "FulltextIndexes.findByDataSpaceId", query = "SELECT f FROM FulltextIndexes f WHERE f.dataSpaceId = :dataSpaceId")})
public class FulltextIndexes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unique_index_id")
    private int uniqueIndexId;
    @Column(name = "fulltext_catalog_id")
    private Integer fulltextCatalogId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_enabled")
    private boolean isEnabled;
    @Column(name = "change_tracking_state")
    private Character changeTrackingState;
    @Size(max = 60)
    @Column(name = "change_tracking_state_desc")
    private String changeTrackingStateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_crawl_completed")
    private boolean hasCrawlCompleted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crawl_type")
    private Character crawlType;
    @Size(max = 60)
    @Column(name = "crawl_type_desc")
    private String crawlTypeDesc;
    @Column(name = "crawl_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crawlStartDate;
    @Column(name = "crawl_end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crawlEndDate;
    @Lob
    @Column(name = "incremental_timestamp")
    private byte[] incrementalTimestamp;
    @Column(name = "stoplist_id")
    private Integer stoplistId;
    @Column(name = "property_list_id")
    private Integer propertyListId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;

    public FulltextIndexes() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getUniqueIndexId() {
        return uniqueIndexId;
    }

    public void setUniqueIndexId(int uniqueIndexId) {
        this.uniqueIndexId = uniqueIndexId;
    }

    public Integer getFulltextCatalogId() {
        return fulltextCatalogId;
    }

    public void setFulltextCatalogId(Integer fulltextCatalogId) {
        this.fulltextCatalogId = fulltextCatalogId;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Character getChangeTrackingState() {
        return changeTrackingState;
    }

    public void setChangeTrackingState(Character changeTrackingState) {
        this.changeTrackingState = changeTrackingState;
    }

    public String getChangeTrackingStateDesc() {
        return changeTrackingStateDesc;
    }

    public void setChangeTrackingStateDesc(String changeTrackingStateDesc) {
        this.changeTrackingStateDesc = changeTrackingStateDesc;
    }

    public boolean getHasCrawlCompleted() {
        return hasCrawlCompleted;
    }

    public void setHasCrawlCompleted(boolean hasCrawlCompleted) {
        this.hasCrawlCompleted = hasCrawlCompleted;
    }

    public Character getCrawlType() {
        return crawlType;
    }

    public void setCrawlType(Character crawlType) {
        this.crawlType = crawlType;
    }

    public String getCrawlTypeDesc() {
        return crawlTypeDesc;
    }

    public void setCrawlTypeDesc(String crawlTypeDesc) {
        this.crawlTypeDesc = crawlTypeDesc;
    }

    public Date getCrawlStartDate() {
        return crawlStartDate;
    }

    public void setCrawlStartDate(Date crawlStartDate) {
        this.crawlStartDate = crawlStartDate;
    }

    public Date getCrawlEndDate() {
        return crawlEndDate;
    }

    public void setCrawlEndDate(Date crawlEndDate) {
        this.crawlEndDate = crawlEndDate;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }

    public Integer getStoplistId() {
        return stoplistId;
    }

    public void setStoplistId(Integer stoplistId) {
        this.stoplistId = stoplistId;
    }

    public Integer getPropertyListId() {
        return propertyListId;
    }

    public void setPropertyListId(Integer propertyListId) {
        this.propertyListId = propertyListId;
    }

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }
    
}
