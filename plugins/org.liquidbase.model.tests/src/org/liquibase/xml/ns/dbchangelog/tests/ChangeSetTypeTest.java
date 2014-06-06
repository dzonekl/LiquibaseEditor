/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.ChangeSetType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getComment() <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateTable() <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropTable() <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateView() <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameView() <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropView() <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getInsert() <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddColumn() <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSql() <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateProcedure() <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropProcedure() <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSqlFile() <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameTable() <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameColumn() <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropColumn() <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getMergeColumns() <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifyDataType() <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateSequence() <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAlterSequence() <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropSequence() <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateIndex() <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropIndex() <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddNotNullConstraint() <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropNotNullConstraint() <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddForeignKeyConstraint() <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropForeignKeyConstraint() <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropAllForeignKeyConstraints() <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddPrimaryKey() <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropPrimaryKey() <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddLookupTable() <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddAutoIncrement() <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddDefaultValue() <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropDefaultValue() <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddUniqueConstraint() <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropUniqueConstraint() <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCustomChange() <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getUpdate() <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDelete() <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadData() <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadUpdateData() <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getExecuteCommand() <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getStop() <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRollback() <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAny() <em>Any</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ChangeSetTypeTest extends TestCase {

	/**
	 * The fixture for this Change Set Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeSetType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangeSetTypeTest.class);
	}

	/**
	 * Constructs a new Change Set Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSetTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Change Set Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ChangeSetType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Change Set Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeSetType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createChangeSetType());
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
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getComment() <em>Comment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getComment()
	 * @generated
	 */
	public void testGetComment() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateTable() <em>Create Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateTable()
	 * @generated
	 */
	public void testGetCreateTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropTable() <em>Drop Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropTable()
	 * @generated
	 */
	public void testGetDropTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateView() <em>Create View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateView()
	 * @generated
	 */
	public void testGetCreateView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameView() <em>Rename View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameView()
	 * @generated
	 */
	public void testGetRenameView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropView() <em>Drop View</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropView()
	 * @generated
	 */
	public void testGetDropView() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getInsert() <em>Insert</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getInsert()
	 * @generated
	 */
	public void testGetInsert() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddColumn() <em>Add Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddColumn()
	 * @generated
	 */
	public void testGetAddColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSql() <em>Sql</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSql()
	 * @generated
	 */
	public void testGetSql() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateProcedure() <em>Create Procedure</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateProcedure()
	 * @generated
	 */
	public void testGetCreateProcedure() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropProcedure() <em>Drop Procedure</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropProcedure()
	 * @generated
	 */
	public void testGetDropProcedure() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSqlFile() <em>Sql File</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSqlFile()
	 * @generated
	 */
	public void testGetSqlFile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameTable() <em>Rename Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameTable()
	 * @generated
	 */
	public void testGetRenameTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameColumn() <em>Rename Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameColumn()
	 * @generated
	 */
	public void testGetRenameColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropColumn() <em>Drop Column</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropColumn()
	 * @generated
	 */
	public void testGetDropColumn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getMergeColumns() <em>Merge Columns</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getMergeColumns()
	 * @generated
	 */
	public void testGetMergeColumns() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifyDataType() <em>Modify Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifyDataType()
	 * @generated
	 */
	public void testGetModifyDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateSequence() <em>Create Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateSequence()
	 * @generated
	 */
	public void testGetCreateSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAlterSequence() <em>Alter Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAlterSequence()
	 * @generated
	 */
	public void testGetAlterSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropSequence() <em>Drop Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropSequence()
	 * @generated
	 */
	public void testGetDropSequence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateIndex() <em>Create Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateIndex()
	 * @generated
	 */
	public void testGetCreateIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropIndex() <em>Drop Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropIndex()
	 * @generated
	 */
	public void testGetDropIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddNotNullConstraint() <em>Add Not Null Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddNotNullConstraint()
	 * @generated
	 */
	public void testGetAddNotNullConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropNotNullConstraint() <em>Drop Not Null Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropNotNullConstraint()
	 * @generated
	 */
	public void testGetDropNotNullConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddForeignKeyConstraint() <em>Add Foreign Key Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddForeignKeyConstraint()
	 * @generated
	 */
	public void testGetAddForeignKeyConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropForeignKeyConstraint() <em>Drop Foreign Key Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropForeignKeyConstraint()
	 * @generated
	 */
	public void testGetDropForeignKeyConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropAllForeignKeyConstraints() <em>Drop All Foreign Key Constraints</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropAllForeignKeyConstraints()
	 * @generated
	 */
	public void testGetDropAllForeignKeyConstraints() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddPrimaryKey() <em>Add Primary Key</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddPrimaryKey()
	 * @generated
	 */
	public void testGetAddPrimaryKey() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropPrimaryKey() <em>Drop Primary Key</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropPrimaryKey()
	 * @generated
	 */
	public void testGetDropPrimaryKey() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddLookupTable() <em>Add Lookup Table</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddLookupTable()
	 * @generated
	 */
	public void testGetAddLookupTable() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddAutoIncrement() <em>Add Auto Increment</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddAutoIncrement()
	 * @generated
	 */
	public void testGetAddAutoIncrement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddDefaultValue() <em>Add Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddDefaultValue()
	 * @generated
	 */
	public void testGetAddDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropDefaultValue() <em>Drop Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropDefaultValue()
	 * @generated
	 */
	public void testGetDropDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddUniqueConstraint() <em>Add Unique Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddUniqueConstraint()
	 * @generated
	 */
	public void testGetAddUniqueConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropUniqueConstraint() <em>Drop Unique Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropUniqueConstraint()
	 * @generated
	 */
	public void testGetDropUniqueConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCustomChange() <em>Custom Change</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCustomChange()
	 * @generated
	 */
	public void testGetCustomChange() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getUpdate() <em>Update</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getUpdate()
	 * @generated
	 */
	public void testGetUpdate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDelete() <em>Delete</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDelete()
	 * @generated
	 */
	public void testGetDelete() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadData() <em>Load Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadData()
	 * @generated
	 */
	public void testGetLoadData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadUpdateData() <em>Load Update Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadUpdateData()
	 * @generated
	 */
	public void testGetLoadUpdateData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getExecuteCommand() <em>Execute Command</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getExecuteCommand()
	 * @generated
	 */
	public void testGetExecuteCommand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getStop() <em>Stop</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getStop()
	 * @generated
	 */
	public void testGetStop() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRollback() <em>Rollback</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRollback()
	 * @generated
	 */
	public void testGetRollback() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAny() <em>Any</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAny()
	 * @generated
	 */
	public void testGetAny() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ChangeSetTypeTest
