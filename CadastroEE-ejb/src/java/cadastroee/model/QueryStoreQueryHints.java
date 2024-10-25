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
@Table(name = "query_store_query_hints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreQueryHints.findAll", query = "SELECT q FROM QueryStoreQueryHints q"),
    @NamedQuery(name = "QueryStoreQueryHints.findByQueryHintId", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.queryHintId = :queryHintId"),
    @NamedQuery(name = "QueryStoreQueryHints.findByQueryId", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.queryId = :queryId"),
    @NamedQuery(name = "QueryStoreQueryHints.findByReplicaGroupId", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.replicaGroupId = :replicaGroupId"),
    @NamedQuery(name = "QueryStoreQueryHints.findByQueryHintText", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.queryHintText = :queryHintText"),
    @NamedQuery(name = "QueryStoreQueryHints.findByLastQueryHintFailureReason", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.lastQueryHintFailureReason = :lastQueryHintFailureReason"),
    @NamedQuery(name = "QueryStoreQueryHints.findByLastQueryHintFailureReasonDesc", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.lastQueryHintFailureReasonDesc = :lastQueryHintFailureReasonDesc"),
    @NamedQuery(name = "QueryStoreQueryHints.findByQueryHintFailureCount", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.queryHintFailureCount = :queryHintFailureCount"),
    @NamedQuery(name = "QueryStoreQueryHints.findBySource", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.source = :source"),
    @NamedQuery(name = "QueryStoreQueryHints.findBySourceDesc", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.sourceDesc = :sourceDesc"),
    @NamedQuery(name = "QueryStoreQueryHints.findByComment", query = "SELECT q FROM QueryStoreQueryHints q WHERE q.comment = :comment")})
public class QueryStoreQueryHints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_hint_id")
    private long queryHintId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_id")
    private long queryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replica_group_id")
    private long replicaGroupId;
    @Size(max = 2147483647)
    @Column(name = "query_hint_text")
    private String queryHintText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_query_hint_failure_reason")
    private int lastQueryHintFailureReason;
    @Size(max = 128)
    @Column(name = "last_query_hint_failure_reason_desc")
    private String lastQueryHintFailureReasonDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_hint_failure_count")
    private long queryHintFailureCount;
    @Column(name = "source")
    private Integer source;
    @Size(max = 128)
    @Column(name = "source_desc")
    private String sourceDesc;
    @Size(max = 2147483647)
    @Column(name = "comment")
    private String comment;

    public QueryStoreQueryHints() {
    }

    public long getQueryHintId() {
        return queryHintId;
    }

    public void setQueryHintId(long queryHintId) {
        this.queryHintId = queryHintId;
    }

    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }

    public String getQueryHintText() {
        return queryHintText;
    }

    public void setQueryHintText(String queryHintText) {
        this.queryHintText = queryHintText;
    }

    public int getLastQueryHintFailureReason() {
        return lastQueryHintFailureReason;
    }

    public void setLastQueryHintFailureReason(int lastQueryHintFailureReason) {
        this.lastQueryHintFailureReason = lastQueryHintFailureReason;
    }

    public String getLastQueryHintFailureReasonDesc() {
        return lastQueryHintFailureReasonDesc;
    }

    public void setLastQueryHintFailureReasonDesc(String lastQueryHintFailureReasonDesc) {
        this.lastQueryHintFailureReasonDesc = lastQueryHintFailureReasonDesc;
    }

    public long getQueryHintFailureCount() {
        return queryHintFailureCount;
    }

    public void setQueryHintFailureCount(long queryHintFailureCount) {
        this.queryHintFailureCount = queryHintFailureCount;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
