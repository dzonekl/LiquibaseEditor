/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Foreign Key Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropForeignKeyConstraintTypeTest extends TestCase {

	/**
	 * The fixture for this Drop Foreign Key Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropForeignKeyConstraintType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropForeignKeyConstraintTypeTest.class);
	}

	/**
	 * Constructs a new Drop Foreign Key Constraint Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropForeignKeyConstraintTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Drop Foreign Key Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DropForeignKeyConstraintType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Drop Foreign Key Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropForeignKeyConstraintType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createDropForeignKeyConstraintType());
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

} //DropForeignKeyConstraintTypeTest
