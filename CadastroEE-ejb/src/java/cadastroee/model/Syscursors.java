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
@Table(name = "syscursors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscursors.findAll", query = "SELECT s FROM Syscursors s"),
    @NamedQuery(name = "Syscursors.findByCursorHandle", query = "SELECT s FROM Syscursors s WHERE s.cursorHandle = :cursorHandle"),
    @NamedQuery(name = "Syscursors.findByCursorName", query = "SELECT s FROM Syscursors s WHERE s.cursorName = :cursorName"),
    @NamedQuery(name = "Syscursors.findByStatus", query = "SELECT s FROM Syscursors s WHERE s.status = :status"),
    @NamedQuery(name = "Syscursors.findByModel", query = "SELECT s FROM Syscursors s WHERE s.model = :model"),
    @NamedQuery(name = "Syscursors.findByConcurrency", query = "SELECT s FROM Syscursors s WHERE s.concurrency = :concurrency"),
    @NamedQuery(name = "Syscursors.findByScrollable", query = "SELECT s FROM Syscursors s WHERE s.scrollable = :scrollable"),
    @NamedQuery(name = "Syscursors.findByOpenStatus", query = "SELECT s FROM Syscursors s WHERE s.openStatus = :openStatus"),
    @NamedQuery(name = "Syscursors.findByCursorRows", query = "SELECT s FROM Syscursors s WHERE s.cursorRows = :cursorRows"),
    @NamedQuery(name = "Syscursors.findByFetchStatus", query = "SELECT s FROM Syscursors s WHERE s.fetchStatus = :fetchStatus"),
    @NamedQuery(name = "Syscursors.findByColumnCount", query = "SELECT s FROM Syscursors s WHERE s.columnCount = :columnCount"),
    @NamedQuery(name = "Syscursors.findByRowCount", query = "SELECT s FROM Syscursors s WHERE s.rowCount = :rowCount"),
    @NamedQuery(name = "Syscursors.findByLastOperation", query = "SELECT s FROM Syscursors s WHERE s.lastOperation = :lastOperation")})
public class Syscursors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_handle")
    private int cursorHandle;
    @Size(max = 128)
    @Column(name = "cursor_name")
    private String cursorName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "model")
    private short model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "concurrency")
    private short concurrency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scrollable")
    private short scrollable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_status")
    private short openStatus;
    @Column(name = "cursor_rows")
    private Long cursorRows;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fetch_status")
    private short fetchStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_count")
    private short columnCount;
    @Column(name = "row_count")
    private Long rowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_operation")
    private short lastOperation;

    public Syscursors() {
    }

    public int getCursorHandle() {
        return cursorHandle;
    }

    public void setCursorHandle(int cursorHandle) {
        this.cursorHandle = cursorHandle;
    }

    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public short getModel() {
        return model;
    }

    public void setModel(short model) {
        this.model = model;
    }

    public short getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(short concurrency) {
        this.concurrency = concurrency;
    }

    public short getScrollable() {
        return scrollable;
    }

    public void setScrollable(short scrollable) {
        this.scrollable = scrollable;
    }

    public short getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(short openStatus) {
        this.openStatus = openStatus;
    }

    public Long getCursorRows() {
        return cursorRows;
    }

    public void setCursorRows(Long cursorRows) {
        this.cursorRows = cursorRows;
    }

    public short getFetchStatus() {
        return fetchStatus;
    }

    public void setFetchStatus(short fetchStatus) {
        this.fetchStatus = fetchStatus;
    }

    public short getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(short columnCount) {
        this.columnCount = columnCount;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public short getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(short lastOperation) {
        this.lastOperation = lastOperation;
    }
    
}
