/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getValidCheckSum <em>Valid Check Sum</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getTagDatabase <em>Tag Database</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getChangeSetChildren <em>Change Set Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateTable <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropTable <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateView <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameView <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropView <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddColumn <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSql <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateProcedure <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropProcedure <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameTable <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameColumn <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropColumn <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getMergeColumns <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifyDataType <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateSequence <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAlterSequence <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropSequence <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateIndex <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropIndex <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddNotNullConstraint <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddPrimaryKey <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropPrimaryKey <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddLookupTable <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddAutoIncrement <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddDefaultValue <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropDefaultValue <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddUniqueConstraint <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropUniqueConstraint <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCustomChange <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadUpdateData <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getExecuteCommand <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getStop <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifySql <em>Modify Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getContext <em>Context</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getFailOnError <em>Fail On Error</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getId <em>Id</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLogicalFilePath <em>Logical File Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getOnValidationFail <em>On Validation Fail</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunAlways <em>Run Always</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunInTransaction <em>Run In Transaction</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunOnChange <em>Run On Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType()
 * @model extendedMetaData="name='changeSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ChangeSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Valid Check Sum</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ValidCheckSumType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Check Sum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Check Sum</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_ValidCheckSum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validCheckSum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValidCheckSumType> getValidCheckSum();

	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #setPreConditions(PreConditionsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_PreConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	PreConditionsType getPreConditions();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getPreConditions <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #getPreConditions()
	 * @generated
	 */
	void setPreConditions(PreConditionsType value);

	/**
	 * Returns the value of the '<em><b>Tag Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Database</em>' containment reference.
	 * @see #setTagDatabase(TagDatabaseType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_TagDatabase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tagDatabase' namespace='##targetNamespace'"
	 * @generated
	 */
	TagDatabaseType getTagDatabase();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getTagDatabase <em>Tag Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Database</em>' containment reference.
	 * @see #getTagDatabase()
	 * @generated
	 */
	void setTagDatabase(TagDatabaseType value);

	/**
	 * Returns the value of the '<em><b>Change Set Children</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Children</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_ChangeSetChildren()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ChangeSetChildren:3'"
	 * @generated
	 */
	FeatureMap getChangeSetChildren();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<String> getComment();

	/**
	 * Returns the value of the '<em><b>Create Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CreateTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Table</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_CreateTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createTable' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<CreateTableType> getCreateTable();

	/**
	 * Returns the value of the '<em><b>Drop Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Table</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropTable' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropTableType> getDropTable();

	/**
	 * Returns the value of the '<em><b>Create View</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CreateViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create View</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_CreateView()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createView' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<CreateViewType> getCreateView();

	/**
	 * Returns the value of the '<em><b>Rename View</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RenameViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename View</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_RenameView()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameView' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<RenameViewType> getRenameView();

	/**
	 * Returns the value of the '<em><b>Drop View</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop View</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropView()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropView' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropViewType> getDropView();

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.InsertType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Insert()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insert' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<InsertType> getInsert();

	/**
	 * Returns the value of the '<em><b>Add Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Column</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addColumn' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddColumnType> getAddColumn();

	/**
	 * Returns the value of the '<em><b>Sql</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.SqlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Sql()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<SqlType> getSql();

	/**
	 * Returns the value of the '<em><b>Create Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Procedure</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_CreateProcedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createProcedure' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<CreateProcedureType> getCreateProcedure();

	/**
	 * Returns the value of the '<em><b>Drop Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropProcedureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Procedure</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropProcedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropProcedure' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropProcedureType> getDropProcedure();

	/**
	 * Returns the value of the '<em><b>Sql File</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.SqlFileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql File</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_SqlFile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlFile' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<SqlFileType> getSqlFile();

	/**
	 * Returns the value of the '<em><b>Rename Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RenameTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename Table</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_RenameTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameTable' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<RenameTableType> getRenameTable();

	/**
	 * Returns the value of the '<em><b>Rename Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RenameColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename Column</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_RenameColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameColumn' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<RenameColumnType> getRenameColumn();

	/**
	 * Returns the value of the '<em><b>Drop Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Column</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropColumn' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropColumnType> getDropColumn();

	/**
	 * Returns the value of the '<em><b>Merge Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Columns</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_MergeColumns()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mergeColumns' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<MergeColumnsType> getMergeColumns();

	/**
	 * Returns the value of the '<em><b>Modify Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Data Type</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_ModifyDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modifyDataType' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<ModifyDataTypeType> getModifyDataType();

	/**
	 * Returns the value of the '<em><b>Create Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Sequence</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_CreateSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createSequence' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<CreateSequenceType> getCreateSequence();

	/**
	 * Returns the value of the '<em><b>Alter Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alter Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter Sequence</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AlterSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alterSequence' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AlterSequenceType> getAlterSequence();

	/**
	 * Returns the value of the '<em><b>Drop Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropSequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Sequence</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropSequence' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropSequenceType> getDropSequence();

	/**
	 * Returns the value of the '<em><b>Create Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CreateIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Index</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_CreateIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createIndex' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<CreateIndexType> getCreateIndex();

	/**
	 * Returns the value of the '<em><b>Drop Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Index</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropIndex' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropIndexType> getDropIndex();

	/**
	 * Returns the value of the '<em><b>Add Not Null Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Not Null Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Not Null Constraint</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddNotNullConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addNotNullConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddNotNullConstraintType> getAddNotNullConstraint();

	/**
	 * Returns the value of the '<em><b>Drop Not Null Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Not Null Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Not Null Constraint</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropNotNullConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropNotNullConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropNotNullConstraintType> getDropNotNullConstraint();

	/**
	 * Returns the value of the '<em><b>Add Foreign Key Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Foreign Key Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Foreign Key Constraint</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddForeignKeyConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addForeignKeyConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddForeignKeyConstraintType> getAddForeignKeyConstraint();

	/**
	 * Returns the value of the '<em><b>Drop Foreign Key Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Foreign Key Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Foreign Key Constraint</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropForeignKeyConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropForeignKeyConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropForeignKeyConstraintType> getDropForeignKeyConstraint();

	/**
	 * Returns the value of the '<em><b>Drop All Foreign Key Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop All Foreign Key Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop All Foreign Key Constraints</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropAllForeignKeyConstraints()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropAllForeignKeyConstraints' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropAllForeignKeyConstraintsType> getDropAllForeignKeyConstraints();

	/**
	 * Returns the value of the '<em><b>Add Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Primary Key</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddPrimaryKey()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addPrimaryKey' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddPrimaryKeyType> getAddPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Drop Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Primary Key</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropPrimaryKey()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropPrimaryKey' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropPrimaryKeyType> getDropPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Add Lookup Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Lookup Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Lookup Table</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddLookupTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addLookupTable' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddLookupTableType> getAddLookupTable();

	/**
	 * Returns the value of the '<em><b>Add Auto Increment</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Auto Increment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Auto Increment</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddAutoIncrement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAutoIncrement' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddAutoIncrementType> getAddAutoIncrement();

	/**
	 * Returns the value of the '<em><b>Add Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Default Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Default Value</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddDefaultValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addDefaultValue' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddDefaultValueType> getAddDefaultValue();

	/**
	 * Returns the value of the '<em><b>Drop Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Default Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Default Value</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropDefaultValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropDefaultValue' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropDefaultValueType> getDropDefaultValue();

	/**
	 * Returns the value of the '<em><b>Add Unique Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Unique Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Unique Constraint</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AddUniqueConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addUniqueConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<AddUniqueConstraintType> getAddUniqueConstraint();

	/**
	 * Returns the value of the '<em><b>Drop Unique Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Unique Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Unique Constraint</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_DropUniqueConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropUniqueConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DropUniqueConstraintType> getDropUniqueConstraint();

	/**
	 * Returns the value of the '<em><b>Custom Change</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CustomChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Change</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Change</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_CustomChange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customChange' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<CustomChangeType> getCustomChange();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.UpdateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Update()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='update' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<UpdateType> getUpdate();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DeleteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Delete()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<DeleteType> getDelete();

	/**
	 * Returns the value of the '<em><b>Load Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.LoadDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Data</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_LoadData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadData' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<LoadDataType> getLoadData();

	/**
	 * Returns the value of the '<em><b>Load Update Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Update Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Update Data</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_LoadUpdateData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadUpdateData' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<LoadUpdateDataType> getLoadUpdateData();

	/**
	 * Returns the value of the '<em><b>Execute Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Command</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_ExecuteCommand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='executeCommand' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<ExecuteCommandType> getExecuteCommand();

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.StopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<StopType> getStop();

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RollbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	EList<RollbackType> getRollback();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':47' processing='lax' group='#ChangeSetChildren:3'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Modify Sql</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ModifySqlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Sql</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Sql</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_ModifySql()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifySql' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModifySqlType> getModifySql();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Context()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='context'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' attribute.
	 * @see #setDbms(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Dbms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dbms'"
	 * @generated
	 */
	String getDbms();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDbms <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbms</em>' attribute.
	 * @see #getDbms()
	 * @generated
	 */
	void setDbms(String value);

	/**
	 * Returns the value of the '<em><b>Fail On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail On Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail On Error</em>' attribute.
	 * @see #setFailOnError(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_FailOnError()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='failOnError'"
	 * @generated
	 */
	Object getFailOnError();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getFailOnError <em>Fail On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail On Error</em>' attribute.
	 * @see #getFailOnError()
	 * @generated
	 */
	void setFailOnError(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Logical File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical File Path</em>' attribute.
	 * @see #setLogicalFilePath(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_LogicalFilePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logicalFilePath'"
	 * @generated
	 */
	String getLogicalFilePath();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLogicalFilePath <em>Logical File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical File Path</em>' attribute.
	 * @see #getLogicalFilePath()
	 * @generated
	 */
	void setLogicalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Object Quoting Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Quoting Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Quoting Strategy</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @see #isSetObjectQuotingStrategy()
	 * @see #unsetObjectQuotingStrategy()
	 * @see #setObjectQuotingStrategy(ObjectQuotingStrategy)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_ObjectQuotingStrategy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='objectQuotingStrategy'"
	 * @generated
	 */
	ObjectQuotingStrategy getObjectQuotingStrategy();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Quoting Strategy</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @see #isSetObjectQuotingStrategy()
	 * @see #unsetObjectQuotingStrategy()
	 * @see #getObjectQuotingStrategy()
	 * @generated
	 */
	void setObjectQuotingStrategy(ObjectQuotingStrategy value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectQuotingStrategy()
	 * @see #getObjectQuotingStrategy()
	 * @see #setObjectQuotingStrategy(ObjectQuotingStrategy)
	 * @generated
	 */
	void unsetObjectQuotingStrategy();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Quoting Strategy</em>' attribute is set.
	 * @see #unsetObjectQuotingStrategy()
	 * @see #getObjectQuotingStrategy()
	 * @see #setObjectQuotingStrategy(ObjectQuotingStrategy)
	 * @generated
	 */
	boolean isSetObjectQuotingStrategy();

	/**
	 * Returns the value of the '<em><b>On Validation Fail</b></em>' attribute.
	 * The literals are from the enumeration {@link org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Validation Fail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Validation Fail</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail
	 * @see #isSetOnValidationFail()
	 * @see #unsetOnValidationFail()
	 * @see #setOnValidationFail(OnChangeSetValidationFail)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_OnValidationFail()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onValidationFail'"
	 * @generated
	 */
	OnChangeSetValidationFail getOnValidationFail();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getOnValidationFail <em>On Validation Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Validation Fail</em>' attribute.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail
	 * @see #isSetOnValidationFail()
	 * @see #unsetOnValidationFail()
	 * @see #getOnValidationFail()
	 * @generated
	 */
	void setOnValidationFail(OnChangeSetValidationFail value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getOnValidationFail <em>On Validation Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnValidationFail()
	 * @see #getOnValidationFail()
	 * @see #setOnValidationFail(OnChangeSetValidationFail)
	 * @generated
	 */
	void unsetOnValidationFail();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getOnValidationFail <em>On Validation Fail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Validation Fail</em>' attribute is set.
	 * @see #unsetOnValidationFail()
	 * @see #getOnValidationFail()
	 * @see #setOnValidationFail(OnChangeSetValidationFail)
	 * @generated
	 */
	boolean isSetOnValidationFail();

	/**
	 * Returns the value of the '<em><b>Run Always</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Always</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Always</em>' attribute.
	 * @see #setRunAlways(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_RunAlways()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='runAlways'"
	 * @generated
	 */
	Object getRunAlways();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunAlways <em>Run Always</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Always</em>' attribute.
	 * @see #getRunAlways()
	 * @generated
	 */
	void setRunAlways(Object value);

	/**
	 * Returns the value of the '<em><b>Run In Transaction</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run In Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run In Transaction</em>' attribute.
	 * @see #isSetRunInTransaction()
	 * @see #unsetRunInTransaction()
	 * @see #setRunInTransaction(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_RunInTransaction()
	 * @model default="true" unsettable="true" dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='runInTransaction'"
	 * @generated
	 */
	Object getRunInTransaction();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunInTransaction <em>Run In Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run In Transaction</em>' attribute.
	 * @see #isSetRunInTransaction()
	 * @see #unsetRunInTransaction()
	 * @see #getRunInTransaction()
	 * @generated
	 */
	void setRunInTransaction(Object value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunInTransaction <em>Run In Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRunInTransaction()
	 * @see #getRunInTransaction()
	 * @see #setRunInTransaction(Object)
	 * @generated
	 */
	void unsetRunInTransaction();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunInTransaction <em>Run In Transaction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Run In Transaction</em>' attribute is set.
	 * @see #unsetRunInTransaction()
	 * @see #getRunInTransaction()
	 * @see #setRunInTransaction(Object)
	 * @generated
	 */
	boolean isSetRunInTransaction();

	/**
	 * Returns the value of the '<em><b>Run On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run On Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run On Change</em>' attribute.
	 * @see #setRunOnChange(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_RunOnChange()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='runOnChange'"
	 * @generated
	 */
	Object getRunOnChange();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunOnChange <em>Run On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run On Change</em>' attribute.
	 * @see #getRunOnChange()
	 * @generated
	 */
	void setRunOnChange(Object value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getChangeSetType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':60' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ChangeSetType
