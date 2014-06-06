/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Foreign Key Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableName <em>Base Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableSchemaName <em>Base Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getConstraintName <em>Constraint Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDropForeignKeyConstraintType()
 * @model extendedMetaData="name='dropForeignKeyConstraint_._type' kind='empty'"
 * @generated
 */
public interface DropForeignKeyConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Table Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Table Catalog Name</em>' attribute.
	 * @see #setBaseTableCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDropForeignKeyConstraintType_BaseTableCatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='baseTableCatalogName'"
	 * @generated
	 */
	String getBaseTableCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Table Catalog Name</em>' attribute.
	 * @see #getBaseTableCatalogName()
	 * @generated
	 */
	void setBaseTableCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Base Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Table Name</em>' attribute.
	 * @see #setBaseTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDropForeignKeyConstraintType_BaseTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='baseTableName'"
	 * @generated
	 */
	String getBaseTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableName <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Table Name</em>' attribute.
	 * @see #getBaseTableName()
	 * @generated
	 */
	void setBaseTableName(String value);

	/**
	 * Returns the value of the '<em><b>Base Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Table Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Table Schema Name</em>' attribute.
	 * @see #setBaseTableSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDropForeignKeyConstraintType_BaseTableSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='baseTableSchemaName'"
	 * @generated
	 */
	String getBaseTableSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableSchemaName <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Table Schema Name</em>' attribute.
	 * @see #getBaseTableSchemaName()
	 * @generated
	 */
	void setBaseTableSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDropForeignKeyConstraintType_ConstraintName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='constraintName'"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

} // DropForeignKeyConstraintType
