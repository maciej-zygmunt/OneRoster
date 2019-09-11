/**
 */
package pl.edu.agh.uci.dXP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.edu.agh.uci.dXP.AcademicSession;
import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.Enrolment;
import pl.edu.agh.uci.dXP.OneRoster;
import pl.edu.agh.uci.dXP.Org;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Roster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.OneRosterImpl#getAcademicsession <em>Academicsession</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.OneRosterImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.OneRosterImpl#getEnrolment <em>Enrolment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneRosterImpl extends MinimalEObjectImpl.Container implements OneRoster {
	/**
	 * The cached value of the '{@link #getAcademicsession() <em>Academicsession</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcademicsession()
	 * @generated
	 * @ordered
	 */
	protected EList<AcademicSession> academicsession;

	/**
	 * The cached value of the '{@link #getOrg() <em>Org</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrg()
	 * @generated
	 * @ordered
	 */
	protected EList<Org> org;

	/**
	 * The cached value of the '{@link #getEnrolment() <em>Enrolment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolment()
	 * @generated
	 * @ordered
	 */
	protected EList<Enrolment> enrolment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneRosterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DXPPackage.Literals.ONE_ROSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcademicSession> getAcademicsession() {
		if (academicsession == null) {
			academicsession = new EObjectContainmentEList<AcademicSession>(AcademicSession.class, this, DXPPackage.ONE_ROSTER__ACADEMICSESSION);
		}
		return academicsession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Org> getOrg() {
		if (org == null) {
			org = new EObjectContainmentEList<Org>(Org.class, this, DXPPackage.ONE_ROSTER__ORG);
		}
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enrolment> getEnrolment() {
		if (enrolment == null) {
			enrolment = new EObjectContainmentEList<Enrolment>(Enrolment.class, this, DXPPackage.ONE_ROSTER__ENROLMENT);
		}
		return enrolment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DXPPackage.ONE_ROSTER__ACADEMICSESSION:
				return ((InternalEList<?>)getAcademicsession()).basicRemove(otherEnd, msgs);
			case DXPPackage.ONE_ROSTER__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DXPPackage.ONE_ROSTER__ENROLMENT:
				return ((InternalEList<?>)getEnrolment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DXPPackage.ONE_ROSTER__ACADEMICSESSION:
				return getAcademicsession();
			case DXPPackage.ONE_ROSTER__ORG:
				return getOrg();
			case DXPPackage.ONE_ROSTER__ENROLMENT:
				return getEnrolment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DXPPackage.ONE_ROSTER__ACADEMICSESSION:
				getAcademicsession().clear();
				getAcademicsession().addAll((Collection<? extends AcademicSession>)newValue);
				return;
			case DXPPackage.ONE_ROSTER__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends Org>)newValue);
				return;
			case DXPPackage.ONE_ROSTER__ENROLMENT:
				getEnrolment().clear();
				getEnrolment().addAll((Collection<? extends Enrolment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DXPPackage.ONE_ROSTER__ACADEMICSESSION:
				getAcademicsession().clear();
				return;
			case DXPPackage.ONE_ROSTER__ORG:
				getOrg().clear();
				return;
			case DXPPackage.ONE_ROSTER__ENROLMENT:
				getEnrolment().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DXPPackage.ONE_ROSTER__ACADEMICSESSION:
				return academicsession != null && !academicsession.isEmpty();
			case DXPPackage.ONE_ROSTER__ORG:
				return org != null && !org.isEmpty();
			case DXPPackage.ONE_ROSTER__ENROLMENT:
				return enrolment != null && !enrolment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OneRosterImpl
