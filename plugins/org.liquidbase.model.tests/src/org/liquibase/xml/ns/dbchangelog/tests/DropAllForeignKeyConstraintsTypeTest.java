/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop All Foreign Key Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropAllForeignKeyConstraintsTypeTest extends TestCase {

	/**
	 * The fixture for this Drop All Foreign Key Constraints Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropAllForeignKeyConstraintsType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropAllForeignKeyConstraintsTypeTest.class);
	}

	/**
	 * Constructs a new Drop All Foreign Key Constraints Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropAllForeignKeyConstraintsTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Drop All Foreign Key Constraints Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DropAllForeignKeyConstraintsType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Drop All Foreign Key Constraints Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropAllForeignKeyConstraintsType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createDropAllForeignKeyConstraintsType());
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

} //DropAllForeignKeyConstraintsTypeTest
