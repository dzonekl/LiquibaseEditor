/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rollback Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetChildren <em>Change Set Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateTable <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropTable <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateView <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameView <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropView <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddColumn <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSql <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateProcedure <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropProcedure <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameTable <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameColumn <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropColumn <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getMergeColumns <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getModifyDataType <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateSequence <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAlterSequence <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropSequence <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateIndex <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropIndex <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddNotNullConstraint <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddPrimaryKey <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropPrimaryKey <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddLookupTable <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddAutoIncrement <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddDefaultValue <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropDefaultValue <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddUniqueConstraint <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropUniqueConstraint <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCustomChange <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadUpdateData <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getExecuteCommand <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getStop <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetAuthor <em>Change Set Author</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetId <em>Change Set Id</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetPath <em>Change Set Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType()
 * @model extendedMetaData="name='rollback_._type' kind='mixed'"
 * @generated
 */
public interface RollbackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_ChangeSetChildren()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_CreateTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createTable' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropTable' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_CreateView()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createView' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_RenameView()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameView' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropView()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropView' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Insert()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insert' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addColumn' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Sql()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_CreateProcedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createProcedure' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropProcedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropProcedure' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_SqlFile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlFile' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_RenameTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameTable' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_RenameColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameColumn' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropColumn' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_MergeColumns()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mergeColumns' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_ModifyDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modifyDataType' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_CreateSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createSequence' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AlterSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alterSequence' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropSequence' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_CreateIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createIndex' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropIndex' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddNotNullConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addNotNullConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropNotNullConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropNotNullConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddForeignKeyConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addForeignKeyConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropForeignKeyConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropForeignKeyConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropAllForeignKeyConstraints()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropAllForeignKeyConstraints' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddPrimaryKey()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addPrimaryKey' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropPrimaryKey()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropPrimaryKey' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddLookupTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addLookupTable' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddAutoIncrement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAutoIncrement' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddDefaultValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addDefaultValue' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropDefaultValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropDefaultValue' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_AddUniqueConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addUniqueConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_DropUniqueConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropUniqueConstraint' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_CustomChange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customChange' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Update()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='update' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Delete()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_LoadData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadData' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_LoadUpdateData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadUpdateData' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_ExecuteCommand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='executeCommand' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#ChangeSetChildren:1'"
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':45' processing='lax' group='#ChangeSetChildren:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Change Set Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Author</em>' attribute.
	 * @see #setChangeSetAuthor(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_ChangeSetAuthor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='changeSetAuthor'"
	 * @generated
	 */
	String getChangeSetAuthor();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetAuthor <em>Change Set Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set Author</em>' attribute.
	 * @see #getChangeSetAuthor()
	 * @generated
	 */
	void setChangeSetAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Change Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Id</em>' attribute.
	 * @see #setChangeSetId(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_ChangeSetId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='changeSetId'"
	 * @generated
	 */
	String getChangeSetId();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetId <em>Change Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set Id</em>' attribute.
	 * @see #getChangeSetId()
	 * @generated
	 */
	void setChangeSetId(String value);

	/**
	 * Returns the value of the '<em><b>Change Set Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Path</em>' attribute.
	 * @see #setChangeSetPath(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRollbackType_ChangeSetPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='changeSetPath'"
	 * @generated
	 */
	String getChangeSetPath();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetPath <em>Change Set Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set Path</em>' attribute.
	 * @see #getChangeSetPath()
	 * @generated
	 */
	void setChangeSetPath(String value);

} // RollbackType
