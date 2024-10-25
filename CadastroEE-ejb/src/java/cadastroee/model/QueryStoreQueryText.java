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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "query_store_query_text")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreQueryText.findAll", query = "SELECT q FROM QueryStoreQueryText q"),
    @NamedQuery(name = "QueryStoreQueryText.findByQueryTextId", query = "SELECT q FROM QueryStoreQueryText q WHERE q.queryTextId = :queryTextId"),
    @NamedQuery(name = "QueryStoreQueryText.findByQuerySqlText", query = "SELECT q FROM QueryStoreQueryText q WHERE q.querySqlText = :querySqlText"),
    @NamedQuery(name = "QueryStoreQueryText.findByIsPartOfEncryptedModule", query = "SELECT q FROM QueryStoreQueryText q WHERE q.isPartOfEncryptedModule = :isPartOfEncryptedModule"),
    @NamedQuery(name = "QueryStoreQueryText.findByHasRestrictedText", query = "SELECT q FROM QueryStoreQueryText q WHERE q.hasRestrictedText = :hasRestrictedText")})
public class QueryStoreQueryText implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_text_id")
    private long queryTextId;
    @Size(max = 2147483647)
    @Column(name = "query_sql_text")
    private String querySqlText;
    @Lob
    @Column(name = "statement_sql_handle")
    private byte[] statementSqlHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_part_of_encrypted_module")
    private boolean isPartOfEncryptedModule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_restricted_text")
    private boolean hasRestrictedText;

    public QueryStoreQueryText() {
    }

    public long getQueryTextId() {
        return queryTextId;
    }

    public void setQueryTextId(long queryTextId) {
        this.queryTextId = queryTextId;
    }

    public String getQuerySqlText() {
        return querySqlText;
    }

    public void setQuerySqlText(String querySqlText) {
        this.querySqlText = querySqlText;
    }

    public byte[] getStatementSqlHandle() {
        return statementSqlHandle;
    }

    public void setStatementSqlHandle(byte[] statementSqlHandle) {
        this.statementSqlHandle = statementSqlHandle;
    }

    public boolean getIsPartOfEncryptedModule() {
        return isPartOfEncryptedModule;
    }

    public void setIsPartOfEncryptedModule(boolean isPartOfEncryptedModule) {
        this.isPartOfEncryptedModule = isPartOfEncryptedModule;
    }

    public boolean getHasRestrictedText() {
        return hasRestrictedText;
    }

    public void setHasRestrictedText(boolean hasRestrictedText) {
        this.hasRestrictedText = hasRestrictedText;
    }
    
}
