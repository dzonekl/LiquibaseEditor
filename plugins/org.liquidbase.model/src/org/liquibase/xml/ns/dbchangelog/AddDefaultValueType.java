/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Default Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnDataType <em>Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueComputed <em>Default Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueNumeric <em>Default Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType()
 * @model extendedMetaData="name='addDefaultValue_._type' kind='empty'"
 * @generated
 */
public interface AddDefaultValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Name</em>' attribute.
	 * @see #setCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Data Type</em>' attribute.
	 * @see #setColumnDataType(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_ColumnDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='columnDataType'"
	 * @generated
	 */
	String getColumnDataType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnDataType <em>Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Data Type</em>' attribute.
	 * @see #getColumnDataType()
	 * @generated
	 */
	void setColumnDataType(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_ColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='columnName'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Boolean</em>' attribute.
	 * @see #setDefaultValueBoolean(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_DefaultValueBoolean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueBoolean'"
	 * @generated
	 */
	String getDefaultValueBoolean();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueBoolean <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Boolean</em>' attribute.
	 * @see #getDefaultValueBoolean()
	 * @generated
	 */
	void setDefaultValueBoolean(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Computed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Computed</em>' attribute.
	 * @see #setDefaultValueComputed(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_DefaultValueComputed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueComputed'"
	 * @generated
	 */
	String getDefaultValueComputed();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueComputed <em>Default Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Computed</em>' attribute.
	 * @see #getDefaultValueComputed()
	 * @generated
	 */
	void setDefaultValueComputed(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Date</em>' attribute.
	 * @see #setDefaultValueDate(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_DefaultValueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueDate'"
	 * @generated
	 */
	String getDefaultValueDate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueDate <em>Default Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date</em>' attribute.
	 * @see #getDefaultValueDate()
	 * @generated
	 */
	void setDefaultValueDate(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Numeric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Numeric</em>' attribute.
	 * @see #setDefaultValueNumeric(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_DefaultValueNumeric()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueNumeric'"
	 * @generated
	 */
	String getDefaultValueNumeric();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueNumeric <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Numeric</em>' attribute.
	 * @see #getDefaultValueNumeric()
	 * @generated
	 */
	void setDefaultValueNumeric(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Sequence Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Sequence Next</em>' attribute.
	 * @see #setDefaultValueSequenceNext(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_DefaultValueSequenceNext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueSequenceNext'"
	 * @generated
	 */
	String getDefaultValueSequenceNext();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Sequence Next</em>' attribute.
	 * @see #getDefaultValueSequenceNext()
	 * @generated
	 */
	void setDefaultValueSequenceNext(String value);

	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddDefaultValueType_TableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tableName'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // AddDefaultValueType
