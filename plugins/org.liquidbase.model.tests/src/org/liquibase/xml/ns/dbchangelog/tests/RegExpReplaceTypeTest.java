/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.RegExpReplaceType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reg Exp Replace Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegExpReplaceTypeTest extends TestCase {

	/**
	 * The fixture for this Reg Exp Replace Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegExpReplaceType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegExpReplaceTypeTest.class);
	}

	/**
	 * Constructs a new Reg Exp Replace Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExpReplaceTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reg Exp Replace Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RegExpReplaceType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reg Exp Replace Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegExpReplaceType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createRegExpReplaceType());
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

} //RegExpReplaceTypeTest
