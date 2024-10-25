/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "sysprocesses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysprocesses.findAll", query = "SELECT s FROM Sysprocesses s"),
    @NamedQuery(name = "Sysprocesses.findBySpid", query = "SELECT s FROM Sysprocesses s WHERE s.spid = :spid"),
    @NamedQuery(name = "Sysprocesses.findByKpid", query = "SELECT s FROM Sysprocesses s WHERE s.kpid = :kpid"),
    @NamedQuery(name = "Sysprocesses.findByBlocked", query = "SELECT s FROM Sysprocesses s WHERE s.blocked = :blocked"),
    @NamedQuery(name = "Sysprocesses.findByWaittime", query = "SELECT s FROM Sysprocesses s WHERE s.waittime = :waittime"),
    @NamedQuery(name = "Sysprocesses.findByLastwaittype", query = "SELECT s FROM Sysprocesses s WHERE s.lastwaittype = :lastwaittype"),
    @NamedQuery(name = "Sysprocesses.findByWaitresource", query = "SELECT s FROM Sysprocesses s WHERE s.waitresource = :waitresource"),
    @NamedQuery(name = "Sysprocesses.findByDbid", query = "SELECT s FROM Sysprocesses s WHERE s.dbid = :dbid"),
    @NamedQuery(name = "Sysprocesses.findByUid", query = "SELECT s FROM Sysprocesses s WHERE s.uid = :uid"),
    @NamedQuery(name = "Sysprocesses.findByCpu", query = "SELECT s FROM Sysprocesses s WHERE s.cpu = :cpu"),
    @NamedQuery(name = "Sysprocesses.findByPhysicalIo", query = "SELECT s FROM Sysprocesses s WHERE s.physicalIo = :physicalIo"),
    @NamedQuery(name = "Sysprocesses.findByMemusage", query = "SELECT s FROM Sysprocesses s WHERE s.memusage = :memusage"),
    @NamedQuery(name = "Sysprocesses.findByLoginTime", query = "SELECT s FROM Sysprocesses s WHERE s.loginTime = :loginTime"),
    @NamedQuery(name = "Sysprocesses.findByLastBatch", query = "SELECT s FROM Sysprocesses s WHERE s.lastBatch = :lastBatch"),
    @NamedQuery(name = "Sysprocesses.findByEcid", query = "SELECT s FROM Sysprocesses s WHERE s.ecid = :ecid"),
    @NamedQuery(name = "Sysprocesses.findByOpenTran", query = "SELECT s FROM Sysprocesses s WHERE s.openTran = :openTran"),
    @NamedQuery(name = "Sysprocesses.findByStatus", query = "SELECT s FROM Sysprocesses s WHERE s.status = :status"),
    @NamedQuery(name = "Sysprocesses.findByHostname", query = "SELECT s FROM Sysprocesses s WHERE s.hostname = :hostname"),
    @NamedQuery(name = "Sysprocesses.findByProgramName", query = "SELECT s FROM Sysprocesses s WHERE s.programName = :programName"),
    @NamedQuery(name = "Sysprocesses.findByHostprocess", query = "SELECT s FROM Sysprocesses s WHERE s.hostprocess = :hostprocess"),
    @NamedQuery(name = "Sysprocesses.findByCmd", query = "SELECT s FROM Sysprocesses s WHERE s.cmd = :cmd"),
    @NamedQuery(name = "Sysprocesses.findByNtDomain", query = "SELECT s FROM Sysprocesses s WHERE s.ntDomain = :ntDomain"),
    @NamedQuery(name = "Sysprocesses.findByNtUsername", query = "SELECT s FROM Sysprocesses s WHERE s.ntUsername = :ntUsername"),
    @NamedQuery(name = "Sysprocesses.findByNetAddress", query = "SELECT s FROM Sysprocesses s WHERE s.netAddress = :netAddress"),
    @NamedQuery(name = "Sysprocesses.findByNetLibrary", query = "SELECT s FROM Sysprocesses s WHERE s.netLibrary = :netLibrary"),
    @NamedQuery(name = "Sysprocesses.findByLoginame", query = "SELECT s FROM Sysprocesses s WHERE s.loginame = :loginame"),
    @NamedQuery(name = "Sysprocesses.findByStmtStart", query = "SELECT s FROM Sysprocesses s WHERE s.stmtStart = :stmtStart"),
    @NamedQuery(name = "Sysprocesses.findByStmtEnd", query = "SELECT s FROM Sysprocesses s WHERE s.stmtEnd = :stmtEnd"),
    @NamedQuery(name = "Sysprocesses.findByRequestId", query = "SELECT s FROM Sysprocesses s WHERE s.requestId = :requestId")})
public class Sysprocesses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spid")
    private short spid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kpid")
    private short kpid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blocked")
    private short blocked;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "waittype")
    private byte[] waittype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waittime")
    private long waittime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "lastwaittype")
    private String lastwaittype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "waitresource")
    private String waitresource;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dbid")
    private short dbid;
    @Column(name = "uid")
    private Short uid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu")
    private int cpu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "physical_io")
    private long physicalIo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memusage")
    private int memusage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "login_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_batch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastBatch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ecid")
    private short ecid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_tran")
    private short openTran;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "hostname")
    private String hostname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "program_name")
    private String programName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "hostprocess")
    private String hostprocess;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "cmd")
    private String cmd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "nt_domain")
    private String ntDomain;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "nt_username")
    private String ntUsername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "net_address")
    private String netAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "net_library")
    private String netLibrary;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "loginame")
    private String loginame;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "context_info")
    private byte[] contextInfo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stmt_start")
    private int stmtStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stmt_end")
    private int stmtEnd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_id")
    private int requestId;
    @Lob
    @Column(name = "page_resource")
    private byte[] pageResource;

    public Sysprocesses() {
    }

    public short getSpid() {
        return spid;
    }

    public void setSpid(short spid) {
        this.spid = spid;
    }

    public short getKpid() {
        return kpid;
    }

    public void setKpid(short kpid) {
        this.kpid = kpid;
    }

    public short getBlocked() {
        return blocked;
    }

    public void setBlocked(short blocked) {
        this.blocked = blocked;
    }

    public byte[] getWaittype() {
        return waittype;
    }

    public void setWaittype(byte[] waittype) {
        this.waittype = waittype;
    }

    public long getWaittime() {
        return waittime;
    }

    public void setWaittime(long waittime) {
        this.waittime = waittime;
    }

    public String getLastwaittype() {
        return lastwaittype;
    }

    public void setLastwaittype(String lastwaittype) {
        this.lastwaittype = lastwaittype;
    }

    public String getWaitresource() {
        return waitresource;
    }

    public void setWaitresource(String waitresource) {
        this.waitresource = waitresource;
    }

    public short getDbid() {
        return dbid;
    }

    public void setDbid(short dbid) {
        this.dbid = dbid;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public long getPhysicalIo() {
        return physicalIo;
    }

    public void setPhysicalIo(long physicalIo) {
        this.physicalIo = physicalIo;
    }

    public int getMemusage() {
        return memusage;
    }

    public void setMemusage(int memusage) {
        this.memusage = memusage;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastBatch() {
        return lastBatch;
    }

    public void setLastBatch(Date lastBatch) {
        this.lastBatch = lastBatch;
    }

    public short getEcid() {
        return ecid;
    }

    public void setEcid(short ecid) {
        this.ecid = ecid;
    }

    public short getOpenTran() {
        return openTran;
    }

    public void setOpenTran(short openTran) {
        this.openTran = openTran;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getHostprocess() {
        return hostprocess;
    }

    public void setHostprocess(String hostprocess) {
        this.hostprocess = hostprocess;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getNtDomain() {
        return ntDomain;
    }

    public void setNtDomain(String ntDomain) {
        this.ntDomain = ntDomain;
    }

    public String getNtUsername() {
        return ntUsername;
    }

    public void setNtUsername(String ntUsername) {
        this.ntUsername = ntUsername;
    }

    public String getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(String netAddress) {
        this.netAddress = netAddress;
    }

    public String getNetLibrary() {
        return netLibrary;
    }

    public void setNetLibrary(String netLibrary) {
        this.netLibrary = netLibrary;
    }

    public String getLoginame() {
        return loginame;
    }

    public void setLoginame(String loginame) {
        this.loginame = loginame;
    }

    public byte[] getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(byte[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public int getStmtStart() {
        return stmtStart;
    }

    public void setStmtStart(int stmtStart) {
        this.stmtStart = stmtStart;
    }

    public int getStmtEnd() {
        return stmtEnd;
    }

    public void setStmtEnd(int stmtEnd) {
        this.stmtEnd = stmtEnd;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public byte[] getPageResource() {
        return pageResource;
    }

    public void setPageResource(byte[] pageResource) {
        this.pageResource = pageResource;
    }
    
}
