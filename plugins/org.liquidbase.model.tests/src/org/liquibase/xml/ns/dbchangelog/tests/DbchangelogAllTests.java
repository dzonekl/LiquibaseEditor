/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Dbchangelog</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbchangelogAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DbchangelogAllTests("Dbchangelog Tests");
		suite.addTest(DbchangelogTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbchangelogAllTests(String name) {
		super(name);
	}

} //DbchangelogAllTests
