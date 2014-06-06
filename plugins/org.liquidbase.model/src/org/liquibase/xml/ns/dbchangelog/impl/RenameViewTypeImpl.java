/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.RenameViewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameViewTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameViewTypeImpl#getNewViewName <em>New View Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameViewTypeImpl#getOldViewName <em>Old View Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameViewTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenameViewTypeImpl extends MinimalEObjectImpl.Container implements RenameViewType {
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
	 * The default value of the '{@link #getNewViewName() <em>New View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewViewName() <em>New View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewViewName()
	 * @generated
	 * @ordered
	 */
	protected String newViewName = NEW_VIEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldViewName() <em>Old View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldViewName() <em>Old View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldViewName()
	 * @generated
	 * @ordered
	 */
	protected String oldViewName = OLD_VIEW_NAME_EDEFAULT;

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
	protected RenameViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getRenameViewType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_VIEW_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewViewName() {
		return newViewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewViewName(String newNewViewName) {
		String oldNewViewName = newViewName;
		newViewName = newNewViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_VIEW_TYPE__NEW_VIEW_NAME, oldNewViewName, newViewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldViewName() {
		return oldViewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldViewName(String newOldViewName) {
		String oldOldViewName = oldViewName;
		oldViewName = newOldViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_VIEW_TYPE__OLD_VIEW_NAME, oldOldViewName, oldViewName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_VIEW_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.RENAME_VIEW_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.RENAME_VIEW_TYPE__NEW_VIEW_NAME:
				return getNewViewName();
			case DbchangelogPackage.RENAME_VIEW_TYPE__OLD_VIEW_NAME:
				return getOldViewName();
			case DbchangelogPackage.RENAME_VIEW_TYPE__SCHEMA_NAME:
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
			case DbchangelogPackage.RENAME_VIEW_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_VIEW_TYPE__NEW_VIEW_NAME:
				setNewViewName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_VIEW_TYPE__OLD_VIEW_NAME:
				setOldViewName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_VIEW_TYPE__SCHEMA_NAME:
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
			case DbchangelogPackage.RENAME_VIEW_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_VIEW_TYPE__NEW_VIEW_NAME:
				setNewViewName(NEW_VIEW_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_VIEW_TYPE__OLD_VIEW_NAME:
				setOldViewName(OLD_VIEW_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_VIEW_TYPE__SCHEMA_NAME:
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
			case DbchangelogPackage.RENAME_VIEW_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.RENAME_VIEW_TYPE__NEW_VIEW_NAME:
				return NEW_VIEW_NAME_EDEFAULT == null ? newViewName != null : !NEW_VIEW_NAME_EDEFAULT.equals(newViewName);
			case DbchangelogPackage.RENAME_VIEW_TYPE__OLD_VIEW_NAME:
				return OLD_VIEW_NAME_EDEFAULT == null ? oldViewName != null : !OLD_VIEW_NAME_EDEFAULT.equals(oldViewName);
			case DbchangelogPackage.RENAME_VIEW_TYPE__SCHEMA_NAME:
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
		result.append(", newViewName: ");
		result.append(newViewName);
		result.append(", oldViewName: ");
		result.append(oldViewName);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(')');
		return result.toString();
	}

} //RenameViewTypeImpl
