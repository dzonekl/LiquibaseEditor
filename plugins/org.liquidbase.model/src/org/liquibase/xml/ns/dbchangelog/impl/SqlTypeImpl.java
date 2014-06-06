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

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.SqlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl#getEndDelimiter <em>End Delimiter</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl#getSplitStatements <em>Split Statements</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl#getStripComments <em>Strip Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlTypeImpl extends MinimalEObjectImpl.Container implements SqlType {
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
	protected SqlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getSqlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DbchangelogPackage.SQL_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)getMixed().get(DbchangelogPackage.eINSTANCE.getSqlType_Comment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getSqlType_Comment(), newComment);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_TYPE__DBMS, oldDbms, dbms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_TYPE__END_DELIMITER, oldEndDelimiter, endDelimiter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_TYPE__SPLIT_STATEMENTS, oldSplitStatements, splitStatements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.SQL_TYPE__STRIP_COMMENTS, oldStripComments, stripComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.SQL_TYPE__MIXED:
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
			case DbchangelogPackage.SQL_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DbchangelogPackage.SQL_TYPE__COMMENT:
				return getComment();
			case DbchangelogPackage.SQL_TYPE__DBMS:
				return getDbms();
			case DbchangelogPackage.SQL_TYPE__END_DELIMITER:
				return getEndDelimiter();
			case DbchangelogPackage.SQL_TYPE__SPLIT_STATEMENTS:
				return getSplitStatements();
			case DbchangelogPackage.SQL_TYPE__STRIP_COMMENTS:
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
			case DbchangelogPackage.SQL_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DbchangelogPackage.SQL_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case DbchangelogPackage.SQL_TYPE__DBMS:
				setDbms((String)newValue);
				return;
			case DbchangelogPackage.SQL_TYPE__END_DELIMITER:
				setEndDelimiter((String)newValue);
				return;
			case DbchangelogPackage.SQL_TYPE__SPLIT_STATEMENTS:
				setSplitStatements(newValue);
				return;
			case DbchangelogPackage.SQL_TYPE__STRIP_COMMENTS:
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
			case DbchangelogPackage.SQL_TYPE__MIXED:
				getMixed().clear();
				return;
			case DbchangelogPackage.SQL_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_TYPE__DBMS:
				setDbms(DBMS_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_TYPE__END_DELIMITER:
				setEndDelimiter(END_DELIMITER_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_TYPE__SPLIT_STATEMENTS:
				setSplitStatements(SPLIT_STATEMENTS_EDEFAULT);
				return;
			case DbchangelogPackage.SQL_TYPE__STRIP_COMMENTS:
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
			case DbchangelogPackage.SQL_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DbchangelogPackage.SQL_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case DbchangelogPackage.SQL_TYPE__DBMS:
				return DBMS_EDEFAULT == null ? dbms != null : !DBMS_EDEFAULT.equals(dbms);
			case DbchangelogPackage.SQL_TYPE__END_DELIMITER:
				return END_DELIMITER_EDEFAULT == null ? endDelimiter != null : !END_DELIMITER_EDEFAULT.equals(endDelimiter);
			case DbchangelogPackage.SQL_TYPE__SPLIT_STATEMENTS:
				return SPLIT_STATEMENTS_EDEFAULT == null ? splitStatements != null : !SPLIT_STATEMENTS_EDEFAULT.equals(splitStatements);
			case DbchangelogPackage.SQL_TYPE__STRIP_COMMENTS:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", dbms: ");
		result.append(dbms);
		result.append(", endDelimiter: ");
		result.append(endDelimiter);
		result.append(", splitStatements: ");
		result.append(splitStatements);
		result.append(", stripComments: ");
		result.append(stripComments);
		result.append(')');
		return result.toString();
	}

} //SqlTypeImpl
