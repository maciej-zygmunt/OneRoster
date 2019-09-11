/**
 */
package pl.edu.agh.uci.dXP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pl.edu.agh.uci.dXP.Base#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Base#getStatus <em>Status</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Base#getDateLastModified <em>Date Last Modified</em>}</li>
 *   <li>{@link pl.edu.agh.uci.dXP.Base#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see pl.edu.agh.uci.dXP.DXPPackage#getBase()
 * @model abstract="true"
 * @generated
 */
public interface Base extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' attribute.
	 * @see #setSourceId(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getBase_SourceId()
	 * @model id="true"
	 * @generated
	 */
	String getSourceId();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Base#getSourceId <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' attribute.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"active"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getBase_Status()
	 * @model default="active" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Base#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Date Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Modified</em>' attribute.
	 * @see #setDateLastModified(String)
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getBase_DateLastModified()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDateLastModified();

	/**
	 * Sets the value of the '{@link pl.edu.agh.uci.dXP.Base#getDateLastModified <em>Date Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Modified</em>' attribute.
	 * @see #getDateLastModified()
	 * @generated
	 */
	void setDateLastModified(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link pl.edu.agh.uci.dXP.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see pl.edu.agh.uci.dXP.DXPPackage#getBase_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // Base
