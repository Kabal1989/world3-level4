/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_repl_traninfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmReplTraninfo.findAll", query = "SELECT d FROM DmReplTraninfo d"),
    @NamedQuery(name = "DmReplTraninfo.findByFp2pPubExists", query = "SELECT d FROM DmReplTraninfo d WHERE d.fp2pPubExists = :fp2pPubExists"),
    @NamedQuery(name = "DmReplTraninfo.findByDbVer", query = "SELECT d FROM DmReplTraninfo d WHERE d.dbVer = :dbVer"),
    @NamedQuery(name = "DmReplTraninfo.findByBeginLsn", query = "SELECT d FROM DmReplTraninfo d WHERE d.beginLsn = :beginLsn"),
    @NamedQuery(name = "DmReplTraninfo.findByCommitLsn", query = "SELECT d FROM DmReplTraninfo d WHERE d.commitLsn = :commitLsn"),
    @NamedQuery(name = "DmReplTraninfo.findByDbid", query = "SELECT d FROM DmReplTraninfo d WHERE d.dbid = :dbid"),
    @NamedQuery(name = "DmReplTraninfo.findByRows", query = "SELECT d FROM DmReplTraninfo d WHERE d.rows = :rows"),
    @NamedQuery(name = "DmReplTraninfo.findByXdesid", query = "SELECT d FROM DmReplTraninfo d WHERE d.xdesid = :xdesid"),
    @NamedQuery(name = "DmReplTraninfo.findByServer", query = "SELECT d FROM DmReplTraninfo d WHERE d.server = :server"),
    @NamedQuery(name = "DmReplTraninfo.findByServerLenInBytes", query = "SELECT d FROM DmReplTraninfo d WHERE d.serverLenInBytes = :serverLenInBytes"),
    @NamedQuery(name = "DmReplTraninfo.findByDatabase", query = "SELECT d FROM DmReplTraninfo d WHERE d.database = :database"),
    @NamedQuery(name = "DmReplTraninfo.findByDbLenInBytes", query = "SELECT d FROM DmReplTraninfo d WHERE d.dbLenInBytes = :dbLenInBytes"),
    @NamedQuery(name = "DmReplTraninfo.findByOriginator", query = "SELECT d FROM DmReplTraninfo d WHERE d.originator = :originator"),
    @NamedQuery(name = "DmReplTraninfo.findByOriginatorLenInBytes", query = "SELECT d FROM DmReplTraninfo d WHERE d.originatorLenInBytes = :originatorLenInBytes"),
    @NamedQuery(name = "DmReplTraninfo.findByOrigDb", query = "SELECT d FROM DmReplTraninfo d WHERE d.origDb = :origDb"),
    @NamedQuery(name = "DmReplTraninfo.findByOrigDbLenInBytes", query = "SELECT d FROM DmReplTraninfo d WHERE d.origDbLenInBytes = :origDbLenInBytes"),
    @NamedQuery(name = "DmReplTraninfo.findByCmdsInTran", query = "SELECT d FROM DmReplTraninfo d WHERE d.cmdsInTran = :cmdsInTran"),
    @NamedQuery(name = "DmReplTraninfo.findByIsBoundedupdateSingleton", query = "SELECT d FROM DmReplTraninfo d WHERE d.isBoundedupdateSingleton = :isBoundedupdateSingleton"),
    @NamedQuery(name = "DmReplTraninfo.findByBeginUpdateLsn", query = "SELECT d FROM DmReplTraninfo d WHERE d.beginUpdateLsn = :beginUpdateLsn"),
    @NamedQuery(name = "DmReplTraninfo.findByDeleteLsn", query = "SELECT d FROM DmReplTraninfo d WHERE d.deleteLsn = :deleteLsn"),
    @NamedQuery(name = "DmReplTraninfo.findByLastEndLsn", query = "SELECT d FROM DmReplTraninfo d WHERE d.lastEndLsn = :lastEndLsn"),
    @NamedQuery(name = "DmReplTraninfo.findByFcomplete", query = "SELECT d FROM DmReplTraninfo d WHERE d.fcomplete = :fcomplete"),
    @NamedQuery(name = "DmReplTraninfo.findByFcompensated", query = "SELECT d FROM DmReplTraninfo d WHERE d.fcompensated = :fcompensated"),
    @NamedQuery(name = "DmReplTraninfo.findByFprocessingtext", query = "SELECT d FROM DmReplTraninfo d WHERE d.fprocessingtext = :fprocessingtext"),
    @NamedQuery(name = "DmReplTraninfo.findByMaxCmdsInTran", query = "SELECT d FROM DmReplTraninfo d WHERE d.maxCmdsInTran = :maxCmdsInTran"),
    @NamedQuery(name = "DmReplTraninfo.findByBeginTime", query = "SELECT d FROM DmReplTraninfo d WHERE d.beginTime = :beginTime"),
    @NamedQuery(name = "DmReplTraninfo.findByCommitTime", query = "SELECT d FROM DmReplTraninfo d WHERE d.commitTime = :commitTime"),
    @NamedQuery(name = "DmReplTraninfo.findBySessionId", query = "SELECT d FROM DmReplTraninfo d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmReplTraninfo.findBySessionPhase", query = "SELECT d FROM DmReplTraninfo d WHERE d.sessionPhase = :sessionPhase"),
    @NamedQuery(name = "DmReplTraninfo.findByIsKnownCdcTran", query = "SELECT d FROM DmReplTraninfo d WHERE d.isKnownCdcTran = :isKnownCdcTran"),
    @NamedQuery(name = "DmReplTraninfo.findByErrorCount", query = "SELECT d FROM DmReplTraninfo d WHERE d.errorCount = :errorCount")})
public class DmReplTraninfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "fp2p_pub_exists")
    private Short fp2pPubExists;
    @Column(name = "db_ver")
    private Integer dbVer;
    @Lob
    @Column(name = "comp_range_address")
    private byte[] compRangeAddress;
    @Lob
    @Column(name = "textinfo_address")
    private byte[] textinfoAddress;
    @Lob
    @Column(name = "fsinfo_address")
    private byte[] fsinfoAddress;
    @Size(max = 24)
    @Column(name = "begin_lsn")
    private String beginLsn;
    @Size(max = 24)
    @Column(name = "commit_lsn")
    private String commitLsn;
    @Column(name = "dbid")
    private Short dbid;
    @Column(name = "rows")
    private Integer rows;
    @Size(max = 24)
    @Column(name = "xdesid")
    private String xdesid;
    @Lob
    @Column(name = "artcache_table_address")
    private byte[] artcacheTableAddress;
    @Size(max = 256)
    @Column(name = "server")
    private String server;
    @Column(name = "server_len_in_bytes")
    private Integer serverLenInBytes;
    @Size(max = 256)
    @Column(name = "database")
    private String database;
    @Column(name = "db_len_in_bytes")
    private Integer dbLenInBytes;
    @Size(max = 256)
    @Column(name = "originator")
    private String originator;
    @Column(name = "originator_len_in_bytes")
    private Integer originatorLenInBytes;
    @Size(max = 256)
    @Column(name = "orig_db")
    private String origDb;
    @Column(name = "orig_db_len_in_bytes")
    private Integer origDbLenInBytes;
    @Column(name = "cmds_in_tran")
    private Integer cmdsInTran;
    @Column(name = "is_boundedupdate_singleton")
    private Short isBoundedupdateSingleton;
    @Size(max = 24)
    @Column(name = "begin_update_lsn")
    private String beginUpdateLsn;
    @Size(max = 24)
    @Column(name = "delete_lsn")
    private String deleteLsn;
    @Size(max = 24)
    @Column(name = "last_end_lsn")
    private String lastEndLsn;
    @Column(name = "fcomplete")
    private Short fcomplete;
    @Column(name = "fcompensated")
    private Short fcompensated;
    @Column(name = "fprocessingtext")
    private Short fprocessingtext;
    @Column(name = "max_cmds_in_tran")
    private Integer maxCmdsInTran;
    @Column(name = "begin_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginTime;
    @Column(name = "commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commitTime;
    @Column(name = "session_id")
    private Integer sessionId;
    @Size(max = 200)
    @Column(name = "session_phase")
    private String sessionPhase;
    @Column(name = "is_known_cdc_tran")
    private Short isKnownCdcTran;
    @Column(name = "error_count")
    private Integer errorCount;

    public DmReplTraninfo() {
    }

    public Short getFp2pPubExists() {
        return fp2pPubExists;
    }

    public void setFp2pPubExists(Short fp2pPubExists) {
        this.fp2pPubExists = fp2pPubExists;
    }

    public Integer getDbVer() {
        return dbVer;
    }

    public void setDbVer(Integer dbVer) {
        this.dbVer = dbVer;
    }

    public byte[] getCompRangeAddress() {
        return compRangeAddress;
    }

    public void setCompRangeAddress(byte[] compRangeAddress) {
        this.compRangeAddress = compRangeAddress;
    }

    public byte[] getTextinfoAddress() {
        return textinfoAddress;
    }

    public void setTextinfoAddress(byte[] textinfoAddress) {
        this.textinfoAddress = textinfoAddress;
    }

    public byte[] getFsinfoAddress() {
        return fsinfoAddress;
    }

    public void setFsinfoAddress(byte[] fsinfoAddress) {
        this.fsinfoAddress = fsinfoAddress;
    }

    public String getBeginLsn() {
        return beginLsn;
    }

    public void setBeginLsn(String beginLsn) {
        this.beginLsn = beginLsn;
    }

    public String getCommitLsn() {
        return commitLsn;
    }

    public void setCommitLsn(String commitLsn) {
        this.commitLsn = commitLsn;
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getXdesid() {
        return xdesid;
    }

    public void setXdesid(String xdesid) {
        this.xdesid = xdesid;
    }

    public byte[] getArtcacheTableAddress() {
        return artcacheTableAddress;
    }

    public void setArtcacheTableAddress(byte[] artcacheTableAddress) {
        this.artcacheTableAddress = artcacheTableAddress;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getServerLenInBytes() {
        return serverLenInBytes;
    }

    public void setServerLenInBytes(Integer serverLenInBytes) {
        this.serverLenInBytes = serverLenInBytes;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Integer getDbLenInBytes() {
        return dbLenInBytes;
    }

    public void setDbLenInBytes(Integer dbLenInBytes) {
        this.dbLenInBytes = dbLenInBytes;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public Integer getOriginatorLenInBytes() {
        return originatorLenInBytes;
    }

    public void setOriginatorLenInBytes(Integer originatorLenInBytes) {
        this.originatorLenInBytes = originatorLenInBytes;
    }

    public String getOrigDb() {
        return origDb;
    }

    public void setOrigDb(String origDb) {
        this.origDb = origDb;
    }

    public Integer getOrigDbLenInBytes() {
        return origDbLenInBytes;
    }

    public void setOrigDbLenInBytes(Integer origDbLenInBytes) {
        this.origDbLenInBytes = origDbLenInBytes;
    }

    public Integer getCmdsInTran() {
        return cmdsInTran;
    }

    public void setCmdsInTran(Integer cmdsInTran) {
        this.cmdsInTran = cmdsInTran;
    }

    public Short getIsBoundedupdateSingleton() {
        return isBoundedupdateSingleton;
    }

    public void setIsBoundedupdateSingleton(Short isBoundedupdateSingleton) {
        this.isBoundedupdateSingleton = isBoundedupdateSingleton;
    }

    public String getBeginUpdateLsn() {
        return beginUpdateLsn;
    }

    public void setBeginUpdateLsn(String beginUpdateLsn) {
        this.beginUpdateLsn = beginUpdateLsn;
    }

    public String getDeleteLsn() {
        return deleteLsn;
    }

    public void setDeleteLsn(String deleteLsn) {
        this.deleteLsn = deleteLsn;
    }

    public String getLastEndLsn() {
        return lastEndLsn;
    }

    public void setLastEndLsn(String lastEndLsn) {
        this.lastEndLsn = lastEndLsn;
    }

    public Short getFcomplete() {
        return fcomplete;
    }

    public void setFcomplete(Short fcomplete) {
        this.fcomplete = fcomplete;
    }

    public Short getFcompensated() {
        return fcompensated;
    }

    public void setFcompensated(Short fcompensated) {
        this.fcompensated = fcompensated;
    }

    public Short getFprocessingtext() {
        return fprocessingtext;
    }

    public void setFprocessingtext(Short fprocessingtext) {
        this.fprocessingtext = fprocessingtext;
    }

    public Integer getMaxCmdsInTran() {
        return maxCmdsInTran;
    }

    public void setMaxCmdsInTran(Integer maxCmdsInTran) {
        this.maxCmdsInTran = maxCmdsInTran;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionPhase() {
        return sessionPhase;
    }

    public void setSessionPhase(String sessionPhase) {
        this.sessionPhase = sessionPhase;
    }

    public Short getIsKnownCdcTran() {
        return isKnownCdcTran;
    }

    public void setIsKnownCdcTran(Short isKnownCdcTran) {
        this.isKnownCdcTran = isKnownCdcTran;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }
    
}
