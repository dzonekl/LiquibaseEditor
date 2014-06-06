/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.RenameTableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameTableTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameTableTypeImpl#getNewTableName <em>New Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameTableTypeImpl#getOldTableName <em>Old Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameTableTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenameTableTypeImpl extends MinimalEObjectImpl.Container implements RenameTableType {
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
	 * The default value of the '{@link #getNewTableName() <em>New Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewTableName() <em>New Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTableName()
	 * @generated
	 * @ordered
	 */
	protected String newTableName = NEW_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldTableName() <em>Old Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldTableName() <em>Old Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldTableName()
	 * @generated
	 * @ordered
	 */
	protected String oldTableName = OLD_TABLE_NAME_EDEFAULT;

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
	protected RenameTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getRenameTableType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_TABLE_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewTableName() {
		return newTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTableName(String newNewTableName) {
		String oldNewTableName = newTableName;
		newTableName = newNewTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_TABLE_TYPE__NEW_TABLE_NAME, oldNewTableName, newTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldTableName() {
		return oldTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldTableName(String newOldTableName) {
		String oldOldTableName = oldTableName;
		oldTableName = newOldTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_TABLE_TYPE__OLD_TABLE_NAME, oldOldTableName, oldTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_TABLE_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.RENAME_TABLE_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.RENAME_TABLE_TYPE__NEW_TABLE_NAME:
				return getNewTableName();
			case DbchangelogPackage.RENAME_TABLE_TYPE__OLD_TABLE_NAME:
				return getOldTableName();
			case DbchangelogPackage.RENAME_TABLE_TYPE__SCHEMA_NAME:
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
			case DbchangelogPackage.RENAME_TABLE_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_TABLE_TYPE__NEW_TABLE_NAME:
				setNewTableName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_TABLE_TYPE__OLD_TABLE_NAME:
				setOldTableName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_TABLE_TYPE__SCHEMA_NAME:
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
			case DbchangelogPackage.RENAME_TABLE_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_TABLE_TYPE__NEW_TABLE_NAME:
				setNewTableName(NEW_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_TABLE_TYPE__OLD_TABLE_NAME:
				setOldTableName(OLD_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_TABLE_TYPE__SCHEMA_NAME:
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
			case DbchangelogPackage.RENAME_TABLE_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.RENAME_TABLE_TYPE__NEW_TABLE_NAME:
				return NEW_TABLE_NAME_EDEFAULT == null ? newTableName != null : !NEW_TABLE_NAME_EDEFAULT.equals(newTableName);
			case DbchangelogPackage.RENAME_TABLE_TYPE__OLD_TABLE_NAME:
				return OLD_TABLE_NAME_EDEFAULT == null ? oldTableName != null : !OLD_TABLE_NAME_EDEFAULT.equals(oldTableName);
			case DbchangelogPackage.RENAME_TABLE_TYPE__SCHEMA_NAME:
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
		result.append(", newTableName: ");
		result.append(newTableName);
		result.append(", oldTableName: ");
		result.append(oldTableName);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(')');
		return result.toString();
	}

} //RenameTableTypeImpl
