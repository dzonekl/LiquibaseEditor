/**
 */
package org.liquibase.xml.ns.dbchangelog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Quoting Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getObjectQuotingStrategy()
 * @model extendedMetaData="name='objectQuotingStrategy'"
 * @generated
 */
public enum ObjectQuotingStrategy implements Enumerator {
	/**
	 * The '<em><b>LEGACY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGACY_VALUE
	 * @generated
	 * @ordered
	 */
	LEGACY(0, "LEGACY", "LEGACY"),

	/**
	 * The '<em><b>QUOTEALLOBJECTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUOTEALLOBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	QUOTEALLOBJECTS(1, "QUOTEALLOBJECTS", "QUOTE_ALL_OBJECTS"),

	/**
	 * The '<em><b>QUOTEONLYRESERVEDWORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUOTEONLYRESERVEDWORDS_VALUE
	 * @generated
	 * @ordered
	 */
	QUOTEONLYRESERVEDWORDS(2, "QUOTEONLYRESERVEDWORDS", "QUOTE_ONLY_RESERVED_WORDS");

	/**
	 * The '<em><b>LEGACY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEGACY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGACY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEGACY_VALUE = 0;

	/**
	 * The '<em><b>QUOTEALLOBJECTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUOTEALLOBJECTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUOTEALLOBJECTS
	 * @model literal="QUOTE_ALL_OBJECTS"
	 * @generated
	 * @ordered
	 */
	public static final int QUOTEALLOBJECTS_VALUE = 1;

	/**
	 * The '<em><b>QUOTEONLYRESERVEDWORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUOTEONLYRESERVEDWORDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUOTEONLYRESERVEDWORDS
	 * @model literal="QUOTE_ONLY_RESERVED_WORDS"
	 * @generated
	 * @ordered
	 */
	public static final int QUOTEONLYRESERVEDWORDS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Object Quoting Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectQuotingStrategy[] VALUES_ARRAY =
		new ObjectQuotingStrategy[] {
			LEGACY,
			QUOTEALLOBJECTS,
			QUOTEONLYRESERVEDWORDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Quoting Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectQuotingStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Quoting Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectQuotingStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectQuotingStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Quoting Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectQuotingStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectQuotingStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Quoting Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectQuotingStrategy get(int value) {
		switch (value) {
			case LEGACY_VALUE: return LEGACY;
			case QUOTEALLOBJECTS_VALUE: return QUOTEALLOBJECTS;
			case QUOTEONLYRESERVEDWORDS_VALUE: return QUOTEONLYRESERVEDWORDS;
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
	private ObjectQuotingStrategy(int value, String name, String literal) {
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
	
} //ObjectQuotingStrategy
