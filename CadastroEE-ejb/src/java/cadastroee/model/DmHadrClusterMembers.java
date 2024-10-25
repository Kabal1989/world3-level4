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
@Table(name = "dm_hadr_cluster_members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrClusterMembers.findAll", query = "SELECT d FROM DmHadrClusterMembers d"),
    @NamedQuery(name = "DmHadrClusterMembers.findByMemberName", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.memberName = :memberName"),
    @NamedQuery(name = "DmHadrClusterMembers.findByMemberType", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.memberType = :memberType"),
    @NamedQuery(name = "DmHadrClusterMembers.findByMemberTypeDesc", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.memberTypeDesc = :memberTypeDesc"),
    @NamedQuery(name = "DmHadrClusterMembers.findByMemberState", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.memberState = :memberState"),
    @NamedQuery(name = "DmHadrClusterMembers.findByMemberStateDesc", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.memberStateDesc = :memberStateDesc"),
    @NamedQuery(name = "DmHadrClusterMembers.findByNumberOfQuorumVotes", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.numberOfQuorumVotes = :numberOfQuorumVotes"),
    @NamedQuery(name = "DmHadrClusterMembers.findByNumberOfCurrentVotes", query = "SELECT d FROM DmHadrClusterMembers d WHERE d.numberOfCurrentVotes = :numberOfCurrentVotes")})
public class DmHadrClusterMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "member_name")
    private String memberName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "member_type")
    private short memberType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "member_type_desc")
    private String memberTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "member_state")
    private short memberState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "member_state_desc")
    private String memberStateDesc;
    @Column(name = "number_of_quorum_votes")
    private Integer numberOfQuorumVotes;
    @Column(name = "number_of_current_votes")
    private Integer numberOfCurrentVotes;

    public DmHadrClusterMembers() {
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public short getMemberType() {
        return memberType;
    }

    public void setMemberType(short memberType) {
        this.memberType = memberType;
    }

    public String getMemberTypeDesc() {
        return memberTypeDesc;
    }

    public void setMemberTypeDesc(String memberTypeDesc) {
        this.memberTypeDesc = memberTypeDesc;
    }

    public short getMemberState() {
        return memberState;
    }

    public void setMemberState(short memberState) {
        this.memberState = memberState;
    }

    public String getMemberStateDesc() {
        return memberStateDesc;
    }

    public void setMemberStateDesc(String memberStateDesc) {
        this.memberStateDesc = memberStateDesc;
    }

    public Integer getNumberOfQuorumVotes() {
        return numberOfQuorumVotes;
    }

    public void setNumberOfQuorumVotes(Integer numberOfQuorumVotes) {
        this.numberOfQuorumVotes = numberOfQuorumVotes;
    }

    public Integer getNumberOfCurrentVotes() {
        return numberOfCurrentVotes;
    }

    public void setNumberOfCurrentVotes(Integer numberOfCurrentVotes) {
        this.numberOfCurrentVotes = numberOfCurrentVotes;
    }
    
}
