/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_external_governance_sync_state")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalGovernanceSyncState.findAll", query = "SELECT d FROM DmExternalGovernanceSyncState d"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByDatabaseId", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findBySyncScope", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.syncScope = :syncScope"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findBySyncScopeDesc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.syncScopeDesc = :syncScopeDesc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findBySyncState", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.syncState = :syncState"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findBySyncStateDesc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.syncStateDesc = :syncStateDesc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByUserInitiatedSync", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.userInitiatedSync = :userInitiatedSync"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findBySyncPercentComplete", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.syncPercentComplete = :syncPercentComplete"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByCurrentSyncToken", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.currentSyncToken = :currentSyncToken"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByNextSyncToken", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.nextSyncToken = :nextSyncToken"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByCurrentBlobReferences", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.currentBlobReferences = :currentBlobReferences"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastReferenceFetchSuccessTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastReferenceFetchSuccessTimeUtc = :lastReferenceFetchSuccessTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastReferenceFetchAttemptTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastReferenceFetchAttemptTimeUtc = :lastReferenceFetchAttemptTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastReferenceFetchError", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastReferenceFetchError = :lastReferenceFetchError"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastBlobFetchSuccessTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastBlobFetchSuccessTimeUtc = :lastBlobFetchSuccessTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastBlobFetchAttemptTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastBlobFetchAttemptTimeUtc = :lastBlobFetchAttemptTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastBlobFetchError", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastBlobFetchError = :lastBlobFetchError"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastSyncSuccessTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastSyncSuccessTimeUtc = :lastSyncSuccessTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastSynchronizingSuccessTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastSynchronizingSuccessTimeUtc = :lastSynchronizingSuccessTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastSynchronizingAttemptTimeUtc", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastSynchronizingAttemptTimeUtc = :lastSynchronizingAttemptTimeUtc"),
    @NamedQuery(name = "DmExternalGovernanceSyncState.findByLastSynchronizingError", query = "SELECT d FROM DmExternalGovernanceSyncState d WHERE d.lastSynchronizingError = :lastSynchronizingError")})
public class DmExternalGovernanceSyncState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "sync_scope")
    private Short syncScope;
    @Size(max = 60)
    @Column(name = "sync_scope_desc")
    private String syncScopeDesc;
    @Column(name = "sync_state")
    private Short syncState;
    @Size(max = 60)
    @Column(name = "sync_state_desc")
    private String syncStateDesc;
    @Column(name = "user_initiated_sync")
    private Short userInitiatedSync;
    @Column(name = "sync_percent_complete")
    private Short syncPercentComplete;
    @Size(max = 128)
    @Column(name = "current_sync_token")
    private String currentSyncToken;
    @Size(max = 128)
    @Column(name = "next_sync_token")
    private String nextSyncToken;
    @Size(max = 4000)
    @Column(name = "current_blob_references")
    private String currentBlobReferences;
    @Column(name = "last_reference_fetch_success_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastReferenceFetchSuccessTimeUtc;
    @Column(name = "last_reference_fetch_attempt_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastReferenceFetchAttemptTimeUtc;
    @Column(name = "last_reference_fetch_error")
    private Integer lastReferenceFetchError;
    @Column(name = "last_blob_fetch_success_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastBlobFetchSuccessTimeUtc;
    @Column(name = "last_blob_fetch_attempt_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastBlobFetchAttemptTimeUtc;
    @Column(name = "last_blob_fetch_error")
    private Integer lastBlobFetchError;
    @Column(name = "last_sync_success_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSyncSuccessTimeUtc;
    @Column(name = "last_synchronizing_success_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSynchronizingSuccessTimeUtc;
    @Column(name = "last_synchronizing_attempt_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSynchronizingAttemptTimeUtc;
    @Column(name = "last_synchronizing_error")
    private Integer lastSynchronizingError;

    public DmExternalGovernanceSyncState() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Short getSyncScope() {
        return syncScope;
    }

    public void setSyncScope(Short syncScope) {
        this.syncScope = syncScope;
    }

    public String getSyncScopeDesc() {
        return syncScopeDesc;
    }

    public void setSyncScopeDesc(String syncScopeDesc) {
        this.syncScopeDesc = syncScopeDesc;
    }

    public Short getSyncState() {
        return syncState;
    }

    public void setSyncState(Short syncState) {
        this.syncState = syncState;
    }

    public String getSyncStateDesc() {
        return syncStateDesc;
    }

    public void setSyncStateDesc(String syncStateDesc) {
        this.syncStateDesc = syncStateDesc;
    }

    public Short getUserInitiatedSync() {
        return userInitiatedSync;
    }

    public void setUserInitiatedSync(Short userInitiatedSync) {
        this.userInitiatedSync = userInitiatedSync;
    }

    public Short getSyncPercentComplete() {
        return syncPercentComplete;
    }

    public void setSyncPercentComplete(Short syncPercentComplete) {
        this.syncPercentComplete = syncPercentComplete;
    }

    public String getCurrentSyncToken() {
        return currentSyncToken;
    }

    public void setCurrentSyncToken(String currentSyncToken) {
        this.currentSyncToken = currentSyncToken;
    }

    public String getNextSyncToken() {
        return nextSyncToken;
    }

    public void setNextSyncToken(String nextSyncToken) {
        this.nextSyncToken = nextSyncToken;
    }

    public String getCurrentBlobReferences() {
        return currentBlobReferences;
    }

    public void setCurrentBlobReferences(String currentBlobReferences) {
        this.currentBlobReferences = currentBlobReferences;
    }

    public Date getLastReferenceFetchSuccessTimeUtc() {
        return lastReferenceFetchSuccessTimeUtc;
    }

    public void setLastReferenceFetchSuccessTimeUtc(Date lastReferenceFetchSuccessTimeUtc) {
        this.lastReferenceFetchSuccessTimeUtc = lastReferenceFetchSuccessTimeUtc;
    }

    public Date getLastReferenceFetchAttemptTimeUtc() {
        return lastReferenceFetchAttemptTimeUtc;
    }

    public void setLastReferenceFetchAttemptTimeUtc(Date lastReferenceFetchAttemptTimeUtc) {
        this.lastReferenceFetchAttemptTimeUtc = lastReferenceFetchAttemptTimeUtc;
    }

    public Integer getLastReferenceFetchError() {
        return lastReferenceFetchError;
    }

    public void setLastReferenceFetchError(Integer lastReferenceFetchError) {
        this.lastReferenceFetchError = lastReferenceFetchError;
    }

    public Date getLastBlobFetchSuccessTimeUtc() {
        return lastBlobFetchSuccessTimeUtc;
    }

    public void setLastBlobFetchSuccessTimeUtc(Date lastBlobFetchSuccessTimeUtc) {
        this.lastBlobFetchSuccessTimeUtc = lastBlobFetchSuccessTimeUtc;
    }

    public Date getLastBlobFetchAttemptTimeUtc() {
        return lastBlobFetchAttemptTimeUtc;
    }

    public void setLastBlobFetchAttemptTimeUtc(Date lastBlobFetchAttemptTimeUtc) {
        this.lastBlobFetchAttemptTimeUtc = lastBlobFetchAttemptTimeUtc;
    }

    public Integer getLastBlobFetchError() {
        return lastBlobFetchError;
    }

    public void setLastBlobFetchError(Integer lastBlobFetchError) {
        this.lastBlobFetchError = lastBlobFetchError;
    }

    public Date getLastSyncSuccessTimeUtc() {
        return lastSyncSuccessTimeUtc;
    }

    public void setLastSyncSuccessTimeUtc(Date lastSyncSuccessTimeUtc) {
        this.lastSyncSuccessTimeUtc = lastSyncSuccessTimeUtc;
    }

    public Date getLastSynchronizingSuccessTimeUtc() {
        return lastSynchronizingSuccessTimeUtc;
    }

    public void setLastSynchronizingSuccessTimeUtc(Date lastSynchronizingSuccessTimeUtc) {
        this.lastSynchronizingSuccessTimeUtc = lastSynchronizingSuccessTimeUtc;
    }

    public Date getLastSynchronizingAttemptTimeUtc() {
        return lastSynchronizingAttemptTimeUtc;
    }

    public void setLastSynchronizingAttemptTimeUtc(Date lastSynchronizingAttemptTimeUtc) {
        this.lastSynchronizingAttemptTimeUtc = lastSynchronizingAttemptTimeUtc;
    }

    public Integer getLastSynchronizingError() {
        return lastSynchronizingError;
    }

    public void setLastSynchronizingError(Integer lastSynchronizingError) {
        this.lastSynchronizingError = lastSynchronizingError;
    }
    
}
