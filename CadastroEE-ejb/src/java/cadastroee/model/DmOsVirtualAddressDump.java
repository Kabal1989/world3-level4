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
@Table(name = "dm_os_virtual_address_dump")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsVirtualAddressDump.findAll", query = "SELECT d FROM DmOsVirtualAddressDump d"),
    @NamedQuery(name = "DmOsVirtualAddressDump.findByRegionSizeInBytes", query = "SELECT d FROM DmOsVirtualAddressDump d WHERE d.regionSizeInBytes = :regionSizeInBytes")})
public class DmOsVirtualAddressDump implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "region_base_address")
    private byte[] regionBaseAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "region_allocation_base_address")
    private byte[] regionAllocationBaseAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "region_allocation_protection")
    private byte[] regionAllocationProtection;
    @Basic(optional = false)
    @NotNull
    @Column(name = "region_size_in_bytes")
    private long regionSizeInBytes;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "region_state")
    private byte[] regionState;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "region_current_protection")
    private byte[] regionCurrentProtection;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "region_type")
    private byte[] regionType;

    public DmOsVirtualAddressDump() {
    }

    public byte[] getRegionBaseAddress() {
        return regionBaseAddress;
    }

    public void setRegionBaseAddress(byte[] regionBaseAddress) {
        this.regionBaseAddress = regionBaseAddress;
    }

    public byte[] getRegionAllocationBaseAddress() {
        return regionAllocationBaseAddress;
    }

    public void setRegionAllocationBaseAddress(byte[] regionAllocationBaseAddress) {
        this.regionAllocationBaseAddress = regionAllocationBaseAddress;
    }

    public byte[] getRegionAllocationProtection() {
        return regionAllocationProtection;
    }

    public void setRegionAllocationProtection(byte[] regionAllocationProtection) {
        this.regionAllocationProtection = regionAllocationProtection;
    }

    public long getRegionSizeInBytes() {
        return regionSizeInBytes;
    }

    public void setRegionSizeInBytes(long regionSizeInBytes) {
        this.regionSizeInBytes = regionSizeInBytes;
    }

    public byte[] getRegionState() {
        return regionState;
    }

    public void setRegionState(byte[] regionState) {
        this.regionState = regionState;
    }

    public byte[] getRegionCurrentProtection() {
        return regionCurrentProtection;
    }

    public void setRegionCurrentProtection(byte[] regionCurrentProtection) {
        this.regionCurrentProtection = regionCurrentProtection;
    }

    public byte[] getRegionType() {
        return regionType;
    }

    public void setRegionType(byte[] regionType) {
        this.regionType = regionType;
    }
    
}
