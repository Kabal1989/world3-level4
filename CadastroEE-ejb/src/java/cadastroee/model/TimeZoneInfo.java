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
@Table(name = "time_zone_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeZoneInfo.findAll", query = "SELECT t FROM TimeZoneInfo t"),
    @NamedQuery(name = "TimeZoneInfo.findByName", query = "SELECT t FROM TimeZoneInfo t WHERE t.name = :name"),
    @NamedQuery(name = "TimeZoneInfo.findByCurrentUtcOffset", query = "SELECT t FROM TimeZoneInfo t WHERE t.currentUtcOffset = :currentUtcOffset"),
    @NamedQuery(name = "TimeZoneInfo.findByIsCurrentlyDst", query = "SELECT t FROM TimeZoneInfo t WHERE t.isCurrentlyDst = :isCurrentlyDst")})
public class TimeZoneInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "current_utc_offset")
    private String currentUtcOffset;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_currently_dst")
    private boolean isCurrentlyDst;

    public TimeZoneInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentUtcOffset() {
        return currentUtcOffset;
    }

    public void setCurrentUtcOffset(String currentUtcOffset) {
        this.currentUtcOffset = currentUtcOffset;
    }

    public boolean getIsCurrentlyDst() {
        return isCurrentlyDst;
    }

    public void setIsCurrentlyDst(boolean isCurrentlyDst) {
        this.isCurrentlyDst = isCurrentlyDst;
    }
    
}
