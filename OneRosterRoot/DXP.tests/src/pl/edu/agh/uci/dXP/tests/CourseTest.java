/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.Course;
import pl.edu.agh.uci.dXP.DXPFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseTest extends BaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseTest.class);
	}

	/**
	 * Constructs a new Course test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Course getFixture() {
		return (Course)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DXPFactory.eINSTANCE.createCourse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CourseTest
