/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Foreign Key Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseColumnNames <em>Base Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableName <em>Base Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableSchemaName <em>Base Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeleteCascade <em>Delete Cascade</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getInitiallyDeferred <em>Initially Deferred</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedColumnNames <em>Referenced Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableCatalogName <em>Referenced Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableName <em>Referenced Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableSchemaName <em>Referenced Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencesUniqueColumn <em>References Unique Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType()
 * @model extendedMetaData="name='addForeignKeyConstraint_._type' kind='empty'"
 * @generated
 */
public interface AddForeignKeyConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Column Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Column Names</em>' attribute.
	 * @see #setBaseColumnNames(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_BaseColumnNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='baseColumnNames'"
	 * @generated
	 */
	String getBaseColumnNames();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseColumnNames <em>Base Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Column Names</em>' attribute.
	 * @see #getBaseColumnNames()
	 * @generated
	 */
	void setBaseColumnNames(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_BaseTableCatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='baseTableCatalogName'"
	 * @generated
	 */
	String getBaseTableCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_BaseTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='baseTableName'"
	 * @generated
	 */
	String getBaseTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableName <em>Base Table Name</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_BaseTableSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='baseTableSchemaName'"
	 * @generated
	 */
	String getBaseTableSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableSchemaName <em>Base Table Schema Name</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_ConstraintName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='constraintName'"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

	/**
	 * Returns the value of the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable</em>' attribute.
	 * @see #setDeferrable(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_Deferrable()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='deferrable'"
	 * @generated
	 */
	Object getDeferrable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeferrable <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrable</em>' attribute.
	 * @see #getDeferrable()
	 * @generated
	 */
	void setDeferrable(Object value);

	/**
	 * Returns the value of the '<em><b>Delete Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Cascade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Cascade</em>' attribute.
	 * @see #setDeleteCascade(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_DeleteCascade()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='deleteCascade'"
	 * @generated
	 */
	Object getDeleteCascade();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeleteCascade <em>Delete Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Cascade</em>' attribute.
	 * @see #getDeleteCascade()
	 * @generated
	 */
	void setDeleteCascade(Object value);

	/**
	 * Returns the value of the '<em><b>Initially Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initially Deferred</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initially Deferred</em>' attribute.
	 * @see #setInitiallyDeferred(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_InitiallyDeferred()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='initiallyDeferred'"
	 * @generated
	 */
	Object getInitiallyDeferred();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getInitiallyDeferred <em>Initially Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initially Deferred</em>' attribute.
	 * @see #getInitiallyDeferred()
	 * @generated
	 */
	void setInitiallyDeferred(Object value);

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @see #isSetOnDelete()
	 * @see #unsetOnDelete()
	 * @see #setOnDelete(FkCascadeActionOptions)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_OnDelete()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onDelete'"
	 * @generated
	 */
	FkCascadeActionOptions getOnDelete();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @see #isSetOnDelete()
	 * @see #unsetOnDelete()
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(FkCascadeActionOptions value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnDelete()
	 * @see #getOnDelete()
	 * @see #setOnDelete(FkCascadeActionOptions)
	 * @generated
	 */
	void unsetOnDelete();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnDelete <em>On Delete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Delete</em>' attribute is set.
	 * @see #unsetOnDelete()
	 * @see #getOnDelete()
	 * @see #setOnDelete(FkCascadeActionOptions)
	 * @generated
	 */
	boolean isSetOnDelete();

	/**
	 * Returns the value of the '<em><b>On Update</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @see #isSetOnUpdate()
	 * @see #unsetOnUpdate()
	 * @see #setOnUpdate(FkCascadeActionOptions)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_OnUpdate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onUpdate'"
	 * @generated
	 */
	FkCascadeActionOptions getOnUpdate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnUpdate <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @see #isSetOnUpdate()
	 * @see #unsetOnUpdate()
	 * @see #getOnUpdate()
	 * @generated
	 */
	void setOnUpdate(FkCascadeActionOptions value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnUpdate <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnUpdate()
	 * @see #getOnUpdate()
	 * @see #setOnUpdate(FkCascadeActionOptions)
	 * @generated
	 */
	void unsetOnUpdate();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnUpdate <em>On Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Update</em>' attribute is set.
	 * @see #unsetOnUpdate()
	 * @see #getOnUpdate()
	 * @see #setOnUpdate(FkCascadeActionOptions)
	 * @generated
	 */
	boolean isSetOnUpdate();

	/**
	 * Returns the value of the '<em><b>Referenced Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Column Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Column Names</em>' attribute.
	 * @see #setReferencedColumnNames(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_ReferencedColumnNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='referencedColumnNames'"
	 * @generated
	 */
	String getReferencedColumnNames();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedColumnNames <em>Referenced Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Column Names</em>' attribute.
	 * @see #getReferencedColumnNames()
	 * @generated
	 */
	void setReferencedColumnNames(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Table Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table Catalog Name</em>' attribute.
	 * @see #setReferencedTableCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_ReferencedTableCatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='referencedTableCatalogName'"
	 * @generated
	 */
	String getReferencedTableCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableCatalogName <em>Referenced Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table Catalog Name</em>' attribute.
	 * @see #getReferencedTableCatalogName()
	 * @generated
	 */
	void setReferencedTableCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table Name</em>' attribute.
	 * @see #setReferencedTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_ReferencedTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='referencedTableName'"
	 * @generated
	 */
	String getReferencedTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableName <em>Referenced Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table Name</em>' attribute.
	 * @see #getReferencedTableName()
	 * @generated
	 */
	void setReferencedTableName(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Table Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table Schema Name</em>' attribute.
	 * @see #setReferencedTableSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_ReferencedTableSchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='referencedTableSchemaName'"
	 * @generated
	 */
	String getReferencedTableSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableSchemaName <em>Referenced Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table Schema Name</em>' attribute.
	 * @see #getReferencedTableSchemaName()
	 * @generated
	 */
	void setReferencedTableSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>References Unique Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Unique Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Unique Column</em>' attribute.
	 * @see #setReferencesUniqueColumn(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getAddForeignKeyConstraintType_ReferencesUniqueColumn()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='referencesUniqueColumn'"
	 * @generated
	 */
	Object getReferencesUniqueColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencesUniqueColumn <em>References Unique Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References Unique Column</em>' attribute.
	 * @see #getReferencesUniqueColumn()
	 * @generated
	 */
	void setReferencesUniqueColumn(Object value);

} // AddForeignKeyConstraintType
