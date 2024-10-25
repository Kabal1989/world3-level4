/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "column_encryption_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnEncryptionKeys.findAll", query = "SELECT c FROM ColumnEncryptionKeys c"),
    @NamedQuery(name = "ColumnEncryptionKeys.findByName", query = "SELECT c FROM ColumnEncryptionKeys c WHERE c.name = :name"),
    @NamedQuery(name = "ColumnEncryptionKeys.findByColumnEncryptionKeyId", query = "SELECT c FROM ColumnEncryptionKeys c WHERE c.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "ColumnEncryptionKeys.findByCreateDate", query = "SELECT c FROM ColumnEncryptionKeys c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "ColumnEncryptionKeys.findByModifyDate", query = "SELECT c FROM ColumnEncryptionKeys c WHERE c.modifyDate = :modifyDate")})
public class ColumnEncryptionKeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_encryption_key_id")
    private int columnEncryptionKeyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public ColumnEncryptionKeys() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColumnEncryptionKeyId() {
        return columnEncryptionKeyId;
    }

    public void setColumnEncryptionKeyId(int columnEncryptionKeyId) {
        this.columnEncryptionKeyId = columnEncryptionKeyId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}
