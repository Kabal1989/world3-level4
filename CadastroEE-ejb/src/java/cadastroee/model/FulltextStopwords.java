/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "fulltext_stopwords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextStopwords.findAll", query = "SELECT f FROM FulltextStopwords f"),
    @NamedQuery(name = "FulltextStopwords.findByStoplistId", query = "SELECT f FROM FulltextStopwords f WHERE f.stoplistId = :stoplistId"),
    @NamedQuery(name = "FulltextStopwords.findByStopword", query = "SELECT f FROM FulltextStopwords f WHERE f.stopword = :stopword"),
    @NamedQuery(name = "FulltextStopwords.findByLanguage", query = "SELECT f FROM FulltextStopwords f WHERE f.language = :language"),
    @NamedQuery(name = "FulltextStopwords.findByLanguageId", query = "SELECT f FROM FulltextStopwords f WHERE f.languageId = :languageId")})
public class FulltextStopwords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stoplist_id")
    private int stoplistId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "stopword")
    private String stopword;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public FulltextStopwords() {
    }

    public int getStoplistId() {
        return stoplistId;
    }

    public void setStoplistId(int stoplistId) {
        this.stoplistId = stoplistId;
    }

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    
}
