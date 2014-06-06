/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getAutoIncrement <em>Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueComputed <em>Default Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueNumeric <em>Default Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceCurrent <em>Default Value Sequence Current</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getName <em>Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getStartWith <em>Start With</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getType <em>Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValue <em>Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBlobFile <em>Value Blob File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueClobFile <em>Value Clob File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueComputed <em>Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueNumeric <em>Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceCurrent <em>Value Sequence Current</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceNext <em>Value Sequence Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType()
 * @model extendedMetaData="name='column_._type' kind='mixed'"
 * @generated
 */
public interface ColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Constraints()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Increment</em>' attribute.
	 * @see #setAutoIncrement(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_AutoIncrement()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='autoIncrement'"
	 * @generated
	 */
	Object getAutoIncrement();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getAutoIncrement <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Increment</em>' attribute.
	 * @see #getAutoIncrement()
	 * @generated
	 */
	void setAutoIncrement(Object value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValueBoolean()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='defaultValueBoolean'"
	 * @generated
	 */
	Object getDefaultValueBoolean();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueBoolean <em>Default Value Boolean</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValueComputed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueComputed'"
	 * @generated
	 */
	String getDefaultValueComputed();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueComputed <em>Default Value Computed</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueDate'"
	 * @generated
	 */
	String getDefaultValueDate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueDate <em>Default Value Date</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValueNumeric()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueNumeric'"
	 * @generated
	 */
	String getDefaultValueNumeric();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueNumeric <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Numeric</em>' attribute.
	 * @see #getDefaultValueNumeric()
	 * @generated
	 */
	void setDefaultValueNumeric(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Sequence Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Sequence Current</em>' attribute.
	 * @see #setDefaultValueSequenceCurrent(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValueSequenceCurrent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueSequenceCurrent'"
	 * @generated
	 */
	String getDefaultValueSequenceCurrent();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceCurrent <em>Default Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Sequence Current</em>' attribute.
	 * @see #getDefaultValueSequenceCurrent()
	 * @generated
	 */
	void setDefaultValueSequenceCurrent(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_DefaultValueSequenceNext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValueSequenceNext'"
	 * @generated
	 */
	String getDefaultValueSequenceNext();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Sequence Next</em>' attribute.
	 * @see #getDefaultValueSequenceNext()
	 * @generated
	 */
	void setDefaultValueSequenceNext(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_IncrementBy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='incrementBy'"
	 * @generated
	 */
	long getIncrementBy();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getIncrementBy <em>Increment By</em>}' attribute.
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
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getIncrementBy <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncrementBy()
	 * @see #getIncrementBy()
	 * @see #setIncrementBy(long)
	 * @generated
	 */
	void unsetIncrementBy();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getIncrementBy <em>Increment By</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Remarks()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='remarks'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_StartWith()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='startWith'"
	 * @generated
	 */
	long getStartWith();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getStartWith <em>Start With</em>}' attribute.
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
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getStartWith <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartWith()
	 * @see #getStartWith()
	 * @see #setStartWith(long)
	 * @generated
	 */
	void unsetStartWith();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getStartWith <em>Start With</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value Blob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Blob File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Blob File</em>' attribute.
	 * @see #setValueBlobFile(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueBlobFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueBlobFile'"
	 * @generated
	 */
	String getValueBlobFile();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBlobFile <em>Value Blob File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Blob File</em>' attribute.
	 * @see #getValueBlobFile()
	 * @generated
	 */
	void setValueBlobFile(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueBoolean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueBoolean'"
	 * @generated
	 */
	String getValueBoolean();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBoolean <em>Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' attribute.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(String value);

	/**
	 * Returns the value of the '<em><b>Value Clob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Clob File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Clob File</em>' attribute.
	 * @see #setValueClobFile(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueClobFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueClobFile'"
	 * @generated
	 */
	String getValueClobFile();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueClobFile <em>Value Clob File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Clob File</em>' attribute.
	 * @see #getValueClobFile()
	 * @generated
	 */
	void setValueClobFile(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueComputed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueComputed'"
	 * @generated
	 */
	String getValueComputed();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueComputed <em>Value Computed</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueDate'"
	 * @generated
	 */
	String getValueDate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueDate <em>Value Date</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueNumeric()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueNumeric'"
	 * @generated
	 */
	String getValueNumeric();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueNumeric <em>Value Numeric</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueSequenceCurrent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueSequenceCurrent'"
	 * @generated
	 */
	String getValueSequenceCurrent();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceCurrent <em>Value Sequence Current</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType_ValueSequenceNext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueSequenceNext'"
	 * @generated
	 */
	String getValueSequenceNext();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceNext <em>Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Sequence Next</em>' attribute.
	 * @see #getValueSequenceNext()
	 * @generated
	 */
	void setValueSequenceNext(String value);

} // ColumnType
