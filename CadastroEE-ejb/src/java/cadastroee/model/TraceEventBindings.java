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
@Table(name = "trace_event_bindings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraceEventBindings.findAll", query = "SELECT t FROM TraceEventBindings t"),
    @NamedQuery(name = "TraceEventBindings.findByTraceEventId", query = "SELECT t FROM TraceEventBindings t WHERE t.traceEventId = :traceEventId"),
    @NamedQuery(name = "TraceEventBindings.findByTraceColumnId", query = "SELECT t FROM TraceEventBindings t WHERE t.traceColumnId = :traceColumnId")})
public class TraceEventBindings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trace_event_id")
    private short traceEventId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trace_column_id")
    private short traceColumnId;

    public TraceEventBindings() {
    }

    public short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(short traceEventId) {
        this.traceEventId = traceEventId;
    }

    public short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }
    
}
