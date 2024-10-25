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
@Table(name = "dm_os_stacks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsStacks.findAll", query = "SELECT d FROM DmOsStacks d"),
    @NamedQuery(name = "DmOsStacks.findByFrameIndex", query = "SELECT d FROM DmOsStacks d WHERE d.frameIndex = :frameIndex")})
public class DmOsStacks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "stack_address")
    private byte[] stackAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "frame_index")
    private int frameIndex;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "frame_address")
    private byte[] frameAddress;

    public DmOsStacks() {
    }

    public byte[] getStackAddress() {
        return stackAddress;
    }

    public void setStackAddress(byte[] stackAddress) {
        this.stackAddress = stackAddress;
    }

    public int getFrameIndex() {
        return frameIndex;
    }

    public void setFrameIndex(int frameIndex) {
        this.frameIndex = frameIndex;
    }

    public byte[] getFrameAddress() {
        return frameAddress;
    }

    public void setFrameAddress(byte[] frameAddress) {
        this.frameAddress = frameAddress;
    }
    
}
