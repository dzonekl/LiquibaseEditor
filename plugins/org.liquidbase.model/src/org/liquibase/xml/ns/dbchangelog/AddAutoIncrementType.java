/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Auto Increment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnDataType <em>Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getStartWith <em>Start With</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType()
 * @model extendedMetaData="name='addAutoIncrement_._type' kind='empty'"
 * @generated
 */
public interface AddAutoIncrementType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getCatalogName <em>Catalog Name</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_ColumnDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='columnDataType'"
	 * @generated
	 */
	String getColumnDataType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnDataType <em>Column Data Type</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_ColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='columnName'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment By</em>' attribute.
	 * @see #isSetIncrementBy()
	 * @see #unsetIncrementBy()
	 * @see #setIncrementBy(long)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_IncrementBy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='incrementBy'"
	 * @generated
	 */
	long getIncrementBy();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getIncrementBy <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment By</em>' attribute.
	 * @see #isSetIncrementBy()
	 * @see #unsetIncrementBy()
	 * @see #getIncrementBy()
	 * @generated
	 */
	void setIncrementBy(long value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getIncrementBy <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncrementBy()
	 * @see #getIncrementBy()
	 * @see #setIncrementBy(long)
	 * @generated
	 */
	void unsetIncrementBy();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getIncrementBy <em>Increment By</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Increment By</em>' attribute is set.
	 * @see #unsetIncrementBy()
	 * @see #getIncrementBy()
	 * @see #setIncrementBy(long)
	 * @generated
	 */
	boolean isSetIncrementBy();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Start With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start With</em>' attribute.
	 * @see #isSetStartWith()
	 * @see #unsetStartWith()
	 * @see #setStartWith(long)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_StartWith()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='startWith'"
	 * @generated
	 */
	long getStartWith();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getStartWith <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start With</em>' attribute.
	 * @see #isSetStartWith()
	 * @see #unsetStartWith()
	 * @see #getStartWith()
	 * @generated
	 */
	void setStartWith(long value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getStartWith <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartWith()
	 * @see #getStartWith()
	 * @see #setStartWith(long)
	 * @generated
	 */
	void unsetStartWith();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getStartWith <em>Start With</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start With</em>' attribute is set.
	 * @see #unsetStartWith()
	 * @see #getStartWith()
	 * @see #setStartWith(long)
	 * @generated
	 */
	boolean isSetStartWith();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddAutoIncrementType_TableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tableName'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // AddAutoIncrementType
