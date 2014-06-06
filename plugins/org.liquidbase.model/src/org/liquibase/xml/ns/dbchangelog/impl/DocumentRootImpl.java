/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
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
import org.liquibase.xml.ns.dbchangelog.AndType;
import org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType;
import org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType;
import org.liquibase.xml.ns.dbchangelog.ColumnExistsType;
import org.liquibase.xml.ns.dbchangelog.ColumnType;
import org.liquibase.xml.ns.dbchangelog.ConstraintsType;
import org.liquibase.xml.ns.dbchangelog.CreateIndexType;
import org.liquibase.xml.ns.dbchangelog.CreateProcedureType;
import org.liquibase.xml.ns.dbchangelog.CreateSequenceType;
import org.liquibase.xml.ns.dbchangelog.CreateTableType;
import org.liquibase.xml.ns.dbchangelog.CreateViewType;
import org.liquibase.xml.ns.dbchangelog.CustomChangeType;
import org.liquibase.xml.ns.dbchangelog.CustomPreconditionType;
import org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DbmsType;
import org.liquibase.xml.ns.dbchangelog.DeleteType;
import org.liquibase.xml.ns.dbchangelog.DocumentRoot;
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
import org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType;
import org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType;
import org.liquibase.xml.ns.dbchangelog.IndexExistsType;
import org.liquibase.xml.ns.dbchangelog.InsertType;
import org.liquibase.xml.ns.dbchangelog.LoadDataType;
import org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType;
import org.liquibase.xml.ns.dbchangelog.MergeColumnsType;
import org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType;
import org.liquibase.xml.ns.dbchangelog.NotType;
import org.liquibase.xml.ns.dbchangelog.OrType;
import org.liquibase.xml.ns.dbchangelog.ParamType;
import org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType;
import org.liquibase.xml.ns.dbchangelog.RenameColumnType;
import org.liquibase.xml.ns.dbchangelog.RenameTableType;
import org.liquibase.xml.ns.dbchangelog.RenameViewType;
import org.liquibase.xml.ns.dbchangelog.RollbackType;
import org.liquibase.xml.ns.dbchangelog.RowCountType;
import org.liquibase.xml.ns.dbchangelog.RunningAsType;
import org.liquibase.xml.ns.dbchangelog.SequenceExistsType;
import org.liquibase.xml.ns.dbchangelog.SqlCheckType;
import org.liquibase.xml.ns.dbchangelog.SqlFileType;
import org.liquibase.xml.ns.dbchangelog.SqlType;
import org.liquibase.xml.ns.dbchangelog.StopType;
import org.liquibase.xml.ns.dbchangelog.TableExistsType;
import org.liquibase.xml.ns.dbchangelog.TableIsEmptyType;
import org.liquibase.xml.ns.dbchangelog.TagDatabaseType;
import org.liquibase.xml.ns.dbchangelog.UpdateType;
import org.liquibase.xml.ns.dbchangelog.ViewExistsType;
import org.liquibase.xml.ns.dbchangelog.WhereParamsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddAutoIncrement <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddColumn <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddDefaultValue <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddLookupTable <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddNotNullConstraint <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddPrimaryKey <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAddUniqueConstraint <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAlterSequence <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getChangeSetExecuted <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getColumnExists <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCreateIndex <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCreateProcedure <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCreateSequence <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCreateTable <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCreateView <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCustomChange <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getCustomPrecondition <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDatabaseChangeLog <em>Database Change Log</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropColumn <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropDefaultValue <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropIndex <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropPrimaryKey <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropProcedure <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropSequence <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropTable <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropUniqueConstraint <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getDropView <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getExecuteCommand <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getIndexExists <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getLoadUpdateData <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getMergeColumns <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getModifyDataType <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getPrimaryKeyExists <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getRenameColumn <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getRenameTable <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getRenameView <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getRunningAs <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getSequenceExists <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getSqlCheck <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getTableExists <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getTableIsEmpty <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getTagDatabase <em>Tag Database</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getViewExists <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl#getWhereParams <em>Where Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DbchangelogPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DbchangelogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DbchangelogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAutoIncrementType getAddAutoIncrement() {
		return (AddAutoIncrementType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddAutoIncrement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddAutoIncrement(AddAutoIncrementType newAddAutoIncrement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddAutoIncrement(), newAddAutoIncrement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddAutoIncrement(AddAutoIncrementType newAddAutoIncrement) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddAutoIncrement(), newAddAutoIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddColumnType getAddColumn() {
		return (AddColumnType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddColumn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddColumn(AddColumnType newAddColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddColumn(), newAddColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddColumn(AddColumnType newAddColumn) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddColumn(), newAddColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddDefaultValueType getAddDefaultValue() {
		return (AddDefaultValueType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddDefaultValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddDefaultValue(AddDefaultValueType newAddDefaultValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddDefaultValue(), newAddDefaultValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddDefaultValue(AddDefaultValueType newAddDefaultValue) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddDefaultValue(), newAddDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddForeignKeyConstraintType getAddForeignKeyConstraint() {
		return (AddForeignKeyConstraintType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddForeignKeyConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddForeignKeyConstraint(AddForeignKeyConstraintType newAddForeignKeyConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddForeignKeyConstraint(), newAddForeignKeyConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddForeignKeyConstraint(AddForeignKeyConstraintType newAddForeignKeyConstraint) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddForeignKeyConstraint(), newAddForeignKeyConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddLookupTableType getAddLookupTable() {
		return (AddLookupTableType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddLookupTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddLookupTable(AddLookupTableType newAddLookupTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddLookupTable(), newAddLookupTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddLookupTable(AddLookupTableType newAddLookupTable) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddLookupTable(), newAddLookupTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNotNullConstraintType getAddNotNullConstraint() {
		return (AddNotNullConstraintType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddNotNullConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddNotNullConstraint(AddNotNullConstraintType newAddNotNullConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddNotNullConstraint(), newAddNotNullConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNotNullConstraint(AddNotNullConstraintType newAddNotNullConstraint) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddNotNullConstraint(), newAddNotNullConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimaryKeyType getAddPrimaryKey() {
		return (AddPrimaryKeyType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddPrimaryKey(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddPrimaryKey(AddPrimaryKeyType newAddPrimaryKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddPrimaryKey(), newAddPrimaryKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddPrimaryKey(AddPrimaryKeyType newAddPrimaryKey) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddPrimaryKey(), newAddPrimaryKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddUniqueConstraintType getAddUniqueConstraint() {
		return (AddUniqueConstraintType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddUniqueConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddUniqueConstraint(AddUniqueConstraintType newAddUniqueConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddUniqueConstraint(), newAddUniqueConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddUniqueConstraint(AddUniqueConstraintType newAddUniqueConstraint) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddUniqueConstraint(), newAddUniqueConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlterSequenceType getAlterSequence() {
		return (AlterSequenceType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_AlterSequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlterSequence(AlterSequenceType newAlterSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_AlterSequence(), newAlterSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlterSequence(AlterSequenceType newAlterSequence) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_AlterSequence(), newAlterSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndType getAnd() {
		return (AndType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_And(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(AndType newAnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_And(), newAnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(AndType newAnd) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_And(), newAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLogPropertyDefinedType getChangeLogPropertyDefined() {
		return (ChangeLogPropertyDefinedType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeLogPropertyDefined(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogPropertyDefined(ChangeLogPropertyDefinedType newChangeLogPropertyDefined, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeLogPropertyDefined(), newChangeLogPropertyDefined, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogPropertyDefined(ChangeLogPropertyDefinedType newChangeLogPropertyDefined) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeLogPropertyDefined(), newChangeLogPropertyDefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSetExecutedType getChangeSetExecuted() {
		return (ChangeSetExecutedType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeSetExecuted(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeSetExecuted(ChangeSetExecutedType newChangeSetExecuted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeSetExecuted(), newChangeSetExecuted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSetExecuted(ChangeSetExecutedType newChangeSetExecuted) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeSetExecuted(), newChangeSetExecuted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType getColumn() {
		return (ColumnType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Column(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(ColumnType newColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Column(), newColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(ColumnType newColumn) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Column(), newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnExistsType getColumnExists() {
		return (ColumnExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ColumnExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnExists(ColumnExistsType newColumnExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ColumnExists(), newColumnExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnExists(ColumnExistsType newColumnExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ColumnExists(), newColumnExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Comment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Comment(), newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType getConstraints() {
		return (ConstraintsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Constraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Constraints(), newConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType newConstraints) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Constraints(), newConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateIndexType getCreateIndex() {
		return (CreateIndexType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateIndex(CreateIndexType newCreateIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateIndex(), newCreateIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateIndex(CreateIndexType newCreateIndex) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateIndex(), newCreateIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateProcedureType getCreateProcedure() {
		return (CreateProcedureType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateProcedure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateProcedure(CreateProcedureType newCreateProcedure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateProcedure(), newCreateProcedure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateProcedure(CreateProcedureType newCreateProcedure) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateProcedure(), newCreateProcedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSequenceType getCreateSequence() {
		return (CreateSequenceType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateSequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSequence(CreateSequenceType newCreateSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateSequence(), newCreateSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSequence(CreateSequenceType newCreateSequence) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateSequence(), newCreateSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTableType getCreateTable() {
		return (CreateTableType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateTable(CreateTableType newCreateTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateTable(), newCreateTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateTable(CreateTableType newCreateTable) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateTable(), newCreateTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateViewType getCreateView() {
		return (CreateViewType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateView(CreateViewType newCreateView, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateView(), newCreateView, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateView(CreateViewType newCreateView) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateView(), newCreateView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomChangeType getCustomChange() {
		return (CustomChangeType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomChange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomChange(CustomChangeType newCustomChange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomChange(), newCustomChange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomChange(CustomChangeType newCustomChange) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomChange(), newCustomChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPreconditionType getCustomPrecondition() {
		return (CustomPreconditionType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomPrecondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomPrecondition(CustomPreconditionType newCustomPrecondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomPrecondition(), newCustomPrecondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomPrecondition(CustomPreconditionType newCustomPrecondition) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomPrecondition(), newCustomPrecondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseChangeLogType getDatabaseChangeLog() {
		return (DatabaseChangeLogType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DatabaseChangeLog(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseChangeLog(DatabaseChangeLogType newDatabaseChangeLog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DatabaseChangeLog(), newDatabaseChangeLog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseChangeLog(DatabaseChangeLogType newDatabaseChangeLog) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DatabaseChangeLog(), newDatabaseChangeLog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbmsType getDbms() {
		return (DbmsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Dbms(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbms(DbmsType newDbms, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Dbms(), newDbms, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbms(DbmsType newDbms) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Dbms(), newDbms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteType getDelete() {
		return (DeleteType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Delete(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(DeleteType newDelete, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Delete(), newDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(DeleteType newDelete) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Delete(), newDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropAllForeignKeyConstraintsType getDropAllForeignKeyConstraints() {
		return (DropAllForeignKeyConstraintsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropAllForeignKeyConstraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropAllForeignKeyConstraints(DropAllForeignKeyConstraintsType newDropAllForeignKeyConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropAllForeignKeyConstraints(), newDropAllForeignKeyConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropAllForeignKeyConstraints(DropAllForeignKeyConstraintsType newDropAllForeignKeyConstraints) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropAllForeignKeyConstraints(), newDropAllForeignKeyConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropColumnType getDropColumn() {
		return (DropColumnType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropColumn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropColumn(DropColumnType newDropColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropColumn(), newDropColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropColumn(DropColumnType newDropColumn) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropColumn(), newDropColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDefaultValueType getDropDefaultValue() {
		return (DropDefaultValueType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropDefaultValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropDefaultValue(DropDefaultValueType newDropDefaultValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropDefaultValue(), newDropDefaultValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropDefaultValue(DropDefaultValueType newDropDefaultValue) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropDefaultValue(), newDropDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropForeignKeyConstraintType getDropForeignKeyConstraint() {
		return (DropForeignKeyConstraintType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropForeignKeyConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropForeignKeyConstraint(DropForeignKeyConstraintType newDropForeignKeyConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropForeignKeyConstraint(), newDropForeignKeyConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropForeignKeyConstraint(DropForeignKeyConstraintType newDropForeignKeyConstraint) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropForeignKeyConstraint(), newDropForeignKeyConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropIndexType getDropIndex() {
		return (DropIndexType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropIndex(DropIndexType newDropIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropIndex(), newDropIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropIndex(DropIndexType newDropIndex) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropIndex(), newDropIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropNotNullConstraintType getDropNotNullConstraint() {
		return (DropNotNullConstraintType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropNotNullConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropNotNullConstraint(DropNotNullConstraintType newDropNotNullConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropNotNullConstraint(), newDropNotNullConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropNotNullConstraint(DropNotNullConstraintType newDropNotNullConstraint) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropNotNullConstraint(), newDropNotNullConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropPrimaryKeyType getDropPrimaryKey() {
		return (DropPrimaryKeyType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropPrimaryKey(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropPrimaryKey(DropPrimaryKeyType newDropPrimaryKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropPrimaryKey(), newDropPrimaryKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropPrimaryKey(DropPrimaryKeyType newDropPrimaryKey) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropPrimaryKey(), newDropPrimaryKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropProcedureType getDropProcedure() {
		return (DropProcedureType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropProcedure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropProcedure(DropProcedureType newDropProcedure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropProcedure(), newDropProcedure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropProcedure(DropProcedureType newDropProcedure) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropProcedure(), newDropProcedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropSequenceType getDropSequence() {
		return (DropSequenceType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropSequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropSequence(DropSequenceType newDropSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropSequence(), newDropSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropSequence(DropSequenceType newDropSequence) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropSequence(), newDropSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropTableType getDropTable() {
		return (DropTableType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropTable(DropTableType newDropTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropTable(), newDropTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropTable(DropTableType newDropTable) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropTable(), newDropTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropUniqueConstraintType getDropUniqueConstraint() {
		return (DropUniqueConstraintType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropUniqueConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropUniqueConstraint(DropUniqueConstraintType newDropUniqueConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropUniqueConstraint(), newDropUniqueConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropUniqueConstraint(DropUniqueConstraintType newDropUniqueConstraint) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropUniqueConstraint(), newDropUniqueConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropViewType getDropView() {
		return (DropViewType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropView(DropViewType newDropView, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropView(), newDropView, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropView(DropViewType newDropView) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropView(), newDropView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteCommandType getExecuteCommand() {
		return (ExecuteCommandType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExecuteCommand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecuteCommand(ExecuteCommandType newExecuteCommand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExecuteCommand(), newExecuteCommand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteCommand(ExecuteCommandType newExecuteCommand) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExecuteCommand(), newExecuteCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedQuotingStrategyType getExpectedQuotingStrategy() {
		return (ExpectedQuotingStrategyType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExpectedQuotingStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedQuotingStrategy(ExpectedQuotingStrategyType newExpectedQuotingStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExpectedQuotingStrategy(), newExpectedQuotingStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedQuotingStrategy(ExpectedQuotingStrategyType newExpectedQuotingStrategy) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExpectedQuotingStrategy(), newExpectedQuotingStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyConstraintExistsType getForeignKeyConstraintExists() {
		return (ForeignKeyConstraintExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ForeignKeyConstraintExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKeyConstraintExists(ForeignKeyConstraintExistsType newForeignKeyConstraintExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ForeignKeyConstraintExists(), newForeignKeyConstraintExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyConstraintExists(ForeignKeyConstraintExistsType newForeignKeyConstraintExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ForeignKeyConstraintExists(), newForeignKeyConstraintExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexExistsType getIndexExists() {
		return (IndexExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_IndexExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexExists(IndexExistsType newIndexExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_IndexExists(), newIndexExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexExists(IndexExistsType newIndexExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_IndexExists(), newIndexExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertType getInsert() {
		return (InsertType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Insert(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsert(InsertType newInsert, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Insert(), newInsert, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(InsertType newInsert) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Insert(), newInsert);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadDataType getLoadData() {
		return (LoadDataType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadData(LoadDataType newLoadData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadData(), newLoadData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadData(LoadDataType newLoadData) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadData(), newLoadData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadUpdateDataType getLoadUpdateData() {
		return (LoadUpdateDataType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadUpdateData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadUpdateData(LoadUpdateDataType newLoadUpdateData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadUpdateData(), newLoadUpdateData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadUpdateData(LoadUpdateDataType newLoadUpdateData) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadUpdateData(), newLoadUpdateData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeColumnsType getMergeColumns() {
		return (MergeColumnsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_MergeColumns(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMergeColumns(MergeColumnsType newMergeColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_MergeColumns(), newMergeColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeColumns(MergeColumnsType newMergeColumns) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_MergeColumns(), newMergeColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyDataTypeType getModifyDataType() {
		return (ModifyDataTypeType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ModifyDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifyDataType(ModifyDataTypeType newModifyDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ModifyDataType(), newModifyDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyDataType(ModifyDataTypeType newModifyDataType) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ModifyDataType(), newModifyDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotType getNot() {
		return (NotType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Not(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(NotType newNot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Not(), newNot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(NotType newNot) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Not(), newNot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrType getOr() {
		return (OrType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Or(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(OrType newOr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Or(), newOr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(OrType newOr) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Or(), newOr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType getParam() {
		return (ParamType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Param(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam(ParamType newParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Param(), newParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(ParamType newParam) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Param(), newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyExistsType getPrimaryKeyExists() {
		return (PrimaryKeyExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_PrimaryKeyExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKeyExists(PrimaryKeyExistsType newPrimaryKeyExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_PrimaryKeyExists(), newPrimaryKeyExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyExists(PrimaryKeyExistsType newPrimaryKeyExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_PrimaryKeyExists(), newPrimaryKeyExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameColumnType getRenameColumn() {
		return (RenameColumnType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameColumn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenameColumn(RenameColumnType newRenameColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameColumn(), newRenameColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenameColumn(RenameColumnType newRenameColumn) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameColumn(), newRenameColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameTableType getRenameTable() {
		return (RenameTableType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenameTable(RenameTableType newRenameTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameTable(), newRenameTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenameTable(RenameTableType newRenameTable) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameTable(), newRenameTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameViewType getRenameView() {
		return (RenameViewType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenameView(RenameViewType newRenameView, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameView(), newRenameView, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenameView(RenameViewType newRenameView) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameView(), newRenameView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackType getRollback() {
		return (RollbackType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Rollback(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollback(RollbackType newRollback, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Rollback(), newRollback, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollback(RollbackType newRollback) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Rollback(), newRollback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCountType getRowCount() {
		return (RowCountType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_RowCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowCount(RowCountType newRowCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_RowCount(), newRowCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowCount(RowCountType newRowCount) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_RowCount(), newRowCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningAsType getRunningAs() {
		return (RunningAsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_RunningAs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunningAs(RunningAsType newRunningAs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_RunningAs(), newRunningAs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningAs(RunningAsType newRunningAs) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_RunningAs(), newRunningAs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceExistsType getSequenceExists() {
		return (SequenceExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_SequenceExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceExists(SequenceExistsType newSequenceExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_SequenceExists(), newSequenceExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceExists(SequenceExistsType newSequenceExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_SequenceExists(), newSequenceExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlType getSql() {
		return (SqlType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Sql(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSql(SqlType newSql, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Sql(), newSql, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSql(SqlType newSql) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Sql(), newSql);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlCheckType getSqlCheck() {
		return (SqlCheckType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlCheck(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlCheck(SqlCheckType newSqlCheck, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlCheck(), newSqlCheck, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlCheck(SqlCheckType newSqlCheck) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlCheck(), newSqlCheck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFileType getSqlFile() {
		return (SqlFileType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlFile(SqlFileType newSqlFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlFile(), newSqlFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlFile(SqlFileType newSqlFile) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlFile(), newSqlFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopType getStop() {
		return (StopType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Stop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(StopType newStop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Stop(), newStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(StopType newStop) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Stop(), newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableExistsType getTableExists() {
		return (TableExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableExists(TableExistsType newTableExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableExists(), newTableExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableExists(TableExistsType newTableExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableExists(), newTableExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIsEmptyType getTableIsEmpty() {
		return (TableIsEmptyType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableIsEmpty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableIsEmpty(TableIsEmptyType newTableIsEmpty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableIsEmpty(), newTableIsEmpty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableIsEmpty(TableIsEmptyType newTableIsEmpty) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableIsEmpty(), newTableIsEmpty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDatabaseType getTagDatabase() {
		return (TagDatabaseType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_TagDatabase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTagDatabase(TagDatabaseType newTagDatabase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_TagDatabase(), newTagDatabase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagDatabase(TagDatabaseType newTagDatabase) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_TagDatabase(), newTagDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType getUpdate() {
		return (UpdateType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_Update(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateType newUpdate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_Update(), newUpdate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(UpdateType newUpdate) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_Update(), newUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewExistsType getViewExists() {
		return (ViewExistsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_ViewExists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewExists(ViewExistsType newViewExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_ViewExists(), newViewExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewExists(ViewExistsType newViewExists) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_ViewExists(), newViewExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereParamsType getWhereParams() {
		return (WhereParamsType)getMixed().get(DbchangelogPackage.eINSTANCE.getDocumentRoot_WhereParams(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereParams(WhereParamsType newWhereParams, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getDocumentRoot_WhereParams(), newWhereParams, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereParams(WhereParamsType newWhereParams) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getDocumentRoot_WhereParams(), newWhereParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_AUTO_INCREMENT:
				return basicSetAddAutoIncrement(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_COLUMN:
				return basicSetAddColumn(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_DEFAULT_VALUE:
				return basicSetAddDefaultValue(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT:
				return basicSetAddForeignKeyConstraint(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_LOOKUP_TABLE:
				return basicSetAddLookupTable(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT:
				return basicSetAddNotNullConstraint(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_PRIMARY_KEY:
				return basicSetAddPrimaryKey(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT:
				return basicSetAddUniqueConstraint(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ALTER_SEQUENCE:
				return basicSetAlterSequence(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__AND:
				return basicSetAnd(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED:
				return basicSetChangeLogPropertyDefined(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_SET_EXECUTED:
				return basicSetChangeSetExecuted(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN:
				return basicSetColumn(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN_EXISTS:
				return basicSetColumnExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_INDEX:
				return basicSetCreateIndex(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_PROCEDURE:
				return basicSetCreateProcedure(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_SEQUENCE:
				return basicSetCreateSequence(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_TABLE:
				return basicSetCreateTable(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_VIEW:
				return basicSetCreateView(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_CHANGE:
				return basicSetCustomChange(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_PRECONDITION:
				return basicSetCustomPrecondition(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DATABASE_CHANGE_LOG:
				return basicSetDatabaseChangeLog(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DBMS:
				return basicSetDbms(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DELETE:
				return basicSetDelete(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return basicSetDropAllForeignKeyConstraints(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_COLUMN:
				return basicSetDropColumn(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_DEFAULT_VALUE:
				return basicSetDropDefaultValue(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT:
				return basicSetDropForeignKeyConstraint(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_INDEX:
				return basicSetDropIndex(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT:
				return basicSetDropNotNullConstraint(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PRIMARY_KEY:
				return basicSetDropPrimaryKey(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PROCEDURE:
				return basicSetDropProcedure(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_SEQUENCE:
				return basicSetDropSequence(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_TABLE:
				return basicSetDropTable(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT:
				return basicSetDropUniqueConstraint(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_VIEW:
				return basicSetDropView(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__EXECUTE_COMMAND:
				return basicSetExecuteCommand(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY:
				return basicSetExpectedQuotingStrategy(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return basicSetForeignKeyConstraintExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__INDEX_EXISTS:
				return basicSetIndexExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__INSERT:
				return basicSetInsert(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_DATA:
				return basicSetLoadData(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_UPDATE_DATA:
				return basicSetLoadUpdateData(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__MERGE_COLUMNS:
				return basicSetMergeColumns(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__MODIFY_DATA_TYPE:
				return basicSetModifyDataType(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__NOT:
				return basicSetNot(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__OR:
				return basicSetOr(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__PARAM:
				return basicSetParam(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__PRIMARY_KEY_EXISTS:
				return basicSetPrimaryKeyExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_COLUMN:
				return basicSetRenameColumn(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_TABLE:
				return basicSetRenameTable(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_VIEW:
				return basicSetRenameView(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ROLLBACK:
				return basicSetRollback(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__ROW_COUNT:
				return basicSetRowCount(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__RUNNING_AS:
				return basicSetRunningAs(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__SEQUENCE_EXISTS:
				return basicSetSequenceExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__SQL:
				return basicSetSql(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_CHECK:
				return basicSetSqlCheck(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_FILE:
				return basicSetSqlFile(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__STOP:
				return basicSetStop(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_EXISTS:
				return basicSetTableExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_IS_EMPTY:
				return basicSetTableIsEmpty(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__TAG_DATABASE:
				return basicSetTagDatabase(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__UPDATE:
				return basicSetUpdate(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__VIEW_EXISTS:
				return basicSetViewExists(null, msgs);
			case DbchangelogPackage.DOCUMENT_ROOT__WHERE_PARAMS:
				return basicSetWhereParams(null, msgs);
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
			case DbchangelogPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DbchangelogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DbchangelogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_AUTO_INCREMENT:
				return getAddAutoIncrement();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_COLUMN:
				return getAddColumn();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_DEFAULT_VALUE:
				return getAddDefaultValue();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT:
				return getAddForeignKeyConstraint();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_LOOKUP_TABLE:
				return getAddLookupTable();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT:
				return getAddNotNullConstraint();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_PRIMARY_KEY:
				return getAddPrimaryKey();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT:
				return getAddUniqueConstraint();
			case DbchangelogPackage.DOCUMENT_ROOT__ALTER_SEQUENCE:
				return getAlterSequence();
			case DbchangelogPackage.DOCUMENT_ROOT__AND:
				return getAnd();
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED:
				return getChangeLogPropertyDefined();
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_SET_EXECUTED:
				return getChangeSetExecuted();
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN:
				return getColumn();
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN_EXISTS:
				return getColumnExists();
			case DbchangelogPackage.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case DbchangelogPackage.DOCUMENT_ROOT__CONSTRAINTS:
				return getConstraints();
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_INDEX:
				return getCreateIndex();
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_PROCEDURE:
				return getCreateProcedure();
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_SEQUENCE:
				return getCreateSequence();
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_TABLE:
				return getCreateTable();
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_VIEW:
				return getCreateView();
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_CHANGE:
				return getCustomChange();
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_PRECONDITION:
				return getCustomPrecondition();
			case DbchangelogPackage.DOCUMENT_ROOT__DATABASE_CHANGE_LOG:
				return getDatabaseChangeLog();
			case DbchangelogPackage.DOCUMENT_ROOT__DBMS:
				return getDbms();
			case DbchangelogPackage.DOCUMENT_ROOT__DELETE:
				return getDelete();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return getDropAllForeignKeyConstraints();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_COLUMN:
				return getDropColumn();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_DEFAULT_VALUE:
				return getDropDefaultValue();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT:
				return getDropForeignKeyConstraint();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_INDEX:
				return getDropIndex();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT:
				return getDropNotNullConstraint();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PRIMARY_KEY:
				return getDropPrimaryKey();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PROCEDURE:
				return getDropProcedure();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_SEQUENCE:
				return getDropSequence();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_TABLE:
				return getDropTable();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT:
				return getDropUniqueConstraint();
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_VIEW:
				return getDropView();
			case DbchangelogPackage.DOCUMENT_ROOT__EXECUTE_COMMAND:
				return getExecuteCommand();
			case DbchangelogPackage.DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY:
				return getExpectedQuotingStrategy();
			case DbchangelogPackage.DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return getForeignKeyConstraintExists();
			case DbchangelogPackage.DOCUMENT_ROOT__INDEX_EXISTS:
				return getIndexExists();
			case DbchangelogPackage.DOCUMENT_ROOT__INSERT:
				return getInsert();
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_DATA:
				return getLoadData();
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_UPDATE_DATA:
				return getLoadUpdateData();
			case DbchangelogPackage.DOCUMENT_ROOT__MERGE_COLUMNS:
				return getMergeColumns();
			case DbchangelogPackage.DOCUMENT_ROOT__MODIFY_DATA_TYPE:
				return getModifyDataType();
			case DbchangelogPackage.DOCUMENT_ROOT__NOT:
				return getNot();
			case DbchangelogPackage.DOCUMENT_ROOT__OR:
				return getOr();
			case DbchangelogPackage.DOCUMENT_ROOT__PARAM:
				return getParam();
			case DbchangelogPackage.DOCUMENT_ROOT__PRIMARY_KEY_EXISTS:
				return getPrimaryKeyExists();
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_COLUMN:
				return getRenameColumn();
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_TABLE:
				return getRenameTable();
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_VIEW:
				return getRenameView();
			case DbchangelogPackage.DOCUMENT_ROOT__ROLLBACK:
				return getRollback();
			case DbchangelogPackage.DOCUMENT_ROOT__ROW_COUNT:
				return getRowCount();
			case DbchangelogPackage.DOCUMENT_ROOT__RUNNING_AS:
				return getRunningAs();
			case DbchangelogPackage.DOCUMENT_ROOT__SEQUENCE_EXISTS:
				return getSequenceExists();
			case DbchangelogPackage.DOCUMENT_ROOT__SQL:
				return getSql();
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_CHECK:
				return getSqlCheck();
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_FILE:
				return getSqlFile();
			case DbchangelogPackage.DOCUMENT_ROOT__STOP:
				return getStop();
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_EXISTS:
				return getTableExists();
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_IS_EMPTY:
				return getTableIsEmpty();
			case DbchangelogPackage.DOCUMENT_ROOT__TAG_DATABASE:
				return getTagDatabase();
			case DbchangelogPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate();
			case DbchangelogPackage.DOCUMENT_ROOT__VIEW_EXISTS:
				return getViewExists();
			case DbchangelogPackage.DOCUMENT_ROOT__WHERE_PARAMS:
				return getWhereParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbchangelogPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_AUTO_INCREMENT:
				setAddAutoIncrement((AddAutoIncrementType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_COLUMN:
				setAddColumn((AddColumnType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_DEFAULT_VALUE:
				setAddDefaultValue((AddDefaultValueType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT:
				setAddForeignKeyConstraint((AddForeignKeyConstraintType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_LOOKUP_TABLE:
				setAddLookupTable((AddLookupTableType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT:
				setAddNotNullConstraint((AddNotNullConstraintType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_PRIMARY_KEY:
				setAddPrimaryKey((AddPrimaryKeyType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT:
				setAddUniqueConstraint((AddUniqueConstraintType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ALTER_SEQUENCE:
				setAlterSequence((AlterSequenceType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__AND:
				setAnd((AndType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED:
				setChangeLogPropertyDefined((ChangeLogPropertyDefinedType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_SET_EXECUTED:
				setChangeSetExecuted((ChangeSetExecutedType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN:
				setColumn((ColumnType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN_EXISTS:
				setColumnExists((ColumnExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__COMMENT:
				setComment((String)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CONSTRAINTS:
				setConstraints((ConstraintsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_INDEX:
				setCreateIndex((CreateIndexType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_PROCEDURE:
				setCreateProcedure((CreateProcedureType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_SEQUENCE:
				setCreateSequence((CreateSequenceType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_TABLE:
				setCreateTable((CreateTableType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_VIEW:
				setCreateView((CreateViewType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_CHANGE:
				setCustomChange((CustomChangeType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_PRECONDITION:
				setCustomPrecondition((CustomPreconditionType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DATABASE_CHANGE_LOG:
				setDatabaseChangeLog((DatabaseChangeLogType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DBMS:
				setDbms((DbmsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				setDropAllForeignKeyConstraints((DropAllForeignKeyConstraintsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_COLUMN:
				setDropColumn((DropColumnType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_DEFAULT_VALUE:
				setDropDefaultValue((DropDefaultValueType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT:
				setDropForeignKeyConstraint((DropForeignKeyConstraintType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_INDEX:
				setDropIndex((DropIndexType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT:
				setDropNotNullConstraint((DropNotNullConstraintType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PRIMARY_KEY:
				setDropPrimaryKey((DropPrimaryKeyType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PROCEDURE:
				setDropProcedure((DropProcedureType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_SEQUENCE:
				setDropSequence((DropSequenceType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_TABLE:
				setDropTable((DropTableType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT:
				setDropUniqueConstraint((DropUniqueConstraintType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_VIEW:
				setDropView((DropViewType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__EXECUTE_COMMAND:
				setExecuteCommand((ExecuteCommandType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY:
				setExpectedQuotingStrategy((ExpectedQuotingStrategyType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS:
				setForeignKeyConstraintExists((ForeignKeyConstraintExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__INDEX_EXISTS:
				setIndexExists((IndexExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__INSERT:
				setInsert((InsertType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_DATA:
				setLoadData((LoadDataType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_UPDATE_DATA:
				setLoadUpdateData((LoadUpdateDataType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__MERGE_COLUMNS:
				setMergeColumns((MergeColumnsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__MODIFY_DATA_TYPE:
				setModifyDataType((ModifyDataTypeType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__NOT:
				setNot((NotType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__OR:
				setOr((OrType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__PRIMARY_KEY_EXISTS:
				setPrimaryKeyExists((PrimaryKeyExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_COLUMN:
				setRenameColumn((RenameColumnType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_TABLE:
				setRenameTable((RenameTableType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_VIEW:
				setRenameView((RenameViewType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ROLLBACK:
				setRollback((RollbackType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ROW_COUNT:
				setRowCount((RowCountType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RUNNING_AS:
				setRunningAs((RunningAsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SEQUENCE_EXISTS:
				setSequenceExists((SequenceExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL:
				setSql((SqlType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_CHECK:
				setSqlCheck((SqlCheckType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_FILE:
				setSqlFile((SqlFileType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__STOP:
				setStop((StopType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_EXISTS:
				setTableExists((TableExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_IS_EMPTY:
				setTableIsEmpty((TableIsEmptyType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__TAG_DATABASE:
				setTagDatabase((TagDatabaseType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__VIEW_EXISTS:
				setViewExists((ViewExistsType)newValue);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__WHERE_PARAMS:
				setWhereParams((WhereParamsType)newValue);
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
			case DbchangelogPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_AUTO_INCREMENT:
				setAddAutoIncrement((AddAutoIncrementType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_COLUMN:
				setAddColumn((AddColumnType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_DEFAULT_VALUE:
				setAddDefaultValue((AddDefaultValueType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT:
				setAddForeignKeyConstraint((AddForeignKeyConstraintType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_LOOKUP_TABLE:
				setAddLookupTable((AddLookupTableType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT:
				setAddNotNullConstraint((AddNotNullConstraintType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_PRIMARY_KEY:
				setAddPrimaryKey((AddPrimaryKeyType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT:
				setAddUniqueConstraint((AddUniqueConstraintType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ALTER_SEQUENCE:
				setAlterSequence((AlterSequenceType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__AND:
				setAnd((AndType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED:
				setChangeLogPropertyDefined((ChangeLogPropertyDefinedType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_SET_EXECUTED:
				setChangeSetExecuted((ChangeSetExecutedType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN:
				setColumn((ColumnType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN_EXISTS:
				setColumnExists((ColumnExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CONSTRAINTS:
				setConstraints((ConstraintsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_INDEX:
				setCreateIndex((CreateIndexType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_PROCEDURE:
				setCreateProcedure((CreateProcedureType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_SEQUENCE:
				setCreateSequence((CreateSequenceType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_TABLE:
				setCreateTable((CreateTableType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_VIEW:
				setCreateView((CreateViewType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_CHANGE:
				setCustomChange((CustomChangeType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_PRECONDITION:
				setCustomPrecondition((CustomPreconditionType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DATABASE_CHANGE_LOG:
				setDatabaseChangeLog((DatabaseChangeLogType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DBMS:
				setDbms((DbmsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				setDropAllForeignKeyConstraints((DropAllForeignKeyConstraintsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_COLUMN:
				setDropColumn((DropColumnType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_DEFAULT_VALUE:
				setDropDefaultValue((DropDefaultValueType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT:
				setDropForeignKeyConstraint((DropForeignKeyConstraintType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_INDEX:
				setDropIndex((DropIndexType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT:
				setDropNotNullConstraint((DropNotNullConstraintType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PRIMARY_KEY:
				setDropPrimaryKey((DropPrimaryKeyType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PROCEDURE:
				setDropProcedure((DropProcedureType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_SEQUENCE:
				setDropSequence((DropSequenceType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_TABLE:
				setDropTable((DropTableType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT:
				setDropUniqueConstraint((DropUniqueConstraintType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_VIEW:
				setDropView((DropViewType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__EXECUTE_COMMAND:
				setExecuteCommand((ExecuteCommandType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY:
				setExpectedQuotingStrategy((ExpectedQuotingStrategyType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS:
				setForeignKeyConstraintExists((ForeignKeyConstraintExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__INDEX_EXISTS:
				setIndexExists((IndexExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__INSERT:
				setInsert((InsertType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_DATA:
				setLoadData((LoadDataType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_UPDATE_DATA:
				setLoadUpdateData((LoadUpdateDataType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__MERGE_COLUMNS:
				setMergeColumns((MergeColumnsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__MODIFY_DATA_TYPE:
				setModifyDataType((ModifyDataTypeType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__NOT:
				setNot((NotType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__OR:
				setOr((OrType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__PRIMARY_KEY_EXISTS:
				setPrimaryKeyExists((PrimaryKeyExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_COLUMN:
				setRenameColumn((RenameColumnType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_TABLE:
				setRenameTable((RenameTableType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_VIEW:
				setRenameView((RenameViewType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ROLLBACK:
				setRollback((RollbackType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ROW_COUNT:
				setRowCount((RowCountType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__RUNNING_AS:
				setRunningAs((RunningAsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SEQUENCE_EXISTS:
				setSequenceExists((SequenceExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL:
				setSql((SqlType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_CHECK:
				setSqlCheck((SqlCheckType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_FILE:
				setSqlFile((SqlFileType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__STOP:
				setStop((StopType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_EXISTS:
				setTableExists((TableExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_IS_EMPTY:
				setTableIsEmpty((TableIsEmptyType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__TAG_DATABASE:
				setTagDatabase((TagDatabaseType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__VIEW_EXISTS:
				setViewExists((ViewExistsType)null);
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__WHERE_PARAMS:
				setWhereParams((WhereParamsType)null);
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
			case DbchangelogPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DbchangelogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DbchangelogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_AUTO_INCREMENT:
				return getAddAutoIncrement() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_COLUMN:
				return getAddColumn() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_DEFAULT_VALUE:
				return getAddDefaultValue() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT:
				return getAddForeignKeyConstraint() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_LOOKUP_TABLE:
				return getAddLookupTable() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT:
				return getAddNotNullConstraint() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_PRIMARY_KEY:
				return getAddPrimaryKey() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT:
				return getAddUniqueConstraint() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ALTER_SEQUENCE:
				return getAlterSequence() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__AND:
				return getAnd() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED:
				return getChangeLogPropertyDefined() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_SET_EXECUTED:
				return getChangeSetExecuted() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN:
				return getColumn() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN_EXISTS:
				return getColumnExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case DbchangelogPackage.DOCUMENT_ROOT__CONSTRAINTS:
				return getConstraints() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_INDEX:
				return getCreateIndex() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_PROCEDURE:
				return getCreateProcedure() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_SEQUENCE:
				return getCreateSequence() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_TABLE:
				return getCreateTable() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_VIEW:
				return getCreateView() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_CHANGE:
				return getCustomChange() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_PRECONDITION:
				return getCustomPrecondition() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DATABASE_CHANGE_LOG:
				return getDatabaseChangeLog() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DBMS:
				return getDbms() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DELETE:
				return getDelete() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
				return getDropAllForeignKeyConstraints() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_COLUMN:
				return getDropColumn() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_DEFAULT_VALUE:
				return getDropDefaultValue() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT:
				return getDropForeignKeyConstraint() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_INDEX:
				return getDropIndex() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT:
				return getDropNotNullConstraint() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PRIMARY_KEY:
				return getDropPrimaryKey() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PROCEDURE:
				return getDropProcedure() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_SEQUENCE:
				return getDropSequence() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_TABLE:
				return getDropTable() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT:
				return getDropUniqueConstraint() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_VIEW:
				return getDropView() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__EXECUTE_COMMAND:
				return getExecuteCommand() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY:
				return getExpectedQuotingStrategy() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS:
				return getForeignKeyConstraintExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__INDEX_EXISTS:
				return getIndexExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__INSERT:
				return getInsert() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_DATA:
				return getLoadData() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_UPDATE_DATA:
				return getLoadUpdateData() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__MERGE_COLUMNS:
				return getMergeColumns() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__MODIFY_DATA_TYPE:
				return getModifyDataType() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__NOT:
				return getNot() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__OR:
				return getOr() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__PARAM:
				return getParam() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__PRIMARY_KEY_EXISTS:
				return getPrimaryKeyExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_COLUMN:
				return getRenameColumn() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_TABLE:
				return getRenameTable() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_VIEW:
				return getRenameView() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ROLLBACK:
				return getRollback() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__ROW_COUNT:
				return getRowCount() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__RUNNING_AS:
				return getRunningAs() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__SEQUENCE_EXISTS:
				return getSequenceExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL:
				return getSql() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_CHECK:
				return getSqlCheck() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_FILE:
				return getSqlFile() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__STOP:
				return getStop() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_EXISTS:
				return getTableExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_IS_EMPTY:
				return getTableIsEmpty() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__TAG_DATABASE:
				return getTagDatabase() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__VIEW_EXISTS:
				return getViewExists() != null;
			case DbchangelogPackage.DOCUMENT_ROOT__WHERE_PARAMS:
				return getWhereParams() != null;
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
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
