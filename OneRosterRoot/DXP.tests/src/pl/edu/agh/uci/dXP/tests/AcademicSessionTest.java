/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.AcademicSession;
import pl.edu.agh.uci.dXP.DXPFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Academic Session</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcademicSessionTest extends BaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcademicSessionTest.class);
	}

	/**
	 * Constructs a new Academic Session test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademicSessionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Academic Session test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AcademicSession getFixture() {
		return (AcademicSession)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DXPFactory.eINSTANCE.createAcademicSession());
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

} //AcademicSessionTest
