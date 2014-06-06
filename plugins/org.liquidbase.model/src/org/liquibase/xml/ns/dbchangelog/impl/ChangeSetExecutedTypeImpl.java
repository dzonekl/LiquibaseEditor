/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Set Executed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetExecutedTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetExecutedTypeImpl#getChangeLogFile <em>Change Log File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetExecutedTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeSetExecutedTypeImpl extends MinimalEObjectImpl.Container implements ChangeSetExecutedType {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeLogFile() <em>Change Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeLogFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_LOG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeLogFile() <em>Change Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeLogFile()
	 * @generated
	 * @ordered
	 */
	protected String changeLogFile = CHANGE_LOG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeSetExecutedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getChangeSetExecutedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeLogFile() {
		return changeLogFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogFile(String newChangeLogFile) {
		String oldChangeLogFile = changeLogFile;
		changeLogFile = newChangeLogFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__CHANGE_LOG_FILE, oldChangeLogFile, changeLogFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__AUTHOR:
				return getAuthor();
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__CHANGE_LOG_FILE:
				return getChangeLogFile();
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__ID:
				return getId();
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
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__CHANGE_LOG_FILE:
				setChangeLogFile((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__ID:
				setId((String)newValue);
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
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__CHANGE_LOG_FILE:
				setChangeLogFile(CHANGE_LOG_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__CHANGE_LOG_FILE:
				return CHANGE_LOG_FILE_EDEFAULT == null ? changeLogFile != null : !CHANGE_LOG_FILE_EDEFAULT.equals(changeLogFile);
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (author: ");
		result.append(author);
		result.append(", changeLogFile: ");
		result.append(changeLogFile);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ChangeSetExecutedTypeImpl
