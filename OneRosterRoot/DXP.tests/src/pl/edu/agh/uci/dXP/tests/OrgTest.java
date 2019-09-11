/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.DXPFactory;
import pl.edu.agh.uci.dXP.Org;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Org</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrgTest extends BaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrgTest.class);
	}

	/**
	 * Constructs a new Org test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Org test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Org getFixture() {
		return (Org)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DXPFactory.eINSTANCE.createOrg());
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

} //OrgTest
