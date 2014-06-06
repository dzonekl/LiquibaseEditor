/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Foreign Key Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getBaseColumnNames <em>Base Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getBaseTableCatalogName <em>Base Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getBaseTableName <em>Base Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getBaseTableSchemaName <em>Base Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getDeleteCascade <em>Delete Cascade</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getInitiallyDeferred <em>Initially Deferred</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getReferencedColumnNames <em>Referenced Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getReferencedTableCatalogName <em>Referenced Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getReferencedTableName <em>Referenced Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getReferencedTableSchemaName <em>Referenced Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl#getReferencesUniqueColumn <em>References Unique Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddForeignKeyConstraintTypeImpl extends MinimalEObjectImpl.Container implements AddForeignKeyConstraintType {
	/**
	 * The default value of the '{@link #getBaseColumnNames() <em>Base Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseColumnNames()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_COLUMN_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseColumnNames() <em>Base Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseColumnNames()
	 * @generated
	 * @ordered
	 */
	protected String baseColumnNames = BASE_COLUMN_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableCatalogName() <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableCatalogName() <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableCatalogName = BASE_TABLE_CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableName() <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableName() <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableName = BASE_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableSchemaName() <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableSchemaName() <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableSchemaName = BASE_TABLE_SCHEMA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final FkCascadeActionOptions ON_DELETE_EDEFAULT = FkCascadeActionOptions.CASCADE;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected FkCascadeActionOptions onDelete = ON_DELETE_EDEFAULT;

	/**
	 * This is true if the On Delete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onDeleteESet;

	/**
	 * The default value of the '{@link #getOnUpdate() <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final FkCascadeActionOptions ON_UPDATE_EDEFAULT = FkCascadeActionOptions.CASCADE;

	/**
	 * The cached value of the '{@link #getOnUpdate() <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdate()
	 * @generated
	 * @ordered
	 */
	protected FkCascadeActionOptions onUpdate = ON_UPDATE_EDEFAULT;

	/**
	 * This is true if the On Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onUpdateESet;

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
	 * The default value of the '{@link #getReferencedTableCatalogName() <em>Referenced Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_TABLE_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedTableCatalogName() <em>Referenced Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String referencedTableCatalogName = REFERENCED_TABLE_CATALOG_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getReferencedTableSchemaName() <em>Referenced Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_TABLE_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedTableSchemaName() <em>Referenced Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String referencedTableSchemaName = REFERENCED_TABLE_SCHEMA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencesUniqueColumn() <em>References Unique Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesUniqueColumn()
	 * @generated
	 * @ordered
	 */
	protected static final Object REFERENCES_UNIQUE_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencesUniqueColumn() <em>References Unique Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesUniqueColumn()
	 * @generated
	 * @ordered
	 */
	protected Object referencesUniqueColumn = REFERENCES_UNIQUE_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddForeignKeyConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseColumnNames() {
		return baseColumnNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseColumnNames(String newBaseColumnNames) {
		String oldBaseColumnNames = baseColumnNames;
		baseColumnNames = newBaseColumnNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES, oldBaseColumnNames, baseColumnNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableCatalogName() {
		return baseTableCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableCatalogName(String newBaseTableCatalogName) {
		String oldBaseTableCatalogName = baseTableCatalogName;
		baseTableCatalogName = newBaseTableCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME, oldBaseTableCatalogName, baseTableCatalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableName() {
		return baseTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableName(String newBaseTableName) {
		String oldBaseTableName = baseTableName;
		baseTableName = newBaseTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME, oldBaseTableName, baseTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableSchemaName() {
		return baseTableSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableSchemaName(String newBaseTableSchemaName) {
		String oldBaseTableSchemaName = baseTableSchemaName;
		baseTableSchemaName = newBaseTableSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME, oldBaseTableSchemaName, baseTableSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME, oldConstraintName, constraintName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE, oldDeferrable, deferrable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE, oldDeleteCascade, deleteCascade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED, oldInitiallyDeferred, initiallyDeferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FkCascadeActionOptions getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(FkCascadeActionOptions newOnDelete) {
		FkCascadeActionOptions oldOnDelete = onDelete;
		onDelete = newOnDelete == null ? ON_DELETE_EDEFAULT : newOnDelete;
		boolean oldOnDeleteESet = onDeleteESet;
		onDeleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE, oldOnDelete, onDelete, !oldOnDeleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnDelete() {
		FkCascadeActionOptions oldOnDelete = onDelete;
		boolean oldOnDeleteESet = onDeleteESet;
		onDelete = ON_DELETE_EDEFAULT;
		onDeleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE, oldOnDelete, ON_DELETE_EDEFAULT, oldOnDeleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnDelete() {
		return onDeleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FkCascadeActionOptions getOnUpdate() {
		return onUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdate(FkCascadeActionOptions newOnUpdate) {
		FkCascadeActionOptions oldOnUpdate = onUpdate;
		onUpdate = newOnUpdate == null ? ON_UPDATE_EDEFAULT : newOnUpdate;
		boolean oldOnUpdateESet = onUpdateESet;
		onUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE, oldOnUpdate, onUpdate, !oldOnUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnUpdate() {
		FkCascadeActionOptions oldOnUpdate = onUpdate;
		boolean oldOnUpdateESet = onUpdateESet;
		onUpdate = ON_UPDATE_EDEFAULT;
		onUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE, oldOnUpdate, ON_UPDATE_EDEFAULT, oldOnUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnUpdate() {
		return onUpdateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES, oldReferencedColumnNames, referencedColumnNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedTableCatalogName() {
		return referencedTableCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTableCatalogName(String newReferencedTableCatalogName) {
		String oldReferencedTableCatalogName = referencedTableCatalogName;
		referencedTableCatalogName = newReferencedTableCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME, oldReferencedTableCatalogName, referencedTableCatalogName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME, oldReferencedTableName, referencedTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedTableSchemaName() {
		return referencedTableSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTableSchemaName(String newReferencedTableSchemaName) {
		String oldReferencedTableSchemaName = referencedTableSchemaName;
		referencedTableSchemaName = newReferencedTableSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME, oldReferencedTableSchemaName, referencedTableSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getReferencesUniqueColumn() {
		return referencesUniqueColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesUniqueColumn(Object newReferencesUniqueColumn) {
		Object oldReferencesUniqueColumn = referencesUniqueColumn;
		referencesUniqueColumn = newReferencesUniqueColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN, oldReferencesUniqueColumn, referencesUniqueColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES:
				return getBaseColumnNames();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				return getBaseTableCatalogName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				return getBaseTableName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				return getBaseTableSchemaName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return getConstraintName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE:
				return getDeferrable();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE:
				return getDeleteCascade();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				return getInitiallyDeferred();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE:
				return getOnDelete();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE:
				return getOnUpdate();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES:
				return getReferencedColumnNames();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME:
				return getReferencedTableCatalogName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME:
				return getReferencedTableName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME:
				return getReferencedTableSchemaName();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN:
				return getReferencesUniqueColumn();
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
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES:
				setBaseColumnNames((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				setBaseTableCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				setBaseTableName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				setBaseTableSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE:
				setDeferrable(newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE:
				setDeleteCascade(newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				setInitiallyDeferred(newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE:
				setOnDelete((FkCascadeActionOptions)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE:
				setOnUpdate((FkCascadeActionOptions)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES:
				setReferencedColumnNames((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME:
				setReferencedTableCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME:
				setReferencedTableName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME:
				setReferencedTableSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN:
				setReferencesUniqueColumn(newValue);
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
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES:
				setBaseColumnNames(BASE_COLUMN_NAMES_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				setBaseTableCatalogName(BASE_TABLE_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				setBaseTableName(BASE_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				setBaseTableSchemaName(BASE_TABLE_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE:
				setDeferrable(DEFERRABLE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE:
				setDeleteCascade(DELETE_CASCADE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				setInitiallyDeferred(INITIALLY_DEFERRED_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE:
				unsetOnDelete();
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE:
				unsetOnUpdate();
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES:
				setReferencedColumnNames(REFERENCED_COLUMN_NAMES_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME:
				setReferencedTableCatalogName(REFERENCED_TABLE_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME:
				setReferencedTableName(REFERENCED_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME:
				setReferencedTableSchemaName(REFERENCED_TABLE_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN:
				setReferencesUniqueColumn(REFERENCES_UNIQUE_COLUMN_EDEFAULT);
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
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES:
				return BASE_COLUMN_NAMES_EDEFAULT == null ? baseColumnNames != null : !BASE_COLUMN_NAMES_EDEFAULT.equals(baseColumnNames);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
				return BASE_TABLE_CATALOG_NAME_EDEFAULT == null ? baseTableCatalogName != null : !BASE_TABLE_CATALOG_NAME_EDEFAULT.equals(baseTableCatalogName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
				return BASE_TABLE_NAME_EDEFAULT == null ? baseTableName != null : !BASE_TABLE_NAME_EDEFAULT.equals(baseTableName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
				return BASE_TABLE_SCHEMA_NAME_EDEFAULT == null ? baseTableSchemaName != null : !BASE_TABLE_SCHEMA_NAME_EDEFAULT.equals(baseTableSchemaName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE:
				return DEFERRABLE_EDEFAULT == null ? deferrable != null : !DEFERRABLE_EDEFAULT.equals(deferrable);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE:
				return DELETE_CASCADE_EDEFAULT == null ? deleteCascade != null : !DELETE_CASCADE_EDEFAULT.equals(deleteCascade);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				return INITIALLY_DEFERRED_EDEFAULT == null ? initiallyDeferred != null : !INITIALLY_DEFERRED_EDEFAULT.equals(initiallyDeferred);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE:
				return isSetOnDelete();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE:
				return isSetOnUpdate();
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES:
				return REFERENCED_COLUMN_NAMES_EDEFAULT == null ? referencedColumnNames != null : !REFERENCED_COLUMN_NAMES_EDEFAULT.equals(referencedColumnNames);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME:
				return REFERENCED_TABLE_CATALOG_NAME_EDEFAULT == null ? referencedTableCatalogName != null : !REFERENCED_TABLE_CATALOG_NAME_EDEFAULT.equals(referencedTableCatalogName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME:
				return REFERENCED_TABLE_NAME_EDEFAULT == null ? referencedTableName != null : !REFERENCED_TABLE_NAME_EDEFAULT.equals(referencedTableName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME:
				return REFERENCED_TABLE_SCHEMA_NAME_EDEFAULT == null ? referencedTableSchemaName != null : !REFERENCED_TABLE_SCHEMA_NAME_EDEFAULT.equals(referencedTableSchemaName);
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN:
				return REFERENCES_UNIQUE_COLUMN_EDEFAULT == null ? referencesUniqueColumn != null : !REFERENCES_UNIQUE_COLUMN_EDEFAULT.equals(referencesUniqueColumn);
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
		result.append(" (baseColumnNames: ");
		result.append(baseColumnNames);
		result.append(", baseTableCatalogName: ");
		result.append(baseTableCatalogName);
		result.append(", baseTableName: ");
		result.append(baseTableName);
		result.append(", baseTableSchemaName: ");
		result.append(baseTableSchemaName);
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(", deferrable: ");
		result.append(deferrable);
		result.append(", deleteCascade: ");
		result.append(deleteCascade);
		result.append(", initiallyDeferred: ");
		result.append(initiallyDeferred);
		result.append(", onDelete: ");
		if (onDeleteESet) result.append(onDelete); else result.append("<unset>");
		result.append(", onUpdate: ");
		if (onUpdateESet) result.append(onUpdate); else result.append("<unset>");
		result.append(", referencedColumnNames: ");
		result.append(referencedColumnNames);
		result.append(", referencedTableCatalogName: ");
		result.append(referencedTableCatalogName);
		result.append(", referencedTableName: ");
		result.append(referencedTableName);
		result.append(", referencedTableSchemaName: ");
		result.append(referencedTableSchemaName);
		result.append(", referencesUniqueColumn: ");
		result.append(referencesUniqueColumn);
		result.append(')');
		return result.toString();
	}

} //AddForeignKeyConstraintTypeImpl
