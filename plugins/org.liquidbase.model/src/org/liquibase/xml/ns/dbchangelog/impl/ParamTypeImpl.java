/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.ParamType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValueComputed <em>Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValueNumeric <em>Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValueSequenceCurrent <em>Value Sequence Current</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl#getValueSequenceNext <em>Value Sequence Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamTypeImpl extends MinimalEObjectImpl.Container implements ParamType {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected String valueBoolean = VALUE_BOOLEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueComputed() <em>Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComputed()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_COMPUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueComputed() <em>Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComputed()
	 * @generated
	 * @ordered
	 */
	protected String valueComputed = VALUE_COMPUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueDate() <em>Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDate() <em>Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected String valueDate = VALUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueNumeric() <em>Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_NUMERIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueNumeric() <em>Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected String valueNumeric = VALUE_NUMERIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSequenceCurrent() <em>Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SEQUENCE_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSequenceCurrent() <em>Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceCurrent()
	 * @generated
	 * @ordered
	 */
	protected String valueSequenceCurrent = VALUE_SEQUENCE_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSequenceNext() <em>Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SEQUENCE_NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSequenceNext() <em>Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected String valueSequenceNext = VALUE_SEQUENCE_NEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getParamType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBoolean(String newValueBoolean) {
		String oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE_BOOLEAN, oldValueBoolean, valueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueComputed() {
		return valueComputed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComputed(String newValueComputed) {
		String oldValueComputed = valueComputed;
		valueComputed = newValueComputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE_COMPUTED, oldValueComputed, valueComputed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueDate() {
		return valueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDate(String newValueDate) {
		String oldValueDate = valueDate;
		valueDate = newValueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE_DATE, oldValueDate, valueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueNumeric() {
		return valueNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueNumeric(String newValueNumeric) {
		String oldValueNumeric = valueNumeric;
		valueNumeric = newValueNumeric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE_NUMERIC, oldValueNumeric, valueNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSequenceCurrent() {
		return valueSequenceCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSequenceCurrent(String newValueSequenceCurrent) {
		String oldValueSequenceCurrent = valueSequenceCurrent;
		valueSequenceCurrent = newValueSequenceCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_CURRENT, oldValueSequenceCurrent, valueSequenceCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSequenceNext() {
		return valueSequenceNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSequenceNext(String newValueSequenceNext) {
		String oldValueSequenceNext = valueSequenceNext;
		valueSequenceNext = newValueSequenceNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_NEXT, oldValueSequenceNext, valueSequenceNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.PARAM_TYPE__NAME:
				return getName();
			case DbchangelogPackage.PARAM_TYPE__VALUE:
				return getValue();
			case DbchangelogPackage.PARAM_TYPE__VALUE_BOOLEAN:
				return getValueBoolean();
			case DbchangelogPackage.PARAM_TYPE__VALUE_COMPUTED:
				return getValueComputed();
			case DbchangelogPackage.PARAM_TYPE__VALUE_DATE:
				return getValueDate();
			case DbchangelogPackage.PARAM_TYPE__VALUE_NUMERIC:
				return getValueNumeric();
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_CURRENT:
				return getValueSequenceCurrent();
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_NEXT:
				return getValueSequenceNext();
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
			case DbchangelogPackage.PARAM_TYPE__NAME:
				setName((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_BOOLEAN:
				setValueBoolean((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_COMPUTED:
				setValueComputed((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_DATE:
				setValueDate((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_NUMERIC:
				setValueNumeric((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_CURRENT:
				setValueSequenceCurrent((String)newValue);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_NEXT:
				setValueSequenceNext((String)newValue);
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
			case DbchangelogPackage.PARAM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_BOOLEAN:
				setValueBoolean(VALUE_BOOLEAN_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_COMPUTED:
				setValueComputed(VALUE_COMPUTED_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_DATE:
				setValueDate(VALUE_DATE_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_NUMERIC:
				setValueNumeric(VALUE_NUMERIC_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_CURRENT:
				setValueSequenceCurrent(VALUE_SEQUENCE_CURRENT_EDEFAULT);
				return;
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_NEXT:
				setValueSequenceNext(VALUE_SEQUENCE_NEXT_EDEFAULT);
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
			case DbchangelogPackage.PARAM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbchangelogPackage.PARAM_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DbchangelogPackage.PARAM_TYPE__VALUE_BOOLEAN:
				return VALUE_BOOLEAN_EDEFAULT == null ? valueBoolean != null : !VALUE_BOOLEAN_EDEFAULT.equals(valueBoolean);
			case DbchangelogPackage.PARAM_TYPE__VALUE_COMPUTED:
				return VALUE_COMPUTED_EDEFAULT == null ? valueComputed != null : !VALUE_COMPUTED_EDEFAULT.equals(valueComputed);
			case DbchangelogPackage.PARAM_TYPE__VALUE_DATE:
				return VALUE_DATE_EDEFAULT == null ? valueDate != null : !VALUE_DATE_EDEFAULT.equals(valueDate);
			case DbchangelogPackage.PARAM_TYPE__VALUE_NUMERIC:
				return VALUE_NUMERIC_EDEFAULT == null ? valueNumeric != null : !VALUE_NUMERIC_EDEFAULT.equals(valueNumeric);
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_CURRENT:
				return VALUE_SEQUENCE_CURRENT_EDEFAULT == null ? valueSequenceCurrent != null : !VALUE_SEQUENCE_CURRENT_EDEFAULT.equals(valueSequenceCurrent);
			case DbchangelogPackage.PARAM_TYPE__VALUE_SEQUENCE_NEXT:
				return VALUE_SEQUENCE_NEXT_EDEFAULT == null ? valueSequenceNext != null : !VALUE_SEQUENCE_NEXT_EDEFAULT.equals(valueSequenceNext);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", valueBoolean: ");
		result.append(valueBoolean);
		result.append(", valueComputed: ");
		result.append(valueComputed);
		result.append(", valueDate: ");
		result.append(valueDate);
		result.append(", valueNumeric: ");
		result.append(valueNumeric);
		result.append(", valueSequenceCurrent: ");
		result.append(valueSequenceCurrent);
		result.append(", valueSequenceNext: ");
		result.append(valueSequenceNext);
		result.append(')');
		return result.toString();
	}

} //ParamTypeImpl
