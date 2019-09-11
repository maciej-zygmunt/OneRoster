/**
 */
package pl.edu.agh.uci.dXP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.Class#getTitle <em>Title</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Class#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Class#getClassType <em>Class Type</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Class#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Base {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getClass_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Class#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see #setClassCode(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getClass_ClassCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getClassCode();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Class#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(String value);

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see #setClassType(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getClass_ClassType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getClassType();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Class#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getClass_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Class#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // Class
