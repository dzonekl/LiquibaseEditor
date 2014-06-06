/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueComputed <em>Default Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueNumeric <em>Default Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getHeader <em>Header</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getIndex <em>Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getName <em>Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1()
 * @model extendedMetaData="name='column_._1_._type' kind='empty'"
 * @generated
 */
public interface ColumnType1 extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see #setDefaultValueBoolean(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_DefaultValueBoolean()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='defaultValueBoolean'"
	 * @generated
	 */
	Object getDefaultValueBoolean();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueBoolean <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Boolean</em>' attribute.
	 * @see #getDefaultValueBoolean()
	 * @generated
	 */
	void setDefaultValueBoolean(Object value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_DefaultValueComputed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueComputed'"
	 * @generated
	 */
	String getDefaultValueComputed();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueComputed <em>Default Value Computed</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_DefaultValueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueDate'"
	 * @generated
	 */
	String getDefaultValueDate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueDate <em>Default Value Date</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_DefaultValueNumeric()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueNumeric'"
	 * @generated
	 */
	String getDefaultValueNumeric();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueNumeric <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Numeric</em>' attribute.
	 * @see #getDefaultValueNumeric()
	 * @generated
	 */
	void setDefaultValueNumeric(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_Header()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='header'"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_Index()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.IntegerExp"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	Object getIndex();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType1_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ColumnType1
