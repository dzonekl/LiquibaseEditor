/**
 */
package org.liquibase.xml.ns.dbchangelog;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getAfterColumn <em>After Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getBeforeColumn <em>Before Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType4()
 * @model extendedMetaData="name='column_._3_._type' kind='mixed'"
 * @generated
 */
public interface ColumnType4 extends ColumnType2 {
	/**
	 * Returns the value of the '<em><b>After Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Column</em>' attribute.
	 * @see #setAfterColumn(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType4_AfterColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='afterColumn'"
	 * @generated
	 */
	String getAfterColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getAfterColumn <em>After Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Column</em>' attribute.
	 * @see #getAfterColumn()
	 * @generated
	 */
	void setAfterColumn(String value);

	/**
	 * Returns the value of the '<em><b>Before Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Column</em>' attribute.
	 * @see #setBeforeColumn(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType4_BeforeColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beforeColumn'"
	 * @generated
	 */
	String getBeforeColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getBeforeColumn <em>Before Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Column</em>' attribute.
	 * @see #getBeforeColumn()
	 * @generated
	 */
	void setBeforeColumn(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BigInteger)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getColumnType4_Position()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	BigInteger getPosition();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BigInteger value);

} // ColumnType4
