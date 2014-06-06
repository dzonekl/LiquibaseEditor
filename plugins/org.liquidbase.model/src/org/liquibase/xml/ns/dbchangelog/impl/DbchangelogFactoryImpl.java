/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.liquibase.xml.ns.dbchangelog.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbchangelogFactoryImpl extends EFactoryImpl implements DbchangelogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbchangelogFactory init() {
		try {
			DbchangelogFactory theDbchangelogFactory = (DbchangelogFactory)EPackage.Registry.INSTANCE.getEFactory(DbchangelogPackage.eNS_URI);
			if (theDbchangelogFactory != null) {
				return theDbchangelogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DbchangelogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE: return createAddAutoIncrementType();
			case DbchangelogPackage.ADD_COLUMN_TYPE: return createAddColumnType();
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE: return createAddDefaultValueType();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE: return createAddForeignKeyConstraintType();
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE: return createAddLookupTableType();
			case DbchangelogPackage.ADD_NOT_NULL_CONSTRAINT_TYPE: return createAddNotNullConstraintType();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE: return createAddPrimaryKeyType();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE: return createAddUniqueConstraintType();
			case DbchangelogPackage.ALTER_SEQUENCE_TYPE: return createAlterSequenceType();
			case DbchangelogPackage.AND_TYPE: return createAndType();
			case DbchangelogPackage.APPEND_TYPE: return createAppendType();
			case DbchangelogPackage.ARG_TYPE: return createArgType();
			case DbchangelogPackage.CHANGE_LOG_PROPERTY_DEFINED_TYPE: return createChangeLogPropertyDefinedType();
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE: return createChangeSetExecutedType();
			case DbchangelogPackage.CHANGE_SET_TYPE: return createChangeSetType();
			case DbchangelogPackage.COLUMN_EXISTS_TYPE: return createColumnExistsType();
			case DbchangelogPackage.COLUMN_TYPE: return createColumnType();
			case DbchangelogPackage.COLUMN_TYPE1: return createColumnType1();
			case DbchangelogPackage.COLUMN_TYPE2: return createColumnType2();
			case DbchangelogPackage.COLUMN_TYPE3: return createColumnType3();
			case DbchangelogPackage.COLUMN_TYPE4: return createColumnType4();
			case DbchangelogPackage.CONSTRAINTS_TYPE: return createConstraintsType();
			case DbchangelogPackage.CREATE_INDEX_TYPE: return createCreateIndexType();
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE: return createCreateProcedureType();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE: return createCreateSequenceType();
			case DbchangelogPackage.CREATE_TABLE_TYPE: return createCreateTableType();
			case DbchangelogPackage.CREATE_VIEW_TYPE: return createCreateViewType();
			case DbchangelogPackage.CUSTOM_CHANGE_TYPE: return createCustomChangeType();
			case DbchangelogPackage.CUSTOM_PRECONDITION_TYPE: return createCustomPreconditionType();
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE: return createDatabaseChangeLogType();
			case DbchangelogPackage.DBMS_TYPE: return createDbmsType();
			case DbchangelogPackage.DELETE_TYPE: return createDeleteType();
			case DbchangelogPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE: return createDropAllForeignKeyConstraintsType();
			case DbchangelogPackage.DROP_COLUMN_TYPE: return createDropColumnType();
			case DbchangelogPackage.DROP_DEFAULT_VALUE_TYPE: return createDropDefaultValueType();
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE: return createDropForeignKeyConstraintType();
			case DbchangelogPackage.DROP_INDEX_TYPE: return createDropIndexType();
			case DbchangelogPackage.DROP_NOT_NULL_CONSTRAINT_TYPE: return createDropNotNullConstraintType();
			case DbchangelogPackage.DROP_PRIMARY_KEY_TYPE: return createDropPrimaryKeyType();
			case DbchangelogPackage.DROP_PROCEDURE_TYPE: return createDropProcedureType();
			case DbchangelogPackage.DROP_SEQUENCE_TYPE: return createDropSequenceType();
			case DbchangelogPackage.DROP_TABLE_TYPE: return createDropTableType();
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE: return createDropUniqueConstraintType();
			case DbchangelogPackage.DROP_VIEW_TYPE: return createDropViewType();
			case DbchangelogPackage.EXECUTE_COMMAND_TYPE: return createExecuteCommandType();
			case DbchangelogPackage.EXPECTED_QUOTING_STRATEGY_TYPE: return createExpectedQuotingStrategyType();
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE: return createForeignKeyConstraintExistsType();
			case DbchangelogPackage.INCLUDE_ALL_TYPE: return createIncludeAllType();
			case DbchangelogPackage.INCLUDE_TYPE: return createIncludeType();
			case DbchangelogPackage.INDEX_EXISTS_TYPE: return createIndexExistsType();
			case DbchangelogPackage.INSERT_TYPE: return createInsertType();
			case DbchangelogPackage.LOAD_DATA_TYPE: return createLoadDataType();
			case DbchangelogPackage.LOAD_UPDATE_DATA_TYPE: return createLoadUpdateDataType();
			case DbchangelogPackage.MERGE_COLUMNS_TYPE: return createMergeColumnsType();
			case DbchangelogPackage.MODIFY_DATA_TYPE_TYPE: return createModifyDataTypeType();
			case DbchangelogPackage.MODIFY_SQL_TYPE: return createModifySqlType();
			case DbchangelogPackage.NOT_TYPE: return createNotType();
			case DbchangelogPackage.OR_TYPE: return createOrType();
			case DbchangelogPackage.PARAM_TYPE: return createParamType();
			case DbchangelogPackage.PARAM_TYPE1: return createParamType1();
			case DbchangelogPackage.PARAM_TYPE2: return createParamType2();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE: return createPreConditionsType();
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1: return createPreConditionsType1();
			case DbchangelogPackage.PREPEND_TYPE: return createPrependType();
			case DbchangelogPackage.PRIMARY_KEY_EXISTS_TYPE: return createPrimaryKeyExistsType();
			case DbchangelogPackage.PROPERTY_TYPE: return createPropertyType();
			case DbchangelogPackage.REG_EXP_REPLACE_TYPE: return createRegExpReplaceType();
			case DbchangelogPackage.RENAME_COLUMN_TYPE: return createRenameColumnType();
			case DbchangelogPackage.RENAME_TABLE_TYPE: return createRenameTableType();
			case DbchangelogPackage.RENAME_VIEW_TYPE: return createRenameViewType();
			case DbchangelogPackage.REPLACE_TYPE: return createReplaceType();
			case DbchangelogPackage.ROLLBACK_TYPE: return createRollbackType();
			case DbchangelogPackage.ROW_COUNT_TYPE: return createRowCountType();
			case DbchangelogPackage.RUNNING_AS_TYPE: return createRunningAsType();
			case DbchangelogPackage.SEQUENCE_EXISTS_TYPE: return createSequenceExistsType();
			case DbchangelogPackage.SQL_CHECK_TYPE: return createSqlCheckType();
			case DbchangelogPackage.SQL_FILE_TYPE: return createSqlFileType();
			case DbchangelogPackage.SQL_TYPE: return createSqlType();
			case DbchangelogPackage.STOP_TYPE: return createStopType();
			case DbchangelogPackage.TABLE_EXISTS_TYPE: return createTableExistsType();
			case DbchangelogPackage.TABLE_IS_EMPTY_TYPE: return createTableIsEmptyType();
			case DbchangelogPackage.TAG_DATABASE_TYPE: return createTagDatabaseType();
			case DbchangelogPackage.UPDATE_TYPE: return createUpdateType();
			case DbchangelogPackage.VALID_CHECK_SUM_TYPE: return createValidCheckSumType();
			case DbchangelogPackage.VIEW_EXISTS_TYPE: return createViewExistsType();
			case DbchangelogPackage.WHERE_PARAMS_TYPE: return createWhereParamsType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DbchangelogPackage.FK_CASCADE_ACTION_OPTIONS:
				return createFkCascadeActionOptionsFromString(eDataType, initialValue);
			case DbchangelogPackage.OBJECT_QUOTING_STRATEGY:
				return createObjectQuotingStrategyFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL:
				return createOnChangeLogPreconditionErrorOrFailFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT:
				return createOnChangeLogPreconditionOnSqlOutputFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL:
				return createOnChangeSetPreconditionErrorOrFailFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_SET_VALIDATION_FAIL:
				return createOnChangeSetValidationFailFromString(eDataType, initialValue);
			case DbchangelogPackage.BOOLEAN_EXP:
				return createBooleanExpFromString(eDataType, initialValue);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER0:
				return createBooleanExpMember0FromString(eDataType, initialValue);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER0_OBJECT:
				return createBooleanExpMember0ObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER1:
				return createBooleanExpMember1FromString(eDataType, initialValue);
			case DbchangelogPackage.FK_CASCADE_ACTION_OPTIONS_OBJECT:
				return createFkCascadeActionOptionsObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.INTEGER_EXP:
				return createIntegerExpFromString(eDataType, initialValue);
			case DbchangelogPackage.INTEGER_EXP_MEMBER0:
				return createIntegerExpMember0FromString(eDataType, initialValue);
			case DbchangelogPackage.INTEGER_EXP_MEMBER1:
				return createIntegerExpMember1FromString(eDataType, initialValue);
			case DbchangelogPackage.OBJECT_QUOTING_STRATEGY_OBJECT:
				return createObjectQuotingStrategyObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL_OBJECT:
				return createOnChangeLogPreconditionErrorOrFailObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT_OBJECT:
				return createOnChangeLogPreconditionOnSqlOutputObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL_OBJECT:
				return createOnChangeSetPreconditionErrorOrFailObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.ON_CHANGE_SET_VALIDATION_FAIL_OBJECT:
				return createOnChangeSetValidationFailObjectFromString(eDataType, initialValue);
			case DbchangelogPackage.PROPERTY_EXPRESSION:
				return createPropertyExpressionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DbchangelogPackage.FK_CASCADE_ACTION_OPTIONS:
				return convertFkCascadeActionOptionsToString(eDataType, instanceValue);
			case DbchangelogPackage.OBJECT_QUOTING_STRATEGY:
				return convertObjectQuotingStrategyToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL:
				return convertOnChangeLogPreconditionErrorOrFailToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT:
				return convertOnChangeLogPreconditionOnSqlOutputToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL:
				return convertOnChangeSetPreconditionErrorOrFailToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_SET_VALIDATION_FAIL:
				return convertOnChangeSetValidationFailToString(eDataType, instanceValue);
			case DbchangelogPackage.BOOLEAN_EXP:
				return convertBooleanExpToString(eDataType, instanceValue);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER0:
				return convertBooleanExpMember0ToString(eDataType, instanceValue);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER0_OBJECT:
				return convertBooleanExpMember0ObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER1:
				return convertBooleanExpMember1ToString(eDataType, instanceValue);
			case DbchangelogPackage.FK_CASCADE_ACTION_OPTIONS_OBJECT:
				return convertFkCascadeActionOptionsObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.INTEGER_EXP:
				return convertIntegerExpToString(eDataType, instanceValue);
			case DbchangelogPackage.INTEGER_EXP_MEMBER0:
				return convertIntegerExpMember0ToString(eDataType, instanceValue);
			case DbchangelogPackage.INTEGER_EXP_MEMBER1:
				return convertIntegerExpMember1ToString(eDataType, instanceValue);
			case DbchangelogPackage.OBJECT_QUOTING_STRATEGY_OBJECT:
				return convertObjectQuotingStrategyObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL_OBJECT:
				return convertOnChangeLogPreconditionErrorOrFailObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT_OBJECT:
				return convertOnChangeLogPreconditionOnSqlOutputObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL_OBJECT:
				return convertOnChangeSetPreconditionErrorOrFailObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.ON_CHANGE_SET_VALIDATION_FAIL_OBJECT:
				return convertOnChangeSetValidationFailObjectToString(eDataType, instanceValue);
			case DbchangelogPackage.PROPERTY_EXPRESSION:
				return convertPropertyExpressionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAutoIncrementType createAddAutoIncrementType() {
		AddAutoIncrementTypeImpl addAutoIncrementType = new AddAutoIncrementTypeImpl();
		return addAutoIncrementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddColumnType createAddColumnType() {
		AddColumnTypeImpl addColumnType = new AddColumnTypeImpl();
		return addColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddDefaultValueType createAddDefaultValueType() {
		AddDefaultValueTypeImpl addDefaultValueType = new AddDefaultValueTypeImpl();
		return addDefaultValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddForeignKeyConstraintType createAddForeignKeyConstraintType() {
		AddForeignKeyConstraintTypeImpl addForeignKeyConstraintType = new AddForeignKeyConstraintTypeImpl();
		return addForeignKeyConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddLookupTableType createAddLookupTableType() {
		AddLookupTableTypeImpl addLookupTableType = new AddLookupTableTypeImpl();
		return addLookupTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNotNullConstraintType createAddNotNullConstraintType() {
		AddNotNullConstraintTypeImpl addNotNullConstraintType = new AddNotNullConstraintTypeImpl();
		return addNotNullConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimaryKeyType createAddPrimaryKeyType() {
		AddPrimaryKeyTypeImpl addPrimaryKeyType = new AddPrimaryKeyTypeImpl();
		return addPrimaryKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddUniqueConstraintType createAddUniqueConstraintType() {
		AddUniqueConstraintTypeImpl addUniqueConstraintType = new AddUniqueConstraintTypeImpl();
		return addUniqueConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlterSequenceType createAlterSequenceType() {
		AlterSequenceTypeImpl alterSequenceType = new AlterSequenceTypeImpl();
		return alterSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndType createAndType() {
		AndTypeImpl andType = new AndTypeImpl();
		return andType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppendType createAppendType() {
		AppendTypeImpl appendType = new AppendTypeImpl();
		return appendType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgType createArgType() {
		ArgTypeImpl argType = new ArgTypeImpl();
		return argType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLogPropertyDefinedType createChangeLogPropertyDefinedType() {
		ChangeLogPropertyDefinedTypeImpl changeLogPropertyDefinedType = new ChangeLogPropertyDefinedTypeImpl();
		return changeLogPropertyDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSetExecutedType createChangeSetExecutedType() {
		ChangeSetExecutedTypeImpl changeSetExecutedType = new ChangeSetExecutedTypeImpl();
		return changeSetExecutedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSetType createChangeSetType() {
		ChangeSetTypeImpl changeSetType = new ChangeSetTypeImpl();
		return changeSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnExistsType createColumnExistsType() {
		ColumnExistsTypeImpl columnExistsType = new ColumnExistsTypeImpl();
		return columnExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType createColumnType() {
		ColumnTypeImpl columnType = new ColumnTypeImpl();
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType1 createColumnType1() {
		ColumnType1Impl columnType1 = new ColumnType1Impl();
		return columnType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType2 createColumnType2() {
		ColumnType2Impl columnType2 = new ColumnType2Impl();
		return columnType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType3 createColumnType3() {
		ColumnType3Impl columnType3 = new ColumnType3Impl();
		return columnType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType4 createColumnType4() {
		ColumnType4Impl columnType4 = new ColumnType4Impl();
		return columnType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateIndexType createCreateIndexType() {
		CreateIndexTypeImpl createIndexType = new CreateIndexTypeImpl();
		return createIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateProcedureType createCreateProcedureType() {
		CreateProcedureTypeImpl createProcedureType = new CreateProcedureTypeImpl();
		return createProcedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSequenceType createCreateSequenceType() {
		CreateSequenceTypeImpl createSequenceType = new CreateSequenceTypeImpl();
		return createSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTableType createCreateTableType() {
		CreateTableTypeImpl createTableType = new CreateTableTypeImpl();
		return createTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateViewType createCreateViewType() {
		CreateViewTypeImpl createViewType = new CreateViewTypeImpl();
		return createViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomChangeType createCustomChangeType() {
		CustomChangeTypeImpl customChangeType = new CustomChangeTypeImpl();
		return customChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPreconditionType createCustomPreconditionType() {
		CustomPreconditionTypeImpl customPreconditionType = new CustomPreconditionTypeImpl();
		return customPreconditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseChangeLogType createDatabaseChangeLogType() {
		DatabaseChangeLogTypeImpl databaseChangeLogType = new DatabaseChangeLogTypeImpl();
		return databaseChangeLogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbmsType createDbmsType() {
		DbmsTypeImpl dbmsType = new DbmsTypeImpl();
		return dbmsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteType createDeleteType() {
		DeleteTypeImpl deleteType = new DeleteTypeImpl();
		return deleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropAllForeignKeyConstraintsType createDropAllForeignKeyConstraintsType() {
		DropAllForeignKeyConstraintsTypeImpl dropAllForeignKeyConstraintsType = new DropAllForeignKeyConstraintsTypeImpl();
		return dropAllForeignKeyConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropColumnType createDropColumnType() {
		DropColumnTypeImpl dropColumnType = new DropColumnTypeImpl();
		return dropColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDefaultValueType createDropDefaultValueType() {
		DropDefaultValueTypeImpl dropDefaultValueType = new DropDefaultValueTypeImpl();
		return dropDefaultValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropForeignKeyConstraintType createDropForeignKeyConstraintType() {
		DropForeignKeyConstraintTypeImpl dropForeignKeyConstraintType = new DropForeignKeyConstraintTypeImpl();
		return dropForeignKeyConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropIndexType createDropIndexType() {
		DropIndexTypeImpl dropIndexType = new DropIndexTypeImpl();
		return dropIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropNotNullConstraintType createDropNotNullConstraintType() {
		DropNotNullConstraintTypeImpl dropNotNullConstraintType = new DropNotNullConstraintTypeImpl();
		return dropNotNullConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropPrimaryKeyType createDropPrimaryKeyType() {
		DropPrimaryKeyTypeImpl dropPrimaryKeyType = new DropPrimaryKeyTypeImpl();
		return dropPrimaryKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropProcedureType createDropProcedureType() {
		DropProcedureTypeImpl dropProcedureType = new DropProcedureTypeImpl();
		return dropProcedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropSequenceType createDropSequenceType() {
		DropSequenceTypeImpl dropSequenceType = new DropSequenceTypeImpl();
		return dropSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropTableType createDropTableType() {
		DropTableTypeImpl dropTableType = new DropTableTypeImpl();
		return dropTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropUniqueConstraintType createDropUniqueConstraintType() {
		DropUniqueConstraintTypeImpl dropUniqueConstraintType = new DropUniqueConstraintTypeImpl();
		return dropUniqueConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropViewType createDropViewType() {
		DropViewTypeImpl dropViewType = new DropViewTypeImpl();
		return dropViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteCommandType createExecuteCommandType() {
		ExecuteCommandTypeImpl executeCommandType = new ExecuteCommandTypeImpl();
		return executeCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedQuotingStrategyType createExpectedQuotingStrategyType() {
		ExpectedQuotingStrategyTypeImpl expectedQuotingStrategyType = new ExpectedQuotingStrategyTypeImpl();
		return expectedQuotingStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyConstraintExistsType createForeignKeyConstraintExistsType() {
		ForeignKeyConstraintExistsTypeImpl foreignKeyConstraintExistsType = new ForeignKeyConstraintExistsTypeImpl();
		return foreignKeyConstraintExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeAllType createIncludeAllType() {
		IncludeAllTypeImpl includeAllType = new IncludeAllTypeImpl();
		return includeAllType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexExistsType createIndexExistsType() {
		IndexExistsTypeImpl indexExistsType = new IndexExistsTypeImpl();
		return indexExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertType createInsertType() {
		InsertTypeImpl insertType = new InsertTypeImpl();
		return insertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadDataType createLoadDataType() {
		LoadDataTypeImpl loadDataType = new LoadDataTypeImpl();
		return loadDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadUpdateDataType createLoadUpdateDataType() {
		LoadUpdateDataTypeImpl loadUpdateDataType = new LoadUpdateDataTypeImpl();
		return loadUpdateDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeColumnsType createMergeColumnsType() {
		MergeColumnsTypeImpl mergeColumnsType = new MergeColumnsTypeImpl();
		return mergeColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyDataTypeType createModifyDataTypeType() {
		ModifyDataTypeTypeImpl modifyDataTypeType = new ModifyDataTypeTypeImpl();
		return modifyDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySqlType createModifySqlType() {
		ModifySqlTypeImpl modifySqlType = new ModifySqlTypeImpl();
		return modifySqlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotType createNotType() {
		NotTypeImpl notType = new NotTypeImpl();
		return notType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrType createOrType() {
		OrTypeImpl orType = new OrTypeImpl();
		return orType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType1 createParamType1() {
		ParamType1Impl paramType1 = new ParamType1Impl();
		return paramType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType2 createParamType2() {
		ParamType2Impl paramType2 = new ParamType2Impl();
		return paramType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionsType createPreConditionsType() {
		PreConditionsTypeImpl preConditionsType = new PreConditionsTypeImpl();
		return preConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionsType1 createPreConditionsType1() {
		PreConditionsType1Impl preConditionsType1 = new PreConditionsType1Impl();
		return preConditionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrependType createPrependType() {
		PrependTypeImpl prependType = new PrependTypeImpl();
		return prependType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyExistsType createPrimaryKeyExistsType() {
		PrimaryKeyExistsTypeImpl primaryKeyExistsType = new PrimaryKeyExistsTypeImpl();
		return primaryKeyExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExpReplaceType createRegExpReplaceType() {
		RegExpReplaceTypeImpl regExpReplaceType = new RegExpReplaceTypeImpl();
		return regExpReplaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameColumnType createRenameColumnType() {
		RenameColumnTypeImpl renameColumnType = new RenameColumnTypeImpl();
		return renameColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameTableType createRenameTableType() {
		RenameTableTypeImpl renameTableType = new RenameTableTypeImpl();
		return renameTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameViewType createRenameViewType() {
		RenameViewTypeImpl renameViewType = new RenameViewTypeImpl();
		return renameViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceType createReplaceType() {
		ReplaceTypeImpl replaceType = new ReplaceTypeImpl();
		return replaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackType createRollbackType() {
		RollbackTypeImpl rollbackType = new RollbackTypeImpl();
		return rollbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCountType createRowCountType() {
		RowCountTypeImpl rowCountType = new RowCountTypeImpl();
		return rowCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningAsType createRunningAsType() {
		RunningAsTypeImpl runningAsType = new RunningAsTypeImpl();
		return runningAsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceExistsType createSequenceExistsType() {
		SequenceExistsTypeImpl sequenceExistsType = new SequenceExistsTypeImpl();
		return sequenceExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlCheckType createSqlCheckType() {
		SqlCheckTypeImpl sqlCheckType = new SqlCheckTypeImpl();
		return sqlCheckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFileType createSqlFileType() {
		SqlFileTypeImpl sqlFileType = new SqlFileTypeImpl();
		return sqlFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlType createSqlType() {
		SqlTypeImpl sqlType = new SqlTypeImpl();
		return sqlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopType createStopType() {
		StopTypeImpl stopType = new StopTypeImpl();
		return stopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableExistsType createTableExistsType() {
		TableExistsTypeImpl tableExistsType = new TableExistsTypeImpl();
		return tableExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIsEmptyType createTableIsEmptyType() {
		TableIsEmptyTypeImpl tableIsEmptyType = new TableIsEmptyTypeImpl();
		return tableIsEmptyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDatabaseType createTagDatabaseType() {
		TagDatabaseTypeImpl tagDatabaseType = new TagDatabaseTypeImpl();
		return tagDatabaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidCheckSumType createValidCheckSumType() {
		ValidCheckSumTypeImpl validCheckSumType = new ValidCheckSumTypeImpl();
		return validCheckSumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewExistsType createViewExistsType() {
		ViewExistsTypeImpl viewExistsType = new ViewExistsTypeImpl();
		return viewExistsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereParamsType createWhereParamsType() {
		WhereParamsTypeImpl whereParamsType = new WhereParamsTypeImpl();
		return whereParamsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FkCascadeActionOptions createFkCascadeActionOptionsFromString(EDataType eDataType, String initialValue) {
		FkCascadeActionOptions result = FkCascadeActionOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFkCascadeActionOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectQuotingStrategy createObjectQuotingStrategyFromString(EDataType eDataType, String initialValue) {
		ObjectQuotingStrategy result = ObjectQuotingStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectQuotingStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeLogPreconditionErrorOrFail createOnChangeLogPreconditionErrorOrFailFromString(EDataType eDataType, String initialValue) {
		OnChangeLogPreconditionErrorOrFail result = OnChangeLogPreconditionErrorOrFail.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeLogPreconditionErrorOrFailToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeLogPreconditionOnSqlOutput createOnChangeLogPreconditionOnSqlOutputFromString(EDataType eDataType, String initialValue) {
		OnChangeLogPreconditionOnSqlOutput result = OnChangeLogPreconditionOnSqlOutput.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeLogPreconditionOnSqlOutputToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeSetPreconditionErrorOrFail createOnChangeSetPreconditionErrorOrFailFromString(EDataType eDataType, String initialValue) {
		OnChangeSetPreconditionErrorOrFail result = OnChangeSetPreconditionErrorOrFail.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeSetPreconditionErrorOrFailToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeSetValidationFail createOnChangeSetValidationFailFromString(EDataType eDataType, String initialValue) {
		OnChangeSetValidationFail result = OnChangeSetValidationFail.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeSetValidationFailToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBooleanExpFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBooleanExpMember0FromString(DbchangelogPackage.eINSTANCE.getBooleanExpMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBooleanExpMember1FromString(DbchangelogPackage.eINSTANCE.getBooleanExpMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanExpToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (DbchangelogPackage.eINSTANCE.getBooleanExpMember0().isInstance(instanceValue)) {
			try {
				String value = convertBooleanExpMember0ToString(DbchangelogPackage.eINSTANCE.getBooleanExpMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DbchangelogPackage.eINSTANCE.getBooleanExpMember1().isInstance(instanceValue)) {
			try {
				String value = convertBooleanExpMember1ToString(DbchangelogPackage.eINSTANCE.getBooleanExpMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanExpMember0FromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanExpMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanExpMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanExpMember0FromString(DbchangelogPackage.eINSTANCE.getBooleanExpMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanExpMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanExpMember0ToString(DbchangelogPackage.eINSTANCE.getBooleanExpMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBooleanExpMember1FromString(EDataType eDataType, String initialValue) {
		return createPropertyExpressionFromString(DbchangelogPackage.eINSTANCE.getPropertyExpression(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanExpMember1ToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyExpressionToString(DbchangelogPackage.eINSTANCE.getPropertyExpression(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FkCascadeActionOptions createFkCascadeActionOptionsObjectFromString(EDataType eDataType, String initialValue) {
		return createFkCascadeActionOptionsFromString(DbchangelogPackage.eINSTANCE.getFkCascadeActionOptions(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFkCascadeActionOptionsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFkCascadeActionOptionsToString(DbchangelogPackage.eINSTANCE.getFkCascadeActionOptions(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIntegerExpFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createIntegerExpMember0FromString(DbchangelogPackage.eINSTANCE.getIntegerExpMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIntegerExpMember1FromString(DbchangelogPackage.eINSTANCE.getIntegerExpMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerExpToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (DbchangelogPackage.eINSTANCE.getIntegerExpMember0().isInstance(instanceValue)) {
			try {
				String value = convertIntegerExpMember0ToString(DbchangelogPackage.eINSTANCE.getIntegerExpMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DbchangelogPackage.eINSTANCE.getIntegerExpMember1().isInstance(instanceValue)) {
			try {
				String value = convertIntegerExpMember1ToString(DbchangelogPackage.eINSTANCE.getIntegerExpMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createIntegerExpMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerExpMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIntegerExpMember1FromString(EDataType eDataType, String initialValue) {
		return createPropertyExpressionFromString(DbchangelogPackage.eINSTANCE.getPropertyExpression(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerExpMember1ToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyExpressionToString(DbchangelogPackage.eINSTANCE.getPropertyExpression(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectQuotingStrategy createObjectQuotingStrategyObjectFromString(EDataType eDataType, String initialValue) {
		return createObjectQuotingStrategyFromString(DbchangelogPackage.eINSTANCE.getObjectQuotingStrategy(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectQuotingStrategyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObjectQuotingStrategyToString(DbchangelogPackage.eINSTANCE.getObjectQuotingStrategy(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeLogPreconditionErrorOrFail createOnChangeLogPreconditionErrorOrFailObjectFromString(EDataType eDataType, String initialValue) {
		return createOnChangeLogPreconditionErrorOrFailFromString(DbchangelogPackage.eINSTANCE.getOnChangeLogPreconditionErrorOrFail(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeLogPreconditionErrorOrFailObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnChangeLogPreconditionErrorOrFailToString(DbchangelogPackage.eINSTANCE.getOnChangeLogPreconditionErrorOrFail(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeLogPreconditionOnSqlOutput createOnChangeLogPreconditionOnSqlOutputObjectFromString(EDataType eDataType, String initialValue) {
		return createOnChangeLogPreconditionOnSqlOutputFromString(DbchangelogPackage.eINSTANCE.getOnChangeLogPreconditionOnSqlOutput(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeLogPreconditionOnSqlOutputObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnChangeLogPreconditionOnSqlOutputToString(DbchangelogPackage.eINSTANCE.getOnChangeLogPreconditionOnSqlOutput(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeSetPreconditionErrorOrFail createOnChangeSetPreconditionErrorOrFailObjectFromString(EDataType eDataType, String initialValue) {
		return createOnChangeSetPreconditionErrorOrFailFromString(DbchangelogPackage.eINSTANCE.getOnChangeSetPreconditionErrorOrFail(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeSetPreconditionErrorOrFailObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnChangeSetPreconditionErrorOrFailToString(DbchangelogPackage.eINSTANCE.getOnChangeSetPreconditionErrorOrFail(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChangeSetValidationFail createOnChangeSetValidationFailObjectFromString(EDataType eDataType, String initialValue) {
		return createOnChangeSetValidationFailFromString(DbchangelogPackage.eINSTANCE.getOnChangeSetValidationFail(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChangeSetValidationFailObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnChangeSetValidationFailToString(DbchangelogPackage.eINSTANCE.getOnChangeSetValidationFail(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPropertyExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyExpressionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogPackage getDbchangelogPackage() {
		return (DbchangelogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DbchangelogPackage getPackage() {
		return DbchangelogPackage.eINSTANCE;
	}

} //DbchangelogFactoryImpl
