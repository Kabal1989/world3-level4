/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "database_ledger_digest_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseLedgerDigestLocations.findAll", query = "SELECT d FROM DatabaseLedgerDigestLocations d"),
    @NamedQuery(name = "DatabaseLedgerDigestLocations.findByPath", query = "SELECT d FROM DatabaseLedgerDigestLocations d WHERE d.path = :path"),
    @NamedQuery(name = "DatabaseLedgerDigestLocations.findByLastDigestBlockId", query = "SELECT d FROM DatabaseLedgerDigestLocations d WHERE d.lastDigestBlockId = :lastDigestBlockId"),
    @NamedQuery(name = "DatabaseLedgerDigestLocations.findByIsCurrent", query = "SELECT d FROM DatabaseLedgerDigestLocations d WHERE d.isCurrent = :isCurrent")})
public class DatabaseLedgerDigestLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4000)
    @Column(name = "path")
    private String path;
    @Column(name = "last_digest_block_id")
    private BigInteger lastDigestBlockId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_current")
    private boolean isCurrent;

    public DatabaseLedgerDigestLocations() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigInteger getLastDigestBlockId() {
        return lastDigestBlockId;
    }

    public void setLastDigestBlockId(BigInteger lastDigestBlockId) {
        this.lastDigestBlockId = lastDigestBlockId;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
    
}
