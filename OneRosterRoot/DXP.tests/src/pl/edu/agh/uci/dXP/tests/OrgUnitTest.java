/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.DXPFactory;
import pl.edu.agh.uci.dXP.OrgUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Org Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrgUnitTest extends OrgTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrgUnitTest.class);
	}

	/**
	 * Constructs a new Org Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Org Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrgUnit getFixture() {
		return (OrgUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DXPFactory.eINSTANCE.createOrgUnit());
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

} //OrgUnitTest
