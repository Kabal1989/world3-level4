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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "external_job_streams")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalJobStreams.findAll", query = "SELECT e FROM ExternalJobStreams e"),
    @NamedQuery(name = "ExternalJobStreams.findByJobId", query = "SELECT e FROM ExternalJobStreams e WHERE e.jobId = :jobId"),
    @NamedQuery(name = "ExternalJobStreams.findByStreamId", query = "SELECT e FROM ExternalJobStreams e WHERE e.streamId = :streamId"),
    @NamedQuery(name = "ExternalJobStreams.findByIsInput", query = "SELECT e FROM ExternalJobStreams e WHERE e.isInput = :isInput"),
    @NamedQuery(name = "ExternalJobStreams.findByIsOutput", query = "SELECT e FROM ExternalJobStreams e WHERE e.isOutput = :isOutput")})
public class ExternalJobStreams implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "job_id")
    private int jobId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stream_id")
    private int streamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_input")
    private boolean isInput;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_output")
    private boolean isOutput;

    public ExternalJobStreams() {
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getStreamId() {
        return streamId;
    }

    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    public boolean getIsInput() {
        return isInput;
    }

    public void setIsInput(boolean isInput) {
        this.isInput = isInput;
    }

    public boolean getIsOutput() {
        return isOutput;
    }

    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }
    
}
