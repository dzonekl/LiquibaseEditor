/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Lookup Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingColumnName <em>Existing Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableCatalogName <em>Existing Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableName <em>Existing Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableSchemaName <em>Existing Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnDataType <em>New Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnName <em>New Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableCatalogName <em>New Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableName <em>New Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableSchemaName <em>New Table Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType()
 * @model extendedMetaData="name='addLookupTable_._type' kind='empty'"
 * @generated
 */
public interface AddLookupTableType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_ConstraintName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='constraintName'"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

	/**
	 * Returns the value of the '<em><b>Existing Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Column Name</em>' attribute.
	 * @see #setExistingColumnName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_ExistingColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='existingColumnName'"
	 * @generated
	 */
	String getExistingColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingColumnName <em>Existing Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Column Name</em>' attribute.
	 * @see #getExistingColumnName()
	 * @generated
	 */
	void setExistingColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Existing Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Table Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Table Catalog Name</em>' attribute.
	 * @see #setExistingTableCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_ExistingTableCatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='existingTableCatalogName'"
	 * @generated
	 */
	String getExistingTableCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableCatalogName <em>Existing Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Table Catalog Name</em>' attribute.
	 * @see #getExistingTableCatalogName()
	 * @generated
	 */
	void setExistingTableCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Existing Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Table Name</em>' attribute.
	 * @see #setExistingTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_ExistingTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='existingTableName'"
	 * @generated
	 */
	String getExistingTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableName <em>Existing Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Table Name</em>' attribute.
	 * @see #getExistingTableName()
	 * @generated
	 */
	void setExistingTableName(String value);

	/**
	 * Returns the value of the '<em><b>Existing Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Table Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Table Schema Name</em>' attribute.
	 * @see #setExistingTableSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_ExistingTableSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='existingTableSchemaName'"
	 * @generated
	 */
	String getExistingTableSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableSchemaName <em>Existing Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Table Schema Name</em>' attribute.
	 * @see #getExistingTableSchemaName()
	 * @generated
	 */
	void setExistingTableSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>New Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Column Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Column Data Type</em>' attribute.
	 * @see #setNewColumnDataType(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_NewColumnDataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='newColumnDataType'"
	 * @generated
	 */
	String getNewColumnDataType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnDataType <em>New Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Column Data Type</em>' attribute.
	 * @see #getNewColumnDataType()
	 * @generated
	 */
	void setNewColumnDataType(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_NewColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='newColumnName'"
	 * @generated
	 */
	String getNewColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnName <em>New Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Column Name</em>' attribute.
	 * @see #getNewColumnName()
	 * @generated
	 */
	void setNewColumnName(String value);

	/**
	 * Returns the value of the '<em><b>New Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Table Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Table Catalog Name</em>' attribute.
	 * @see #setNewTableCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_NewTableCatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='newTableCatalogName'"
	 * @generated
	 */
	String getNewTableCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableCatalogName <em>New Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Table Catalog Name</em>' attribute.
	 * @see #getNewTableCatalogName()
	 * @generated
	 */
	void setNewTableCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>New Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Table Name</em>' attribute.
	 * @see #setNewTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_NewTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='newTableName'"
	 * @generated
	 */
	String getNewTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableName <em>New Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Table Name</em>' attribute.
	 * @see #getNewTableName()
	 * @generated
	 */
	void setNewTableName(String value);

	/**
	 * Returns the value of the '<em><b>New Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Table Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Table Schema Name</em>' attribute.
	 * @see #setNewTableSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddLookupTableType_NewTableSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='newTableSchemaName'"
	 * @generated
	 */
	String getNewTableSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableSchemaName <em>New Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Table Schema Name</em>' attribute.
	 * @see #getNewTableSchemaName()
	 * @generated
	 */
	void setNewTableSchemaName(String value);

} // AddLookupTableType
