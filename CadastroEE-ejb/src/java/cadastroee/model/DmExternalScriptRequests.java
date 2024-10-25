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
@Table(name = "dm_external_script_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalScriptRequests.findAll", query = "SELECT d FROM DmExternalScriptRequests d"),
    @NamedQuery(name = "DmExternalScriptRequests.findByExternalScriptRequestId", query = "SELECT d FROM DmExternalScriptRequests d WHERE d.externalScriptRequestId = :externalScriptRequestId"),
    @NamedQuery(name = "DmExternalScriptRequests.findByLanguage", query = "SELECT d FROM DmExternalScriptRequests d WHERE d.language = :language"),
    @NamedQuery(name = "DmExternalScriptRequests.findByDegreeOfParallelism", query = "SELECT d FROM DmExternalScriptRequests d WHERE d.degreeOfParallelism = :degreeOfParallelism"),
    @NamedQuery(name = "DmExternalScriptRequests.findByExternalUserName", query = "SELECT d FROM DmExternalScriptRequests d WHERE d.externalUserName = :externalUserName")})
public class DmExternalScriptRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "external_script_request_id")
    private String externalScriptRequestId;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "degree_of_parallelism")
    private int degreeOfParallelism;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "external_user_name")
    private String externalUserName;

    public DmExternalScriptRequests() {
    }

    public String getExternalScriptRequestId() {
        return externalScriptRequestId;
    }

    public void setExternalScriptRequestId(String externalScriptRequestId) {
        this.externalScriptRequestId = externalScriptRequestId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDegreeOfParallelism() {
        return degreeOfParallelism;
    }

    public void setDegreeOfParallelism(int degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
    }

    public String getExternalUserName() {
        return externalUserName;
    }

    public void setExternalUserName(String externalUserName) {
        this.externalUserName = externalUserName;
    }
    
}
