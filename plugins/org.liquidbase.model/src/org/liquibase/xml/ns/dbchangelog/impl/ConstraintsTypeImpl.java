/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.ConstraintsType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getCheckConstraint <em>Check Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getDeleteCascade <em>Delete Cascade</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getForeignKeyName <em>Foreign Key Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getInitiallyDeferred <em>Initially Deferred</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getPrimaryKeyName <em>Primary Key Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getPrimaryKeyTablespace <em>Primary Key Tablespace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getReferencedColumnNames <em>Referenced Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getReferencedTableName <em>Referenced Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl#getUniqueConstraintName <em>Unique Constraint Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintsTypeImpl extends MinimalEObjectImpl.Container implements ConstraintsType {
	/**
	 * The default value of the '{@link #getCheckConstraint() <em>Check Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckConstraint() <em>Check Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckConstraint()
	 * @generated
	 * @ordered
	 */
	protected String checkConstraint = CHECK_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeferrable() <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrable()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFERRABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeferrable() <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrable()
	 * @generated
	 * @ordered
	 */
	protected Object deferrable = DEFERRABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteCascade() <em>Delete Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteCascade()
	 * @generated
	 * @ordered
	 */
	protected static final Object DELETE_CASCADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteCascade() <em>Delete Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteCascade()
	 * @generated
	 * @ordered
	 */
	protected Object deleteCascade = DELETE_CASCADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected String foreignKeyName = FOREIGN_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiallyDeferred() <em>Initially Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiallyDeferred()
	 * @generated
	 * @ordered
	 */
	protected static final Object INITIALLY_DEFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiallyDeferred() <em>Initially Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiallyDeferred()
	 * @generated
	 * @ordered
	 */
	protected Object initiallyDeferred = INITIALLY_DEFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected Object nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object PRIMARY_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected Object primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryKeyName() <em>Primary Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryKeyName() <em>Primary Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyName()
	 * @generated
	 * @ordered
	 */
	protected String primaryKeyName = PRIMARY_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryKeyTablespace() <em>Primary Key Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyTablespace()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_KEY_TABLESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryKeyTablespace() <em>Primary Key Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyTablespace()
	 * @generated
	 * @ordered
	 */
	protected String primaryKeyTablespace = PRIMARY_KEY_TABLESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencedColumnNames() <em>Referenced Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedColumnNames()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_COLUMN_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedColumnNames() <em>Referenced Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedColumnNames()
	 * @generated
	 * @ordered
	 */
	protected String referencedColumnNames = REFERENCED_COLUMN_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencedTableName() <em>Referenced Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedTableName() <em>Referenced Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableName()
	 * @generated
	 * @ordered
	 */
	protected String referencedTableName = REFERENCED_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected String references = REFERENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Object UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected Object unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueConstraintName() <em>Unique Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueConstraintName() <em>Unique Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueConstraintName = UNIQUE_CONSTRAINT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckConstraint() {
		return checkConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckConstraint(String newCheckConstraint) {
		String oldCheckConstraint = checkConstraint;
		checkConstraint = newCheckConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__CHECK_CONSTRAINT, oldCheckConstraint, checkConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDeferrable() {
		return deferrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferrable(Object newDeferrable) {
		Object oldDeferrable = deferrable;
		deferrable = newDeferrable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__DEFERRABLE, oldDeferrable, deferrable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDeleteCascade() {
		return deleteCascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteCascade(Object newDeleteCascade) {
		Object oldDeleteCascade = deleteCascade;
		deleteCascade = newDeleteCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__DELETE_CASCADE, oldDeleteCascade, deleteCascade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKeyName() {
		return foreignKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyName(String newForeignKeyName) {
		String oldForeignKeyName = foreignKeyName;
		foreignKeyName = newForeignKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__FOREIGN_KEY_NAME, oldForeignKeyName, foreignKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInitiallyDeferred() {
		return initiallyDeferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiallyDeferred(Object newInitiallyDeferred) {
		Object oldInitiallyDeferred = initiallyDeferred;
		initiallyDeferred = newInitiallyDeferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__INITIALLY_DEFERRED, oldInitiallyDeferred, initiallyDeferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(Object newNullable) {
		Object oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(Object newPrimaryKey) {
		Object oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryKeyName() {
		return primaryKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyName(String newPrimaryKeyName) {
		String oldPrimaryKeyName = primaryKeyName;
		primaryKeyName = newPrimaryKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_NAME, oldPrimaryKeyName, primaryKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryKeyTablespace() {
		return primaryKeyTablespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyTablespace(String newPrimaryKeyTablespace) {
		String oldPrimaryKeyTablespace = primaryKeyTablespace;
		primaryKeyTablespace = newPrimaryKeyTablespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE, oldPrimaryKeyTablespace, primaryKeyTablespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedColumnNames() {
		return referencedColumnNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedColumnNames(String newReferencedColumnNames) {
		String oldReferencedColumnNames = referencedColumnNames;
		referencedColumnNames = newReferencedColumnNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES, oldReferencedColumnNames, referencedColumnNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedTableName() {
		return referencedTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTableName(String newReferencedTableName) {
		String oldReferencedTableName = referencedTableName;
		referencedTableName = newReferencedTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME, oldReferencedTableName, referencedTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(String newReferences) {
		String oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(Object newUnique) {
		Object oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueConstraintName() {
		return uniqueConstraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueConstraintName(String newUniqueConstraintName) {
		String oldUniqueConstraintName = uniqueConstraintName;
		uniqueConstraintName = newUniqueConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME, oldUniqueConstraintName, uniqueConstraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.CONSTRAINTS_TYPE__CHECK_CONSTRAINT:
				return getCheckConstraint();
			case DbchangelogPackage.CONSTRAINTS_TYPE__DEFERRABLE:
				return getDeferrable();
			case DbchangelogPackage.CONSTRAINTS_TYPE__DELETE_CASCADE:
				return getDeleteCascade();
			case DbchangelogPackage.CONSTRAINTS_TYPE__FOREIGN_KEY_NAME:
				return getForeignKeyName();
			case DbchangelogPackage.CONSTRAINTS_TYPE__INITIALLY_DEFERRED:
				return getInitiallyDeferred();
			case DbchangelogPackage.CONSTRAINTS_TYPE__NULLABLE:
				return getNullable();
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY:
				return getPrimaryKey();
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_NAME:
				return getPrimaryKeyName();
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE:
				return getPrimaryKeyTablespace();
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES:
				return getReferencedColumnNames();
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME:
				return getReferencedTableName();
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCES:
				return getReferences();
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE:
				return getUnique();
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME:
				return getUniqueConstraintName();
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
			case DbchangelogPackage.CONSTRAINTS_TYPE__CHECK_CONSTRAINT:
				setCheckConstraint((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__DEFERRABLE:
				setDeferrable(newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__DELETE_CASCADE:
				setDeleteCascade(newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__FOREIGN_KEY_NAME:
				setForeignKeyName((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__INITIALLY_DEFERRED:
				setInitiallyDeferred(newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__NULLABLE:
				setNullable(newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY:
				setPrimaryKey(newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_NAME:
				setPrimaryKeyName((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE:
				setPrimaryKeyTablespace((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES:
				setReferencedColumnNames((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME:
				setReferencedTableName((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCES:
				setReferences((String)newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE:
				setUnique(newValue);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME:
				setUniqueConstraintName((String)newValue);
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
			case DbchangelogPackage.CONSTRAINTS_TYPE__CHECK_CONSTRAINT:
				setCheckConstraint(CHECK_CONSTRAINT_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__DEFERRABLE:
				setDeferrable(DEFERRABLE_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__DELETE_CASCADE:
				setDeleteCascade(DELETE_CASCADE_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__FOREIGN_KEY_NAME:
				setForeignKeyName(FOREIGN_KEY_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__INITIALLY_DEFERRED:
				setInitiallyDeferred(INITIALLY_DEFERRED_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_NAME:
				setPrimaryKeyName(PRIMARY_KEY_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE:
				setPrimaryKeyTablespace(PRIMARY_KEY_TABLESPACE_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES:
				setReferencedColumnNames(REFERENCED_COLUMN_NAMES_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME:
				setReferencedTableName(REFERENCED_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCES:
				setReferences(REFERENCES_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME:
				setUniqueConstraintName(UNIQUE_CONSTRAINT_NAME_EDEFAULT);
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
			case DbchangelogPackage.CONSTRAINTS_TYPE__CHECK_CONSTRAINT:
				return CHECK_CONSTRAINT_EDEFAULT == null ? checkConstraint != null : !CHECK_CONSTRAINT_EDEFAULT.equals(checkConstraint);
			case DbchangelogPackage.CONSTRAINTS_TYPE__DEFERRABLE:
				return DEFERRABLE_EDEFAULT == null ? deferrable != null : !DEFERRABLE_EDEFAULT.equals(deferrable);
			case DbchangelogPackage.CONSTRAINTS_TYPE__DELETE_CASCADE:
				return DELETE_CASCADE_EDEFAULT == null ? deleteCascade != null : !DELETE_CASCADE_EDEFAULT.equals(deleteCascade);
			case DbchangelogPackage.CONSTRAINTS_TYPE__FOREIGN_KEY_NAME:
				return FOREIGN_KEY_NAME_EDEFAULT == null ? foreignKeyName != null : !FOREIGN_KEY_NAME_EDEFAULT.equals(foreignKeyName);
			case DbchangelogPackage.CONSTRAINTS_TYPE__INITIALLY_DEFERRED:
				return INITIALLY_DEFERRED_EDEFAULT == null ? initiallyDeferred != null : !INITIALLY_DEFERRED_EDEFAULT.equals(initiallyDeferred);
			case DbchangelogPackage.CONSTRAINTS_TYPE__NULLABLE:
				return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY:
				return PRIMARY_KEY_EDEFAULT == null ? primaryKey != null : !PRIMARY_KEY_EDEFAULT.equals(primaryKey);
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_NAME:
				return PRIMARY_KEY_NAME_EDEFAULT == null ? primaryKeyName != null : !PRIMARY_KEY_NAME_EDEFAULT.equals(primaryKeyName);
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE:
				return PRIMARY_KEY_TABLESPACE_EDEFAULT == null ? primaryKeyTablespace != null : !PRIMARY_KEY_TABLESPACE_EDEFAULT.equals(primaryKeyTablespace);
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES:
				return REFERENCED_COLUMN_NAMES_EDEFAULT == null ? referencedColumnNames != null : !REFERENCED_COLUMN_NAMES_EDEFAULT.equals(referencedColumnNames);
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME:
				return REFERENCED_TABLE_NAME_EDEFAULT == null ? referencedTableName != null : !REFERENCED_TABLE_NAME_EDEFAULT.equals(referencedTableName);
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCES:
				return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE:
				return UNIQUE_EDEFAULT == null ? unique != null : !UNIQUE_EDEFAULT.equals(unique);
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME:
				return UNIQUE_CONSTRAINT_NAME_EDEFAULT == null ? uniqueConstraintName != null : !UNIQUE_CONSTRAINT_NAME_EDEFAULT.equals(uniqueConstraintName);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (checkConstraint: ");
		result.append(checkConstraint);
		result.append(", deferrable: ");
		result.append(deferrable);
		result.append(", deleteCascade: ");
		result.append(deleteCascade);
		result.append(", foreignKeyName: ");
		result.append(foreignKeyName);
		result.append(", initiallyDeferred: ");
		result.append(initiallyDeferred);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", primaryKeyName: ");
		result.append(primaryKeyName);
		result.append(", primaryKeyTablespace: ");
		result.append(primaryKeyTablespace);
		result.append(", referencedColumnNames: ");
		result.append(referencedColumnNames);
		result.append(", referencedTableName: ");
		result.append(referencedTableName);
		result.append(", references: ");
		result.append(references);
		result.append(", unique: ");
		result.append(unique);
		result.append(", uniqueConstraintName: ");
		result.append(uniqueConstraintName);
		result.append(')');
		return result.toString();
	}

} //ConstraintsTypeImpl
