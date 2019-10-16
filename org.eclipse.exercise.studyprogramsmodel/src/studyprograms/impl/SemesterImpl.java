/**
 */
package studyprograms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import studyprograms.CourseAccess;
import studyprograms.Semester;
import studyprograms.SemesterType;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.SemesterImpl#getSemesterCode <em>Semester Code</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getCourseAccess <em>Course Access</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getSemesterType <em>Semester Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterCode() <em>Semester Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemesterCode() <em>Semester Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCode()
	 * @generated
	 * @ordered
	 */
	protected String semesterCode = SEMESTER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseAccess() <em>Course Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseAccess> courseAccess;

	/**
	 * The default value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterType SEMESTER_TYPE_EDEFAULT = SemesterType.FALL;

	/**
	 * The cached value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected SemesterType semesterType = SEMESTER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseAccess> getCourseAccess() {
		if (courseAccess == null) {
			courseAccess = new EObjectContainmentEList<CourseAccess>(CourseAccess.class, this, StudyprogramsPackage.SEMESTER__COURSE_ACCESS);
		}
		return courseAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterType getSemesterType() {
		return semesterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterType(SemesterType newSemesterType) {
		SemesterType oldSemesterType = semesterType;
		semesterType = newSemesterType == null ? SEMESTER_TYPE_EDEFAULT : newSemesterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.SEMESTER__SEMESTER_TYPE, oldSemesterType, semesterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public String getSemesterCode() {
		return this.semesterType + " " + this.getYear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.SEMESTER__COURSE_ACCESS:
				return ((InternalEList<?>)getCourseAccess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramsPackage.SEMESTER__SEMESTER_CODE:
				return getSemesterCode();
			case StudyprogramsPackage.SEMESTER__YEAR:
				return getYear();
			case StudyprogramsPackage.SEMESTER__COURSE_ACCESS:
				return getCourseAccess();
			case StudyprogramsPackage.SEMESTER__SEMESTER_TYPE:
				return getSemesterType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramsPackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case StudyprogramsPackage.SEMESTER__COURSE_ACCESS:
				getCourseAccess().clear();
				getCourseAccess().addAll((Collection<? extends CourseAccess>)newValue);
				return;
			case StudyprogramsPackage.SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType)newValue);
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
			case StudyprogramsPackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case StudyprogramsPackage.SEMESTER__COURSE_ACCESS:
				getCourseAccess().clear();
				return;
			case StudyprogramsPackage.SEMESTER__SEMESTER_TYPE:
				setSemesterType(SEMESTER_TYPE_EDEFAULT);
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
			case StudyprogramsPackage.SEMESTER__SEMESTER_CODE:
				return SEMESTER_CODE_EDEFAULT == null ? semesterCode != null : !SEMESTER_CODE_EDEFAULT.equals(semesterCode);
			case StudyprogramsPackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case StudyprogramsPackage.SEMESTER__COURSE_ACCESS:
				return courseAccess != null && !courseAccess.isEmpty();
			case StudyprogramsPackage.SEMESTER__SEMESTER_TYPE:
				return semesterType != SEMESTER_TYPE_EDEFAULT;
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
		result.append(" (semesterCode: ");
		result.append(semesterCode);
		result.append(", year: ");
		result.append(year);
		result.append(", semesterType: ");
		result.append(semesterType);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
