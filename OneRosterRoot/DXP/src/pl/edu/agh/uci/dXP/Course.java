/**
 */
package pl.edu.agh.uci.dXP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.Course#getTitle <em>Title</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Course#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends Base {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getCourse_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Course#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getCourse_CourseCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getCourse_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<pl.edu.agh.uci.dXP.Class> getClass_();

} // Course
