/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_external_provider_certificate_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalProviderCertificateInfo.findAll", query = "SELECT d FROM DmExternalProviderCertificateInfo d"),
    @NamedQuery(name = "DmExternalProviderCertificateInfo.findBySubject", query = "SELECT d FROM DmExternalProviderCertificateInfo d WHERE d.subject = :subject"),
    @NamedQuery(name = "DmExternalProviderCertificateInfo.findByThumbprint", query = "SELECT d FROM DmExternalProviderCertificateInfo d WHERE d.thumbprint = :thumbprint"),
    @NamedQuery(name = "DmExternalProviderCertificateInfo.findByExpiryDate", query = "SELECT d FROM DmExternalProviderCertificateInfo d WHERE d.expiryDate = :expiryDate"),
    @NamedQuery(name = "DmExternalProviderCertificateInfo.findByIsReadable", query = "SELECT d FROM DmExternalProviderCertificateInfo d WHERE d.isReadable = :isReadable"),
    @NamedQuery(name = "DmExternalProviderCertificateInfo.findByIsMissing", query = "SELECT d FROM DmExternalProviderCertificateInfo d WHERE d.isMissing = :isMissing")})
public class DmExternalProviderCertificateInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "subject")
    private String subject;
    @Size(max = 128)
    @Column(name = "thumbprint")
    private String thumbprint;
    @Column(name = "expiry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "is_readable")
    private Boolean isReadable;
    @Column(name = "is_missing")
    private Boolean isMissing;

    public DmExternalProviderCertificateInfo() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getIsReadable() {
        return isReadable;
    }

    public void setIsReadable(Boolean isReadable) {
        this.isReadable = isReadable;
    }

    public Boolean getIsMissing() {
        return isMissing;
    }

    public void setIsMissing(Boolean isMissing) {
        this.isMissing = isMissing;
    }
    
}
