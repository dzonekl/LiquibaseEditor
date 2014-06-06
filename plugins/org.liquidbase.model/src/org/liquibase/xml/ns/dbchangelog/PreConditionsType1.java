/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Conditions Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getAnd <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOr <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getNot <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getRunningAs <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getChangeSetExecuted <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getTableExists <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getColumnExists <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getSequenceExists <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getIndexExists <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getPrimaryKeyExists <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getViewExists <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getTableIsEmpty <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getSqlCheck <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getCustomPrecondition <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnError <em>On Error</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnErrorMessage <em>On Error Message</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFail <em>On Fail</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFailMessage <em>On Fail Message</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnSqlOutput <em>On Sql Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1()
 * @model extendedMetaData="name='preConditions_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PreConditionsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_And()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AndType> getAnd();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.OrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_Or()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OrType> getOr();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.NotType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_Not()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='not' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NotType> getNot();

	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DbmsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_Dbms()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dbms' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DbmsType> getDbms();

	/**
	 * Returns the value of the '<em><b>Running As</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RunningAsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running As</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_RunningAs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='runningAs' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RunningAsType> getRunningAs();

	/**
	 * Returns the value of the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set Executed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Executed</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_ChangeSetExecuted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeSetExecuted' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ChangeSetExecutedType> getChangeSetExecuted();

	/**
	 * Returns the value of the '<em><b>Table Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.TableExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_TableExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TableExistsType> getTableExists();

	/**
	 * Returns the value of the '<em><b>Column Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_ColumnExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='columnExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ColumnExistsType> getColumnExists();

	/**
	 * Returns the value of the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_SequenceExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequenceExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SequenceExistsType> getSequenceExists();

	/**
	 * Returns the value of the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Constraint Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Constraint Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_ForeignKeyConstraintExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignKeyConstraintExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ForeignKeyConstraintExistsType> getForeignKeyConstraintExists();

	/**
	 * Returns the value of the '<em><b>Index Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.IndexExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_IndexExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexExistsType> getIndexExists();

	/**
	 * Returns the value of the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_PrimaryKeyExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primaryKeyExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PrimaryKeyExistsType> getPrimaryKeyExists();

	/**
	 * Returns the value of the '<em><b>View Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ViewExistsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Exists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_ViewExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ViewExistsType> getViewExists();

	/**
	 * Returns the value of the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Is Empty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Is Empty</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_TableIsEmpty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableIsEmpty' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TableIsEmptyType> getTableIsEmpty();

	/**
	 * Returns the value of the '<em><b>Row Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RowCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Count</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_RowCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rowCount' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RowCountType> getRowCount();

	/**
	 * Returns the value of the '<em><b>Sql Check</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.SqlCheckType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Check</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_SqlCheck()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlCheck' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SqlCheckType> getSqlCheck();

	/**
	 * Returns the value of the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Property Defined</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Property Defined</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_ChangeLogPropertyDefined()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeLogPropertyDefined' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ChangeLogPropertyDefinedType> getChangeLogPropertyDefined();

	/**
	 * Returns the value of the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Quoting Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Quoting Strategy</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_ExpectedQuotingStrategy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expectedQuotingStrategy' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExpectedQuotingStrategyType> getExpectedQuotingStrategy();

	/**
	 * Returns the value of the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CustomPreconditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Precondition</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_CustomPrecondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customPrecondition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomPreconditionType> getCustomPrecondition();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':20' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>On Error</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @see #isSetOnError()
	 * @see #unsetOnError()
	 * @see #setOnError(OnChangeLogPreconditionErrorOrFail)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_OnError()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onError'"
	 * @generated
	 */
	OnChangeLogPreconditionErrorOrFail getOnError();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnError <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @see #isSetOnError()
	 * @see #unsetOnError()
	 * @see #getOnError()
	 * @generated
	 */
	void setOnError(OnChangeLogPreconditionErrorOrFail value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnError <em>On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnError()
	 * @see #getOnError()
	 * @see #setOnError(OnChangeLogPreconditionErrorOrFail)
	 * @generated
	 */
	void unsetOnError();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnError <em>On Error</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Error</em>' attribute is set.
	 * @see #unsetOnError()
	 * @see #getOnError()
	 * @see #setOnError(OnChangeLogPreconditionErrorOrFail)
	 * @generated
	 */
	boolean isSetOnError();

	/**
	 * Returns the value of the '<em><b>On Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error Message</em>' attribute.
	 * @see #setOnErrorMessage(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_OnErrorMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onErrorMessage'"
	 * @generated
	 */
	String getOnErrorMessage();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnErrorMessage <em>On Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error Message</em>' attribute.
	 * @see #getOnErrorMessage()
	 * @generated
	 */
	void setOnErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>On Fail</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Fail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Fail</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @see #isSetOnFail()
	 * @see #unsetOnFail()
	 * @see #setOnFail(OnChangeLogPreconditionErrorOrFail)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_OnFail()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onFail'"
	 * @generated
	 */
	OnChangeLogPreconditionErrorOrFail getOnFail();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFail <em>On Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Fail</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @see #isSetOnFail()
	 * @see #unsetOnFail()
	 * @see #getOnFail()
	 * @generated
	 */
	void setOnFail(OnChangeLogPreconditionErrorOrFail value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFail <em>On Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnFail()
	 * @see #getOnFail()
	 * @see #setOnFail(OnChangeLogPreconditionErrorOrFail)
	 * @generated
	 */
	void unsetOnFail();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFail <em>On Fail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Fail</em>' attribute is set.
	 * @see #unsetOnFail()
	 * @see #getOnFail()
	 * @see #setOnFail(OnChangeLogPreconditionErrorOrFail)
	 * @generated
	 */
	boolean isSetOnFail();

	/**
	 * Returns the value of the '<em><b>On Fail Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Fail Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Fail Message</em>' attribute.
	 * @see #setOnFailMessage(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_OnFailMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onFailMessage'"
	 * @generated
	 */
	String getOnFailMessage();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFailMessage <em>On Fail Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Fail Message</em>' attribute.
	 * @see #getOnFailMessage()
	 * @generated
	 */
	void setOnFailMessage(String value);

	/**
	 * Returns the value of the '<em><b>On Sql Output</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Sql Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Sql Output</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput
	 * @see #isSetOnSqlOutput()
	 * @see #unsetOnSqlOutput()
	 * @see #setOnSqlOutput(OnChangeLogPreconditionOnSqlOutput)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getPreConditionsType1_OnSqlOutput()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onSqlOutput'"
	 * @generated
	 */
	OnChangeLogPreconditionOnSqlOutput getOnSqlOutput();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnSqlOutput <em>On Sql Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Sql Output</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput
	 * @see #isSetOnSqlOutput()
	 * @see #unsetOnSqlOutput()
	 * @see #getOnSqlOutput()
	 * @generated
	 */
	void setOnSqlOutput(OnChangeLogPreconditionOnSqlOutput value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnSqlOutput <em>On Sql Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnSqlOutput()
	 * @see #getOnSqlOutput()
	 * @see #setOnSqlOutput(OnChangeLogPreconditionOnSqlOutput)
	 * @generated
	 */
	void unsetOnSqlOutput();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnSqlOutput <em>On Sql Output</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Sql Output</em>' attribute is set.
	 * @see #unsetOnSqlOutput()
	 * @see #getOnSqlOutput()
	 * @see #setOnSqlOutput(OnChangeLogPreconditionOnSqlOutput)
	 * @generated
	 */
	boolean isSetOnSqlOutput();

} // PreConditionsType1
