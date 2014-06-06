/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Change Log Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getChangeSet <em>Change Set</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getLogicalFilePath <em>Logical File Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType()
 * @model extendedMetaData="name='databaseChangeLog_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabaseChangeLogType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #setPreConditions(PreConditionsType1)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_PreConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	PreConditionsType1 getPreConditions();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getPreConditions <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #getPreConditions()
	 * @generated
	 */
	void setPreConditions(PreConditionsType1 value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Change Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ChangeSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_ChangeSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeSet' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<ChangeSetType> getChangeSet();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_Include()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<IncludeType> getInclude();

	/**
	 * Returns the value of the '<em><b>Include All</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.IncludeAllType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include All</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include All</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_IncludeAll()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='includeAll' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<IncludeAllType> getIncludeAll();

	/**
	 * Returns the value of the '<em><b>Logical File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical File Path</em>' attribute.
	 * @see #setLogicalFilePath(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_LogicalFilePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logicalFilePath'"
	 * @generated
	 */
	String getLogicalFilePath();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getLogicalFilePath <em>Logical File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical File Path</em>' attribute.
	 * @see #getLogicalFilePath()
	 * @generated
	 */
	void setLogicalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Object Quoting Strategy</b></em>' attribute.
	 * The default value is <code>"LEGACY"</code>.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Quoting Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Quoting Strategy</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @see #isSetObjectQuotingStrategy()
	 * @see #unsetObjectQuotingStrategy()
	 * @see #setObjectQuotingStrategy(ObjectQuotingStrategy)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_ObjectQuotingStrategy()
	 * @model default="LEGACY" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='objectQuotingStrategy'"
	 * @generated
	 */
	ObjectQuotingStrategy getObjectQuotingStrategy();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Quoting Strategy</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @see #isSetObjectQuotingStrategy()
	 * @see #unsetObjectQuotingStrategy()
	 * @see #getObjectQuotingStrategy()
	 * @generated
	 */
	void setObjectQuotingStrategy(ObjectQuotingStrategy value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectQuotingStrategy()
	 * @see #getObjectQuotingStrategy()
	 * @see #setObjectQuotingStrategy(ObjectQuotingStrategy)
	 * @generated
	 */
	void unsetObjectQuotingStrategy();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Quoting Strategy</em>' attribute is set.
	 * @see #unsetObjectQuotingStrategy()
	 * @see #getObjectQuotingStrategy()
	 * @see #setObjectQuotingStrategy(ObjectQuotingStrategy)
	 * @generated
	 */
	boolean isSetObjectQuotingStrategy();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDatabaseChangeLogType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DatabaseChangeLogType
