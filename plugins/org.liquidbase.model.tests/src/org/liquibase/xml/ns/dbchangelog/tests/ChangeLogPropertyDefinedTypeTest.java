/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Log Property Defined Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeLogPropertyDefinedTypeTest extends TestCase {

	/**
	 * The fixture for this Change Log Property Defined Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeLogPropertyDefinedType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangeLogPropertyDefinedTypeTest.class);
	}

	/**
	 * Constructs a new Change Log Property Defined Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLogPropertyDefinedTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Change Log Property Defined Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ChangeLogPropertyDefinedType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Change Log Property Defined Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeLogPropertyDefinedType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createChangeLogPropertyDefinedType());
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

} //ChangeLogPropertyDefinedTypeTest
