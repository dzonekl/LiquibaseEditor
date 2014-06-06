/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modify Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifyDataTypeTypeTest extends TestCase {

	/**
	 * The fixture for this Modify Data Type Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyDataTypeType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModifyDataTypeTypeTest.class);
	}

	/**
	 * Constructs a new Modify Data Type Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyDataTypeTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Modify Data Type Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModifyDataTypeType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Modify Data Type Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyDataTypeType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createModifyDataTypeType());
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

} //ModifyDataTypeTypeTest
