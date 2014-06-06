/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getName <em>Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValue <em>Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueComputed <em>Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueNumeric <em>Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceCurrent <em>Value Sequence Current</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceNext <em>Value Sequence Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType()
 * @model extendedMetaData="name='param_._type' kind='empty'"
 * @generated
 */
public interface ParamType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' attribute.
	 * @see #setValueBoolean(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_ValueBoolean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueBoolean'"
	 * @generated
	 */
	String getValueBoolean();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueBoolean <em>Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' attribute.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(String value);

	/**
	 * Returns the value of the '<em><b>Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Computed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Computed</em>' attribute.
	 * @see #setValueComputed(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_ValueComputed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueComputed'"
	 * @generated
	 */
	String getValueComputed();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueComputed <em>Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Computed</em>' attribute.
	 * @see #getValueComputed()
	 * @generated
	 */
	void setValueComputed(String value);

	/**
	 * Returns the value of the '<em><b>Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date</em>' attribute.
	 * @see #setValueDate(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_ValueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueDate'"
	 * @generated
	 */
	String getValueDate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueDate <em>Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date</em>' attribute.
	 * @see #getValueDate()
	 * @generated
	 */
	void setValueDate(String value);

	/**
	 * Returns the value of the '<em><b>Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Numeric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Numeric</em>' attribute.
	 * @see #setValueNumeric(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_ValueNumeric()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueNumeric'"
	 * @generated
	 */
	String getValueNumeric();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueNumeric <em>Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Numeric</em>' attribute.
	 * @see #getValueNumeric()
	 * @generated
	 */
	void setValueNumeric(String value);

	/**
	 * Returns the value of the '<em><b>Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence Current</em>' attribute.
	 * @see #setValueSequenceCurrent(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_ValueSequenceCurrent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueSequenceCurrent'"
	 * @generated
	 */
	String getValueSequenceCurrent();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceCurrent <em>Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Sequence Current</em>' attribute.
	 * @see #getValueSequenceCurrent()
	 * @generated
	 */
	void setValueSequenceCurrent(String value);

	/**
	 * Returns the value of the '<em><b>Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence Next</em>' attribute.
	 * @see #setValueSequenceNext(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getParamType_ValueSequenceNext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueSequenceNext'"
	 * @generated
	 */
	String getValueSequenceNext();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceNext <em>Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Sequence Next</em>' attribute.
	 * @see #getValueSequenceNext()
	 * @generated
	 */
	void setValueSequenceNext(String value);

} // ParamType
