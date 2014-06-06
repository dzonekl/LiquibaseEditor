/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement() <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn() <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue() <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint() <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable() <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint() <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey() <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint() <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence() <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd() <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined() <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted() <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn() <em>Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists() <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment() <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints() <em>Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex() <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure() <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence() <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable() <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView() <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange() <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition() <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog() <em>Database Change Log</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms() <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete() <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints() <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn() <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue() <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint() <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex() <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint() <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey() <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure() <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence() <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable() <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint() <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView() <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand() <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy() <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists() <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists() <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert() <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData() <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData() <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns() <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType() <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot() <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr() <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam() <em>Param</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists() <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn() <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable() <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView() <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback() <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount() <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs() <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists() <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql() <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck() <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile() <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop() <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists() <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty() <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase() <em>Tag Database</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate() <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists() <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams() <em>Where Params</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DocumentRootTest extends TestCase {

	/**
	 * The fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentRootTest.class);
	}

	/**
	 * Constructs a new Document Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DocumentRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DbchangelogFactory.eINSTANCE.createDocumentRoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement() <em>Add Auto Increment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement()
	 * @generated
	 */
	public void testGetAddAutoIncrement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddAutoIncrement(org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType) <em>Add Auto Increment</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddAutoIncrement(org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType)
	 * @generated
	 */
	public void testSetAddAutoIncrement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn() <em>Add Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn()
	 * @generated
	 */
	public void testGetAddColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddColumn(org.liquibase.xml.ns.dbchangelog.AddColumnType) <em>Add Column</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddColumn(org.liquibase.xml.ns.dbchangelog.AddColumnType)
	 * @generated
	 */
	public void testSetAddColumn() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue() <em>Add Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue()
	 * @generated
	 */
	public void testGetAddDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddDefaultValue(org.liquibase.xml.ns.dbchangelog.AddDefaultValueType) <em>Add Default Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddDefaultValue(org.liquibase.xml.ns.dbchangelog.AddDefaultValueType)
	 * @generated
	 */
	public void testSetAddDefaultValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint() <em>Add Foreign Key Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint()
	 * @generated
	 */
	public void testGetAddForeignKeyConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddForeignKeyConstraint(org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType) <em>Add Foreign Key Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddForeignKeyConstraint(org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType)
	 * @generated
	 */
	public void testSetAddForeignKeyConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable() <em>Add Lookup Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable()
	 * @generated
	 */
	public void testGetAddLookupTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddLookupTable(org.liquibase.xml.ns.dbchangelog.AddLookupTableType) <em>Add Lookup Table</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddLookupTable(org.liquibase.xml.ns.dbchangelog.AddLookupTableType)
	 * @generated
	 */
	public void testSetAddLookupTable() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint() <em>Add Not Null Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint()
	 * @generated
	 */
	public void testGetAddNotNullConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddNotNullConstraint(org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType) <em>Add Not Null Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddNotNullConstraint(org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType)
	 * @generated
	 */
	public void testSetAddNotNullConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey() <em>Add Primary Key</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey()
	 * @generated
	 */
	public void testGetAddPrimaryKey() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddPrimaryKey(org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType) <em>Add Primary Key</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddPrimaryKey(org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType)
	 * @generated
	 */
	public void testSetAddPrimaryKey() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint() <em>Add Unique Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint()
	 * @generated
	 */
	public void testGetAddUniqueConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddUniqueConstraint(org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType) <em>Add Unique Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAddUniqueConstraint(org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType)
	 * @generated
	 */
	public void testSetAddUniqueConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence() <em>Alter Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence()
	 * @generated
	 */
	public void testGetAlterSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAlterSequence(org.liquibase.xml.ns.dbchangelog.AlterSequenceType) <em>Alter Sequence</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAlterSequence(org.liquibase.xml.ns.dbchangelog.AlterSequenceType)
	 * @generated
	 */
	public void testSetAlterSequence() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd() <em>And</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd()
	 * @generated
	 */
	public void testGetAnd() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAnd(org.liquibase.xml.ns.dbchangelog.AndType) <em>And</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setAnd(org.liquibase.xml.ns.dbchangelog.AndType)
	 * @generated
	 */
	public void testSetAnd() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined() <em>Change Log Property Defined</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined()
	 * @generated
	 */
	public void testGetChangeLogPropertyDefined() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setChangeLogPropertyDefined(org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType) <em>Change Log Property Defined</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setChangeLogPropertyDefined(org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType)
	 * @generated
	 */
	public void testSetChangeLogPropertyDefined() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted() <em>Change Set Executed</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted()
	 * @generated
	 */
	public void testGetChangeSetExecuted() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setChangeSetExecuted(org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType) <em>Change Set Executed</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setChangeSetExecuted(org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType)
	 * @generated
	 */
	public void testSetChangeSetExecuted() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn() <em>Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn()
	 * @generated
	 */
	public void testGetColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setColumn(org.liquibase.xml.ns.dbchangelog.ColumnType) <em>Column</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setColumn(org.liquibase.xml.ns.dbchangelog.ColumnType)
	 * @generated
	 */
	public void testSetColumn() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists() <em>Column Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists()
	 * @generated
	 */
	public void testGetColumnExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setColumnExists(org.liquibase.xml.ns.dbchangelog.ColumnExistsType) <em>Column Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setColumnExists(org.liquibase.xml.ns.dbchangelog.ColumnExistsType)
	 * @generated
	 */
	public void testSetColumnExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment() <em>Comment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment()
	 * @generated
	 */
	public void testGetComment() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setComment(java.lang.String) <em>Comment</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setComment(java.lang.String)
	 * @generated
	 */
	public void testSetComment() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints() <em>Constraints</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints()
	 * @generated
	 */
	public void testGetConstraints() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setConstraints(org.liquibase.xml.ns.dbchangelog.ConstraintsType) <em>Constraints</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setConstraints(org.liquibase.xml.ns.dbchangelog.ConstraintsType)
	 * @generated
	 */
	public void testSetConstraints() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex() <em>Create Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex()
	 * @generated
	 */
	public void testGetCreateIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateIndex(org.liquibase.xml.ns.dbchangelog.CreateIndexType) <em>Create Index</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateIndex(org.liquibase.xml.ns.dbchangelog.CreateIndexType)
	 * @generated
	 */
	public void testSetCreateIndex() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure() <em>Create Procedure</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure()
	 * @generated
	 */
	public void testGetCreateProcedure() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateProcedure(org.liquibase.xml.ns.dbchangelog.CreateProcedureType) <em>Create Procedure</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateProcedure(org.liquibase.xml.ns.dbchangelog.CreateProcedureType)
	 * @generated
	 */
	public void testSetCreateProcedure() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence() <em>Create Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence()
	 * @generated
	 */
	public void testGetCreateSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateSequence(org.liquibase.xml.ns.dbchangelog.CreateSequenceType) <em>Create Sequence</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateSequence(org.liquibase.xml.ns.dbchangelog.CreateSequenceType)
	 * @generated
	 */
	public void testSetCreateSequence() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable() <em>Create Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable()
	 * @generated
	 */
	public void testGetCreateTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateTable(org.liquibase.xml.ns.dbchangelog.CreateTableType) <em>Create Table</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateTable(org.liquibase.xml.ns.dbchangelog.CreateTableType)
	 * @generated
	 */
	public void testSetCreateTable() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView() <em>Create View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView()
	 * @generated
	 */
	public void testGetCreateView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateView(org.liquibase.xml.ns.dbchangelog.CreateViewType) <em>Create View</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCreateView(org.liquibase.xml.ns.dbchangelog.CreateViewType)
	 * @generated
	 */
	public void testSetCreateView() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange() <em>Custom Change</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange()
	 * @generated
	 */
	public void testGetCustomChange() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCustomChange(org.liquibase.xml.ns.dbchangelog.CustomChangeType) <em>Custom Change</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCustomChange(org.liquibase.xml.ns.dbchangelog.CustomChangeType)
	 * @generated
	 */
	public void testSetCustomChange() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition() <em>Custom Precondition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition()
	 * @generated
	 */
	public void testGetCustomPrecondition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCustomPrecondition(org.liquibase.xml.ns.dbchangelog.CustomPreconditionType) <em>Custom Precondition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setCustomPrecondition(org.liquibase.xml.ns.dbchangelog.CustomPreconditionType)
	 * @generated
	 */
	public void testSetCustomPrecondition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog() <em>Database Change Log</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog()
	 * @generated
	 */
	public void testGetDatabaseChangeLog() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDatabaseChangeLog(org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType) <em>Database Change Log</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDatabaseChangeLog(org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType)
	 * @generated
	 */
	public void testSetDatabaseChangeLog() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms() <em>Dbms</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms()
	 * @generated
	 */
	public void testGetDbms() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDbms(org.liquibase.xml.ns.dbchangelog.DbmsType) <em>Dbms</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDbms(org.liquibase.xml.ns.dbchangelog.DbmsType)
	 * @generated
	 */
	public void testSetDbms() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete() <em>Delete</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete()
	 * @generated
	 */
	public void testGetDelete() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDelete(org.liquibase.xml.ns.dbchangelog.DeleteType) <em>Delete</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDelete(org.liquibase.xml.ns.dbchangelog.DeleteType)
	 * @generated
	 */
	public void testSetDelete() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints() <em>Drop All Foreign Key Constraints</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints()
	 * @generated
	 */
	public void testGetDropAllForeignKeyConstraints() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropAllForeignKeyConstraints(org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType) <em>Drop All Foreign Key Constraints</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropAllForeignKeyConstraints(org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType)
	 * @generated
	 */
	public void testSetDropAllForeignKeyConstraints() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn() <em>Drop Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn()
	 * @generated
	 */
	public void testGetDropColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropColumn(org.liquibase.xml.ns.dbchangelog.DropColumnType) <em>Drop Column</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropColumn(org.liquibase.xml.ns.dbchangelog.DropColumnType)
	 * @generated
	 */
	public void testSetDropColumn() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue() <em>Drop Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue()
	 * @generated
	 */
	public void testGetDropDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropDefaultValue(org.liquibase.xml.ns.dbchangelog.DropDefaultValueType) <em>Drop Default Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropDefaultValue(org.liquibase.xml.ns.dbchangelog.DropDefaultValueType)
	 * @generated
	 */
	public void testSetDropDefaultValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint() <em>Drop Foreign Key Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint()
	 * @generated
	 */
	public void testGetDropForeignKeyConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropForeignKeyConstraint(org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType) <em>Drop Foreign Key Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropForeignKeyConstraint(org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType)
	 * @generated
	 */
	public void testSetDropForeignKeyConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex() <em>Drop Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex()
	 * @generated
	 */
	public void testGetDropIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropIndex(org.liquibase.xml.ns.dbchangelog.DropIndexType) <em>Drop Index</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropIndex(org.liquibase.xml.ns.dbchangelog.DropIndexType)
	 * @generated
	 */
	public void testSetDropIndex() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint() <em>Drop Not Null Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint()
	 * @generated
	 */
	public void testGetDropNotNullConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropNotNullConstraint(org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType) <em>Drop Not Null Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropNotNullConstraint(org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType)
	 * @generated
	 */
	public void testSetDropNotNullConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey() <em>Drop Primary Key</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey()
	 * @generated
	 */
	public void testGetDropPrimaryKey() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropPrimaryKey(org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType) <em>Drop Primary Key</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropPrimaryKey(org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType)
	 * @generated
	 */
	public void testSetDropPrimaryKey() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure() <em>Drop Procedure</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure()
	 * @generated
	 */
	public void testGetDropProcedure() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropProcedure(org.liquibase.xml.ns.dbchangelog.DropProcedureType) <em>Drop Procedure</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropProcedure(org.liquibase.xml.ns.dbchangelog.DropProcedureType)
	 * @generated
	 */
	public void testSetDropProcedure() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence() <em>Drop Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence()
	 * @generated
	 */
	public void testGetDropSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropSequence(org.liquibase.xml.ns.dbchangelog.DropSequenceType) <em>Drop Sequence</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropSequence(org.liquibase.xml.ns.dbchangelog.DropSequenceType)
	 * @generated
	 */
	public void testSetDropSequence() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable() <em>Drop Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable()
	 * @generated
	 */
	public void testGetDropTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropTable(org.liquibase.xml.ns.dbchangelog.DropTableType) <em>Drop Table</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropTable(org.liquibase.xml.ns.dbchangelog.DropTableType)
	 * @generated
	 */
	public void testSetDropTable() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint() <em>Drop Unique Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint()
	 * @generated
	 */
	public void testGetDropUniqueConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropUniqueConstraint(org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType) <em>Drop Unique Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropUniqueConstraint(org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType)
	 * @generated
	 */
	public void testSetDropUniqueConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView() <em>Drop View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView()
	 * @generated
	 */
	public void testGetDropView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropView(org.liquibase.xml.ns.dbchangelog.DropViewType) <em>Drop View</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setDropView(org.liquibase.xml.ns.dbchangelog.DropViewType)
	 * @generated
	 */
	public void testSetDropView() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand() <em>Execute Command</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand()
	 * @generated
	 */
	public void testGetExecuteCommand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setExecuteCommand(org.liquibase.xml.ns.dbchangelog.ExecuteCommandType) <em>Execute Command</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setExecuteCommand(org.liquibase.xml.ns.dbchangelog.ExecuteCommandType)
	 * @generated
	 */
	public void testSetExecuteCommand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy() <em>Expected Quoting Strategy</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy()
	 * @generated
	 */
	public void testGetExpectedQuotingStrategy() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setExpectedQuotingStrategy(org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType) <em>Expected Quoting Strategy</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setExpectedQuotingStrategy(org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType)
	 * @generated
	 */
	public void testSetExpectedQuotingStrategy() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists() <em>Foreign Key Constraint Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists()
	 * @generated
	 */
	public void testGetForeignKeyConstraintExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setForeignKeyConstraintExists(org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType) <em>Foreign Key Constraint Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setForeignKeyConstraintExists(org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType)
	 * @generated
	 */
	public void testSetForeignKeyConstraintExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists() <em>Index Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists()
	 * @generated
	 */
	public void testGetIndexExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setIndexExists(org.liquibase.xml.ns.dbchangelog.IndexExistsType) <em>Index Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setIndexExists(org.liquibase.xml.ns.dbchangelog.IndexExistsType)
	 * @generated
	 */
	public void testSetIndexExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert() <em>Insert</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert()
	 * @generated
	 */
	public void testGetInsert() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setInsert(org.liquibase.xml.ns.dbchangelog.InsertType) <em>Insert</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setInsert(org.liquibase.xml.ns.dbchangelog.InsertType)
	 * @generated
	 */
	public void testSetInsert() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData() <em>Load Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData()
	 * @generated
	 */
	public void testGetLoadData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setLoadData(org.liquibase.xml.ns.dbchangelog.LoadDataType) <em>Load Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setLoadData(org.liquibase.xml.ns.dbchangelog.LoadDataType)
	 * @generated
	 */
	public void testSetLoadData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData() <em>Load Update Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData()
	 * @generated
	 */
	public void testGetLoadUpdateData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setLoadUpdateData(org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType) <em>Load Update Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setLoadUpdateData(org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType)
	 * @generated
	 */
	public void testSetLoadUpdateData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns() <em>Merge Columns</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns()
	 * @generated
	 */
	public void testGetMergeColumns() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setMergeColumns(org.liquibase.xml.ns.dbchangelog.MergeColumnsType) <em>Merge Columns</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setMergeColumns(org.liquibase.xml.ns.dbchangelog.MergeColumnsType)
	 * @generated
	 */
	public void testSetMergeColumns() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType() <em>Modify Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType()
	 * @generated
	 */
	public void testGetModifyDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setModifyDataType(org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType) <em>Modify Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setModifyDataType(org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType)
	 * @generated
	 */
	public void testSetModifyDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot() <em>Not</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot()
	 * @generated
	 */
	public void testGetNot() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setNot(org.liquibase.xml.ns.dbchangelog.NotType) <em>Not</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setNot(org.liquibase.xml.ns.dbchangelog.NotType)
	 * @generated
	 */
	public void testSetNot() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr() <em>Or</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr()
	 * @generated
	 */
	public void testGetOr() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setOr(org.liquibase.xml.ns.dbchangelog.OrType) <em>Or</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setOr(org.liquibase.xml.ns.dbchangelog.OrType)
	 * @generated
	 */
	public void testSetOr() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam() <em>Param</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam()
	 * @generated
	 */
	public void testGetParam() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setParam(org.liquibase.xml.ns.dbchangelog.ParamType) <em>Param</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setParam(org.liquibase.xml.ns.dbchangelog.ParamType)
	 * @generated
	 */
	public void testSetParam() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists() <em>Primary Key Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists()
	 * @generated
	 */
	public void testGetPrimaryKeyExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setPrimaryKeyExists(org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType) <em>Primary Key Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setPrimaryKeyExists(org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType)
	 * @generated
	 */
	public void testSetPrimaryKeyExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn() <em>Rename Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn()
	 * @generated
	 */
	public void testGetRenameColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRenameColumn(org.liquibase.xml.ns.dbchangelog.RenameColumnType) <em>Rename Column</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRenameColumn(org.liquibase.xml.ns.dbchangelog.RenameColumnType)
	 * @generated
	 */
	public void testSetRenameColumn() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable() <em>Rename Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable()
	 * @generated
	 */
	public void testGetRenameTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRenameTable(org.liquibase.xml.ns.dbchangelog.RenameTableType) <em>Rename Table</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRenameTable(org.liquibase.xml.ns.dbchangelog.RenameTableType)
	 * @generated
	 */
	public void testSetRenameTable() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView() <em>Rename View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView()
	 * @generated
	 */
	public void testGetRenameView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRenameView(org.liquibase.xml.ns.dbchangelog.RenameViewType) <em>Rename View</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRenameView(org.liquibase.xml.ns.dbchangelog.RenameViewType)
	 * @generated
	 */
	public void testSetRenameView() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback() <em>Rollback</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback()
	 * @generated
	 */
	public void testGetRollback() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRollback(org.liquibase.xml.ns.dbchangelog.RollbackType) <em>Rollback</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRollback(org.liquibase.xml.ns.dbchangelog.RollbackType)
	 * @generated
	 */
	public void testSetRollback() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount() <em>Row Count</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount()
	 * @generated
	 */
	public void testGetRowCount() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRowCount(org.liquibase.xml.ns.dbchangelog.RowCountType) <em>Row Count</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRowCount(org.liquibase.xml.ns.dbchangelog.RowCountType)
	 * @generated
	 */
	public void testSetRowCount() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs() <em>Running As</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs()
	 * @generated
	 */
	public void testGetRunningAs() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRunningAs(org.liquibase.xml.ns.dbchangelog.RunningAsType) <em>Running As</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setRunningAs(org.liquibase.xml.ns.dbchangelog.RunningAsType)
	 * @generated
	 */
	public void testSetRunningAs() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists() <em>Sequence Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists()
	 * @generated
	 */
	public void testGetSequenceExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSequenceExists(org.liquibase.xml.ns.dbchangelog.SequenceExistsType) <em>Sequence Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSequenceExists(org.liquibase.xml.ns.dbchangelog.SequenceExistsType)
	 * @generated
	 */
	public void testSetSequenceExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql() <em>Sql</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql()
	 * @generated
	 */
	public void testGetSql() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSql(org.liquibase.xml.ns.dbchangelog.SqlType) <em>Sql</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSql(org.liquibase.xml.ns.dbchangelog.SqlType)
	 * @generated
	 */
	public void testSetSql() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck() <em>Sql Check</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck()
	 * @generated
	 */
	public void testGetSqlCheck() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSqlCheck(org.liquibase.xml.ns.dbchangelog.SqlCheckType) <em>Sql Check</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSqlCheck(org.liquibase.xml.ns.dbchangelog.SqlCheckType)
	 * @generated
	 */
	public void testSetSqlCheck() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile() <em>Sql File</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile()
	 * @generated
	 */
	public void testGetSqlFile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSqlFile(org.liquibase.xml.ns.dbchangelog.SqlFileType) <em>Sql File</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setSqlFile(org.liquibase.xml.ns.dbchangelog.SqlFileType)
	 * @generated
	 */
	public void testSetSqlFile() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop() <em>Stop</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop()
	 * @generated
	 */
	public void testGetStop() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setStop(org.liquibase.xml.ns.dbchangelog.StopType) <em>Stop</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setStop(org.liquibase.xml.ns.dbchangelog.StopType)
	 * @generated
	 */
	public void testSetStop() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists() <em>Table Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists()
	 * @generated
	 */
	public void testGetTableExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setTableExists(org.liquibase.xml.ns.dbchangelog.TableExistsType) <em>Table Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setTableExists(org.liquibase.xml.ns.dbchangelog.TableExistsType)
	 * @generated
	 */
	public void testSetTableExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty() <em>Table Is Empty</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty()
	 * @generated
	 */
	public void testGetTableIsEmpty() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setTableIsEmpty(org.liquibase.xml.ns.dbchangelog.TableIsEmptyType) <em>Table Is Empty</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setTableIsEmpty(org.liquibase.xml.ns.dbchangelog.TableIsEmptyType)
	 * @generated
	 */
	public void testSetTableIsEmpty() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase() <em>Tag Database</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase()
	 * @generated
	 */
	public void testGetTagDatabase() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setTagDatabase(org.liquibase.xml.ns.dbchangelog.TagDatabaseType) <em>Tag Database</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setTagDatabase(org.liquibase.xml.ns.dbchangelog.TagDatabaseType)
	 * @generated
	 */
	public void testSetTagDatabase() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate() <em>Update</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate()
	 * @generated
	 */
	public void testGetUpdate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setUpdate(org.liquibase.xml.ns.dbchangelog.UpdateType) <em>Update</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setUpdate(org.liquibase.xml.ns.dbchangelog.UpdateType)
	 * @generated
	 */
	public void testSetUpdate() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists() <em>View Exists</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists()
	 * @generated
	 */
	public void testGetViewExists() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setViewExists(org.liquibase.xml.ns.dbchangelog.ViewExistsType) <em>View Exists</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setViewExists(org.liquibase.xml.ns.dbchangelog.ViewExistsType)
	 * @generated
	 */
	public void testSetViewExists() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams() <em>Where Params</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams()
	 * @generated
	 */
	public void testGetWhereParams() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#setWhereParams(org.liquibase.xml.ns.dbchangelog.WhereParamsType) <em>Where Params</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#setWhereParams(org.liquibase.xml.ns.dbchangelog.WhereParamsType)
	 * @generated
	 */
	public void testSetWhereParams() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DocumentRootTest
