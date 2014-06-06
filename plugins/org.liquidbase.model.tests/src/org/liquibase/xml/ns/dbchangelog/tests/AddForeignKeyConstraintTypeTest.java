/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Foreign Key Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddForeignKeyConstraintTypeTest extends TestCase {

	/**
	 * The fixture for this Add Foreign Key Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddForeignKeyConstraintType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddForeignKeyConstraintTypeTest.class);
	}

	/**
	 * Constructs a new Add Foreign Key Constraint Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddForeignKeyConstraintTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Add Foreign Key Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AddForeignKeyConstraintType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Add Foreign Key Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddForeignKeyConstraintType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createAddForeignKeyConstraintType());
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

} //AddForeignKeyConstraintTypeTest
