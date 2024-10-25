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
@Table(name = "syscursorcolumns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscursorcolumns.findAll", query = "SELECT s FROM Syscursorcolumns s"),
    @NamedQuery(name = "Syscursorcolumns.findByCursorHandle", query = "SELECT s FROM Syscursorcolumns s WHERE s.cursorHandle = :cursorHandle"),
    @NamedQuery(name = "Syscursorcolumns.findByColumnName", query = "SELECT s FROM Syscursorcolumns s WHERE s.columnName = :columnName"),
    @NamedQuery(name = "Syscursorcolumns.findByOrdinalPosition", query = "SELECT s FROM Syscursorcolumns s WHERE s.ordinalPosition = :ordinalPosition"),
    @NamedQuery(name = "Syscursorcolumns.findByColumnCharacteristicsFlags", query = "SELECT s FROM Syscursorcolumns s WHERE s.columnCharacteristicsFlags = :columnCharacteristicsFlags"),
    @NamedQuery(name = "Syscursorcolumns.findByColumnSize", query = "SELECT s FROM Syscursorcolumns s WHERE s.columnSize = :columnSize"),
    @NamedQuery(name = "Syscursorcolumns.findByDataTypeSql", query = "SELECT s FROM Syscursorcolumns s WHERE s.dataTypeSql = :dataTypeSql"),
    @NamedQuery(name = "Syscursorcolumns.findByColumnPrecision", query = "SELECT s FROM Syscursorcolumns s WHERE s.columnPrecision = :columnPrecision"),
    @NamedQuery(name = "Syscursorcolumns.findByColumnScale", query = "SELECT s FROM Syscursorcolumns s WHERE s.columnScale = :columnScale"),
    @NamedQuery(name = "Syscursorcolumns.findByOrderPosition", query = "SELECT s FROM Syscursorcolumns s WHERE s.orderPosition = :orderPosition"),
    @NamedQuery(name = "Syscursorcolumns.findByOrderDirection", query = "SELECT s FROM Syscursorcolumns s WHERE s.orderDirection = :orderDirection"),
    @NamedQuery(name = "Syscursorcolumns.findByHiddenColumn", query = "SELECT s FROM Syscursorcolumns s WHERE s.hiddenColumn = :hiddenColumn"),
    @NamedQuery(name = "Syscursorcolumns.findByColumnid", query = "SELECT s FROM Syscursorcolumns s WHERE s.columnid = :columnid"),
    @NamedQuery(name = "Syscursorcolumns.findByObjectid", query = "SELECT s FROM Syscursorcolumns s WHERE s.objectid = :objectid"),
    @NamedQuery(name = "Syscursorcolumns.findByDbid", query = "SELECT s FROM Syscursorcolumns s WHERE s.dbid = :dbid"),
    @NamedQuery(name = "Syscursorcolumns.findByDbname", query = "SELECT s FROM Syscursorcolumns s WHERE s.dbname = :dbname")})
public class Syscursorcolumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_handle")
    private int cursorHandle;
    @Size(max = 128)
    @Column(name = "column_name")
    private String columnName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordinal_position")
    private int ordinalPosition;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_characteristics_flags")
    private int columnCharacteristicsFlags;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_size")
    private int columnSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_type_sql")
    private int dataTypeSql;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_precision")
    private short columnPrecision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_scale")
    private short columnScale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_position")
    private int orderPosition;
    @Size(max = 1)
    @Column(name = "order_direction")
    private String orderDirection;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hidden_column")
    private short hiddenColumn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "columnid")
    private int columnid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "objectid")
    private int objectid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dbid")
    private int dbid;
    @Size(max = 128)
    @Column(name = "dbname")
    private String dbname;

    public Syscursorcolumns() {
    }

    public int getCursorHandle() {
        return cursorHandle;
    }

    public void setCursorHandle(int cursorHandle) {
        this.cursorHandle = cursorHandle;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public int getColumnCharacteristicsFlags() {
        return columnCharacteristicsFlags;
    }

    public void setColumnCharacteristicsFlags(int columnCharacteristicsFlags) {
        this.columnCharacteristicsFlags = columnCharacteristicsFlags;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public int getDataTypeSql() {
        return dataTypeSql;
    }

    public void setDataTypeSql(int dataTypeSql) {
        this.dataTypeSql = dataTypeSql;
    }

    public short getColumnPrecision() {
        return columnPrecision;
    }

    public void setColumnPrecision(short columnPrecision) {
        this.columnPrecision = columnPrecision;
    }

    public short getColumnScale() {
        return columnScale;
    }

    public void setColumnScale(short columnScale) {
        this.columnScale = columnScale;
    }

    public int getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(int orderPosition) {
        this.orderPosition = orderPosition;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public short getHiddenColumn() {
        return hiddenColumn;
    }

    public void setHiddenColumn(short hiddenColumn) {
        this.hiddenColumn = hiddenColumn;
    }

    public int getColumnid() {
        return columnid;
    }

    public void setColumnid(int columnid) {
        this.columnid = columnid;
    }

    public int getObjectid() {
        return objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public int getDbid() {
        return dbid;
    }

    public void setDbid(int dbid) {
        this.dbid = dbid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
    
}
