/**
 */
package org.liquibase.xml.ns.dbchangelog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fk Cascade Action Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getFkCascadeActionOptions()
 * @model extendedMetaData="name='fkCascadeActionOptions'"
 * @generated
 */
public enum FkCascadeActionOptions implements Enumerator {
	/**
	 * The '<em><b>CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASCADE_VALUE
	 * @generated
	 * @ordered
	 */
	CASCADE(0, "CASCADE", "CASCADE"),

	/**
	 * The '<em><b>SETNULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETNULL_VALUE
	 * @generated
	 * @ordered
	 */
	SETNULL(1, "SETNULL", "SET NULL"),

	/**
	 * The '<em><b>SETDEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETDEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	SETDEFAULT(2, "SETDEFAULT", "SET DEFAULT"),

	/**
	 * The '<em><b>RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICT_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICT(3, "RESTRICT", "RESTRICT"),

	/**
	 * The '<em><b>NOACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NOACTION(4, "NOACTION", "NO ACTION");

	/**
	 * The '<em><b>CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASCADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_VALUE = 0;

	/**
	 * The '<em><b>SETNULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SETNULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SETNULL
	 * @model literal="SET NULL"
	 * @generated
	 * @ordered
	 */
	public static final int SETNULL_VALUE = 1;

	/**
	 * The '<em><b>SETDEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SETDEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SETDEFAULT
	 * @model literal="SET DEFAULT"
	 * @generated
	 * @ordered
	 */
	public static final int SETDEFAULT_VALUE = 2;

	/**
	 * The '<em><b>RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTRICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICT_VALUE = 3;

	/**
	 * The '<em><b>NOACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOACTION
	 * @model literal="NO ACTION"
	 * @generated
	 * @ordered
	 */
	public static final int NOACTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Fk Cascade Action Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FkCascadeActionOptions[] VALUES_ARRAY =
		new FkCascadeActionOptions[] {
			CASCADE,
			SETNULL,
			SETDEFAULT,
			RESTRICT,
			NOACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Fk Cascade Action Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FkCascadeActionOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fk Cascade Action Options</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FkCascadeActionOptions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FkCascadeActionOptions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fk Cascade Action Options</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FkCascadeActionOptions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FkCascadeActionOptions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fk Cascade Action Options</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FkCascadeActionOptions get(int value) {
		switch (value) {
			case CASCADE_VALUE: return CASCADE;
			case SETNULL_VALUE: return SETNULL;
			case SETDEFAULT_VALUE: return SETDEFAULT;
			case RESTRICT_VALUE: return RESTRICT;
			case NOACTION_VALUE: return NOACTION;
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
	private FkCascadeActionOptions(int value, String name, String literal) {
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
	
} //FkCascadeActionOptions
