/**
 */
package studyprograms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import studyprograms.AvailableSemesters;
import studyprograms.Course;
import studyprograms.Level;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getEcts <em>Ects</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getAvailableSemester <em>Available Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcts() <em>Ects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcts()
	 * @generated
	 * @ordered
	 */
	protected static final float ECTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEcts() <em>Ects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcts()
	 * @generated
	 * @ordered
	 */
	protected float ects = ECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level LEVEL_EDEFAULT = Level.BACHELOR;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableSemester() <em>Available Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSemester()
	 * @generated
	 * @ordered
	 */
	protected static final AvailableSemesters AVAILABLE_SEMESTER_EDEFAULT = AvailableSemesters.FALL;

	/**
	 * The cached value of the '{@link #getAvailableSemester() <em>Available Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSemester()
	 * @generated
	 * @ordered
	 */
	protected AvailableSemesters availableSemester = AVAILABLE_SEMESTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getEcts() {
		return ects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEcts(float newEcts) {
		float oldEcts = ects;
		ects = newEcts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__ECTS, oldEcts, ects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvailableSemesters getAvailableSemester() {
		return availableSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableSemester(AvailableSemesters newAvailableSemester) {
		AvailableSemesters oldAvailableSemester = availableSemester;
		availableSemester = newAvailableSemester == null ? AVAILABLE_SEMESTER_EDEFAULT : newAvailableSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__AVAILABLE_SEMESTER, oldAvailableSemester, availableSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE__CODE:
				return getCode();
			case StudyprogramsPackage.COURSE__NAME:
				return getName();
			case StudyprogramsPackage.COURSE__ECTS:
				return getEcts();
			case StudyprogramsPackage.COURSE__LEVEL:
				return getLevel();
			case StudyprogramsPackage.COURSE__AVAILABLE_SEMESTER:
				return getAvailableSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case StudyprogramsPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case StudyprogramsPackage.COURSE__ECTS:
				setEcts((Float)newValue);
				return;
			case StudyprogramsPackage.COURSE__LEVEL:
				setLevel((Level)newValue);
				return;
			case StudyprogramsPackage.COURSE__AVAILABLE_SEMESTER:
				setAvailableSemester((AvailableSemesters)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__ECTS:
				setEcts(ECTS_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__AVAILABLE_SEMESTER:
				setAvailableSemester(AVAILABLE_SEMESTER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyprogramsPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramsPackage.COURSE__ECTS:
				return ects != ECTS_EDEFAULT;
			case StudyprogramsPackage.COURSE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case StudyprogramsPackage.COURSE__AVAILABLE_SEMESTER:
				return availableSemester != AVAILABLE_SEMESTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", ects: ");
		result.append(ects);
		result.append(", level: ");
		result.append(level);
		result.append(", availableSemester: ");
		result.append(availableSemester);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
