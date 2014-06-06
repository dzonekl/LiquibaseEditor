/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expected Quoting Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpectedQuotingStrategyTypeTest extends TestCase {

	/**
	 * The fixture for this Expected Quoting Strategy Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectedQuotingStrategyType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpectedQuotingStrategyTypeTest.class);
	}

	/**
	 * Constructs a new Expected Quoting Strategy Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedQuotingStrategyTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Expected Quoting Strategy Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExpectedQuotingStrategyType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Expected Quoting Strategy Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectedQuotingStrategyType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createExpectedQuotingStrategyType());
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

} //ExpectedQuotingStrategyTypeTest
