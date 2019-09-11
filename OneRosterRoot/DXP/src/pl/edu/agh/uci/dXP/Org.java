/**
 */
package pl.edu.agh.uci.dXP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.Org#getName <em>Name</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Org#getType <em>Type</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Org#getOrgunit <em>Orgunit</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getOrg()
 * @model
 * @generated
 */
public interface Org extends Base {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getOrg_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Org#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pl.edu.agh.uci.dXP.OrgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pl.edu.agh.uci.dXP.OrgType
	 * @see #setType(OrgType)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getOrg_Type()
	 * @model
	 * @generated
	 */
	OrgType getType();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Org#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pl.edu.agh.uci.dXP.OrgType
	 * @see #getType()
	 * @generated
	 */
	void setType(OrgType value);

	/**
	 * Returns the value of the '<em><b>Orgunit</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.OrgUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgunit</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getOrg_Orgunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrgUnit> getOrgunit();

} // Org
