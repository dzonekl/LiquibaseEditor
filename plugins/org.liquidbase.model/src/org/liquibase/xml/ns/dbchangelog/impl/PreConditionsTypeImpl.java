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
import org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput;
import org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail;
import org.liquibase.xml.ns.dbchangelog.OrType;
import org.liquibase.xml.ns.dbchangelog.PreConditionsType;
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
 * An implementation of the model object '<em><b>Pre Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getRunningAs <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getChangeSetExecuted <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getTableExists <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getColumnExists <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getSequenceExists <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getIndexExists <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getPrimaryKeyExists <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getViewExists <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getTableIsEmpty <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getSqlCheck <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getCustomPrecondition <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getOnError <em>On Error</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getOnErrorMessage <em>On Error Message</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getOnFail <em>On Fail</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getOnFailMessage <em>On Fail Message</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl#getOnSqlOutput <em>On Sql Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreConditionsTypeImpl extends MinimalEObjectImpl.Container implements PreConditionsType {
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
	 * The default value of the '{@link #getOnError() <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnError()
	 * @generated
	 * @ordered
	 */
	protected static final OnChangeSetPreconditionErrorOrFail ON_ERROR_EDEFAULT = OnChangeSetPreconditionErrorOrFail.HALT;

	/**
	 * The cached value of the '{@link #getOnError() <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnError()
	 * @generated
	 * @ordered
	 */
	protected OnChangeSetPreconditionErrorOrFail onError = ON_ERROR_EDEFAULT;

	/**
	 * This is true if the On Error attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onErrorESet;

	/**
	 * The default value of the '{@link #getOnErrorMessage() <em>On Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnErrorMessage() <em>On Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String onErrorMessage = ON_ERROR_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnFail() <em>On Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFail()
	 * @generated
	 * @ordered
	 */
	protected static final OnChangeSetPreconditionErrorOrFail ON_FAIL_EDEFAULT = OnChangeSetPreconditionErrorOrFail.HALT;

	/**
	 * The cached value of the '{@link #getOnFail() <em>On Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFail()
	 * @generated
	 * @ordered
	 */
	protected OnChangeSetPreconditionErrorOrFail onFail = ON_FAIL_EDEFAULT;

	/**
	 * This is true if the On Fail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onFailESet;

	/**
	 * The default value of the '{@link #getOnFailMessage() <em>On Fail Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFailMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_FAIL_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnFailMessage() <em>On Fail Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFailMessage()
	 * @generated
	 * @ordered
	 */
	protected String onFailMessage = ON_FAIL_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnSqlOutput() <em>On Sql Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSqlOutput()
	 * @generated
	 * @ordered
	 */
	protected static final OnChangeLogPreconditionOnSqlOutput ON_SQL_OUTPUT_EDEFAULT = OnChangeLogPreconditionOnSqlOutput.TEST;

	/**
	 * The cached value of the '{@link #getOnSqlOutput() <em>On Sql Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSqlOutput()
	 * @generated
	 * @ordered
	 */
	protected OnChangeLogPreconditionOnSqlOutput onSqlOutput = ON_SQL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the On Sql Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onSqlOutputESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getPreConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AndType> getAnd() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_And());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrType> getOr() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_Or());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotType> getNot() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_Not());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DbmsType> getDbms() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_Dbms());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunningAsType> getRunningAs() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_RunningAs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSetExecutedType> getChangeSetExecuted() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_ChangeSetExecuted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableExistsType> getTableExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_TableExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnExistsType> getColumnExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_ColumnExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceExistsType> getSequenceExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_SequenceExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKeyConstraintExistsType> getForeignKeyConstraintExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_ForeignKeyConstraintExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexExistsType> getIndexExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_IndexExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKeyExistsType> getPrimaryKeyExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_PrimaryKeyExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewExistsType> getViewExists() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_ViewExists());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIsEmptyType> getTableIsEmpty() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_TableIsEmpty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RowCountType> getRowCount() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_RowCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlCheckType> getSqlCheck() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_SqlCheck());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeLogPropertyDefinedType> getChangeLogPropertyDefined() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_ChangeLogPropertyDefined());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpectedQuotingStrategyType> getExpectedQuotingStrategy() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_ExpectedQuotingStrategy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomPreconditionType> getCustomPrecondition() {
		return getGroup().list(DbchangelogPackage.eINSTANCE.getPreConditionsType_CustomPrecondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getPreConditionsType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeSetPreconditionErrorOrFail getOnError() {
		return onError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnError(OnChangeSetPreconditionErrorOrFail newOnError) {
		OnChangeSetPreconditionErrorOrFail oldOnError = onError;
		onError = newOnError == null ? ON_ERROR_EDEFAULT : newOnError;
		boolean oldOnErrorESet = onErrorESet;
		onErrorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR, oldOnError, onError, !oldOnErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnError() {
		OnChangeSetPreconditionErrorOrFail oldOnError = onError;
		boolean oldOnErrorESet = onErrorESet;
		onError = ON_ERROR_EDEFAULT;
		onErrorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR, oldOnError, ON_ERROR_EDEFAULT, oldOnErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnError() {
		return onErrorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnErrorMessage() {
		return onErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnErrorMessage(String newOnErrorMessage) {
		String oldOnErrorMessage = onErrorMessage;
		onErrorMessage = newOnErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE, oldOnErrorMessage, onErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeSetPreconditionErrorOrFail getOnFail() {
		return onFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFail(OnChangeSetPreconditionErrorOrFail newOnFail) {
		OnChangeSetPreconditionErrorOrFail oldOnFail = onFail;
		onFail = newOnFail == null ? ON_FAIL_EDEFAULT : newOnFail;
		boolean oldOnFailESet = onFailESet;
		onFailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL, oldOnFail, onFail, !oldOnFailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnFail() {
		OnChangeSetPreconditionErrorOrFail oldOnFail = onFail;
		boolean oldOnFailESet = onFailESet;
		onFail = ON_FAIL_EDEFAULT;
		onFailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL, oldOnFail, ON_FAIL_EDEFAULT, oldOnFailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnFail() {
		return onFailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnFailMessage() {
		return onFailMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFailMessage(String newOnFailMessage) {
		String oldOnFailMessage = onFailMessage;
		onFailMessage = newOnFailMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE, oldOnFailMessage, onFailMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeLogPreconditionOnSqlOutput getOnSqlOutput() {
		return onSqlOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnSqlOutput(OnChangeLogPreconditionOnSqlOutput newOnSqlOutput) {
		OnChangeLogPreconditionOnSqlOutput oldOnSqlOutput = onSqlOutput;
		onSqlOutput = newOnSqlOutput == null ? ON_SQL_OUTPUT_EDEFAULT : newOnSqlOutput;
		boolean oldOnSqlOutputESet = onSqlOutputESet;
		onSqlOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT, oldOnSqlOutput, onSqlOutput, !oldOnSqlOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnSqlOutput() {
		OnChangeLogPreconditionOnSqlOutput oldOnSqlOutput = onSqlOutput;
		boolean oldOnSqlOutputESet = onSqlOutputESet;
		onSqlOutput = ON_SQL_OUTPUT_EDEFAULT;
		onSqlOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT, oldOnSqlOutput, ON_SQL_OUTPUT_EDEFAULT, oldOnSqlOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnSqlOutput() {
		return onSqlOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__DBMS:
				return ((InternalEList<?>)getDbms()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__RUNNING_AS:
				return ((InternalEList<?>)getRunningAs()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_SET_EXECUTED:
				return ((InternalEList<?>)getChangeSetExecuted()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_EXISTS:
				return ((InternalEList<?>)getTableExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__COLUMN_EXISTS:
				return ((InternalEList<?>)getColumnExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SEQUENCE_EXISTS:
				return ((InternalEList<?>)getSequenceExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return ((InternalEList<?>)getForeignKeyConstraintExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__INDEX_EXISTS:
				return ((InternalEList<?>)getIndexExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__PRIMARY_KEY_EXISTS:
				return ((InternalEList<?>)getPrimaryKeyExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__VIEW_EXISTS:
				return ((InternalEList<?>)getViewExists()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_IS_EMPTY:
				return ((InternalEList<?>)getTableIsEmpty()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ROW_COUNT:
				return ((InternalEList<?>)getRowCount()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SQL_CHECK:
				return ((InternalEList<?>)getSqlCheck()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				return ((InternalEList<?>)getChangeLogPropertyDefined()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__EXPECTED_QUOTING_STRATEGY:
				return ((InternalEList<?>)getExpectedQuotingStrategy()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CUSTOM_PRECONDITION:
				return ((InternalEList<?>)getCustomPrecondition()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ANY:
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
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__AND:
				return getAnd();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__OR:
				return getOr();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__NOT:
				return getNot();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__DBMS:
				return getDbms();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__RUNNING_AS:
				return getRunningAs();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_SET_EXECUTED:
				return getChangeSetExecuted();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_EXISTS:
				return getTableExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__COLUMN_EXISTS:
				return getColumnExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SEQUENCE_EXISTS:
				return getSequenceExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return getForeignKeyConstraintExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__INDEX_EXISTS:
				return getIndexExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__PRIMARY_KEY_EXISTS:
				return getPrimaryKeyExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__VIEW_EXISTS:
				return getViewExists();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_IS_EMPTY:
				return getTableIsEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ROW_COUNT:
				return getRowCount();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SQL_CHECK:
				return getSqlCheck();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				return getChangeLogPropertyDefined();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__EXPECTED_QUOTING_STRATEGY:
				return getExpectedQuotingStrategy();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CUSTOM_PRECONDITION:
				return getCustomPrecondition();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR:
				return getOnError();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE:
				return getOnErrorMessage();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL:
				return getOnFail();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE:
				return getOnFailMessage();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT:
				return getOnSqlOutput();
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
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends AndType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends OrType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends NotType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__DBMS:
				getDbms().clear();
				getDbms().addAll((Collection<? extends DbmsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__RUNNING_AS:
				getRunningAs().clear();
				getRunningAs().addAll((Collection<? extends RunningAsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_SET_EXECUTED:
				getChangeSetExecuted().clear();
				getChangeSetExecuted().addAll((Collection<? extends ChangeSetExecutedType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_EXISTS:
				getTableExists().clear();
				getTableExists().addAll((Collection<? extends TableExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__COLUMN_EXISTS:
				getColumnExists().clear();
				getColumnExists().addAll((Collection<? extends ColumnExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SEQUENCE_EXISTS:
				getSequenceExists().clear();
				getSequenceExists().addAll((Collection<? extends SequenceExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				getForeignKeyConstraintExists().clear();
				getForeignKeyConstraintExists().addAll((Collection<? extends ForeignKeyConstraintExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__INDEX_EXISTS:
				getIndexExists().clear();
				getIndexExists().addAll((Collection<? extends IndexExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__PRIMARY_KEY_EXISTS:
				getPrimaryKeyExists().clear();
				getPrimaryKeyExists().addAll((Collection<? extends PrimaryKeyExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__VIEW_EXISTS:
				getViewExists().clear();
				getViewExists().addAll((Collection<? extends ViewExistsType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_IS_EMPTY:
				getTableIsEmpty().clear();
				getTableIsEmpty().addAll((Collection<? extends TableIsEmptyType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ROW_COUNT:
				getRowCount().clear();
				getRowCount().addAll((Collection<? extends RowCountType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SQL_CHECK:
				getSqlCheck().clear();
				getSqlCheck().addAll((Collection<? extends SqlCheckType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				getChangeLogPropertyDefined().clear();
				getChangeLogPropertyDefined().addAll((Collection<? extends ChangeLogPropertyDefinedType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__EXPECTED_QUOTING_STRATEGY:
				getExpectedQuotingStrategy().clear();
				getExpectedQuotingStrategy().addAll((Collection<? extends ExpectedQuotingStrategyType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CUSTOM_PRECONDITION:
				getCustomPrecondition().clear();
				getCustomPrecondition().addAll((Collection<? extends CustomPreconditionType>)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR:
				setOnError((OnChangeSetPreconditionErrorOrFail)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE:
				setOnErrorMessage((String)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL:
				setOnFail((OnChangeSetPreconditionErrorOrFail)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE:
				setOnFailMessage((String)newValue);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT:
				setOnSqlOutput((OnChangeLogPreconditionOnSqlOutput)newValue);
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
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__AND:
				getAnd().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__OR:
				getOr().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__NOT:
				getNot().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__DBMS:
				getDbms().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__RUNNING_AS:
				getRunningAs().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_SET_EXECUTED:
				getChangeSetExecuted().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_EXISTS:
				getTableExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__COLUMN_EXISTS:
				getColumnExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SEQUENCE_EXISTS:
				getSequenceExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				getForeignKeyConstraintExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__INDEX_EXISTS:
				getIndexExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__PRIMARY_KEY_EXISTS:
				getPrimaryKeyExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__VIEW_EXISTS:
				getViewExists().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_IS_EMPTY:
				getTableIsEmpty().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ROW_COUNT:
				getRowCount().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SQL_CHECK:
				getSqlCheck().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				getChangeLogPropertyDefined().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__EXPECTED_QUOTING_STRATEGY:
				getExpectedQuotingStrategy().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CUSTOM_PRECONDITION:
				getCustomPrecondition().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ANY:
				getAny().clear();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR:
				unsetOnError();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE:
				setOnErrorMessage(ON_ERROR_MESSAGE_EDEFAULT);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL:
				unsetOnFail();
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE:
				setOnFailMessage(ON_FAIL_MESSAGE_EDEFAULT);
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT:
				unsetOnSqlOutput();
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
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__AND:
				return !getAnd().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__OR:
				return !getOr().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__NOT:
				return !getNot().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__DBMS:
				return !getDbms().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__RUNNING_AS:
				return !getRunningAs().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_SET_EXECUTED:
				return !getChangeSetExecuted().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_EXISTS:
				return !getTableExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__COLUMN_EXISTS:
				return !getColumnExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SEQUENCE_EXISTS:
				return !getSequenceExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return !getForeignKeyConstraintExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__INDEX_EXISTS:
				return !getIndexExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__PRIMARY_KEY_EXISTS:
				return !getPrimaryKeyExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__VIEW_EXISTS:
				return !getViewExists().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__TABLE_IS_EMPTY:
				return !getTableIsEmpty().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ROW_COUNT:
				return !getRowCount().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__SQL_CHECK:
				return !getSqlCheck().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CHANGE_LOG_PROPERTY_DEFINED:
				return !getChangeLogPropertyDefined().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__EXPECTED_QUOTING_STRATEGY:
				return !getExpectedQuotingStrategy().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__CUSTOM_PRECONDITION:
				return !getCustomPrecondition().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ANY:
				return !getAny().isEmpty();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR:
				return isSetOnError();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE:
				return ON_ERROR_MESSAGE_EDEFAULT == null ? onErrorMessage != null : !ON_ERROR_MESSAGE_EDEFAULT.equals(onErrorMessage);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL:
				return isSetOnFail();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE:
				return ON_FAIL_MESSAGE_EDEFAULT == null ? onFailMessage != null : !ON_FAIL_MESSAGE_EDEFAULT.equals(onFailMessage);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT:
				return isSetOnSqlOutput();
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
		result.append(", onError: ");
		if (onErrorESet) result.append(onError); else result.append("<unset>");
		result.append(", onErrorMessage: ");
		result.append(onErrorMessage);
		result.append(", onFail: ");
		if (onFailESet) result.append(onFail); else result.append("<unset>");
		result.append(", onFailMessage: ");
		result.append(onFailMessage);
		result.append(", onSqlOutput: ");
		if (onSqlOutputESet) result.append(onSqlOutput); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PreConditionsTypeImpl
