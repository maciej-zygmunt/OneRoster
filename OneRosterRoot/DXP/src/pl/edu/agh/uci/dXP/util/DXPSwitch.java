/**
 */
package pl.edu.agh.uci.dXP.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pl.edu.agh.uci.dXP.AcademicSession;
import pl.edu.agh.uci.dXP.Base;
import pl.edu.agh.uci.dXP.Course;
import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.Enrolment;
import pl.edu.agh.uci.dXP.Metadata;
import pl.edu.agh.uci.dXP.OneRoster;
import pl.edu.agh.uci.dXP.Org;
import pl.edu.agh.uci.dXP.OrgUnit;
import pl.edu.agh.uci.dXP.User;
import pl.edu.agh.uci.dXP.UserId;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pl.edu.agh.uci.dXP.DXPPackage
 * @generated
 */
public class DXPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DXPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DXPSwitch() {
		if (modelPackage == null) {
			modelPackage = DXPPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DXPPackage.ONE_ROSTER: {
				OneRoster oneRoster = (OneRoster)theEObject;
				T result = caseOneRoster(oneRoster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.COURSE: {
				Course course = (Course)theEObject;
				T result = caseCourse(course);
				if (result == null) result = caseBase(course);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.ACADEMIC_SESSION: {
				AcademicSession academicSession = (AcademicSession)theEObject;
				T result = caseAcademicSession(academicSession);
				if (result == null) result = caseBase(academicSession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.CLASS: {
				pl.edu.agh.uci.dXP.Class class_ = (pl.edu.agh.uci.dXP.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseBase(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseBase(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.USER_ID: {
				UserId userId = (UserId)theEObject;
				T result = caseUserId(userId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.ORG: {
				Org org = (Org)theEObject;
				T result = caseOrg(org);
				if (result == null) result = caseBase(org);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.ORG_UNIT: {
				OrgUnit orgUnit = (OrgUnit)theEObject;
				T result = caseOrgUnit(orgUnit);
				if (result == null) result = caseOrg(orgUnit);
				if (result == null) result = caseBase(orgUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.ENROLMENT: {
				Enrolment enrolment = (Enrolment)theEObject;
				T result = caseEnrolment(enrolment);
				if (result == null) result = caseBase(enrolment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DXPPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Roster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Roster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneRoster(OneRoster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Academic Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Academic Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcademicSession(AcademicSession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(pl.edu.agh.uci.dXP.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserId(UserId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrg(Org object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgUnit(OrgUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrolment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrolment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrolment(Enrolment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DXPSwitch
