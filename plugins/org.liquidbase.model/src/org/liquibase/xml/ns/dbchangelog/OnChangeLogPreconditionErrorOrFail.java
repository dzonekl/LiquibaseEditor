/**
 */
package org.liquibase.xml.ns.dbchangelog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>On Change Log Precondition Error Or Fail</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOnChangeLogPreconditionErrorOrFail()
 * @model extendedMetaData="name='onChangeLogPreconditionErrorOrFail'"
 * @generated
 */
public enum OnChangeLogPreconditionErrorOrFail implements Enumerator {
	/**
	 * The '<em><b>HALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALT_VALUE
	 * @generated
	 * @ordered
	 */
	HALT(0, "HALT", "HALT"),

	/**
	 * The '<em><b>WARN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARN_VALUE
	 * @generated
	 * @ordered
	 */
	WARN(1, "WARN", "WARN");

	/**
	 * The '<em><b>HALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALT_VALUE = 0;

	/**
	 * The '<em><b>WARN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARN_VALUE = 1;

	/**
	 * An array of all the '<em><b>On Change Log Precondition Error Or Fail</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OnChangeLogPreconditionErrorOrFail[] VALUES_ARRAY =
		new OnChangeLogPreconditionErrorOrFail[] {
			HALT,
			WARN,
		};

	/**
	 * A public read-only list of all the '<em><b>On Change Log Precondition Error Or Fail</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OnChangeLogPreconditionErrorOrFail> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>On Change Log Precondition Error Or Fail</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnChangeLogPreconditionErrorOrFail get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OnChangeLogPreconditionErrorOrFail result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>On Change Log Precondition Error Or Fail</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnChangeLogPreconditionErrorOrFail getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OnChangeLogPreconditionErrorOrFail result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>On Change Log Precondition Error Or Fail</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnChangeLogPreconditionErrorOrFail get(int value) {
		switch (value) {
			case HALT_VALUE: return HALT;
			case WARN_VALUE: return WARN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OnChangeLogPreconditionErrorOrFail(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OnChangeLogPreconditionErrorOrFail
