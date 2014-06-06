/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getCheckConstraint <em>Check Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeleteCascade <em>Delete Cascade</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getForeignKeyName <em>Foreign Key Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getInitiallyDeferred <em>Initially Deferred</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyName <em>Primary Key Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyTablespace <em>Primary Key Tablespace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedColumnNames <em>Referenced Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedTableName <em>Referenced Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferences <em>References</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUnique <em>Unique</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUniqueConstraintName <em>Unique Constraint Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType()
 * @model extendedMetaData="name='constraints_._type' kind='empty'"
 * @generated
 */
public interface ConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Check Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Constraint</em>' attribute.
	 * @see #setCheckConstraint(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_CheckConstraint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='checkConstraint'"
	 * @generated
	 */
	String getCheckConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getCheckConstraint <em>Check Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Constraint</em>' attribute.
	 * @see #getCheckConstraint()
	 * @generated
	 */
	void setCheckConstraint(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_Deferrable()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='deferrable'"
	 * @generated
	 */
	Object getDeferrable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeferrable <em>Deferrable</em>}' attribute.
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_DeleteCascade()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='deleteCascade'"
	 * @generated
	 */
	Object getDeleteCascade();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeleteCascade <em>Delete Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Cascade</em>' attribute.
	 * @see #getDeleteCascade()
	 * @generated
	 */
	void setDeleteCascade(Object value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_ForeignKeyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreignKeyName'"
	 * @generated
	 */
	String getForeignKeyName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getForeignKeyName <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #getForeignKeyName()
	 * @generated
	 */
	void setForeignKeyName(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_InitiallyDeferred()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='initiallyDeferred'"
	 * @generated
	 */
	Object getInitiallyDeferred();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getInitiallyDeferred <em>Initially Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initially Deferred</em>' attribute.
	 * @see #getInitiallyDeferred()
	 * @generated
	 */
	void setInitiallyDeferred(Object value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_Nullable()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='nullable'"
	 * @generated
	 */
	Object getNullable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(Object value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_PrimaryKey()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='primaryKey'"
	 * @generated
	 */
	Object getPrimaryKey();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(Object value);

	/**
	 * Returns the value of the '<em><b>Primary Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Name</em>' attribute.
	 * @see #setPrimaryKeyName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_PrimaryKeyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='primaryKeyName'"
	 * @generated
	 */
	String getPrimaryKeyName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyName <em>Primary Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Name</em>' attribute.
	 * @see #getPrimaryKeyName()
	 * @generated
	 */
	void setPrimaryKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Tablespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Tablespace</em>' attribute.
	 * @see #setPrimaryKeyTablespace(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_PrimaryKeyTablespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='primaryKeyTablespace'"
	 * @generated
	 */
	String getPrimaryKeyTablespace();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyTablespace <em>Primary Key Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Tablespace</em>' attribute.
	 * @see #getPrimaryKeyTablespace()
	 * @generated
	 */
	void setPrimaryKeyTablespace(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_ReferencedColumnNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='referencedColumnNames'"
	 * @generated
	 */
	String getReferencedColumnNames();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedColumnNames <em>Referenced Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Column Names</em>' attribute.
	 * @see #getReferencedColumnNames()
	 * @generated
	 */
	void setReferencedColumnNames(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_ReferencedTableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='referencedTableName'"
	 * @generated
	 */
	String getReferencedTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedTableName <em>Referenced Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table Name</em>' attribute.
	 * @see #getReferencedTableName()
	 * @generated
	 */
	void setReferencedTableName(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute.
	 * @see #setReferences(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_References()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='references'"
	 * @generated
	 */
	String getReferences();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferences <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' attribute.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_Unique()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	Object getUnique();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #getUnique()
	 * @generated
	 */
	void setUnique(Object value);

	/**
	 * Returns the value of the '<em><b>Unique Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Constraint Name</em>' attribute.
	 * @see #setUniqueConstraintName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getConstraintsType_UniqueConstraintName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uniqueConstraintName'"
	 * @generated
	 */
	String getUniqueConstraintName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUniqueConstraintName <em>Unique Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Constraint Name</em>' attribute.
	 * @see #getUniqueConstraintName()
	 * @generated
	 */
	void setUniqueConstraintName(String value);

} // ConstraintsType
