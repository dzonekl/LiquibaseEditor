/**
 */
package org.liquibase.xml.ns.dbchangelog.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.liquibase.xml.ns.dbchangelog.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage
 * @generated
 */
public class DbchangelogAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DbchangelogPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DbchangelogPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbchangelogSwitch<Adapter> modelSwitch =
		new DbchangelogSwitch<Adapter>() {
			@Override
			public Adapter caseAddAutoIncrementType(AddAutoIncrementType object) {
				return createAddAutoIncrementTypeAdapter();
			}
			@Override
			public Adapter caseAddColumnType(AddColumnType object) {
				return createAddColumnTypeAdapter();
			}
			@Override
			public Adapter caseAddDefaultValueType(AddDefaultValueType object) {
				return createAddDefaultValueTypeAdapter();
			}
			@Override
			public Adapter caseAddForeignKeyConstraintType(AddForeignKeyConstraintType object) {
				return createAddForeignKeyConstraintTypeAdapter();
			}
			@Override
			public Adapter caseAddLookupTableType(AddLookupTableType object) {
				return createAddLookupTableTypeAdapter();
			}
			@Override
			public Adapter caseAddNotNullConstraintType(AddNotNullConstraintType object) {
				return createAddNotNullConstraintTypeAdapter();
			}
			@Override
			public Adapter caseAddPrimaryKeyType(AddPrimaryKeyType object) {
				return createAddPrimaryKeyTypeAdapter();
			}
			@Override
			public Adapter caseAddUniqueConstraintType(AddUniqueConstraintType object) {
				return createAddUniqueConstraintTypeAdapter();
			}
			@Override
			public Adapter caseAlterSequenceType(AlterSequenceType object) {
				return createAlterSequenceTypeAdapter();
			}
			@Override
			public Adapter caseAndType(AndType object) {
				return createAndTypeAdapter();
			}
			@Override
			public Adapter caseAppendType(AppendType object) {
				return createAppendTypeAdapter();
			}
			@Override
			public Adapter caseArgType(ArgType object) {
				return createArgTypeAdapter();
			}
			@Override
			public Adapter caseChangeLogPropertyDefinedType(ChangeLogPropertyDefinedType object) {
				return createChangeLogPropertyDefinedTypeAdapter();
			}
			@Override
			public Adapter caseChangeSetExecutedType(ChangeSetExecutedType object) {
				return createChangeSetExecutedTypeAdapter();
			}
			@Override
			public Adapter caseChangeSetType(ChangeSetType object) {
				return createChangeSetTypeAdapter();
			}
			@Override
			public Adapter caseColumnExistsType(ColumnExistsType object) {
				return createColumnExistsTypeAdapter();
			}
			@Override
			public Adapter caseColumnType(ColumnType object) {
				return createColumnTypeAdapter();
			}
			@Override
			public Adapter caseColumnType1(ColumnType1 object) {
				return createColumnType1Adapter();
			}
			@Override
			public Adapter caseColumnType2(ColumnType2 object) {
				return createColumnType2Adapter();
			}
			@Override
			public Adapter caseColumnType3(ColumnType3 object) {
				return createColumnType3Adapter();
			}
			@Override
			public Adapter caseColumnType4(ColumnType4 object) {
				return createColumnType4Adapter();
			}
			@Override
			public Adapter caseConstraintsType(ConstraintsType object) {
				return createConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseCreateIndexType(CreateIndexType object) {
				return createCreateIndexTypeAdapter();
			}
			@Override
			public Adapter caseCreateProcedureType(CreateProcedureType object) {
				return createCreateProcedureTypeAdapter();
			}
			@Override
			public Adapter caseCreateSequenceType(CreateSequenceType object) {
				return createCreateSequenceTypeAdapter();
			}
			@Override
			public Adapter caseCreateTableType(CreateTableType object) {
				return createCreateTableTypeAdapter();
			}
			@Override
			public Adapter caseCreateViewType(CreateViewType object) {
				return createCreateViewTypeAdapter();
			}
			@Override
			public Adapter caseCustomChangeType(CustomChangeType object) {
				return createCustomChangeTypeAdapter();
			}
			@Override
			public Adapter caseCustomPreconditionType(CustomPreconditionType object) {
				return createCustomPreconditionTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseChangeLogType(DatabaseChangeLogType object) {
				return createDatabaseChangeLogTypeAdapter();
			}
			@Override
			public Adapter caseDbmsType(DbmsType object) {
				return createDbmsTypeAdapter();
			}
			@Override
			public Adapter caseDeleteType(DeleteType object) {
				return createDeleteTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDropAllForeignKeyConstraintsType(DropAllForeignKeyConstraintsType object) {
				return createDropAllForeignKeyConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseDropColumnType(DropColumnType object) {
				return createDropColumnTypeAdapter();
			}
			@Override
			public Adapter caseDropDefaultValueType(DropDefaultValueType object) {
				return createDropDefaultValueTypeAdapter();
			}
			@Override
			public Adapter caseDropForeignKeyConstraintType(DropForeignKeyConstraintType object) {
				return createDropForeignKeyConstraintTypeAdapter();
			}
			@Override
			public Adapter caseDropIndexType(DropIndexType object) {
				return createDropIndexTypeAdapter();
			}
			@Override
			public Adapter caseDropNotNullConstraintType(DropNotNullConstraintType object) {
				return createDropNotNullConstraintTypeAdapter();
			}
			@Override
			public Adapter caseDropPrimaryKeyType(DropPrimaryKeyType object) {
				return createDropPrimaryKeyTypeAdapter();
			}
			@Override
			public Adapter caseDropProcedureType(DropProcedureType object) {
				return createDropProcedureTypeAdapter();
			}
			@Override
			public Adapter caseDropSequenceType(DropSequenceType object) {
				return createDropSequenceTypeAdapter();
			}
			@Override
			public Adapter caseDropTableType(DropTableType object) {
				return createDropTableTypeAdapter();
			}
			@Override
			public Adapter caseDropUniqueConstraintType(DropUniqueConstraintType object) {
				return createDropUniqueConstraintTypeAdapter();
			}
			@Override
			public Adapter caseDropViewType(DropViewType object) {
				return createDropViewTypeAdapter();
			}
			@Override
			public Adapter caseExecuteCommandType(ExecuteCommandType object) {
				return createExecuteCommandTypeAdapter();
			}
			@Override
			public Adapter caseExpectedQuotingStrategyType(ExpectedQuotingStrategyType object) {
				return createExpectedQuotingStrategyTypeAdapter();
			}
			@Override
			public Adapter caseForeignKeyConstraintExistsType(ForeignKeyConstraintExistsType object) {
				return createForeignKeyConstraintExistsTypeAdapter();
			}
			@Override
			public Adapter caseIncludeAllType(IncludeAllType object) {
				return createIncludeAllTypeAdapter();
			}
			@Override
			public Adapter caseIncludeType(IncludeType object) {
				return createIncludeTypeAdapter();
			}
			@Override
			public Adapter caseIndexExistsType(IndexExistsType object) {
				return createIndexExistsTypeAdapter();
			}
			@Override
			public Adapter caseInsertType(InsertType object) {
				return createInsertTypeAdapter();
			}
			@Override
			public Adapter caseLoadDataType(LoadDataType object) {
				return createLoadDataTypeAdapter();
			}
			@Override
			public Adapter caseLoadUpdateDataType(LoadUpdateDataType object) {
				return createLoadUpdateDataTypeAdapter();
			}
			@Override
			public Adapter caseMergeColumnsType(MergeColumnsType object) {
				return createMergeColumnsTypeAdapter();
			}
			@Override
			public Adapter caseModifyDataTypeType(ModifyDataTypeType object) {
				return createModifyDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseModifySqlType(ModifySqlType object) {
				return createModifySqlTypeAdapter();
			}
			@Override
			public Adapter caseNotType(NotType object) {
				return createNotTypeAdapter();
			}
			@Override
			public Adapter caseOrType(OrType object) {
				return createOrTypeAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter caseParamType1(ParamType1 object) {
				return createParamType1Adapter();
			}
			@Override
			public Adapter caseParamType2(ParamType2 object) {
				return createParamType2Adapter();
			}
			@Override
			public Adapter casePreConditionsType(PreConditionsType object) {
				return createPreConditionsTypeAdapter();
			}
			@Override
			public Adapter casePreConditionsType1(PreConditionsType1 object) {
				return createPreConditionsType1Adapter();
			}
			@Override
			public Adapter casePrependType(PrependType object) {
				return createPrependTypeAdapter();
			}
			@Override
			public Adapter casePrimaryKeyExistsType(PrimaryKeyExistsType object) {
				return createPrimaryKeyExistsTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRegExpReplaceType(RegExpReplaceType object) {
				return createRegExpReplaceTypeAdapter();
			}
			@Override
			public Adapter caseRenameColumnType(RenameColumnType object) {
				return createRenameColumnTypeAdapter();
			}
			@Override
			public Adapter caseRenameTableType(RenameTableType object) {
				return createRenameTableTypeAdapter();
			}
			@Override
			public Adapter caseRenameViewType(RenameViewType object) {
				return createRenameViewTypeAdapter();
			}
			@Override
			public Adapter caseReplaceType(ReplaceType object) {
				return createReplaceTypeAdapter();
			}
			@Override
			public Adapter caseRollbackType(RollbackType object) {
				return createRollbackTypeAdapter();
			}
			@Override
			public Adapter caseRowCountType(RowCountType object) {
				return createRowCountTypeAdapter();
			}
			@Override
			public Adapter caseRunningAsType(RunningAsType object) {
				return createRunningAsTypeAdapter();
			}
			@Override
			public Adapter caseSequenceExistsType(SequenceExistsType object) {
				return createSequenceExistsTypeAdapter();
			}
			@Override
			public Adapter caseSqlCheckType(SqlCheckType object) {
				return createSqlCheckTypeAdapter();
			}
			@Override
			public Adapter caseSqlFileType(SqlFileType object) {
				return createSqlFileTypeAdapter();
			}
			@Override
			public Adapter caseSqlType(SqlType object) {
				return createSqlTypeAdapter();
			}
			@Override
			public Adapter caseStopType(StopType object) {
				return createStopTypeAdapter();
			}
			@Override
			public Adapter caseTableExistsType(TableExistsType object) {
				return createTableExistsTypeAdapter();
			}
			@Override
			public Adapter caseTableIsEmptyType(TableIsEmptyType object) {
				return createTableIsEmptyTypeAdapter();
			}
			@Override
			public Adapter caseTagDatabaseType(TagDatabaseType object) {
				return createTagDatabaseTypeAdapter();
			}
			@Override
			public Adapter caseUpdateType(UpdateType object) {
				return createUpdateTypeAdapter();
			}
			@Override
			public Adapter caseValidCheckSumType(ValidCheckSumType object) {
				return createValidCheckSumTypeAdapter();
			}
			@Override
			public Adapter caseViewExistsType(ViewExistsType object) {
				return createViewExistsTypeAdapter();
			}
			@Override
			public Adapter caseWhereParamsType(WhereParamsType object) {
				return createWhereParamsTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType <em>Add Auto Increment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType
	 * @generated
	 */
	public Adapter createAddAutoIncrementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddColumnType <em>Add Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddColumnType
	 * @generated
	 */
	public Adapter createAddColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType <em>Add Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType
	 * @generated
	 */
	public Adapter createAddDefaultValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType <em>Add Foreign Key Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType
	 * @generated
	 */
	public Adapter createAddForeignKeyConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType <em>Add Lookup Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType
	 * @generated
	 */
	public Adapter createAddLookupTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType <em>Add Not Null Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType
	 * @generated
	 */
	public Adapter createAddNotNullConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType <em>Add Primary Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType
	 * @generated
	 */
	public Adapter createAddPrimaryKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType <em>Add Unique Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType
	 * @generated
	 */
	public Adapter createAddUniqueConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType <em>Alter Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType
	 * @generated
	 */
	public Adapter createAlterSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AndType <em>And Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType
	 * @generated
	 */
	public Adapter createAndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.AppendType <em>Append Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.AppendType
	 * @generated
	 */
	public Adapter createAppendTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ArgType
	 * @generated
	 */
	public Adapter createArgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType <em>Change Log Property Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType
	 * @generated
	 */
	public Adapter createChangeLogPropertyDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType <em>Change Set Executed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType
	 * @generated
	 */
	public Adapter createChangeSetExecutedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType <em>Change Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType
	 * @generated
	 */
	public Adapter createChangeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType <em>Column Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnExistsType
	 * @generated
	 */
	public Adapter createColumnExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType
	 * @generated
	 */
	public Adapter createColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1 <em>Column Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1
	 * @generated
	 */
	public Adapter createColumnType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2 <em>Column Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2
	 * @generated
	 */
	public Adapter createColumnType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3 <em>Column Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3
	 * @generated
	 */
	public Adapter createColumnType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4 <em>Column Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType4
	 * @generated
	 */
	public Adapter createColumnType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType
	 * @generated
	 */
	public Adapter createConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType <em>Create Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType
	 * @generated
	 */
	public Adapter createCreateIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType <em>Create Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType
	 * @generated
	 */
	public Adapter createCreateProcedureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType <em>Create Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType
	 * @generated
	 */
	public Adapter createCreateSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType <em>Create Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType
	 * @generated
	 */
	public Adapter createCreateTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType <em>Create View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType
	 * @generated
	 */
	public Adapter createCreateViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CustomChangeType <em>Custom Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomChangeType
	 * @generated
	 */
	public Adapter createCustomChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.CustomPreconditionType <em>Custom Precondition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomPreconditionType
	 * @generated
	 */
	public Adapter createCustomPreconditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType <em>Database Change Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType
	 * @generated
	 */
	public Adapter createDatabaseChangeLogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DbmsType <em>Dbms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DbmsType
	 * @generated
	 */
	public Adapter createDbmsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType
	 * @generated
	 */
	public Adapter createDeleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType <em>Drop All Foreign Key Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType
	 * @generated
	 */
	public Adapter createDropAllForeignKeyConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropColumnType <em>Drop Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropColumnType
	 * @generated
	 */
	public Adapter createDropColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType <em>Drop Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType
	 * @generated
	 */
	public Adapter createDropDefaultValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType <em>Drop Foreign Key Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType
	 * @generated
	 */
	public Adapter createDropForeignKeyConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType <em>Drop Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType
	 * @generated
	 */
	public Adapter createDropIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType <em>Drop Not Null Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType
	 * @generated
	 */
	public Adapter createDropNotNullConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType <em>Drop Primary Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType
	 * @generated
	 */
	public Adapter createDropPrimaryKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropProcedureType <em>Drop Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropProcedureType
	 * @generated
	 */
	public Adapter createDropProcedureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType <em>Drop Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType
	 * @generated
	 */
	public Adapter createDropSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropTableType <em>Drop Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropTableType
	 * @generated
	 */
	public Adapter createDropTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType <em>Drop Unique Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType
	 * @generated
	 */
	public Adapter createDropUniqueConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.DropViewType <em>Drop View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.DropViewType
	 * @generated
	 */
	public Adapter createDropViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType <em>Execute Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ExecuteCommandType
	 * @generated
	 */
	public Adapter createExecuteCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType <em>Expected Quoting Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType
	 * @generated
	 */
	public Adapter createExpectedQuotingStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType <em>Foreign Key Constraint Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType
	 * @generated
	 */
	public Adapter createForeignKeyConstraintExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.IncludeAllType <em>Include All Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeAllType
	 * @generated
	 */
	public Adapter createIncludeAllTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeType
	 * @generated
	 */
	public Adapter createIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType <em>Index Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType
	 * @generated
	 */
	public Adapter createIndexExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.InsertType <em>Insert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType
	 * @generated
	 */
	public Adapter createInsertTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType <em>Load Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType
	 * @generated
	 */
	public Adapter createLoadDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType <em>Load Update Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType
	 * @generated
	 */
	public Adapter createLoadUpdateDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType <em>Merge Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType
	 * @generated
	 */
	public Adapter createMergeColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType <em>Modify Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType
	 * @generated
	 */
	public Adapter createModifyDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType <em>Modify Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType
	 * @generated
	 */
	public Adapter createModifySqlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.NotType <em>Not Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType
	 * @generated
	 */
	public Adapter createNotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.OrType <em>Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType
	 * @generated
	 */
	public Adapter createOrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ParamType1 <em>Param Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType1
	 * @generated
	 */
	public Adapter createParamType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ParamType2 <em>Param Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType2
	 * @generated
	 */
	public Adapter createParamType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType <em>Pre Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType
	 * @generated
	 */
	public Adapter createPreConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1 <em>Pre Conditions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1
	 * @generated
	 */
	public Adapter createPreConditionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.PrependType <em>Prepend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.PrependType
	 * @generated
	 */
	public Adapter createPrependTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType <em>Primary Key Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType
	 * @generated
	 */
	public Adapter createPrimaryKeyExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RegExpReplaceType <em>Reg Exp Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RegExpReplaceType
	 * @generated
	 */
	public Adapter createRegExpReplaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType <em>Rename Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType
	 * @generated
	 */
	public Adapter createRenameColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RenameTableType <em>Rename Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameTableType
	 * @generated
	 */
	public Adapter createRenameTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType <em>Rename View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameViewType
	 * @generated
	 */
	public Adapter createRenameViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ReplaceType <em>Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ReplaceType
	 * @generated
	 */
	public Adapter createReplaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RollbackType <em>Rollback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType
	 * @generated
	 */
	public Adapter createRollbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RowCountType <em>Row Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RowCountType
	 * @generated
	 */
	public Adapter createRowCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.RunningAsType <em>Running As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.RunningAsType
	 * @generated
	 */
	public Adapter createRunningAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType <em>Sequence Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.SequenceExistsType
	 * @generated
	 */
	public Adapter createSequenceExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.SqlCheckType <em>Sql Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlCheckType
	 * @generated
	 */
	public Adapter createSqlCheckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType <em>Sql File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType
	 * @generated
	 */
	public Adapter createSqlFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.SqlType <em>Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType
	 * @generated
	 */
	public Adapter createSqlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.StopType <em>Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.StopType
	 * @generated
	 */
	public Adapter createStopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.TableExistsType <em>Table Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.TableExistsType
	 * @generated
	 */
	public Adapter createTableExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType <em>Table Is Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.TableIsEmptyType
	 * @generated
	 */
	public Adapter createTableIsEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.TagDatabaseType <em>Tag Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.TagDatabaseType
	 * @generated
	 */
	public Adapter createTagDatabaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType
	 * @generated
	 */
	public Adapter createUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ValidCheckSumType <em>Valid Check Sum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ValidCheckSumType
	 * @generated
	 */
	public Adapter createValidCheckSumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.ViewExistsType <em>View Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.ViewExistsType
	 * @generated
	 */
	public Adapter createViewExistsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.liquibase.xml.ns.dbchangelog.WhereParamsType <em>Where Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.liquibase.xml.ns.dbchangelog.WhereParamsType
	 * @generated
	 */
	public Adapter createWhereParamsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DbchangelogAdapterFactory
