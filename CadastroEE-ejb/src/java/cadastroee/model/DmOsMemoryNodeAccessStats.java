/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_os_memory_node_access_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryNodeAccessStats.findAll", query = "SELECT d FROM DmOsMemoryNodeAccessStats d"),
    @NamedQuery(name = "DmOsMemoryNodeAccessStats.findByLocalNode", query = "SELECT d FROM DmOsMemoryNodeAccessStats d WHERE d.localNode = :localNode"),
    @NamedQuery(name = "DmOsMemoryNodeAccessStats.findByRemoteNode", query = "SELECT d FROM DmOsMemoryNodeAccessStats d WHERE d.remoteNode = :remoteNode"),
    @NamedQuery(name = "DmOsMemoryNodeAccessStats.findByPageClass", query = "SELECT d FROM DmOsMemoryNodeAccessStats d WHERE d.pageClass = :pageClass"),
    @NamedQuery(name = "DmOsMemoryNodeAccessStats.findByReadCount", query = "SELECT d FROM DmOsMemoryNodeAccessStats d WHERE d.readCount = :readCount"),
    @NamedQuery(name = "DmOsMemoryNodeAccessStats.findByWriteCount", query = "SELECT d FROM DmOsMemoryNodeAccessStats d WHERE d.writeCount = :writeCount")})
public class DmOsMemoryNodeAccessStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "local_node")
    private Integer localNode;
    @Column(name = "remote_node")
    private Integer remoteNode;
    @Size(max = 60)
    @Column(name = "page_class")
    private String pageClass;
    @Column(name = "read_count")
    private BigInteger readCount;
    @Column(name = "write_count")
    private BigInteger writeCount;

    public DmOsMemoryNodeAccessStats() {
    }

    public Integer getLocalNode() {
        return localNode;
    }

    public void setLocalNode(Integer localNode) {
        this.localNode = localNode;
    }

    public Integer getRemoteNode() {
        return remoteNode;
    }

    public void setRemoteNode(Integer remoteNode) {
        this.remoteNode = remoteNode;
    }

    public String getPageClass() {
        return pageClass;
    }

    public void setPageClass(String pageClass) {
        this.pageClass = pageClass;
    }

    public BigInteger getReadCount() {
        return readCount;
    }

    public void setReadCount(BigInteger readCount) {
        this.readCount = readCount;
    }

    public BigInteger getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(BigInteger writeCount) {
        this.writeCount = writeCount;
    }
    
}
