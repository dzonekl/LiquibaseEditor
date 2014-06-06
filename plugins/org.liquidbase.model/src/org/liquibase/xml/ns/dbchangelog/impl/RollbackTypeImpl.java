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

import org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType;
import org.liquibase.xml.ns.dbchangelog.AddColumnType;
import org.liquibase.xml.ns.dbchangelog.AddDefaultValueType;
import org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType;
import org.liquibase.xml.ns.dbchangelog.AddLookupTableType;
import org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType;
import org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType;
import org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType;
import org.liquibase.xml.ns.dbchangelog.AlterSequenceType;
import org.liquibase.xml.ns.dbchangelog.CreateIndexType;
import org.liquibase.xml.ns.dbchangelog.CreateProcedureType;
import org.liquibase.xml.ns.dbchangelog.CreateSequenceType;
import org.liquibase.xml.ns.dbchangelog.CreateTableType;
import org.liquibase.xml.ns.dbchangelog.CreateViewType;
import org.liquibase.xml.ns.dbchangelog.CustomChangeType;
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
import org.liquibase.xml.ns.dbchangelog.RenameColumnType;
import org.liquibase.xml.ns.dbchangelog.RenameTableType;
import org.liquibase.xml.ns.dbchangelog.RenameViewType;
import org.liquibase.xml.ns.dbchangelog.RollbackType;
import org.liquibase.xml.ns.dbchangelog.SqlFileType;
import org.liquibase.xml.ns.dbchangelog.SqlType;
import org.liquibase.xml.ns.dbchangelog.StopType;
import org.liquibase.xml.ns.dbchangelog.UpdateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rollback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getChangeSetChildren <em>Change Set Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getCreateTable <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropTable <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getCreateView <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getRenameView <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropView <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddColumn <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getCreateProcedure <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropProcedure <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getRenameTable <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getRenameColumn <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropColumn <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getMergeColumns <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getModifyDataType <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getCreateSequence <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAlterSequence <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropSequence <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getCreateIndex <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropIndex <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddNotNullConstraint <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddPrimaryKey <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropPrimaryKey <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddLookupTable <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddAutoIncrement <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddDefaultValue <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropDefaultValue <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAddUniqueConstraint <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDropUniqueConstraint <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getCustomChange <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getLoadUpdateData <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getExecuteCommand <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getChangeSetAuthor <em>Change Set Author</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getChangeSetId <em>Change Set Id</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl#getChangeSetPath <em>Change Set Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RollbackTypeImpl extends MinimalEObjectImpl.Container implements RollbackType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getChangeSetAuthor() <em>Change Set Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_SET_AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeSetAuthor() <em>Change Set Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetAuthor()
	 * @generated
	 * @ordered
	 */
	protected String changeSetAuthor = CHANGE_SET_AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeSetId() <em>Change Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_SET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeSetId() <em>Change Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetId()
	 * @generated
	 * @ordered
	 */
	protected String changeSetId = CHANGE_SET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeSetPath() <em>Change Set Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_SET_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeSetPath() <em>Change Set Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetPath()
	 * @generated
	 * @ordered
	 */
	protected String changeSetPath = CHANGE_SET_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollbackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getRollbackType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DbchangelogPackage.ROLLBACK_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeSetChildren() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getRollbackType_ChangeSetChildren());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComment() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Comment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateTableType> getCreateTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_CreateTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropTableType> getDropTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateViewType> getCreateView() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_CreateView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameViewType> getRenameView() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_RenameView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropViewType> getDropView() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsertType> getInsert() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Insert());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddColumnType> getAddColumn() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlType> getSql() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Sql());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateProcedureType> getCreateProcedure() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_CreateProcedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropProcedureType> getDropProcedure() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropProcedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlFileType> getSqlFile() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_SqlFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameTableType> getRenameTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_RenameTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameColumnType> getRenameColumn() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_RenameColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropColumnType> getDropColumn() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergeColumnsType> getMergeColumns() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_MergeColumns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyDataTypeType> getModifyDataType() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_ModifyDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateSequenceType> getCreateSequence() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_CreateSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlterSequenceType> getAlterSequence() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AlterSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropSequenceType> getDropSequence() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateIndexType> getCreateIndex() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_CreateIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropIndexType> getDropIndex() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddNotNullConstraintType> getAddNotNullConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddNotNullConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropNotNullConstraintType> getDropNotNullConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropNotNullConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddForeignKeyConstraintType> getAddForeignKeyConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddForeignKeyConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropForeignKeyConstraintType> getDropForeignKeyConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropForeignKeyConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropAllForeignKeyConstraintsType> getDropAllForeignKeyConstraints() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropAllForeignKeyConstraints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddPrimaryKeyType> getAddPrimaryKey() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddPrimaryKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropPrimaryKeyType> getDropPrimaryKey() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropPrimaryKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddLookupTableType> getAddLookupTable() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddLookupTable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddAutoIncrementType> getAddAutoIncrement() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddAutoIncrement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddDefaultValueType> getAddDefaultValue() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddDefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropDefaultValueType> getDropDefaultValue() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropDefaultValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddUniqueConstraintType> getAddUniqueConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_AddUniqueConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DropUniqueConstraintType> getDropUniqueConstraint() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_DropUniqueConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomChangeType> getCustomChange() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_CustomChange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UpdateType> getUpdate() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Update());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteType> getDelete() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Delete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadDataType> getLoadData() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_LoadData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadUpdateDataType> getLoadUpdateData() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_LoadUpdateData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecuteCommandType> getExecuteCommand() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_ExecuteCommand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopType> getStop() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackType> getRollback() {
		return getChangeSetChildren().list(DbchangelogPackage.eINSTANCE.getRollbackType_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getChangeSetChildren().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getRollbackType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeSetAuthor() {
		return changeSetAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSetAuthor(String newChangeSetAuthor) {
		String oldChangeSetAuthor = changeSetAuthor;
		changeSetAuthor = newChangeSetAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_AUTHOR, oldChangeSetAuthor, changeSetAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeSetId() {
		return changeSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSetId(String newChangeSetId) {
		String oldChangeSetId = changeSetId;
		changeSetId = newChangeSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_ID, oldChangeSetId, changeSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeSetPath() {
		return changeSetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSetPath(String newChangeSetPath) {
		String oldChangeSetPath = changeSetPath;
		changeSetPath = newChangeSetPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_PATH, oldChangeSetPath, changeSetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.ROLLBACK_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_CHILDREN:
				return ((InternalEList<?>)getChangeSetChildren()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_TABLE:
				return ((InternalEList<?>)getCreateTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_TABLE:
				return ((InternalEList<?>)getDropTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_VIEW:
				return ((InternalEList<?>)getCreateView()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_VIEW:
				return ((InternalEList<?>)getRenameView()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_VIEW:
				return ((InternalEList<?>)getDropView()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__INSERT:
				return ((InternalEList<?>)getInsert()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_COLUMN:
				return ((InternalEList<?>)getAddColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__SQL:
				return ((InternalEList<?>)getSql()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_PROCEDURE:
				return ((InternalEList<?>)getCreateProcedure()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PROCEDURE:
				return ((InternalEList<?>)getDropProcedure()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__SQL_FILE:
				return ((InternalEList<?>)getSqlFile()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_TABLE:
				return ((InternalEList<?>)getRenameTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_COLUMN:
				return ((InternalEList<?>)getRenameColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_COLUMN:
				return ((InternalEList<?>)getDropColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__MERGE_COLUMNS:
				return ((InternalEList<?>)getMergeColumns()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__MODIFY_DATA_TYPE:
				return ((InternalEList<?>)getModifyDataType()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_SEQUENCE:
				return ((InternalEList<?>)getCreateSequence()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ALTER_SEQUENCE:
				return ((InternalEList<?>)getAlterSequence()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_SEQUENCE:
				return ((InternalEList<?>)getDropSequence()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_INDEX:
				return ((InternalEList<?>)getCreateIndex()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_INDEX:
				return ((InternalEList<?>)getDropIndex()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_NOT_NULL_CONSTRAINT:
				return ((InternalEList<?>)getAddNotNullConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_NOT_NULL_CONSTRAINT:
				return ((InternalEList<?>)getDropNotNullConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				return ((InternalEList<?>)getAddForeignKeyConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				return ((InternalEList<?>)getDropForeignKeyConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return ((InternalEList<?>)getDropAllForeignKeyConstraints()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_PRIMARY_KEY:
				return ((InternalEList<?>)getAddPrimaryKey()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PRIMARY_KEY:
				return ((InternalEList<?>)getDropPrimaryKey()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_LOOKUP_TABLE:
				return ((InternalEList<?>)getAddLookupTable()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_AUTO_INCREMENT:
				return ((InternalEList<?>)getAddAutoIncrement()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_DEFAULT_VALUE:
				return ((InternalEList<?>)getAddDefaultValue()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_DEFAULT_VALUE:
				return ((InternalEList<?>)getDropDefaultValue()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_UNIQUE_CONSTRAINT:
				return ((InternalEList<?>)getAddUniqueConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_UNIQUE_CONSTRAINT:
				return ((InternalEList<?>)getDropUniqueConstraint()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__CUSTOM_CHANGE:
				return ((InternalEList<?>)getCustomChange()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__UPDATE:
				return ((InternalEList<?>)getUpdate()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_DATA:
				return ((InternalEList<?>)getLoadData()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_UPDATE_DATA:
				return ((InternalEList<?>)getLoadUpdateData()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__EXECUTE_COMMAND:
				return ((InternalEList<?>)getExecuteCommand()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ROLLBACK_TYPE__ANY:
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
			case DbchangelogPackage.ROLLBACK_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_CHILDREN:
				if (coreType) return getChangeSetChildren();
				return ((FeatureMap.Internal)getChangeSetChildren()).getWrapper();
			case DbchangelogPackage.ROLLBACK_TYPE__COMMENT:
				return getComment();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_TABLE:
				return getCreateTable();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_TABLE:
				return getDropTable();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_VIEW:
				return getCreateView();
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_VIEW:
				return getRenameView();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_VIEW:
				return getDropView();
			case DbchangelogPackage.ROLLBACK_TYPE__INSERT:
				return getInsert();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_COLUMN:
				return getAddColumn();
			case DbchangelogPackage.ROLLBACK_TYPE__SQL:
				return getSql();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_PROCEDURE:
				return getCreateProcedure();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PROCEDURE:
				return getDropProcedure();
			case DbchangelogPackage.ROLLBACK_TYPE__SQL_FILE:
				return getSqlFile();
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_TABLE:
				return getRenameTable();
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_COLUMN:
				return getRenameColumn();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_COLUMN:
				return getDropColumn();
			case DbchangelogPackage.ROLLBACK_TYPE__MERGE_COLUMNS:
				return getMergeColumns();
			case DbchangelogPackage.ROLLBACK_TYPE__MODIFY_DATA_TYPE:
				return getModifyDataType();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_SEQUENCE:
				return getCreateSequence();
			case DbchangelogPackage.ROLLBACK_TYPE__ALTER_SEQUENCE:
				return getAlterSequence();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_SEQUENCE:
				return getDropSequence();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_INDEX:
				return getCreateIndex();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_INDEX:
				return getDropIndex();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_NOT_NULL_CONSTRAINT:
				return getAddNotNullConstraint();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_NOT_NULL_CONSTRAINT:
				return getDropNotNullConstraint();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				return getAddForeignKeyConstraint();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				return getDropForeignKeyConstraint();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return getDropAllForeignKeyConstraints();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_PRIMARY_KEY:
				return getAddPrimaryKey();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PRIMARY_KEY:
				return getDropPrimaryKey();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_LOOKUP_TABLE:
				return getAddLookupTable();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_AUTO_INCREMENT:
				return getAddAutoIncrement();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_DEFAULT_VALUE:
				return getAddDefaultValue();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_DEFAULT_VALUE:
				return getDropDefaultValue();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_UNIQUE_CONSTRAINT:
				return getAddUniqueConstraint();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_UNIQUE_CONSTRAINT:
				return getDropUniqueConstraint();
			case DbchangelogPackage.ROLLBACK_TYPE__CUSTOM_CHANGE:
				return getCustomChange();
			case DbchangelogPackage.ROLLBACK_TYPE__UPDATE:
				return getUpdate();
			case DbchangelogPackage.ROLLBACK_TYPE__DELETE:
				return getDelete();
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_DATA:
				return getLoadData();
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_UPDATE_DATA:
				return getLoadUpdateData();
			case DbchangelogPackage.ROLLBACK_TYPE__EXECUTE_COMMAND:
				return getExecuteCommand();
			case DbchangelogPackage.ROLLBACK_TYPE__STOP:
				return getStop();
			case DbchangelogPackage.ROLLBACK_TYPE__ROLLBACK:
				return getRollback();
			case DbchangelogPackage.ROLLBACK_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_AUTHOR:
				return getChangeSetAuthor();
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_ID:
				return getChangeSetId();
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_PATH:
				return getChangeSetPath();
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
			case DbchangelogPackage.ROLLBACK_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_CHILDREN:
				((FeatureMap.Internal)getChangeSetChildren()).set(newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends String>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_TABLE:
				getCreateTable().clear();
				getCreateTable().addAll((Collection<? extends CreateTableType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_TABLE:
				getDropTable().clear();
				getDropTable().addAll((Collection<? extends DropTableType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_VIEW:
				getCreateView().clear();
				getCreateView().addAll((Collection<? extends CreateViewType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_VIEW:
				getRenameView().clear();
				getRenameView().addAll((Collection<? extends RenameViewType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_VIEW:
				getDropView().clear();
				getDropView().addAll((Collection<? extends DropViewType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__INSERT:
				getInsert().clear();
				getInsert().addAll((Collection<? extends InsertType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_COLUMN:
				getAddColumn().clear();
				getAddColumn().addAll((Collection<? extends AddColumnType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__SQL:
				getSql().clear();
				getSql().addAll((Collection<? extends SqlType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_PROCEDURE:
				getCreateProcedure().clear();
				getCreateProcedure().addAll((Collection<? extends CreateProcedureType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PROCEDURE:
				getDropProcedure().clear();
				getDropProcedure().addAll((Collection<? extends DropProcedureType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__SQL_FILE:
				getSqlFile().clear();
				getSqlFile().addAll((Collection<? extends SqlFileType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_TABLE:
				getRenameTable().clear();
				getRenameTable().addAll((Collection<? extends RenameTableType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_COLUMN:
				getRenameColumn().clear();
				getRenameColumn().addAll((Collection<? extends RenameColumnType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_COLUMN:
				getDropColumn().clear();
				getDropColumn().addAll((Collection<? extends DropColumnType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__MERGE_COLUMNS:
				getMergeColumns().clear();
				getMergeColumns().addAll((Collection<? extends MergeColumnsType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__MODIFY_DATA_TYPE:
				getModifyDataType().clear();
				getModifyDataType().addAll((Collection<? extends ModifyDataTypeType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_SEQUENCE:
				getCreateSequence().clear();
				getCreateSequence().addAll((Collection<? extends CreateSequenceType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ALTER_SEQUENCE:
				getAlterSequence().clear();
				getAlterSequence().addAll((Collection<? extends AlterSequenceType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_SEQUENCE:
				getDropSequence().clear();
				getDropSequence().addAll((Collection<? extends DropSequenceType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_INDEX:
				getCreateIndex().clear();
				getCreateIndex().addAll((Collection<? extends CreateIndexType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_INDEX:
				getDropIndex().clear();
				getDropIndex().addAll((Collection<? extends DropIndexType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_NOT_NULL_CONSTRAINT:
				getAddNotNullConstraint().clear();
				getAddNotNullConstraint().addAll((Collection<? extends AddNotNullConstraintType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_NOT_NULL_CONSTRAINT:
				getDropNotNullConstraint().clear();
				getDropNotNullConstraint().addAll((Collection<? extends DropNotNullConstraintType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				getAddForeignKeyConstraint().clear();
				getAddForeignKeyConstraint().addAll((Collection<? extends AddForeignKeyConstraintType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				getDropForeignKeyConstraint().clear();
				getDropForeignKeyConstraint().addAll((Collection<? extends DropForeignKeyConstraintType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				getDropAllForeignKeyConstraints().clear();
				getDropAllForeignKeyConstraints().addAll((Collection<? extends DropAllForeignKeyConstraintsType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_PRIMARY_KEY:
				getAddPrimaryKey().clear();
				getAddPrimaryKey().addAll((Collection<? extends AddPrimaryKeyType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PRIMARY_KEY:
				getDropPrimaryKey().clear();
				getDropPrimaryKey().addAll((Collection<? extends DropPrimaryKeyType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_LOOKUP_TABLE:
				getAddLookupTable().clear();
				getAddLookupTable().addAll((Collection<? extends AddLookupTableType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_AUTO_INCREMENT:
				getAddAutoIncrement().clear();
				getAddAutoIncrement().addAll((Collection<? extends AddAutoIncrementType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_DEFAULT_VALUE:
				getAddDefaultValue().clear();
				getAddDefaultValue().addAll((Collection<? extends AddDefaultValueType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_DEFAULT_VALUE:
				getDropDefaultValue().clear();
				getDropDefaultValue().addAll((Collection<? extends DropDefaultValueType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_UNIQUE_CONSTRAINT:
				getAddUniqueConstraint().clear();
				getAddUniqueConstraint().addAll((Collection<? extends AddUniqueConstraintType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_UNIQUE_CONSTRAINT:
				getDropUniqueConstraint().clear();
				getDropUniqueConstraint().addAll((Collection<? extends DropUniqueConstraintType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CUSTOM_CHANGE:
				getCustomChange().clear();
				getCustomChange().addAll((Collection<? extends CustomChangeType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__UPDATE:
				getUpdate().clear();
				getUpdate().addAll((Collection<? extends UpdateType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends DeleteType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_DATA:
				getLoadData().clear();
				getLoadData().addAll((Collection<? extends LoadDataType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_UPDATE_DATA:
				getLoadUpdateData().clear();
				getLoadUpdateData().addAll((Collection<? extends LoadUpdateDataType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__EXECUTE_COMMAND:
				getExecuteCommand().clear();
				getExecuteCommand().addAll((Collection<? extends ExecuteCommandType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackType>)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_AUTHOR:
				setChangeSetAuthor((String)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_ID:
				setChangeSetId((String)newValue);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_PATH:
				setChangeSetPath((String)newValue);
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
			case DbchangelogPackage.ROLLBACK_TYPE__MIXED:
				getMixed().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_CHILDREN:
				getChangeSetChildren().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__COMMENT:
				getComment().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_TABLE:
				getCreateTable().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_TABLE:
				getDropTable().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_VIEW:
				getCreateView().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_VIEW:
				getRenameView().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_VIEW:
				getDropView().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__INSERT:
				getInsert().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_COLUMN:
				getAddColumn().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__SQL:
				getSql().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_PROCEDURE:
				getCreateProcedure().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PROCEDURE:
				getDropProcedure().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__SQL_FILE:
				getSqlFile().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_TABLE:
				getRenameTable().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_COLUMN:
				getRenameColumn().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_COLUMN:
				getDropColumn().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__MERGE_COLUMNS:
				getMergeColumns().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__MODIFY_DATA_TYPE:
				getModifyDataType().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_SEQUENCE:
				getCreateSequence().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ALTER_SEQUENCE:
				getAlterSequence().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_SEQUENCE:
				getDropSequence().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_INDEX:
				getCreateIndex().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_INDEX:
				getDropIndex().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_NOT_NULL_CONSTRAINT:
				getAddNotNullConstraint().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_NOT_NULL_CONSTRAINT:
				getDropNotNullConstraint().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				getAddForeignKeyConstraint().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				getDropForeignKeyConstraint().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				getDropAllForeignKeyConstraints().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_PRIMARY_KEY:
				getAddPrimaryKey().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PRIMARY_KEY:
				getDropPrimaryKey().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_LOOKUP_TABLE:
				getAddLookupTable().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_AUTO_INCREMENT:
				getAddAutoIncrement().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_DEFAULT_VALUE:
				getAddDefaultValue().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_DEFAULT_VALUE:
				getDropDefaultValue().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_UNIQUE_CONSTRAINT:
				getAddUniqueConstraint().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_UNIQUE_CONSTRAINT:
				getDropUniqueConstraint().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CUSTOM_CHANGE:
				getCustomChange().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__UPDATE:
				getUpdate().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__DELETE:
				getDelete().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_DATA:
				getLoadData().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_UPDATE_DATA:
				getLoadUpdateData().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__EXECUTE_COMMAND:
				getExecuteCommand().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__STOP:
				getStop().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ROLLBACK:
				getRollback().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__ANY:
				getAny().clear();
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_AUTHOR:
				setChangeSetAuthor(CHANGE_SET_AUTHOR_EDEFAULT);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_ID:
				setChangeSetId(CHANGE_SET_ID_EDEFAULT);
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_PATH:
				setChangeSetPath(CHANGE_SET_PATH_EDEFAULT);
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
			case DbchangelogPackage.ROLLBACK_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_CHILDREN:
				return !getChangeSetChildren().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__COMMENT:
				return !getComment().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_TABLE:
				return !getCreateTable().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_TABLE:
				return !getDropTable().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_VIEW:
				return !getCreateView().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_VIEW:
				return !getRenameView().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_VIEW:
				return !getDropView().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__INSERT:
				return !getInsert().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_COLUMN:
				return !getAddColumn().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__SQL:
				return !getSql().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_PROCEDURE:
				return !getCreateProcedure().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PROCEDURE:
				return !getDropProcedure().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__SQL_FILE:
				return !getSqlFile().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_TABLE:
				return !getRenameTable().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__RENAME_COLUMN:
				return !getRenameColumn().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_COLUMN:
				return !getDropColumn().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__MERGE_COLUMNS:
				return !getMergeColumns().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__MODIFY_DATA_TYPE:
				return !getModifyDataType().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_SEQUENCE:
				return !getCreateSequence().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ALTER_SEQUENCE:
				return !getAlterSequence().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_SEQUENCE:
				return !getDropSequence().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CREATE_INDEX:
				return !getCreateIndex().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_INDEX:
				return !getDropIndex().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_NOT_NULL_CONSTRAINT:
				return !getAddNotNullConstraint().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_NOT_NULL_CONSTRAINT:
				return !getDropNotNullConstraint().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_FOREIGN_KEY_CONSTRAINT:
				return !getAddForeignKeyConstraint().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_FOREIGN_KEY_CONSTRAINT:
				return !getDropForeignKeyConstraint().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return !getDropAllForeignKeyConstraints().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_PRIMARY_KEY:
				return !getAddPrimaryKey().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_PRIMARY_KEY:
				return !getDropPrimaryKey().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_LOOKUP_TABLE:
				return !getAddLookupTable().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_AUTO_INCREMENT:
				return !getAddAutoIncrement().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_DEFAULT_VALUE:
				return !getAddDefaultValue().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_DEFAULT_VALUE:
				return !getDropDefaultValue().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ADD_UNIQUE_CONSTRAINT:
				return !getAddUniqueConstraint().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DROP_UNIQUE_CONSTRAINT:
				return !getDropUniqueConstraint().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CUSTOM_CHANGE:
				return !getCustomChange().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__UPDATE:
				return !getUpdate().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__DELETE:
				return !getDelete().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_DATA:
				return !getLoadData().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__LOAD_UPDATE_DATA:
				return !getLoadUpdateData().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__EXECUTE_COMMAND:
				return !getExecuteCommand().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__STOP:
				return !getStop().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ROLLBACK:
				return !getRollback().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__ANY:
				return !getAny().isEmpty();
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_AUTHOR:
				return CHANGE_SET_AUTHOR_EDEFAULT == null ? changeSetAuthor != null : !CHANGE_SET_AUTHOR_EDEFAULT.equals(changeSetAuthor);
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_ID:
				return CHANGE_SET_ID_EDEFAULT == null ? changeSetId != null : !CHANGE_SET_ID_EDEFAULT.equals(changeSetId);
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_PATH:
				return CHANGE_SET_PATH_EDEFAULT == null ? changeSetPath != null : !CHANGE_SET_PATH_EDEFAULT.equals(changeSetPath);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", changeSetAuthor: ");
		result.append(changeSetAuthor);
		result.append(", changeSetId: ");
		result.append(changeSetId);
		result.append(", changeSetPath: ");
		result.append(changeSetPath);
		result.append(')');
		return result.toString();
	}

} //RollbackTypeImpl
