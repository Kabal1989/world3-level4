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
@Table(name = "sql_dependencies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SqlDependencies.findAll", query = "SELECT s FROM SqlDependencies s"),
    @NamedQuery(name = "SqlDependencies.findByClass1", query = "SELECT s FROM SqlDependencies s WHERE s.class1 = :class1"),
    @NamedQuery(name = "SqlDependencies.findByClassDesc", query = "SELECT s FROM SqlDependencies s WHERE s.classDesc = :classDesc"),
    @NamedQuery(name = "SqlDependencies.findByObjectId", query = "SELECT s FROM SqlDependencies s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SqlDependencies.findByColumnId", query = "SELECT s FROM SqlDependencies s WHERE s.columnId = :columnId"),
    @NamedQuery(name = "SqlDependencies.findByReferencedMajorId", query = "SELECT s FROM SqlDependencies s WHERE s.referencedMajorId = :referencedMajorId"),
    @NamedQuery(name = "SqlDependencies.findByReferencedMinorId", query = "SELECT s FROM SqlDependencies s WHERE s.referencedMinorId = :referencedMinorId"),
    @NamedQuery(name = "SqlDependencies.findByIsSelected", query = "SELECT s FROM SqlDependencies s WHERE s.isSelected = :isSelected"),
    @NamedQuery(name = "SqlDependencies.findByIsUpdated", query = "SELECT s FROM SqlDependencies s WHERE s.isUpdated = :isUpdated"),
    @NamedQuery(name = "SqlDependencies.findByIsSelectAll", query = "SELECT s FROM SqlDependencies s WHERE s.isSelectAll = :isSelectAll")})
public class SqlDependencies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "class")
    private short class1;
    @Size(max = 60)
    @Column(name = "class_desc")
    private String classDesc;
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
    @Column(name = "referenced_major_id")
    private int referencedMajorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referenced_minor_id")
    private int referencedMinorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_selected")
    private boolean isSelected;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_updated")
    private boolean isUpdated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_select_all")
    private boolean isSelectAll;

    public SqlDependencies() {
    }

    public short getClass1() {
        return class1;
    }

    public void setClass1(short class1) {
        this.class1 = class1;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
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

    public int getReferencedMajorId() {
        return referencedMajorId;
    }

    public void setReferencedMajorId(int referencedMajorId) {
        this.referencedMajorId = referencedMajorId;
    }

    public int getReferencedMinorId() {
        return referencedMinorId;
    }

    public void setReferencedMinorId(int referencedMinorId) {
        this.referencedMinorId = referencedMinorId;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public boolean getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(boolean isUpdated) {
        this.isUpdated = isUpdated;
    }

    public boolean getIsSelectAll() {
        return isSelectAll;
    }

    public void setIsSelectAll(boolean isSelectAll) {
        this.isSelectAll = isSelectAll;
    }
    
}
