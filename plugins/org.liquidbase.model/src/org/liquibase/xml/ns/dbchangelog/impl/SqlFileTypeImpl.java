/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.SqlFileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getEndDelimiter <em>End Delimiter</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getRelativeToChangelogFile <em>Relative To Changelog File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getSplitStatements <em>Split Statements</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl#getStripComments <em>Strip Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlFileTypeImpl extends MinimalEObjectImpl.Container implements SqlFileType {
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
	protected static final String ENCODING_EDEFAULT = "UTF-8";

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
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

	/**
	 * The default value of the '{@link #getEndDelimiter() <em>End Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDelimiter() <em>End Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String endDelimiter = END_DELIMITER_EDEFAULT;

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
	 * The default value of the '{@link #getSplitStatements() <em>Split Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitStatements()
	 * @generated
	 * @ordered
	 */
	protected static final Object SPLIT_STATEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSplitStatements() <em>Split Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitStatements()
	 * @generated
	 * @ordered
	 */
	protected Object splitStatements = SPLIT_STATEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStripComments() <em>Strip Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStripComments()
	 * @generated
	 * @ordered
	 */
	protected static final Object STRIP_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStripComments() <em>Strip Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStripComments()
	 * @generated
	 * @ordered
	 */
	protected Object stripComments = STRIP_COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getSqlFileType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__DBMS, oldDbms, dbms));
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
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__ENCODING, oldEncoding, encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		String oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.SQL_FILE_TYPE__ENCODING, oldEncoding, ENCODING_EDEFAULT, oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncoding() {
		return encodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDelimiter() {
		return endDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDelimiter(String newEndDelimiter) {
		String oldEndDelimiter = endDelimiter;
		endDelimiter = newEndDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__END_DELIMITER, oldEndDelimiter, endDelimiter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__RELATIVE_TO_CHANGELOG_FILE, oldRelativeToChangelogFile, relativeToChangelogFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSplitStatements() {
		return splitStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitStatements(Object newSplitStatements) {
		Object oldSplitStatements = splitStatements;
		splitStatements = newSplitStatements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__SPLIT_STATEMENTS, oldSplitStatements, splitStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStripComments() {
		return stripComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStripComments(Object newStripComments) {
		Object oldStripComments = stripComments;
		stripComments = newStripComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_FILE_TYPE__STRIP_COMMENTS, oldStripComments, stripComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.SQL_FILE_TYPE__DBMS:
				return getDbms();
			case DbchangelogPackage.SQL_FILE_TYPE__ENCODING:
				return getEncoding();
			case DbchangelogPackage.SQL_FILE_TYPE__END_DELIMITER:
				return getEndDelimiter();
			case DbchangelogPackage.SQL_FILE_TYPE__PATH:
				return getPath();
			case DbchangelogPackage.SQL_FILE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return getRelativeToChangelogFile();
			case DbchangelogPackage.SQL_FILE_TYPE__SPLIT_STATEMENTS:
				return getSplitStatements();
			case DbchangelogPackage.SQL_FILE_TYPE__STRIP_COMMENTS:
				return getStripComments();
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
			case DbchangelogPackage.SQL_FILE_TYPE__DBMS:
				setDbms((String)newValue);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__END_DELIMITER:
				setEndDelimiter((String)newValue);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__PATH:
				setPath((String)newValue);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(newValue);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__SPLIT_STATEMENTS:
				setSplitStatements(newValue);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__STRIP_COMMENTS:
				setStripComments(newValue);
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
			case DbchangelogPackage.SQL_FILE_TYPE__DBMS:
				setDbms(DBMS_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__ENCODING:
				unsetEncoding();
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__END_DELIMITER:
				setEndDelimiter(END_DELIMITER_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(RELATIVE_TO_CHANGELOG_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__SPLIT_STATEMENTS:
				setSplitStatements(SPLIT_STATEMENTS_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_FILE_TYPE__STRIP_COMMENTS:
				setStripComments(STRIP_COMMENTS_EDEFAULT);
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
			case DbchangelogPackage.SQL_FILE_TYPE__DBMS:
				return DBMS_EDEFAULT == null ? dbms != null : !DBMS_EDEFAULT.equals(dbms);
			case DbchangelogPackage.SQL_FILE_TYPE__ENCODING:
				return isSetEncoding();
			case DbchangelogPackage.SQL_FILE_TYPE__END_DELIMITER:
				return END_DELIMITER_EDEFAULT == null ? endDelimiter != null : !END_DELIMITER_EDEFAULT.equals(endDelimiter);
			case DbchangelogPackage.SQL_FILE_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DbchangelogPackage.SQL_FILE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return RELATIVE_TO_CHANGELOG_FILE_EDEFAULT == null ? relativeToChangelogFile != null : !RELATIVE_TO_CHANGELOG_FILE_EDEFAULT.equals(relativeToChangelogFile);
			case DbchangelogPackage.SQL_FILE_TYPE__SPLIT_STATEMENTS:
				return SPLIT_STATEMENTS_EDEFAULT == null ? splitStatements != null : !SPLIT_STATEMENTS_EDEFAULT.equals(splitStatements);
			case DbchangelogPackage.SQL_FILE_TYPE__STRIP_COMMENTS:
				return STRIP_COMMENTS_EDEFAULT == null ? stripComments != null : !STRIP_COMMENTS_EDEFAULT.equals(stripComments);
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
		result.append(" (dbms: ");
		result.append(dbms);
		result.append(", encoding: ");
		if (encodingESet) result.append(encoding); else result.append("<unset>");
		result.append(", endDelimiter: ");
		result.append(endDelimiter);
		result.append(", path: ");
		result.append(path);
		result.append(", relativeToChangelogFile: ");
		result.append(relativeToChangelogFile);
		result.append(", splitStatements: ");
		result.append(splitStatements);
		result.append(", stripComments: ");
		result.append(stripComments);
		result.append(')');
		return result.toString();
	}

} //SqlFileTypeImpl
