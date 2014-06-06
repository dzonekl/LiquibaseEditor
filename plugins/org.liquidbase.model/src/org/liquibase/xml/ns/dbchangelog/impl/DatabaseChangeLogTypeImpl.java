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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.liquibase.xml.ns.dbchangelog.ChangeSetType;
import org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.IncludeAllType;
import org.liquibase.xml.ns.dbchangelog.IncludeType;
import org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy;
import org.liquibase.xml.ns.dbchangelog.PreConditionsType1;
import org.liquibase.xml.ns.dbchangelog.PropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Change Log Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getChangeSet <em>Change Set</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getLogicalFilePath <em>Logical File Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseChangeLogTypeImpl extends MinimalEObjectImpl.Container implements DatabaseChangeLogType {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> property;

	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected PreConditionsType1 preConditions;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getLogicalFilePath() <em>Logical File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalFilePath() <em>Logical File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalFilePath()
	 * @generated
	 * @ordered
	 */
	protected String logicalFilePath = LOGICAL_FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectQuotingStrategy() <em>Object Quoting Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectQuotingStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectQuotingStrategy OBJECT_QUOTING_STRATEGY_EDEFAULT = ObjectQuotingStrategy.LEGACY;

	/**
	 * The cached value of the '{@link #getObjectQuotingStrategy() <em>Object Quoting Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectQuotingStrategy()
	 * @generated
	 * @ordered
	 */
	protected ObjectQuotingStrategy objectQuotingStrategy = OBJECT_QUOTING_STRATEGY_EDEFAULT;

	/**
	 * This is true if the Object Quoting Strategy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectQuotingStrategyESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseChangeLogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionsType1 getPreConditions() {
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreConditions(PreConditionsType1 newPreConditions, NotificationChain msgs) {
		PreConditionsType1 oldPreConditions = preConditions;
		preConditions = newPreConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS, oldPreConditions, newPreConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreConditions(PreConditionsType1 newPreConditions) {
		if (newPreConditions != preConditions) {
			NotificationChain msgs = null;
			if (preConditions != null)
				msgs = ((InternalEObject)preConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS, null, msgs);
			if (newPreConditions != null)
				msgs = ((InternalEObject)newPreConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS, null, msgs);
			msgs = basicSetPreConditions(newPreConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS, newPreConditions, newPreConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSetType> getChangeSet() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_ChangeSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Include());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeAllType> getIncludeAll() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_IncludeAll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicalFilePath() {
		return logicalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalFilePath(String newLogicalFilePath) {
		String oldLogicalFilePath = logicalFilePath;
		logicalFilePath = newLogicalFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH, oldLogicalFilePath, logicalFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectQuotingStrategy getObjectQuotingStrategy() {
		return objectQuotingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectQuotingStrategy(ObjectQuotingStrategy newObjectQuotingStrategy) {
		ObjectQuotingStrategy oldObjectQuotingStrategy = objectQuotingStrategy;
		objectQuotingStrategy = newObjectQuotingStrategy == null ? OBJECT_QUOTING_STRATEGY_EDEFAULT : newObjectQuotingStrategy;
		boolean oldObjectQuotingStrategyESet = objectQuotingStrategyESet;
		objectQuotingStrategyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY, oldObjectQuotingStrategy, objectQuotingStrategy, !oldObjectQuotingStrategyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectQuotingStrategy() {
		ObjectQuotingStrategy oldObjectQuotingStrategy = objectQuotingStrategy;
		boolean oldObjectQuotingStrategyESet = objectQuotingStrategyESet;
		objectQuotingStrategy = OBJECT_QUOTING_STRATEGY_EDEFAULT;
		objectQuotingStrategyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY, oldObjectQuotingStrategy, OBJECT_QUOTING_STRATEGY_EDEFAULT, oldObjectQuotingStrategyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectQuotingStrategy() {
		return objectQuotingStrategyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS:
				return basicSetPreConditions(null, msgs);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__CHANGE_SET:
				return ((InternalEList<?>)getChangeSet()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE_ALL:
				return ((InternalEList<?>)getIncludeAll()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY:
				return getProperty();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS:
				return getPreConditions();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__CHANGE_SET:
				return getChangeSet();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE:
				return getInclude();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE_ALL:
				return getIncludeAll();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH:
				return getLogicalFilePath();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY:
				return getObjectQuotingStrategy();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS:
				setPreConditions((PreConditionsType1)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__CHANGE_SET:
				getChangeSet().clear();
				getChangeSet().addAll((Collection<? extends ChangeSetType>)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE_ALL:
				getIncludeAll().clear();
				getIncludeAll().addAll((Collection<? extends IncludeAllType>)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH:
				setLogicalFilePath((String)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY:
				setObjectQuotingStrategy((ObjectQuotingStrategy)newValue);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS:
				setPreConditions((PreConditionsType1)null);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP:
				getGroup().clear();
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__CHANGE_SET:
				getChangeSet().clear();
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE_ALL:
				getIncludeAll().clear();
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH:
				setLogicalFilePath(LOGICAL_FILE_PATH_EDEFAULT);
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY:
				unsetObjectQuotingStrategy();
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS:
				return preConditions != null;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__CHANGE_SET:
				return !getChangeSet().isEmpty();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__INCLUDE_ALL:
				return !getIncludeAll().isEmpty();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH:
				return LOGICAL_FILE_PATH_EDEFAULT == null ? logicalFilePath != null : !LOGICAL_FILE_PATH_EDEFAULT.equals(logicalFilePath);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY:
				return isSetObjectQuotingStrategy();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", logicalFilePath: ");
		result.append(logicalFilePath);
		result.append(", objectQuotingStrategy: ");
		if (objectQuotingStrategyESet) result.append(objectQuotingStrategy); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DatabaseChangeLogTypeImpl
