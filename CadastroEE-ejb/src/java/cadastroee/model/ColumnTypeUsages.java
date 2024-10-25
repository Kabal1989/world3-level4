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
@Table(name = "column_type_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnTypeUsages.findAll", query = "SELECT c FROM ColumnTypeUsages c"),
    @NamedQuery(name = "ColumnTypeUsages.findByObjectId", query = "SELECT c FROM ColumnTypeUsages c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ColumnTypeUsages.findByColumnId", query = "SELECT c FROM ColumnTypeUsages c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnTypeUsages.findByUserTypeId", query = "SELECT c FROM ColumnTypeUsages c WHERE c.userTypeId = :userTypeId")})
public class ColumnTypeUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type_id")
    private int userTypeId;

    public ColumnTypeUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
    
}
