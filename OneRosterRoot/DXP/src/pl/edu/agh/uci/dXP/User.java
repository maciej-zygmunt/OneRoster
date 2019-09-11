/**
 */
package pl.edu.agh.uci.dXP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.User#getUserName <em>User Name</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.User#getEnabledUser <em>Enabled User</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.User#getUserid <em>Userid</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.User#getRole <em>Role</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.User#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Base {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getUser_UserName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.User#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Enabled User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled User</em>' attribute.
	 * @see #setEnabledUser(Boolean)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getUser_EnabledUser()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getEnabledUser();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.User#getEnabledUser <em>Enabled User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled User</em>' attribute.
	 * @see #getEnabledUser()
	 * @generated
	 */
	void setEnabledUser(Boolean value);

	/**
	 * Returns the value of the '<em><b>Userid</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.UserId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userid</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getUser_Userid()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserId> getUserid();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link pl.edu.agh.uci.dXP.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see pl.edu.agh.uci.dXP.Role
	 * @see #setRole(Role)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getUser_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.User#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see pl.edu.agh.uci.dXP.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getUser_Identifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.User#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // User
