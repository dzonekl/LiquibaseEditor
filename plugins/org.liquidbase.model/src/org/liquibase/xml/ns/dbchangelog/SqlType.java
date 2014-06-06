/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlType#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlType#getEndDelimiter <em>End Delimiter</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlType#getSplitStatements <em>Split Statements</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlType#getStripComments <em>Strip Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType()
 * @model extendedMetaData="name='sql_._type' kind='mixed'"
 * @generated
 */
public interface SqlType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType_Dbms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dbms'"
	 * @generated
	 */
	String getDbms();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getDbms <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbms</em>' attribute.
	 * @see #getDbms()
	 * @generated
	 */
	void setDbms(String value);

	/**
	 * Returns the value of the '<em><b>End Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Delimiter</em>' attribute.
	 * @see #setEndDelimiter(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType_EndDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endDelimiter'"
	 * @generated
	 */
	String getEndDelimiter();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getEndDelimiter <em>End Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Delimiter</em>' attribute.
	 * @see #getEndDelimiter()
	 * @generated
	 */
	void setEndDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Split Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Statements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Statements</em>' attribute.
	 * @see #setSplitStatements(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType_SplitStatements()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='splitStatements'"
	 * @generated
	 */
	Object getSplitStatements();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getSplitStatements <em>Split Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Statements</em>' attribute.
	 * @see #getSplitStatements()
	 * @generated
	 */
	void setSplitStatements(Object value);

	/**
	 * Returns the value of the '<em><b>Strip Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strip Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip Comments</em>' attribute.
	 * @see #setStripComments(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlType_StripComments()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='stripComments'"
	 * @generated
	 */
	Object getStripComments();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getStripComments <em>Strip Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strip Comments</em>' attribute.
	 * @see #getStripComments()
	 * @generated
	 */
	void setStripComments(Object value);

} // SqlType
