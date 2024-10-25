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
@Table(name = "fulltext_semantic_language_statistics_database")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findAll", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByDatabaseId", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.databaseId = :databaseId"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByRegisterDate", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.registerDate = :registerDate"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByRegisteredBy", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.registeredBy = :registeredBy"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByVersion", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.version = :version")})
public class FulltextSemanticLanguageStatisticsDatabase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "register_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registered_by")
    private int registeredBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "version")
    private String version;

    public FulltextSemanticLanguageStatisticsDatabase() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(int registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
}
