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

import org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType;
import org.liquibase.xml.ns.dbchangelog.AddColumnType;
import org.liquibase.xml.ns.dbchangelog.AddDefaultValueType;
import org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType;
import org.liquibase.xml.ns.dbchangelog.AddLookupTableType;
import org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType;
import org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType;
import org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType;
import org.liquibase.xml.ns.dbchangelog.AlterSequenceType;
import org.liquibase.xml.ns.dbchangelog.ChangeSetType;
import org.liquibase.xml.ns.dbchangelog.CreateIndexType;
import org.liquibase.xml.ns.dbchangelog.CreateProcedureType;
import org.liquibase.xml.ns.dbchangelog.CreateSequenceType;
import org.liquibase.xml.ns.dbchangelog.CreateTableType;
import org.liquibase.xml.ns.dbchangelog.CreateViewType;
import org.liquibase.xml.ns.dbchangelog.CustomChangeType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DeleteType;
import org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType;
import org.liquibase.xml.ns.dbchangelog.DropColumnType;
import org.liquibase.xml.ns.dbchangelog.DropDefaultValueType;
import org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType;
import org.liquibase.xml.ns.dbchangelog.DropIndexType;
import org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType;
import org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType;
import org.liquibase.xml.ns.dbchangelog.DropProcedureType;
import org.liquibase.xml.ns.dbchangelog.DropSequenceType;
import org.liquibase.xml.ns.dbchangelog.DropTableType;
import org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType;
import org.liquibase.xml.ns.dbchangelog.DropViewType;
import org.liquibase.xml.ns.dbchangelog.ExecuteCommandType;
import org.liquibase.xml.ns.dbchangelog.InsertType;
import org.liquibase.xml.ns.dbchangelog.LoadDataType;
import org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType;
import org.liquibase.xml.ns.dbchangelog.MergeColumnsType;
import org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType;
import org.liquibase.xml.ns.dbchangelog.ModifySqlType;
import org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy;
import org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail;
import org.liquibase.xml.ns.dbchangelog.PreConditionsType;
import org.liquibase.xml.ns.dbchangelog.RenameColumnType;
import org.liquibase.xml.ns.dbchangelog.RenameTableType;
import org.liquibase.xml.ns.dbchangelog.RenameViewType;
import org.liquibase.xml.ns.dbchangelog.RollbackType;
import org.liquibase.xml.ns.dbchangelog.SqlFileType;
import org.liquibase.xml.ns.dbchangelog.SqlType;
import org.liquibase.xml.ns.dbchangelog.StopType;
import org.liquibase.xml.ns.dbchangelog.TagDatabaseType;
import org.liquibase.xml.ns.dbchangelog.UpdateType;
import org.liquibase.xml.ns.dbchangelog.ValidCheckSumType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getValidCheckSum <em>Valid Check Sum</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getTagDatabase <em>Tag Database</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getChangeSetChildren <em>Change Set Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getCreateTable <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropTable <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getCreateView <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRenameView <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropView <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddColumn <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getCreateProcedure <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropProcedure <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRenameTable <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRenameColumn <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropColumn <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getMergeColumns <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getModifyDataType <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getCreateSequence <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAlterSequence <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropSequence <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getCreateIndex <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropIndex <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddNotNullConstraint <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddPrimaryKey <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropPrimaryKey <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddLookupTable <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddAutoIncrement <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddDefaultValue <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropDefaultValue <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAddUniqueConstraint <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDropUniqueConstraint <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getCustomChange <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getLoadUpdateData <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getExecuteCommand <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getModifySql <em>Modify Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getFailOnError <em>Fail On Error</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getLogicalFilePath <em>Logical File Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getOnValidationFail <em>On Validation Fail</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRunAlways <em>Run Always</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRunInTransaction <em>Run In Transaction</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getRunOnChange <em>Run On Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeSetTypeImpl extends MinimalEObjectImpl.Container implements ChangeSetType {
	/**
	 * The cached value of the '{@link #getValidCheckSum() <em>Valid Check Sum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidCheckSum()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidCheckSumType> validCheckSum;

	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected PreConditionsType preConditions;

	/**
	 * The cached value of the '{@link #getTagDatabase() <em>Tag Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagDatabase()
	 * @generated
	 * @ordered
	 */
	protected TagDatabaseType tagDatabase;

	/**
	 * The cached value of the '{@link #getChangeSetChildren() <em>Change Set Children</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetChildren()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap changeSetChildren;

	/**
	 * The cached value of the '{@link #getModifySql() <em>Modify Sql</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifySql()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySqlType> modifySql;

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
	 * The default value of the '{@link #getFailOnError() <em>Fail On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailOnError()
	 * @generated
	 * @ordered
	 */
	protected static final Object FAIL_ON_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailOnError() <em>Fail On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailOnError()
	 * @generated
	 * @ordered
	 */
	protected Object failOnError = FAIL_ON_ERROR_EDEFAULT;

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
	 * The default value of the '{@link #getOnValidationFail() <em>On Validation Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnValidationFail()
	 * @generated
	 * @ordered
	 */
	protected static final OnChangeSetValidationFail ON_VALIDATION_FAIL_EDEFAULT = OnChangeSetValidationFail.HALT;

	/**
	 * The cached value of the '{@link #getOnValidationFail() <em>On Validation Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnValidationFail()
	 * @generated
	 * @ordered
	 */
	protected OnChangeSetValidationFail onValidationFail = ON_VALIDATION_FAIL_EDEFAULT;

	/**
	 * This is true if the On Validation Fail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onValidationFailESet;

	/**
	 * The default value of the '{@link #getRunAlways() <em>Run Always</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAlways()
	 * @generated
	 * @ordered
	 */
	protected static final Object RUN_ALWAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunAlways() <em>Run Always</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAlways()
	 * @generated
	 * @ordered
	 */
	protected Object runAlways = RUN_ALWAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunInTransaction() <em>Run In Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunInTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final Object RUN_IN_TRANSACTION_EDEFAULT = DbchangelogFactory.eINSTANCE.createFromString(DbchangelogPackage.eINSTANCE.getBooleanExp(), "true");

	/**
	 * The cached value of the '{@link #getRunInTransaction() <em>Run In Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunInTransaction()
	 * @generated
	 * @ordered
	 */
	protected Object runInTransaction = RUN_IN_TRANSACTION_EDEFAULT;

	/**
	 * This is true if the Run In Transaction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean runInTransactionESet;

	/**
	 * The default value of the '{@link #getRunOnChange() <em>Run On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunOnChange()
	 * @generated
	 * @ordered
	 */
	protected static final Object RUN_ON_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunOnChange() <em>Run On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunOnChange()
	 * @generated
	 * @ordered
	 */
	protected Object runOnChange = RUN_ON_CHANGE_EDEFAULT;

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
	protected ChangeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getChangeSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidCheckSumType> getValidCheckSum() {
		if (validCheckSum == null) {
			validCheckSum = new EObjectContainmentEList<ValidCheckSumType>(ValidCheckSumType.class, this, DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM);
		}
		return validCheckSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionsType getPreConditions() {
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreConditions(PreConditionsType newPreConditions, NotificationChain msgs) {
		PreConditionsType oldPreConditions = preConditions;
		preConditions = newPreConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS, oldPreConditions, newPreConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreConditions(PreConditionsType newPreConditions) {
		if (newPreConditions != preConditions) {
			NotificationChain msgs = null;
			if (preConditions != null)
				msgs = ((InternalEObject)preConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS, null, msgs);
			if (newPreConditions != null)
				msgs = ((InternalEObject)newPreConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS, null, msgs);
			msgs = basicSetPreConditions(newPreConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS, newPreConditions, newPreConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDatabaseType getTagDatabase() {
		return tagDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTagDatabase(TagDatabaseType newTagDatabase, NotificationChain msgs) {
		TagDatabaseType oldTagDatabase = tagDatabase;
		tagDatabase = newTagDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE, oldTagDatabase, newTagDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagDatabase(TagDatabaseType newTagDatabase) {
		if (newTagDatabase != tagDatabase) {
			NotificationChain msgs = null;
			if (tagDatabase != null)
				msgs = ((InternalEObject)tagDatabase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE, null, msgs);
			if (newTagDatabase != null)
				msgs = ((InternalEObject)newTagDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE, null, msgs);
			msgs = basicSetTagDatabase(newTagDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE, newTagDatabase, newTagDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeSetChildren() {
		if (changeSetChildren == null) {
			changeSetChildren = new BasicFeatureMap(this, DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN);
		}
		return changeSetChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComment() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Comment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateTableType> getCreateTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropTableType> getDropTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateViewType> getCreateView() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameViewType> getRenameView() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_RenameView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropViewType> getDropView() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsertType> getInsert() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Insert());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddColumnType> getAddColumn() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlType> getSql() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Sql());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateProcedureType> getCreateProcedure() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateProcedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropProcedureType> getDropProcedure() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropProcedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlFileType> getSqlFile() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_SqlFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameTableType> getRenameTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_RenameTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameColumnType> getRenameColumn() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_RenameColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropColumnType> getDropColumn() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergeColumnsType> getMergeColumns() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_MergeColumns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyDataTypeType> getModifyDataType() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_ModifyDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateSequenceType> getCreateSequence() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlterSequenceType> getAlterSequence() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AlterSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropSequenceType> getDropSequence() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateIndexType> getCreateIndex() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropIndexType> getDropIndex() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddNotNullConstraintType> getAddNotNullConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddNotNullConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropNotNullConstraintType> getDropNotNullConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropNotNullConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddForeignKeyConstraintType> getAddForeignKeyConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddForeignKeyConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropForeignKeyConstraintType> getDropForeignKeyConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropForeignKeyConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropAllForeignKeyConstraintsType> getDropAllForeignKeyConstraints() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropAllForeignKeyConstraints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddPrimaryKeyType> getAddPrimaryKey() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddPrimaryKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropPrimaryKeyType> getDropPrimaryKey() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropPrimaryKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddLookupTableType> getAddLookupTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddLookupTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddAutoIncrementType> getAddAutoIncrement() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddAutoIncrement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddDefaultValueType> getAddDefaultValue() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddDefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropDefaultValueType> getDropDefaultValue() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropDefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddUniqueConstraintType> getAddUniqueConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_AddUniqueConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropUniqueConstraintType> getDropUniqueConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_DropUniqueConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomChangeType> getCustomChange() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_CustomChange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UpdateType> getUpdate() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Update());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteType> getDelete() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Delete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadDataType> getLoadData() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_LoadData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadUpdateDataType> getLoadUpdateData() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_LoadUpdateData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecuteCommandType> getExecuteCommand() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_ExecuteCommand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopType> getStop() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackType> getRollback() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getChangeSetType_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getChangeSetChildren().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getChangeSetType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySqlType> getModifySql() {
		if (modifySql == null) {
			modifySql = new EObjectContainmentEList<ModifySqlType>(ModifySqlType.class, this, DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL);
		}
		return modifySql;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__DBMS, oldDbms, dbms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFailOnError() {
		return failOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailOnError(Object newFailOnError) {
		Object oldFailOnError = failOnError;
		failOnError = newFailOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__FAIL_ON_ERROR, oldFailOnError, failOnError));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__LOGICAL_FILE_PATH, oldLogicalFilePath, logicalFilePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY, oldObjectQuotingStrategy, objectQuotingStrategy, !oldObjectQuotingStrategyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY, oldObjectQuotingStrategy, OBJECT_QUOTING_STRATEGY_EDEFAULT, oldObjectQuotingStrategyESet));
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
	public OnChangeSetValidationFail getOnValidationFail() {
		return onValidationFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnValidationFail(OnChangeSetValidationFail newOnValidationFail) {
		OnChangeSetValidationFail oldOnValidationFail = onValidationFail;
		onValidationFail = newOnValidationFail == null ? ON_VALIDATION_FAIL_EDEFAULT : newOnValidationFail;
		boolean oldOnValidationFailESet = onValidationFailESet;
		onValidationFailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL, oldOnValidationFail, onValidationFail, !oldOnValidationFailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnValidationFail() {
		OnChangeSetValidationFail oldOnValidationFail = onValidationFail;
		boolean oldOnValidationFailESet = onValidationFailESet;
		onValidationFail = ON_VALIDATION_FAIL_EDEFAULT;
		onValidationFailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL, oldOnValidationFail, ON_VALIDATION_FAIL_EDEFAULT, oldOnValidationFailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnValidationFail() {
		return onValidationFailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRunAlways() {
		return runAlways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAlways(Object newRunAlways) {
		Object oldRunAlways = runAlways;
		runAlways = newRunAlways;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__RUN_ALWAYS, oldRunAlways, runAlways));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRunInTransaction() {
		return runInTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunInTransaction(Object newRunInTransaction) {
		Object oldRunInTransaction = runInTransaction;
		runInTransaction = newRunInTransaction;
		boolean oldRunInTransactionESet = runInTransactionESet;
		runInTransactionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION, oldRunInTransaction, runInTransaction, !oldRunInTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRunInTransaction() {
		Object oldRunInTransaction = runInTransaction;
		boolean oldRunInTransactionESet = runInTransactionESet;
		runInTransaction = RUN_IN_TRANSACTION_EDEFAULT;
		runInTransactionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION, oldRunInTransaction, RUN_IN_TRANSACTION_EDEFAULT, oldRunInTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRunInTransaction() {
		return runInTransactionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRunOnChange() {
		return runOnChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunOnChange(Object newRunOnChange) {
		Object oldRunOnChange = runOnChange;
		runOnChange = newRunOnChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CHANGE_SET_TYPE__RUN_ON_CHANGE, oldRunOnChange, runOnChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM:
				return ((InternalEList<?>)getValidCheckSum()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS:
				return basicSetPreConditions(null, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE:
				return basicSetTagDatabase(null, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN:
				return ((InternalEList<?>)getChangeSetChildren()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_TABLE:
				return ((InternalEList<?>)getCreateTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_TABLE:
				return ((InternalEList<?>)getDropTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_VIEW:
				return ((InternalEList<?>)getCreateView()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_VIEW:
				return ((InternalEList<?>)getRenameView()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_VIEW:
				return ((InternalEList<?>)getDropView()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__INSERT:
				return ((InternalEList<?>)getInsert()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_COLUMN:
				return ((InternalEList<?>)getAddColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL:
				return ((InternalEList<?>)getSql()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_PROCEDURE:
				return ((InternalEList<?>)getCreateProcedure()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PROCEDURE:
				return ((InternalEList<?>)getDropProcedure()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL_FILE:
				return ((InternalEList<?>)getSqlFile()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_TABLE:
				return ((InternalEList<?>)getRenameTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_COLUMN:
				return ((InternalEList<?>)getRenameColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_COLUMN:
				return ((InternalEList<?>)getDropColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__MERGE_COLUMNS:
				return ((InternalEList<?>)getMergeColumns()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_DATA_TYPE:
				return ((InternalEList<?>)getModifyDataType()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_SEQUENCE:
				return ((InternalEList<?>)getCreateSequence()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ALTER_SEQUENCE:
				return ((InternalEList<?>)getAlterSequence()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_SEQUENCE:
				return ((InternalEList<?>)getDropSequence()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_INDEX:
				return ((InternalEList<?>)getCreateIndex()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_INDEX:
				return ((InternalEList<?>)getDropIndex()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_NOT_NULL_CONSTRAINT:
				return ((InternalEList<?>)getAddNotNullConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_NOT_NULL_CONSTRAINT:
				return ((InternalEList<?>)getDropNotNullConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				return ((InternalEList<?>)getAddForeignKeyConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				return ((InternalEList<?>)getDropForeignKeyConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return ((InternalEList<?>)getDropAllForeignKeyConstraints()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_PRIMARY_KEY:
				return ((InternalEList<?>)getAddPrimaryKey()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PRIMARY_KEY:
				return ((InternalEList<?>)getDropPrimaryKey()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_LOOKUP_TABLE:
				return ((InternalEList<?>)getAddLookupTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_AUTO_INCREMENT:
				return ((InternalEList<?>)getAddAutoIncrement()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_DEFAULT_VALUE:
				return ((InternalEList<?>)getAddDefaultValue()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_DEFAULT_VALUE:
				return ((InternalEList<?>)getDropDefaultValue()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_UNIQUE_CONSTRAINT:
				return ((InternalEList<?>)getAddUniqueConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_UNIQUE_CONSTRAINT:
				return ((InternalEList<?>)getDropUniqueConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__CUSTOM_CHANGE:
				return ((InternalEList<?>)getCustomChange()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__UPDATE:
				return ((InternalEList<?>)getUpdate()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_DATA:
				return ((InternalEList<?>)getLoadData()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_UPDATE_DATA:
				return ((InternalEList<?>)getLoadUpdateData()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__EXECUTE_COMMAND:
				return ((InternalEList<?>)getExecuteCommand()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL:
				return ((InternalEList<?>)getModifySql()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM:
				return getValidCheckSum();
			case DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS:
				return getPreConditions();
			case DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE:
				return getTagDatabase();
			case DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN:
				if (coreType) return getChangeSetChildren();
				return ((FeatureMap.Internal)getChangeSetChildren()).getWrapper();
			case DbchangelogPackage.CHANGE_SET_TYPE__COMMENT:
				return getComment();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_TABLE:
				return getCreateTable();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_TABLE:
				return getDropTable();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_VIEW:
				return getCreateView();
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_VIEW:
				return getRenameView();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_VIEW:
				return getDropView();
			case DbchangelogPackage.CHANGE_SET_TYPE__INSERT:
				return getInsert();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_COLUMN:
				return getAddColumn();
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL:
				return getSql();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_PROCEDURE:
				return getCreateProcedure();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PROCEDURE:
				return getDropProcedure();
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL_FILE:
				return getSqlFile();
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_TABLE:
				return getRenameTable();
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_COLUMN:
				return getRenameColumn();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_COLUMN:
				return getDropColumn();
			case DbchangelogPackage.CHANGE_SET_TYPE__MERGE_COLUMNS:
				return getMergeColumns();
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_DATA_TYPE:
				return getModifyDataType();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_SEQUENCE:
				return getCreateSequence();
			case DbchangelogPackage.CHANGE_SET_TYPE__ALTER_SEQUENCE:
				return getAlterSequence();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_SEQUENCE:
				return getDropSequence();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_INDEX:
				return getCreateIndex();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_INDEX:
				return getDropIndex();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_NOT_NULL_CONSTRAINT:
				return getAddNotNullConstraint();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_NOT_NULL_CONSTRAINT:
				return getDropNotNullConstraint();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				return getAddForeignKeyConstraint();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				return getDropForeignKeyConstraint();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return getDropAllForeignKeyConstraints();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_PRIMARY_KEY:
				return getAddPrimaryKey();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PRIMARY_KEY:
				return getDropPrimaryKey();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_LOOKUP_TABLE:
				return getAddLookupTable();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_AUTO_INCREMENT:
				return getAddAutoIncrement();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_DEFAULT_VALUE:
				return getAddDefaultValue();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_DEFAULT_VALUE:
				return getDropDefaultValue();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_UNIQUE_CONSTRAINT:
				return getAddUniqueConstraint();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_UNIQUE_CONSTRAINT:
				return getDropUniqueConstraint();
			case DbchangelogPackage.CHANGE_SET_TYPE__CUSTOM_CHANGE:
				return getCustomChange();
			case DbchangelogPackage.CHANGE_SET_TYPE__UPDATE:
				return getUpdate();
			case DbchangelogPackage.CHANGE_SET_TYPE__DELETE:
				return getDelete();
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_DATA:
				return getLoadData();
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_UPDATE_DATA:
				return getLoadUpdateData();
			case DbchangelogPackage.CHANGE_SET_TYPE__EXECUTE_COMMAND:
				return getExecuteCommand();
			case DbchangelogPackage.CHANGE_SET_TYPE__STOP:
				return getStop();
			case DbchangelogPackage.CHANGE_SET_TYPE__ROLLBACK:
				return getRollback();
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL:
				return getModifySql();
			case DbchangelogPackage.CHANGE_SET_TYPE__AUTHOR:
				return getAuthor();
			case DbchangelogPackage.CHANGE_SET_TYPE__CONTEXT:
				return getContext();
			case DbchangelogPackage.CHANGE_SET_TYPE__DBMS:
				return getDbms();
			case DbchangelogPackage.CHANGE_SET_TYPE__FAIL_ON_ERROR:
				return getFailOnError();
			case DbchangelogPackage.CHANGE_SET_TYPE__ID:
				return getId();
			case DbchangelogPackage.CHANGE_SET_TYPE__LOGICAL_FILE_PATH:
				return getLogicalFilePath();
			case DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY:
				return getObjectQuotingStrategy();
			case DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL:
				return getOnValidationFail();
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ALWAYS:
				return getRunAlways();
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION:
				return getRunInTransaction();
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ON_CHANGE:
				return getRunOnChange();
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM:
				getValidCheckSum().clear();
				getValidCheckSum().addAll((Collection<? extends ValidCheckSumType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS:
				setPreConditions((PreConditionsType)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE:
				setTagDatabase((TagDatabaseType)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN:
				((FeatureMap.Internal)getChangeSetChildren()).set(newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends String>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_TABLE:
				getCreateTable().clear();
				getCreateTable().addAll((Collection<? extends CreateTableType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_TABLE:
				getDropTable().clear();
				getDropTable().addAll((Collection<? extends DropTableType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_VIEW:
				getCreateView().clear();
				getCreateView().addAll((Collection<? extends CreateViewType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_VIEW:
				getRenameView().clear();
				getRenameView().addAll((Collection<? extends RenameViewType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_VIEW:
				getDropView().clear();
				getDropView().addAll((Collection<? extends DropViewType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__INSERT:
				getInsert().clear();
				getInsert().addAll((Collection<? extends InsertType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_COLUMN:
				getAddColumn().clear();
				getAddColumn().addAll((Collection<? extends AddColumnType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL:
				getSql().clear();
				getSql().addAll((Collection<? extends SqlType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_PROCEDURE:
				getCreateProcedure().clear();
				getCreateProcedure().addAll((Collection<? extends CreateProcedureType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PROCEDURE:
				getDropProcedure().clear();
				getDropProcedure().addAll((Collection<? extends DropProcedureType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL_FILE:
				getSqlFile().clear();
				getSqlFile().addAll((Collection<? extends SqlFileType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_TABLE:
				getRenameTable().clear();
				getRenameTable().addAll((Collection<? extends RenameTableType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_COLUMN:
				getRenameColumn().clear();
				getRenameColumn().addAll((Collection<? extends RenameColumnType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_COLUMN:
				getDropColumn().clear();
				getDropColumn().addAll((Collection<? extends DropColumnType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__MERGE_COLUMNS:
				getMergeColumns().clear();
				getMergeColumns().addAll((Collection<? extends MergeColumnsType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_DATA_TYPE:
				getModifyDataType().clear();
				getModifyDataType().addAll((Collection<? extends ModifyDataTypeType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_SEQUENCE:
				getCreateSequence().clear();
				getCreateSequence().addAll((Collection<? extends CreateSequenceType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ALTER_SEQUENCE:
				getAlterSequence().clear();
				getAlterSequence().addAll((Collection<? extends AlterSequenceType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_SEQUENCE:
				getDropSequence().clear();
				getDropSequence().addAll((Collection<? extends DropSequenceType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_INDEX:
				getCreateIndex().clear();
				getCreateIndex().addAll((Collection<? extends CreateIndexType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_INDEX:
				getDropIndex().clear();
				getDropIndex().addAll((Collection<? extends DropIndexType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_NOT_NULL_CONSTRAINT:
				getAddNotNullConstraint().clear();
				getAddNotNullConstraint().addAll((Collection<? extends AddNotNullConstraintType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_NOT_NULL_CONSTRAINT:
				getDropNotNullConstraint().clear();
				getDropNotNullConstraint().addAll((Collection<? extends DropNotNullConstraintType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				getAddForeignKeyConstraint().clear();
				getAddForeignKeyConstraint().addAll((Collection<? extends AddForeignKeyConstraintType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				getDropForeignKeyConstraint().clear();
				getDropForeignKeyConstraint().addAll((Collection<? extends DropForeignKeyConstraintType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				getDropAllForeignKeyConstraints().clear();
				getDropAllForeignKeyConstraints().addAll((Collection<? extends DropAllForeignKeyConstraintsType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_PRIMARY_KEY:
				getAddPrimaryKey().clear();
				getAddPrimaryKey().addAll((Collection<? extends AddPrimaryKeyType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PRIMARY_KEY:
				getDropPrimaryKey().clear();
				getDropPrimaryKey().addAll((Collection<? extends DropPrimaryKeyType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_LOOKUP_TABLE:
				getAddLookupTable().clear();
				getAddLookupTable().addAll((Collection<? extends AddLookupTableType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_AUTO_INCREMENT:
				getAddAutoIncrement().clear();
				getAddAutoIncrement().addAll((Collection<? extends AddAutoIncrementType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_DEFAULT_VALUE:
				getAddDefaultValue().clear();
				getAddDefaultValue().addAll((Collection<? extends AddDefaultValueType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_DEFAULT_VALUE:
				getDropDefaultValue().clear();
				getDropDefaultValue().addAll((Collection<? extends DropDefaultValueType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_UNIQUE_CONSTRAINT:
				getAddUniqueConstraint().clear();
				getAddUniqueConstraint().addAll((Collection<? extends AddUniqueConstraintType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_UNIQUE_CONSTRAINT:
				getDropUniqueConstraint().clear();
				getDropUniqueConstraint().addAll((Collection<? extends DropUniqueConstraintType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CUSTOM_CHANGE:
				getCustomChange().clear();
				getCustomChange().addAll((Collection<? extends CustomChangeType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__UPDATE:
				getUpdate().clear();
				getUpdate().addAll((Collection<? extends UpdateType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends DeleteType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_DATA:
				getLoadData().clear();
				getLoadData().addAll((Collection<? extends LoadDataType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_UPDATE_DATA:
				getLoadUpdateData().clear();
				getLoadUpdateData().addAll((Collection<? extends LoadUpdateDataType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__EXECUTE_COMMAND:
				getExecuteCommand().clear();
				getExecuteCommand().addAll((Collection<? extends ExecuteCommandType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL:
				getModifySql().clear();
				getModifySql().addAll((Collection<? extends ModifySqlType>)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CONTEXT:
				setContext((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DBMS:
				setDbms((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__FAIL_ON_ERROR:
				setFailOnError(newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ID:
				setId((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__LOGICAL_FILE_PATH:
				setLogicalFilePath((String)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY:
				setObjectQuotingStrategy((ObjectQuotingStrategy)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL:
				setOnValidationFail((OnChangeSetValidationFail)newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ALWAYS:
				setRunAlways(newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION:
				setRunInTransaction(newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ON_CHANGE:
				setRunOnChange(newValue);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM:
				getValidCheckSum().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS:
				setPreConditions((PreConditionsType)null);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE:
				setTagDatabase((TagDatabaseType)null);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN:
				getChangeSetChildren().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__COMMENT:
				getComment().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_TABLE:
				getCreateTable().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_TABLE:
				getDropTable().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_VIEW:
				getCreateView().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_VIEW:
				getRenameView().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_VIEW:
				getDropView().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__INSERT:
				getInsert().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_COLUMN:
				getAddColumn().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL:
				getSql().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_PROCEDURE:
				getCreateProcedure().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PROCEDURE:
				getDropProcedure().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL_FILE:
				getSqlFile().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_TABLE:
				getRenameTable().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_COLUMN:
				getRenameColumn().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_COLUMN:
				getDropColumn().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__MERGE_COLUMNS:
				getMergeColumns().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_DATA_TYPE:
				getModifyDataType().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_SEQUENCE:
				getCreateSequence().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ALTER_SEQUENCE:
				getAlterSequence().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_SEQUENCE:
				getDropSequence().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_INDEX:
				getCreateIndex().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_INDEX:
				getDropIndex().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_NOT_NULL_CONSTRAINT:
				getAddNotNullConstraint().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_NOT_NULL_CONSTRAINT:
				getDropNotNullConstraint().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				getAddForeignKeyConstraint().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				getDropForeignKeyConstraint().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				getDropAllForeignKeyConstraints().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_PRIMARY_KEY:
				getAddPrimaryKey().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PRIMARY_KEY:
				getDropPrimaryKey().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_LOOKUP_TABLE:
				getAddLookupTable().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_AUTO_INCREMENT:
				getAddAutoIncrement().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_DEFAULT_VALUE:
				getAddDefaultValue().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_DEFAULT_VALUE:
				getDropDefaultValue().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_UNIQUE_CONSTRAINT:
				getAddUniqueConstraint().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_UNIQUE_CONSTRAINT:
				getDropUniqueConstraint().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CUSTOM_CHANGE:
				getCustomChange().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__UPDATE:
				getUpdate().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DELETE:
				getDelete().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_DATA:
				getLoadData().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_UPDATE_DATA:
				getLoadUpdateData().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__EXECUTE_COMMAND:
				getExecuteCommand().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__STOP:
				getStop().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ROLLBACK:
				getRollback().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY:
				getAny().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL:
				getModifySql().clear();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__DBMS:
				setDbms(DBMS_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__FAIL_ON_ERROR:
				setFailOnError(FAIL_ON_ERROR_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__LOGICAL_FILE_PATH:
				setLogicalFilePath(LOGICAL_FILE_PATH_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY:
				unsetObjectQuotingStrategy();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL:
				unsetOnValidationFail();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ALWAYS:
				setRunAlways(RUN_ALWAYS_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION:
				unsetRunInTransaction();
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ON_CHANGE:
				setRunOnChange(RUN_ON_CHANGE_EDEFAULT);
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM:
				return validCheckSum != null && !validCheckSum.isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS:
				return preConditions != null;
			case DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE:
				return tagDatabase != null;
			case DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN:
				return changeSetChildren != null && !changeSetChildren.isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__COMMENT:
				return !getComment().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_TABLE:
				return !getCreateTable().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_TABLE:
				return !getDropTable().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_VIEW:
				return !getCreateView().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_VIEW:
				return !getRenameView().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_VIEW:
				return !getDropView().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__INSERT:
				return !getInsert().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_COLUMN:
				return !getAddColumn().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL:
				return !getSql().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_PROCEDURE:
				return !getCreateProcedure().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PROCEDURE:
				return !getDropProcedure().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__SQL_FILE:
				return !getSqlFile().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_TABLE:
				return !getRenameTable().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__RENAME_COLUMN:
				return !getRenameColumn().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_COLUMN:
				return !getDropColumn().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__MERGE_COLUMNS:
				return !getMergeColumns().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_DATA_TYPE:
				return !getModifyDataType().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_SEQUENCE:
				return !getCreateSequence().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ALTER_SEQUENCE:
				return !getAlterSequence().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_SEQUENCE:
				return !getDropSequence().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__CREATE_INDEX:
				return !getCreateIndex().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_INDEX:
				return !getDropIndex().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_NOT_NULL_CONSTRAINT:
				return !getAddNotNullConstraint().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_NOT_NULL_CONSTRAINT:
				return !getDropNotNullConstraint().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				return !getAddForeignKeyConstraint().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				return !getDropForeignKeyConstraint().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return !getDropAllForeignKeyConstraints().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_PRIMARY_KEY:
				return !getAddPrimaryKey().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_PRIMARY_KEY:
				return !getDropPrimaryKey().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_LOOKUP_TABLE:
				return !getAddLookupTable().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_AUTO_INCREMENT:
				return !getAddAutoIncrement().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_DEFAULT_VALUE:
				return !getAddDefaultValue().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_DEFAULT_VALUE:
				return !getDropDefaultValue().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ADD_UNIQUE_CONSTRAINT:
				return !getAddUniqueConstraint().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DROP_UNIQUE_CONSTRAINT:
				return !getDropUniqueConstraint().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__CUSTOM_CHANGE:
				return !getCustomChange().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__UPDATE:
				return !getUpdate().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__DELETE:
				return !getDelete().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_DATA:
				return !getLoadData().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__LOAD_UPDATE_DATA:
				return !getLoadUpdateData().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__EXECUTE_COMMAND:
				return !getExecuteCommand().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__STOP:
				return !getStop().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ROLLBACK:
				return !getRollback().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY:
				return !getAny().isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL:
				return modifySql != null && !modifySql.isEmpty();
			case DbchangelogPackage.CHANGE_SET_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case DbchangelogPackage.CHANGE_SET_TYPE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case DbchangelogPackage.CHANGE_SET_TYPE__DBMS:
				return DBMS_EDEFAULT == null ? dbms != null : !DBMS_EDEFAULT.equals(dbms);
			case DbchangelogPackage.CHANGE_SET_TYPE__FAIL_ON_ERROR:
				return FAIL_ON_ERROR_EDEFAULT == null ? failOnError != null : !FAIL_ON_ERROR_EDEFAULT.equals(failOnError);
			case DbchangelogPackage.CHANGE_SET_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DbchangelogPackage.CHANGE_SET_TYPE__LOGICAL_FILE_PATH:
				return LOGICAL_FILE_PATH_EDEFAULT == null ? logicalFilePath != null : !LOGICAL_FILE_PATH_EDEFAULT.equals(logicalFilePath);
			case DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY:
				return isSetObjectQuotingStrategy();
			case DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL:
				return isSetOnValidationFail();
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ALWAYS:
				return RUN_ALWAYS_EDEFAULT == null ? runAlways != null : !RUN_ALWAYS_EDEFAULT.equals(runAlways);
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION:
				return isSetRunInTransaction();
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ON_CHANGE:
				return RUN_ON_CHANGE_EDEFAULT == null ? runOnChange != null : !RUN_ON_CHANGE_EDEFAULT.equals(runOnChange);
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (changeSetChildren: ");
		result.append(changeSetChildren);
		result.append(", author: ");
		result.append(author);
		result.append(", context: ");
		result.append(context);
		result.append(", dbms: ");
		result.append(dbms);
		result.append(", failOnError: ");
		result.append(failOnError);
		result.append(", id: ");
		result.append(id);
		result.append(", logicalFilePath: ");
		result.append(logicalFilePath);
		result.append(", objectQuotingStrategy: ");
		if (objectQuotingStrategyESet) result.append(objectQuotingStrategy); else result.append("<unset>");
		result.append(", onValidationFail: ");
		if (onValidationFailESet) result.append(onValidationFail); else result.append("<unset>");
		result.append(", runAlways: ");
		result.append(runAlways);
		result.append(", runInTransaction: ");
		if (runInTransactionESet) result.append(runInTransaction); else result.append("<unset>");
		result.append(", runOnChange: ");
		result.append(runOnChange);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ChangeSetTypeImpl
