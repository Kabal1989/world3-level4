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
@Table(name = "openkeys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Openkeys.findAll", query = "SELECT o FROM Openkeys o"),
    @NamedQuery(name = "Openkeys.findByDatabaseId", query = "SELECT o FROM Openkeys o WHERE o.databaseId = :databaseId"),
    @NamedQuery(name = "Openkeys.findByDatabaseName", query = "SELECT o FROM Openkeys o WHERE o.databaseName = :databaseName"),
    @NamedQuery(name = "Openkeys.findByKeyId", query = "SELECT o FROM Openkeys o WHERE o.keyId = :keyId"),
    @NamedQuery(name = "Openkeys.findByKeyName", query = "SELECT o FROM Openkeys o WHERE o.keyName = :keyName"),
    @NamedQuery(name = "Openkeys.findByKeyGuid", query = "SELECT o FROM Openkeys o WHERE o.keyGuid = :keyGuid"),
    @NamedQuery(name = "Openkeys.findByOpenedDate", query = "SELECT o FROM Openkeys o WHERE o.openedDate = :openedDate"),
    @NamedQuery(name = "Openkeys.findByStatus", query = "SELECT o FROM Openkeys o WHERE o.status = :status")})
public class Openkeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Size(max = 128)
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "key_id")
    private Integer keyId;
    @Size(max = 128)
    @Column(name = "key_name")
    private String keyName;
    @Size(max = 36)
    @Column(name = "key_guid")
    private String keyGuid;
    @Column(name = "opened_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openedDate;
    @Column(name = "status")
    private Short status;

    public Openkeys() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyGuid() {
        return keyGuid;
    }

    public void setKeyGuid(String keyGuid) {
        this.keyGuid = keyGuid;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
    
}
