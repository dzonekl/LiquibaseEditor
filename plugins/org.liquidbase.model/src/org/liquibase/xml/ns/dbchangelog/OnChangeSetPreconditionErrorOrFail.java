/**
 */
package org.liquibase.xml.ns.dbchangelog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>On Change Set Precondition Error Or Fail</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOnChangeSetPreconditionErrorOrFail()
 * @model extendedMetaData="name='onChangeSetPreconditionErrorOrFail'"
 * @generated
 */
public enum OnChangeSetPreconditionErrorOrFail implements Enumerator {
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
	WARN(1, "WARN", "WARN"),

	/**
	 * The '<em><b>CONTINUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(2, "CONTINUE", "CONTINUE"),

	/**
	 * The '<em><b>MARKRAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKRAN_VALUE
	 * @generated
	 * @ordered
	 */
	MARKRAN(3, "MARKRAN", "MARK_RAN");

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
	 * The '<em><b>CONTINUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 2;

	/**
	 * The '<em><b>MARKRAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MARKRAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARKRAN
	 * @model literal="MARK_RAN"
	 * @generated
	 * @ordered
	 */
	public static final int MARKRAN_VALUE = 3;

	/**
	 * An array of all the '<em><b>On Change Set Precondition Error Or Fail</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OnChangeSetPreconditionErrorOrFail[] VALUES_ARRAY =
		new OnChangeSetPreconditionErrorOrFail[] {
			HALT,
			WARN,
			CONTINUE,
			MARKRAN,
		};

	/**
	 * A public read-only list of all the '<em><b>On Change Set Precondition Error Or Fail</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OnChangeSetPreconditionErrorOrFail> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>On Change Set Precondition Error Or Fail</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnChangeSetPreconditionErrorOrFail get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OnChangeSetPreconditionErrorOrFail result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>On Change Set Precondition Error Or Fail</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnChangeSetPreconditionErrorOrFail getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OnChangeSetPreconditionErrorOrFail result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>On Change Set Precondition Error Or Fail</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OnChangeSetPreconditionErrorOrFail get(int value) {
		switch (value) {
			case HALT_VALUE: return HALT;
			case WARN_VALUE: return WARN;
			case CONTINUE_VALUE: return CONTINUE;
			case MARKRAN_VALUE: return MARKRAN;
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
	private OnChangeSetPreconditionErrorOrFail(int value, String name, String literal) {
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
	
} //OnChangeSetPreconditionErrorOrFail
