/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.RollbackType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rollback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetChildren() <em>Change Set Children</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getComment() <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateTable() <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropTable() <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateView() <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameView() <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropView() <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getInsert() <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddColumn() <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSql() <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateProcedure() <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropProcedure() <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSqlFile() <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameTable() <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameColumn() <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropColumn() <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getMergeColumns() <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getModifyDataType() <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateSequence() <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAlterSequence() <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropSequence() <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateIndex() <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropIndex() <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddNotNullConstraint() <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropNotNullConstraint() <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddForeignKeyConstraint() <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropForeignKeyConstraint() <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropAllForeignKeyConstraints() <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddPrimaryKey() <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropPrimaryKey() <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddLookupTable() <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddAutoIncrement() <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddDefaultValue() <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropDefaultValue() <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddUniqueConstraint() <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropUniqueConstraint() <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCustomChange() <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getUpdate() <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDelete() <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadData() <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadUpdateData() <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getExecuteCommand() <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getStop() <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRollback() <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAny() <em>Any</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RollbackTypeTest extends TestCase {

	/**
	 * The fixture for this Rollback Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollbackType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RollbackTypeTest.class);
	}

	/**
	 * Constructs a new Rollback Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rollback Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RollbackType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rollback Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollbackType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createRollbackType());
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
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetChildren() <em>Change Set Children</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetChildren()
	 * @generated
	 */
	public void testGetChangeSetChildren() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getComment() <em>Comment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getComment()
	 * @generated
	 */
	public void testGetComment() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateTable() <em>Create Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateTable()
	 * @generated
	 */
	public void testGetCreateTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropTable() <em>Drop Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropTable()
	 * @generated
	 */
	public void testGetDropTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateView() <em>Create View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateView()
	 * @generated
	 */
	public void testGetCreateView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameView() <em>Rename View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameView()
	 * @generated
	 */
	public void testGetRenameView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropView() <em>Drop View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropView()
	 * @generated
	 */
	public void testGetDropView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getInsert() <em>Insert</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getInsert()
	 * @generated
	 */
	public void testGetInsert() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddColumn() <em>Add Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddColumn()
	 * @generated
	 */
	public void testGetAddColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSql() <em>Sql</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getSql()
	 * @generated
	 */
	public void testGetSql() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateProcedure() <em>Create Procedure</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateProcedure()
	 * @generated
	 */
	public void testGetCreateProcedure() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropProcedure() <em>Drop Procedure</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropProcedure()
	 * @generated
	 */
	public void testGetDropProcedure() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSqlFile() <em>Sql File</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getSqlFile()
	 * @generated
	 */
	public void testGetSqlFile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameTable() <em>Rename Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameTable()
	 * @generated
	 */
	public void testGetRenameTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameColumn() <em>Rename Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameColumn()
	 * @generated
	 */
	public void testGetRenameColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropColumn() <em>Drop Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropColumn()
	 * @generated
	 */
	public void testGetDropColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getMergeColumns() <em>Merge Columns</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getMergeColumns()
	 * @generated
	 */
	public void testGetMergeColumns() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getModifyDataType() <em>Modify Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getModifyDataType()
	 * @generated
	 */
	public void testGetModifyDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateSequence() <em>Create Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateSequence()
	 * @generated
	 */
	public void testGetCreateSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAlterSequence() <em>Alter Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAlterSequence()
	 * @generated
	 */
	public void testGetAlterSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropSequence() <em>Drop Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropSequence()
	 * @generated
	 */
	public void testGetDropSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateIndex() <em>Create Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateIndex()
	 * @generated
	 */
	public void testGetCreateIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropIndex() <em>Drop Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropIndex()
	 * @generated
	 */
	public void testGetDropIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddNotNullConstraint() <em>Add Not Null Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddNotNullConstraint()
	 * @generated
	 */
	public void testGetAddNotNullConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropNotNullConstraint() <em>Drop Not Null Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropNotNullConstraint()
	 * @generated
	 */
	public void testGetDropNotNullConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddForeignKeyConstraint() <em>Add Foreign Key Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddForeignKeyConstraint()
	 * @generated
	 */
	public void testGetAddForeignKeyConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropForeignKeyConstraint() <em>Drop Foreign Key Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropForeignKeyConstraint()
	 * @generated
	 */
	public void testGetDropForeignKeyConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropAllForeignKeyConstraints() <em>Drop All Foreign Key Constraints</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropAllForeignKeyConstraints()
	 * @generated
	 */
	public void testGetDropAllForeignKeyConstraints() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddPrimaryKey() <em>Add Primary Key</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddPrimaryKey()
	 * @generated
	 */
	public void testGetAddPrimaryKey() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropPrimaryKey() <em>Drop Primary Key</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropPrimaryKey()
	 * @generated
	 */
	public void testGetDropPrimaryKey() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddLookupTable() <em>Add Lookup Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddLookupTable()
	 * @generated
	 */
	public void testGetAddLookupTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddAutoIncrement() <em>Add Auto Increment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddAutoIncrement()
	 * @generated
	 */
	public void testGetAddAutoIncrement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddDefaultValue() <em>Add Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddDefaultValue()
	 * @generated
	 */
	public void testGetAddDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropDefaultValue() <em>Drop Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropDefaultValue()
	 * @generated
	 */
	public void testGetDropDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddUniqueConstraint() <em>Add Unique Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddUniqueConstraint()
	 * @generated
	 */
	public void testGetAddUniqueConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropUniqueConstraint() <em>Drop Unique Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropUniqueConstraint()
	 * @generated
	 */
	public void testGetDropUniqueConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCustomChange() <em>Custom Change</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCustomChange()
	 * @generated
	 */
	public void testGetCustomChange() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getUpdate() <em>Update</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getUpdate()
	 * @generated
	 */
	public void testGetUpdate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDelete() <em>Delete</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDelete()
	 * @generated
	 */
	public void testGetDelete() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadData() <em>Load Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadData()
	 * @generated
	 */
	public void testGetLoadData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadUpdateData() <em>Load Update Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadUpdateData()
	 * @generated
	 */
	public void testGetLoadUpdateData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getExecuteCommand() <em>Execute Command</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getExecuteCommand()
	 * @generated
	 */
	public void testGetExecuteCommand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getStop() <em>Stop</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getStop()
	 * @generated
	 */
	public void testGetStop() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRollback() <em>Rollback</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRollback()
	 * @generated
	 */
	public void testGetRollback() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAny() <em>Any</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAny()
	 * @generated
	 */
	public void testGetAny() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RollbackTypeTest
