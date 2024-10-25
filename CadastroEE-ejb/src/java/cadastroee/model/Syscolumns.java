/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "syscolumns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscolumns.findAll", query = "SELECT s FROM Syscolumns s"),
    @NamedQuery(name = "Syscolumns.findByName", query = "SELECT s FROM Syscolumns s WHERE s.name = :name"),
    @NamedQuery(name = "Syscolumns.findById", query = "SELECT s FROM Syscolumns s WHERE s.id = :id"),
    @NamedQuery(name = "Syscolumns.findByXtype", query = "SELECT s FROM Syscolumns s WHERE s.xtype = :xtype"),
    @NamedQuery(name = "Syscolumns.findByTypestat", query = "SELECT s FROM Syscolumns s WHERE s.typestat = :typestat"),
    @NamedQuery(name = "Syscolumns.findByXusertype", query = "SELECT s FROM Syscolumns s WHERE s.xusertype = :xusertype"),
    @NamedQuery(name = "Syscolumns.findByLength", query = "SELECT s FROM Syscolumns s WHERE s.length = :length"),
    @NamedQuery(name = "Syscolumns.findByXprec", query = "SELECT s FROM Syscolumns s WHERE s.xprec = :xprec"),
    @NamedQuery(name = "Syscolumns.findByXscale", query = "SELECT s FROM Syscolumns s WHERE s.xscale = :xscale"),
    @NamedQuery(name = "Syscolumns.findByColid", query = "SELECT s FROM Syscolumns s WHERE s.colid = :colid"),
    @NamedQuery(name = "Syscolumns.findByXoffset", query = "SELECT s FROM Syscolumns s WHERE s.xoffset = :xoffset"),
    @NamedQuery(name = "Syscolumns.findByBitpos", query = "SELECT s FROM Syscolumns s WHERE s.bitpos = :bitpos"),
    @NamedQuery(name = "Syscolumns.findByReserved", query = "SELECT s FROM Syscolumns s WHERE s.reserved = :reserved"),
    @NamedQuery(name = "Syscolumns.findByColstat", query = "SELECT s FROM Syscolumns s WHERE s.colstat = :colstat"),
    @NamedQuery(name = "Syscolumns.findByCdefault", query = "SELECT s FROM Syscolumns s WHERE s.cdefault = :cdefault"),
    @NamedQuery(name = "Syscolumns.findByDomain", query = "SELECT s FROM Syscolumns s WHERE s.domain = :domain"),
    @NamedQuery(name = "Syscolumns.findByNumber", query = "SELECT s FROM Syscolumns s WHERE s.number = :number"),
    @NamedQuery(name = "Syscolumns.findByColorder", query = "SELECT s FROM Syscolumns s WHERE s.colorder = :colorder"),
    @NamedQuery(name = "Syscolumns.findByOffset", query = "SELECT s FROM Syscolumns s WHERE s.offset = :offset"),
    @NamedQuery(name = "Syscolumns.findByCollationid", query = "SELECT s FROM Syscolumns s WHERE s.collationid = :collationid"),
    @NamedQuery(name = "Syscolumns.findByLanguage", query = "SELECT s FROM Syscolumns s WHERE s.language = :language"),
    @NamedQuery(name = "Syscolumns.findByStatus", query = "SELECT s FROM Syscolumns s WHERE s.status = :status"),
    @NamedQuery(name = "Syscolumns.findByType", query = "SELECT s FROM Syscolumns s WHERE s.type = :type"),
    @NamedQuery(name = "Syscolumns.findByUsertype", query = "SELECT s FROM Syscolumns s WHERE s.usertype = :usertype"),
    @NamedQuery(name = "Syscolumns.findByPrintfmt", query = "SELECT s FROM Syscolumns s WHERE s.printfmt = :printfmt"),
    @NamedQuery(name = "Syscolumns.findByPrec", query = "SELECT s FROM Syscolumns s WHERE s.prec = :prec"),
    @NamedQuery(name = "Syscolumns.findByScale", query = "SELECT s FROM Syscolumns s WHERE s.scale = :scale"),
    @NamedQuery(name = "Syscolumns.findByIscomputed", query = "SELECT s FROM Syscolumns s WHERE s.iscomputed = :iscomputed"),
    @NamedQuery(name = "Syscolumns.findByIsoutparam", query = "SELECT s FROM Syscolumns s WHERE s.isoutparam = :isoutparam"),
    @NamedQuery(name = "Syscolumns.findByIsnullable", query = "SELECT s FROM Syscolumns s WHERE s.isnullable = :isnullable"),
    @NamedQuery(name = "Syscolumns.findByCollation", query = "SELECT s FROM Syscolumns s WHERE s.collation = :collation")})
public class Syscolumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtype")
    private short xtype;
    @Column(name = "typestat")
    private Short typestat;
    @Column(name = "xusertype")
    private Short xusertype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "length")
    private short length;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xprec")
    private short xprec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xscale")
    private short xscale;
    @Column(name = "colid")
    private Short colid;
    @Column(name = "xoffset")
    private Short xoffset;
    @Column(name = "bitpos")
    private Short bitpos;
    @Column(name = "reserved")
    private Short reserved;
    @Column(name = "colstat")
    private Short colstat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cdefault")
    private int cdefault;
    @Basic(optional = false)
    @NotNull
    @Column(name = "domain")
    private int domain;
    @Column(name = "number")
    private Short number;
    @Column(name = "colorder")
    private Short colorder;
    @Lob
    @Column(name = "autoval")
    private byte[] autoval;
    @Column(name = "offset")
    private Short offset;
    @Column(name = "collationid")
    private Integer collationid;
    @Column(name = "language")
    private Integer language;
    @Column(name = "status")
    private Short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Column(name = "usertype")
    private Short usertype;
    @Size(max = 255)
    @Column(name = "printfmt")
    private String printfmt;
    @Column(name = "prec")
    private Short prec;
    @Column(name = "scale")
    private Integer scale;
    @Column(name = "iscomputed")
    private Integer iscomputed;
    @Column(name = "isoutparam")
    private Integer isoutparam;
    @Column(name = "isnullable")
    private Integer isnullable;
    @Size(max = 128)
    @Column(name = "collation")
    private String collation;
    @Lob
    @Column(name = "tdscollation")
    private byte[] tdscollation;

    public Syscolumns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getXtype() {
        return xtype;
    }

    public void setXtype(short xtype) {
        this.xtype = xtype;
    }

    public Short getTypestat() {
        return typestat;
    }

    public void setTypestat(Short typestat) {
        this.typestat = typestat;
    }

    public Short getXusertype() {
        return xusertype;
    }

    public void setXusertype(Short xusertype) {
        this.xusertype = xusertype;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public short getXprec() {
        return xprec;
    }

    public void setXprec(short xprec) {
        this.xprec = xprec;
    }

    public short getXscale() {
        return xscale;
    }

    public void setXscale(short xscale) {
        this.xscale = xscale;
    }

    public Short getColid() {
        return colid;
    }

    public void setColid(Short colid) {
        this.colid = colid;
    }

    public Short getXoffset() {
        return xoffset;
    }

    public void setXoffset(Short xoffset) {
        this.xoffset = xoffset;
    }

    public Short getBitpos() {
        return bitpos;
    }

    public void setBitpos(Short bitpos) {
        this.bitpos = bitpos;
    }

    public Short getReserved() {
        return reserved;
    }

    public void setReserved(Short reserved) {
        this.reserved = reserved;
    }

    public Short getColstat() {
        return colstat;
    }

    public void setColstat(Short colstat) {
        this.colstat = colstat;
    }

    public int getCdefault() {
        return cdefault;
    }

    public void setCdefault(int cdefault) {
        this.cdefault = cdefault;
    }

    public int getDomain() {
        return domain;
    }

    public void setDomain(int domain) {
        this.domain = domain;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Short getColorder() {
        return colorder;
    }

    public void setColorder(Short colorder) {
        this.colorder = colorder;
    }

    public byte[] getAutoval() {
        return autoval;
    }

    public void setAutoval(byte[] autoval) {
        this.autoval = autoval;
    }

    public Short getOffset() {
        return offset;
    }

    public void setOffset(Short offset) {
        this.offset = offset;
    }

    public Integer getCollationid() {
        return collationid;
    }

    public void setCollationid(Integer collationid) {
        this.collationid = collationid;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    public String getPrintfmt() {
        return printfmt;
    }

    public void setPrintfmt(String printfmt) {
        this.printfmt = printfmt;
    }

    public Short getPrec() {
        return prec;
    }

    public void setPrec(Short prec) {
        this.prec = prec;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getIscomputed() {
        return iscomputed;
    }

    public void setIscomputed(Integer iscomputed) {
        this.iscomputed = iscomputed;
    }

    public Integer getIsoutparam() {
        return isoutparam;
    }

    public void setIsoutparam(Integer isoutparam) {
        this.isoutparam = isoutparam;
    }

    public Integer getIsnullable() {
        return isnullable;
    }

    public void setIsnullable(Integer isnullable) {
        this.isnullable = isnullable;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public byte[] getTdscollation() {
        return tdscollation;
    }

    public void setTdscollation(byte[] tdscollation) {
        this.tdscollation = tdscollation;
    }
    
}
