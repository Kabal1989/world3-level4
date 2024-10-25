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
@Table(name = "trace_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraceCategories.findAll", query = "SELECT t FROM TraceCategories t"),
    @NamedQuery(name = "TraceCategories.findByCategoryId", query = "SELECT t FROM TraceCategories t WHERE t.categoryId = :categoryId"),
    @NamedQuery(name = "TraceCategories.findByName", query = "SELECT t FROM TraceCategories t WHERE t.name = :name"),
    @NamedQuery(name = "TraceCategories.findByType", query = "SELECT t FROM TraceCategories t WHERE t.type = :type")})
public class TraceCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private short categoryId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;

    public TraceCategories() {
    }

    public short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(short categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }
    
}
