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
@Table(name = "syscursortables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscursortables.findAll", query = "SELECT s FROM Syscursortables s"),
    @NamedQuery(name = "Syscursortables.findByCursorHandle", query = "SELECT s FROM Syscursortables s WHERE s.cursorHandle = :cursorHandle"),
    @NamedQuery(name = "Syscursortables.findByTableOwner", query = "SELECT s FROM Syscursortables s WHERE s.tableOwner = :tableOwner"),
    @NamedQuery(name = "Syscursortables.findByTableName", query = "SELECT s FROM Syscursortables s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "Syscursortables.findByOptimizerHint", query = "SELECT s FROM Syscursortables s WHERE s.optimizerHint = :optimizerHint"),
    @NamedQuery(name = "Syscursortables.findByLockType", query = "SELECT s FROM Syscursortables s WHERE s.lockType = :lockType"),
    @NamedQuery(name = "Syscursortables.findByServerName", query = "SELECT s FROM Syscursortables s WHERE s.serverName = :serverName"),
    @NamedQuery(name = "Syscursortables.findByObjectid", query = "SELECT s FROM Syscursortables s WHERE s.objectid = :objectid"),
    @NamedQuery(name = "Syscursortables.findByDbid", query = "SELECT s FROM Syscursortables s WHERE s.dbid = :dbid"),
    @NamedQuery(name = "Syscursortables.findByDbname", query = "SELECT s FROM Syscursortables s WHERE s.dbname = :dbname")})
public class Syscursortables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_handle")
    private int cursorHandle;
    @Size(max = 128)
    @Column(name = "table_owner")
    private String tableOwner;
    @Size(max = 128)
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "optimizer_hint")
    private short optimizerHint;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lock_type")
    private short lockType;
    @Size(max = 128)
    @Column(name = "server_name")
    private String serverName;
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

    public Syscursortables() {
    }

    public int getCursorHandle() {
        return cursorHandle;
    }

    public void setCursorHandle(int cursorHandle) {
        this.cursorHandle = cursorHandle;
    }

    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public short getOptimizerHint() {
        return optimizerHint;
    }

    public void setOptimizerHint(short optimizerHint) {
        this.optimizerHint = optimizerHint;
    }

    public short getLockType() {
        return lockType;
    }

    public void setLockType(short lockType) {
        this.lockType = lockType;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
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
