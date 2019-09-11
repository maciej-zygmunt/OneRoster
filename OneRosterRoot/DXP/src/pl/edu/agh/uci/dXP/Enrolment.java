/**
 */
package pl.edu.agh.uci.dXP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrolment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.Enrolment#getRole <em>Role</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Enrolment#getPrimary <em>Primary</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Enrolment#getUser <em>User</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Enrolment#getClass_ <em>Class</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Enrolment#getOrgunit <em>Orgunit</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getEnrolment()
 * @model
 * @generated
 */
public interface Enrolment extends Base {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link pl.edu.agh.uci.dXP.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see pl.edu.agh.uci.dXP.Role
	 * @see #setRole(Role)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getEnrolment_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Enrolment#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see pl.edu.agh.uci.dXP.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(Boolean)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getEnrolment_Primary()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getPrimary();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Enrolment#getPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(Boolean value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getEnrolment_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Enrolment#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(pl.edu.agh.uci.dXP.Class)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getEnrolment_Class()
	 * @model
	 * @generated
	 */
	pl.edu.agh.uci.dXP.Class getClass_();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Enrolment#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(pl.edu.agh.uci.dXP.Class value);

	/**
	 * Returns the value of the '<em><b>Orgunit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgunit</em>' reference.
	 * @see #setOrgunit(OrgUnit)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getEnrolment_Orgunit()
	 * @model
	 * @generated
	 */
	OrgUnit getOrgunit();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Enrolment#getOrgunit <em>Orgunit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orgunit</em>' reference.
	 * @see #getOrgunit()
	 * @generated
	 */
	void setOrgunit(OrgUnit value);

} // Enrolment
