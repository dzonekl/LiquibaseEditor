/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Auto Increment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getColumnDataType <em>Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getStartWith <em>Start With</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddAutoIncrementTypeImpl extends MinimalEObjectImpl.Container implements AddAutoIncrementType {
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
	 * The default value of the '{@link #getColumnDataType() <em>Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnDataType() <em>Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected String columnDataType = COLUMN_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected static final long INCREMENT_BY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected long incrementBy = INCREMENT_BY_EDEFAULT;

	/**
	 * This is true if the Increment By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean incrementByESet;

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
	 * The default value of the '{@link #getStartWith() <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWith()
	 * @generated
	 * @ordered
	 */
	protected static final long START_WITH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartWith() <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWith()
	 * @generated
	 * @ordered
	 */
	protected long startWith = START_WITH_EDEFAULT;

	/**
	 * This is true if the Start With attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startWithESet;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddAutoIncrementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAddAutoIncrementType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnDataType() {
		return columnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnDataType(String newColumnDataType) {
		String oldColumnDataType = columnDataType;
		columnDataType = newColumnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_DATA_TYPE, oldColumnDataType, columnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIncrementBy() {
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBy(long newIncrementBy) {
		long oldIncrementBy = incrementBy;
		incrementBy = newIncrementBy;
		boolean oldIncrementByESet = incrementByESet;
		incrementByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY, oldIncrementBy, incrementBy, !oldIncrementByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncrementBy() {
		long oldIncrementBy = incrementBy;
		boolean oldIncrementByESet = incrementByESet;
		incrementBy = INCREMENT_BY_EDEFAULT;
		incrementByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY, oldIncrementBy, INCREMENT_BY_EDEFAULT, oldIncrementByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncrementBy() {
		return incrementByESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartWith() {
		return startWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartWith(long newStartWith) {
		long oldStartWith = startWith;
		startWith = newStartWith;
		boolean oldStartWithESet = startWithESet;
		startWithESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__START_WITH, oldStartWith, startWith, !oldStartWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartWith() {
		long oldStartWith = startWith;
		boolean oldStartWithESet = startWithESet;
		startWith = START_WITH_EDEFAULT;
		startWithESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__START_WITH, oldStartWith, START_WITH_EDEFAULT, oldStartWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartWith() {
		return startWithESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_DATA_TYPE:
				return getColumnDataType();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_NAME:
				return getColumnName();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY:
				return getIncrementBy();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__START_WITH:
				return getStartWith();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__TABLE_NAME:
				return getTableName();
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
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_DATA_TYPE:
				setColumnDataType((String)newValue);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY:
				setIncrementBy((Long)newValue);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__START_WITH:
				setStartWith((Long)newValue);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__TABLE_NAME:
				setTableName((String)newValue);
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
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_DATA_TYPE:
				setColumnDataType(COLUMN_DATA_TYPE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY:
				unsetIncrementBy();
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__START_WITH:
				unsetStartWith();
				return;
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
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
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_DATA_TYPE:
				return COLUMN_DATA_TYPE_EDEFAULT == null ? columnDataType != null : !COLUMN_DATA_TYPE_EDEFAULT.equals(columnDataType);
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY:
				return isSetIncrementBy();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__START_WITH:
				return isSetStartWith();
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
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
		result.append(", columnDataType: ");
		result.append(columnDataType);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", incrementBy: ");
		if (incrementByESet) result.append(incrementBy); else result.append("<unset>");
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", startWith: ");
		if (startWithESet) result.append(startWith); else result.append("<unset>");
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //AddAutoIncrementTypeImpl
