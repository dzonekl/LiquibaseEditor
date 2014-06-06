/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Foreign Key Constraint Exists Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForeignKeyConstraintExistsTypeTest extends TestCase {

	/**
	 * The fixture for this Foreign Key Constraint Exists Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyConstraintExistsType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForeignKeyConstraintExistsTypeTest.class);
	}

	/**
	 * Constructs a new Foreign Key Constraint Exists Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyConstraintExistsTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Foreign Key Constraint Exists Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ForeignKeyConstraintExistsType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Foreign Key Constraint Exists Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyConstraintExistsType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createForeignKeyConstraintExistsType());
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

} //ForeignKeyConstraintExistsTypeTest
