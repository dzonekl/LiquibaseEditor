/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.ParamType2;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Param Type2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParamType2Test extends TestCase {

	/**
	 * The fixture for this Param Type2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamType2 fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParamType2Test.class);
	}

	/**
	 * Constructs a new Param Type2 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType2Test(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Param Type2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ParamType2 fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Param Type2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamType2 getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createParamType2());
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

} //ParamType2Test
