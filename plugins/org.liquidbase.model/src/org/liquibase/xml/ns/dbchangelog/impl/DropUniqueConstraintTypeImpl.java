/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Unique Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl#getUniqueColumns <em>Unique Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropUniqueConstraintTypeImpl extends MinimalEObjectImpl.Container implements DropUniqueConstraintType {
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
	 * The default value of the '{@link #getUniqueColumns() <em>Unique Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueColumns() <em>Unique Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueColumns()
	 * @generated
	 * @ordered
	 */
	protected String uniqueColumns = UNIQUE_COLUMNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropUniqueConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getDropUniqueConstraintType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME, oldConstraintName, constraintName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueColumns() {
		return uniqueColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueColumns(String newUniqueColumns) {
		String oldUniqueColumns = uniqueColumns;
		uniqueColumns = newUniqueColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__UNIQUE_COLUMNS, oldUniqueColumns, uniqueColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return getConstraintName();
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				return getTableName();
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__UNIQUE_COLUMNS:
				return getUniqueColumns();
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
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__UNIQUE_COLUMNS:
				setUniqueColumns((String)newValue);
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
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__UNIQUE_COLUMNS:
				setUniqueColumns(UNIQUE_COLUMNS_EDEFAULT);
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
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE__UNIQUE_COLUMNS:
				return UNIQUE_COLUMNS_EDEFAULT == null ? uniqueColumns != null : !UNIQUE_COLUMNS_EDEFAULT.equals(uniqueColumns);
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
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", uniqueColumns: ");
		result.append(uniqueColumns);
		result.append(')');
		return result.toString();
	}

} //DropUniqueConstraintTypeImpl
