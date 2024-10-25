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
@Table(name = "all_parameters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllParameters.findAll", query = "SELECT a FROM AllParameters a"),
    @NamedQuery(name = "AllParameters.findByObjectId", query = "SELECT a FROM AllParameters a WHERE a.objectId = :objectId"),
    @NamedQuery(name = "AllParameters.findByName", query = "SELECT a FROM AllParameters a WHERE a.name = :name"),
    @NamedQuery(name = "AllParameters.findByParameterId", query = "SELECT a FROM AllParameters a WHERE a.parameterId = :parameterId"),
    @NamedQuery(name = "AllParameters.findBySystemTypeId", query = "SELECT a FROM AllParameters a WHERE a.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "AllParameters.findByUserTypeId", query = "SELECT a FROM AllParameters a WHERE a.userTypeId = :userTypeId"),
    @NamedQuery(name = "AllParameters.findByMaxLength", query = "SELECT a FROM AllParameters a WHERE a.maxLength = :maxLength"),
    @NamedQuery(name = "AllParameters.findByPrecision", query = "SELECT a FROM AllParameters a WHERE a.precision = :precision"),
    @NamedQuery(name = "AllParameters.findByScale", query = "SELECT a FROM AllParameters a WHERE a.scale = :scale"),
    @NamedQuery(name = "AllParameters.findByIsOutput", query = "SELECT a FROM AllParameters a WHERE a.isOutput = :isOutput"),
    @NamedQuery(name = "AllParameters.findByIsCursorRef", query = "SELECT a FROM AllParameters a WHERE a.isCursorRef = :isCursorRef"),
    @NamedQuery(name = "AllParameters.findByHasDefaultValue", query = "SELECT a FROM AllParameters a WHERE a.hasDefaultValue = :hasDefaultValue"),
    @NamedQuery(name = "AllParameters.findByIsXmlDocument", query = "SELECT a FROM AllParameters a WHERE a.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "AllParameters.findByDefaultValue", query = "SELECT a FROM AllParameters a WHERE a.defaultValue = :defaultValue"),
    @NamedQuery(name = "AllParameters.findByXmlCollectionId", query = "SELECT a FROM AllParameters a WHERE a.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "AllParameters.findByIsReadonly", query = "SELECT a FROM AllParameters a WHERE a.isReadonly = :isReadonly"),
    @NamedQuery(name = "AllParameters.findByIsNullable", query = "SELECT a FROM AllParameters a WHERE a.isNullable = :isNullable"),
    @NamedQuery(name = "AllParameters.findByEncryptionType", query = "SELECT a FROM AllParameters a WHERE a.encryptionType = :encryptionType"),
    @NamedQuery(name = "AllParameters.findByEncryptionTypeDesc", query = "SELECT a FROM AllParameters a WHERE a.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "AllParameters.findByEncryptionAlgorithmName", query = "SELECT a FROM AllParameters a WHERE a.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "AllParameters.findByColumnEncryptionKeyId", query = "SELECT a FROM AllParameters a WHERE a.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "AllParameters.findByColumnEncryptionKeyDatabaseName", query = "SELECT a FROM AllParameters a WHERE a.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName")})
public class AllParameters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parameter_id")
    private int parameterId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_type_id")
    private short systemTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type_id")
    private int userTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_length")
    private short maxLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precision")
    private short precision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scale")
    private short scale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_output")
    private boolean isOutput;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_cursor_ref")
    private boolean isCursorRef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_default_value")
    private boolean hasDefaultValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_xml_document")
    private boolean isXmlDocument;
    @Column(name = "default_value")
    private Serializable defaultValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_readonly")
    private boolean isReadonly;
    @Column(name = "is_nullable")
    private Boolean isNullable;
    @Column(name = "encryption_type")
    private Integer encryptionType;
    @Size(max = 64)
    @Column(name = "encryption_type_desc")
    private String encryptionTypeDesc;
    @Size(max = 128)
    @Column(name = "encryption_algorithm_name")
    private String encryptionAlgorithmName;
    @Column(name = "column_encryption_key_id")
    private Integer columnEncryptionKeyId;
    @Size(max = 128)
    @Column(name = "column_encryption_key_database_name")
    private String columnEncryptionKeyDatabaseName;

    public AllParameters() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public short getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(short systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public short getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(short maxLength) {
        this.maxLength = maxLength;
    }

    public short getPrecision() {
        return precision;
    }

    public void setPrecision(short precision) {
        this.precision = precision;
    }

    public short getScale() {
        return scale;
    }

    public void setScale(short scale) {
        this.scale = scale;
    }

    public boolean getIsOutput() {
        return isOutput;
    }

    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    public boolean getIsCursorRef() {
        return isCursorRef;
    }

    public void setIsCursorRef(boolean isCursorRef) {
        this.isCursorRef = isCursorRef;
    }

    public boolean getHasDefaultValue() {
        return hasDefaultValue;
    }

    public void setHasDefaultValue(boolean hasDefaultValue) {
        this.hasDefaultValue = hasDefaultValue;
    }

    public boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public Serializable getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Serializable defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public boolean getIsReadonly() {
        return isReadonly;
    }

    public void setIsReadonly(boolean isReadonly) {
        this.isReadonly = isReadonly;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Integer getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(Integer encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getEncryptionTypeDesc() {
        return encryptionTypeDesc;
    }

    public void setEncryptionTypeDesc(String encryptionTypeDesc) {
        this.encryptionTypeDesc = encryptionTypeDesc;
    }

    public String getEncryptionAlgorithmName() {
        return encryptionAlgorithmName;
    }

    public void setEncryptionAlgorithmName(String encryptionAlgorithmName) {
        this.encryptionAlgorithmName = encryptionAlgorithmName;
    }

    public Integer getColumnEncryptionKeyId() {
        return columnEncryptionKeyId;
    }

    public void setColumnEncryptionKeyId(Integer columnEncryptionKeyId) {
        this.columnEncryptionKeyId = columnEncryptionKeyId;
    }

    public String getColumnEncryptionKeyDatabaseName() {
        return columnEncryptionKeyDatabaseName;
    }

    public void setColumnEncryptionKeyDatabaseName(String columnEncryptionKeyDatabaseName) {
        this.columnEncryptionKeyDatabaseName = columnEncryptionKeyDatabaseName;
    }
    
}
