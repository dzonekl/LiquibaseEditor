/**
 */
package org.liquibase.xml.ns.dbchangelog.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.liquibase.xml.ns.dbchangelog.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage
 * @generated
 */
public class DbchangelogSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DbchangelogPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogSwitch() {
		if (modelPackage == null) {
			modelPackage = DbchangelogPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE: {
				AddAutoIncrementType addAutoIncrementType = (AddAutoIncrementType)theEObject;
				T result = caseAddAutoIncrementType(addAutoIncrementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_COLUMN_TYPE: {
				AddColumnType addColumnType = (AddColumnType)theEObject;
				T result = caseAddColumnType(addColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE: {
				AddDefaultValueType addDefaultValueType = (AddDefaultValueType)theEObject;
				T result = caseAddDefaultValueType(addDefaultValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE: {
				AddForeignKeyConstraintType addForeignKeyConstraintType = (AddForeignKeyConstraintType)theEObject;
				T result = caseAddForeignKeyConstraintType(addForeignKeyConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE: {
				AddLookupTableType addLookupTableType = (AddLookupTableType)theEObject;
				T result = caseAddLookupTableType(addLookupTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_NOT_NULL_CONSTRAINT_TYPE: {
				AddNotNullConstraintType addNotNullConstraintType = (AddNotNullConstraintType)theEObject;
				T result = caseAddNotNullConstraintType(addNotNullConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE: {
				AddPrimaryKeyType addPrimaryKeyType = (AddPrimaryKeyType)theEObject;
				T result = caseAddPrimaryKeyType(addPrimaryKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE: {
				AddUniqueConstraintType addUniqueConstraintType = (AddUniqueConstraintType)theEObject;
				T result = caseAddUniqueConstraintType(addUniqueConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ALTER_SEQUENCE_TYPE: {
				AlterSequenceType alterSequenceType = (AlterSequenceType)theEObject;
				T result = caseAlterSequenceType(alterSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.AND_TYPE: {
				AndType andType = (AndType)theEObject;
				T result = caseAndType(andType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.APPEND_TYPE: {
				AppendType appendType = (AppendType)theEObject;
				T result = caseAppendType(appendType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ARG_TYPE: {
				ArgType argType = (ArgType)theEObject;
				T result = caseArgType(argType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CHANGE_LOG_PROPERTY_DEFINED_TYPE: {
				ChangeLogPropertyDefinedType changeLogPropertyDefinedType = (ChangeLogPropertyDefinedType)theEObject;
				T result = caseChangeLogPropertyDefinedType(changeLogPropertyDefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE: {
				ChangeSetExecutedType changeSetExecutedType = (ChangeSetExecutedType)theEObject;
				T result = caseChangeSetExecutedType(changeSetExecutedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CHANGE_SET_TYPE: {
				ChangeSetType changeSetType = (ChangeSetType)theEObject;
				T result = caseChangeSetType(changeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.COLUMN_EXISTS_TYPE: {
				ColumnExistsType columnExistsType = (ColumnExistsType)theEObject;
				T result = caseColumnExistsType(columnExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.COLUMN_TYPE: {
				ColumnType columnType = (ColumnType)theEObject;
				T result = caseColumnType(columnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.COLUMN_TYPE1: {
				ColumnType1 columnType1 = (ColumnType1)theEObject;
				T result = caseColumnType1(columnType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.COLUMN_TYPE2: {
				ColumnType2 columnType2 = (ColumnType2)theEObject;
				T result = caseColumnType2(columnType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.COLUMN_TYPE3: {
				ColumnType3 columnType3 = (ColumnType3)theEObject;
				T result = caseColumnType3(columnType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.COLUMN_TYPE4: {
				ColumnType4 columnType4 = (ColumnType4)theEObject;
				T result = caseColumnType4(columnType4);
				if (result == null) result = caseColumnType2(columnType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CONSTRAINTS_TYPE: {
				ConstraintsType constraintsType = (ConstraintsType)theEObject;
				T result = caseConstraintsType(constraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CREATE_INDEX_TYPE: {
				CreateIndexType createIndexType = (CreateIndexType)theEObject;
				T result = caseCreateIndexType(createIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE: {
				CreateProcedureType createProcedureType = (CreateProcedureType)theEObject;
				T result = caseCreateProcedureType(createProcedureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE: {
				CreateSequenceType createSequenceType = (CreateSequenceType)theEObject;
				T result = caseCreateSequenceType(createSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CREATE_TABLE_TYPE: {
				CreateTableType createTableType = (CreateTableType)theEObject;
				T result = caseCreateTableType(createTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CREATE_VIEW_TYPE: {
				CreateViewType createViewType = (CreateViewType)theEObject;
				T result = caseCreateViewType(createViewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CUSTOM_CHANGE_TYPE: {
				CustomChangeType customChangeType = (CustomChangeType)theEObject;
				T result = caseCustomChangeType(customChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.CUSTOM_PRECONDITION_TYPE: {
				CustomPreconditionType customPreconditionType = (CustomPreconditionType)theEObject;
				T result = caseCustomPreconditionType(customPreconditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE: {
				DatabaseChangeLogType databaseChangeLogType = (DatabaseChangeLogType)theEObject;
				T result = caseDatabaseChangeLogType(databaseChangeLogType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DBMS_TYPE: {
				DbmsType dbmsType = (DbmsType)theEObject;
				T result = caseDbmsType(dbmsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DELETE_TYPE: {
				DeleteType deleteType = (DeleteType)theEObject;
				T result = caseDeleteType(deleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE: {
				DropAllForeignKeyConstraintsType dropAllForeignKeyConstraintsType = (DropAllForeignKeyConstraintsType)theEObject;
				T result = caseDropAllForeignKeyConstraintsType(dropAllForeignKeyConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_COLUMN_TYPE: {
				DropColumnType dropColumnType = (DropColumnType)theEObject;
				T result = caseDropColumnType(dropColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_DEFAULT_VALUE_TYPE: {
				DropDefaultValueType dropDefaultValueType = (DropDefaultValueType)theEObject;
				T result = caseDropDefaultValueType(dropDefaultValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE: {
				DropForeignKeyConstraintType dropForeignKeyConstraintType = (DropForeignKeyConstraintType)theEObject;
				T result = caseDropForeignKeyConstraintType(dropForeignKeyConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_INDEX_TYPE: {
				DropIndexType dropIndexType = (DropIndexType)theEObject;
				T result = caseDropIndexType(dropIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_NOT_NULL_CONSTRAINT_TYPE: {
				DropNotNullConstraintType dropNotNullConstraintType = (DropNotNullConstraintType)theEObject;
				T result = caseDropNotNullConstraintType(dropNotNullConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_PRIMARY_KEY_TYPE: {
				DropPrimaryKeyType dropPrimaryKeyType = (DropPrimaryKeyType)theEObject;
				T result = caseDropPrimaryKeyType(dropPrimaryKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_PROCEDURE_TYPE: {
				DropProcedureType dropProcedureType = (DropProcedureType)theEObject;
				T result = caseDropProcedureType(dropProcedureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_SEQUENCE_TYPE: {
				DropSequenceType dropSequenceType = (DropSequenceType)theEObject;
				T result = caseDropSequenceType(dropSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_TABLE_TYPE: {
				DropTableType dropTableType = (DropTableType)theEObject;
				T result = caseDropTableType(dropTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE: {
				DropUniqueConstraintType dropUniqueConstraintType = (DropUniqueConstraintType)theEObject;
				T result = caseDropUniqueConstraintType(dropUniqueConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.DROP_VIEW_TYPE: {
				DropViewType dropViewType = (DropViewType)theEObject;
				T result = caseDropViewType(dropViewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.EXECUTE_COMMAND_TYPE: {
				ExecuteCommandType executeCommandType = (ExecuteCommandType)theEObject;
				T result = caseExecuteCommandType(executeCommandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.EXPECTED_QUOTING_STRATEGY_TYPE: {
				ExpectedQuotingStrategyType expectedQuotingStrategyType = (ExpectedQuotingStrategyType)theEObject;
				T result = caseExpectedQuotingStrategyType(expectedQuotingStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE: {
				ForeignKeyConstraintExistsType foreignKeyConstraintExistsType = (ForeignKeyConstraintExistsType)theEObject;
				T result = caseForeignKeyConstraintExistsType(foreignKeyConstraintExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.INCLUDE_ALL_TYPE: {
				IncludeAllType includeAllType = (IncludeAllType)theEObject;
				T result = caseIncludeAllType(includeAllType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.INCLUDE_TYPE: {
				IncludeType includeType = (IncludeType)theEObject;
				T result = caseIncludeType(includeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.INDEX_EXISTS_TYPE: {
				IndexExistsType indexExistsType = (IndexExistsType)theEObject;
				T result = caseIndexExistsType(indexExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.INSERT_TYPE: {
				InsertType insertType = (InsertType)theEObject;
				T result = caseInsertType(insertType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.LOAD_DATA_TYPE: {
				LoadDataType loadDataType = (LoadDataType)theEObject;
				T result = caseLoadDataType(loadDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.LOAD_UPDATE_DATA_TYPE: {
				LoadUpdateDataType loadUpdateDataType = (LoadUpdateDataType)theEObject;
				T result = caseLoadUpdateDataType(loadUpdateDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.MERGE_COLUMNS_TYPE: {
				MergeColumnsType mergeColumnsType = (MergeColumnsType)theEObject;
				T result = caseMergeColumnsType(mergeColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.MODIFY_DATA_TYPE_TYPE: {
				ModifyDataTypeType modifyDataTypeType = (ModifyDataTypeType)theEObject;
				T result = caseModifyDataTypeType(modifyDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.MODIFY_SQL_TYPE: {
				ModifySqlType modifySqlType = (ModifySqlType)theEObject;
				T result = caseModifySqlType(modifySqlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.NOT_TYPE: {
				NotType notType = (NotType)theEObject;
				T result = caseNotType(notType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.OR_TYPE: {
				OrType orType = (OrType)theEObject;
				T result = caseOrType(orType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PARAM_TYPE1: {
				ParamType1 paramType1 = (ParamType1)theEObject;
				T result = caseParamType1(paramType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PARAM_TYPE2: {
				ParamType2 paramType2 = (ParamType2)theEObject;
				T result = caseParamType2(paramType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PRE_CONDITIONS_TYPE: {
				PreConditionsType preConditionsType = (PreConditionsType)theEObject;
				T result = casePreConditionsType(preConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1: {
				PreConditionsType1 preConditionsType1 = (PreConditionsType1)theEObject;
				T result = casePreConditionsType1(preConditionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PREPEND_TYPE: {
				PrependType prependType = (PrependType)theEObject;
				T result = casePrependType(prependType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PRIMARY_KEY_EXISTS_TYPE: {
				PrimaryKeyExistsType primaryKeyExistsType = (PrimaryKeyExistsType)theEObject;
				T result = casePrimaryKeyExistsType(primaryKeyExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.REG_EXP_REPLACE_TYPE: {
				RegExpReplaceType regExpReplaceType = (RegExpReplaceType)theEObject;
				T result = caseRegExpReplaceType(regExpReplaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.RENAME_COLUMN_TYPE: {
				RenameColumnType renameColumnType = (RenameColumnType)theEObject;
				T result = caseRenameColumnType(renameColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.RENAME_TABLE_TYPE: {
				RenameTableType renameTableType = (RenameTableType)theEObject;
				T result = caseRenameTableType(renameTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.RENAME_VIEW_TYPE: {
				RenameViewType renameViewType = (RenameViewType)theEObject;
				T result = caseRenameViewType(renameViewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.REPLACE_TYPE: {
				ReplaceType replaceType = (ReplaceType)theEObject;
				T result = caseReplaceType(replaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ROLLBACK_TYPE: {
				RollbackType rollbackType = (RollbackType)theEObject;
				T result = caseRollbackType(rollbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.ROW_COUNT_TYPE: {
				RowCountType rowCountType = (RowCountType)theEObject;
				T result = caseRowCountType(rowCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.RUNNING_AS_TYPE: {
				RunningAsType runningAsType = (RunningAsType)theEObject;
				T result = caseRunningAsType(runningAsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.SEQUENCE_EXISTS_TYPE: {
				SequenceExistsType sequenceExistsType = (SequenceExistsType)theEObject;
				T result = caseSequenceExistsType(sequenceExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.SQL_CHECK_TYPE: {
				SqlCheckType sqlCheckType = (SqlCheckType)theEObject;
				T result = caseSqlCheckType(sqlCheckType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.SQL_FILE_TYPE: {
				SqlFileType sqlFileType = (SqlFileType)theEObject;
				T result = caseSqlFileType(sqlFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.SQL_TYPE: {
				SqlType sqlType = (SqlType)theEObject;
				T result = caseSqlType(sqlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.STOP_TYPE: {
				StopType stopType = (StopType)theEObject;
				T result = caseStopType(stopType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.TABLE_EXISTS_TYPE: {
				TableExistsType tableExistsType = (TableExistsType)theEObject;
				T result = caseTableExistsType(tableExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.TABLE_IS_EMPTY_TYPE: {
				TableIsEmptyType tableIsEmptyType = (TableIsEmptyType)theEObject;
				T result = caseTableIsEmptyType(tableIsEmptyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.TAG_DATABASE_TYPE: {
				TagDatabaseType tagDatabaseType = (TagDatabaseType)theEObject;
				T result = caseTagDatabaseType(tagDatabaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.VALID_CHECK_SUM_TYPE: {
				ValidCheckSumType validCheckSumType = (ValidCheckSumType)theEObject;
				T result = caseValidCheckSumType(validCheckSumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.VIEW_EXISTS_TYPE: {
				ViewExistsType viewExistsType = (ViewExistsType)theEObject;
				T result = caseViewExistsType(viewExistsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbchangelogPackage.WHERE_PARAMS_TYPE: {
				WhereParamsType whereParamsType = (WhereParamsType)theEObject;
				T result = caseWhereParamsType(whereParamsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Auto Increment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Auto Increment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAutoIncrementType(AddAutoIncrementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddColumnType(AddColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Default Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Default Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddDefaultValueType(AddDefaultValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Foreign Key Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Foreign Key Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddForeignKeyConstraintType(AddForeignKeyConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Lookup Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Lookup Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddLookupTableType(AddLookupTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Not Null Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Not Null Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNotNullConstraintType(AddNotNullConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Primary Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Primary Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddPrimaryKeyType(AddPrimaryKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Unique Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Unique Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddUniqueConstraintType(AddUniqueConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlterSequenceType(AlterSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndType(AndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Append Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Append Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendType(AppendType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgType(ArgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Log Property Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Log Property Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeLogPropertyDefinedType(ChangeLogPropertyDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Set Executed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Set Executed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeSetExecutedType(ChangeSetExecutedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeSetType(ChangeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnExistsType(ColumnExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType(ColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType1(ColumnType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType2(ColumnType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType3(ColumnType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType4(ColumnType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType(ConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateIndexType(CreateIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Procedure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Procedure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateProcedureType(CreateProcedureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSequenceType(CreateSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTableType(CreateTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateViewType(CreateViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomChangeType(CustomChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Precondition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Precondition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomPreconditionType(CustomPreconditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Change Log Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Change Log Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseChangeLogType(DatabaseChangeLogType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dbms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dbms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbmsType(DbmsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteType(DeleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop All Foreign Key Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop All Foreign Key Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropAllForeignKeyConstraintsType(DropAllForeignKeyConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropColumnType(DropColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Default Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Default Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropDefaultValueType(DropDefaultValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Foreign Key Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Foreign Key Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropForeignKeyConstraintType(DropForeignKeyConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropIndexType(DropIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Not Null Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Not Null Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropNotNullConstraintType(DropNotNullConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Primary Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Primary Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropPrimaryKeyType(DropPrimaryKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Procedure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Procedure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropProcedureType(DropProcedureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropSequenceType(DropSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropTableType(DropTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Unique Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Unique Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropUniqueConstraintType(DropUniqueConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropViewType(DropViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteCommandType(ExecuteCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Quoting Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Quoting Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedQuotingStrategyType(ExpectedQuotingStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Constraint Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Constraint Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKeyConstraintExistsType(ForeignKeyConstraintExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include All Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include All Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeAllType(IncludeAllType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeType(IncludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexExistsType(IndexExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertType(InsertType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadDataType(LoadDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Update Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Update Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadUpdateDataType(LoadUpdateDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeColumnsType(MergeColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyDataTypeType(ModifyDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Sql Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Sql Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifySqlType(ModifySqlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotType(NotType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrType(OrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType1(ParamType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType2(ParamType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreConditionsType(PreConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Conditions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Conditions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreConditionsType1(PreConditionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prepend Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prepend Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrependType(PrependType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKeyExistsType(PrimaryKeyExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reg Exp Replace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reg Exp Replace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegExpReplaceType(RegExpReplaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameColumnType(RenameColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameTableType(RenameTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameViewType(RenameViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceType(ReplaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rollback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rollback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollbackType(RollbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowCountType(RowCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Running As Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Running As Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunningAsType(RunningAsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceExistsType(SequenceExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Check Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Check Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlCheckType(SqlCheckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlFileType(SqlFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlType(SqlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopType(StopType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableExistsType(TableExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Is Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Is Empty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableIsEmptyType(TableIsEmptyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Database Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Database Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagDatabaseType(TagDatabaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Check Sum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Check Sum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidCheckSumType(ValidCheckSumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Exists Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Exists Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewExistsType(ViewExistsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where Params Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where Params Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhereParamsType(WhereParamsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DbchangelogSwitch
