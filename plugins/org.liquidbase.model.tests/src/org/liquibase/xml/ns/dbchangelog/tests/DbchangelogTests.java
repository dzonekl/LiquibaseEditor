/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dbchangelog</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbchangelogTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DbchangelogTests("dbchangelog Tests");
		suite.addTestSuite(AndTypeTest.class);
		suite.addTestSuite(ChangeSetTypeTest.class);
		suite.addTestSuite(ColumnTypeTest.class);
		suite.addTestSuite(ColumnType2Test.class);
		suite.addTestSuite(ColumnType4Test.class);
		suite.addTestSuite(CreateProcedureTypeTest.class);
		suite.addTestSuite(DatabaseChangeLogTypeTest.class);
		suite.addTestSuite(DeleteTypeTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(LoadDataTypeTest.class);
		suite.addTestSuite(LoadUpdateDataTypeTest.class);
		suite.addTestSuite(ModifySqlTypeTest.class);
		suite.addTestSuite(NotTypeTest.class);
		suite.addTestSuite(OrTypeTest.class);
		suite.addTestSuite(PreConditionsTypeTest.class);
		suite.addTestSuite(PreConditionsType1Test.class);
		suite.addTestSuite(RollbackTypeTest.class);
		suite.addTestSuite(SqlTypeTest.class);
		suite.addTestSuite(UpdateTypeTest.class);
		suite.addTestSuite(ValidCheckSumTypeTest.class);
		suite.addTestSuite(WhereParamsTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogTests(String name) {
		super(name);
	}

} //DbchangelogTests
