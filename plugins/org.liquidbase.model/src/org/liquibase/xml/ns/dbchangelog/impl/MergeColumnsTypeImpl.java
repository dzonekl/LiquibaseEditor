/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.MergeColumnsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Columns Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getColumn1Name <em>Column1 Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getColumn2Name <em>Column2 Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getFinalColumnName <em>Final Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getFinalColumnType <em>Final Column Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getJoinString <em>Join String</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergeColumnsTypeImpl extends MinimalEObjectImpl.Container implements MergeColumnsType {
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
	 * The default value of the '{@link #getColumn1Name() <em>Column1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1Name()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN1_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn1Name() <em>Column1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1Name()
	 * @generated
	 * @ordered
	 */
	protected String column1Name = COLUMN1_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn2Name() <em>Column2 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn2Name()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN2_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn2Name() <em>Column2 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn2Name()
	 * @generated
	 * @ordered
	 */
	protected String column2Name = COLUMN2_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalColumnName() <em>Final Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalColumnName() <em>Final Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalColumnName()
	 * @generated
	 * @ordered
	 */
	protected String finalColumnName = FINAL_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalColumnType() <em>Final Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalColumnType()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_COLUMN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalColumnType() <em>Final Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalColumnType()
	 * @generated
	 * @ordered
	 */
	protected String finalColumnType = FINAL_COLUMN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinString() <em>Join String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinString()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinString() <em>Join String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinString()
	 * @generated
	 * @ordered
	 */
	protected String joinString = JOIN_STRING_EDEFAULT;

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
	protected MergeColumnsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getMergeColumnsType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn1Name() {
		return column1Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn1Name(String newColumn1Name) {
		String oldColumn1Name = column1Name;
		column1Name = newColumn1Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN1_NAME, oldColumn1Name, column1Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn2Name() {
		return column2Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn2Name(String newColumn2Name) {
		String oldColumn2Name = column2Name;
		column2Name = newColumn2Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN2_NAME, oldColumn2Name, column2Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalColumnName() {
		return finalColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalColumnName(String newFinalColumnName) {
		String oldFinalColumnName = finalColumnName;
		finalColumnName = newFinalColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_NAME, oldFinalColumnName, finalColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalColumnType() {
		return finalColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalColumnType(String newFinalColumnType) {
		String oldFinalColumnType = finalColumnType;
		finalColumnType = newFinalColumnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_TYPE, oldFinalColumnType, finalColumnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJoinString() {
		return joinString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinString(String newJoinString) {
		String oldJoinString = joinString;
		joinString = newJoinString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__JOIN_STRING, oldJoinString, joinString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MERGE_COLUMNS_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN1_NAME:
				return getColumn1Name();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN2_NAME:
				return getColumn2Name();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_NAME:
				return getFinalColumnName();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_TYPE:
				return getFinalColumnType();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__JOIN_STRING:
				return getJoinString();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN1_NAME:
				setColumn1Name((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN2_NAME:
				setColumn2Name((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_NAME:
				setFinalColumnName((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_TYPE:
				setFinalColumnType((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__JOIN_STRING:
				setJoinString((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN1_NAME:
				setColumn1Name(COLUMN1_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN2_NAME:
				setColumn2Name(COLUMN2_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_NAME:
				setFinalColumnName(FINAL_COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_TYPE:
				setFinalColumnType(FINAL_COLUMN_TYPE_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__JOIN_STRING:
				setJoinString(JOIN_STRING_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN1_NAME:
				return COLUMN1_NAME_EDEFAULT == null ? column1Name != null : !COLUMN1_NAME_EDEFAULT.equals(column1Name);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__COLUMN2_NAME:
				return COLUMN2_NAME_EDEFAULT == null ? column2Name != null : !COLUMN2_NAME_EDEFAULT.equals(column2Name);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_NAME:
				return FINAL_COLUMN_NAME_EDEFAULT == null ? finalColumnName != null : !FINAL_COLUMN_NAME_EDEFAULT.equals(finalColumnName);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__FINAL_COLUMN_TYPE:
				return FINAL_COLUMN_TYPE_EDEFAULT == null ? finalColumnType != null : !FINAL_COLUMN_TYPE_EDEFAULT.equals(finalColumnType);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__JOIN_STRING:
				return JOIN_STRING_EDEFAULT == null ? joinString != null : !JOIN_STRING_EDEFAULT.equals(joinString);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE__TABLE_NAME:
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
		result.append(", column1Name: ");
		result.append(column1Name);
		result.append(", column2Name: ");
		result.append(column2Name);
		result.append(", finalColumnName: ");
		result.append(finalColumnName);
		result.append(", finalColumnType: ");
		result.append(finalColumnType);
		result.append(", joinString: ");
		result.append(joinString);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //MergeColumnsTypeImpl
