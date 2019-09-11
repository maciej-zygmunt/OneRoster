/**
 */
package pl.edu.agh.uci.dXP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.Role;
import pl.edu.agh.uci.dXP.User;
import pl.edu.agh.uci.dXP.UserId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.UserImpl#getEnabledUser <em>Enabled User</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.UserImpl#getUserid <em>Userid</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.UserImpl#getRole <em>Role</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.UserImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends BaseImpl implements User {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabledUser() <em>Enabled User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledUser()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledUser() <em>Enabled User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledUser()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabledUser = ENABLED_USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserid() <em>Userid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected EList<UserId> userid;

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
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DXPPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabledUser() {
		return enabledUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabledUser(Boolean newEnabledUser) {
		Boolean oldEnabledUser = enabledUser;
		enabledUser = newEnabledUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.USER__ENABLED_USER, oldEnabledUser, enabledUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserId> getUserid() {
		if (userid == null) {
			userid = new EObjectContainmentEList<UserId>(UserId.class, this, DXPPackage.USER__USERID);
		}
		return userid;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.USER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.USER__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DXPPackage.USER__USERID:
				return ((InternalEList<?>)getUserid()).basicRemove(otherEnd, msgs);
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
			case DXPPackage.USER__USER_NAME:
				return getUserName();
			case DXPPackage.USER__ENABLED_USER:
				return getEnabledUser();
			case DXPPackage.USER__USERID:
				return getUserid();
			case DXPPackage.USER__ROLE:
				return getRole();
			case DXPPackage.USER__IDENTIFIER:
				return getIdentifier();
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
			case DXPPackage.USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case DXPPackage.USER__ENABLED_USER:
				setEnabledUser((Boolean)newValue);
				return;
			case DXPPackage.USER__USERID:
				getUserid().clear();
				getUserid().addAll((Collection<? extends UserId>)newValue);
				return;
			case DXPPackage.USER__ROLE:
				setRole((Role)newValue);
				return;
			case DXPPackage.USER__IDENTIFIER:
				setIdentifier((String)newValue);
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
			case DXPPackage.USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case DXPPackage.USER__ENABLED_USER:
				setEnabledUser(ENABLED_USER_EDEFAULT);
				return;
			case DXPPackage.USER__USERID:
				getUserid().clear();
				return;
			case DXPPackage.USER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DXPPackage.USER__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
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
			case DXPPackage.USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case DXPPackage.USER__ENABLED_USER:
				return ENABLED_USER_EDEFAULT == null ? enabledUser != null : !ENABLED_USER_EDEFAULT.equals(enabledUser);
			case DXPPackage.USER__USERID:
				return userid != null && !userid.isEmpty();
			case DXPPackage.USER__ROLE:
				return role != ROLE_EDEFAULT;
			case DXPPackage.USER__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
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
		result.append(" (userName: ");
		result.append(userName);
		result.append(", enabledUser: ");
		result.append(enabledUser);
		result.append(", role: ");
		result.append(role);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //UserImpl
