/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.DXPFactory;
import pl.edu.agh.uci.dXP.OneRoster;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>One Roster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneRosterTest extends TestCase {

	/**
	 * The fixture for this One Roster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneRoster fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OneRosterTest.class);
	}

	/**
	 * Constructs a new One Roster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneRosterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this One Roster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OneRoster fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this One Roster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneRoster getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DXPFactory.eINSTANCE.createOneRoster());
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

} //OneRosterTest
