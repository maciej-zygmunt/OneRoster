/**
 */
package pl.edu.agh.uci.dXP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pl.edu.agh.uci.dXP.DXPFactory
 * @model kind="package"
 * @generated
 */
public interface DXPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dXP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dXP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dXP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DXPPackage eINSTANCE = pl.edu.agh.uci.dXP.impl.DXPPackageImpl.init();

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.OneRosterImpl <em>One Roster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.OneRosterImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOneRoster()
	 * @generated
	 */
	int ONE_ROSTER = 0;

	/**
	 * The feature id for the '<em><b>Academicsession</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ROSTER__ACADEMICSESSION = 0;

	/**
	 * The feature id for the '<em><b>Org</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ROSTER__ORG = 1;

	/**
	 * The feature id for the '<em><b>Enrolment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ROSTER__ENROLMENT = 2;

	/**
	 * The number of structural features of the '<em>One Roster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ROSTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>One Roster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_ROSTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.BaseImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 2;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__SOURCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__DATE_LAST_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.CourseImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SOURCE_ID = BASE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STATUS = BASE__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DATE_LAST_MODIFIED = BASE__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__METADATA = BASE__METADATA;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TITLE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CLASS = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl <em>Academic Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.AcademicSessionImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getAcademicSession()
	 * @generated
	 */
	int ACADEMIC_SESSION = 3;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__SOURCE_ID = BASE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__STATUS = BASE__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__DATE_LAST_MODIFIED = BASE__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__METADATA = BASE__METADATA;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__TITLE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__START_DATE = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__END_DATE = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>School Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__SCHOOL_YEAR = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__TYPE = BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__COURSE = BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION__USER = BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Academic Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION_FEATURE_COUNT = BASE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Academic Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_SESSION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.ClassImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SOURCE_ID = BASE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STATUS = BASE__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DATE_LAST_MODIFIED = BASE__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METADATA = BASE__METADATA;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TITLE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_CODE = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_TYPE = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LOCATION = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.UserImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SOURCE_ID = BASE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATUS = BASE__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DATE_LAST_MODIFIED = BASE__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__METADATA = BASE__METADATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENABLED_USER = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERID = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IDENTIFIER = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.UserIdImpl <em>User Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.UserIdImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getUserId()
	 * @generated
	 */
	int USER_ID = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID__IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>User Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.OrgImpl <em>Org</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.OrgImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOrg()
	 * @generated
	 */
	int ORG = 7;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__SOURCE_ID = BASE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__STATUS = BASE__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__DATE_LAST_MODIFIED = BASE__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__METADATA = BASE__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__NAME = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__TYPE = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orgunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG__ORGUNIT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_FEATURE_COUNT = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.OrgUnitImpl <em>Org Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.OrgUnitImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOrgUnit()
	 * @generated
	 */
	int ORG_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__SOURCE_ID = ORG__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__STATUS = ORG__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__DATE_LAST_MODIFIED = ORG__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__METADATA = ORG__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__NAME = ORG__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__TYPE = ORG__TYPE;

	/**
	 * The feature id for the '<em><b>Orgunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__ORGUNIT = ORG__ORGUNIT;

	/**
	 * The number of structural features of the '<em>Org Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_FEATURE_COUNT = ORG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Org Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_OPERATION_COUNT = ORG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl <em>Enrolment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.EnrolmentImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getEnrolment()
	 * @generated
	 */
	int ENROLMENT = 9;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__SOURCE_ID = BASE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__STATUS = BASE__STATUS;

	/**
	 * The feature id for the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__DATE_LAST_MODIFIED = BASE__DATE_LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__METADATA = BASE__METADATA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__ROLE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__PRIMARY = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__USER = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__CLASS = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orgunit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT__ORGUNIT = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enrolment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Enrolment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLMENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.impl.MetadataImpl
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.OrgType <em>Org Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.OrgType
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOrgType()
	 * @generated
	 */
	int ORG_TYPE = 11;

	/**
	 * The meta object id for the '{@link pl.edu.agh.uci.dXP.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.edu.agh.uci.dXP.Role
	 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 12;


	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.OneRoster <em>One Roster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Roster</em>'.
	 * @see pl.edu.agh.uci.dXP.OneRoster
	 * @generated
	 */
	EClass getOneRoster();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.OneRoster#getAcademicsession <em>Academicsession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Academicsession</em>'.
	 * @see pl.edu.agh.uci.dXP.OneRoster#getAcademicsession()
	 * @see #getOneRoster()
	 * @generated
	 */
	EReference getOneRoster_Academicsession();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.OneRoster#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Org</em>'.
	 * @see pl.edu.agh.uci.dXP.OneRoster#getOrg()
	 * @see #getOneRoster()
	 * @generated
	 */
	EReference getOneRoster_Org();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.OneRoster#getEnrolment <em>Enrolment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enrolment</em>'.
	 * @see pl.edu.agh.uci.dXP.OneRoster#getEnrolment()
	 * @see #getOneRoster()
	 * @generated
	 */
	EReference getOneRoster_Enrolment();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see pl.edu.agh.uci.dXP.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Course#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pl.edu.agh.uci.dXP.Course#getTitle()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Title();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see pl.edu.agh.uci.dXP.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.Course#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see pl.edu.agh.uci.dXP.Course#getClass_()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Class();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see pl.edu.agh.uci.dXP.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Base#getSourceId <em>Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Id</em>'.
	 * @see pl.edu.agh.uci.dXP.Base#getSourceId()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_SourceId();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Base#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see pl.edu.agh.uci.dXP.Base#getStatus()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_Status();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Base#getDateLastModified <em>Date Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Modified</em>'.
	 * @see pl.edu.agh.uci.dXP.Base#getDateLastModified()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_DateLastModified();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.Base#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see pl.edu.agh.uci.dXP.Base#getMetadata()
	 * @see #getBase()
	 * @generated
	 */
	EReference getBase_Metadata();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.AcademicSession <em>Academic Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Academic Session</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession
	 * @generated
	 */
	EClass getAcademicSession();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.AcademicSession#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getTitle()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EAttribute getAcademicSession_Title();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.AcademicSession#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getStartDate()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EAttribute getAcademicSession_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.AcademicSession#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getEndDate()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EAttribute getAcademicSession_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.AcademicSession#getSchoolYear <em>School Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School Year</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getSchoolYear()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EAttribute getAcademicSession_SchoolYear();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.AcademicSession#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getType()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EAttribute getAcademicSession_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.AcademicSession#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getCourse()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EReference getAcademicSession_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.AcademicSession#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see pl.edu.agh.uci.dXP.AcademicSession#getUser()
	 * @see #getAcademicSession()
	 * @generated
	 */
	EReference getAcademicSession_User();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see pl.edu.agh.uci.dXP.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Class#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pl.edu.agh.uci.dXP.Class#getTitle()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Title();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Class#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see pl.edu.agh.uci.dXP.Class#getClassCode()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Class#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type</em>'.
	 * @see pl.edu.agh.uci.dXP.Class#getClassType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_ClassType();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Class#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see pl.edu.agh.uci.dXP.Class#getLocation()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Location();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see pl.edu.agh.uci.dXP.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see pl.edu.agh.uci.dXP.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.User#getEnabledUser <em>Enabled User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled User</em>'.
	 * @see pl.edu.agh.uci.dXP.User#getEnabledUser()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EnabledUser();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.User#getUserid <em>Userid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Userid</em>'.
	 * @see pl.edu.agh.uci.dXP.User#getUserid()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Userid();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see pl.edu.agh.uci.dXP.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Role();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.User#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see pl.edu.agh.uci.dXP.User#getIdentifier()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Identifier();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.UserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Id</em>'.
	 * @see pl.edu.agh.uci.dXP.UserId
	 * @generated
	 */
	EClass getUserId();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.UserId#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pl.edu.agh.uci.dXP.UserId#getType()
	 * @see #getUserId()
	 * @generated
	 */
	EAttribute getUserId_Type();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.UserId#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see pl.edu.agh.uci.dXP.UserId#getIdentifier()
	 * @see #getUserId()
	 * @generated
	 */
	EAttribute getUserId_Identifier();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.Org <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org</em>'.
	 * @see pl.edu.agh.uci.dXP.Org
	 * @generated
	 */
	EClass getOrg();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Org#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pl.edu.agh.uci.dXP.Org#getName()
	 * @see #getOrg()
	 * @generated
	 */
	EAttribute getOrg_Name();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Org#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pl.edu.agh.uci.dXP.Org#getType()
	 * @see #getOrg()
	 * @generated
	 */
	EAttribute getOrg_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.edu.agh.uci.dXP.Org#getOrgunit <em>Orgunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orgunit</em>'.
	 * @see pl.edu.agh.uci.dXP.Org#getOrgunit()
	 * @see #getOrg()
	 * @generated
	 */
	EReference getOrg_Orgunit();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Unit</em>'.
	 * @see pl.edu.agh.uci.dXP.OrgUnit
	 * @generated
	 */
	EClass getOrgUnit();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.Enrolment <em>Enrolment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrolment</em>'.
	 * @see pl.edu.agh.uci.dXP.Enrolment
	 * @generated
	 */
	EClass getEnrolment();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Enrolment#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see pl.edu.agh.uci.dXP.Enrolment#getRole()
	 * @see #getEnrolment()
	 * @generated
	 */
	EAttribute getEnrolment_Role();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Enrolment#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see pl.edu.agh.uci.dXP.Enrolment#getPrimary()
	 * @see #getEnrolment()
	 * @generated
	 */
	EAttribute getEnrolment_Primary();

	/**
	 * Returns the meta object for the reference '{@link pl.edu.agh.uci.dXP.Enrolment#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see pl.edu.agh.uci.dXP.Enrolment#getUser()
	 * @see #getEnrolment()
	 * @generated
	 */
	EReference getEnrolment_User();

	/**
	 * Returns the meta object for the reference '{@link pl.edu.agh.uci.dXP.Enrolment#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see pl.edu.agh.uci.dXP.Enrolment#getClass_()
	 * @see #getEnrolment()
	 * @generated
	 */
	EReference getEnrolment_Class();

	/**
	 * Returns the meta object for the reference '{@link pl.edu.agh.uci.dXP.Enrolment#getOrgunit <em>Orgunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orgunit</em>'.
	 * @see pl.edu.agh.uci.dXP.Enrolment#getOrgunit()
	 * @see #getEnrolment()
	 * @generated
	 */
	EReference getEnrolment_Orgunit();

	/**
	 * Returns the meta object for class '{@link pl.edu.agh.uci.dXP.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see pl.edu.agh.uci.dXP.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Metadata#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see pl.edu.agh.uci.dXP.Metadata#getKey()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Key();

	/**
	 * Returns the meta object for the attribute '{@link pl.edu.agh.uci.dXP.Metadata#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pl.edu.agh.uci.dXP.Metadata#getValue()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Value();

	/**
	 * Returns the meta object for enum '{@link pl.edu.agh.uci.dXP.OrgType <em>Org Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Org Type</em>'.
	 * @see pl.edu.agh.uci.dXP.OrgType
	 * @generated
	 */
	EEnum getOrgType();

	/**
	 * Returns the meta object for enum '{@link pl.edu.agh.uci.dXP.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see pl.edu.agh.uci.dXP.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DXPFactory getDXPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.OneRosterImpl <em>One Roster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.OneRosterImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOneRoster()
		 * @generated
		 */
		EClass ONE_ROSTER = eINSTANCE.getOneRoster();

		/**
		 * The meta object literal for the '<em><b>Academicsession</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ROSTER__ACADEMICSESSION = eINSTANCE.getOneRoster_Academicsession();

		/**
		 * The meta object literal for the '<em><b>Org</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ROSTER__ORG = eINSTANCE.getOneRoster_Org();

		/**
		 * The meta object literal for the '<em><b>Enrolment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_ROSTER__ENROLMENT = eINSTANCE.getOneRoster_Enrolment();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.CourseImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TITLE = eINSTANCE.getCourse_Title();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__CLASS = eINSTANCE.getCourse_Class();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.BaseImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__SOURCE_ID = eINSTANCE.getBase_SourceId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__STATUS = eINSTANCE.getBase_Status();

		/**
		 * The meta object literal for the '<em><b>Date Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__DATE_LAST_MODIFIED = eINSTANCE.getBase_DateLastModified();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE__METADATA = eINSTANCE.getBase_Metadata();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.AcademicSessionImpl <em>Academic Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.AcademicSessionImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getAcademicSession()
		 * @generated
		 */
		EClass ACADEMIC_SESSION = eINSTANCE.getAcademicSession();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_SESSION__TITLE = eINSTANCE.getAcademicSession_Title();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_SESSION__START_DATE = eINSTANCE.getAcademicSession_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_SESSION__END_DATE = eINSTANCE.getAcademicSession_EndDate();

		/**
		 * The meta object literal for the '<em><b>School Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_SESSION__SCHOOL_YEAR = eINSTANCE.getAcademicSession_SchoolYear();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_SESSION__TYPE = eINSTANCE.getAcademicSession_Type();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMIC_SESSION__COURSE = eINSTANCE.getAcademicSession_Course();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMIC_SESSION__USER = eINSTANCE.getAcademicSession_User();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.ClassImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TITLE = eINSTANCE.getClass_Title();

		/**
		 * The meta object literal for the '<em><b>Class Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CLASS_CODE = eINSTANCE.getClass_ClassCode();

		/**
		 * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CLASS_TYPE = eINSTANCE.getClass_ClassType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__LOCATION = eINSTANCE.getClass_Location();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.UserImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Enabled User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ENABLED_USER = eINSTANCE.getUser_EnabledUser();

		/**
		 * The meta object literal for the '<em><b>Userid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USERID = eINSTANCE.getUser_Userid();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ROLE = eINSTANCE.getUser_Role();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IDENTIFIER = eINSTANCE.getUser_Identifier();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.UserIdImpl <em>User Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.UserIdImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getUserId()
		 * @generated
		 */
		EClass USER_ID = eINSTANCE.getUserId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ID__TYPE = eINSTANCE.getUserId_Type();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ID__IDENTIFIER = eINSTANCE.getUserId_Identifier();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.OrgImpl <em>Org</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.OrgImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOrg()
		 * @generated
		 */
		EClass ORG = eINSTANCE.getOrg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG__NAME = eINSTANCE.getOrg_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG__TYPE = eINSTANCE.getOrg_Type();

		/**
		 * The meta object literal for the '<em><b>Orgunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG__ORGUNIT = eINSTANCE.getOrg_Orgunit();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.OrgUnitImpl <em>Org Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.OrgUnitImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOrgUnit()
		 * @generated
		 */
		EClass ORG_UNIT = eINSTANCE.getOrgUnit();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.EnrolmentImpl <em>Enrolment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.EnrolmentImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getEnrolment()
		 * @generated
		 */
		EClass ENROLMENT = eINSTANCE.getEnrolment();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLMENT__ROLE = eINSTANCE.getEnrolment_Role();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLMENT__PRIMARY = eINSTANCE.getEnrolment_Primary();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLMENT__USER = eINSTANCE.getEnrolment_User();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLMENT__CLASS = eINSTANCE.getEnrolment_Class();

		/**
		 * The meta object literal for the '<em><b>Orgunit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLMENT__ORGUNIT = eINSTANCE.getEnrolment_Orgunit();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.impl.MetadataImpl
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__KEY = eINSTANCE.getMetadata_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VALUE = eINSTANCE.getMetadata_Value();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.OrgType <em>Org Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.OrgType
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getOrgType()
		 * @generated
		 */
		EEnum ORG_TYPE = eINSTANCE.getOrgType();

		/**
		 * The meta object literal for the '{@link pl.edu.agh.uci.dXP.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.edu.agh.uci.dXP.Role
		 * @see pl.edu.agh.uci.dXP.impl.DXPPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //DXPPackage
