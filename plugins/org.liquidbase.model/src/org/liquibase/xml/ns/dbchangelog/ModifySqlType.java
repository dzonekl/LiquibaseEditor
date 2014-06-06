/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Sql Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getModifySqlChildren <em>Modify Sql Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getReplace <em>Replace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getRegExpReplace <em>Reg Exp Replace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getPrepend <em>Prepend</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getAppend <em>Append</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getApplyToRollback <em>Apply To Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getContext <em>Context</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getDbms <em>Dbms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType()
 * @model extendedMetaData="name='modifySql_._type' kind='elementOnly'"
 * @generated
 */
public interface ModifySqlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modify Sql Children</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Sql Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Sql Children</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_ModifySqlChildren()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ModifySqlChildren:0'"
	 * @generated
	 */
	FeatureMap getModifySqlChildren();

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ReplaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_Replace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replace' namespace='##targetNamespace' group='#ModifySqlChildren:0'"
	 * @generated
	 */
	EList<ReplaceType> getReplace();

	/**
	 * Returns the value of the '<em><b>Reg Exp Replace</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RegExpReplaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Exp Replace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Exp Replace</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_RegExpReplace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regExpReplace' namespace='##targetNamespace' group='#ModifySqlChildren:0'"
	 * @generated
	 */
	EList<RegExpReplaceType> getRegExpReplace();

	/**
	 * Returns the value of the '<em><b>Prepend</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.PrependType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepend</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_Prepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prepend' namespace='##targetNamespace' group='#ModifySqlChildren:0'"
	 * @generated
	 */
	EList<PrependType> getPrepend();

	/**
	 * Returns the value of the '<em><b>Append</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AppendType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Append</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Append</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_Append()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='append' namespace='##targetNamespace' group='#ModifySqlChildren:0'"
	 * @generated
	 */
	EList<AppendType> getAppend();

	/**
	 * Returns the value of the '<em><b>Apply To Rollback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply To Rollback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Rollback</em>' attribute.
	 * @see #setApplyToRollback(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_ApplyToRollback()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='applyToRollback'"
	 * @generated
	 */
	Object getApplyToRollback();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getApplyToRollback <em>Apply To Rollback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Rollback</em>' attribute.
	 * @see #getApplyToRollback()
	 * @generated
	 */
	void setApplyToRollback(Object value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_Context()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='context'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' attribute.
	 * @see #setDbms(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getModifySqlType_Dbms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dbms'"
	 * @generated
	 */
	String getDbms();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getDbms <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbms</em>' attribute.
	 * @see #getDbms()
	 * @generated
	 */
	void setDbms(String value);

} // ModifySqlType
