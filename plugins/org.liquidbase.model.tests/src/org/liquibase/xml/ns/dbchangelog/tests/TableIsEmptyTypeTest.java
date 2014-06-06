/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.TableIsEmptyType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Table Is Empty Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableIsEmptyTypeTest extends TestCase {

	/**
	 * The fixture for this Table Is Empty Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableIsEmptyType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableIsEmptyTypeTest.class);
	}

	/**
	 * Constructs a new Table Is Empty Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIsEmptyTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Table Is Empty Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TableIsEmptyType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Table Is Empty Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableIsEmptyType getFixture() {
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
		setFixture(DbchangelogFactory.eINSTANCE.createTableIsEmptyType());
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

} //TableIsEmptyTypeTest
