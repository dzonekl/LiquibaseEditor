/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Not Null Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropNotNullConstraintTypeTest extends TestCase {

	/**
	 * The fixture for this Drop Not Null Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropNotNullConstraintType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropNotNullConstraintTypeTest.class);
	}

	/**
	 * Constructs a new Drop Not Null Constraint Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropNotNullConstraintTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Drop Not Null Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DropNotNullConstraintType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Drop Not Null Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropNotNullConstraintType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createDropNotNullConstraintType());
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

} //DropNotNullConstraintTypeTest
