/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSequenceName <em>Sequence Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getStartValue <em>Start Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType()
 * @model extendedMetaData="name='alterSequence_._type' kind='empty'"
 * @generated
 */
public interface AlterSequenceType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment By</em>' attribute.
	 * @see #setIncrementBy(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_IncrementBy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='incrementBy'"
	 * @generated
	 */
	String getIncrementBy();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getIncrementBy <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment By</em>' attribute.
	 * @see #getIncrementBy()
	 * @generated
	 */
	void setIncrementBy(String value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_MaxValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxValue'"
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_MinValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='minValue'"
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_Ordered()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='ordered'"
	 * @generated
	 */
	Object getOrdered();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #getOrdered()
	 * @generated
	 */
	void setOrdered(Object value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Name</em>' attribute.
	 * @see #setSequenceName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_SequenceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='sequenceName'"
	 * @generated
	 */
	String getSequenceName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSequenceName <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Name</em>' attribute.
	 * @see #getSequenceName()
	 * @generated
	 */
	void setSequenceName(String value);

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' attribute.
	 * @see #setStartValue(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAlterSequenceType_StartValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='startValue'"
	 * @generated
	 */
	String getStartValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(String value);

} // AlterSequenceType
