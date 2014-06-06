/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Unique Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropUniqueConstraintTypeTest extends TestCase {

	/**
	 * The fixture for this Drop Unique Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropUniqueConstraintType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropUniqueConstraintTypeTest.class);
	}

	/**
	 * Constructs a new Drop Unique Constraint Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropUniqueConstraintTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Drop Unique Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DropUniqueConstraintType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Drop Unique Constraint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropUniqueConstraintType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createDropUniqueConstraintType());
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

} //DropUniqueConstraintTypeTest
