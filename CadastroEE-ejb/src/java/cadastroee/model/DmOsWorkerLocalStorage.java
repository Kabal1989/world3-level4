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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_os_worker_local_storage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsWorkerLocalStorage.findAll", query = "SELECT d FROM DmOsWorkerLocalStorage d")})
public class DmOsWorkerLocalStorage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "worker_address")
    private byte[] workerAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "comp_exec_ctxt_address")
    private byte[] compExecCtxtAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "ec_address")
    private byte[] ecAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "broker_address")
    private byte[] brokerAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "task_proxy_address")
    private byte[] taskProxyAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "msqlxact_address")
    private byte[] msqlxactAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sql_prof_address")
    private byte[] sqlProfAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "stack_checker_address")
    private byte[] stackCheckerAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "host_task_address")
    private byte[] hostTaskAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sni_error_address")
    private byte[] sniErrorAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "queryscan_address")
    private byte[] queryscanAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "diag_address")
    private byte[] diagAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "query_driver_address")
    private byte[] queryDriverAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "federatedxact_address")
    private byte[] federatedxactAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "filestream_address")
    private byte[] filestreamAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "qe_cc_address")
    private byte[] qeCcAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "xtp_address")
    private byte[] xtpAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "gq_address")
    private byte[] gqAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "extensibility_ctxt_address")
    private byte[] extensibilityCtxtAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "performance_counters_address")
    private byte[] performanceCountersAddress;

    public DmOsWorkerLocalStorage() {
    }

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public byte[] getCompExecCtxtAddress() {
        return compExecCtxtAddress;
    }

    public void setCompExecCtxtAddress(byte[] compExecCtxtAddress) {
        this.compExecCtxtAddress = compExecCtxtAddress;
    }

    public byte[] getEcAddress() {
        return ecAddress;
    }

    public void setEcAddress(byte[] ecAddress) {
        this.ecAddress = ecAddress;
    }

    public byte[] getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(byte[] brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public byte[] getTaskProxyAddress() {
        return taskProxyAddress;
    }

    public void setTaskProxyAddress(byte[] taskProxyAddress) {
        this.taskProxyAddress = taskProxyAddress;
    }

    public byte[] getMsqlxactAddress() {
        return msqlxactAddress;
    }

    public void setMsqlxactAddress(byte[] msqlxactAddress) {
        this.msqlxactAddress = msqlxactAddress;
    }

    public byte[] getSqlProfAddress() {
        return sqlProfAddress;
    }

    public void setSqlProfAddress(byte[] sqlProfAddress) {
        this.sqlProfAddress = sqlProfAddress;
    }

    public byte[] getStackCheckerAddress() {
        return stackCheckerAddress;
    }

    public void setStackCheckerAddress(byte[] stackCheckerAddress) {
        this.stackCheckerAddress = stackCheckerAddress;
    }

    public byte[] getHostTaskAddress() {
        return hostTaskAddress;
    }

    public void setHostTaskAddress(byte[] hostTaskAddress) {
        this.hostTaskAddress = hostTaskAddress;
    }

    public byte[] getSniErrorAddress() {
        return sniErrorAddress;
    }

    public void setSniErrorAddress(byte[] sniErrorAddress) {
        this.sniErrorAddress = sniErrorAddress;
    }

    public byte[] getQueryscanAddress() {
        return queryscanAddress;
    }

    public void setQueryscanAddress(byte[] queryscanAddress) {
        this.queryscanAddress = queryscanAddress;
    }

    public byte[] getDiagAddress() {
        return diagAddress;
    }

    public void setDiagAddress(byte[] diagAddress) {
        this.diagAddress = diagAddress;
    }

    public byte[] getQueryDriverAddress() {
        return queryDriverAddress;
    }

    public void setQueryDriverAddress(byte[] queryDriverAddress) {
        this.queryDriverAddress = queryDriverAddress;
    }

    public byte[] getFederatedxactAddress() {
        return federatedxactAddress;
    }

    public void setFederatedxactAddress(byte[] federatedxactAddress) {
        this.federatedxactAddress = federatedxactAddress;
    }

    public byte[] getFilestreamAddress() {
        return filestreamAddress;
    }

    public void setFilestreamAddress(byte[] filestreamAddress) {
        this.filestreamAddress = filestreamAddress;
    }

    public byte[] getQeCcAddress() {
        return qeCcAddress;
    }

    public void setQeCcAddress(byte[] qeCcAddress) {
        this.qeCcAddress = qeCcAddress;
    }

    public byte[] getXtpAddress() {
        return xtpAddress;
    }

    public void setXtpAddress(byte[] xtpAddress) {
        this.xtpAddress = xtpAddress;
    }

    public byte[] getGqAddress() {
        return gqAddress;
    }

    public void setGqAddress(byte[] gqAddress) {
        this.gqAddress = gqAddress;
    }

    public byte[] getExtensibilityCtxtAddress() {
        return extensibilityCtxtAddress;
    }

    public void setExtensibilityCtxtAddress(byte[] extensibilityCtxtAddress) {
        this.extensibilityCtxtAddress = extensibilityCtxtAddress;
    }

    public byte[] getPerformanceCountersAddress() {
        return performanceCountersAddress;
    }

    public void setPerformanceCountersAddress(byte[] performanceCountersAddress) {
        this.performanceCountersAddress = performanceCountersAddress;
    }
    
}
