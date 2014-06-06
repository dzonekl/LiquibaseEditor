/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.SqlFileType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sql File Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlFileTypeTest extends TestCase {

	/**
	 * The fixture for this Sql File Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlFileType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SqlFileTypeTest.class);
	}

	/**
	 * Constructs a new Sql File Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFileTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sql File Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SqlFileType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sql File Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlFileType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createSqlFileType());
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

} //SqlFileTypeTest
