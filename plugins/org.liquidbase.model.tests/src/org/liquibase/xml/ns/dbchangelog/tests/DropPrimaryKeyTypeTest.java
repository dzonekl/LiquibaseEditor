/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Primary Key Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropPrimaryKeyTypeTest extends TestCase {

	/**
	 * The fixture for this Drop Primary Key Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropPrimaryKeyType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropPrimaryKeyTypeTest.class);
	}

	/**
	 * Constructs a new Drop Primary Key Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropPrimaryKeyTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Drop Primary Key Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DropPrimaryKeyType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Drop Primary Key Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropPrimaryKeyType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createDropPrimaryKeyType());
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

} //DropPrimaryKeyTypeTest
