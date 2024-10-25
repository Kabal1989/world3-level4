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
@Table(name = "function_order_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FunctionOrderColumns.findAll", query = "SELECT f FROM FunctionOrderColumns f"),
    @NamedQuery(name = "FunctionOrderColumns.findByObjectId", query = "SELECT f FROM FunctionOrderColumns f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FunctionOrderColumns.findByOrderColumnId", query = "SELECT f FROM FunctionOrderColumns f WHERE f.orderColumnId = :orderColumnId"),
    @NamedQuery(name = "FunctionOrderColumns.findByColumnId", query = "SELECT f FROM FunctionOrderColumns f WHERE f.columnId = :columnId"),
    @NamedQuery(name = "FunctionOrderColumns.findByIsDescending", query = "SELECT f FROM FunctionOrderColumns f WHERE f.isDescending = :isDescending")})
public class FunctionOrderColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_column_id")
    private int orderColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Column(name = "is_descending")
    private Boolean isDescending;

    public FunctionOrderColumns() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getOrderColumnId() {
        return orderColumnId;
    }

    public void setOrderColumnId(int orderColumnId) {
        this.orderColumnId = orderColumnId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public Boolean getIsDescending() {
        return isDescending;
    }

    public void setIsDescending(Boolean isDescending) {
        this.isDescending = isDescending;
    }
    
}
