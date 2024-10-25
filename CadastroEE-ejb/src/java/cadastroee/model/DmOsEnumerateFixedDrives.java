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
@Table(name = "dm_os_enumerate_fixed_drives")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findAll", query = "SELECT d FROM DmOsEnumerateFixedDrives d"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByFixedDrivePath", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.fixedDrivePath = :fixedDrivePath"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByDriveType", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.driveType = :driveType"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByDriveTypeDesc", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.driveTypeDesc = :driveTypeDesc"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByFreeSpaceInBytes", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.freeSpaceInBytes = :freeSpaceInBytes")})
public class DmOsEnumerateFixedDrives implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 256)
    @Column(name = "fixed_drive_path")
    private String fixedDrivePath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "drive_type")
    private int driveType;
    @Size(max = 256)
    @Column(name = "drive_type_desc")
    private String driveTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "free_space_in_bytes")
    private long freeSpaceInBytes;

    public DmOsEnumerateFixedDrives() {
    }

    public String getFixedDrivePath() {
        return fixedDrivePath;
    }

    public void setFixedDrivePath(String fixedDrivePath) {
        this.fixedDrivePath = fixedDrivePath;
    }

    public int getDriveType() {
        return driveType;
    }

    public void setDriveType(int driveType) {
        this.driveType = driveType;
    }

    public String getDriveTypeDesc() {
        return driveTypeDesc;
    }

    public void setDriveTypeDesc(String driveTypeDesc) {
        this.driveTypeDesc = driveTypeDesc;
    }

    public long getFreeSpaceInBytes() {
        return freeSpaceInBytes;
    }

    public void setFreeSpaceInBytes(long freeSpaceInBytes) {
        this.freeSpaceInBytes = freeSpaceInBytes;
    }
    
}
