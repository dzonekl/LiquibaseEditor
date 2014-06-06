/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.ColumnType1;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getDefaultValueComputed <em>Default Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getDefaultValueNumeric <em>Default Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnType1Impl extends MinimalEObjectImpl.Container implements ColumnType1 {
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
	protected static final Object DEFAULT_VALUE_BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected Object defaultValueBoolean = DEFAULT_VALUE_BOOLEAN_EDEFAULT;

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
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Object INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Object index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getColumnType1();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultValueBoolean() {
		return defaultValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueBoolean(Object newDefaultValueBoolean) {
		Object oldDefaultValueBoolean = defaultValueBoolean;
		defaultValueBoolean = newDefaultValueBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_BOOLEAN, oldDefaultValueBoolean, defaultValueBoolean));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_COMPUTED, oldDefaultValueComputed, defaultValueComputed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_DATE, oldDefaultValueDate, defaultValueDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_NUMERIC, oldDefaultValueNumeric, defaultValueNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Object newIndex) {
		Object oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE1__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE:
				return getDefaultValue();
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_BOOLEAN:
				return getDefaultValueBoolean();
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_COMPUTED:
				return getDefaultValueComputed();
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_DATE:
				return getDefaultValueDate();
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_NUMERIC:
				return getDefaultValueNumeric();
			case DbchangelogPackage.COLUMN_TYPE1__HEADER:
				return getHeader();
			case DbchangelogPackage.COLUMN_TYPE1__INDEX:
				return getIndex();
			case DbchangelogPackage.COLUMN_TYPE1__NAME:
				return getName();
			case DbchangelogPackage.COLUMN_TYPE1__TYPE:
				return getType();
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
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_COMPUTED:
				setDefaultValueComputed((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_DATE:
				setDefaultValueDate((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_NUMERIC:
				setDefaultValueNumeric((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__HEADER:
				setHeader((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__INDEX:
				setIndex(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__NAME:
				setName((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__TYPE:
				setType((String)newValue);
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
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean(DEFAULT_VALUE_BOOLEAN_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_COMPUTED:
				setDefaultValueComputed(DEFAULT_VALUE_COMPUTED_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_DATE:
				setDefaultValueDate(DEFAULT_VALUE_DATE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_NUMERIC:
				setDefaultValueNumeric(DEFAULT_VALUE_NUMERIC_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE1__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_BOOLEAN:
				return DEFAULT_VALUE_BOOLEAN_EDEFAULT == null ? defaultValueBoolean != null : !DEFAULT_VALUE_BOOLEAN_EDEFAULT.equals(defaultValueBoolean);
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_COMPUTED:
				return DEFAULT_VALUE_COMPUTED_EDEFAULT == null ? defaultValueComputed != null : !DEFAULT_VALUE_COMPUTED_EDEFAULT.equals(defaultValueComputed);
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_DATE:
				return DEFAULT_VALUE_DATE_EDEFAULT == null ? defaultValueDate != null : !DEFAULT_VALUE_DATE_EDEFAULT.equals(defaultValueDate);
			case DbchangelogPackage.COLUMN_TYPE1__DEFAULT_VALUE_NUMERIC:
				return DEFAULT_VALUE_NUMERIC_EDEFAULT == null ? defaultValueNumeric != null : !DEFAULT_VALUE_NUMERIC_EDEFAULT.equals(defaultValueNumeric);
			case DbchangelogPackage.COLUMN_TYPE1__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case DbchangelogPackage.COLUMN_TYPE1__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case DbchangelogPackage.COLUMN_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbchangelogPackage.COLUMN_TYPE1__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", defaultValueBoolean: ");
		result.append(defaultValueBoolean);
		result.append(", defaultValueComputed: ");
		result.append(defaultValueComputed);
		result.append(", defaultValueDate: ");
		result.append(defaultValueDate);
		result.append(", defaultValueNumeric: ");
		result.append(defaultValueNumeric);
		result.append(", header: ");
		result.append(header);
		result.append(", index: ");
		result.append(index);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ColumnType1Impl
