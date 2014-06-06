/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getColumnDataType <em>Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getNewColumnName <em>New Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getOldColumnName <em>Old Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType()
 * @model extendedMetaData="name='renameColumn_._type' kind='empty'"
 * @generated
 */
public interface RenameColumnType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Data Type</em>' attribute.
	 * @see #setColumnDataType(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_ColumnDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='columnDataType'"
	 * @generated
	 */
	String getColumnDataType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getColumnDataType <em>Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Data Type</em>' attribute.
	 * @see #getColumnDataType()
	 * @generated
	 */
	void setColumnDataType(String value);

	/**
	 * Returns the value of the '<em><b>New Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Column Name</em>' attribute.
	 * @see #setNewColumnName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_NewColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='newColumnName'"
	 * @generated
	 */
	String getNewColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getNewColumnName <em>New Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Column Name</em>' attribute.
	 * @see #getNewColumnName()
	 * @generated
	 */
	void setNewColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Old Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Column Name</em>' attribute.
	 * @see #setOldColumnName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_OldColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oldColumnName'"
	 * @generated
	 */
	String getOldColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getOldColumnName <em>Old Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Column Name</em>' attribute.
	 * @see #getOldColumnName()
	 * @generated
	 */
	void setOldColumnName(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_Remarks()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='remarks'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameColumnType_TableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tableName'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // RenameColumnType
