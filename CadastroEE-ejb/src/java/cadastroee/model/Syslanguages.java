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
@Table(name = "syslanguages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syslanguages.findAll", query = "SELECT s FROM Syslanguages s"),
    @NamedQuery(name = "Syslanguages.findByLangid", query = "SELECT s FROM Syslanguages s WHERE s.langid = :langid"),
    @NamedQuery(name = "Syslanguages.findByDateformat", query = "SELECT s FROM Syslanguages s WHERE s.dateformat = :dateformat"),
    @NamedQuery(name = "Syslanguages.findByDatefirst", query = "SELECT s FROM Syslanguages s WHERE s.datefirst = :datefirst"),
    @NamedQuery(name = "Syslanguages.findByUpgrade", query = "SELECT s FROM Syslanguages s WHERE s.upgrade = :upgrade"),
    @NamedQuery(name = "Syslanguages.findByName", query = "SELECT s FROM Syslanguages s WHERE s.name = :name"),
    @NamedQuery(name = "Syslanguages.findByAlias", query = "SELECT s FROM Syslanguages s WHERE s.alias = :alias"),
    @NamedQuery(name = "Syslanguages.findByMonths", query = "SELECT s FROM Syslanguages s WHERE s.months = :months"),
    @NamedQuery(name = "Syslanguages.findByShortmonths", query = "SELECT s FROM Syslanguages s WHERE s.shortmonths = :shortmonths"),
    @NamedQuery(name = "Syslanguages.findByDays", query = "SELECT s FROM Syslanguages s WHERE s.days = :days"),
    @NamedQuery(name = "Syslanguages.findByLcid", query = "SELECT s FROM Syslanguages s WHERE s.lcid = :lcid"),
    @NamedQuery(name = "Syslanguages.findByMsglangid", query = "SELECT s FROM Syslanguages s WHERE s.msglangid = :msglangid")})
public class Syslanguages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "langid")
    private short langid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "dateformat")
    private String dateformat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datefirst")
    private short datefirst;
    @Column(name = "upgrade")
    private Integer upgrade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "alias")
    private String alias;
    @Size(max = 372)
    @Column(name = "months")
    private String months;
    @Size(max = 132)
    @Column(name = "shortmonths")
    private String shortmonths;
    @Size(max = 217)
    @Column(name = "days")
    private String days;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lcid")
    private int lcid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "msglangid")
    private short msglangid;

    public Syslanguages() {
    }

    public short getLangid() {
        return langid;
    }

    public void setLangid(short langid) {
        this.langid = langid;
    }

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }

    public short getDatefirst() {
        return datefirst;
    }

    public void setDatefirst(short datefirst) {
        this.datefirst = datefirst;
    }

    public Integer getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        this.upgrade = upgrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getShortmonths() {
        return shortmonths;
    }

    public void setShortmonths(String shortmonths) {
        this.shortmonths = shortmonths;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getLcid() {
        return lcid;
    }

    public void setLcid(int lcid) {
        this.lcid = lcid;
    }

    public short getMsglangid() {
        return msglangid;
    }

    public void setMsglangid(short msglangid) {
        this.msglangid = msglangid;
    }
    
}
