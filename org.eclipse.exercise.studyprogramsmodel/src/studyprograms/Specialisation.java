/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.Specialisation#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyprograms.Specialisation#getStartSemester <em>Start Semester</em>}</li>
 *   <li>{@link studyprograms.Specialisation#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getSpecialisation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='duplicateSemesters'"
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getSpecialisation_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Start Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Semester</em>' attribute.
	 * @see #setStartSemester(int)
	 * @see studyprograms.StudyprogramsPackage#getSpecialisation_StartSemester()
	 * @model
	 * @generated
	 */
	int getStartSemester();

	/**
	 * Sets the value of the '{@link studyprograms.Specialisation#getStartSemester <em>Start Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Semester</em>' attribute.
	 * @see #getStartSemester()
	 * @generated
	 */
	void setStartSemester(int value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getSpecialisation_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecializations();

} // Specialisation
