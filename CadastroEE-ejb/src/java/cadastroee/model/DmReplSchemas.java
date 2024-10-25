/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_repl_schemas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmReplSchemas.findAll", query = "SELECT d FROM DmReplSchemas d"),
    @NamedQuery(name = "DmReplSchemas.findByTabid", query = "SELECT d FROM DmReplSchemas d WHERE d.tabid = :tabid"),
    @NamedQuery(name = "DmReplSchemas.findByIndexid", query = "SELECT d FROM DmReplSchemas d WHERE d.indexid = :indexid"),
    @NamedQuery(name = "DmReplSchemas.findByIdSch", query = "SELECT d FROM DmReplSchemas d WHERE d.idSch = :idSch"),
    @NamedQuery(name = "DmReplSchemas.findByTabschema", query = "SELECT d FROM DmReplSchemas d WHERE d.tabschema = :tabschema"),
    @NamedQuery(name = "DmReplSchemas.findByCcTabschema", query = "SELECT d FROM DmReplSchemas d WHERE d.ccTabschema = :ccTabschema"),
    @NamedQuery(name = "DmReplSchemas.findByTabname", query = "SELECT d FROM DmReplSchemas d WHERE d.tabname = :tabname"),
    @NamedQuery(name = "DmReplSchemas.findByCcTabname", query = "SELECT d FROM DmReplSchemas d WHERE d.ccTabname = :ccTabname"),
    @NamedQuery(name = "DmReplSchemas.findByRowsetidDelete", query = "SELECT d FROM DmReplSchemas d WHERE d.rowsetidDelete = :rowsetidDelete"),
    @NamedQuery(name = "DmReplSchemas.findByRowsetidInsert", query = "SELECT d FROM DmReplSchemas d WHERE d.rowsetidInsert = :rowsetidInsert"),
    @NamedQuery(name = "DmReplSchemas.findByNumPkCols", query = "SELECT d FROM DmReplSchemas d WHERE d.numPkCols = :numPkCols"),
    @NamedQuery(name = "DmReplSchemas.findByReNumtextcols", query = "SELECT d FROM DmReplSchemas d WHERE d.reNumtextcols = :reNumtextcols"),
    @NamedQuery(name = "DmReplSchemas.findByReSchemaLsnBegin", query = "SELECT d FROM DmReplSchemas d WHERE d.reSchemaLsnBegin = :reSchemaLsnBegin"),
    @NamedQuery(name = "DmReplSchemas.findByReSchemaLsnEnd", query = "SELECT d FROM DmReplSchemas d WHERE d.reSchemaLsnEnd = :reSchemaLsnEnd"),
    @NamedQuery(name = "DmReplSchemas.findByReNumcols", query = "SELECT d FROM DmReplSchemas d WHERE d.reNumcols = :reNumcols"),
    @NamedQuery(name = "DmReplSchemas.findByReColid", query = "SELECT d FROM DmReplSchemas d WHERE d.reColid = :reColid"),
    @NamedQuery(name = "DmReplSchemas.findByReawcName", query = "SELECT d FROM DmReplSchemas d WHERE d.reawcName = :reawcName"),
    @NamedQuery(name = "DmReplSchemas.findByReccName", query = "SELECT d FROM DmReplSchemas d WHERE d.reccName = :reccName"),
    @NamedQuery(name = "DmReplSchemas.findByReColattr", query = "SELECT d FROM DmReplSchemas d WHERE d.reColattr = :reColattr"),
    @NamedQuery(name = "DmReplSchemas.findByReMaxlen", query = "SELECT d FROM DmReplSchemas d WHERE d.reMaxlen = :reMaxlen"),
    @NamedQuery(name = "DmReplSchemas.findByRePrec", query = "SELECT d FROM DmReplSchemas d WHERE d.rePrec = :rePrec"),
    @NamedQuery(name = "DmReplSchemas.findByReScale", query = "SELECT d FROM DmReplSchemas d WHERE d.reScale = :reScale"),
    @NamedQuery(name = "DmReplSchemas.findByReCollatid", query = "SELECT d FROM DmReplSchemas d WHERE d.reCollatid = :reCollatid"),
    @NamedQuery(name = "DmReplSchemas.findByReXvtype", query = "SELECT d FROM DmReplSchemas d WHERE d.reXvtype = :reXvtype"),
    @NamedQuery(name = "DmReplSchemas.findByReOffset", query = "SELECT d FROM DmReplSchemas d WHERE d.reOffset = :reOffset"),
    @NamedQuery(name = "DmReplSchemas.findByReBitpos", query = "SELECT d FROM DmReplSchemas d WHERE d.reBitpos = :reBitpos"),
    @NamedQuery(name = "DmReplSchemas.findByRefNullable", query = "SELECT d FROM DmReplSchemas d WHERE d.refNullable = :refNullable"),
    @NamedQuery(name = "DmReplSchemas.findByRefAnsiTrim", query = "SELECT d FROM DmReplSchemas d WHERE d.refAnsiTrim = :refAnsiTrim"),
    @NamedQuery(name = "DmReplSchemas.findByReComputed", query = "SELECT d FROM DmReplSchemas d WHERE d.reComputed = :reComputed"),
    @NamedQuery(name = "DmReplSchemas.findBySeRowsetid", query = "SELECT d FROM DmReplSchemas d WHERE d.seRowsetid = :seRowsetid"),
    @NamedQuery(name = "DmReplSchemas.findBySeSchemaLsnBegin", query = "SELECT d FROM DmReplSchemas d WHERE d.seSchemaLsnBegin = :seSchemaLsnBegin"),
    @NamedQuery(name = "DmReplSchemas.findBySeSchemaLsnEnd", query = "SELECT d FROM DmReplSchemas d WHERE d.seSchemaLsnEnd = :seSchemaLsnEnd"),
    @NamedQuery(name = "DmReplSchemas.findBySeNumcols", query = "SELECT d FROM DmReplSchemas d WHERE d.seNumcols = :seNumcols"),
    @NamedQuery(name = "DmReplSchemas.findBySeColid", query = "SELECT d FROM DmReplSchemas d WHERE d.seColid = :seColid"),
    @NamedQuery(name = "DmReplSchemas.findBySeMaxlen", query = "SELECT d FROM DmReplSchemas d WHERE d.seMaxlen = :seMaxlen"),
    @NamedQuery(name = "DmReplSchemas.findBySePrec", query = "SELECT d FROM DmReplSchemas d WHERE d.sePrec = :sePrec"),
    @NamedQuery(name = "DmReplSchemas.findBySeScale", query = "SELECT d FROM DmReplSchemas d WHERE d.seScale = :seScale"),
    @NamedQuery(name = "DmReplSchemas.findBySeCollatid", query = "SELECT d FROM DmReplSchemas d WHERE d.seCollatid = :seCollatid"),
    @NamedQuery(name = "DmReplSchemas.findBySeXvtype", query = "SELECT d FROM DmReplSchemas d WHERE d.seXvtype = :seXvtype"),
    @NamedQuery(name = "DmReplSchemas.findBySeOffset", query = "SELECT d FROM DmReplSchemas d WHERE d.seOffset = :seOffset"),
    @NamedQuery(name = "DmReplSchemas.findBySeBitpos", query = "SELECT d FROM DmReplSchemas d WHERE d.seBitpos = :seBitpos"),
    @NamedQuery(name = "DmReplSchemas.findBySefNullable", query = "SELECT d FROM DmReplSchemas d WHERE d.sefNullable = :sefNullable"),
    @NamedQuery(name = "DmReplSchemas.findBySefAnsiTrim", query = "SELECT d FROM DmReplSchemas d WHERE d.sefAnsiTrim = :sefAnsiTrim"),
    @NamedQuery(name = "DmReplSchemas.findBySeComputed", query = "SELECT d FROM DmReplSchemas d WHERE d.seComputed = :seComputed"),
    @NamedQuery(name = "DmReplSchemas.findBySenullBitInLeafRows", query = "SELECT d FROM DmReplSchemas d WHERE d.senullBitInLeafRows = :senullBitInLeafRows")})
public class DmReplSchemas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "artcache_schema_address")
    private byte[] artcacheSchemaAddress;
    @Column(name = "tabid")
    private Integer tabid;
    @Column(name = "indexid")
    private Short indexid;
    @Column(name = "idSch")
    private Integer idSch;
    @Size(max = 256)
    @Column(name = "tabschema")
    private String tabschema;
    @Column(name = "ccTabschema")
    private Short ccTabschema;
    @Size(max = 256)
    @Column(name = "tabname")
    private String tabname;
    @Column(name = "ccTabname")
    private Short ccTabname;
    @Column(name = "rowsetid_delete")
    private BigInteger rowsetidDelete;
    @Column(name = "rowsetid_insert")
    private BigInteger rowsetidInsert;
    @Column(name = "num_pk_cols")
    private Integer numPkCols;
    @Lob
    @Column(name = "pcitee")
    private byte[] pcitee;
    @Column(name = "re_numtextcols")
    private Integer reNumtextcols;
    @Size(max = 24)
    @Column(name = "re_schema_lsn_begin")
    private String reSchemaLsnBegin;
    @Size(max = 24)
    @Column(name = "re_schema_lsn_end")
    private String reSchemaLsnEnd;
    @Column(name = "re_numcols")
    private Integer reNumcols;
    @Column(name = "re_colid")
    private Integer reColid;
    @Size(max = 256)
    @Column(name = "re_awcName")
    private String reawcName;
    @Column(name = "re_ccName")
    private Short reccName;
    @Column(name = "re_colattr")
    private Short reColattr;
    @Column(name = "re_maxlen")
    private Short reMaxlen;
    @Column(name = "re_prec")
    private Short rePrec;
    @Column(name = "re_scale")
    private Short reScale;
    @Column(name = "re_collatid")
    private Integer reCollatid;
    @Column(name = "re_xvtype")
    private Short reXvtype;
    @Column(name = "re_offset")
    private Integer reOffset;
    @Column(name = "re_bitpos")
    private Short reBitpos;
    @Column(name = "re_fNullable")
    private Short refNullable;
    @Column(name = "re_fAnsiTrim")
    private Short refAnsiTrim;
    @Column(name = "re_computed")
    private Integer reComputed;
    @Column(name = "se_rowsetid")
    private BigInteger seRowsetid;
    @Size(max = 24)
    @Column(name = "se_schema_lsn_begin")
    private String seSchemaLsnBegin;
    @Size(max = 24)
    @Column(name = "se_schema_lsn_end")
    private String seSchemaLsnEnd;
    @Column(name = "se_numcols")
    private Integer seNumcols;
    @Column(name = "se_colid")
    private Integer seColid;
    @Column(name = "se_maxlen")
    private Short seMaxlen;
    @Column(name = "se_prec")
    private Short sePrec;
    @Column(name = "se_scale")
    private Short seScale;
    @Column(name = "se_collatid")
    private Integer seCollatid;
    @Column(name = "se_xvtype")
    private Short seXvtype;
    @Column(name = "se_offset")
    private Integer seOffset;
    @Column(name = "se_bitpos")
    private Short seBitpos;
    @Column(name = "se_fNullable")
    private Short sefNullable;
    @Column(name = "se_fAnsiTrim")
    private Short sefAnsiTrim;
    @Column(name = "se_computed")
    private Short seComputed;
    @Column(name = "se_nullBitInLeafRows")
    private Short senullBitInLeafRows;

    public DmReplSchemas() {
    }

    public byte[] getArtcacheSchemaAddress() {
        return artcacheSchemaAddress;
    }

    public void setArtcacheSchemaAddress(byte[] artcacheSchemaAddress) {
        this.artcacheSchemaAddress = artcacheSchemaAddress;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Short getIndexid() {
        return indexid;
    }

    public void setIndexid(Short indexid) {
        this.indexid = indexid;
    }

    public Integer getIdSch() {
        return idSch;
    }

    public void setIdSch(Integer idSch) {
        this.idSch = idSch;
    }

    public String getTabschema() {
        return tabschema;
    }

    public void setTabschema(String tabschema) {
        this.tabschema = tabschema;
    }

    public Short getCcTabschema() {
        return ccTabschema;
    }

    public void setCcTabschema(Short ccTabschema) {
        this.ccTabschema = ccTabschema;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public Short getCcTabname() {
        return ccTabname;
    }

    public void setCcTabname(Short ccTabname) {
        this.ccTabname = ccTabname;
    }

    public BigInteger getRowsetidDelete() {
        return rowsetidDelete;
    }

    public void setRowsetidDelete(BigInteger rowsetidDelete) {
        this.rowsetidDelete = rowsetidDelete;
    }

    public BigInteger getRowsetidInsert() {
        return rowsetidInsert;
    }

    public void setRowsetidInsert(BigInteger rowsetidInsert) {
        this.rowsetidInsert = rowsetidInsert;
    }

    public Integer getNumPkCols() {
        return numPkCols;
    }

    public void setNumPkCols(Integer numPkCols) {
        this.numPkCols = numPkCols;
    }

    public byte[] getPcitee() {
        return pcitee;
    }

    public void setPcitee(byte[] pcitee) {
        this.pcitee = pcitee;
    }

    public Integer getReNumtextcols() {
        return reNumtextcols;
    }

    public void setReNumtextcols(Integer reNumtextcols) {
        this.reNumtextcols = reNumtextcols;
    }

    public String getReSchemaLsnBegin() {
        return reSchemaLsnBegin;
    }

    public void setReSchemaLsnBegin(String reSchemaLsnBegin) {
        this.reSchemaLsnBegin = reSchemaLsnBegin;
    }

    public String getReSchemaLsnEnd() {
        return reSchemaLsnEnd;
    }

    public void setReSchemaLsnEnd(String reSchemaLsnEnd) {
        this.reSchemaLsnEnd = reSchemaLsnEnd;
    }

    public Integer getReNumcols() {
        return reNumcols;
    }

    public void setReNumcols(Integer reNumcols) {
        this.reNumcols = reNumcols;
    }

    public Integer getReColid() {
        return reColid;
    }

    public void setReColid(Integer reColid) {
        this.reColid = reColid;
    }

    public String getReawcName() {
        return reawcName;
    }

    public void setReawcName(String reawcName) {
        this.reawcName = reawcName;
    }

    public Short getReccName() {
        return reccName;
    }

    public void setReccName(Short reccName) {
        this.reccName = reccName;
    }

    public Short getReColattr() {
        return reColattr;
    }

    public void setReColattr(Short reColattr) {
        this.reColattr = reColattr;
    }

    public Short getReMaxlen() {
        return reMaxlen;
    }

    public void setReMaxlen(Short reMaxlen) {
        this.reMaxlen = reMaxlen;
    }

    public Short getRePrec() {
        return rePrec;
    }

    public void setRePrec(Short rePrec) {
        this.rePrec = rePrec;
    }

    public Short getReScale() {
        return reScale;
    }

    public void setReScale(Short reScale) {
        this.reScale = reScale;
    }

    public Integer getReCollatid() {
        return reCollatid;
    }

    public void setReCollatid(Integer reCollatid) {
        this.reCollatid = reCollatid;
    }

    public Short getReXvtype() {
        return reXvtype;
    }

    public void setReXvtype(Short reXvtype) {
        this.reXvtype = reXvtype;
    }

    public Integer getReOffset() {
        return reOffset;
    }

    public void setReOffset(Integer reOffset) {
        this.reOffset = reOffset;
    }

    public Short getReBitpos() {
        return reBitpos;
    }

    public void setReBitpos(Short reBitpos) {
        this.reBitpos = reBitpos;
    }

    public Short getRefNullable() {
        return refNullable;
    }

    public void setRefNullable(Short refNullable) {
        this.refNullable = refNullable;
    }

    public Short getRefAnsiTrim() {
        return refAnsiTrim;
    }

    public void setRefAnsiTrim(Short refAnsiTrim) {
        this.refAnsiTrim = refAnsiTrim;
    }

    public Integer getReComputed() {
        return reComputed;
    }

    public void setReComputed(Integer reComputed) {
        this.reComputed = reComputed;
    }

    public BigInteger getSeRowsetid() {
        return seRowsetid;
    }

    public void setSeRowsetid(BigInteger seRowsetid) {
        this.seRowsetid = seRowsetid;
    }

    public String getSeSchemaLsnBegin() {
        return seSchemaLsnBegin;
    }

    public void setSeSchemaLsnBegin(String seSchemaLsnBegin) {
        this.seSchemaLsnBegin = seSchemaLsnBegin;
    }

    public String getSeSchemaLsnEnd() {
        return seSchemaLsnEnd;
    }

    public void setSeSchemaLsnEnd(String seSchemaLsnEnd) {
        this.seSchemaLsnEnd = seSchemaLsnEnd;
    }

    public Integer getSeNumcols() {
        return seNumcols;
    }

    public void setSeNumcols(Integer seNumcols) {
        this.seNumcols = seNumcols;
    }

    public Integer getSeColid() {
        return seColid;
    }

    public void setSeColid(Integer seColid) {
        this.seColid = seColid;
    }

    public Short getSeMaxlen() {
        return seMaxlen;
    }

    public void setSeMaxlen(Short seMaxlen) {
        this.seMaxlen = seMaxlen;
    }

    public Short getSePrec() {
        return sePrec;
    }

    public void setSePrec(Short sePrec) {
        this.sePrec = sePrec;
    }

    public Short getSeScale() {
        return seScale;
    }

    public void setSeScale(Short seScale) {
        this.seScale = seScale;
    }

    public Integer getSeCollatid() {
        return seCollatid;
    }

    public void setSeCollatid(Integer seCollatid) {
        this.seCollatid = seCollatid;
    }

    public Short getSeXvtype() {
        return seXvtype;
    }

    public void setSeXvtype(Short seXvtype) {
        this.seXvtype = seXvtype;
    }

    public Integer getSeOffset() {
        return seOffset;
    }

    public void setSeOffset(Integer seOffset) {
        this.seOffset = seOffset;
    }

    public Short getSeBitpos() {
        return seBitpos;
    }

    public void setSeBitpos(Short seBitpos) {
        this.seBitpos = seBitpos;
    }

    public Short getSefNullable() {
        return sefNullable;
    }

    public void setSefNullable(Short sefNullable) {
        this.sefNullable = sefNullable;
    }

    public Short getSefAnsiTrim() {
        return sefAnsiTrim;
    }

    public void setSefAnsiTrim(Short sefAnsiTrim) {
        this.sefAnsiTrim = sefAnsiTrim;
    }

    public Short getSeComputed() {
        return seComputed;
    }

    public void setSeComputed(Short seComputed) {
        this.seComputed = seComputed;
    }

    public Short getSenullBitInLeafRows() {
        return senullBitInLeafRows;
    }

    public void setSenullBitInLeafRows(Short senullBitInLeafRows) {
        this.senullBitInLeafRows = senullBitInLeafRows;
    }
    
}
