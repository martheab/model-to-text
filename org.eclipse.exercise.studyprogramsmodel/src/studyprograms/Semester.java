/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Semester#getSemesterCode <em>Semester Code</em>}</li>
 *   <li>{@link studyprograms.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link studyprograms.Semester#getCourseAccess <em>Course Access</em>}</li>
 *   <li>{@link studyprograms.Semester#getSemesterType <em>Semester Type</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='availableCourses toManyObligatoryCourses'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see studyprograms.StudyprogramsPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Course Access</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.CourseAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Access</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getSemester_CourseAccess()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseAccess> getCourseAccess();

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see studyprograms.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see studyprograms.StudyprogramsPackage#getSemester_SemesterType()
	 * @model ordered="false"
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see studyprograms.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Semester Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Code</em>' attribute.
	 * @see studyprograms.StudyprogramsPackage#getSemester_SemesterCode()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getSemesterCode();

} // Semester
