/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.liquibase.xml.ns.dbchangelog.CreateProcedureType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Procedure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getRelativeToChangelogFile <em>Relative To Changelog File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateProcedureTypeImpl extends MinimalEObjectImpl.Container implements CreateProcedureType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDbms() <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbms()
	 * @generated
	 * @ordered
	 */
	protected static final String DBMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbms() <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbms()
	 * @generated
	 * @ordered
	 */
	protected String dbms = DBMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureName()
	 * @generated
	 * @ordered
	 */
	protected String procedureName = PROCEDURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeToChangelogFile() <em>Relative To Changelog File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeToChangelogFile()
	 * @generated
	 * @ordered
	 */
	protected static final Object RELATIVE_TO_CHANGELOG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeToChangelogFile() <em>Relative To Changelog File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeToChangelogFile()
	 * @generated
	 * @ordered
	 */
	protected Object relativeToChangelogFile = RELATIVE_TO_CHANGELOG_FILE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateProcedureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getCreateProcedureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)getMixed().get(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Comment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Comment(), newComment);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbms() {
		return dbms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbms(String newDbms) {
		String oldDbms = dbms;
		dbms = newDbms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__DBMS, oldDbms, dbms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcedureName() {
		return procedureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureName(String newProcedureName) {
		String oldProcedureName = procedureName;
		procedureName = newProcedureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__PROCEDURE_NAME, oldProcedureName, procedureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRelativeToChangelogFile() {
		return relativeToChangelogFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeToChangelogFile(Object newRelativeToChangelogFile) {
		Object oldRelativeToChangelogFile = relativeToChangelogFile;
		relativeToChangelogFile = newRelativeToChangelogFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE, oldRelativeToChangelogFile, relativeToChangelogFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_PROCEDURE_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__COMMENT:
				return getComment();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__DBMS:
				return getDbms();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__ENCODING:
				return getEncoding();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PATH:
				return getPath();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PROCEDURE_NAME:
				return getProcedureName();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return getRelativeToChangelogFile();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__SCHEMA_NAME:
				return getSchemaName();
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
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__DBMS:
				setDbms((String)newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PATH:
				setPath((String)newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PROCEDURE_NAME:
				setProcedureName((String)newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(newValue);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
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
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED:
				getMixed().clear();
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__DBMS:
				setDbms(DBMS_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PROCEDURE_NAME:
				setProcedureName(PROCEDURE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(RELATIVE_TO_CHANGELOG_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
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
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__DBMS:
				return DBMS_EDEFAULT == null ? dbms != null : !DBMS_EDEFAULT.equals(dbms);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PROCEDURE_NAME:
				return PROCEDURE_NAME_EDEFAULT == null ? procedureName != null : !PROCEDURE_NAME_EDEFAULT.equals(procedureName);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return RELATIVE_TO_CHANGELOG_FILE_EDEFAULT == null ? relativeToChangelogFile != null : !RELATIVE_TO_CHANGELOG_FILE_EDEFAULT.equals(relativeToChangelogFile);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", catalogName: ");
		result.append(catalogName);
		result.append(", dbms: ");
		result.append(dbms);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", path: ");
		result.append(path);
		result.append(", procedureName: ");
		result.append(procedureName);
		result.append(", relativeToChangelogFile: ");
		result.append(relativeToChangelogFile);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(')');
		return result.toString();
	}

} //CreateProcedureTypeImpl
