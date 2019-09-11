/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.DXPFactory;
import pl.edu.agh.uci.dXP.Enrolment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enrolment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnrolmentTest extends BaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnrolmentTest.class);
	}

	/**
	 * Constructs a new Enrolment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrolmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enrolment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Enrolment getFixture() {
		return (Enrolment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DXPFactory.eINSTANCE.createEnrolment());
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

} //EnrolmentTest
