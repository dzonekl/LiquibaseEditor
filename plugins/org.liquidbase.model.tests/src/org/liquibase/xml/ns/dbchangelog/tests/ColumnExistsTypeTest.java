/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.ColumnExistsType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Column Exists Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnExistsTypeTest extends TestCase {

	/**
	 * The fixture for this Column Exists Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnExistsType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColumnExistsTypeTest.class);
	}

	/**
	 * Constructs a new Column Exists Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnExistsTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Column Exists Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ColumnExistsType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Column Exists Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnExistsType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createColumnExistsType());
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

} //ColumnExistsTypeTest
