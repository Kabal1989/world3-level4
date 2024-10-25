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
@Table(name = "database_filestream_options")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseFilestreamOptions.findAll", query = "SELECT d FROM DatabaseFilestreamOptions d"),
    @NamedQuery(name = "DatabaseFilestreamOptions.findByDatabaseId", query = "SELECT d FROM DatabaseFilestreamOptions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DatabaseFilestreamOptions.findByNonTransactedAccess", query = "SELECT d FROM DatabaseFilestreamOptions d WHERE d.nonTransactedAccess = :nonTransactedAccess"),
    @NamedQuery(name = "DatabaseFilestreamOptions.findByNonTransactedAccessDesc", query = "SELECT d FROM DatabaseFilestreamOptions d WHERE d.nonTransactedAccessDesc = :nonTransactedAccessDesc"),
    @NamedQuery(name = "DatabaseFilestreamOptions.findByDirectoryName", query = "SELECT d FROM DatabaseFilestreamOptions d WHERE d.directoryName = :directoryName")})
public class DatabaseFilestreamOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "non_transacted_access")
    private short nonTransactedAccess;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "non_transacted_access_desc")
    private String nonTransactedAccessDesc;
    @Size(max = 256)
    @Column(name = "directory_name")
    private String directoryName;

    public DatabaseFilestreamOptions() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public short getNonTransactedAccess() {
        return nonTransactedAccess;
    }

    public void setNonTransactedAccess(short nonTransactedAccess) {
        this.nonTransactedAccess = nonTransactedAccess;
    }

    public String getNonTransactedAccessDesc() {
        return nonTransactedAccessDesc;
    }

    public void setNonTransactedAccessDesc(String nonTransactedAccessDesc) {
        this.nonTransactedAccessDesc = nonTransactedAccessDesc;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }
    
}
