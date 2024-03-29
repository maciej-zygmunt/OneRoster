/**
 */
package pl.edu.agh.uci.dXP.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pl.edu.agh.uci.dXP.DXPFactory;
import pl.edu.agh.uci.dXP.Metadata;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataTest extends TestCase {

	/**
	 * The fixture for this Metadata test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metadata fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetadataTest.class);
	}

	/**
	 * Constructs a new Metadata test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Metadata test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Metadata fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Metadata test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metadata getFixture() {
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
		setFixture(DXPFactory.eINSTANCE.createMetadata());
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

} //MetadataTest
