/**
 */
package org.liquibase.xml.ns.dbchangelog.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.liquibase.xml.ns.dbchangelog.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage
 * @generated
 */
public class DbchangelogValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DbchangelogValidator INSTANCE = new DbchangelogValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.liquibase.xml.ns.dbchangelog";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DbchangelogPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DbchangelogPackage.ADD_AUTO_INCREMENT_TYPE:
				return validateAddAutoIncrementType((AddAutoIncrementType)value, diagnostics, context);
			case DbchangelogPackage.ADD_COLUMN_TYPE:
				return validateAddColumnType((AddColumnType)value, diagnostics, context);
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE:
				return validateAddDefaultValueType((AddDefaultValueType)value, diagnostics, context);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE:
				return validateAddForeignKeyConstraintType((AddForeignKeyConstraintType)value, diagnostics, context);
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE:
				return validateAddLookupTableType((AddLookupTableType)value, diagnostics, context);
			case DbchangelogPackage.ADD_NOT_NULL_CONSTRAINT_TYPE:
				return validateAddNotNullConstraintType((AddNotNullConstraintType)value, diagnostics, context);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE:
				return validateAddPrimaryKeyType((AddPrimaryKeyType)value, diagnostics, context);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE:
				return validateAddUniqueConstraintType((AddUniqueConstraintType)value, diagnostics, context);
			case DbchangelogPackage.ALTER_SEQUENCE_TYPE:
				return validateAlterSequenceType((AlterSequenceType)value, diagnostics, context);
			case DbchangelogPackage.AND_TYPE:
				return validateAndType((AndType)value, diagnostics, context);
			case DbchangelogPackage.APPEND_TYPE:
				return validateAppendType((AppendType)value, diagnostics, context);
			case DbchangelogPackage.ARG_TYPE:
				return validateArgType((ArgType)value, diagnostics, context);
			case DbchangelogPackage.CHANGE_LOG_PROPERTY_DEFINED_TYPE:
				return validateChangeLogPropertyDefinedType((ChangeLogPropertyDefinedType)value, diagnostics, context);
			case DbchangelogPackage.CHANGE_SET_EXECUTED_TYPE:
				return validateChangeSetExecutedType((ChangeSetExecutedType)value, diagnostics, context);
			case DbchangelogPackage.CHANGE_SET_TYPE:
				return validateChangeSetType((ChangeSetType)value, diagnostics, context);
			case DbchangelogPackage.COLUMN_EXISTS_TYPE:
				return validateColumnExistsType((ColumnExistsType)value, diagnostics, context);
			case DbchangelogPackage.COLUMN_TYPE:
				return validateColumnType((ColumnType)value, diagnostics, context);
			case DbchangelogPackage.COLUMN_TYPE1:
				return validateColumnType1((ColumnType1)value, diagnostics, context);
			case DbchangelogPackage.COLUMN_TYPE2:
				return validateColumnType2((ColumnType2)value, diagnostics, context);
			case DbchangelogPackage.COLUMN_TYPE3:
				return validateColumnType3((ColumnType3)value, diagnostics, context);
			case DbchangelogPackage.COLUMN_TYPE4:
				return validateColumnType4((ColumnType4)value, diagnostics, context);
			case DbchangelogPackage.CONSTRAINTS_TYPE:
				return validateConstraintsType((ConstraintsType)value, diagnostics, context);
			case DbchangelogPackage.CREATE_INDEX_TYPE:
				return validateCreateIndexType((CreateIndexType)value, diagnostics, context);
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE:
				return validateCreateProcedureType((CreateProcedureType)value, diagnostics, context);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE:
				return validateCreateSequenceType((CreateSequenceType)value, diagnostics, context);
			case DbchangelogPackage.CREATE_TABLE_TYPE:
				return validateCreateTableType((CreateTableType)value, diagnostics, context);
			case DbchangelogPackage.CREATE_VIEW_TYPE:
				return validateCreateViewType((CreateViewType)value, diagnostics, context);
			case DbchangelogPackage.CUSTOM_CHANGE_TYPE:
				return validateCustomChangeType((CustomChangeType)value, diagnostics, context);
			case DbchangelogPackage.CUSTOM_PRECONDITION_TYPE:
				return validateCustomPreconditionType((CustomPreconditionType)value, diagnostics, context);
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE:
				return validateDatabaseChangeLogType((DatabaseChangeLogType)value, diagnostics, context);
			case DbchangelogPackage.DBMS_TYPE:
				return validateDbmsType((DbmsType)value, diagnostics, context);
			case DbchangelogPackage.DELETE_TYPE:
				return validateDeleteType((DeleteType)value, diagnostics, context);
			case DbchangelogPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE:
				return validateDropAllForeignKeyConstraintsType((DropAllForeignKeyConstraintsType)value, diagnostics, context);
			case DbchangelogPackage.DROP_COLUMN_TYPE:
				return validateDropColumnType((DropColumnType)value, diagnostics, context);
			case DbchangelogPackage.DROP_DEFAULT_VALUE_TYPE:
				return validateDropDefaultValueType((DropDefaultValueType)value, diagnostics, context);
			case DbchangelogPackage.DROP_FOREIGN_KEY_CONSTRAINT_TYPE:
				return validateDropForeignKeyConstraintType((DropForeignKeyConstraintType)value, diagnostics, context);
			case DbchangelogPackage.DROP_INDEX_TYPE:
				return validateDropIndexType((DropIndexType)value, diagnostics, context);
			case DbchangelogPackage.DROP_NOT_NULL_CONSTRAINT_TYPE:
				return validateDropNotNullConstraintType((DropNotNullConstraintType)value, diagnostics, context);
			case DbchangelogPackage.DROP_PRIMARY_KEY_TYPE:
				return validateDropPrimaryKeyType((DropPrimaryKeyType)value, diagnostics, context);
			case DbchangelogPackage.DROP_PROCEDURE_TYPE:
				return validateDropProcedureType((DropProcedureType)value, diagnostics, context);
			case DbchangelogPackage.DROP_SEQUENCE_TYPE:
				return validateDropSequenceType((DropSequenceType)value, diagnostics, context);
			case DbchangelogPackage.DROP_TABLE_TYPE:
				return validateDropTableType((DropTableType)value, diagnostics, context);
			case DbchangelogPackage.DROP_UNIQUE_CONSTRAINT_TYPE:
				return validateDropUniqueConstraintType((DropUniqueConstraintType)value, diagnostics, context);
			case DbchangelogPackage.DROP_VIEW_TYPE:
				return validateDropViewType((DropViewType)value, diagnostics, context);
			case DbchangelogPackage.EXECUTE_COMMAND_TYPE:
				return validateExecuteCommandType((ExecuteCommandType)value, diagnostics, context);
			case DbchangelogPackage.EXPECTED_QUOTING_STRATEGY_TYPE:
				return validateExpectedQuotingStrategyType((ExpectedQuotingStrategyType)value, diagnostics, context);
			case DbchangelogPackage.FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE:
				return validateForeignKeyConstraintExistsType((ForeignKeyConstraintExistsType)value, diagnostics, context);
			case DbchangelogPackage.INCLUDE_ALL_TYPE:
				return validateIncludeAllType((IncludeAllType)value, diagnostics, context);
			case DbchangelogPackage.INCLUDE_TYPE:
				return validateIncludeType((IncludeType)value, diagnostics, context);
			case DbchangelogPackage.INDEX_EXISTS_TYPE:
				return validateIndexExistsType((IndexExistsType)value, diagnostics, context);
			case DbchangelogPackage.INSERT_TYPE:
				return validateInsertType((InsertType)value, diagnostics, context);
			case DbchangelogPackage.LOAD_DATA_TYPE:
				return validateLoadDataType((LoadDataType)value, diagnostics, context);
			case DbchangelogPackage.LOAD_UPDATE_DATA_TYPE:
				return validateLoadUpdateDataType((LoadUpdateDataType)value, diagnostics, context);
			case DbchangelogPackage.MERGE_COLUMNS_TYPE:
				return validateMergeColumnsType((MergeColumnsType)value, diagnostics, context);
			case DbchangelogPackage.MODIFY_DATA_TYPE_TYPE:
				return validateModifyDataTypeType((ModifyDataTypeType)value, diagnostics, context);
			case DbchangelogPackage.MODIFY_SQL_TYPE:
				return validateModifySqlType((ModifySqlType)value, diagnostics, context);
			case DbchangelogPackage.NOT_TYPE:
				return validateNotType((NotType)value, diagnostics, context);
			case DbchangelogPackage.OR_TYPE:
				return validateOrType((OrType)value, diagnostics, context);
			case DbchangelogPackage.PARAM_TYPE:
				return validateParamType((ParamType)value, diagnostics, context);
			case DbchangelogPackage.PARAM_TYPE1:
				return validateParamType1((ParamType1)value, diagnostics, context);
			case DbchangelogPackage.PARAM_TYPE2:
				return validateParamType2((ParamType2)value, diagnostics, context);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE:
				return validatePreConditionsType((PreConditionsType)value, diagnostics, context);
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1:
				return validatePreConditionsType1((PreConditionsType1)value, diagnostics, context);
			case DbchangelogPackage.PREPEND_TYPE:
				return validatePrependType((PrependType)value, diagnostics, context);
			case DbchangelogPackage.PRIMARY_KEY_EXISTS_TYPE:
				return validatePrimaryKeyExistsType((PrimaryKeyExistsType)value, diagnostics, context);
			case DbchangelogPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case DbchangelogPackage.REG_EXP_REPLACE_TYPE:
				return validateRegExpReplaceType((RegExpReplaceType)value, diagnostics, context);
			case DbchangelogPackage.RENAME_COLUMN_TYPE:
				return validateRenameColumnType((RenameColumnType)value, diagnostics, context);
			case DbchangelogPackage.RENAME_TABLE_TYPE:
				return validateRenameTableType((RenameTableType)value, diagnostics, context);
			case DbchangelogPackage.RENAME_VIEW_TYPE:
				return validateRenameViewType((RenameViewType)value, diagnostics, context);
			case DbchangelogPackage.REPLACE_TYPE:
				return validateReplaceType((ReplaceType)value, diagnostics, context);
			case DbchangelogPackage.ROLLBACK_TYPE:
				return validateRollbackType((RollbackType)value, diagnostics, context);
			case DbchangelogPackage.ROW_COUNT_TYPE:
				return validateRowCountType((RowCountType)value, diagnostics, context);
			case DbchangelogPackage.RUNNING_AS_TYPE:
				return validateRunningAsType((RunningAsType)value, diagnostics, context);
			case DbchangelogPackage.SEQUENCE_EXISTS_TYPE:
				return validateSequenceExistsType((SequenceExistsType)value, diagnostics, context);
			case DbchangelogPackage.SQL_CHECK_TYPE:
				return validateSqlCheckType((SqlCheckType)value, diagnostics, context);
			case DbchangelogPackage.SQL_FILE_TYPE:
				return validateSqlFileType((SqlFileType)value, diagnostics, context);
			case DbchangelogPackage.SQL_TYPE:
				return validateSqlType((SqlType)value, diagnostics, context);
			case DbchangelogPackage.STOP_TYPE:
				return validateStopType((StopType)value, diagnostics, context);
			case DbchangelogPackage.TABLE_EXISTS_TYPE:
				return validateTableExistsType((TableExistsType)value, diagnostics, context);
			case DbchangelogPackage.TABLE_IS_EMPTY_TYPE:
				return validateTableIsEmptyType((TableIsEmptyType)value, diagnostics, context);
			case DbchangelogPackage.TAG_DATABASE_TYPE:
				return validateTagDatabaseType((TagDatabaseType)value, diagnostics, context);
			case DbchangelogPackage.UPDATE_TYPE:
				return validateUpdateType((UpdateType)value, diagnostics, context);
			case DbchangelogPackage.VALID_CHECK_SUM_TYPE:
				return validateValidCheckSumType((ValidCheckSumType)value, diagnostics, context);
			case DbchangelogPackage.VIEW_EXISTS_TYPE:
				return validateViewExistsType((ViewExistsType)value, diagnostics, context);
			case DbchangelogPackage.WHERE_PARAMS_TYPE:
				return validateWhereParamsType((WhereParamsType)value, diagnostics, context);
			case DbchangelogPackage.FK_CASCADE_ACTION_OPTIONS:
				return validateFkCascadeActionOptions((FkCascadeActionOptions)value, diagnostics, context);
			case DbchangelogPackage.OBJECT_QUOTING_STRATEGY:
				return validateObjectQuotingStrategy((ObjectQuotingStrategy)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL:
				return validateOnChangeLogPreconditionErrorOrFail((OnChangeLogPreconditionErrorOrFail)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT:
				return validateOnChangeLogPreconditionOnSqlOutput((OnChangeLogPreconditionOnSqlOutput)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL:
				return validateOnChangeSetPreconditionErrorOrFail((OnChangeSetPreconditionErrorOrFail)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_SET_VALIDATION_FAIL:
				return validateOnChangeSetValidationFail((OnChangeSetValidationFail)value, diagnostics, context);
			case DbchangelogPackage.BOOLEAN_EXP:
				return validateBooleanExp(value, diagnostics, context);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER0:
				return validateBooleanExpMember0((Boolean)value, diagnostics, context);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER0_OBJECT:
				return validateBooleanExpMember0Object((Boolean)value, diagnostics, context);
			case DbchangelogPackage.BOOLEAN_EXP_MEMBER1:
				return validateBooleanExpMember1((String)value, diagnostics, context);
			case DbchangelogPackage.FK_CASCADE_ACTION_OPTIONS_OBJECT:
				return validateFkCascadeActionOptionsObject((FkCascadeActionOptions)value, diagnostics, context);
			case DbchangelogPackage.INTEGER_EXP:
				return validateIntegerExp(value, diagnostics, context);
			case DbchangelogPackage.INTEGER_EXP_MEMBER0:
				return validateIntegerExpMember0((BigInteger)value, diagnostics, context);
			case DbchangelogPackage.INTEGER_EXP_MEMBER1:
				return validateIntegerExpMember1((String)value, diagnostics, context);
			case DbchangelogPackage.OBJECT_QUOTING_STRATEGY_OBJECT:
				return validateObjectQuotingStrategyObject((ObjectQuotingStrategy)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL_OBJECT:
				return validateOnChangeLogPreconditionErrorOrFailObject((OnChangeLogPreconditionErrorOrFail)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT_OBJECT:
				return validateOnChangeLogPreconditionOnSqlOutputObject((OnChangeLogPreconditionOnSqlOutput)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL_OBJECT:
				return validateOnChangeSetPreconditionErrorOrFailObject((OnChangeSetPreconditionErrorOrFail)value, diagnostics, context);
			case DbchangelogPackage.ON_CHANGE_SET_VALIDATION_FAIL_OBJECT:
				return validateOnChangeSetValidationFailObject((OnChangeSetValidationFail)value, diagnostics, context);
			case DbchangelogPackage.PROPERTY_EXPRESSION:
				return validatePropertyExpression((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddAutoIncrementType(AddAutoIncrementType addAutoIncrementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addAutoIncrementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddColumnType(AddColumnType addColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddDefaultValueType(AddDefaultValueType addDefaultValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addDefaultValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddForeignKeyConstraintType(AddForeignKeyConstraintType addForeignKeyConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addForeignKeyConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddLookupTableType(AddLookupTableType addLookupTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addLookupTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddNotNullConstraintType(AddNotNullConstraintType addNotNullConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addNotNullConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddPrimaryKeyType(AddPrimaryKeyType addPrimaryKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addPrimaryKeyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddUniqueConstraintType(AddUniqueConstraintType addUniqueConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addUniqueConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlterSequenceType(AlterSequenceType alterSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alterSequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAndType(AndType andType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(andType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppendType(AppendType appendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appendType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgType(ArgType argType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeLogPropertyDefinedType(ChangeLogPropertyDefinedType changeLogPropertyDefinedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeLogPropertyDefinedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeSetExecutedType(ChangeSetExecutedType changeSetExecutedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeSetExecutedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeSetType(ChangeSetType changeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnExistsType(ColumnExistsType columnExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType1(ColumnType1 columnType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType2(ColumnType2 columnType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType3(ColumnType3 columnType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType4(ColumnType4 columnType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintsType(ConstraintsType constraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateIndexType(CreateIndexType createIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateProcedureType(CreateProcedureType createProcedureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createProcedureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateSequenceType(CreateSequenceType createSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createSequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateTableType(CreateTableType createTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateViewType(CreateViewType createViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomChangeType(CustomChangeType customChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomPreconditionType(CustomPreconditionType customPreconditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customPreconditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseChangeLogType(DatabaseChangeLogType databaseChangeLogType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseChangeLogType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbmsType(DbmsType dbmsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dbmsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteType(DeleteType deleteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deleteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropAllForeignKeyConstraintsType(DropAllForeignKeyConstraintsType dropAllForeignKeyConstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropAllForeignKeyConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropColumnType(DropColumnType dropColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropDefaultValueType(DropDefaultValueType dropDefaultValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropDefaultValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropForeignKeyConstraintType(DropForeignKeyConstraintType dropForeignKeyConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropForeignKeyConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropIndexType(DropIndexType dropIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropNotNullConstraintType(DropNotNullConstraintType dropNotNullConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropNotNullConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropPrimaryKeyType(DropPrimaryKeyType dropPrimaryKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropPrimaryKeyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropProcedureType(DropProcedureType dropProcedureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropProcedureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropSequenceType(DropSequenceType dropSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropSequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropTableType(DropTableType dropTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropUniqueConstraintType(DropUniqueConstraintType dropUniqueConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropUniqueConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropViewType(DropViewType dropViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecuteCommandType(ExecuteCommandType executeCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executeCommandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpectedQuotingStrategyType(ExpectedQuotingStrategyType expectedQuotingStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expectedQuotingStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyConstraintExistsType(ForeignKeyConstraintExistsType foreignKeyConstraintExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKeyConstraintExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeAllType(IncludeAllType includeAllType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeAllType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeType(IncludeType includeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexExistsType(IndexExistsType indexExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertType(InsertType insertType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadDataType(LoadDataType loadDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadUpdateDataType(LoadUpdateDataType loadUpdateDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadUpdateDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeColumnsType(MergeColumnsType mergeColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergeColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifyDataTypeType(ModifyDataTypeType modifyDataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modifyDataTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifySqlType(ModifySqlType modifySqlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modifySqlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotType(NotType notType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrType(OrType orType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType1(ParamType1 paramType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType2(ParamType2 paramType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreConditionsType(PreConditionsType preConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreConditionsType1(PreConditionsType1 preConditionsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preConditionsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrependType(PrependType prependType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prependType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKeyExistsType(PrimaryKeyExistsType primaryKeyExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaryKeyExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegExpReplaceType(RegExpReplaceType regExpReplaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regExpReplaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameColumnType(RenameColumnType renameColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameTableType(RenameTableType renameTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameViewType(RenameViewType renameViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplaceType(ReplaceType replaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRollbackType(RollbackType rollbackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rollbackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowCountType(RowCountType rowCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunningAsType(RunningAsType runningAsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runningAsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceExistsType(SequenceExistsType sequenceExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlCheckType(SqlCheckType sqlCheckType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sqlCheckType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlFileType(SqlFileType sqlFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sqlFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSqlType(SqlType sqlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sqlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopType(StopType stopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableExistsType(TableExistsType tableExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableIsEmptyType(TableIsEmptyType tableIsEmptyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableIsEmptyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagDatabaseType(TagDatabaseType tagDatabaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagDatabaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateType(UpdateType updateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidCheckSumType(ValidCheckSumType validCheckSumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validCheckSumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewExistsType(ViewExistsType viewExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewExistsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhereParamsType(WhereParamsType whereParamsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whereParamsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFkCascadeActionOptions(FkCascadeActionOptions fkCascadeActionOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectQuotingStrategy(ObjectQuotingStrategy objectQuotingStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeLogPreconditionErrorOrFail(OnChangeLogPreconditionErrorOrFail onChangeLogPreconditionErrorOrFail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeLogPreconditionOnSqlOutput(OnChangeLogPreconditionOnSqlOutput onChangeLogPreconditionOnSqlOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeSetPreconditionErrorOrFail(OnChangeSetPreconditionErrorOrFail onChangeSetPreconditionErrorOrFail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeSetValidationFail(OnChangeSetValidationFail onChangeSetValidationFail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExp(Object booleanExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanExp_MemberTypes(booleanExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Boolean Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExp_MemberTypes(Object booleanExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (DbchangelogPackage.eINSTANCE.getBooleanExpMember0().isInstance(booleanExp)) {
				if (validateBooleanExpMember0((Boolean)booleanExp, tempDiagnostics, context)) return true;
			}
			if (DbchangelogPackage.eINSTANCE.getBooleanExpMember1().isInstance(booleanExp)) {
				if (validateBooleanExpMember1((String)booleanExp, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (DbchangelogPackage.eINSTANCE.getBooleanExpMember0().isInstance(booleanExp)) {
				if (validateBooleanExpMember0((Boolean)booleanExp, null, context)) return true;
			}
			if (DbchangelogPackage.eINSTANCE.getBooleanExpMember1().isInstance(booleanExp)) {
				if (validateBooleanExpMember1((String)booleanExp, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpMember0(boolean booleanExpMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpMember0Object(Boolean booleanExpMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpMember1(String booleanExpMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyExpression_Pattern(booleanExpMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFkCascadeActionOptionsObject(FkCascadeActionOptions fkCascadeActionOptionsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerExp(Object integerExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerExp_MemberTypes(integerExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Integer Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerExp_MemberTypes(Object integerExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (DbchangelogPackage.eINSTANCE.getIntegerExpMember0().isInstance(integerExp)) {
				if (validateIntegerExpMember0((BigInteger)integerExp, tempDiagnostics, context)) return true;
			}
			if (DbchangelogPackage.eINSTANCE.getIntegerExpMember1().isInstance(integerExp)) {
				if (validateIntegerExpMember1((String)integerExp, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (DbchangelogPackage.eINSTANCE.getIntegerExpMember0().isInstance(integerExp)) {
				if (validateIntegerExpMember0((BigInteger)integerExp, null, context)) return true;
			}
			if (DbchangelogPackage.eINSTANCE.getIntegerExpMember1().isInstance(integerExp)) {
				if (validateIntegerExpMember1((String)integerExp, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerExpMember0(BigInteger integerExpMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerExpMember1(String integerExpMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyExpression_Pattern(integerExpMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectQuotingStrategyObject(ObjectQuotingStrategy objectQuotingStrategyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeLogPreconditionErrorOrFailObject(OnChangeLogPreconditionErrorOrFail onChangeLogPreconditionErrorOrFailObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeLogPreconditionOnSqlOutputObject(OnChangeLogPreconditionOnSqlOutput onChangeLogPreconditionOnSqlOutputObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeSetPreconditionErrorOrFailObject(OnChangeSetPreconditionErrorOrFail onChangeSetPreconditionErrorOrFailObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnChangeSetValidationFailObject(OnChangeSetValidationFail onChangeSetValidationFailObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyExpression(String propertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyExpression_Pattern(propertyExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePropertyExpression_Pattern
	 */
	public static final  PatternMatcher [][] PROPERTY_EXPRESSION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("$\\{[\\w\\.]+\\}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyExpression_Pattern(String propertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DbchangelogPackage.eINSTANCE.getPropertyExpression(), propertyExpression, PROPERTY_EXPRESSION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DbchangelogValidator
