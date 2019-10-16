/**
 */
package studyprograms.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import studyprograms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyprograms.StudyprogramsPackage
 * @generated
 */
public class StudyprogramsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyprogramsValidator INSTANCE = new StudyprogramsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyprograms";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyprogramsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyprogramsPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyprogramsPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case StudyprogramsPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case StudyprogramsPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_ACCESS:
				return validateCourseAccess((CourseAccess)value, diagnostics, context);
			case StudyprogramsPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case StudyprogramsPackage.LEVEL:
				return validateLevel((Level)value, diagnostics, context);
			case StudyprogramsPackage.AVAILABLE_SEMESTERS:
				return validateAvailableSemesters((AvailableSemesters)value, diagnostics, context);
			case StudyprogramsPackage.SEMESTER_TYPE:
				return validateSemesterType((SemesterType)value, diagnostics, context);
			case StudyprogramsPackage.ACCESS:
				return validateAccess((Access)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_duplicateSemester(programme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the duplicateSemester constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramme_duplicateSemester(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		for (int i = 0; i < programme.getSemesters().size(); i++) {
			for (int j = i + 1; j < programme.getSemesters().size(); j++) {
				if (programme.getSemesters().get(i).getSemesterCode().equals(programme.getSemesters().get(j).getSemesterCode())) {
					if (diagnostics != null) {
						diagnostics.add
							(createDiagnostic
								(Diagnostic.ERROR,
								 DIAGNOSTIC_SOURCE,
								 0,
								 "_UI_GenericConstraint_diagnostic",
								 new Object[] { "duplicateSemester", getObjectLabel(programme, context) },
								 new Object[] { programme },
								 context));
					}
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialisation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialisation_duplicateSemesters(specialisation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the duplicateSemesters constraint of '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSpecialisation_duplicateSemesters(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		for (int i = 0; i < specialisation.getSemesters().size(); i++) {
			for (int j = i + 1; j < specialisation.getSemesters().size(); j++) {
				if (specialisation.getSemesters().get(i).getSemesterCode().equals(specialisation.getSemesters().get(j).getSemesterCode())) {
					if (diagnostics != null) {
						diagnostics.add
							(createDiagnostic
								(Diagnostic.ERROR,
								 DIAGNOSTIC_SOURCE,
								 0,
								 "_UI_GenericConstraint_diagnostic",
								 new Object[] { "duplicateSemester", getObjectLabel(specialisation, context) },
								 new Object[] { specialisation },
								 context));
					}
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_availableCourses(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_toManyObligatoryCourses(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the availableCourses constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_availableCourses(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		for(CourseAccess courseaccess : semester.getCourseAccess()) {
			for(Course course: courseaccess.getCourses()) {
				if(course.getAvailableSemester().getValue() != semester.getSemesterType().getValue() && course.getAvailableSemester().getValue() != 2) {
					if (diagnostics != null) {
						diagnostics.add
						(createDiagnostic
								(Diagnostic.ERROR,
										DIAGNOSTIC_SOURCE,
										0,
										"_UI_GenericConstraint_diagnostic",
										new Object[] { "availableCourses", getObjectLabel(semester, context) },
										new Object[] { semester },
										context));
					}
					return false;

					}
		
				}
			}
		return true;
	}

	/**
	 * Validates the toManyObligatoryCourses constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_toManyObligatoryCourses(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int totalObligatoryCredits = 0;
		for (CourseAccess courseAccess : semester.getCourseAccess()) {
			if (courseAccess.getAccess() == Access.O) {
				for(Course course : courseAccess.getCourses()) {
					totalObligatoryCredits += course.getEcts();
				}
			}
		}
		if (totalObligatoryCredits > 30) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "tooManyObligatoryCoursesThatSemester", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseAccess(CourseAccess courseAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevel(Level level, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailableSemesters(AvailableSemesters availableSemesters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccess(Access access, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyprogramsValidator
