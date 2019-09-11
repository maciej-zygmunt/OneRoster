/**
 */
package pl.edu.agh.uci.dXP.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pl.edu.agh.uci.dXP.AcademicSession;
import pl.edu.agh.uci.dXP.Course;
import pl.edu.agh.uci.dXP.DXPFactory;
import pl.edu.agh.uci.dXP.DXPPackage;
import pl.edu.agh.uci.dXP.Enrolment;
import pl.edu.agh.uci.dXP.Metadata;
import pl.edu.agh.uci.dXP.OneRoster;
import pl.edu.agh.uci.dXP.Org;
import pl.edu.agh.uci.dXP.OrgType;
import pl.edu.agh.uci.dXP.OrgUnit;
import pl.edu.agh.uci.dXP.Role;
import pl.edu.agh.uci.dXP.User;
import pl.edu.agh.uci.dXP.UserId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DXPFactoryImpl extends EFactoryImpl implements DXPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DXPFactory init() {
		try {
			DXPFactory theDXPFactory = (DXPFactory)EPackage.Registry.INSTANCE.getEFactory(DXPPackage.eNS_URI);
			if (theDXPFactory != null) {
				return theDXPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DXPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DXPFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DXPPackage.ONE_ROSTER: return createOneRoster();
			case DXPPackage.COURSE: return createCourse();
			case DXPPackage.ACADEMIC_SESSION: return createAcademicSession();
			case DXPPackage.CLASS: return createClass();
			case DXPPackage.USER: return createUser();
			case DXPPackage.USER_ID: return createUserId();
			case DXPPackage.ORG: return createOrg();
			case DXPPackage.ORG_UNIT: return createOrgUnit();
			case DXPPackage.ENROLMENT: return createEnrolment();
			case DXPPackage.METADATA: return createMetadata();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DXPPackage.ORG_TYPE:
				return createOrgTypeFromString(eDataType, initialValue);
			case DXPPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DXPPackage.ORG_TYPE:
				return convertOrgTypeToString(eDataType, instanceValue);
			case DXPPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneRoster createOneRoster() {
		OneRosterImpl oneRoster = new OneRosterImpl();
		return oneRoster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcademicSession createAcademicSession() {
		AcademicSessionImpl academicSession = new AcademicSessionImpl();
		return academicSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public pl.edu.agh.uci.dXP.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserId createUserId() {
		UserIdImpl userId = new UserIdImpl();
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Org createOrg() {
		OrgImpl org = new OrgImpl();
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enrolment createEnrolment() {
		EnrolmentImpl enrolment = new EnrolmentImpl();
		return enrolment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgType createOrgTypeFromString(EDataType eDataType, String initialValue) {
		OrgType result = OrgType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrgTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DXPPackage getDXPPackage() {
		return (DXPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DXPPackage getPackage() {
		return DXPPackage.eINSTANCE;
	}

} //DXPFactoryImpl
