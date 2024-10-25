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
@Table(name = "spatial_index_tessellations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpatialIndexTessellations.findAll", query = "SELECT s FROM SpatialIndexTessellations s"),
    @NamedQuery(name = "SpatialIndexTessellations.findByObjectId", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SpatialIndexTessellations.findByIndexId", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.indexId = :indexId"),
    @NamedQuery(name = "SpatialIndexTessellations.findByTessellationScheme", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.tessellationScheme = :tessellationScheme"),
    @NamedQuery(name = "SpatialIndexTessellations.findByBoundingBoxXmin", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.boundingBoxXmin = :boundingBoxXmin"),
    @NamedQuery(name = "SpatialIndexTessellations.findByBoundingBoxYmin", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.boundingBoxYmin = :boundingBoxYmin"),
    @NamedQuery(name = "SpatialIndexTessellations.findByBoundingBoxXmax", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.boundingBoxXmax = :boundingBoxXmax"),
    @NamedQuery(name = "SpatialIndexTessellations.findByBoundingBoxYmax", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.boundingBoxYmax = :boundingBoxYmax"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel1Grid", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level1Grid = :level1Grid"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel1GridDesc", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level1GridDesc = :level1GridDesc"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel2Grid", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level2Grid = :level2Grid"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel2GridDesc", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level2GridDesc = :level2GridDesc"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel3Grid", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level3Grid = :level3Grid"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel3GridDesc", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level3GridDesc = :level3GridDesc"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel4Grid", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level4Grid = :level4Grid"),
    @NamedQuery(name = "SpatialIndexTessellations.findByLevel4GridDesc", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.level4GridDesc = :level4GridDesc"),
    @NamedQuery(name = "SpatialIndexTessellations.findByCellsPerObject", query = "SELECT s FROM SpatialIndexTessellations s WHERE s.cellsPerObject = :cellsPerObject")})
public class SpatialIndexTessellations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Size(max = 60)
    @Column(name = "tessellation_scheme")
    private String tessellationScheme;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "bounding_box_xmin")
    private Double boundingBoxXmin;
    @Column(name = "bounding_box_ymin")
    private Double boundingBoxYmin;
    @Column(name = "bounding_box_xmax")
    private Double boundingBoxXmax;
    @Column(name = "bounding_box_ymax")
    private Double boundingBoxYmax;
    @Column(name = "level_1_grid")
    private Short level1Grid;
    @Size(max = 60)
    @Column(name = "level_1_grid_desc")
    private String level1GridDesc;
    @Column(name = "level_2_grid")
    private Short level2Grid;
    @Size(max = 60)
    @Column(name = "level_2_grid_desc")
    private String level2GridDesc;
    @Column(name = "level_3_grid")
    private Short level3Grid;
    @Size(max = 60)
    @Column(name = "level_3_grid_desc")
    private String level3GridDesc;
    @Column(name = "level_4_grid")
    private Short level4Grid;
    @Size(max = 60)
    @Column(name = "level_4_grid_desc")
    private String level4GridDesc;
    @Column(name = "cells_per_object")
    private Integer cellsPerObject;

    public SpatialIndexTessellations() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public String getTessellationScheme() {
        return tessellationScheme;
    }

    public void setTessellationScheme(String tessellationScheme) {
        this.tessellationScheme = tessellationScheme;
    }

    public Double getBoundingBoxXmin() {
        return boundingBoxXmin;
    }

    public void setBoundingBoxXmin(Double boundingBoxXmin) {
        this.boundingBoxXmin = boundingBoxXmin;
    }

    public Double getBoundingBoxYmin() {
        return boundingBoxYmin;
    }

    public void setBoundingBoxYmin(Double boundingBoxYmin) {
        this.boundingBoxYmin = boundingBoxYmin;
    }

    public Double getBoundingBoxXmax() {
        return boundingBoxXmax;
    }

    public void setBoundingBoxXmax(Double boundingBoxXmax) {
        this.boundingBoxXmax = boundingBoxXmax;
    }

    public Double getBoundingBoxYmax() {
        return boundingBoxYmax;
    }

    public void setBoundingBoxYmax(Double boundingBoxYmax) {
        this.boundingBoxYmax = boundingBoxYmax;
    }

    public Short getLevel1Grid() {
        return level1Grid;
    }

    public void setLevel1Grid(Short level1Grid) {
        this.level1Grid = level1Grid;
    }

    public String getLevel1GridDesc() {
        return level1GridDesc;
    }

    public void setLevel1GridDesc(String level1GridDesc) {
        this.level1GridDesc = level1GridDesc;
    }

    public Short getLevel2Grid() {
        return level2Grid;
    }

    public void setLevel2Grid(Short level2Grid) {
        this.level2Grid = level2Grid;
    }

    public String getLevel2GridDesc() {
        return level2GridDesc;
    }

    public void setLevel2GridDesc(String level2GridDesc) {
        this.level2GridDesc = level2GridDesc;
    }

    public Short getLevel3Grid() {
        return level3Grid;
    }

    public void setLevel3Grid(Short level3Grid) {
        this.level3Grid = level3Grid;
    }

    public String getLevel3GridDesc() {
        return level3GridDesc;
    }

    public void setLevel3GridDesc(String level3GridDesc) {
        this.level3GridDesc = level3GridDesc;
    }

    public Short getLevel4Grid() {
        return level4Grid;
    }

    public void setLevel4Grid(Short level4Grid) {
        this.level4Grid = level4Grid;
    }

    public String getLevel4GridDesc() {
        return level4GridDesc;
    }

    public void setLevel4GridDesc(String level4GridDesc) {
        this.level4GridDesc = level4GridDesc;
    }

    public Integer getCellsPerObject() {
        return cellsPerObject;
    }

    public void setCellsPerObject(Integer cellsPerObject) {
        this.cellsPerObject = cellsPerObject;
    }
    
}
