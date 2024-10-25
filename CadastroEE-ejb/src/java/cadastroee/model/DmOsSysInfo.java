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
@Table(name = "dm_os_sys_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsSysInfo.findAll", query = "SELECT d FROM DmOsSysInfo d"),
    @NamedQuery(name = "DmOsSysInfo.findByCpuTicks", query = "SELECT d FROM DmOsSysInfo d WHERE d.cpuTicks = :cpuTicks"),
    @NamedQuery(name = "DmOsSysInfo.findByMsTicks", query = "SELECT d FROM DmOsSysInfo d WHERE d.msTicks = :msTicks"),
    @NamedQuery(name = "DmOsSysInfo.findByCpuCount", query = "SELECT d FROM DmOsSysInfo d WHERE d.cpuCount = :cpuCount"),
    @NamedQuery(name = "DmOsSysInfo.findByHyperthreadRatio", query = "SELECT d FROM DmOsSysInfo d WHERE d.hyperthreadRatio = :hyperthreadRatio"),
    @NamedQuery(name = "DmOsSysInfo.findByPhysicalMemoryKb", query = "SELECT d FROM DmOsSysInfo d WHERE d.physicalMemoryKb = :physicalMemoryKb"),
    @NamedQuery(name = "DmOsSysInfo.findByVirtualMemoryKb", query = "SELECT d FROM DmOsSysInfo d WHERE d.virtualMemoryKb = :virtualMemoryKb"),
    @NamedQuery(name = "DmOsSysInfo.findByCommittedKb", query = "SELECT d FROM DmOsSysInfo d WHERE d.committedKb = :committedKb"),
    @NamedQuery(name = "DmOsSysInfo.findByCommittedTargetKb", query = "SELECT d FROM DmOsSysInfo d WHERE d.committedTargetKb = :committedTargetKb"),
    @NamedQuery(name = "DmOsSysInfo.findByVisibleTargetKb", query = "SELECT d FROM DmOsSysInfo d WHERE d.visibleTargetKb = :visibleTargetKb"),
    @NamedQuery(name = "DmOsSysInfo.findByStackSizeInBytes", query = "SELECT d FROM DmOsSysInfo d WHERE d.stackSizeInBytes = :stackSizeInBytes"),
    @NamedQuery(name = "DmOsSysInfo.findByOsQuantum", query = "SELECT d FROM DmOsSysInfo d WHERE d.osQuantum = :osQuantum"),
    @NamedQuery(name = "DmOsSysInfo.findByOsErrorMode", query = "SELECT d FROM DmOsSysInfo d WHERE d.osErrorMode = :osErrorMode"),
    @NamedQuery(name = "DmOsSysInfo.findByOsPriorityClass", query = "SELECT d FROM DmOsSysInfo d WHERE d.osPriorityClass = :osPriorityClass"),
    @NamedQuery(name = "DmOsSysInfo.findByMaxWorkersCount", query = "SELECT d FROM DmOsSysInfo d WHERE d.maxWorkersCount = :maxWorkersCount"),
    @NamedQuery(name = "DmOsSysInfo.findBySchedulerCount", query = "SELECT d FROM DmOsSysInfo d WHERE d.schedulerCount = :schedulerCount"),
    @NamedQuery(name = "DmOsSysInfo.findBySchedulerTotalCount", query = "SELECT d FROM DmOsSysInfo d WHERE d.schedulerTotalCount = :schedulerTotalCount"),
    @NamedQuery(name = "DmOsSysInfo.findByDeadlockMonitorSerialNumber", query = "SELECT d FROM DmOsSysInfo d WHERE d.deadlockMonitorSerialNumber = :deadlockMonitorSerialNumber"),
    @NamedQuery(name = "DmOsSysInfo.findBySqlserverStartTimeMsTicks", query = "SELECT d FROM DmOsSysInfo d WHERE d.sqlserverStartTimeMsTicks = :sqlserverStartTimeMsTicks"),
    @NamedQuery(name = "DmOsSysInfo.findBySqlserverStartTime", query = "SELECT d FROM DmOsSysInfo d WHERE d.sqlserverStartTime = :sqlserverStartTime"),
    @NamedQuery(name = "DmOsSysInfo.findByAffinityType", query = "SELECT d FROM DmOsSysInfo d WHERE d.affinityType = :affinityType"),
    @NamedQuery(name = "DmOsSysInfo.findByAffinityTypeDesc", query = "SELECT d FROM DmOsSysInfo d WHERE d.affinityTypeDesc = :affinityTypeDesc"),
    @NamedQuery(name = "DmOsSysInfo.findByProcessKernelTimeMs", query = "SELECT d FROM DmOsSysInfo d WHERE d.processKernelTimeMs = :processKernelTimeMs"),
    @NamedQuery(name = "DmOsSysInfo.findByProcessUserTimeMs", query = "SELECT d FROM DmOsSysInfo d WHERE d.processUserTimeMs = :processUserTimeMs"),
    @NamedQuery(name = "DmOsSysInfo.findByTimeSource", query = "SELECT d FROM DmOsSysInfo d WHERE d.timeSource = :timeSource"),
    @NamedQuery(name = "DmOsSysInfo.findByTimeSourceDesc", query = "SELECT d FROM DmOsSysInfo d WHERE d.timeSourceDesc = :timeSourceDesc"),
    @NamedQuery(name = "DmOsSysInfo.findByVirtualMachineType", query = "SELECT d FROM DmOsSysInfo d WHERE d.virtualMachineType = :virtualMachineType"),
    @NamedQuery(name = "DmOsSysInfo.findByVirtualMachineTypeDesc", query = "SELECT d FROM DmOsSysInfo d WHERE d.virtualMachineTypeDesc = :virtualMachineTypeDesc"),
    @NamedQuery(name = "DmOsSysInfo.findBySoftnumaConfiguration", query = "SELECT d FROM DmOsSysInfo d WHERE d.softnumaConfiguration = :softnumaConfiguration"),
    @NamedQuery(name = "DmOsSysInfo.findBySoftnumaConfigurationDesc", query = "SELECT d FROM DmOsSysInfo d WHERE d.softnumaConfigurationDesc = :softnumaConfigurationDesc"),
    @NamedQuery(name = "DmOsSysInfo.findByProcessPhysicalAffinity", query = "SELECT d FROM DmOsSysInfo d WHERE d.processPhysicalAffinity = :processPhysicalAffinity"),
    @NamedQuery(name = "DmOsSysInfo.findBySqlMemoryModel", query = "SELECT d FROM DmOsSysInfo d WHERE d.sqlMemoryModel = :sqlMemoryModel"),
    @NamedQuery(name = "DmOsSysInfo.findBySqlMemoryModelDesc", query = "SELECT d FROM DmOsSysInfo d WHERE d.sqlMemoryModelDesc = :sqlMemoryModelDesc"),
    @NamedQuery(name = "DmOsSysInfo.findBySocketCount", query = "SELECT d FROM DmOsSysInfo d WHERE d.socketCount = :socketCount"),
    @NamedQuery(name = "DmOsSysInfo.findByCoresPerSocket", query = "SELECT d FROM DmOsSysInfo d WHERE d.coresPerSocket = :coresPerSocket"),
    @NamedQuery(name = "DmOsSysInfo.findByNumaNodeCount", query = "SELECT d FROM DmOsSysInfo d WHERE d.numaNodeCount = :numaNodeCount"),
    @NamedQuery(name = "DmOsSysInfo.findByContainerType", query = "SELECT d FROM DmOsSysInfo d WHERE d.containerType = :containerType"),
    @NamedQuery(name = "DmOsSysInfo.findByContainerTypeDesc", query = "SELECT d FROM DmOsSysInfo d WHERE d.containerTypeDesc = :containerTypeDesc")})
public class DmOsSysInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_ticks")
    private long cpuTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ms_ticks")
    private long msTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_count")
    private int cpuCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hyperthread_ratio")
    private int hyperthreadRatio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "physical_memory_kb")
    private long physicalMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_memory_kb")
    private long virtualMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "committed_kb")
    private long committedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "committed_target_kb")
    private long committedTargetKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "visible_target_kb")
    private long visibleTargetKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stack_size_in_bytes")
    private int stackSizeInBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "os_quantum")
    private long osQuantum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "os_error_mode")
    private int osErrorMode;
    @Column(name = "os_priority_class")
    private Integer osPriorityClass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_workers_count")
    private int maxWorkersCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_count")
    private int schedulerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_total_count")
    private int schedulerTotalCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deadlock_monitor_serial_number")
    private int deadlockMonitorSerialNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sqlserver_start_time_ms_ticks")
    private long sqlserverStartTimeMsTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sqlserver_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sqlserverStartTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "affinity_type")
    private int affinityType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "affinity_type_desc")
    private String affinityTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_kernel_time_ms")
    private long processKernelTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_user_time_ms")
    private long processUserTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_source")
    private int timeSource;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "time_source_desc")
    private String timeSourceDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_machine_type")
    private int virtualMachineType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "virtual_machine_type_desc")
    private String virtualMachineTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "softnuma_configuration")
    private int softnumaConfiguration;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "softnuma_configuration_desc")
    private String softnumaConfigurationDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3072)
    @Column(name = "process_physical_affinity")
    private String processPhysicalAffinity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sql_memory_model")
    private int sqlMemoryModel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "sql_memory_model_desc")
    private String sqlMemoryModelDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "socket_count")
    private int socketCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cores_per_socket")
    private int coresPerSocket;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numa_node_count")
    private int numaNodeCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "container_type")
    private int containerType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "container_type_desc")
    private String containerTypeDesc;

    public DmOsSysInfo() {
    }

    public long getCpuTicks() {
        return cpuTicks;
    }

    public void setCpuTicks(long cpuTicks) {
        this.cpuTicks = cpuTicks;
    }

    public long getMsTicks() {
        return msTicks;
    }

    public void setMsTicks(long msTicks) {
        this.msTicks = msTicks;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public int getHyperthreadRatio() {
        return hyperthreadRatio;
    }

    public void setHyperthreadRatio(int hyperthreadRatio) {
        this.hyperthreadRatio = hyperthreadRatio;
    }

    public long getPhysicalMemoryKb() {
        return physicalMemoryKb;
    }

    public void setPhysicalMemoryKb(long physicalMemoryKb) {
        this.physicalMemoryKb = physicalMemoryKb;
    }

    public long getVirtualMemoryKb() {
        return virtualMemoryKb;
    }

    public void setVirtualMemoryKb(long virtualMemoryKb) {
        this.virtualMemoryKb = virtualMemoryKb;
    }

    public long getCommittedKb() {
        return committedKb;
    }

    public void setCommittedKb(long committedKb) {
        this.committedKb = committedKb;
    }

    public long getCommittedTargetKb() {
        return committedTargetKb;
    }

    public void setCommittedTargetKb(long committedTargetKb) {
        this.committedTargetKb = committedTargetKb;
    }

    public long getVisibleTargetKb() {
        return visibleTargetKb;
    }

    public void setVisibleTargetKb(long visibleTargetKb) {
        this.visibleTargetKb = visibleTargetKb;
    }

    public int getStackSizeInBytes() {
        return stackSizeInBytes;
    }

    public void setStackSizeInBytes(int stackSizeInBytes) {
        this.stackSizeInBytes = stackSizeInBytes;
    }

    public long getOsQuantum() {
        return osQuantum;
    }

    public void setOsQuantum(long osQuantum) {
        this.osQuantum = osQuantum;
    }

    public int getOsErrorMode() {
        return osErrorMode;
    }

    public void setOsErrorMode(int osErrorMode) {
        this.osErrorMode = osErrorMode;
    }

    public Integer getOsPriorityClass() {
        return osPriorityClass;
    }

    public void setOsPriorityClass(Integer osPriorityClass) {
        this.osPriorityClass = osPriorityClass;
    }

    public int getMaxWorkersCount() {
        return maxWorkersCount;
    }

    public void setMaxWorkersCount(int maxWorkersCount) {
        this.maxWorkersCount = maxWorkersCount;
    }

    public int getSchedulerCount() {
        return schedulerCount;
    }

    public void setSchedulerCount(int schedulerCount) {
        this.schedulerCount = schedulerCount;
    }

    public int getSchedulerTotalCount() {
        return schedulerTotalCount;
    }

    public void setSchedulerTotalCount(int schedulerTotalCount) {
        this.schedulerTotalCount = schedulerTotalCount;
    }

    public int getDeadlockMonitorSerialNumber() {
        return deadlockMonitorSerialNumber;
    }

    public void setDeadlockMonitorSerialNumber(int deadlockMonitorSerialNumber) {
        this.deadlockMonitorSerialNumber = deadlockMonitorSerialNumber;
    }

    public long getSqlserverStartTimeMsTicks() {
        return sqlserverStartTimeMsTicks;
    }

    public void setSqlserverStartTimeMsTicks(long sqlserverStartTimeMsTicks) {
        this.sqlserverStartTimeMsTicks = sqlserverStartTimeMsTicks;
    }

    public Date getSqlserverStartTime() {
        return sqlserverStartTime;
    }

    public void setSqlserverStartTime(Date sqlserverStartTime) {
        this.sqlserverStartTime = sqlserverStartTime;
    }

    public int getAffinityType() {
        return affinityType;
    }

    public void setAffinityType(int affinityType) {
        this.affinityType = affinityType;
    }

    public String getAffinityTypeDesc() {
        return affinityTypeDesc;
    }

    public void setAffinityTypeDesc(String affinityTypeDesc) {
        this.affinityTypeDesc = affinityTypeDesc;
    }

    public long getProcessKernelTimeMs() {
        return processKernelTimeMs;
    }

    public void setProcessKernelTimeMs(long processKernelTimeMs) {
        this.processKernelTimeMs = processKernelTimeMs;
    }

    public long getProcessUserTimeMs() {
        return processUserTimeMs;
    }

    public void setProcessUserTimeMs(long processUserTimeMs) {
        this.processUserTimeMs = processUserTimeMs;
    }

    public int getTimeSource() {
        return timeSource;
    }

    public void setTimeSource(int timeSource) {
        this.timeSource = timeSource;
    }

    public String getTimeSourceDesc() {
        return timeSourceDesc;
    }

    public void setTimeSourceDesc(String timeSourceDesc) {
        this.timeSourceDesc = timeSourceDesc;
    }

    public int getVirtualMachineType() {
        return virtualMachineType;
    }

    public void setVirtualMachineType(int virtualMachineType) {
        this.virtualMachineType = virtualMachineType;
    }

    public String getVirtualMachineTypeDesc() {
        return virtualMachineTypeDesc;
    }

    public void setVirtualMachineTypeDesc(String virtualMachineTypeDesc) {
        this.virtualMachineTypeDesc = virtualMachineTypeDesc;
    }

    public int getSoftnumaConfiguration() {
        return softnumaConfiguration;
    }

    public void setSoftnumaConfiguration(int softnumaConfiguration) {
        this.softnumaConfiguration = softnumaConfiguration;
    }

    public String getSoftnumaConfigurationDesc() {
        return softnumaConfigurationDesc;
    }

    public void setSoftnumaConfigurationDesc(String softnumaConfigurationDesc) {
        this.softnumaConfigurationDesc = softnumaConfigurationDesc;
    }

    public String getProcessPhysicalAffinity() {
        return processPhysicalAffinity;
    }

    public void setProcessPhysicalAffinity(String processPhysicalAffinity) {
        this.processPhysicalAffinity = processPhysicalAffinity;
    }

    public int getSqlMemoryModel() {
        return sqlMemoryModel;
    }

    public void setSqlMemoryModel(int sqlMemoryModel) {
        this.sqlMemoryModel = sqlMemoryModel;
    }

    public String getSqlMemoryModelDesc() {
        return sqlMemoryModelDesc;
    }

    public void setSqlMemoryModelDesc(String sqlMemoryModelDesc) {
        this.sqlMemoryModelDesc = sqlMemoryModelDesc;
    }

    public int getSocketCount() {
        return socketCount;
    }

    public void setSocketCount(int socketCount) {
        this.socketCount = socketCount;
    }

    public int getCoresPerSocket() {
        return coresPerSocket;
    }

    public void setCoresPerSocket(int coresPerSocket) {
        this.coresPerSocket = coresPerSocket;
    }

    public int getNumaNodeCount() {
        return numaNodeCount;
    }

    public void setNumaNodeCount(int numaNodeCount) {
        this.numaNodeCount = numaNodeCount;
    }

    public int getContainerType() {
        return containerType;
    }

    public void setContainerType(int containerType) {
        this.containerType = containerType;
    }

    public String getContainerTypeDesc() {
        return containerTypeDesc;
    }

    public void setContainerTypeDesc(String containerTypeDesc) {
        this.containerTypeDesc = containerTypeDesc;
    }
    
}
