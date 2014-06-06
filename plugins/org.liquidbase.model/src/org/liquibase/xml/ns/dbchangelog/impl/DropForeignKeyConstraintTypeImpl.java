/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Foreign Key Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropForeignKeyConstraintTypeImpl#getBaseTableCatalogName <em>Base Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropForeignKeyConstraintTypeImpl#getBaseTableName <em>Base Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropForeignKeyConstraintTypeImpl#getBaseTableSchemaName <em>Base Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropForeignKeyConstraintTypeImpl#getConstraintName <em>Constraint Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropForeignKeyConstraintTypeImpl extends MinimalEObjectImpl.Container implements DropForeignKeyConstraintType {
	/**
	 * The default value of the '{@link #getBaseTableCatalogName() <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableCatalogName() <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableCatalogName = BASE_TABLE_CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableName() <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableName() <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableName = BASE_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableSchemaName() <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableSchemaName() <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableSchemaName = BASE_TABLE_SCHEMA_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropForeignKeyConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getDropForeignKeyConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableCatalogName() {
		return baseTableCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableCatalogName(String newBaseTableCatalogName) {
		String oldBaseTableCatalogName = baseTableCatalogName;
		baseTableCatalogName = newBaseTableCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME, oldBaseTableCatalogName, baseTableCatalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableName() {
		return baseTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableName(String newBaseTableName) {
		String oldBaseTableName = baseTableName;
		baseTableName = newBaseTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME, oldBaseTableName, baseTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableSchemaName() {
		return baseTableSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableSchemaName(String newBaseTableSchemaName) {
		String oldBaseTableSchemaName = baseTableSchemaName;
		baseTableSchemaName = newBaseTableSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME, oldBaseTableSchemaName, baseTableSchemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				return getBaseTableCatalogName();
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				return getBaseTableName();
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				return getBaseTableSchemaName();
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return getConstraintName();
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
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				setBaseTableCatalogName((String)newValue);
				return;
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				setBaseTableName((String)newValue);
				return;
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				setBaseTableSchemaName((String)newValue);
				return;
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
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
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				setBaseTableCatalogName(BASE_TABLE_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				setBaseTableName(BASE_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				setBaseTableSchemaName(BASE_TABLE_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
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
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				return BASE_TABLE_CATALOG_NAME_EDEFAULT == null ? baseTableCatalogName != null : !BASE_TABLE_CATALOG_NAME_EDEFAULT.equals(baseTableCatalogName);
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				return BASE_TABLE_NAME_EDEFAULT == null ? baseTableName != null : !BASE_TABLE_NAME_EDEFAULT.equals(baseTableName);
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				return BASE_TABLE_SCHEMA_NAME_EDEFAULT == null ? baseTableSchemaName != null : !BASE_TABLE_SCHEMA_NAME_EDEFAULT.equals(baseTableSchemaName);
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
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
		result.append(" (baseTableCatalogName: ");
		result.append(baseTableCatalogName);
		result.append(", baseTableName: ");
		result.append(baseTableName);
		result.append(", baseTableSchemaName: ");
		result.append(baseTableSchemaName);
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(')');
		return result.toString();
	}

} //DropForeignKeyConstraintTypeImpl
