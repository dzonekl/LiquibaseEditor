/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ReplaceType#getReplace <em>Replace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ReplaceType#getWith <em>With</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getReplaceType()
 * @model extendedMetaData="name='replace_._type' kind='empty'"
 * @generated
 */
public interface ReplaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' attribute.
	 * @see #setReplace(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getReplaceType_Replace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='replace'"
	 * @generated
	 */
	String getReplace();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ReplaceType#getReplace <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace</em>' attribute.
	 * @see #getReplace()
	 * @generated
	 */
	void setReplace(String value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' attribute.
	 * @see #setWith(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getReplaceType_With()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='with'"
	 * @generated
	 */
	String getWith();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ReplaceType#getWith <em>With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' attribute.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(String value);

} // ReplaceType
