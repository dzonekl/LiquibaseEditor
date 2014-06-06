/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Constraint Exists Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyName <em>Foreign Key Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyTableName <em>Foreign Key Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getSchemaName <em>Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getForeignKeyConstraintExistsType()
 * @model extendedMetaData="name='foreignKeyConstraintExists_._type' kind='empty'"
 * @generated
 */
public interface ForeignKeyConstraintExistsType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getForeignKeyConstraintExistsType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #setForeignKeyName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getForeignKeyConstraintExistsType_ForeignKeyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreignKeyName'"
	 * @generated
	 */
	String getForeignKeyName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyName <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #getForeignKeyName()
	 * @generated
	 */
	void setForeignKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Table Name</em>' attribute.
	 * @see #setForeignKeyTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getForeignKeyConstraintExistsType_ForeignKeyTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreignKeyTableName'"
	 * @generated
	 */
	String getForeignKeyTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyTableName <em>Foreign Key Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Table Name</em>' attribute.
	 * @see #getForeignKeyTableName()
	 * @generated
	 */
	void setForeignKeyTableName(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getForeignKeyConstraintExistsType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

} // ForeignKeyConstraintExistsType
