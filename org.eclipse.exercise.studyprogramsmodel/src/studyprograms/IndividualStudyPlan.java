/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.IndividualStudyPlan#getStudentNo <em>Student No</em>}</li>
 *   <li>{@link studyprograms.IndividualStudyPlan#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getIndividualStudyPlan()
 * @model
 * @generated
 */
public interface IndividualStudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Student No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student No</em>' attribute.
	 * @see #setStudentNo(String)
	 * @see studyprograms.StudyprogramsPackage#getIndividualStudyPlan_StudentNo()
	 * @model
	 * @generated
	 */
	String getStudentNo();

	/**
	 * Sets the value of the '{@link studyprograms.IndividualStudyPlan#getStudentNo <em>Student No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student No</em>' attribute.
	 * @see #getStudentNo()
	 * @generated
	 */
	void setStudentNo(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getIndividualStudyPlan_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // IndividualStudyPlan
