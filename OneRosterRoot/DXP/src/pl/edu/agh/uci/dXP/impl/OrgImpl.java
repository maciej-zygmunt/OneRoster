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
import pl.edu.agh.uci.dXP.Org;
import pl.edu.agh.uci.dXP.OrgType;
import pl.edu.agh.uci.dXP.OrgUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.OrgImpl#getName <em>Name</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.OrgImpl#getType <em>Type</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.OrgImpl#getOrgunit <em>Orgunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgImpl extends BaseImpl implements Org {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OrgType TYPE_EDEFAULT = OrgType.DEPARTMENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OrgType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrgunit() <em>Orgunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgunit()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgUnit> orgunit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DXPPackage.Literals.ORG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ORG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(OrgType newType) {
		OrgType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ORG__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgUnit> getOrgunit() {
		if (orgunit == null) {
			orgunit = new EObjectContainmentEList<OrgUnit>(OrgUnit.class, this, DXPPackage.ORG__ORGUNIT);
		}
		return orgunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DXPPackage.ORG__ORGUNIT:
				return ((InternalEList<?>)getOrgunit()).basicRemove(otherEnd, msgs);
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
			case DXPPackage.ORG__NAME:
				return getName();
			case DXPPackage.ORG__TYPE:
				return getType();
			case DXPPackage.ORG__ORGUNIT:
				return getOrgunit();
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
			case DXPPackage.ORG__NAME:
				setName((String)newValue);
				return;
			case DXPPackage.ORG__TYPE:
				setType((OrgType)newValue);
				return;
			case DXPPackage.ORG__ORGUNIT:
				getOrgunit().clear();
				getOrgunit().addAll((Collection<? extends OrgUnit>)newValue);
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
			case DXPPackage.ORG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DXPPackage.ORG__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DXPPackage.ORG__ORGUNIT:
				getOrgunit().clear();
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
			case DXPPackage.ORG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DXPPackage.ORG__TYPE:
				return type != TYPE_EDEFAULT;
			case DXPPackage.ORG__ORGUNIT:
				return orgunit != null && !orgunit.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OrgImpl
