/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.liquibase.xml.ns.dbchangelog.AndType;
import org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType;
import org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType;
import org.liquibase.xml.ns.dbchangelog.ColumnExistsType;
import org.liquibase.xml.ns.dbchangelog.CustomPreconditionType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DbmsType;
import org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType;
import org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType;
import org.liquibase.xml.ns.dbchangelog.IndexExistsType;
import org.liquibase.xml.ns.dbchangelog.NotType;
import org.liquibase.xml.ns.dbchangelog.OrType;
import org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType;
import org.liquibase.xml.ns.dbchangelog.RowCountType;
import org.liquibase.xml.ns.dbchangelog.RunningAsType;
import org.liquibase.xml.ns.dbchangelog.SequenceExistsType;
import org.liquibase.xml.ns.dbchangelog.SqlCheckType;
import org.liquibase.xml.ns.dbchangelog.TableExistsType;
import org.liquibase.xml.ns.dbchangelog.TableIsEmptyType;
import org.liquibase.xml.ns.dbchangelog.ViewExistsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getRunningAs <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getChangeSetExecuted <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getTableExists <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getColumnExists <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getSequenceExists <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getIndexExists <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getPrimaryKeyExists <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getViewExists <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getTableIsEmpty <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getSqlCheck <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getCustomPrecondition <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndTypeImpl extends MinimalEObjectImpl.Container implements AndType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAndType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DbchangelogPackage.AND_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AndType> getAnd() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_And());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrType> getOr() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_Or());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotType> getNot() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_Not());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DbmsType> getDbms() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_Dbms());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunningAsType> getRunningAs() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_RunningAs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSetExecutedType> getChangeSetExecuted() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_ChangeSetExecuted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableExistsType> getTableExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_TableExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnExistsType> getColumnExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_ColumnExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceExistsType> getSequenceExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_SequenceExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKeyConstraintExistsType> getForeignKeyConstraintExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_ForeignKeyConstraintExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexExistsType> getIndexExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_IndexExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKeyExistsType> getPrimaryKeyExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_PrimaryKeyExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewExistsType> getViewExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_ViewExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIsEmptyType> getTableIsEmpty() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_TableIsEmpty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RowCountType> getRowCount() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_RowCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlCheckType> getSqlCheck() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_SqlCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeLogPropertyDefinedType> getChangeLogPropertyDefined() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_ChangeLogPropertyDefined());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpectedQuotingStrategyType> getExpectedQuotingStrategy() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_ExpectedQuotingStrategy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomPreconditionType> getCustomPrecondition() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getAndType_CustomPrecondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getAndType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.AND_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__DBMS:
				return ((InternalEList<?>)getDbms()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__RUNNING_AS:
				return ((InternalEList<?>)getRunningAs()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__CHANGE_SET_EXECUTED:
				return ((InternalEList<?>)getChangeSetExecuted()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__TABLE_EXISTS:
				return ((InternalEList<?>)getTableExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__COLUMN_EXISTS:
				return ((InternalEList<?>)getColumnExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__SEQUENCE_EXISTS:
				return ((InternalEList<?>)getSequenceExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return ((InternalEList<?>)getForeignKeyConstraintExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__INDEX_EXISTS:
				return ((InternalEList<?>)getIndexExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__PRIMARY_KEY_EXISTS:
				return ((InternalEList<?>)getPrimaryKeyExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__VIEW_EXISTS:
				return ((InternalEList<?>)getViewExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__TABLE_IS_EMPTY:
				return ((InternalEList<?>)getTableIsEmpty()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__ROW_COUNT:
				return ((InternalEList<?>)getRowCount()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__SQL_CHECK:
				return ((InternalEList<?>)getSqlCheck()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				return ((InternalEList<?>)getChangeLogPropertyDefined()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__EXPECTED_QUOTING_STRATEGY:
				return ((InternalEList<?>)getExpectedQuotingStrategy()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__CUSTOM_PRECONDITION:
				return ((InternalEList<?>)getCustomPrecondition()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.AND_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case DbchangelogPackage.AND_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DbchangelogPackage.AND_TYPE__AND:
				return getAnd();
			case DbchangelogPackage.AND_TYPE__OR:
				return getOr();
			case DbchangelogPackage.AND_TYPE__NOT:
				return getNot();
			case DbchangelogPackage.AND_TYPE__DBMS:
				return getDbms();
			case DbchangelogPackage.AND_TYPE__RUNNING_AS:
				return getRunningAs();
			case DbchangelogPackage.AND_TYPE__CHANGE_SET_EXECUTED:
				return getChangeSetExecuted();
			case DbchangelogPackage.AND_TYPE__TABLE_EXISTS:
				return getTableExists();
			case DbchangelogPackage.AND_TYPE__COLUMN_EXISTS:
				return getColumnExists();
			case DbchangelogPackage.AND_TYPE__SEQUENCE_EXISTS:
				return getSequenceExists();
			case DbchangelogPackage.AND_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return getForeignKeyConstraintExists();
			case DbchangelogPackage.AND_TYPE__INDEX_EXISTS:
				return getIndexExists();
			case DbchangelogPackage.AND_TYPE__PRIMARY_KEY_EXISTS:
				return getPrimaryKeyExists();
			case DbchangelogPackage.AND_TYPE__VIEW_EXISTS:
				return getViewExists();
			case DbchangelogPackage.AND_TYPE__TABLE_IS_EMPTY:
				return getTableIsEmpty();
			case DbchangelogPackage.AND_TYPE__ROW_COUNT:
				return getRowCount();
			case DbchangelogPackage.AND_TYPE__SQL_CHECK:
				return getSqlCheck();
			case DbchangelogPackage.AND_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				return getChangeLogPropertyDefined();
			case DbchangelogPackage.AND_TYPE__EXPECTED_QUOTING_STRATEGY:
				return getExpectedQuotingStrategy();
			case DbchangelogPackage.AND_TYPE__CUSTOM_PRECONDITION:
				return getCustomPrecondition();
			case DbchangelogPackage.AND_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case DbchangelogPackage.AND_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DbchangelogPackage.AND_TYPE__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends AndType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends OrType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends NotType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__DBMS:
				getDbms().clear();
				getDbms().addAll((Collection<? extends DbmsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__RUNNING_AS:
				getRunningAs().clear();
				getRunningAs().addAll((Collection<? extends RunningAsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__CHANGE_SET_EXECUTED:
				getChangeSetExecuted().clear();
				getChangeSetExecuted().addAll((Collection<? extends ChangeSetExecutedType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__TABLE_EXISTS:
				getTableExists().clear();
				getTableExists().addAll((Collection<? extends TableExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__COLUMN_EXISTS:
				getColumnExists().clear();
				getColumnExists().addAll((Collection<? extends ColumnExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__SEQUENCE_EXISTS:
				getSequenceExists().clear();
				getSequenceExists().addAll((Collection<? extends SequenceExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				getForeignKeyConstraintExists().clear();
				getForeignKeyConstraintExists().addAll((Collection<? extends ForeignKeyConstraintExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__INDEX_EXISTS:
				getIndexExists().clear();
				getIndexExists().addAll((Collection<? extends IndexExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__PRIMARY_KEY_EXISTS:
				getPrimaryKeyExists().clear();
				getPrimaryKeyExists().addAll((Collection<? extends PrimaryKeyExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__VIEW_EXISTS:
				getViewExists().clear();
				getViewExists().addAll((Collection<? extends ViewExistsType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__TABLE_IS_EMPTY:
				getTableIsEmpty().clear();
				getTableIsEmpty().addAll((Collection<? extends TableIsEmptyType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__ROW_COUNT:
				getRowCount().clear();
				getRowCount().addAll((Collection<? extends RowCountType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__SQL_CHECK:
				getSqlCheck().clear();
				getSqlCheck().addAll((Collection<? extends SqlCheckType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				getChangeLogPropertyDefined().clear();
				getChangeLogPropertyDefined().addAll((Collection<? extends ChangeLogPropertyDefinedType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__EXPECTED_QUOTING_STRATEGY:
				getExpectedQuotingStrategy().clear();
				getExpectedQuotingStrategy().addAll((Collection<? extends ExpectedQuotingStrategyType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__CUSTOM_PRECONDITION:
				getCustomPrecondition().clear();
				getCustomPrecondition().addAll((Collection<? extends CustomPreconditionType>)newValue);
				return;
			case DbchangelogPackage.AND_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case DbchangelogPackage.AND_TYPE__GROUP:
				getGroup().clear();
				return;
			case DbchangelogPackage.AND_TYPE__AND:
				getAnd().clear();
				return;
			case DbchangelogPackage.AND_TYPE__OR:
				getOr().clear();
				return;
			case DbchangelogPackage.AND_TYPE__NOT:
				getNot().clear();
				return;
			case DbchangelogPackage.AND_TYPE__DBMS:
				getDbms().clear();
				return;
			case DbchangelogPackage.AND_TYPE__RUNNING_AS:
				getRunningAs().clear();
				return;
			case DbchangelogPackage.AND_TYPE__CHANGE_SET_EXECUTED:
				getChangeSetExecuted().clear();
				return;
			case DbchangelogPackage.AND_TYPE__TABLE_EXISTS:
				getTableExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__COLUMN_EXISTS:
				getColumnExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__SEQUENCE_EXISTS:
				getSequenceExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				getForeignKeyConstraintExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__INDEX_EXISTS:
				getIndexExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__PRIMARY_KEY_EXISTS:
				getPrimaryKeyExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__VIEW_EXISTS:
				getViewExists().clear();
				return;
			case DbchangelogPackage.AND_TYPE__TABLE_IS_EMPTY:
				getTableIsEmpty().clear();
				return;
			case DbchangelogPackage.AND_TYPE__ROW_COUNT:
				getRowCount().clear();
				return;
			case DbchangelogPackage.AND_TYPE__SQL_CHECK:
				getSqlCheck().clear();
				return;
			case DbchangelogPackage.AND_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				getChangeLogPropertyDefined().clear();
				return;
			case DbchangelogPackage.AND_TYPE__EXPECTED_QUOTING_STRATEGY:
				getExpectedQuotingStrategy().clear();
				return;
			case DbchangelogPackage.AND_TYPE__CUSTOM_PRECONDITION:
				getCustomPrecondition().clear();
				return;
			case DbchangelogPackage.AND_TYPE__ANY:
				getAny().clear();
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
			case DbchangelogPackage.AND_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DbchangelogPackage.AND_TYPE__AND:
				return !getAnd().isEmpty();
			case DbchangelogPackage.AND_TYPE__OR:
				return !getOr().isEmpty();
			case DbchangelogPackage.AND_TYPE__NOT:
				return !getNot().isEmpty();
			case DbchangelogPackage.AND_TYPE__DBMS:
				return !getDbms().isEmpty();
			case DbchangelogPackage.AND_TYPE__RUNNING_AS:
				return !getRunningAs().isEmpty();
			case DbchangelogPackage.AND_TYPE__CHANGE_SET_EXECUTED:
				return !getChangeSetExecuted().isEmpty();
			case DbchangelogPackage.AND_TYPE__TABLE_EXISTS:
				return !getTableExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__COLUMN_EXISTS:
				return !getColumnExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__SEQUENCE_EXISTS:
				return !getSequenceExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return !getForeignKeyConstraintExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__INDEX_EXISTS:
				return !getIndexExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__PRIMARY_KEY_EXISTS:
				return !getPrimaryKeyExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__VIEW_EXISTS:
				return !getViewExists().isEmpty();
			case DbchangelogPackage.AND_TYPE__TABLE_IS_EMPTY:
				return !getTableIsEmpty().isEmpty();
			case DbchangelogPackage.AND_TYPE__ROW_COUNT:
				return !getRowCount().isEmpty();
			case DbchangelogPackage.AND_TYPE__SQL_CHECK:
				return !getSqlCheck().isEmpty();
			case DbchangelogPackage.AND_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				return !getChangeLogPropertyDefined().isEmpty();
			case DbchangelogPackage.AND_TYPE__EXPECTED_QUOTING_STRATEGY:
				return !getExpectedQuotingStrategy().isEmpty();
			case DbchangelogPackage.AND_TYPE__CUSTOM_PRECONDITION:
				return !getCustomPrecondition().isEmpty();
			case DbchangelogPackage.AND_TYPE__ANY:
				return !getAny().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AndTypeImpl
