/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "fulltext_index_fragments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextIndexFragments.findAll", query = "SELECT f FROM FulltextIndexFragments f"),
    @NamedQuery(name = "FulltextIndexFragments.findByTableId", query = "SELECT f FROM FulltextIndexFragments f WHERE f.tableId = :tableId"),
    @NamedQuery(name = "FulltextIndexFragments.findByFragmentId", query = "SELECT f FROM FulltextIndexFragments f WHERE f.fragmentId = :fragmentId"),
    @NamedQuery(name = "FulltextIndexFragments.findByFragmentObjectId", query = "SELECT f FROM FulltextIndexFragments f WHERE f.fragmentObjectId = :fragmentObjectId"),
    @NamedQuery(name = "FulltextIndexFragments.findByStatus", query = "SELECT f FROM FulltextIndexFragments f WHERE f.status = :status"),
    @NamedQuery(name = "FulltextIndexFragments.findByDataSize", query = "SELECT f FROM FulltextIndexFragments f WHERE f.dataSize = :dataSize"),
    @NamedQuery(name = "FulltextIndexFragments.findByRowCount", query = "SELECT f FROM FulltextIndexFragments f WHERE f.rowCount = :rowCount")})
public class FulltextIndexFragments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fragment_id")
    private int fragmentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fragment_object_id")
    private int fragmentObjectId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "timestamp")
    private byte[] timestamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_size")
    private long dataSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_count")
    private long rowCount;

    public FulltextIndexFragments() {
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getFragmentId() {
        return fragmentId;
    }

    public void setFragmentId(int fragmentId) {
        this.fragmentId = fragmentId;
    }

    public int getFragmentObjectId() {
        return fragmentObjectId;
    }

    public void setFragmentObjectId(int fragmentObjectId) {
        this.fragmentObjectId = fragmentObjectId;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getDataSize() {
        return dataSize;
    }

    public void setDataSize(long dataSize) {
        this.dataSize = dataSize;
    }

    public long getRowCount() {
        return rowCount;
    }

    public void setRowCount(long rowCount) {
        this.rowCount = rowCount;
    }
    
}
