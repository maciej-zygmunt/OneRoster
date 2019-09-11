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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.edu.agh.uci.dXP.Base;
import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.Metadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.BaseImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.BaseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.BaseImpl#getDateLastModified <em>Date Last Modified</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.BaseImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseImpl extends MinimalEObjectImpl.Container implements Base {
	/**
	 * The default value of the '{@link #getSourceId() <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected String sourceId = SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = "active";

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastModified() <em>Date Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastModified() <em>Date Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastModified()
	 * @generated
	 * @ordered
	 */
	protected String dateLastModified = DATE_LAST_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DXPPackage.Literals.BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceId(String newSourceId) {
		String oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.BASE__SOURCE_ID, oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.BASE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateLastModified() {
		return dateLastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateLastModified(String newDateLastModified) {
		String oldDateLastModified = dateLastModified;
		dateLastModified = newDateLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.BASE__DATE_LAST_MODIFIED, oldDateLastModified, dateLastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, DXPPackage.BASE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DXPPackage.BASE__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case DXPPackage.BASE__SOURCE_ID:
				return getSourceId();
			case DXPPackage.BASE__STATUS:
				return getStatus();
			case DXPPackage.BASE__DATE_LAST_MODIFIED:
				return getDateLastModified();
			case DXPPackage.BASE__METADATA:
				return getMetadata();
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
			case DXPPackage.BASE__SOURCE_ID:
				setSourceId((String)newValue);
				return;
			case DXPPackage.BASE__STATUS:
				setStatus((String)newValue);
				return;
			case DXPPackage.BASE__DATE_LAST_MODIFIED:
				setDateLastModified((String)newValue);
				return;
			case DXPPackage.BASE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
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
			case DXPPackage.BASE__SOURCE_ID:
				setSourceId(SOURCE_ID_EDEFAULT);
				return;
			case DXPPackage.BASE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case DXPPackage.BASE__DATE_LAST_MODIFIED:
				setDateLastModified(DATE_LAST_MODIFIED_EDEFAULT);
				return;
			case DXPPackage.BASE__METADATA:
				getMetadata().clear();
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
			case DXPPackage.BASE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceId != null : !SOURCE_ID_EDEFAULT.equals(sourceId);
			case DXPPackage.BASE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case DXPPackage.BASE__DATE_LAST_MODIFIED:
				return DATE_LAST_MODIFIED_EDEFAULT == null ? dateLastModified != null : !DATE_LAST_MODIFIED_EDEFAULT.equals(dateLastModified);
			case DXPPackage.BASE__METADATA:
				return metadata != null && !metadata.isEmpty();
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
		result.append(" (sourceId: ");
		result.append(sourceId);
		result.append(", status: ");
		result.append(status);
		result.append(", dateLastModified: ");
		result.append(dateLastModified);
		result.append(')');
		return result.toString();
	}

} //BaseImpl
