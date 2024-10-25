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
@Table(name = "system_parameters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemParameters.findAll", query = "SELECT s FROM SystemParameters s"),
    @NamedQuery(name = "SystemParameters.findByObjectId", query = "SELECT s FROM SystemParameters s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SystemParameters.findByName", query = "SELECT s FROM SystemParameters s WHERE s.name = :name"),
    @NamedQuery(name = "SystemParameters.findByParameterId", query = "SELECT s FROM SystemParameters s WHERE s.parameterId = :parameterId"),
    @NamedQuery(name = "SystemParameters.findBySystemTypeId", query = "SELECT s FROM SystemParameters s WHERE s.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "SystemParameters.findByUserTypeId", query = "SELECT s FROM SystemParameters s WHERE s.userTypeId = :userTypeId"),
    @NamedQuery(name = "SystemParameters.findByMaxLength", query = "SELECT s FROM SystemParameters s WHERE s.maxLength = :maxLength"),
    @NamedQuery(name = "SystemParameters.findByPrecision", query = "SELECT s FROM SystemParameters s WHERE s.precision = :precision"),
    @NamedQuery(name = "SystemParameters.findByScale", query = "SELECT s FROM SystemParameters s WHERE s.scale = :scale"),
    @NamedQuery(name = "SystemParameters.findByIsOutput", query = "SELECT s FROM SystemParameters s WHERE s.isOutput = :isOutput"),
    @NamedQuery(name = "SystemParameters.findByIsCursorRef", query = "SELECT s FROM SystemParameters s WHERE s.isCursorRef = :isCursorRef"),
    @NamedQuery(name = "SystemParameters.findByHasDefaultValue", query = "SELECT s FROM SystemParameters s WHERE s.hasDefaultValue = :hasDefaultValue"),
    @NamedQuery(name = "SystemParameters.findByIsXmlDocument", query = "SELECT s FROM SystemParameters s WHERE s.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "SystemParameters.findByDefaultValue", query = "SELECT s FROM SystemParameters s WHERE s.defaultValue = :defaultValue"),
    @NamedQuery(name = "SystemParameters.findByXmlCollectionId", query = "SELECT s FROM SystemParameters s WHERE s.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "SystemParameters.findByIsReadonly", query = "SELECT s FROM SystemParameters s WHERE s.isReadonly = :isReadonly"),
    @NamedQuery(name = "SystemParameters.findByIsNullable", query = "SELECT s FROM SystemParameters s WHERE s.isNullable = :isNullable"),
    @NamedQuery(name = "SystemParameters.findByEncryptionType", query = "SELECT s FROM SystemParameters s WHERE s.encryptionType = :encryptionType"),
    @NamedQuery(name = "SystemParameters.findByEncryptionTypeDesc", query = "SELECT s FROM SystemParameters s WHERE s.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "SystemParameters.findByEncryptionAlgorithmName", query = "SELECT s FROM SystemParameters s WHERE s.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "SystemParameters.findByColumnEncryptionKeyId", query = "SELECT s FROM SystemParameters s WHERE s.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "SystemParameters.findByColumnEncryptionKeyDatabaseName", query = "SELECT s FROM SystemParameters s WHERE s.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName")})
public class SystemParameters implements Serializable {

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

    public SystemParameters() {
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
