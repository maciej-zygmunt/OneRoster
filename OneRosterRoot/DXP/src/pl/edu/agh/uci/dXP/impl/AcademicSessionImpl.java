/**
 */
package pl.edu.agh.uci.dXP.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.edu.agh.uci.dXP.AcademicSession;
import pl.edu.agh.uci.dXP.Course;
import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Academic Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getSchoolYear <em>School Year</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getType <em>Type</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcademicSessionImpl extends BaseImpl implements AcademicSession {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchoolYear() <em>School Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolYear()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHOOL_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSchoolYear() <em>School Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolYear()
	 * @generated
	 * @ordered
	 */
	protected int schoolYear = SCHOOL_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "active";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcademicSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DXPPackage.Literals.ACADEMIC_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ACADEMIC_SESSION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ACADEMIC_SESSION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ACADEMIC_SESSION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSchoolYear() {
		return schoolYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchoolYear(int newSchoolYear) {
		int oldSchoolYear = schoolYear;
		schoolYear = newSchoolYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ACADEMIC_SESSION__SCHOOL_YEAR, oldSchoolYear, schoolYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DXPPackage.ACADEMIC_SESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, DXPPackage.ACADEMIC_SESSION__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, DXPPackage.ACADEMIC_SESSION__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DXPPackage.ACADEMIC_SESSION__COURSE:
				return ((InternalEList<?>)getCourse()).basicRemove(otherEnd, msgs);
			case DXPPackage.ACADEMIC_SESSION__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
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
			case DXPPackage.ACADEMIC_SESSION__TITLE:
				return getTitle();
			case DXPPackage.ACADEMIC_SESSION__START_DATE:
				return getStartDate();
			case DXPPackage.ACADEMIC_SESSION__END_DATE:
				return getEndDate();
			case DXPPackage.ACADEMIC_SESSION__SCHOOL_YEAR:
				return getSchoolYear();
			case DXPPackage.ACADEMIC_SESSION__TYPE:
				return getType();
			case DXPPackage.ACADEMIC_SESSION__COURSE:
				return getCourse();
			case DXPPackage.ACADEMIC_SESSION__USER:
				return getUser();
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
			case DXPPackage.ACADEMIC_SESSION__TITLE:
				setTitle((String)newValue);
				return;
			case DXPPackage.ACADEMIC_SESSION__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case DXPPackage.ACADEMIC_SESSION__END_DATE:
				setEndDate((String)newValue);
				return;
			case DXPPackage.ACADEMIC_SESSION__SCHOOL_YEAR:
				setSchoolYear((Integer)newValue);
				return;
			case DXPPackage.ACADEMIC_SESSION__TYPE:
				setType((String)newValue);
				return;
			case DXPPackage.ACADEMIC_SESSION__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case DXPPackage.ACADEMIC_SESSION__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends User>)newValue);
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
			case DXPPackage.ACADEMIC_SESSION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DXPPackage.ACADEMIC_SESSION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case DXPPackage.ACADEMIC_SESSION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case DXPPackage.ACADEMIC_SESSION__SCHOOL_YEAR:
				setSchoolYear(SCHOOL_YEAR_EDEFAULT);
				return;
			case DXPPackage.ACADEMIC_SESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DXPPackage.ACADEMIC_SESSION__COURSE:
				getCourse().clear();
				return;
			case DXPPackage.ACADEMIC_SESSION__USER:
				getUser().clear();
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
			case DXPPackage.ACADEMIC_SESSION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DXPPackage.ACADEMIC_SESSION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case DXPPackage.ACADEMIC_SESSION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case DXPPackage.ACADEMIC_SESSION__SCHOOL_YEAR:
				return schoolYear != SCHOOL_YEAR_EDEFAULT;
			case DXPPackage.ACADEMIC_SESSION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DXPPackage.ACADEMIC_SESSION__COURSE:
				return course != null && !course.isEmpty();
			case DXPPackage.ACADEMIC_SESSION__USER:
				return user != null && !user.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", schoolYear: ");
		result.append(schoolYear);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AcademicSessionImpl
