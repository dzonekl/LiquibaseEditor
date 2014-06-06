/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.ColumnType4;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Column Type4</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnType4Test extends ColumnType2Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColumnType4Test.class);
	}

	/**
	 * Constructs a new Column Type4 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType4Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Column Type4 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColumnType4 getFixture() {
		return (ColumnType4)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DbchangelogFactory.eINSTANCE.createColumnType4());
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

} //ColumnType4Test
