/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_repl_articles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmReplArticles.findAll", query = "SELECT d FROM DmReplArticles d"),
    @NamedQuery(name = "DmReplArticles.findByArtid", query = "SELECT d FROM DmReplArticles d WHERE d.artid = :artid"),
    @NamedQuery(name = "DmReplArticles.findByArtfilter", query = "SELECT d FROM DmReplArticles d WHERE d.artfilter = :artfilter"),
    @NamedQuery(name = "DmReplArticles.findByArtobjid", query = "SELECT d FROM DmReplArticles d WHERE d.artobjid = :artobjid"),
    @NamedQuery(name = "DmReplArticles.findByArtpubid", query = "SELECT d FROM DmReplArticles d WHERE d.artpubid = :artpubid"),
    @NamedQuery(name = "DmReplArticles.findByArtstatus", query = "SELECT d FROM DmReplArticles d WHERE d.artstatus = :artstatus"),
    @NamedQuery(name = "DmReplArticles.findByArttype", query = "SELECT d FROM DmReplArticles d WHERE d.arttype = :arttype"),
    @NamedQuery(name = "DmReplArticles.findByWszArtdesttable", query = "SELECT d FROM DmReplArticles d WHERE d.wszArtdesttable = :wszArtdesttable"),
    @NamedQuery(name = "DmReplArticles.findByWszArtdesttableowner", query = "SELECT d FROM DmReplArticles d WHERE d.wszArtdesttableowner = :wszArtdesttableowner"),
    @NamedQuery(name = "DmReplArticles.findByWszArtinscmd", query = "SELECT d FROM DmReplArticles d WHERE d.wszArtinscmd = :wszArtinscmd"),
    @NamedQuery(name = "DmReplArticles.findByCmdTypeIns", query = "SELECT d FROM DmReplArticles d WHERE d.cmdTypeIns = :cmdTypeIns"),
    @NamedQuery(name = "DmReplArticles.findByWszArtdelcmd", query = "SELECT d FROM DmReplArticles d WHERE d.wszArtdelcmd = :wszArtdelcmd"),
    @NamedQuery(name = "DmReplArticles.findByCmdTypeDel", query = "SELECT d FROM DmReplArticles d WHERE d.cmdTypeDel = :cmdTypeDel"),
    @NamedQuery(name = "DmReplArticles.findByWszArtupdcmd", query = "SELECT d FROM DmReplArticles d WHERE d.wszArtupdcmd = :wszArtupdcmd"),
    @NamedQuery(name = "DmReplArticles.findByCmdTypeUpd", query = "SELECT d FROM DmReplArticles d WHERE d.cmdTypeUpd = :cmdTypeUpd"),
    @NamedQuery(name = "DmReplArticles.findByWszArtpartialupdcmd", query = "SELECT d FROM DmReplArticles d WHERE d.wszArtpartialupdcmd = :wszArtpartialupdcmd"),
    @NamedQuery(name = "DmReplArticles.findByCmdTypePartialUpd", query = "SELECT d FROM DmReplArticles d WHERE d.cmdTypePartialUpd = :cmdTypePartialUpd"),
    @NamedQuery(name = "DmReplArticles.findByNumcol", query = "SELECT d FROM DmReplArticles d WHERE d.numcol = :numcol"),
    @NamedQuery(name = "DmReplArticles.findByArtcmdtype", query = "SELECT d FROM DmReplArticles d WHERE d.artcmdtype = :artcmdtype"),
    @NamedQuery(name = "DmReplArticles.findByArtgeninscmd", query = "SELECT d FROM DmReplArticles d WHERE d.artgeninscmd = :artgeninscmd"),
    @NamedQuery(name = "DmReplArticles.findByArtgendelcmd", query = "SELECT d FROM DmReplArticles d WHERE d.artgendelcmd = :artgendelcmd"),
    @NamedQuery(name = "DmReplArticles.findByArtgenupdcmd", query = "SELECT d FROM DmReplArticles d WHERE d.artgenupdcmd = :artgenupdcmd"),
    @NamedQuery(name = "DmReplArticles.findByArtpartialupdcmd", query = "SELECT d FROM DmReplArticles d WHERE d.artpartialupdcmd = :artpartialupdcmd"),
    @NamedQuery(name = "DmReplArticles.findByArtupdtxtcmd", query = "SELECT d FROM DmReplArticles d WHERE d.artupdtxtcmd = :artupdtxtcmd"),
    @NamedQuery(name = "DmReplArticles.findByArtgenins2cmd", query = "SELECT d FROM DmReplArticles d WHERE d.artgenins2cmd = :artgenins2cmd"),
    @NamedQuery(name = "DmReplArticles.findByArtgendel2cmd", query = "SELECT d FROM DmReplArticles d WHERE d.artgendel2cmd = :artgendel2cmd"),
    @NamedQuery(name = "DmReplArticles.findByFInReconcile", query = "SELECT d FROM DmReplArticles d WHERE d.fInReconcile = :fInReconcile"),
    @NamedQuery(name = "DmReplArticles.findByFPubAllowUpdate", query = "SELECT d FROM DmReplArticles d WHERE d.fPubAllowUpdate = :fPubAllowUpdate"),
    @NamedQuery(name = "DmReplArticles.findByIntPublicationOptions", query = "SELECT d FROM DmReplArticles d WHERE d.intPublicationOptions = :intPublicationOptions")})
public class DmReplArticles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "artcache_db_address")
    private byte[] artcacheDbAddress;
    @Lob
    @Column(name = "artcache_table_address")
    private byte[] artcacheTableAddress;
    @Lob
    @Column(name = "artcache_schema_address")
    private byte[] artcacheSchemaAddress;
    @Lob
    @Column(name = "artcache_article_address")
    private byte[] artcacheArticleAddress;
    @Column(name = "artid")
    private Integer artid;
    @Column(name = "artfilter")
    private Integer artfilter;
    @Column(name = "artobjid")
    private Integer artobjid;
    @Column(name = "artpubid")
    private Integer artpubid;
    @Column(name = "artstatus")
    private Short artstatus;
    @Column(name = "arttype")
    private Short arttype;
    @Size(max = 256)
    @Column(name = "wszArtdesttable")
    private String wszArtdesttable;
    @Size(max = 256)
    @Column(name = "wszArtdesttableowner")
    private String wszArtdesttableowner;
    @Size(max = 258)
    @Column(name = "wszArtinscmd")
    private String wszArtinscmd;
    @Column(name = "cmdTypeIns")
    private Integer cmdTypeIns;
    @Size(max = 258)
    @Column(name = "wszArtdelcmd")
    private String wszArtdelcmd;
    @Column(name = "cmdTypeDel")
    private Integer cmdTypeDel;
    @Size(max = 258)
    @Column(name = "wszArtupdcmd")
    private String wszArtupdcmd;
    @Column(name = "cmdTypeUpd")
    private Integer cmdTypeUpd;
    @Size(max = 258)
    @Column(name = "wszArtpartialupdcmd")
    private String wszArtpartialupdcmd;
    @Column(name = "cmdTypePartialUpd")
    private Integer cmdTypePartialUpd;
    @Column(name = "numcol")
    private Integer numcol;
    @Column(name = "artcmdtype")
    private Short artcmdtype;
    @Size(max = 4000)
    @Column(name = "artgeninscmd")
    private String artgeninscmd;
    @Size(max = 4000)
    @Column(name = "artgendelcmd")
    private String artgendelcmd;
    @Size(max = 4000)
    @Column(name = "artgenupdcmd")
    private String artgenupdcmd;
    @Size(max = 4000)
    @Column(name = "artpartialupdcmd")
    private String artpartialupdcmd;
    @Size(max = 4000)
    @Column(name = "artupdtxtcmd")
    private String artupdtxtcmd;
    @Size(max = 4000)
    @Column(name = "artgenins2cmd")
    private String artgenins2cmd;
    @Size(max = 4000)
    @Column(name = "artgendel2cmd")
    private String artgendel2cmd;
    @Column(name = "fInReconcile")
    private Short fInReconcile;
    @Column(name = "fPubAllowUpdate")
    private Short fPubAllowUpdate;
    @Column(name = "intPublicationOptions")
    private Integer intPublicationOptions;

    public DmReplArticles() {
    }

    public byte[] getArtcacheDbAddress() {
        return artcacheDbAddress;
    }

    public void setArtcacheDbAddress(byte[] artcacheDbAddress) {
        this.artcacheDbAddress = artcacheDbAddress;
    }

    public byte[] getArtcacheTableAddress() {
        return artcacheTableAddress;
    }

    public void setArtcacheTableAddress(byte[] artcacheTableAddress) {
        this.artcacheTableAddress = artcacheTableAddress;
    }

    public byte[] getArtcacheSchemaAddress() {
        return artcacheSchemaAddress;
    }

    public void setArtcacheSchemaAddress(byte[] artcacheSchemaAddress) {
        this.artcacheSchemaAddress = artcacheSchemaAddress;
    }

    public byte[] getArtcacheArticleAddress() {
        return artcacheArticleAddress;
    }

    public void setArtcacheArticleAddress(byte[] artcacheArticleAddress) {
        this.artcacheArticleAddress = artcacheArticleAddress;
    }

    public Integer getArtid() {
        return artid;
    }

    public void setArtid(Integer artid) {
        this.artid = artid;
    }

    public Integer getArtfilter() {
        return artfilter;
    }

    public void setArtfilter(Integer artfilter) {
        this.artfilter = artfilter;
    }

    public Integer getArtobjid() {
        return artobjid;
    }

    public void setArtobjid(Integer artobjid) {
        this.artobjid = artobjid;
    }

    public Integer getArtpubid() {
        return artpubid;
    }

    public void setArtpubid(Integer artpubid) {
        this.artpubid = artpubid;
    }

    public Short getArtstatus() {
        return artstatus;
    }

    public void setArtstatus(Short artstatus) {
        this.artstatus = artstatus;
    }

    public Short getArttype() {
        return arttype;
    }

    public void setArttype(Short arttype) {
        this.arttype = arttype;
    }

    public String getWszArtdesttable() {
        return wszArtdesttable;
    }

    public void setWszArtdesttable(String wszArtdesttable) {
        this.wszArtdesttable = wszArtdesttable;
    }

    public String getWszArtdesttableowner() {
        return wszArtdesttableowner;
    }

    public void setWszArtdesttableowner(String wszArtdesttableowner) {
        this.wszArtdesttableowner = wszArtdesttableowner;
    }

    public String getWszArtinscmd() {
        return wszArtinscmd;
    }

    public void setWszArtinscmd(String wszArtinscmd) {
        this.wszArtinscmd = wszArtinscmd;
    }

    public Integer getCmdTypeIns() {
        return cmdTypeIns;
    }

    public void setCmdTypeIns(Integer cmdTypeIns) {
        this.cmdTypeIns = cmdTypeIns;
    }

    public String getWszArtdelcmd() {
        return wszArtdelcmd;
    }

    public void setWszArtdelcmd(String wszArtdelcmd) {
        this.wszArtdelcmd = wszArtdelcmd;
    }

    public Integer getCmdTypeDel() {
        return cmdTypeDel;
    }

    public void setCmdTypeDel(Integer cmdTypeDel) {
        this.cmdTypeDel = cmdTypeDel;
    }

    public String getWszArtupdcmd() {
        return wszArtupdcmd;
    }

    public void setWszArtupdcmd(String wszArtupdcmd) {
        this.wszArtupdcmd = wszArtupdcmd;
    }

    public Integer getCmdTypeUpd() {
        return cmdTypeUpd;
    }

    public void setCmdTypeUpd(Integer cmdTypeUpd) {
        this.cmdTypeUpd = cmdTypeUpd;
    }

    public String getWszArtpartialupdcmd() {
        return wszArtpartialupdcmd;
    }

    public void setWszArtpartialupdcmd(String wszArtpartialupdcmd) {
        this.wszArtpartialupdcmd = wszArtpartialupdcmd;
    }

    public Integer getCmdTypePartialUpd() {
        return cmdTypePartialUpd;
    }

    public void setCmdTypePartialUpd(Integer cmdTypePartialUpd) {
        this.cmdTypePartialUpd = cmdTypePartialUpd;
    }

    public Integer getNumcol() {
        return numcol;
    }

    public void setNumcol(Integer numcol) {
        this.numcol = numcol;
    }

    public Short getArtcmdtype() {
        return artcmdtype;
    }

    public void setArtcmdtype(Short artcmdtype) {
        this.artcmdtype = artcmdtype;
    }

    public String getArtgeninscmd() {
        return artgeninscmd;
    }

    public void setArtgeninscmd(String artgeninscmd) {
        this.artgeninscmd = artgeninscmd;
    }

    public String getArtgendelcmd() {
        return artgendelcmd;
    }

    public void setArtgendelcmd(String artgendelcmd) {
        this.artgendelcmd = artgendelcmd;
    }

    public String getArtgenupdcmd() {
        return artgenupdcmd;
    }

    public void setArtgenupdcmd(String artgenupdcmd) {
        this.artgenupdcmd = artgenupdcmd;
    }

    public String getArtpartialupdcmd() {
        return artpartialupdcmd;
    }

    public void setArtpartialupdcmd(String artpartialupdcmd) {
        this.artpartialupdcmd = artpartialupdcmd;
    }

    public String getArtupdtxtcmd() {
        return artupdtxtcmd;
    }

    public void setArtupdtxtcmd(String artupdtxtcmd) {
        this.artupdtxtcmd = artupdtxtcmd;
    }

    public String getArtgenins2cmd() {
        return artgenins2cmd;
    }

    public void setArtgenins2cmd(String artgenins2cmd) {
        this.artgenins2cmd = artgenins2cmd;
    }

    public String getArtgendel2cmd() {
        return artgendel2cmd;
    }

    public void setArtgendel2cmd(String artgendel2cmd) {
        this.artgendel2cmd = artgendel2cmd;
    }

    public Short getFInReconcile() {
        return fInReconcile;
    }

    public void setFInReconcile(Short fInReconcile) {
        this.fInReconcile = fInReconcile;
    }

    public Short getFPubAllowUpdate() {
        return fPubAllowUpdate;
    }

    public void setFPubAllowUpdate(Short fPubAllowUpdate) {
        this.fPubAllowUpdate = fPubAllowUpdate;
    }

    public Integer getIntPublicationOptions() {
        return intPublicationOptions;
    }

    public void setIntPublicationOptions(Integer intPublicationOptions) {
        this.intPublicationOptions = intPublicationOptions;
    }
    
}
