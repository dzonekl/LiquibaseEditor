/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.liquibase.xml.ns.dbchangelog.AppendType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.ModifySqlType;
import org.liquibase.xml.ns.dbchangelog.PrependType;
import org.liquibase.xml.ns.dbchangelog.RegExpReplaceType;
import org.liquibase.xml.ns.dbchangelog.ReplaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Sql Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getModifySqlChildren <em>Modify Sql Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getRegExpReplace <em>Reg Exp Replace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getPrepend <em>Prepend</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getAppend <em>Append</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getApplyToRollback <em>Apply To Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl#getDbms <em>Dbms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifySqlTypeImpl extends MinimalEObjectImpl.Container implements ModifySqlType {
	/**
	 * The cached value of the '{@link #getModifySqlChildren() <em>Modify Sql Children</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifySqlChildren()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap modifySqlChildren;

	/**
	 * The default value of the '{@link #getApplyToRollback() <em>Apply To Rollback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToRollback()
	 * @generated
	 * @ordered
	 */
	protected static final Object APPLY_TO_ROLLBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyToRollback() <em>Apply To Rollback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToRollback()
	 * @generated
	 * @ordered
	 */
	protected Object applyToRollback = APPLY_TO_ROLLBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySqlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getModifySqlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getModifySqlChildren() {
		if (modifySqlChildren == null) {
			modifySqlChildren = new BasicFeatureMap(this, DbchangelogPackage.MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN);
		}
		return modifySqlChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplaceType> getReplace() {
		return getModifySqlChildren().list(DbchangelogPackage.eINSTANCE.getModifySqlType_Replace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegExpReplaceType> getRegExpReplace() {
		return getModifySqlChildren().list(DbchangelogPackage.eINSTANCE.getModifySqlType_RegExpReplace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrependType> getPrepend() {
		return getModifySqlChildren().list(DbchangelogPackage.eINSTANCE.getModifySqlType_Prepend());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppendType> getAppend() {
		return getModifySqlChildren().list(DbchangelogPackage.eINSTANCE.getModifySqlType_Append());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getApplyToRollback() {
		return applyToRollback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToRollback(Object newApplyToRollback) {
		Object oldApplyToRollback = applyToRollback;
		applyToRollback = newApplyToRollback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MODIFY_SQL_TYPE__APPLY_TO_ROLLBACK, oldApplyToRollback, applyToRollback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MODIFY_SQL_TYPE__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.MODIFY_SQL_TYPE__DBMS, oldDbms, dbms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN:
				return ((InternalEList<?>)getModifySqlChildren()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.MODIFY_SQL_TYPE__REPLACE:
				return ((InternalEList<?>)getReplace()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.MODIFY_SQL_TYPE__REG_EXP_REPLACE:
				return ((InternalEList<?>)getRegExpReplace()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.MODIFY_SQL_TYPE__PREPEND:
				return ((InternalEList<?>)getPrepend()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPEND:
				return ((InternalEList<?>)getAppend()).basicRemove(otherEnd, msgs);
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
			case DbchangelogPackage.MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN:
				if (coreType) return getModifySqlChildren();
				return ((FeatureMap.Internal)getModifySqlChildren()).getWrapper();
			case DbchangelogPackage.MODIFY_SQL_TYPE__REPLACE:
				return getReplace();
			case DbchangelogPackage.MODIFY_SQL_TYPE__REG_EXP_REPLACE:
				return getRegExpReplace();
			case DbchangelogPackage.MODIFY_SQL_TYPE__PREPEND:
				return getPrepend();
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPEND:
				return getAppend();
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPLY_TO_ROLLBACK:
				return getApplyToRollback();
			case DbchangelogPackage.MODIFY_SQL_TYPE__CONTEXT:
				return getContext();
			case DbchangelogPackage.MODIFY_SQL_TYPE__DBMS:
				return getDbms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbchangelogPackage.MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN:
				((FeatureMap.Internal)getModifySqlChildren()).set(newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__REPLACE:
				getReplace().clear();
				getReplace().addAll((Collection<? extends ReplaceType>)newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__REG_EXP_REPLACE:
				getRegExpReplace().clear();
				getRegExpReplace().addAll((Collection<? extends RegExpReplaceType>)newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__PREPEND:
				getPrepend().clear();
				getPrepend().addAll((Collection<? extends PrependType>)newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPEND:
				getAppend().clear();
				getAppend().addAll((Collection<? extends AppendType>)newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPLY_TO_ROLLBACK:
				setApplyToRollback(newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__CONTEXT:
				setContext((String)newValue);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__DBMS:
				setDbms((String)newValue);
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
			case DbchangelogPackage.MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN:
				getModifySqlChildren().clear();
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__REPLACE:
				getReplace().clear();
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__REG_EXP_REPLACE:
				getRegExpReplace().clear();
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__PREPEND:
				getPrepend().clear();
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPEND:
				getAppend().clear();
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPLY_TO_ROLLBACK:
				setApplyToRollback(APPLY_TO_ROLLBACK_EDEFAULT);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case DbchangelogPackage.MODIFY_SQL_TYPE__DBMS:
				setDbms(DBMS_EDEFAULT);
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
			case DbchangelogPackage.MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN:
				return modifySqlChildren != null && !modifySqlChildren.isEmpty();
			case DbchangelogPackage.MODIFY_SQL_TYPE__REPLACE:
				return !getReplace().isEmpty();
			case DbchangelogPackage.MODIFY_SQL_TYPE__REG_EXP_REPLACE:
				return !getRegExpReplace().isEmpty();
			case DbchangelogPackage.MODIFY_SQL_TYPE__PREPEND:
				return !getPrepend().isEmpty();
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPEND:
				return !getAppend().isEmpty();
			case DbchangelogPackage.MODIFY_SQL_TYPE__APPLY_TO_ROLLBACK:
				return APPLY_TO_ROLLBACK_EDEFAULT == null ? applyToRollback != null : !APPLY_TO_ROLLBACK_EDEFAULT.equals(applyToRollback);
			case DbchangelogPackage.MODIFY_SQL_TYPE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case DbchangelogPackage.MODIFY_SQL_TYPE__DBMS:
				return DBMS_EDEFAULT == null ? dbms != null : !DBMS_EDEFAULT.equals(dbms);
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
		result.append(" (modifySqlChildren: ");
		result.append(modifySqlChildren);
		result.append(", applyToRollback: ");
		result.append(applyToRollback);
		result.append(", context: ");
		result.append(context);
		result.append(", dbms: ");
		result.append(dbms);
		result.append(')');
		return result.toString();
	}

} //ModifySqlTypeImpl
