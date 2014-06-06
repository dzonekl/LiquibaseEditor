/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.AddDefaultValueType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Default Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getColumnDataType <em>Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getDefaultValueComputed <em>Default Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getDefaultValueNumeric <em>Default Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddDefaultValueTypeImpl extends MinimalEObjectImpl.Container implements AddDefaultValueType {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueBoolean = DEFAULT_VALUE_BOOLEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueComputed() <em>Default Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueComputed()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_COMPUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueComputed() <em>Default Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueComputed()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueComputed = DEFAULT_VALUE_COMPUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueDate() <em>Default Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueDate() <em>Default Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDate()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueDate = DEFAULT_VALUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueNumeric() <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_NUMERIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueNumeric() <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueNumeric = DEFAULT_VALUE_NUMERIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueSequenceNext() <em>Default Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueSequenceNext() <em>Default Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueSequenceNext = DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT;

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
	protected AddDefaultValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAddDefaultValueType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE, oldColumnDataType, columnDataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueBoolean() {
		return defaultValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueBoolean(String newDefaultValueBoolean) {
		String oldDefaultValueBoolean = defaultValueBoolean;
		defaultValueBoolean = newDefaultValueBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN, oldDefaultValueBoolean, defaultValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueComputed() {
		return defaultValueComputed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueComputed(String newDefaultValueComputed) {
		String oldDefaultValueComputed = defaultValueComputed;
		defaultValueComputed = newDefaultValueComputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED, oldDefaultValueComputed, defaultValueComputed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueDate() {
		return defaultValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueDate(String newDefaultValueDate) {
		String oldDefaultValueDate = defaultValueDate;
		defaultValueDate = newDefaultValueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE, oldDefaultValueDate, defaultValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueNumeric() {
		return defaultValueNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueNumeric(String newDefaultValueNumeric) {
		String oldDefaultValueNumeric = defaultValueNumeric;
		defaultValueNumeric = newDefaultValueNumeric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC, oldDefaultValueNumeric, defaultValueNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueSequenceNext() {
		return defaultValueSequenceNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueSequenceNext(String newDefaultValueSequenceNext) {
		String oldDefaultValueSequenceNext = defaultValueSequenceNext;
		defaultValueSequenceNext = newDefaultValueSequenceNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT, oldDefaultValueSequenceNext, defaultValueSequenceNext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE:
				return getColumnDataType();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME:
				return getColumnName();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN:
				return getDefaultValueBoolean();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED:
				return getDefaultValueComputed();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE:
				return getDefaultValueDate();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC:
				return getDefaultValueNumeric();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT:
				return getDefaultValueSequenceNext();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE:
				setColumnDataType((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED:
				setDefaultValueComputed((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE:
				setDefaultValueDate((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC:
				setDefaultValueNumeric((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT:
				setDefaultValueSequenceNext((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE:
				setColumnDataType(COLUMN_DATA_TYPE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean(DEFAULT_VALUE_BOOLEAN_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED:
				setDefaultValueComputed(DEFAULT_VALUE_COMPUTED_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE:
				setDefaultValueDate(DEFAULT_VALUE_DATE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC:
				setDefaultValueNumeric(DEFAULT_VALUE_NUMERIC_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT:
				setDefaultValueSequenceNext(DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE:
				return COLUMN_DATA_TYPE_EDEFAULT == null ? columnDataType != null : !COLUMN_DATA_TYPE_EDEFAULT.equals(columnDataType);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN:
				return DEFAULT_VALUE_BOOLEAN_EDEFAULT == null ? defaultValueBoolean != null : !DEFAULT_VALUE_BOOLEAN_EDEFAULT.equals(defaultValueBoolean);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED:
				return DEFAULT_VALUE_COMPUTED_EDEFAULT == null ? defaultValueComputed != null : !DEFAULT_VALUE_COMPUTED_EDEFAULT.equals(defaultValueComputed);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE:
				return DEFAULT_VALUE_DATE_EDEFAULT == null ? defaultValueDate != null : !DEFAULT_VALUE_DATE_EDEFAULT.equals(defaultValueDate);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC:
				return DEFAULT_VALUE_NUMERIC_EDEFAULT == null ? defaultValueNumeric != null : !DEFAULT_VALUE_NUMERIC_EDEFAULT.equals(defaultValueNumeric);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT:
				return DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT == null ? defaultValueSequenceNext != null : !DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT.equals(defaultValueSequenceNext);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__TABLE_NAME:
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", defaultValueBoolean: ");
		result.append(defaultValueBoolean);
		result.append(", defaultValueComputed: ");
		result.append(defaultValueComputed);
		result.append(", defaultValueDate: ");
		result.append(defaultValueDate);
		result.append(", defaultValueNumeric: ");
		result.append(defaultValueNumeric);
		result.append(", defaultValueSequenceNext: ");
		result.append(defaultValueSequenceNext);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //AddDefaultValueTypeImpl
