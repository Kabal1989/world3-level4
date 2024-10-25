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
@Table(name = "destination_data_spaces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DestinationDataSpaces.findAll", query = "SELECT d FROM DestinationDataSpaces d"),
    @NamedQuery(name = "DestinationDataSpaces.findByPartitionSchemeId", query = "SELECT d FROM DestinationDataSpaces d WHERE d.partitionSchemeId = :partitionSchemeId"),
    @NamedQuery(name = "DestinationDataSpaces.findByDestinationId", query = "SELECT d FROM DestinationDataSpaces d WHERE d.destinationId = :destinationId"),
    @NamedQuery(name = "DestinationDataSpaces.findByDataSpaceId", query = "SELECT d FROM DestinationDataSpaces d WHERE d.dataSpaceId = :dataSpaceId")})
public class DestinationDataSpaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_scheme_id")
    private int partitionSchemeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destination_id")
    private int destinationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;

    public DestinationDataSpaces() {
    }

    public int getPartitionSchemeId() {
        return partitionSchemeId;
    }

    public void setPartitionSchemeId(int partitionSchemeId) {
        this.partitionSchemeId = partitionSchemeId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }
    
}
