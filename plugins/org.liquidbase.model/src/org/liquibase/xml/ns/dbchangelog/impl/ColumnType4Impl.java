/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.liquibase.xml.ns.dbchangelog.ColumnType4;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType4Impl#getAfterColumn <em>After Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType4Impl#getBeforeColumn <em>Before Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType4Impl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnType4Impl extends ColumnType2Impl implements ColumnType4 {
	/**
	 * The default value of the '{@link #getAfterColumn() <em>After Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfterColumn() <em>After Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterColumn()
	 * @generated
	 * @ordered
	 */
	protected String afterColumn = AFTER_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeColumn() <em>Before Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeforeColumn() <em>Before Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeColumn()
	 * @generated
	 * @ordered
	 */
	protected String beforeColumn = BEFORE_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnType4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getColumnType4();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterColumn() {
		return afterColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterColumn(String newAfterColumn) {
		String oldAfterColumn = afterColumn;
		afterColumn = newAfterColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE4__AFTER_COLUMN, oldAfterColumn, afterColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeColumn() {
		return beforeColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeColumn(String newBeforeColumn) {
		String oldBeforeColumn = beforeColumn;
		beforeColumn = newBeforeColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE4__BEFORE_COLUMN, oldBeforeColumn, beforeColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BigInteger newPosition) {
		BigInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE4__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.COLUMN_TYPE4__AFTER_COLUMN:
				return getAfterColumn();
			case DbchangelogPackage.COLUMN_TYPE4__BEFORE_COLUMN:
				return getBeforeColumn();
			case DbchangelogPackage.COLUMN_TYPE4__POSITION:
				return getPosition();
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
			case DbchangelogPackage.COLUMN_TYPE4__AFTER_COLUMN:
				setAfterColumn((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE4__BEFORE_COLUMN:
				setBeforeColumn((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE4__POSITION:
				setPosition((BigInteger)newValue);
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
			case DbchangelogPackage.COLUMN_TYPE4__AFTER_COLUMN:
				setAfterColumn(AFTER_COLUMN_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE4__BEFORE_COLUMN:
				setBeforeColumn(BEFORE_COLUMN_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE4__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case DbchangelogPackage.COLUMN_TYPE4__AFTER_COLUMN:
				return AFTER_COLUMN_EDEFAULT == null ? afterColumn != null : !AFTER_COLUMN_EDEFAULT.equals(afterColumn);
			case DbchangelogPackage.COLUMN_TYPE4__BEFORE_COLUMN:
				return BEFORE_COLUMN_EDEFAULT == null ? beforeColumn != null : !BEFORE_COLUMN_EDEFAULT.equals(beforeColumn);
			case DbchangelogPackage.COLUMN_TYPE4__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
		result.append(" (afterColumn: ");
		result.append(afterColumn);
		result.append(", beforeColumn: ");
		result.append(beforeColumn);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //ColumnType4Impl
