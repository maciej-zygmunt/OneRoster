/**
 */
package pl.edu.agh.uci.dXP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.Enrolment;
import pl.edu.agh.uci.dXP.OrgUnit;
import pl.edu.agh.uci.dXP.Role;
import pl.edu.agh.uci.dXP.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enrolment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl#getUser <em>User</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl#getOrgunit <em>Orgunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnrolmentImpl extends BaseImpl implements Enrolment {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.STUDENT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMARY_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected Boolean primary = PRIMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected pl.edu.agh.uci.dXP.Class class_;

	/**
	 * The cached value of the '{@link #getOrgunit() <em>Orgunit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgunit()
	 * @generated
	 * @ordered
	 */
	protected OrgUnit orgunit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnrolmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DXPPackage.Literals.ENROLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ENROLMENT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimary(Boolean newPrimary) {
		Boolean oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ENROLMENT__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DXPPackage.ENROLMENT__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ENROLMENT__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public pl.edu.agh.uci.dXP.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (pl.edu.agh.uci.dXP.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DXPPackage.ENROLMENT__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pl.edu.agh.uci.dXP.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(pl.edu.agh.uci.dXP.Class newClass) {
		pl.edu.agh.uci.dXP.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ENROLMENT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgUnit getOrgunit() {
		if (orgunit != null && orgunit.eIsProxy()) {
			InternalEObject oldOrgunit = (InternalEObject)orgunit;
			orgunit = (OrgUnit)eResolveProxy(oldOrgunit);
			if (orgunit != oldOrgunit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DXPPackage.ENROLMENT__ORGUNIT, oldOrgunit, orgunit));
			}
		}
		return orgunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit basicGetOrgunit() {
		return orgunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrgunit(OrgUnit newOrgunit) {
		OrgUnit oldOrgunit = orgunit;
		orgunit = newOrgunit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ENROLMENT__ORGUNIT, oldOrgunit, orgunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DXPPackage.ENROLMENT__ROLE:
				return getRole();
			case DXPPackage.ENROLMENT__PRIMARY:
				return getPrimary();
			case DXPPackage.ENROLMENT__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case DXPPackage.ENROLMENT__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case DXPPackage.ENROLMENT__ORGUNIT:
				if (resolve) return getOrgunit();
				return basicGetOrgunit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DXPPackage.ENROLMENT__ROLE:
				setRole((Role)newValue);
				return;
			case DXPPackage.ENROLMENT__PRIMARY:
				setPrimary((Boolean)newValue);
				return;
			case DXPPackage.ENROLMENT__USER:
				setUser((User)newValue);
				return;
			case DXPPackage.ENROLMENT__CLASS:
				setClass((pl.edu.agh.uci.dXP.Class)newValue);
				return;
			case DXPPackage.ENROLMENT__ORGUNIT:
				setOrgunit((OrgUnit)newValue);
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
			case DXPPackage.ENROLMENT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DXPPackage.ENROLMENT__PRIMARY:
				setPrimary(PRIMARY_EDEFAULT);
				return;
			case DXPPackage.ENROLMENT__USER:
				setUser((User)null);
				return;
			case DXPPackage.ENROLMENT__CLASS:
				setClass((pl.edu.agh.uci.dXP.Class)null);
				return;
			case DXPPackage.ENROLMENT__ORGUNIT:
				setOrgunit((OrgUnit)null);
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
			case DXPPackage.ENROLMENT__ROLE:
				return role != ROLE_EDEFAULT;
			case DXPPackage.ENROLMENT__PRIMARY:
				return PRIMARY_EDEFAULT == null ? primary != null : !PRIMARY_EDEFAULT.equals(primary);
			case DXPPackage.ENROLMENT__USER:
				return user != null;
			case DXPPackage.ENROLMENT__CLASS:
				return class_ != null;
			case DXPPackage.ENROLMENT__ORGUNIT:
				return orgunit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(", primary: ");
		result.append(primary);
		result.append(')');
		return result.toString();
	}

} //EnrolmentImpl
