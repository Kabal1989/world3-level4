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
@Table(name = "trace_events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraceEvents.findAll", query = "SELECT t FROM TraceEvents t"),
    @NamedQuery(name = "TraceEvents.findByTraceEventId", query = "SELECT t FROM TraceEvents t WHERE t.traceEventId = :traceEventId"),
    @NamedQuery(name = "TraceEvents.findByCategoryId", query = "SELECT t FROM TraceEvents t WHERE t.categoryId = :categoryId"),
    @NamedQuery(name = "TraceEvents.findByName", query = "SELECT t FROM TraceEvents t WHERE t.name = :name")})
public class TraceEvents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trace_event_id")
    private short traceEventId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private short categoryId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;

    public TraceEvents() {
    }

    public short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(short traceEventId) {
        this.traceEventId = traceEventId;
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
    
}
