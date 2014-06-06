/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Constraint Exists Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ForeignKeyConstraintExistsTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ForeignKeyConstraintExistsTypeImpl#getForeignKeyName <em>Foreign Key Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ForeignKeyConstraintExistsTypeImpl#getForeignKeyTableName <em>Foreign Key Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ForeignKeyConstraintExistsTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyConstraintExistsTypeImpl extends MinimalEObjectImpl.Container implements ForeignKeyConstraintExistsType {
	/**
	 * The default value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String catalogName = CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected String foreignKeyName = FOREIGN_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeignKeyTableName() <em>Foreign Key Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKeyTableName() <em>Foreign Key Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyTableName()
	 * @generated
	 * @ordered
	 */
	protected String foreignKeyTableName = FOREIGN_KEY_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String schemaName = SCHEMA_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyConstraintExistsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getForeignKeyConstraintExistsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalogName() {
		return catalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogName(String newCatalogName) {
		String oldCatalogName = catalogName;
		catalogName = newCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKeyName() {
		return foreignKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyName(String newForeignKeyName) {
		String oldForeignKeyName = foreignKeyName;
		foreignKeyName = newForeignKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_NAME, oldForeignKeyName, foreignKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKeyTableName() {
		return foreignKeyTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyTableName(String newForeignKeyTableName) {
		String oldForeignKeyTableName = foreignKeyTableName;
		foreignKeyTableName = newForeignKeyTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_TABLE_NAME, oldForeignKeyTableName, foreignKeyTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaName() {
		return schemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaName(String newSchemaName) {
		String oldSchemaName = schemaName;
		schemaName = newSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_NAME:
				return getForeignKeyName();
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_TABLE_NAME:
				return getForeignKeyTableName();
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__SCHEMA_NAME:
				return getSchemaName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_NAME:
				setForeignKeyName((String)newValue);
				return;
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_TABLE_NAME:
				setForeignKeyTableName((String)newValue);
				return;
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_NAME:
				setForeignKeyName(FOREIGN_KEY_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_TABLE_NAME:
				setForeignKeyTableName(FOREIGN_KEY_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_NAME:
				return FOREIGN_KEY_NAME_EDEFAULT == null ? foreignKeyName != null : !FOREIGN_KEY_NAME_EDEFAULT.equals(foreignKeyName);
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_TABLE_NAME:
				return FOREIGN_KEY_TABLE_NAME_EDEFAULT == null ? foreignKeyTableName != null : !FOREIGN_KEY_TABLE_NAME_EDEFAULT.equals(foreignKeyTableName);
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (catalogName: ");
		result.append(catalogName);
		result.append(", foreignKeyName: ");
		result.append(foreignKeyName);
		result.append(", foreignKeyTableName: ");
		result.append(foreignKeyTableName);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(')');
		return result.toString();
	}

} //ForeignKeyConstraintExistsTypeImpl
