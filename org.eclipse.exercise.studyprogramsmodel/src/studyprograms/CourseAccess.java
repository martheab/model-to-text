/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.CourseAccess#getAccess <em>Access</em>}</li>
 *   <li>{@link studyprograms.CourseAccess#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourseAccess()
 * @model
 * @generated
 */
public interface CourseAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.Access}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see studyprograms.Access
	 * @see #setAccess(Access)
	 * @see studyprograms.StudyprogramsPackage#getCourseAccess_Access()
	 * @model
	 * @generated
	 */
	Access getAccess();

	/**
	 * Sets the value of the '{@link studyprograms.CourseAccess#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see studyprograms.Access
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(Access value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourseAccess_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // CourseAccess
