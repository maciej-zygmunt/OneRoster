/**
 */
package pl.edu.agh.uci.dXP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Org Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pl.edu.agh.uci.dXP.DXPPackage#getOrgType()
 * @model
 * @generated
 */
public enum OrgType implements Enumerator {
	/**
	 * The '<em><b>Department</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPARTMENT(1, "department", "department"),

	/**
	 * The '<em><b>School</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL(0, "school", "school"),

	/**
	 * The '<em><b>Major</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR(2, "major", "major"),

	/**
	 * The '<em><b>Discipline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCIPLINE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCIPLINE(3, "Discipline", "Discipline"),

	/**
	 * The '<em><b>Specjalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECJALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECJALIZATION(4, "Specjalization", "Specjalization"),

	/**
	 * The '<em><b>Misc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISC_VALUE
	 * @generated
	 * @ordered
	 */
	MISC(5, "Misc", "Misc");

	/**
	 * The '<em><b>Department</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTMENT
	 * @model name="department"
	 * @generated
	 * @ordered
	 */
	public static final int DEPARTMENT_VALUE = 1;

	/**
	 * The '<em><b>School</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL
	 * @model name="school"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_VALUE = 0;

	/**
	 * The '<em><b>Major</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR
	 * @model name="major"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_VALUE = 2;

	/**
	 * The '<em><b>Discipline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCIPLINE
	 * @model name="Discipline"
	 * @generated
	 * @ordered
	 */
	public static final int DISCIPLINE_VALUE = 3;

	/**
	 * The '<em><b>Specjalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECJALIZATION
	 * @model name="Specjalization"
	 * @generated
	 * @ordered
	 */
	public static final int SPECJALIZATION_VALUE = 4;

	/**
	 * The '<em><b>Misc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISC
	 * @model name="Misc"
	 * @generated
	 * @ordered
	 */
	public static final int MISC_VALUE = 5;

	/**
	 * An array of all the '<em><b>Org Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrgType[] VALUES_ARRAY =
		new OrgType[] {
			DEPARTMENT,
			SCHOOL,
			MAJOR,
			DISCIPLINE,
			SPECJALIZATION,
			MISC,
		};

	/**
	 * A public read-only list of all the '<em><b>Org Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrgType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Org Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrgType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrgType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Org Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrgType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrgType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Org Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrgType get(int value) {
		switch (value) {
			case DEPARTMENT_VALUE: return DEPARTMENT;
			case SCHOOL_VALUE: return SCHOOL;
			case MAJOR_VALUE: return MAJOR;
			case DISCIPLINE_VALUE: return DISCIPLINE;
			case SPECJALIZATION_VALUE: return SPECJALIZATION;
			case MISC_VALUE: return MISC;
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
	private OrgType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //OrgType
