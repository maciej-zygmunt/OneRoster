/**
 */
package pl.edu.agh.uci.dXP;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Academic Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getTitle <em>Title</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getEndDate <em>End Date</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getSchoolYear <em>School Year</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getType <em>Type</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getCourse <em>Course</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.AcademicSession#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession()
 * @model
 * @generated
 */
public interface AcademicSession extends Base {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.AcademicSession#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.AcademicSession#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_EndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.AcademicSession#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>School Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School Year</em>' attribute.
	 * @see #setSchoolYear(int)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_SchoolYear()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getSchoolYear();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.AcademicSession#getSchoolYear <em>School Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School Year</em>' attribute.
	 * @see #getSchoolYear()
	 * @generated
	 */
	void setSchoolYear(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"active"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_Type()
	 * @model default="active"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.AcademicSession#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getAcademicSession_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

} // AcademicSession
