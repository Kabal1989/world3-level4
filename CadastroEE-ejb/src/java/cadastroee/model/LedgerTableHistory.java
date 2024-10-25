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
@Table(name = "ledger_table_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LedgerTableHistory.findAll", query = "SELECT l FROM LedgerTableHistory l"),
    @NamedQuery(name = "LedgerTableHistory.findByObjectId", query = "SELECT l FROM LedgerTableHistory l WHERE l.objectId = :objectId"),
    @NamedQuery(name = "LedgerTableHistory.findBySchemaName", query = "SELECT l FROM LedgerTableHistory l WHERE l.schemaName = :schemaName"),
    @NamedQuery(name = "LedgerTableHistory.findByTableName", query = "SELECT l FROM LedgerTableHistory l WHERE l.tableName = :tableName"),
    @NamedQuery(name = "LedgerTableHistory.findByLedgerViewSchemaName", query = "SELECT l FROM LedgerTableHistory l WHERE l.ledgerViewSchemaName = :ledgerViewSchemaName"),
    @NamedQuery(name = "LedgerTableHistory.findByLedgerViewName", query = "SELECT l FROM LedgerTableHistory l WHERE l.ledgerViewName = :ledgerViewName"),
    @NamedQuery(name = "LedgerTableHistory.findByOperationType", query = "SELECT l FROM LedgerTableHistory l WHERE l.operationType = :operationType"),
    @NamedQuery(name = "LedgerTableHistory.findByOperationTypeDesc", query = "SELECT l FROM LedgerTableHistory l WHERE l.operationTypeDesc = :operationTypeDesc"),
    @NamedQuery(name = "LedgerTableHistory.findByTransactionId", query = "SELECT l FROM LedgerTableHistory l WHERE l.transactionId = :transactionId"),
    @NamedQuery(name = "LedgerTableHistory.findBySequenceNumber", query = "SELECT l FROM LedgerTableHistory l WHERE l.sequenceNumber = :sequenceNumber")})
public class LedgerTableHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "schema_name")
    private String schemaName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ledger_view_schema_name")
    private String ledgerViewSchemaName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ledger_view_name")
    private String ledgerViewName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "operation_type")
    private int operationType;
    @Size(max = 60)
    @Column(name = "operation_type_desc")
    private String operationTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sequence_number")
    private long sequenceNumber;

    public LedgerTableHistory() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getLedgerViewSchemaName() {
        return ledgerViewSchemaName;
    }

    public void setLedgerViewSchemaName(String ledgerViewSchemaName) {
        this.ledgerViewSchemaName = ledgerViewSchemaName;
    }

    public String getLedgerViewName() {
        return ledgerViewName;
    }

    public void setLedgerViewName(String ledgerViewName) {
        this.ledgerViewName = ledgerViewName;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public String getOperationTypeDesc() {
        return operationTypeDesc;
    }

    public void setOperationTypeDesc(String operationTypeDesc) {
        this.operationTypeDesc = operationTypeDesc;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
}
