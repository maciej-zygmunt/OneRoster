/**
 */
package pl.edu.agh.uci.dXP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Roster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.OneRoster#getAcademicsession <em>Academicsession</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.OneRoster#getOrg <em>Org</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.OneRoster#getEnrolment <em>Enrolment</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getOneRoster()
 * @model
 * @generated
 */
public interface OneRoster extends EObject {
	/**
	 * Returns the value of the '<em><b>Academicsession</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.AcademicSession}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Academicsession</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getOneRoster_Academicsession()
	 * @model containment="true"
	 * @generated
	 */
	EList<AcademicSession> getAcademicsession();

	/**
	 * Returns the value of the '<em><b>Org</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.Org}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getOneRoster_Org()
	 * @model containment="true"
	 * @generated
	 */
	EList<Org> getOrg();

	/**
	 * Returns the value of the '<em><b>Enrolment</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.Enrolment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolment</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getOneRoster_Enrolment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enrolment> getEnrolment();

} // OneRoster
