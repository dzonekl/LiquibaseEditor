/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DropIndexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Index Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl#getAssociatedWith <em>Associated With</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropIndexTypeImpl extends MinimalEObjectImpl.Container implements DropIndexType {
	/**
	 * The default value of the '{@link #getAssociatedWith() <em>Associated With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedWith()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_WITH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedWith() <em>Associated With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedWith()
	 * @generated
	 * @ordered
	 */
	protected String associatedWith = ASSOCIATED_WITH_EDEFAULT;

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
	 * The default value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected String indexName = INDEX_NAME_EDEFAULT;

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
	protected DropIndexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getDropIndexType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedWith() {
		return associatedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedWith(String newAssociatedWith) {
		String oldAssociatedWith = associatedWith;
		associatedWith = newAssociatedWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_INDEX_TYPE__ASSOCIATED_WITH, oldAssociatedWith, associatedWith));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_INDEX_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexName(String newIndexName) {
		String oldIndexName = indexName;
		indexName = newIndexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_INDEX_TYPE__INDEX_NAME, oldIndexName, indexName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_INDEX_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_INDEX_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.DROP_INDEX_TYPE__ASSOCIATED_WITH:
				return getAssociatedWith();
			case DbchangelogPackage.DROP_INDEX_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.DROP_INDEX_TYPE__INDEX_NAME:
				return getIndexName();
			case DbchangelogPackage.DROP_INDEX_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.DROP_INDEX_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.DROP_INDEX_TYPE__ASSOCIATED_WITH:
				setAssociatedWith((String)newValue);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__INDEX_NAME:
				setIndexName((String)newValue);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.DROP_INDEX_TYPE__ASSOCIATED_WITH:
				setAssociatedWith(ASSOCIATED_WITH_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__INDEX_NAME:
				setIndexName(INDEX_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_INDEX_TYPE__TABLE_NAME:
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
			case DbchangelogPackage.DROP_INDEX_TYPE__ASSOCIATED_WITH:
				return ASSOCIATED_WITH_EDEFAULT == null ? associatedWith != null : !ASSOCIATED_WITH_EDEFAULT.equals(associatedWith);
			case DbchangelogPackage.DROP_INDEX_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.DROP_INDEX_TYPE__INDEX_NAME:
				return INDEX_NAME_EDEFAULT == null ? indexName != null : !INDEX_NAME_EDEFAULT.equals(indexName);
			case DbchangelogPackage.DROP_INDEX_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.DROP_INDEX_TYPE__TABLE_NAME:
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
		result.append(" (associatedWith: ");
		result.append(associatedWith);
		result.append(", catalogName: ");
		result.append(catalogName);
		result.append(", indexName: ");
		result.append(indexName);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //DropIndexTypeImpl
