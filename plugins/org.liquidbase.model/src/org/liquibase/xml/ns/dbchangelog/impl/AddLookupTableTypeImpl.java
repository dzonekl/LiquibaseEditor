/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.AddLookupTableType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Lookup Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getExistingColumnName <em>Existing Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getExistingTableCatalogName <em>Existing Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getExistingTableName <em>Existing Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getExistingTableSchemaName <em>Existing Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getNewColumnDataType <em>New Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getNewColumnName <em>New Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getNewTableCatalogName <em>New Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getNewTableName <em>New Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl#getNewTableSchemaName <em>New Table Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddLookupTableTypeImpl extends MinimalEObjectImpl.Container implements AddLookupTableType {
	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingColumnName() <em>Existing Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingColumnName() <em>Existing Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingColumnName()
	 * @generated
	 * @ordered
	 */
	protected String existingColumnName = EXISTING_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingTableCatalogName() <em>Existing Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_TABLE_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingTableCatalogName() <em>Existing Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String existingTableCatalogName = EXISTING_TABLE_CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingTableName() <em>Existing Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingTableName() <em>Existing Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableName()
	 * @generated
	 * @ordered
	 */
	protected String existingTableName = EXISTING_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingTableSchemaName() <em>Existing Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_TABLE_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingTableSchemaName() <em>Existing Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String existingTableSchemaName = EXISTING_TABLE_SCHEMA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewColumnDataType() <em>New Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_COLUMN_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewColumnDataType() <em>New Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected String newColumnDataType = NEW_COLUMN_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewColumnName() <em>New Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewColumnName() <em>New Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewColumnName()
	 * @generated
	 * @ordered
	 */
	protected String newColumnName = NEW_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewTableCatalogName() <em>New Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_TABLE_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewTableCatalogName() <em>New Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String newTableCatalogName = NEW_TABLE_CATALOG_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNewTableSchemaName() <em>New Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_TABLE_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewTableSchemaName() <em>New Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String newTableSchemaName = NEW_TABLE_SCHEMA_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddLookupTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAddLookupTableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExistingColumnName() {
		return existingColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistingColumnName(String newExistingColumnName) {
		String oldExistingColumnName = existingColumnName;
		existingColumnName = newExistingColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME, oldExistingColumnName, existingColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExistingTableCatalogName() {
		return existingTableCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistingTableCatalogName(String newExistingTableCatalogName) {
		String oldExistingTableCatalogName = existingTableCatalogName;
		existingTableCatalogName = newExistingTableCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME, oldExistingTableCatalogName, existingTableCatalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExistingTableName() {
		return existingTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistingTableName(String newExistingTableName) {
		String oldExistingTableName = existingTableName;
		existingTableName = newExistingTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME, oldExistingTableName, existingTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExistingTableSchemaName() {
		return existingTableSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistingTableSchemaName(String newExistingTableSchemaName) {
		String oldExistingTableSchemaName = existingTableSchemaName;
		existingTableSchemaName = newExistingTableSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME, oldExistingTableSchemaName, existingTableSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewColumnDataType() {
		return newColumnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewColumnDataType(String newNewColumnDataType) {
		String oldNewColumnDataType = newColumnDataType;
		newColumnDataType = newNewColumnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE, oldNewColumnDataType, newColumnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewColumnName() {
		return newColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewColumnName(String newNewColumnName) {
		String oldNewColumnName = newColumnName;
		newColumnName = newNewColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME, oldNewColumnName, newColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewTableCatalogName() {
		return newTableCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTableCatalogName(String newNewTableCatalogName) {
		String oldNewTableCatalogName = newTableCatalogName;
		newTableCatalogName = newNewTableCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME, oldNewTableCatalogName, newTableCatalogName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME, oldNewTableName, newTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewTableSchemaName() {
		return newTableSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTableSchemaName(String newNewTableSchemaName) {
		String oldNewTableSchemaName = newTableSchemaName;
		newTableSchemaName = newNewTableSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME, oldNewTableSchemaName, newTableSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME:
				return getConstraintName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME:
				return getExistingColumnName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME:
				return getExistingTableCatalogName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME:
				return getExistingTableName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME:
				return getExistingTableSchemaName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE:
				return getNewColumnDataType();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME:
				return getNewColumnName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME:
				return getNewTableCatalogName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME:
				return getNewTableName();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME:
				return getNewTableSchemaName();
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
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME:
				setExistingColumnName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME:
				setExistingTableCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME:
				setExistingTableName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME:
				setExistingTableSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE:
				setNewColumnDataType((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME:
				setNewColumnName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME:
				setNewTableCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME:
				setNewTableName((String)newValue);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME:
				setNewTableSchemaName((String)newValue);
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
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME:
				setExistingColumnName(EXISTING_COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME:
				setExistingTableCatalogName(EXISTING_TABLE_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME:
				setExistingTableName(EXISTING_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME:
				setExistingTableSchemaName(EXISTING_TABLE_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE:
				setNewColumnDataType(NEW_COLUMN_DATA_TYPE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME:
				setNewColumnName(NEW_COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME:
				setNewTableCatalogName(NEW_TABLE_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME:
				setNewTableName(NEW_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME:
				setNewTableSchemaName(NEW_TABLE_SCHEMA_NAME_EDEFAULT);
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
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME:
				return EXISTING_COLUMN_NAME_EDEFAULT == null ? existingColumnName != null : !EXISTING_COLUMN_NAME_EDEFAULT.equals(existingColumnName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME:
				return EXISTING_TABLE_CATALOG_NAME_EDEFAULT == null ? existingTableCatalogName != null : !EXISTING_TABLE_CATALOG_NAME_EDEFAULT.equals(existingTableCatalogName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME:
				return EXISTING_TABLE_NAME_EDEFAULT == null ? existingTableName != null : !EXISTING_TABLE_NAME_EDEFAULT.equals(existingTableName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME:
				return EXISTING_TABLE_SCHEMA_NAME_EDEFAULT == null ? existingTableSchemaName != null : !EXISTING_TABLE_SCHEMA_NAME_EDEFAULT.equals(existingTableSchemaName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE:
				return NEW_COLUMN_DATA_TYPE_EDEFAULT == null ? newColumnDataType != null : !NEW_COLUMN_DATA_TYPE_EDEFAULT.equals(newColumnDataType);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME:
				return NEW_COLUMN_NAME_EDEFAULT == null ? newColumnName != null : !NEW_COLUMN_NAME_EDEFAULT.equals(newColumnName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME:
				return NEW_TABLE_CATALOG_NAME_EDEFAULT == null ? newTableCatalogName != null : !NEW_TABLE_CATALOG_NAME_EDEFAULT.equals(newTableCatalogName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME:
				return NEW_TABLE_NAME_EDEFAULT == null ? newTableName != null : !NEW_TABLE_NAME_EDEFAULT.equals(newTableName);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME:
				return NEW_TABLE_SCHEMA_NAME_EDEFAULT == null ? newTableSchemaName != null : !NEW_TABLE_SCHEMA_NAME_EDEFAULT.equals(newTableSchemaName);
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
		result.append(" (constraintName: ");
		result.append(constraintName);
		result.append(", existingColumnName: ");
		result.append(existingColumnName);
		result.append(", existingTableCatalogName: ");
		result.append(existingTableCatalogName);
		result.append(", existingTableName: ");
		result.append(existingTableName);
		result.append(", existingTableSchemaName: ");
		result.append(existingTableSchemaName);
		result.append(", newColumnDataType: ");
		result.append(newColumnDataType);
		result.append(", newColumnName: ");
		result.append(newColumnName);
		result.append(", newTableCatalogName: ");
		result.append(newTableCatalogName);
		result.append(", newTableName: ");
		result.append(newTableName);
		result.append(", newTableSchemaName: ");
		result.append(newTableSchemaName);
		result.append(')');
		return result.toString();
	}

} //AddLookupTableTypeImpl
