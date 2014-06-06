/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set Executed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getChangeLogFile <em>Change Log File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetExecutedType()
 * @model extendedMetaData="name='changeSetExecuted_._type' kind='empty'"
 * @generated
 */
public interface ChangeSetExecutedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetExecutedType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Change Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log File</em>' attribute.
	 * @see #setChangeLogFile(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetExecutedType_ChangeLogFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='changeLogFile'"
	 * @generated
	 */
	String getChangeLogFile();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getChangeLogFile <em>Change Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log File</em>' attribute.
	 * @see #getChangeLogFile()
	 * @generated
	 */
	void setChangeLogFile(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetExecutedType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ChangeSetExecutedType
