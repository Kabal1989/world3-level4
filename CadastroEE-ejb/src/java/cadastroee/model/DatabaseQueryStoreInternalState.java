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
@Table(name = "database_query_store_internal_state")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseQueryStoreInternalState.findAll", query = "SELECT d FROM DatabaseQueryStoreInternalState d"),
    @NamedQuery(name = "DatabaseQueryStoreInternalState.findByPendingMessageCount", query = "SELECT d FROM DatabaseQueryStoreInternalState d WHERE d.pendingMessageCount = :pendingMessageCount"),
    @NamedQuery(name = "DatabaseQueryStoreInternalState.findByMessagingMemoryUsedMb", query = "SELECT d FROM DatabaseQueryStoreInternalState d WHERE d.messagingMemoryUsedMb = :messagingMemoryUsedMb")})
public class DatabaseQueryStoreInternalState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_message_count")
    private long pendingMessageCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "messaging_memory_used_mb")
    private long messagingMemoryUsedMb;

    public DatabaseQueryStoreInternalState() {
    }

    public long getPendingMessageCount() {
        return pendingMessageCount;
    }

    public void setPendingMessageCount(long pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
    }

    public long getMessagingMemoryUsedMb() {
        return messagingMemoryUsedMb;
    }

    public void setMessagingMemoryUsedMb(long messagingMemoryUsedMb) {
        this.messagingMemoryUsedMb = messagingMemoryUsedMb;
    }
    
}
