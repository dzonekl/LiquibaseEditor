/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogFactory
 * @model kind="package"
 * @generated
 */
public interface DbchangelogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbchangelog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.liquibase.org/xml/ns/dbchangelog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbchangelog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbchangelogPackage eINSTANCE = org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl <em>Add Auto Increment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddAutoIncrementTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddAutoIncrementType()
	 * @generated
	 */
	int ADD_AUTO_INCREMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__COLUMN_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__INCREMENT_BY = 3;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__SCHEMA_NAME = 4;

	/**
	 * The feature id for the '<em><b>Start With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__START_WITH = 5;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE__TABLE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Add Auto Increment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Add Auto Increment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_AUTO_INCREMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddColumnTypeImpl <em>Add Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddColumnTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddColumnType()
	 * @generated
	 */
	int ADD_COLUMN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_TYPE__CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Add Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Add Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl <em>Add Default Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddDefaultValueTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddDefaultValueType()
	 * @generated
	 */
	int ADD_DEFAULT_VALUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED = 5;

	/**
	 * The feature id for the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC = 7;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT = 8;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME = 9;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE__TABLE_NAME = 10;

	/**
	 * The number of structural features of the '<em>Add Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Add Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DEFAULT_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl <em>Add Foreign Key Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddForeignKeyConstraintTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddForeignKeyConstraintType()
	 * @generated
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Base Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Base Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Base Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE = 5;

	/**
	 * The feature id for the '<em><b>Delete Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE = 6;

	/**
	 * The feature id for the '<em><b>Initially Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED = 7;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE = 8;

	/**
	 * The feature id for the '<em><b>On Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE = 9;

	/**
	 * The feature id for the '<em><b>Referenced Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Referenced Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME = 11;

	/**
	 * The feature id for the '<em><b>Referenced Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME = 12;

	/**
	 * The feature id for the '<em><b>Referenced Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME = 13;

	/**
	 * The feature id for the '<em><b>References Unique Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN = 14;

	/**
	 * The number of structural features of the '<em>Add Foreign Key Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Add Foreign Key Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl <em>Add Lookup Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddLookupTableTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddLookupTableType()
	 * @generated
	 */
	int ADD_LOOKUP_TABLE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Existing Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Existing Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Existing Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Existing Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME = 4;

	/**
	 * The feature id for the '<em><b>New Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>New Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME = 6;

	/**
	 * The feature id for the '<em><b>New Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME = 7;

	/**
	 * The feature id for the '<em><b>New Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME = 8;

	/**
	 * The feature id for the '<em><b>New Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME = 9;

	/**
	 * The number of structural features of the '<em>Add Lookup Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Add Lookup Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_LOOKUP_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddNotNullConstraintTypeImpl <em>Add Not Null Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddNotNullConstraintTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddNotNullConstraintType()
	 * @generated
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE__COLUMN_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE__COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Default Null Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE__DEFAULT_NULL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE__SCHEMA_NAME = 4;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE__TABLE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Add Not Null Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Add Not Null Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl <em>Add Primary Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddPrimaryKeyType()
	 * @generated
	 */
	int ADD_PRIMARY_KEY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE__COLUMN_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE__CONSTRAINT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE__TABLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE__TABLESPACE = 5;

	/**
	 * The number of structural features of the '<em>Add Primary Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Add Primary Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl <em>Add Unique Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAddUniqueConstraintType()
	 * @generated
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE = 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED = 4;

	/**
	 * The feature id for the '<em><b>Initially Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED = 5;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME = 6;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE = 8;

	/**
	 * The number of structural features of the '<em>Add Unique Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Add Unique Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AlterSequenceTypeImpl <em>Alter Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AlterSequenceTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAlterSequenceType()
	 * @generated
	 */
	int ALTER_SEQUENCE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__INCREMENT_BY = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__MIN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__ORDERED = 4;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__SCHEMA_NAME = 5;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__SEQUENCE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE__START_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Alter Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Alter Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_SEQUENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl <em>And Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AndTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAndType()
	 * @generated
	 */
	int AND_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__AND = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__OR = 2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__NOT = 3;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__DBMS = 4;

	/**
	 * The feature id for the '<em><b>Running As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__RUNNING_AS = 5;

	/**
	 * The feature id for the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__CHANGE_SET_EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Table Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__TABLE_EXISTS = 7;

	/**
	 * The feature id for the '<em><b>Column Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__COLUMN_EXISTS = 8;

	/**
	 * The feature id for the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__SEQUENCE_EXISTS = 9;

	/**
	 * The feature id for the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS = 10;

	/**
	 * The feature id for the '<em><b>Index Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__INDEX_EXISTS = 11;

	/**
	 * The feature id for the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__PRIMARY_KEY_EXISTS = 12;

	/**
	 * The feature id for the '<em><b>View Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__VIEW_EXISTS = 13;

	/**
	 * The feature id for the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__TABLE_IS_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__ROW_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Sql Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__SQL_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__CHANGE_LOG_PROPERTY_DEFINED = 17;

	/**
	 * The feature id for the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__EXPECTED_QUOTING_STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__CUSTOM_PRECONDITION = 19;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE__ANY = 20;

	/**
	 * The number of structural features of the '<em>And Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>And Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.AppendTypeImpl <em>Append Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.AppendTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getAppendType()
	 * @generated
	 */
	int APPEND_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Append Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Append Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ArgTypeImpl <em>Arg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ArgTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getArgType()
	 * @generated
	 */
	int ARG_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Arg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeLogPropertyDefinedTypeImpl <em>Change Log Property Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ChangeLogPropertyDefinedTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getChangeLogPropertyDefinedType()
	 * @generated
	 */
	int CHANGE_LOG_PROPERTY_DEFINED_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_PROPERTY_DEFINED_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_PROPERTY_DEFINED_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Change Log Property Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_PROPERTY_DEFINED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Change Log Property Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_PROPERTY_DEFINED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetExecutedTypeImpl <em>Change Set Executed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ChangeSetExecutedTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getChangeSetExecutedType()
	 * @generated
	 */
	int CHANGE_SET_EXECUTED_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_EXECUTED_TYPE__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Change Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_EXECUTED_TYPE__CHANGE_LOG_FILE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_EXECUTED_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Change Set Executed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_EXECUTED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Change Set Executed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_EXECUTED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl <em>Change Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ChangeSetTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getChangeSetType()
	 * @generated
	 */
	int CHANGE_SET_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Valid Check Sum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__VALID_CHECK_SUM = 0;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__PRE_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Tag Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__TAG_DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Change Set Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CHANGE_SET_CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Create Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CREATE_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Drop Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Create View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CREATE_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Rename View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__RENAME_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Drop View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__INSERT = 10;

	/**
	 * The feature id for the '<em><b>Add Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__SQL = 12;

	/**
	 * The feature id for the '<em><b>Create Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CREATE_PROCEDURE = 13;

	/**
	 * The feature id for the '<em><b>Drop Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_PROCEDURE = 14;

	/**
	 * The feature id for the '<em><b>Sql File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__SQL_FILE = 15;

	/**
	 * The feature id for the '<em><b>Rename Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__RENAME_TABLE = 16;

	/**
	 * The feature id for the '<em><b>Rename Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__RENAME_COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Drop Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_COLUMN = 18;

	/**
	 * The feature id for the '<em><b>Merge Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__MERGE_COLUMNS = 19;

	/**
	 * The feature id for the '<em><b>Modify Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__MODIFY_DATA_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Create Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CREATE_SEQUENCE = 21;

	/**
	 * The feature id for the '<em><b>Alter Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ALTER_SEQUENCE = 22;

	/**
	 * The feature id for the '<em><b>Drop Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_SEQUENCE = 23;

	/**
	 * The feature id for the '<em><b>Create Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CREATE_INDEX = 24;

	/**
	 * The feature id for the '<em><b>Drop Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_INDEX = 25;

	/**
	 * The feature id for the '<em><b>Add Not Null Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_NOT_NULL_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Drop Not Null Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_NOT_NULL_CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Add Foreign Key Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_FOREIGN_KEY_CONSTRAINT = 28;

	/**
	 * The feature id for the '<em><b>Drop Foreign Key Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_FOREIGN_KEY_CONSTRAINT = 29;

	/**
	 * The feature id for the '<em><b>Drop All Foreign Key Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS = 30;

	/**
	 * The feature id for the '<em><b>Add Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_PRIMARY_KEY = 31;

	/**
	 * The feature id for the '<em><b>Drop Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_PRIMARY_KEY = 32;

	/**
	 * The feature id for the '<em><b>Add Lookup Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_LOOKUP_TABLE = 33;

	/**
	 * The feature id for the '<em><b>Add Auto Increment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_AUTO_INCREMENT = 34;

	/**
	 * The feature id for the '<em><b>Add Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_DEFAULT_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Drop Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_DEFAULT_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Add Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ADD_UNIQUE_CONSTRAINT = 37;

	/**
	 * The feature id for the '<em><b>Drop Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DROP_UNIQUE_CONSTRAINT = 38;

	/**
	 * The feature id for the '<em><b>Custom Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CUSTOM_CHANGE = 39;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__UPDATE = 40;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DELETE = 41;

	/**
	 * The feature id for the '<em><b>Load Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__LOAD_DATA = 42;

	/**
	 * The feature id for the '<em><b>Load Update Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__LOAD_UPDATE_DATA = 43;

	/**
	 * The feature id for the '<em><b>Execute Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__EXECUTE_COMMAND = 44;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__STOP = 45;

	/**
	 * The feature id for the '<em><b>Rollback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ROLLBACK = 46;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ANY = 47;

	/**
	 * The feature id for the '<em><b>Modify Sql</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__MODIFY_SQL = 48;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__AUTHOR = 49;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__CONTEXT = 50;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__DBMS = 51;

	/**
	 * The feature id for the '<em><b>Fail On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__FAIL_ON_ERROR = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ID = 53;

	/**
	 * The feature id for the '<em><b>Logical File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__LOGICAL_FILE_PATH = 54;

	/**
	 * The feature id for the '<em><b>Object Quoting Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY = 55;

	/**
	 * The feature id for the '<em><b>On Validation Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ON_VALIDATION_FAIL = 56;

	/**
	 * The feature id for the '<em><b>Run Always</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__RUN_ALWAYS = 57;

	/**
	 * The feature id for the '<em><b>Run In Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__RUN_IN_TRANSACTION = 58;

	/**
	 * The feature id for the '<em><b>Run On Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__RUN_ON_CHANGE = 59;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE__ANY_ATTRIBUTE = 60;

	/**
	 * The number of structural features of the '<em>Change Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE_FEATURE_COUNT = 61;

	/**
	 * The number of operations of the '<em>Change Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnExistsTypeImpl <em>Column Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ColumnExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getColumnExistsType()
	 * @generated
	 */
	int COLUMN_EXISTS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXISTS_TYPE__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXISTS_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXISTS_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Column Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXISTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Column Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ColumnTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__AUTO_INCREMENT = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE_BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE_COMPUTED = 5;

	/**
	 * The feature id for the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE_NUMERIC = 7;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE_SEQUENCE_CURRENT = 8;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT = 9;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__ENCODING = 10;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__INCREMENT_BY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__NAME = 12;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__REMARKS = 13;

	/**
	 * The feature id for the '<em><b>Start With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__START_WITH = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value Blob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_BLOB_FILE = 17;

	/**
	 * The feature id for the '<em><b>Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_BOOLEAN = 18;

	/**
	 * The feature id for the '<em><b>Value Clob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_CLOB_FILE = 19;

	/**
	 * The feature id for the '<em><b>Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_COMPUTED = 20;

	/**
	 * The feature id for the '<em><b>Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_DATE = 21;

	/**
	 * The feature id for the '<em><b>Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_NUMERIC = 22;

	/**
	 * The feature id for the '<em><b>Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_SEQUENCE_CURRENT = 23;

	/**
	 * The feature id for the '<em><b>Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__VALUE_SEQUENCE_NEXT = 24;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl <em>Column Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ColumnType1Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getColumnType1()
	 * @generated
	 */
	int COLUMN_TYPE1 = 17;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__DEFAULT_VALUE_BOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__DEFAULT_VALUE_COMPUTED = 2;

	/**
	 * The feature id for the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__DEFAULT_VALUE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__DEFAULT_VALUE_NUMERIC = 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__HEADER = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__INDEX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__NAME = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Column Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Column Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType2Impl <em>Column Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ColumnType2Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getColumnType2()
	 * @generated
	 */
	int COLUMN_TYPE2 = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__AUTO_INCREMENT = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE_BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE_COMPUTED = 5;

	/**
	 * The feature id for the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE_NUMERIC = 7;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE_SEQUENCE_CURRENT = 8;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__DEFAULT_VALUE_SEQUENCE_NEXT = 9;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__ENCODING = 10;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__INCREMENT_BY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__NAME = 12;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__REMARKS = 13;

	/**
	 * The feature id for the '<em><b>Start With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__START_WITH = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value Blob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_BLOB_FILE = 17;

	/**
	 * The feature id for the '<em><b>Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_BOOLEAN = 18;

	/**
	 * The feature id for the '<em><b>Value Clob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_CLOB_FILE = 19;

	/**
	 * The feature id for the '<em><b>Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_COMPUTED = 20;

	/**
	 * The feature id for the '<em><b>Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_DATE = 21;

	/**
	 * The feature id for the '<em><b>Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_NUMERIC = 22;

	/**
	 * The feature id for the '<em><b>Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_SEQUENCE_CURRENT = 23;

	/**
	 * The feature id for the '<em><b>Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2__VALUE_SEQUENCE_NEXT = 24;

	/**
	 * The number of structural features of the '<em>Column Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Column Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl <em>Column Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getColumnType3()
	 * @generated
	 */
	int COLUMN_TYPE3 = 19;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__DEFAULT_VALUE_BOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__DEFAULT_VALUE_COMPUTED = 2;

	/**
	 * The feature id for the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__DEFAULT_VALUE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__DEFAULT_VALUE_NUMERIC = 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__HEADER = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__INDEX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__NAME = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Column Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Column Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType4Impl <em>Column Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ColumnType4Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getColumnType4()
	 * @generated
	 */
	int COLUMN_TYPE4 = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__MIXED = COLUMN_TYPE2__MIXED;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__CONSTRAINTS = COLUMN_TYPE2__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__AUTO_INCREMENT = COLUMN_TYPE2__AUTO_INCREMENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE = COLUMN_TYPE2__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Default Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE_BOOLEAN = COLUMN_TYPE2__DEFAULT_VALUE_BOOLEAN;

	/**
	 * The feature id for the '<em><b>Default Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE_COMPUTED = COLUMN_TYPE2__DEFAULT_VALUE_COMPUTED;

	/**
	 * The feature id for the '<em><b>Default Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE_DATE = COLUMN_TYPE2__DEFAULT_VALUE_DATE;

	/**
	 * The feature id for the '<em><b>Default Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE_NUMERIC = COLUMN_TYPE2__DEFAULT_VALUE_NUMERIC;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE_SEQUENCE_CURRENT = COLUMN_TYPE2__DEFAULT_VALUE_SEQUENCE_CURRENT;

	/**
	 * The feature id for the '<em><b>Default Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__DEFAULT_VALUE_SEQUENCE_NEXT = COLUMN_TYPE2__DEFAULT_VALUE_SEQUENCE_NEXT;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__ENCODING = COLUMN_TYPE2__ENCODING;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__INCREMENT_BY = COLUMN_TYPE2__INCREMENT_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__NAME = COLUMN_TYPE2__NAME;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__REMARKS = COLUMN_TYPE2__REMARKS;

	/**
	 * The feature id for the '<em><b>Start With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__START_WITH = COLUMN_TYPE2__START_WITH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__TYPE = COLUMN_TYPE2__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE = COLUMN_TYPE2__VALUE;

	/**
	 * The feature id for the '<em><b>Value Blob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_BLOB_FILE = COLUMN_TYPE2__VALUE_BLOB_FILE;

	/**
	 * The feature id for the '<em><b>Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_BOOLEAN = COLUMN_TYPE2__VALUE_BOOLEAN;

	/**
	 * The feature id for the '<em><b>Value Clob File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_CLOB_FILE = COLUMN_TYPE2__VALUE_CLOB_FILE;

	/**
	 * The feature id for the '<em><b>Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_COMPUTED = COLUMN_TYPE2__VALUE_COMPUTED;

	/**
	 * The feature id for the '<em><b>Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_DATE = COLUMN_TYPE2__VALUE_DATE;

	/**
	 * The feature id for the '<em><b>Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_NUMERIC = COLUMN_TYPE2__VALUE_NUMERIC;

	/**
	 * The feature id for the '<em><b>Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_SEQUENCE_CURRENT = COLUMN_TYPE2__VALUE_SEQUENCE_CURRENT;

	/**
	 * The feature id for the '<em><b>Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__VALUE_SEQUENCE_NEXT = COLUMN_TYPE2__VALUE_SEQUENCE_NEXT;

	/**
	 * The feature id for the '<em><b>After Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__AFTER_COLUMN = COLUMN_TYPE2_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__BEFORE_COLUMN = COLUMN_TYPE2_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4__POSITION = COLUMN_TYPE2_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Column Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4_FEATURE_COUNT = COLUMN_TYPE2_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Column Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE4_OPERATION_COUNT = COLUMN_TYPE2_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ConstraintsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getConstraintsType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__CHECK_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Deferrable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__DEFERRABLE = 1;

	/**
	 * The feature id for the '<em><b>Delete Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__DELETE_CASCADE = 2;

	/**
	 * The feature id for the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__FOREIGN_KEY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Initially Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__INITIALLY_DEFERRED = 4;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__NULLABLE = 5;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__PRIMARY_KEY = 6;

	/**
	 * The feature id for the '<em><b>Primary Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__PRIMARY_KEY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Primary Key Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE = 8;

	/**
	 * The feature id for the '<em><b>Referenced Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES = 9;

	/**
	 * The feature id for the '<em><b>Referenced Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME = 10;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__REFERENCES = 11;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__UNIQUE = 12;

	/**
	 * The feature id for the '<em><b>Unique Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME = 13;

	/**
	 * The number of structural features of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CreateIndexTypeImpl <em>Create Index Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CreateIndexTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCreateIndexType()
	 * @generated
	 */
	int CREATE_INDEX_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Associated With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__ASSOCIATED_WITH = 1;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__CATALOG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__INDEX_NAME = 3;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__SCHEMA_NAME = 4;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__TABLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__TABLESPACE = 6;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE__UNIQUE = 7;

	/**
	 * The number of structural features of the '<em>Create Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Create Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl <em>Create Procedure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CreateProcedureTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCreateProcedureType()
	 * @generated
	 */
	int CREATE_PROCEDURE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__CATALOG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__DBMS = 3;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__ENCODING = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__PATH = 5;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__PROCEDURE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Relative To Changelog File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE = 7;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE__SCHEMA_NAME = 8;

	/**
	 * The number of structural features of the '<em>Create Procedure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Create Procedure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROCEDURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl <em>Create Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCreateSequenceType()
	 * @generated
	 */
	int CREATE_SEQUENCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__CYCLE = 1;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__INCREMENT_BY = 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__MAX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__MIN_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__ORDERED = 5;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__SCHEMA_NAME = 6;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__SEQUENCE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE__START_VALUE = 8;

	/**
	 * The number of structural features of the '<em>Create Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Create Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SEQUENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CreateTableTypeImpl <em>Create Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CreateTableTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCreateTableType()
	 * @generated
	 */
	int CREATE_TABLE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE__CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE__REMARKS = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE__TABLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE__TABLESPACE = 5;

	/**
	 * The number of structural features of the '<em>Create Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Create Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CreateViewTypeImpl <em>Create View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CreateViewTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCreateViewType()
	 * @generated
	 */
	int CREATE_VIEW_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE__CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Replace If Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE__REPLACE_IF_EXISTS = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE__VIEW_NAME = 4;

	/**
	 * The number of structural features of the '<em>Create View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Create View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CustomChangeTypeImpl <em>Custom Change Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CustomChangeTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCustomChangeType()
	 * @generated
	 */
	int CUSTOM_CHANGE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CHANGE_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CHANGE_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CHANGE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Custom Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CHANGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Custom Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CHANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.CustomPreconditionTypeImpl <em>Custom Precondition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.CustomPreconditionTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getCustomPreconditionType()
	 * @generated
	 */
	int CUSTOM_PRECONDITION_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PRECONDITION_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PRECONDITION_TYPE__CLASS_NAME = 1;

	/**
	 * The number of structural features of the '<em>Custom Precondition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PRECONDITION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Precondition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PRECONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl <em>Database Change Log Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DatabaseChangeLogTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDatabaseChangeLogType()
	 * @generated
	 */
	int DATABASE_CHANGE_LOG_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Change Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__CHANGE_SET = 3;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__INCLUDE = 4;

	/**
	 * The feature id for the '<em><b>Include All</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__INCLUDE_ALL = 5;

	/**
	 * The feature id for the '<em><b>Logical File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH = 6;

	/**
	 * The feature id for the '<em><b>Object Quoting Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Database Change Log Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Database Change Log Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CHANGE_LOG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DbmsTypeImpl <em>Dbms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbmsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDbmsType()
	 * @generated
	 */
	int DBMS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Dbms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dbms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DeleteTypeImpl <em>Delete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DeleteTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDeleteType()
	 * @generated
	 */
	int DELETE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__WHERE = 1;

	/**
	 * The feature id for the '<em><b>Where Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__WHERE_PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__CATALOG_NAME = 3;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__SCHEMA_NAME = 4;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__TABLE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DocumentRootImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Add Auto Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_AUTO_INCREMENT = 3;

	/**
	 * The feature id for the '<em><b>Add Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Add Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_DEFAULT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Add Foreign Key Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Add Lookup Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_LOOKUP_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Add Not Null Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Add Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_PRIMARY_KEY = 9;

	/**
	 * The feature id for the '<em><b>Add Unique Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Alter Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALTER_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AND = 12;

	/**
	 * The feature id for the '<em><b>Change Log Property Defined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED = 13;

	/**
	 * The feature id for the '<em><b>Change Set Executed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_SET_EXECUTED = 14;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN = 15;

	/**
	 * The feature id for the '<em><b>Column Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_EXISTS = 16;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT = 17;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTRAINTS = 18;

	/**
	 * The feature id for the '<em><b>Create Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_INDEX = 19;

	/**
	 * The feature id for the '<em><b>Create Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_PROCEDURE = 20;

	/**
	 * The feature id for the '<em><b>Create Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_SEQUENCE = 21;

	/**
	 * The feature id for the '<em><b>Create Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_TABLE = 22;

	/**
	 * The feature id for the '<em><b>Create View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_VIEW = 23;

	/**
	 * The feature id for the '<em><b>Custom Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CHANGE = 24;

	/**
	 * The feature id for the '<em><b>Custom Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_PRECONDITION = 25;

	/**
	 * The feature id for the '<em><b>Database Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_CHANGE_LOG = 26;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DBMS = 27;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE = 28;

	/**
	 * The feature id for the '<em><b>Drop All Foreign Key Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS = 29;

	/**
	 * The feature id for the '<em><b>Drop Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_COLUMN = 30;

	/**
	 * The feature id for the '<em><b>Drop Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_DEFAULT_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Drop Foreign Key Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT = 32;

	/**
	 * The feature id for the '<em><b>Drop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_INDEX = 33;

	/**
	 * The feature id for the '<em><b>Drop Not Null Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT = 34;

	/**
	 * The feature id for the '<em><b>Drop Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_PRIMARY_KEY = 35;

	/**
	 * The feature id for the '<em><b>Drop Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_PROCEDURE = 36;

	/**
	 * The feature id for the '<em><b>Drop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_SEQUENCE = 37;

	/**
	 * The feature id for the '<em><b>Drop Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_TABLE = 38;

	/**
	 * The feature id for the '<em><b>Drop Unique Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT = 39;

	/**
	 * The feature id for the '<em><b>Drop View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_VIEW = 40;

	/**
	 * The feature id for the '<em><b>Execute Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXECUTE_COMMAND = 41;

	/**
	 * The feature id for the '<em><b>Expected Quoting Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY = 42;

	/**
	 * The feature id for the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS = 43;

	/**
	 * The feature id for the '<em><b>Index Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INDEX_EXISTS = 44;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSERT = 45;

	/**
	 * The feature id for the '<em><b>Load Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOAD_DATA = 46;

	/**
	 * The feature id for the '<em><b>Load Update Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOAD_UPDATE_DATA = 47;

	/**
	 * The feature id for the '<em><b>Merge Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MERGE_COLUMNS = 48;

	/**
	 * The feature id for the '<em><b>Modify Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFY_DATA_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOT = 50;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OR = 51;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM = 52;

	/**
	 * The feature id for the '<em><b>Primary Key Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIMARY_KEY_EXISTS = 53;

	/**
	 * The feature id for the '<em><b>Rename Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENAME_COLUMN = 54;

	/**
	 * The feature id for the '<em><b>Rename Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENAME_TABLE = 55;

	/**
	 * The feature id for the '<em><b>Rename View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENAME_VIEW = 56;

	/**
	 * The feature id for the '<em><b>Rollback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLLBACK = 57;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROW_COUNT = 58;

	/**
	 * The feature id for the '<em><b>Running As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUNNING_AS = 59;

	/**
	 * The feature id for the '<em><b>Sequence Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE_EXISTS = 60;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL = 61;

	/**
	 * The feature id for the '<em><b>Sql Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL_CHECK = 62;

	/**
	 * The feature id for the '<em><b>Sql File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQL_FILE = 63;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOP = 64;

	/**
	 * The feature id for the '<em><b>Table Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_EXISTS = 65;

	/**
	 * The feature id for the '<em><b>Table Is Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_IS_EMPTY = 66;

	/**
	 * The feature id for the '<em><b>Tag Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAG_DATABASE = 67;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE = 68;

	/**
	 * The feature id for the '<em><b>View Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_EXISTS = 69;

	/**
	 * The feature id for the '<em><b>Where Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WHERE_PARAMS = 70;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 71;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropAllForeignKeyConstraintsTypeImpl <em>Drop All Foreign Key Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropAllForeignKeyConstraintsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropAllForeignKeyConstraintsType()
	 * @generated
	 */
	int DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Base Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_SCHEMA_NAME = 2;

	/**
	 * The number of structural features of the '<em>Drop All Foreign Key Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Drop All Foreign Key Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropColumnTypeImpl <em>Drop Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropColumnTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropColumnType()
	 * @generated
	 */
	int DROP_COLUMN_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_TYPE__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Drop Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drop Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropDefaultValueTypeImpl <em>Drop Default Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropDefaultValueTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropDefaultValueType()
	 * @generated
	 */
	int DROP_DEFAULT_VALUE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE__COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Drop Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Drop Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DEFAULT_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropForeignKeyConstraintTypeImpl <em>Drop Foreign Key Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropForeignKeyConstraintTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropForeignKeyConstraintType()
	 * @generated
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Base Table Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Table Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME = 3;

	/**
	 * The number of structural features of the '<em>Drop Foreign Key Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drop Foreign Key Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FOREIGN_KEY_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl <em>Drop Index Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropIndexTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropIndexType()
	 * @generated
	 */
	int DROP_INDEX_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Associated With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE__ASSOCIATED_WITH = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE__CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE__INDEX_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Drop Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Drop Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropNotNullConstraintTypeImpl <em>Drop Not Null Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropNotNullConstraintTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropNotNullConstraintType()
	 * @generated
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE__COLUMN_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE__COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Drop Not Null Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Drop Not Null Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_NOT_NULL_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropPrimaryKeyTypeImpl <em>Drop Primary Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropPrimaryKeyTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropPrimaryKeyType()
	 * @generated
	 */
	int DROP_PRIMARY_KEY_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PRIMARY_KEY_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PRIMARY_KEY_TYPE__CONSTRAINT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PRIMARY_KEY_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PRIMARY_KEY_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Drop Primary Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PRIMARY_KEY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drop Primary Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PRIMARY_KEY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropProcedureTypeImpl <em>Drop Procedure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropProcedureTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropProcedureType()
	 * @generated
	 */
	int DROP_PROCEDURE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PROCEDURE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PROCEDURE_TYPE__PROCEDURE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PROCEDURE_TYPE__SCHEMA_NAME = 2;

	/**
	 * The number of structural features of the '<em>Drop Procedure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PROCEDURE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Drop Procedure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PROCEDURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropSequenceTypeImpl <em>Drop Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropSequenceTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropSequenceType()
	 * @generated
	 */
	int DROP_SEQUENCE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__INCREMENT_BY = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__MIN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__ORDERED = 4;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__SCHEMA_NAME = 5;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__SEQUENCE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE__START_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Drop Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Drop Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SEQUENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropTableTypeImpl <em>Drop Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropTableTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropTableType()
	 * @generated
	 */
	int DROP_TABLE_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Cascade Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_TYPE__CASCADE_CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_TYPE__CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Drop Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drop Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl <em>Drop Unique Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropUniqueConstraintTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropUniqueConstraintType()
	 * @generated
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Unique Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE__UNIQUE_COLUMNS = 4;

	/**
	 * The number of structural features of the '<em>Drop Unique Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Drop Unique Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_UNIQUE_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.DropViewTypeImpl <em>Drop View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DropViewTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getDropViewType()
	 * @generated
	 */
	int DROP_VIEW_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_TYPE__SCHEMA_NAME = 1;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_TYPE__VIEW_NAME = 2;

	/**
	 * The number of structural features of the '<em>Drop View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Drop View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ExecuteCommandTypeImpl <em>Execute Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ExecuteCommandTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getExecuteCommandType()
	 * @generated
	 */
	int EXECUTE_COMMAND_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_COMMAND_TYPE__ARG = 0;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_COMMAND_TYPE__EXECUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_COMMAND_TYPE__OS = 2;

	/**
	 * The number of structural features of the '<em>Execute Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_COMMAND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Execute Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_COMMAND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ExpectedQuotingStrategyTypeImpl <em>Expected Quoting Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ExpectedQuotingStrategyTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getExpectedQuotingStrategyType()
	 * @generated
	 */
	int EXPECTED_QUOTING_STRATEGY_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUOTING_STRATEGY_TYPE__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Expected Quoting Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUOTING_STRATEGY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expected Quoting Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_QUOTING_STRATEGY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ForeignKeyConstraintExistsTypeImpl <em>Foreign Key Constraint Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ForeignKeyConstraintExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getForeignKeyConstraintExistsType()
	 * @generated
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__FOREIGN_KEY_TABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE__SCHEMA_NAME = 3;

	/**
	 * The number of structural features of the '<em>Foreign Key Constraint Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Foreign Key Constraint Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl <em>Include All Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getIncludeAllType()
	 * @generated
	 */
	int INCLUDE_ALL_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_TYPE__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_TYPE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Relative To Changelog File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_TYPE__RELATIVE_TO_CHANGELOG_FILE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Include All Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Include All Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.IncludeTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__FILE = 0;

	/**
	 * The feature id for the '<em><b>Relative To Changelog File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__RELATIVE_TO_CHANGELOG_FILE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.IndexExistsTypeImpl <em>Index Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.IndexExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getIndexExistsType()
	 * @generated
	 */
	int INDEX_EXISTS_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE__COLUMN_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE__INDEX_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Index Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Index Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.InsertTypeImpl <em>Insert Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.InsertTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getInsertType()
	 * @generated
	 */
	int INSERT_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__CATALOG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__DBMS = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Insert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Insert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl <em>Load Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getLoadDataType()
	 * @generated
	 */
	int LOAD_DATA_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__CATALOG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__ENCODING = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__FILE = 4;

	/**
	 * The feature id for the '<em><b>Quotchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__QUOTCHAR = 5;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__SCHEMA_NAME = 6;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__SEPARATOR = 7;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE__TABLE_NAME = 8;

	/**
	 * The number of structural features of the '<em>Load Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Load Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.LoadUpdateDataTypeImpl <em>Load Update Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.LoadUpdateDataTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getLoadUpdateDataType()
	 * @generated
	 */
	int LOAD_UPDATE_DATA_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__CATALOG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__ENCODING = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__FILE = 4;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__PRIMARY_KEY = 5;

	/**
	 * The feature id for the '<em><b>Quotchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__QUOTCHAR = 6;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__SCHEMA_NAME = 7;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__SEPARATOR = 8;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE__TABLE_NAME = 9;

	/**
	 * The number of structural features of the '<em>Load Update Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Load Update Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_UPDATE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl <em>Merge Columns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.MergeColumnsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getMergeColumnsType()
	 * @generated
	 */
	int MERGE_COLUMNS_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column1 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__COLUMN1_NAME = 1;

	/**
	 * The feature id for the '<em><b>Column2 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__COLUMN2_NAME = 2;

	/**
	 * The feature id for the '<em><b>Final Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__FINAL_COLUMN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Final Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__FINAL_COLUMN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Join String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__JOIN_STRING = 5;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__SCHEMA_NAME = 6;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE__TABLE_NAME = 7;

	/**
	 * The number of structural features of the '<em>Merge Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Merge Columns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COLUMNS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ModifyDataTypeTypeImpl <em>Modify Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ModifyDataTypeTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getModifyDataTypeType()
	 * @generated
	 */
	int MODIFY_DATA_TYPE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>New Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE__NEW_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE__SCHEMA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Modify Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Modify Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_DATA_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl <em>Modify Sql Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ModifySqlTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getModifySqlType()
	 * @generated
	 */
	int MODIFY_SQL_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Modify Sql Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__MODIFY_SQL_CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__REPLACE = 1;

	/**
	 * The feature id for the '<em><b>Reg Exp Replace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__REG_EXP_REPLACE = 2;

	/**
	 * The feature id for the '<em><b>Prepend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__PREPEND = 3;

	/**
	 * The feature id for the '<em><b>Append</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__APPEND = 4;

	/**
	 * The feature id for the '<em><b>Apply To Rollback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__APPLY_TO_ROLLBACK = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE__DBMS = 7;

	/**
	 * The number of structural features of the '<em>Modify Sql Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Modify Sql Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SQL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.NotTypeImpl <em>Not Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.NotTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getNotType()
	 * @generated
	 */
	int NOT_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__AND = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__OR = 2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__NOT = 3;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__DBMS = 4;

	/**
	 * The feature id for the '<em><b>Running As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__RUNNING_AS = 5;

	/**
	 * The feature id for the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__CHANGE_SET_EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Table Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__TABLE_EXISTS = 7;

	/**
	 * The feature id for the '<em><b>Column Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__COLUMN_EXISTS = 8;

	/**
	 * The feature id for the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__SEQUENCE_EXISTS = 9;

	/**
	 * The feature id for the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS = 10;

	/**
	 * The feature id for the '<em><b>Index Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__INDEX_EXISTS = 11;

	/**
	 * The feature id for the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__PRIMARY_KEY_EXISTS = 12;

	/**
	 * The feature id for the '<em><b>View Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__VIEW_EXISTS = 13;

	/**
	 * The feature id for the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__TABLE_IS_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__ROW_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Sql Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__SQL_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__CHANGE_LOG_PROPERTY_DEFINED = 17;

	/**
	 * The feature id for the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__EXPECTED_QUOTING_STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__CUSTOM_PRECONDITION = 19;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE__ANY = 20;

	/**
	 * The number of structural features of the '<em>Not Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Not Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.OrTypeImpl <em>Or Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.OrTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOrType()
	 * @generated
	 */
	int OR_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__AND = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__OR = 2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__NOT = 3;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__DBMS = 4;

	/**
	 * The feature id for the '<em><b>Running As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__RUNNING_AS = 5;

	/**
	 * The feature id for the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__CHANGE_SET_EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Table Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__TABLE_EXISTS = 7;

	/**
	 * The feature id for the '<em><b>Column Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__COLUMN_EXISTS = 8;

	/**
	 * The feature id for the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__SEQUENCE_EXISTS = 9;

	/**
	 * The feature id for the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS = 10;

	/**
	 * The feature id for the '<em><b>Index Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__INDEX_EXISTS = 11;

	/**
	 * The feature id for the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__PRIMARY_KEY_EXISTS = 12;

	/**
	 * The feature id for the '<em><b>View Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__VIEW_EXISTS = 13;

	/**
	 * The feature id for the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__TABLE_IS_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__ROW_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Sql Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__SQL_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__CHANGE_LOG_PROPERTY_DEFINED = 17;

	/**
	 * The feature id for the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__EXPECTED_QUOTING_STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__CUSTOM_PRECONDITION = 19;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE__ANY = 20;

	/**
	 * The number of structural features of the '<em>Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ParamTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE_BOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>Value Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE_COMPUTED = 3;

	/**
	 * The feature id for the '<em><b>Value Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Value Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE_NUMERIC = 5;

	/**
	 * The feature id for the '<em><b>Value Sequence Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE_SEQUENCE_CURRENT = 6;

	/**
	 * The feature id for the '<em><b>Value Sequence Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE_SEQUENCE_NEXT = 7;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ParamType1Impl <em>Param Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ParamType1Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getParamType1()
	 * @generated
	 */
	int PARAM_TYPE1 = 60;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE1__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE1__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Param Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Param Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ParamType2Impl <em>Param Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ParamType2Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getParamType2()
	 * @generated
	 */
	int PARAM_TYPE2 = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl <em>Pre Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.PreConditionsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getPreConditionsType()
	 * @generated
	 */
	int PRE_CONDITIONS_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__AND = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__OR = 2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__NOT = 3;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__DBMS = 4;

	/**
	 * The feature id for the '<em><b>Running As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__RUNNING_AS = 5;

	/**
	 * The feature id for the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__CHANGE_SET_EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Table Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__TABLE_EXISTS = 7;

	/**
	 * The feature id for the '<em><b>Column Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__COLUMN_EXISTS = 8;

	/**
	 * The feature id for the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__SEQUENCE_EXISTS = 9;

	/**
	 * The feature id for the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__FOREIGN_KEY_CONSTRAINT_EXISTS = 10;

	/**
	 * The feature id for the '<em><b>Index Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__INDEX_EXISTS = 11;

	/**
	 * The feature id for the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__PRIMARY_KEY_EXISTS = 12;

	/**
	 * The feature id for the '<em><b>View Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__VIEW_EXISTS = 13;

	/**
	 * The feature id for the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__TABLE_IS_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ROW_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Sql Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__SQL_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__CHANGE_LOG_PROPERTY_DEFINED = 17;

	/**
	 * The feature id for the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__EXPECTED_QUOTING_STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__CUSTOM_PRECONDITION = 19;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ANY = 20;

	/**
	 * The feature id for the '<em><b>On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ON_ERROR = 21;

	/**
	 * The feature id for the '<em><b>On Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE = 22;

	/**
	 * The feature id for the '<em><b>On Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ON_FAIL = 23;

	/**
	 * The feature id for the '<em><b>On Fail Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE = 24;

	/**
	 * The feature id for the '<em><b>On Sql Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT = 25;

	/**
	 * The number of structural features of the '<em>Pre Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Pre Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.PreConditionsType1Impl <em>Pre Conditions Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.PreConditionsType1Impl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getPreConditionsType1()
	 * @generated
	 */
	int PRE_CONDITIONS_TYPE1 = 63;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__AND = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__OR = 2;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__NOT = 3;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__DBMS = 4;

	/**
	 * The feature id for the '<em><b>Running As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__RUNNING_AS = 5;

	/**
	 * The feature id for the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__CHANGE_SET_EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Table Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__TABLE_EXISTS = 7;

	/**
	 * The feature id for the '<em><b>Column Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__COLUMN_EXISTS = 8;

	/**
	 * The feature id for the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__SEQUENCE_EXISTS = 9;

	/**
	 * The feature id for the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__FOREIGN_KEY_CONSTRAINT_EXISTS = 10;

	/**
	 * The feature id for the '<em><b>Index Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__INDEX_EXISTS = 11;

	/**
	 * The feature id for the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__PRIMARY_KEY_EXISTS = 12;

	/**
	 * The feature id for the '<em><b>View Exists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__VIEW_EXISTS = 13;

	/**
	 * The feature id for the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__TABLE_IS_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Row Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ROW_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Sql Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__SQL_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__CHANGE_LOG_PROPERTY_DEFINED = 17;

	/**
	 * The feature id for the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__EXPECTED_QUOTING_STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__CUSTOM_PRECONDITION = 19;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ANY = 20;

	/**
	 * The feature id for the '<em><b>On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ON_ERROR = 21;

	/**
	 * The feature id for the '<em><b>On Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ON_ERROR_MESSAGE = 22;

	/**
	 * The feature id for the '<em><b>On Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ON_FAIL = 23;

	/**
	 * The feature id for the '<em><b>On Fail Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ON_FAIL_MESSAGE = 24;

	/**
	 * The feature id for the '<em><b>On Sql Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1__ON_SQL_OUTPUT = 25;

	/**
	 * The number of structural features of the '<em>Pre Conditions Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Pre Conditions Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITIONS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.PrependTypeImpl <em>Prepend Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.PrependTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getPrependType()
	 * @generated
	 */
	int PREPEND_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Prepend Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prepend Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.PrimaryKeyExistsTypeImpl <em>Primary Key Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.PrimaryKeyExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getPrimaryKeyExistsType()
	 * @generated
	 */
	int PRIMARY_KEY_EXISTS_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_EXISTS_TYPE__PRIMARY_KEY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_EXISTS_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_EXISTS_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Primary Key Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_EXISTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Primary Key Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.PropertyTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DBMS = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RegExpReplaceTypeImpl <em>Reg Exp Replace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RegExpReplaceTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRegExpReplaceType()
	 * @generated
	 */
	int REG_EXP_REPLACE_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP_REPLACE_TYPE__REPLACE = 0;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP_REPLACE_TYPE__WITH = 1;

	/**
	 * The number of structural features of the '<em>Reg Exp Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP_REPLACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reg Exp Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_EXP_REPLACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl <em>Rename Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRenameColumnType()
	 * @generated
	 */
	int RENAME_COLUMN_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__COLUMN_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>New Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__NEW_COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Old Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__OLD_COLUMN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__SCHEMA_NAME = 5;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE__TABLE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Rename Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Rename Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RenameTableTypeImpl <em>Rename Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RenameTableTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRenameTableType()
	 * @generated
	 */
	int RENAME_TABLE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>New Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_TYPE__NEW_TABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Old Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_TYPE__OLD_TABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_TYPE__SCHEMA_NAME = 3;

	/**
	 * The number of structural features of the '<em>Rename Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rename Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RenameViewTypeImpl <em>Rename View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RenameViewTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRenameViewType()
	 * @generated
	 */
	int RENAME_VIEW_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_VIEW_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>New View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_VIEW_TYPE__NEW_VIEW_NAME = 1;

	/**
	 * The feature id for the '<em><b>Old View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_VIEW_TYPE__OLD_VIEW_NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_VIEW_TYPE__SCHEMA_NAME = 3;

	/**
	 * The number of structural features of the '<em>Rename View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_VIEW_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rename View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ReplaceTypeImpl <em>Replace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ReplaceTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getReplaceType()
	 * @generated
	 */
	int REPLACE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__REPLACE = 0;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__WITH = 1;

	/**
	 * The number of structural features of the '<em>Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl <em>Rollback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RollbackTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRollbackType()
	 * @generated
	 */
	int ROLLBACK_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Change Set Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CHANGE_SET_CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Create Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CREATE_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Drop Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Create View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CREATE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Rename View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__RENAME_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Drop View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__INSERT = 8;

	/**
	 * The feature id for the '<em><b>Add Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__SQL = 10;

	/**
	 * The feature id for the '<em><b>Create Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CREATE_PROCEDURE = 11;

	/**
	 * The feature id for the '<em><b>Drop Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_PROCEDURE = 12;

	/**
	 * The feature id for the '<em><b>Sql File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__SQL_FILE = 13;

	/**
	 * The feature id for the '<em><b>Rename Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__RENAME_TABLE = 14;

	/**
	 * The feature id for the '<em><b>Rename Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__RENAME_COLUMN = 15;

	/**
	 * The feature id for the '<em><b>Drop Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_COLUMN = 16;

	/**
	 * The feature id for the '<em><b>Merge Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__MERGE_COLUMNS = 17;

	/**
	 * The feature id for the '<em><b>Modify Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__MODIFY_DATA_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Create Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CREATE_SEQUENCE = 19;

	/**
	 * The feature id for the '<em><b>Alter Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ALTER_SEQUENCE = 20;

	/**
	 * The feature id for the '<em><b>Drop Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_SEQUENCE = 21;

	/**
	 * The feature id for the '<em><b>Create Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CREATE_INDEX = 22;

	/**
	 * The feature id for the '<em><b>Drop Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_INDEX = 23;

	/**
	 * The feature id for the '<em><b>Add Not Null Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_NOT_NULL_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Drop Not Null Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_NOT_NULL_CONSTRAINT = 25;

	/**
	 * The feature id for the '<em><b>Add Foreign Key Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_FOREIGN_KEY_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Drop Foreign Key Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_FOREIGN_KEY_CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Drop All Foreign Key Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_ALL_FOREIGN_KEY_CONSTRAINTS = 28;

	/**
	 * The feature id for the '<em><b>Add Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_PRIMARY_KEY = 29;

	/**
	 * The feature id for the '<em><b>Drop Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_PRIMARY_KEY = 30;

	/**
	 * The feature id for the '<em><b>Add Lookup Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_LOOKUP_TABLE = 31;

	/**
	 * The feature id for the '<em><b>Add Auto Increment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_AUTO_INCREMENT = 32;

	/**
	 * The feature id for the '<em><b>Add Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_DEFAULT_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Drop Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_DEFAULT_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Add Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ADD_UNIQUE_CONSTRAINT = 35;

	/**
	 * The feature id for the '<em><b>Drop Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DROP_UNIQUE_CONSTRAINT = 36;

	/**
	 * The feature id for the '<em><b>Custom Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CUSTOM_CHANGE = 37;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__UPDATE = 38;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__DELETE = 39;

	/**
	 * The feature id for the '<em><b>Load Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__LOAD_DATA = 40;

	/**
	 * The feature id for the '<em><b>Load Update Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__LOAD_UPDATE_DATA = 41;

	/**
	 * The feature id for the '<em><b>Execute Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__EXECUTE_COMMAND = 42;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__STOP = 43;

	/**
	 * The feature id for the '<em><b>Rollback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ROLLBACK = 44;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__ANY = 45;

	/**
	 * The feature id for the '<em><b>Change Set Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CHANGE_SET_AUTHOR = 46;

	/**
	 * The feature id for the '<em><b>Change Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CHANGE_SET_ID = 47;

	/**
	 * The feature id for the '<em><b>Change Set Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE__CHANGE_SET_PATH = 48;

	/**
	 * The number of structural features of the '<em>Rollback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE_FEATURE_COUNT = 49;

	/**
	 * The number of operations of the '<em>Rollback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RowCountTypeImpl <em>Row Count Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RowCountTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRowCountType()
	 * @generated
	 */
	int ROW_COUNT_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Expected Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_TYPE__EXPECTED_ROWS = 1;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_TYPE__SCHEMA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_TYPE__TABLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Row Count Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Row Count Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.RunningAsTypeImpl <em>Running As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.RunningAsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getRunningAsType()
	 * @generated
	 */
	int RUNNING_AS_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_AS_TYPE__USERNAME = 0;

	/**
	 * The number of structural features of the '<em>Running As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_AS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Running As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_AS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.SequenceExistsTypeImpl <em>Sequence Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.SequenceExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getSequenceExistsType()
	 * @generated
	 */
	int SEQUENCE_EXISTS_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXISTS_TYPE__SCHEMA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXISTS_TYPE__SEQUENCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Sequence Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXISTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sequence Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.SqlCheckTypeImpl <em>Sql Check Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.SqlCheckTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getSqlCheckType()
	 * @generated
	 */
	int SQL_CHECK_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_CHECK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Expected Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_CHECK_TYPE__EXPECTED_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Sql Check Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_CHECK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sql Check Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_CHECK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl <em>Sql File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.SqlFileTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getSqlFileType()
	 * @generated
	 */
	int SQL_FILE_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__DBMS = 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__ENCODING = 1;

	/**
	 * The feature id for the '<em><b>End Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__END_DELIMITER = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__PATH = 3;

	/**
	 * The feature id for the '<em><b>Relative To Changelog File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__RELATIVE_TO_CHANGELOG_FILE = 4;

	/**
	 * The feature id for the '<em><b>Split Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__SPLIT_STATEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Strip Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE__STRIP_COMMENTS = 6;

	/**
	 * The number of structural features of the '<em>Sql File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Sql File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_FILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl <em>Sql Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.SqlTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getSqlType()
	 * @generated
	 */
	int SQL_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE__DBMS = 2;

	/**
	 * The feature id for the '<em><b>End Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE__END_DELIMITER = 3;

	/**
	 * The feature id for the '<em><b>Split Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE__SPLIT_STATEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Strip Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE__STRIP_COMMENTS = 5;

	/**
	 * The number of structural features of the '<em>Sql Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sql Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.StopTypeImpl <em>Stop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.StopTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getStopType()
	 * @generated
	 */
	int STOP_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.TableExistsTypeImpl <em>Table Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.TableExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getTableExistsType()
	 * @generated
	 */
	int TABLE_EXISTS_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXISTS_TYPE__SCHEMA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXISTS_TYPE__TABLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Table Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXISTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.TableIsEmptyTypeImpl <em>Table Is Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.TableIsEmptyTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getTableIsEmptyType()
	 * @generated
	 */
	int TABLE_IS_EMPTY_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_IS_EMPTY_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_IS_EMPTY_TYPE__SCHEMA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_IS_EMPTY_TYPE__TABLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Table Is Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_IS_EMPTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table Is Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_IS_EMPTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.TagDatabaseTypeImpl <em>Tag Database Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.TagDatabaseTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getTagDatabaseType()
	 * @generated
	 */
	int TAG_DATABASE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DATABASE_TYPE__TAG = 0;

	/**
	 * The number of structural features of the '<em>Tag Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DATABASE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DATABASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.UpdateTypeImpl <em>Update Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.UpdateTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__WHERE = 2;

	/**
	 * The feature id for the '<em><b>Where Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__WHERE_PARAMS = 3;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__CATALOG_NAME = 4;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__SCHEMA_NAME = 5;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__TABLE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ValidCheckSumTypeImpl <em>Valid Check Sum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ValidCheckSumTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getValidCheckSumType()
	 * @generated
	 */
	int VALID_CHECK_SUM_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CHECK_SUM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CHECK_SUM_TYPE__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Valid Check Sum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CHECK_SUM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Valid Check Sum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CHECK_SUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.ViewExistsTypeImpl <em>View Exists Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.ViewExistsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getViewExistsType()
	 * @generated
	 */
	int VIEW_EXISTS_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXISTS_TYPE__CATALOG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXISTS_TYPE__SCHEMA_NAME = 1;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXISTS_TYPE__VIEW_NAME = 2;

	/**
	 * The number of structural features of the '<em>View Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXISTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View Exists Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXISTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.impl.WhereParamsTypeImpl <em>Where Params Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.WhereParamsTypeImpl
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getWhereParamsType()
	 * @generated
	 */
	int WHERE_PARAMS_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_PARAMS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_PARAMS_TYPE__PARAM = 1;

	/**
	 * The number of structural features of the '<em>Where Params Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_PARAMS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Where Params Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_PARAMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions <em>Fk Cascade Action Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getFkCascadeActionOptions()
	 * @generated
	 */
	int FK_CASCADE_ACTION_OPTIONS = 87;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy <em>Object Quoting Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getObjectQuotingStrategy()
	 * @generated
	 */
	int OBJECT_QUOTING_STRATEGY = 88;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail <em>On Change Log Precondition Error Or Fail</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeLogPreconditionErrorOrFail()
	 * @generated
	 */
	int ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL = 89;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput <em>On Change Log Precondition On Sql Output</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeLogPreconditionOnSqlOutput()
	 * @generated
	 */
	int ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT = 90;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail <em>On Change Set Precondition Error Or Fail</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeSetPreconditionErrorOrFail()
	 * @generated
	 */
	int ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL = 91;

	/**
	 * The meta object id for the '{@link org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail <em>On Change Set Validation Fail</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeSetValidationFail()
	 * @generated
	 */
	int ON_CHANGE_SET_VALIDATION_FAIL = 92;

	/**
	 * The meta object id for the '<em>Boolean Exp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getBooleanExp()
	 * @generated
	 */
	int BOOLEAN_EXP = 93;

	/**
	 * The meta object id for the '<em>Boolean Exp Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getBooleanExpMember0()
	 * @generated
	 */
	int BOOLEAN_EXP_MEMBER0 = 94;

	/**
	 * The meta object id for the '<em>Boolean Exp Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getBooleanExpMember0Object()
	 * @generated
	 */
	int BOOLEAN_EXP_MEMBER0_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Boolean Exp Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getBooleanExpMember1()
	 * @generated
	 */
	int BOOLEAN_EXP_MEMBER1 = 96;

	/**
	 * The meta object id for the '<em>Fk Cascade Action Options Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getFkCascadeActionOptionsObject()
	 * @generated
	 */
	int FK_CASCADE_ACTION_OPTIONS_OBJECT = 97;

	/**
	 * The meta object id for the '<em>Integer Exp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getIntegerExp()
	 * @generated
	 */
	int INTEGER_EXP = 98;

	/**
	 * The meta object id for the '<em>Integer Exp Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getIntegerExpMember0()
	 * @generated
	 */
	int INTEGER_EXP_MEMBER0 = 99;

	/**
	 * The meta object id for the '<em>Integer Exp Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getIntegerExpMember1()
	 * @generated
	 */
	int INTEGER_EXP_MEMBER1 = 100;

	/**
	 * The meta object id for the '<em>Object Quoting Strategy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getObjectQuotingStrategyObject()
	 * @generated
	 */
	int OBJECT_QUOTING_STRATEGY_OBJECT = 101;

	/**
	 * The meta object id for the '<em>On Change Log Precondition Error Or Fail Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeLogPreconditionErrorOrFailObject()
	 * @generated
	 */
	int ON_CHANGE_LOG_PRECONDITION_ERROR_OR_FAIL_OBJECT = 102;

	/**
	 * The meta object id for the '<em>On Change Log Precondition On Sql Output Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeLogPreconditionOnSqlOutputObject()
	 * @generated
	 */
	int ON_CHANGE_LOG_PRECONDITION_ON_SQL_OUTPUT_OBJECT = 103;

	/**
	 * The meta object id for the '<em>On Change Set Precondition Error Or Fail Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeSetPreconditionErrorOrFailObject()
	 * @generated
	 */
	int ON_CHANGE_SET_PRECONDITION_ERROR_OR_FAIL_OBJECT = 104;

	/**
	 * The meta object id for the '<em>On Change Set Validation Fail Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getOnChangeSetValidationFailObject()
	 * @generated
	 */
	int ON_CHANGE_SET_VALIDATION_FAIL_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Property Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.liquibase.xml.ns.dbchangelog.impl.DbchangelogPackageImpl#getPropertyExpression()
	 * @generated
	 */
	int PROPERTY_EXPRESSION = 106;


	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType <em>Add Auto Increment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Auto Increment Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType
	 * @generated
	 */
	EClass getAddAutoIncrementType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getCatalogName()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnDataType()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_ColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getColumnName()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getIncrementBy()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_IncrementBy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getSchemaName()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getStartWith <em>Start With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getStartWith()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_StartWith();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddAutoIncrementType#getTableName()
	 * @see #getAddAutoIncrementType()
	 * @generated
	 */
	EAttribute getAddAutoIncrementType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddColumnType <em>Add Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Column Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddColumnType
	 * @generated
	 */
	EClass getAddColumnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AddColumnType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddColumnType#getColumn()
	 * @see #getAddColumnType()
	 * @generated
	 */
	EReference getAddColumnType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddColumnType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddColumnType#getCatalogName()
	 * @see #getAddColumnType()
	 * @generated
	 */
	EAttribute getAddColumnType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddColumnType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddColumnType#getSchemaName()
	 * @see #getAddColumnType()
	 * @generated
	 */
	EAttribute getAddColumnType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddColumnType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddColumnType#getTableName()
	 * @see #getAddColumnType()
	 * @generated
	 */
	EAttribute getAddColumnType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType <em>Add Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Default Value Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType
	 * @generated
	 */
	EClass getAddDefaultValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getCatalogName()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnDataType()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_ColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getColumnName()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValue()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueBoolean <em>Default Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueBoolean()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_DefaultValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueComputed <em>Default Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueComputed()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_DefaultValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueDate <em>Default Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueDate()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_DefaultValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueNumeric <em>Default Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueNumeric()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_DefaultValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Sequence Next</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getDefaultValueSequenceNext()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_DefaultValueSequenceNext();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getSchemaName()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddDefaultValueType#getTableName()
	 * @see #getAddDefaultValueType()
	 * @generated
	 */
	EAttribute getAddDefaultValueType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType <em>Add Foreign Key Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Foreign Key Constraint Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType
	 * @generated
	 */
	EClass getAddForeignKeyConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseColumnNames <em>Base Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Column Names</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseColumnNames()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_BaseColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableCatalogName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_BaseTableCatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableName <em>Base Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_BaseTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableSchemaName <em>Base Table Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getBaseTableSchemaName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_BaseTableSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getConstraintName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeferrable <em>Deferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrable</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeferrable()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_Deferrable();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeleteCascade <em>Delete Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Cascade</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getDeleteCascade()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_DeleteCascade();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getInitiallyDeferred <em>Initially Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initially Deferred</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getInitiallyDeferred()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_InitiallyDeferred();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnDelete()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_OnDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnUpdate <em>On Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getOnUpdate()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_OnUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedColumnNames <em>Referenced Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Names</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedColumnNames()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_ReferencedColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableCatalogName <em>Referenced Table Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Table Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableCatalogName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_ReferencedTableCatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableName <em>Referenced Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_ReferencedTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableSchemaName <em>Referenced Table Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Table Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencedTableSchemaName()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_ReferencedTableSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencesUniqueColumn <em>References Unique Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>References Unique Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType#getReferencesUniqueColumn()
	 * @see #getAddForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getAddForeignKeyConstraintType_ReferencesUniqueColumn();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType <em>Add Lookup Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Lookup Table Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType
	 * @generated
	 */
	EClass getAddLookupTableType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getConstraintName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingColumnName <em>Existing Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingColumnName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_ExistingColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableCatalogName <em>Existing Table Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Table Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableCatalogName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_ExistingTableCatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableName <em>Existing Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_ExistingTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableSchemaName <em>Existing Table Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Table Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getExistingTableSchemaName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_ExistingTableSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnDataType <em>New Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnDataType()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_NewColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnName <em>New Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewColumnName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_NewColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableCatalogName <em>New Table Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Table Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableCatalogName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_NewTableCatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableName <em>New Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_NewTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableSchemaName <em>New Table Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Table Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddLookupTableType#getNewTableSchemaName()
	 * @see #getAddLookupTableType()
	 * @generated
	 */
	EAttribute getAddLookupTableType_NewTableSchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType <em>Add Not Null Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Not Null Constraint Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType
	 * @generated
	 */
	EClass getAddNotNullConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getCatalogName()
	 * @see #getAddNotNullConstraintType()
	 * @generated
	 */
	EAttribute getAddNotNullConstraintType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getColumnDataType()
	 * @see #getAddNotNullConstraintType()
	 * @generated
	 */
	EAttribute getAddNotNullConstraintType_ColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getColumnName()
	 * @see #getAddNotNullConstraintType()
	 * @generated
	 */
	EAttribute getAddNotNullConstraintType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getDefaultNullValue <em>Default Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Null Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getDefaultNullValue()
	 * @see #getAddNotNullConstraintType()
	 * @generated
	 */
	EAttribute getAddNotNullConstraintType_DefaultNullValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getSchemaName()
	 * @see #getAddNotNullConstraintType()
	 * @generated
	 */
	EAttribute getAddNotNullConstraintType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddNotNullConstraintType#getTableName()
	 * @see #getAddNotNullConstraintType()
	 * @generated
	 */
	EAttribute getAddNotNullConstraintType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType <em>Add Primary Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Primary Key Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType
	 * @generated
	 */
	EClass getAddPrimaryKeyType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getCatalogName()
	 * @see #getAddPrimaryKeyType()
	 * @generated
	 */
	EAttribute getAddPrimaryKeyType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Names</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getColumnNames()
	 * @see #getAddPrimaryKeyType()
	 * @generated
	 */
	EAttribute getAddPrimaryKeyType_ColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getConstraintName()
	 * @see #getAddPrimaryKeyType()
	 * @generated
	 */
	EAttribute getAddPrimaryKeyType_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getSchemaName()
	 * @see #getAddPrimaryKeyType()
	 * @generated
	 */
	EAttribute getAddPrimaryKeyType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getTableName()
	 * @see #getAddPrimaryKeyType()
	 * @generated
	 */
	EAttribute getAddPrimaryKeyType_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType#getTablespace()
	 * @see #getAddPrimaryKeyType()
	 * @generated
	 */
	EAttribute getAddPrimaryKeyType_Tablespace();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType <em>Add Unique Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Unique Constraint Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType
	 * @generated
	 */
	EClass getAddUniqueConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getCatalogName()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Names</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getColumnNames()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_ColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getConstraintName()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getDeferrable <em>Deferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrable</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getDeferrable()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_Deferrable();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getDisabled()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getInitiallyDeferred <em>Initially Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initially Deferred</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getInitiallyDeferred()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_InitiallyDeferred();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getSchemaName()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getTableName()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType#getTablespace()
	 * @see #getAddUniqueConstraintType()
	 * @generated
	 */
	EAttribute getAddUniqueConstraintType_Tablespace();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType <em>Alter Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter Sequence Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType
	 * @generated
	 */
	EClass getAlterSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getCatalogName()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getIncrementBy()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_IncrementBy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMaxValue()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getMinValue()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getOrdered()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSchemaName()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getSequenceName()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_SequenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AlterSequenceType#getStartValue()
	 * @see #getAlterSequenceType()
	 * @generated
	 */
	EAttribute getAlterSequenceType_StartValue();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AndType <em>And Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType
	 * @generated
	 */
	EClass getAndType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getGroup()
	 * @see #getAndType()
	 * @generated
	 */
	EAttribute getAndType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getAnd()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getOr()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getNot()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getDbms()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_Dbms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getRunningAs <em>Running As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running As</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getRunningAs()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_RunningAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getChangeSetExecuted <em>Change Set Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Set Executed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getChangeSetExecuted()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_ChangeSetExecuted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getTableExists <em>Table Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getTableExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_TableExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getColumnExists <em>Column Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getColumnExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_ColumnExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getSequenceExists <em>Sequence Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getSequenceExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_SequenceExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key Constraint Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getForeignKeyConstraintExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_ForeignKeyConstraintExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getIndexExists <em>Index Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getIndexExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_IndexExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getPrimaryKeyExists <em>Primary Key Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getPrimaryKeyExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_PrimaryKeyExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getViewExists <em>View Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getViewExists()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_ViewExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getTableIsEmpty <em>Table Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Is Empty</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getTableIsEmpty()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_TableIsEmpty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row Count</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getRowCount()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_RowCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getSqlCheck <em>Sql Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Check</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getSqlCheck()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_SqlCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Log Property Defined</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getChangeLogPropertyDefined()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_ChangeLogPropertyDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getExpectedQuotingStrategy()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_ExpectedQuotingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getCustomPrecondition <em>Custom Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Precondition</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getCustomPrecondition()
	 * @see #getAndType()
	 * @generated
	 */
	EReference getAndType_CustomPrecondition();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.AndType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AndType#getAny()
	 * @see #getAndType()
	 * @generated
	 */
	EAttribute getAndType_Any();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.AppendType <em>Append Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AppendType
	 * @generated
	 */
	EClass getAppendType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.AppendType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.AppendType#getValue()
	 * @see #getAppendType()
	 * @generated
	 */
	EAttribute getAppendType_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arg Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ArgType
	 * @generated
	 */
	EClass getArgType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ArgType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ArgType#getValue()
	 * @see #getArgType()
	 * @generated
	 */
	EAttribute getArgType_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType <em>Change Log Property Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Log Property Defined Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType
	 * @generated
	 */
	EClass getChangeLogPropertyDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType#getProperty()
	 * @see #getChangeLogPropertyDefinedType()
	 * @generated
	 */
	EAttribute getChangeLogPropertyDefinedType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType#getValue()
	 * @see #getChangeLogPropertyDefinedType()
	 * @generated
	 */
	EAttribute getChangeLogPropertyDefinedType_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType <em>Change Set Executed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Set Executed Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType
	 * @generated
	 */
	EClass getChangeSetExecutedType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getAuthor()
	 * @see #getChangeSetExecutedType()
	 * @generated
	 */
	EAttribute getChangeSetExecutedType_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getChangeLogFile <em>Change Log File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Log File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getChangeLogFile()
	 * @see #getChangeSetExecutedType()
	 * @generated
	 */
	EAttribute getChangeSetExecutedType_ChangeLogFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType#getId()
	 * @see #getChangeSetExecutedType()
	 * @generated
	 */
	EAttribute getChangeSetExecutedType_Id();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType <em>Change Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Set Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType
	 * @generated
	 */
	EClass getChangeSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getValidCheckSum <em>Valid Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valid Check Sum</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getValidCheckSum()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_ValidCheckSum();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Conditions</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getPreConditions()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_PreConditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getTagDatabase <em>Tag Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag Database</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getTagDatabase()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_TagDatabase();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getChangeSetChildren <em>Change Set Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Change Set Children</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getChangeSetChildren()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_ChangeSetChildren();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getComment()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateTable <em>Create Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateTable()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_CreateTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropTable <em>Drop Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropTable()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateView <em>Create View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateView()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_CreateView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameView <em>Rename View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameView()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_RenameView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropView <em>Drop View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropView()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getInsert()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_Insert();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddColumn()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSql()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_Sql();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateProcedure <em>Create Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Procedure</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateProcedure()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_CreateProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropProcedure <em>Drop Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Procedure</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropProcedure()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getSqlFile()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_SqlFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameTable()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_RenameTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRenameColumn()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_RenameColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropColumn <em>Drop Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropColumn()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getMergeColumns <em>Merge Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merge Columns</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getMergeColumns()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_MergeColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifyDataType <em>Modify Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifyDataType()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_ModifyDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateSequence <em>Create Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateSequence()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_CreateSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAlterSequence <em>Alter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alter Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAlterSequence()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AlterSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropSequence <em>Drop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropSequence()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateIndex <em>Create Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCreateIndex()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_CreateIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropIndex <em>Drop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropIndex()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddNotNullConstraint <em>Add Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Not Null Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddNotNullConstraint()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddNotNullConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Not Null Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropNotNullConstraint()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropNotNullConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Foreign Key Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddForeignKeyConstraint()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddForeignKeyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Foreign Key Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropForeignKeyConstraint()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropForeignKeyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop All Foreign Key Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropAllForeignKeyConstraints()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropAllForeignKeyConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddPrimaryKey()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropPrimaryKey <em>Drop Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropPrimaryKey()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddLookupTable <em>Add Lookup Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Lookup Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddLookupTable()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddLookupTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddAutoIncrement <em>Add Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Auto Increment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddAutoIncrement()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddAutoIncrement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddDefaultValue <em>Add Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddDefaultValue()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddDefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropDefaultValue <em>Drop Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropDefaultValue()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropDefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddUniqueConstraint <em>Add Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Unique Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAddUniqueConstraint()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_AddUniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropUniqueConstraint <em>Drop Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Unique Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDropUniqueConstraint()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_DropUniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCustomChange <em>Custom Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Change</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getCustomChange()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_CustomChange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getUpdate()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_Update();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDelete()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_Delete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadData <em>Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Data</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadData()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_LoadData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadUpdateData <em>Load Update Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Update Data</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLoadUpdateData()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_LoadUpdateData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getExecuteCommand <em>Execute Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute Command</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getExecuteCommand()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_ExecuteCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getStop()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_Stop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRollback <em>Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rollback</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRollback()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_Rollback();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAny()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifySql <em>Modify Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Sql</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getModifySql()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EReference getChangeSetType_ModifySql();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAuthor()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getContext()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getDbms()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getFailOnError <em>Fail On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail On Error</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getFailOnError()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_FailOnError();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getId()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLogicalFilePath <em>Logical File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical File Path</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getLogicalFilePath()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_LogicalFilePath();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getObjectQuotingStrategy()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_ObjectQuotingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getOnValidationFail <em>On Validation Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Validation Fail</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getOnValidationFail()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_OnValidationFail();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunAlways <em>Run Always</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Always</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunAlways()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_RunAlways();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunInTransaction <em>Run In Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run In Transaction</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunInTransaction()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_RunInTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunOnChange <em>Run On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run On Change</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getRunOnChange()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_RunOnChange();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ChangeSetType#getAnyAttribute()
	 * @see #getChangeSetType()
	 * @generated
	 */
	EAttribute getChangeSetType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType <em>Column Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnExistsType
	 * @generated
	 */
	EClass getColumnExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getCatalogName()
	 * @see #getColumnExistsType()
	 * @generated
	 */
	EAttribute getColumnExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getColumnName()
	 * @see #getColumnExistsType()
	 * @generated
	 */
	EAttribute getColumnExistsType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getSchemaName()
	 * @see #getColumnExistsType()
	 * @generated
	 */
	EAttribute getColumnExistsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnExistsType#getTableName()
	 * @see #getColumnExistsType()
	 * @generated
	 */
	EAttribute getColumnExistsType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType
	 * @generated
	 */
	EClass getColumnType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getMixed()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getConstraints()
	 * @see #getColumnType()
	 * @generated
	 */
	EReference getColumnType_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getAutoIncrement()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_AutoIncrement();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValue()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueBoolean <em>Default Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueBoolean()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueComputed <em>Default Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueComputed()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueDate <em>Default Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueDate()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueNumeric <em>Default Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueNumeric()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceCurrent <em>Default Value Sequence Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Sequence Current</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceCurrent()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValueSequenceCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Sequence Next</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getDefaultValueSequenceNext()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_DefaultValueSequenceNext();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getEncoding()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getIncrementBy()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_IncrementBy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getName()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getRemarks()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getStartWith <em>Start With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getStartWith()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_StartWith();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getType()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValue()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBlobFile <em>Value Blob File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Blob File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBlobFile()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueBlobFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBoolean <em>Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueBoolean()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueClobFile <em>Value Clob File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Clob File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueClobFile()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueClobFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueComputed <em>Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueComputed()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueDate <em>Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueDate()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueNumeric <em>Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueNumeric()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceCurrent <em>Value Sequence Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Sequence Current</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceCurrent()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueSequenceCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceNext <em>Value Sequence Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Sequence Next</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType#getValueSequenceNext()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_ValueSequenceNext();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1 <em>Column Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type1</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1
	 * @generated
	 */
	EClass getColumnType1();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValue()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueBoolean <em>Default Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueBoolean()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_DefaultValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueComputed <em>Default Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueComputed()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_DefaultValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueDate <em>Default Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueDate()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_DefaultValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueNumeric <em>Default Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getDefaultValueNumeric()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_DefaultValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getHeader()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getIndex()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getName()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType1#getType()
	 * @see #getColumnType1()
	 * @generated
	 */
	EAttribute getColumnType1_Type();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2 <em>Column Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type2</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2
	 * @generated
	 */
	EClass getColumnType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getMixed()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getConstraints()
	 * @see #getColumnType2()
	 * @generated
	 */
	EReference getColumnType2_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getAutoIncrement()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_AutoIncrement();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValue()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueBoolean <em>Default Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueBoolean()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueComputed <em>Default Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueComputed()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueDate <em>Default Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueDate()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueNumeric <em>Default Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueNumeric()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueSequenceCurrent <em>Default Value Sequence Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Sequence Current</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueSequenceCurrent()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValueSequenceCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Sequence Next</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getDefaultValueSequenceNext()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_DefaultValueSequenceNext();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getEncoding()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getIncrementBy()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_IncrementBy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getName()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getRemarks()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getStartWith <em>Start With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getStartWith()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_StartWith();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getType()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValue()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueBlobFile <em>Value Blob File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Blob File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueBlobFile()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueBlobFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueBoolean <em>Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueBoolean()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueClobFile <em>Value Clob File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Clob File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueClobFile()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueClobFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueComputed <em>Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueComputed()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueDate <em>Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueDate()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueNumeric <em>Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueNumeric()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueSequenceCurrent <em>Value Sequence Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Sequence Current</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueSequenceCurrent()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueSequenceCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueSequenceNext <em>Value Sequence Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Sequence Next</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType2#getValueSequenceNext()
	 * @see #getColumnType2()
	 * @generated
	 */
	EAttribute getColumnType2_ValueSequenceNext();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3 <em>Column Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type3</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3
	 * @generated
	 */
	EClass getColumnType3();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValue()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueBoolean <em>Default Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueBoolean()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_DefaultValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueComputed <em>Default Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueComputed()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_DefaultValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueDate <em>Default Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueDate()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_DefaultValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueNumeric <em>Default Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getDefaultValueNumeric()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_DefaultValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getHeader()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getIndex()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getName()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType3#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType3#getType()
	 * @see #getColumnType3()
	 * @generated
	 */
	EAttribute getColumnType3_Type();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4 <em>Column Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type4</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType4
	 * @generated
	 */
	EClass getColumnType4();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getAfterColumn <em>After Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType4#getAfterColumn()
	 * @see #getColumnType4()
	 * @generated
	 */
	EAttribute getColumnType4_AfterColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getBeforeColumn <em>Before Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType4#getBeforeColumn()
	 * @see #getColumnType4()
	 * @generated
	 */
	EAttribute getColumnType4_BeforeColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ColumnType4#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ColumnType4#getPosition()
	 * @see #getColumnType4()
	 * @generated
	 */
	EAttribute getColumnType4_Position();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType
	 * @generated
	 */
	EClass getConstraintsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getCheckConstraint()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeferrable <em>Deferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrable</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeferrable()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_Deferrable();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeleteCascade <em>Delete Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Cascade</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getDeleteCascade()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_DeleteCascade();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getForeignKeyName <em>Foreign Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getForeignKeyName()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_ForeignKeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getInitiallyDeferred <em>Initially Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initially Deferred</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getInitiallyDeferred()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_InitiallyDeferred();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getNullable()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKey()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyName <em>Primary Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyName()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_PrimaryKeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyTablespace <em>Primary Key Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key Tablespace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getPrimaryKeyTablespace()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_PrimaryKeyTablespace();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedColumnNames <em>Referenced Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Names</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedColumnNames()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_ReferencedColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedTableName <em>Referenced Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferencedTableName()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_ReferencedTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>References</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getReferences()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_References();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUnique()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUniqueConstraintName <em>Unique Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ConstraintsType#getUniqueConstraintName()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EAttribute getConstraintsType_UniqueConstraintName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType <em>Create Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Index Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType
	 * @generated
	 */
	EClass getCreateIndexType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getColumn()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EReference getCreateIndexType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getAssociatedWith <em>Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getAssociatedWith()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_AssociatedWith();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getCatalogName()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getIndexName()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_IndexName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getSchemaName()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getTableName()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getTablespace()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_Tablespace();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateIndexType#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateIndexType#getUnique()
	 * @see #getCreateIndexType()
	 * @generated
	 */
	EAttribute getCreateIndexType_Unique();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType <em>Create Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Procedure Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType
	 * @generated
	 */
	EClass getCreateProcedureType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getMixed()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getComment()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getCatalogName()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getDbms()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getEncoding()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getPath()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getProcedureName()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_ProcedureName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getRelativeToChangelogFile <em>Relative To Changelog File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative To Changelog File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getRelativeToChangelogFile()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_RelativeToChangelogFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateProcedureType#getSchemaName()
	 * @see #getCreateProcedureType()
	 * @generated
	 */
	EAttribute getCreateProcedureType_SchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType <em>Create Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Sequence Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType
	 * @generated
	 */
	EClass getCreateSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getCatalogName()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getCycle()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_Cycle();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getIncrementBy()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_IncrementBy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getMaxValue()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getMinValue()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getOrdered()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getSchemaName()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getSequenceName()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_SequenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateSequenceType#getStartValue()
	 * @see #getCreateSequenceType()
	 * @generated
	 */
	EAttribute getCreateSequenceType_StartValue();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType <em>Create Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Table Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType
	 * @generated
	 */
	EClass getCreateTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType#getColumn()
	 * @see #getCreateTableType()
	 * @generated
	 */
	EReference getCreateTableType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType#getCatalogName()
	 * @see #getCreateTableType()
	 * @generated
	 */
	EAttribute getCreateTableType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType#getRemarks()
	 * @see #getCreateTableType()
	 * @generated
	 */
	EAttribute getCreateTableType_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType#getSchemaName()
	 * @see #getCreateTableType()
	 * @generated
	 */
	EAttribute getCreateTableType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType#getTableName()
	 * @see #getCreateTableType()
	 * @generated
	 */
	EAttribute getCreateTableType_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateTableType#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateTableType#getTablespace()
	 * @see #getCreateTableType()
	 * @generated
	 */
	EAttribute getCreateTableType_Tablespace();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType <em>Create View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create View Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType
	 * @generated
	 */
	EClass getCreateViewType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType#getValue()
	 * @see #getCreateViewType()
	 * @generated
	 */
	EAttribute getCreateViewType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType#getCatalogName()
	 * @see #getCreateViewType()
	 * @generated
	 */
	EAttribute getCreateViewType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType#getReplaceIfExists <em>Replace If Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace If Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType#getReplaceIfExists()
	 * @see #getCreateViewType()
	 * @generated
	 */
	EAttribute getCreateViewType_ReplaceIfExists();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType#getSchemaName()
	 * @see #getCreateViewType()
	 * @generated
	 */
	EAttribute getCreateViewType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CreateViewType#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CreateViewType#getViewName()
	 * @see #getCreateViewType()
	 * @generated
	 */
	EAttribute getCreateViewType_ViewName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CustomChangeType <em>Custom Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Change Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomChangeType
	 * @generated
	 */
	EClass getCustomChangeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.CustomChangeType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomChangeType#getParam()
	 * @see #getCustomChangeType()
	 * @generated
	 */
	EReference getCustomChangeType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CustomChangeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomChangeType#getClass_()
	 * @see #getCustomChangeType()
	 * @generated
	 */
	EAttribute getCustomChangeType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.CustomChangeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomChangeType#getAnyAttribute()
	 * @see #getCustomChangeType()
	 * @generated
	 */
	EAttribute getCustomChangeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.CustomPreconditionType <em>Custom Precondition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Precondition Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomPreconditionType
	 * @generated
	 */
	EClass getCustomPreconditionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.CustomPreconditionType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomPreconditionType#getParam()
	 * @see #getCustomPreconditionType()
	 * @generated
	 */
	EReference getCustomPreconditionType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.CustomPreconditionType#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.CustomPreconditionType#getClassName()
	 * @see #getCustomPreconditionType()
	 * @generated
	 */
	EAttribute getCustomPreconditionType_ClassName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType <em>Database Change Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Change Log Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType
	 * @generated
	 */
	EClass getDatabaseChangeLogType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getProperty()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EReference getDatabaseChangeLogType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Conditions</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getPreConditions()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EReference getDatabaseChangeLogType_PreConditions();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getGroup()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EAttribute getDatabaseChangeLogType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Set</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getChangeSet()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EReference getDatabaseChangeLogType_ChangeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getInclude()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EReference getDatabaseChangeLogType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getIncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include All</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getIncludeAll()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EReference getDatabaseChangeLogType_IncludeAll();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getLogicalFilePath <em>Logical File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical File Path</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getLogicalFilePath()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EAttribute getDatabaseChangeLogType_LogicalFilePath();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getObjectQuotingStrategy <em>Object Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getObjectQuotingStrategy()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EAttribute getDatabaseChangeLogType_ObjectQuotingStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType#getAnyAttribute()
	 * @see #getDatabaseChangeLogType()
	 * @generated
	 */
	EAttribute getDatabaseChangeLogType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DbmsType <em>Dbms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dbms Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DbmsType
	 * @generated
	 */
	EClass getDbmsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DbmsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DbmsType#getType()
	 * @see #getDbmsType()
	 * @generated
	 */
	EAttribute getDbmsType_Type();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType
	 * @generated
	 */
	EClass getDeleteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.DeleteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType#getMixed()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DeleteType#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType#getWhere()
	 * @see #getDeleteType()
	 * @generated
	 */
	EReference getDeleteType_Where();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DeleteType#getWhereParams <em>Where Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Params</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType#getWhereParams()
	 * @see #getDeleteType()
	 * @generated
	 */
	EReference getDeleteType_WhereParams();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DeleteType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType#getCatalogName()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DeleteType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType#getSchemaName()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DeleteType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DeleteType#getTableName()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement <em>Add Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Auto Increment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddAutoIncrement();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue <em>Add Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddDefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Foreign Key Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddForeignKeyConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable <em>Add Lookup Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Lookup Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddLookupTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint <em>Add Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Not Null Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddNotNullConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddPrimaryKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint <em>Add Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Unique Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddUniqueConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence <em>Alter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alter Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AlterSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_And();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Property Defined</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeLogPropertyDefined();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted <em>Change Set Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Set Executed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeSetExecuted();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists <em>Column Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ColumnExists();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex <em>Create Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure <em>Create Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Procedure</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence <em>Create Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable <em>Create Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView <em>Create View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateView();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange <em>Custom Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Change</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomChange();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition <em>Custom Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Precondition</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomPrecondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog <em>Database Change Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Change Log</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseChangeLog();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dbms();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop All Foreign Key Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropAllForeignKeyConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn <em>Drop Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue <em>Drop Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropDefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Foreign Key Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropForeignKeyConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex <em>Drop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Not Null Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropNotNullConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey <em>Drop Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropPrimaryKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure <em>Drop Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Procedure</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence <em>Drop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable <em>Drop Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint <em>Drop Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Unique Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropUniqueConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView <em>Drop View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropView();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand <em>Execute Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execute Command</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExecuteCommand();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExpectedQuotingStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key Constraint Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ForeignKeyConstraintExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists <em>Index Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IndexExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Insert();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData <em>Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Data</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoadData();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData <em>Load Update Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Update Data</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoadUpdateData();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns <em>Merge Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merge Columns</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MergeColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType <em>Modify Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modify Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModifyDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Not();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Or();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Param();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists <em>Primary Key Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimaryKeyExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rename Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RenameColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rename Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RenameTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView <em>Rename View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rename View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RenameView();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback <em>Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rollback</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rollback();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Row Count</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RowCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs <em>Running As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Running As</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RunningAs();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists <em>Sequence Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SequenceExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sql();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck <em>Sql Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Check</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SqlCheck();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SqlFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Stop();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists <em>Table Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty <em>Table Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Is Empty</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableIsEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase <em>Tag Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag Database</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TagDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Update();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists <em>View Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ViewExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams <em>Where Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Params</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WhereParams();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType <em>Drop All Foreign Key Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop All Foreign Key Constraints Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType
	 * @generated
	 */
	EClass getDropAllForeignKeyConstraintsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType#getBaseTableCatalogName()
	 * @see #getDropAllForeignKeyConstraintsType()
	 * @generated
	 */
	EAttribute getDropAllForeignKeyConstraintsType_BaseTableCatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType#getBaseTableName <em>Base Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType#getBaseTableName()
	 * @see #getDropAllForeignKeyConstraintsType()
	 * @generated
	 */
	EAttribute getDropAllForeignKeyConstraintsType_BaseTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType#getBaseTableSchemaName <em>Base Table Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType#getBaseTableSchemaName()
	 * @see #getDropAllForeignKeyConstraintsType()
	 * @generated
	 */
	EAttribute getDropAllForeignKeyConstraintsType_BaseTableSchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropColumnType <em>Drop Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Column Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropColumnType
	 * @generated
	 */
	EClass getDropColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropColumnType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropColumnType#getCatalogName()
	 * @see #getDropColumnType()
	 * @generated
	 */
	EAttribute getDropColumnType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropColumnType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropColumnType#getColumnName()
	 * @see #getDropColumnType()
	 * @generated
	 */
	EAttribute getDropColumnType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropColumnType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropColumnType#getSchemaName()
	 * @see #getDropColumnType()
	 * @generated
	 */
	EAttribute getDropColumnType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropColumnType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropColumnType#getTableName()
	 * @see #getDropColumnType()
	 * @generated
	 */
	EAttribute getDropColumnType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType <em>Drop Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Default Value Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType
	 * @generated
	 */
	EClass getDropDefaultValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getCatalogName()
	 * @see #getDropDefaultValueType()
	 * @generated
	 */
	EAttribute getDropDefaultValueType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getColumnDataType()
	 * @see #getDropDefaultValueType()
	 * @generated
	 */
	EAttribute getDropDefaultValueType_ColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getColumnName()
	 * @see #getDropDefaultValueType()
	 * @generated
	 */
	EAttribute getDropDefaultValueType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getSchemaName()
	 * @see #getDropDefaultValueType()
	 * @generated
	 */
	EAttribute getDropDefaultValueType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropDefaultValueType#getTableName()
	 * @see #getDropDefaultValueType()
	 * @generated
	 */
	EAttribute getDropDefaultValueType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType <em>Drop Foreign Key Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Foreign Key Constraint Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType
	 * @generated
	 */
	EClass getDropForeignKeyConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableCatalogName <em>Base Table Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableCatalogName()
	 * @see #getDropForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getDropForeignKeyConstraintType_BaseTableCatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableName <em>Base Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableName()
	 * @see #getDropForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getDropForeignKeyConstraintType_BaseTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableSchemaName <em>Base Table Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Table Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getBaseTableSchemaName()
	 * @see #getDropForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getDropForeignKeyConstraintType_BaseTableSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropForeignKeyConstraintType#getConstraintName()
	 * @see #getDropForeignKeyConstraintType()
	 * @generated
	 */
	EAttribute getDropForeignKeyConstraintType_ConstraintName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType <em>Drop Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Index Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType
	 * @generated
	 */
	EClass getDropIndexType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType#getAssociatedWith <em>Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType#getAssociatedWith()
	 * @see #getDropIndexType()
	 * @generated
	 */
	EAttribute getDropIndexType_AssociatedWith();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType#getCatalogName()
	 * @see #getDropIndexType()
	 * @generated
	 */
	EAttribute getDropIndexType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType#getIndexName()
	 * @see #getDropIndexType()
	 * @generated
	 */
	EAttribute getDropIndexType_IndexName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType#getSchemaName()
	 * @see #getDropIndexType()
	 * @generated
	 */
	EAttribute getDropIndexType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropIndexType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropIndexType#getTableName()
	 * @see #getDropIndexType()
	 * @generated
	 */
	EAttribute getDropIndexType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType <em>Drop Not Null Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Not Null Constraint Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType
	 * @generated
	 */
	EClass getDropNotNullConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getCatalogName()
	 * @see #getDropNotNullConstraintType()
	 * @generated
	 */
	EAttribute getDropNotNullConstraintType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getColumnDataType()
	 * @see #getDropNotNullConstraintType()
	 * @generated
	 */
	EAttribute getDropNotNullConstraintType_ColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getColumnName()
	 * @see #getDropNotNullConstraintType()
	 * @generated
	 */
	EAttribute getDropNotNullConstraintType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getSchemaName()
	 * @see #getDropNotNullConstraintType()
	 * @generated
	 */
	EAttribute getDropNotNullConstraintType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropNotNullConstraintType#getTableName()
	 * @see #getDropNotNullConstraintType()
	 * @generated
	 */
	EAttribute getDropNotNullConstraintType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType <em>Drop Primary Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Primary Key Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType
	 * @generated
	 */
	EClass getDropPrimaryKeyType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getCatalogName()
	 * @see #getDropPrimaryKeyType()
	 * @generated
	 */
	EAttribute getDropPrimaryKeyType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getConstraintName()
	 * @see #getDropPrimaryKeyType()
	 * @generated
	 */
	EAttribute getDropPrimaryKeyType_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getSchemaName()
	 * @see #getDropPrimaryKeyType()
	 * @generated
	 */
	EAttribute getDropPrimaryKeyType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropPrimaryKeyType#getTableName()
	 * @see #getDropPrimaryKeyType()
	 * @generated
	 */
	EAttribute getDropPrimaryKeyType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropProcedureType <em>Drop Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Procedure Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropProcedureType
	 * @generated
	 */
	EClass getDropProcedureType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropProcedureType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropProcedureType#getCatalogName()
	 * @see #getDropProcedureType()
	 * @generated
	 */
	EAttribute getDropProcedureType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropProcedureType#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropProcedureType#getProcedureName()
	 * @see #getDropProcedureType()
	 * @generated
	 */
	EAttribute getDropProcedureType_ProcedureName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropProcedureType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropProcedureType#getSchemaName()
	 * @see #getDropProcedureType()
	 * @generated
	 */
	EAttribute getDropProcedureType_SchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType <em>Drop Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Sequence Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType
	 * @generated
	 */
	EClass getDropSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getCatalogName()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getIncrementBy()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_IncrementBy();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getMaxValue()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getMinValue()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getOrdered()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getSchemaName()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getSequenceName()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_SequenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropSequenceType#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropSequenceType#getStartValue()
	 * @see #getDropSequenceType()
	 * @generated
	 */
	EAttribute getDropSequenceType_StartValue();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropTableType <em>Drop Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Table Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropTableType
	 * @generated
	 */
	EClass getDropTableType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropTableType#getCascadeConstraints <em>Cascade Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropTableType#getCascadeConstraints()
	 * @see #getDropTableType()
	 * @generated
	 */
	EAttribute getDropTableType_CascadeConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropTableType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropTableType#getCatalogName()
	 * @see #getDropTableType()
	 * @generated
	 */
	EAttribute getDropTableType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropTableType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropTableType#getSchemaName()
	 * @see #getDropTableType()
	 * @generated
	 */
	EAttribute getDropTableType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropTableType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropTableType#getTableName()
	 * @see #getDropTableType()
	 * @generated
	 */
	EAttribute getDropTableType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType <em>Drop Unique Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Unique Constraint Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType
	 * @generated
	 */
	EClass getDropUniqueConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getCatalogName()
	 * @see #getDropUniqueConstraintType()
	 * @generated
	 */
	EAttribute getDropUniqueConstraintType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getConstraintName()
	 * @see #getDropUniqueConstraintType()
	 * @generated
	 */
	EAttribute getDropUniqueConstraintType_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getSchemaName()
	 * @see #getDropUniqueConstraintType()
	 * @generated
	 */
	EAttribute getDropUniqueConstraintType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getTableName()
	 * @see #getDropUniqueConstraintType()
	 * @generated
	 */
	EAttribute getDropUniqueConstraintType_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getUniqueColumns <em>Unique Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Columns</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropUniqueConstraintType#getUniqueColumns()
	 * @see #getDropUniqueConstraintType()
	 * @generated
	 */
	EAttribute getDropUniqueConstraintType_UniqueColumns();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.DropViewType <em>Drop View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop View Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropViewType
	 * @generated
	 */
	EClass getDropViewType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropViewType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropViewType#getCatalogName()
	 * @see #getDropViewType()
	 * @generated
	 */
	EAttribute getDropViewType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropViewType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropViewType#getSchemaName()
	 * @see #getDropViewType()
	 * @generated
	 */
	EAttribute getDropViewType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.DropViewType#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.DropViewType#getViewName()
	 * @see #getDropViewType()
	 * @generated
	 */
	EAttribute getDropViewType_ViewName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType <em>Execute Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Command Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ExecuteCommandType
	 * @generated
	 */
	EClass getExecuteCommandType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getArg()
	 * @see #getExecuteCommandType()
	 * @generated
	 */
	EReference getExecuteCommandType_Arg();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getExecutable()
	 * @see #getExecuteCommandType()
	 * @generated
	 */
	EAttribute getExecuteCommandType_Executable();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getOs()
	 * @see #getExecuteCommandType()
	 * @generated
	 */
	EAttribute getExecuteCommandType_Os();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType <em>Expected Quoting Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Quoting Strategy Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType
	 * @generated
	 */
	EClass getExpectedQuotingStrategyType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType#getStrategy()
	 * @see #getExpectedQuotingStrategyType()
	 * @generated
	 */
	EAttribute getExpectedQuotingStrategyType_Strategy();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType <em>Foreign Key Constraint Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Constraint Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType
	 * @generated
	 */
	EClass getForeignKeyConstraintExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getCatalogName()
	 * @see #getForeignKeyConstraintExistsType()
	 * @generated
	 */
	EAttribute getForeignKeyConstraintExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyName <em>Foreign Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyName()
	 * @see #getForeignKeyConstraintExistsType()
	 * @generated
	 */
	EAttribute getForeignKeyConstraintExistsType_ForeignKeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyTableName <em>Foreign Key Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getForeignKeyTableName()
	 * @see #getForeignKeyConstraintExistsType()
	 * @generated
	 */
	EAttribute getForeignKeyConstraintExistsType_ForeignKeyTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType#getSchemaName()
	 * @see #getForeignKeyConstraintExistsType()
	 * @generated
	 */
	EAttribute getForeignKeyConstraintExistsType_SchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.IncludeAllType <em>Include All Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include All Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeAllType
	 * @generated
	 */
	EClass getIncludeAllType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IncludeAllType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeAllType#getFilter()
	 * @see #getIncludeAllType()
	 * @generated
	 */
	EAttribute getIncludeAllType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IncludeAllType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeAllType#getPath()
	 * @see #getIncludeAllType()
	 * @generated
	 */
	EAttribute getIncludeAllType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IncludeAllType#getRelativeToChangelogFile <em>Relative To Changelog File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative To Changelog File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeAllType#getRelativeToChangelogFile()
	 * @see #getIncludeAllType()
	 * @generated
	 */
	EAttribute getIncludeAllType_RelativeToChangelogFile();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.IncludeAllType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeAllType#getAnyAttribute()
	 * @see #getIncludeAllType()
	 * @generated
	 */
	EAttribute getIncludeAllType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IncludeType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeType#getFile()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_File();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IncludeType#getRelativeToChangelogFile <em>Relative To Changelog File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative To Changelog File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeType#getRelativeToChangelogFile()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_RelativeToChangelogFile();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.IncludeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IncludeType#getAnyAttribute()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType <em>Index Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType
	 * @generated
	 */
	EClass getIndexExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType#getCatalogName()
	 * @see #getIndexExistsType()
	 * @generated
	 */
	EAttribute getIndexExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Names</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType#getColumnNames()
	 * @see #getIndexExistsType()
	 * @generated
	 */
	EAttribute getIndexExistsType_ColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType#getIndexName()
	 * @see #getIndexExistsType()
	 * @generated
	 */
	EAttribute getIndexExistsType_IndexName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType#getSchemaName()
	 * @see #getIndexExistsType()
	 * @generated
	 */
	EAttribute getIndexExistsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.IndexExistsType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.IndexExistsType#getTableName()
	 * @see #getIndexExistsType()
	 * @generated
	 */
	EAttribute getIndexExistsType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.InsertType <em>Insert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType
	 * @generated
	 */
	EClass getInsertType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.InsertType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType#getColumn()
	 * @see #getInsertType()
	 * @generated
	 */
	EReference getInsertType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.InsertType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType#getCatalogName()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.InsertType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType#getDbms()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.InsertType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType#getSchemaName()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.InsertType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.InsertType#getTableName()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType <em>Load Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType
	 * @generated
	 */
	EClass getLoadDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getMixed()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getColumn()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EReference getLoadDataType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getCatalogName()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getEncoding()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getFile()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_File();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getQuotchar <em>Quotchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quotchar</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getQuotchar()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_Quotchar();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getSchemaName()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getSeparator()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadDataType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadDataType#getTableName()
	 * @see #getLoadDataType()
	 * @generated
	 */
	EAttribute getLoadDataType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType <em>Load Update Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Update Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType
	 * @generated
	 */
	EClass getLoadUpdateDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getMixed()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getColumn()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EReference getLoadUpdateDataType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getCatalogName()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getEncoding()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getFile()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_File();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getPrimaryKey()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getQuotchar <em>Quotchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quotchar</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getQuotchar()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_Quotchar();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSchemaName()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSeparator()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getTableName()
	 * @see #getLoadUpdateDataType()
	 * @generated
	 */
	EAttribute getLoadUpdateDataType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType <em>Merge Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Columns Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType
	 * @generated
	 */
	EClass getMergeColumnsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getCatalogName()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn1Name <em>Column1 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1 Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn1Name()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_Column1Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn2Name <em>Column2 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column2 Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn2Name()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_Column2Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnName <em>Final Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnName()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_FinalColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnType <em>Final Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Column Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnType()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_FinalColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getJoinString <em>Join String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join String</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getJoinString()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_JoinString();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getSchemaName()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getTableName()
	 * @see #getMergeColumnsType()
	 * @generated
	 */
	EAttribute getMergeColumnsType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType <em>Modify Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Data Type Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType
	 * @generated
	 */
	EClass getModifyDataTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getCatalogName()
	 * @see #getModifyDataTypeType()
	 * @generated
	 */
	EAttribute getModifyDataTypeType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getColumnName()
	 * @see #getModifyDataTypeType()
	 * @generated
	 */
	EAttribute getModifyDataTypeType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getNewDataType <em>New Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getNewDataType()
	 * @see #getModifyDataTypeType()
	 * @generated
	 */
	EAttribute getModifyDataTypeType_NewDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getSchemaName()
	 * @see #getModifyDataTypeType()
	 * @generated
	 */
	EAttribute getModifyDataTypeType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifyDataTypeType#getTableName()
	 * @see #getModifyDataTypeType()
	 * @generated
	 */
	EAttribute getModifyDataTypeType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType <em>Modify Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Sql Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType
	 * @generated
	 */
	EClass getModifySqlType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getModifySqlChildren <em>Modify Sql Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modify Sql Children</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getModifySqlChildren()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EAttribute getModifySqlType_ModifySqlChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getReplace()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EReference getModifySqlType_Replace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getRegExpReplace <em>Reg Exp Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reg Exp Replace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getRegExpReplace()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EReference getModifySqlType_RegExpReplace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getPrepend <em>Prepend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prepend</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getPrepend()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EReference getModifySqlType_Prepend();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getAppend <em>Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Append</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getAppend()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EReference getModifySqlType_Append();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getApplyToRollback <em>Apply To Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Rollback</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getApplyToRollback()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EAttribute getModifySqlType_ApplyToRollback();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getContext()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EAttribute getModifySqlType_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ModifySqlType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ModifySqlType#getDbms()
	 * @see #getModifySqlType()
	 * @generated
	 */
	EAttribute getModifySqlType_Dbms();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.NotType <em>Not Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType
	 * @generated
	 */
	EClass getNotType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getGroup()
	 * @see #getNotType()
	 * @generated
	 */
	EAttribute getNotType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getAnd()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getOr()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getNot()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getDbms()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_Dbms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getRunningAs <em>Running As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running As</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getRunningAs()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_RunningAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getChangeSetExecuted <em>Change Set Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Set Executed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getChangeSetExecuted()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_ChangeSetExecuted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getTableExists <em>Table Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getTableExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_TableExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getColumnExists <em>Column Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getColumnExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_ColumnExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getSequenceExists <em>Sequence Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getSequenceExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_SequenceExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key Constraint Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getForeignKeyConstraintExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_ForeignKeyConstraintExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getIndexExists <em>Index Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getIndexExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_IndexExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getPrimaryKeyExists <em>Primary Key Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getPrimaryKeyExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_PrimaryKeyExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getViewExists <em>View Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getViewExists()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_ViewExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getTableIsEmpty <em>Table Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Is Empty</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getTableIsEmpty()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_TableIsEmpty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row Count</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getRowCount()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_RowCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getSqlCheck <em>Sql Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Check</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getSqlCheck()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_SqlCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Log Property Defined</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getChangeLogPropertyDefined()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_ChangeLogPropertyDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getExpectedQuotingStrategy()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_ExpectedQuotingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getCustomPrecondition <em>Custom Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Precondition</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getCustomPrecondition()
	 * @see #getNotType()
	 * @generated
	 */
	EReference getNotType_CustomPrecondition();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.NotType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.NotType#getAny()
	 * @see #getNotType()
	 * @generated
	 */
	EAttribute getNotType_Any();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.OrType <em>Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType
	 * @generated
	 */
	EClass getOrType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getGroup()
	 * @see #getOrType()
	 * @generated
	 */
	EAttribute getOrType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getAnd()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getOr()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getNot()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getDbms()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_Dbms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getRunningAs <em>Running As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running As</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getRunningAs()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_RunningAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getChangeSetExecuted <em>Change Set Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Set Executed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getChangeSetExecuted()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_ChangeSetExecuted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getTableExists <em>Table Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getTableExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_TableExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getColumnExists <em>Column Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getColumnExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_ColumnExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getSequenceExists <em>Sequence Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getSequenceExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_SequenceExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key Constraint Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getForeignKeyConstraintExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_ForeignKeyConstraintExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getIndexExists <em>Index Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getIndexExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_IndexExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getPrimaryKeyExists <em>Primary Key Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getPrimaryKeyExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_PrimaryKeyExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getViewExists <em>View Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getViewExists()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_ViewExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getTableIsEmpty <em>Table Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Is Empty</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getTableIsEmpty()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_TableIsEmpty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row Count</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getRowCount()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_RowCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getSqlCheck <em>Sql Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Check</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getSqlCheck()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_SqlCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Log Property Defined</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getChangeLogPropertyDefined()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_ChangeLogPropertyDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getExpectedQuotingStrategy()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_ExpectedQuotingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getCustomPrecondition <em>Custom Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Precondition</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getCustomPrecondition()
	 * @see #getOrType()
	 * @generated
	 */
	EReference getOrType_CustomPrecondition();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.OrType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OrType#getAny()
	 * @see #getOrType()
	 * @generated
	 */
	EAttribute getOrType_Any();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValue()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueBoolean <em>Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Boolean</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValueBoolean()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_ValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueComputed <em>Value Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Computed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValueComputed()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_ValueComputed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueDate <em>Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Date</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValueDate()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_ValueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueNumeric <em>Value Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Numeric</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValueNumeric()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_ValueNumeric();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceCurrent <em>Value Sequence Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Sequence Current</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceCurrent()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_ValueSequenceCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceNext <em>Value Sequence Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Sequence Next</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType#getValueSequenceNext()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_ValueSequenceNext();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ParamType1 <em>Param Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type1</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType1
	 * @generated
	 */
	EClass getParamType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ParamType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType1#getMixed()
	 * @see #getParamType1()
	 * @generated
	 */
	EAttribute getParamType1_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType1#getName()
	 * @see #getParamType1()
	 * @generated
	 */
	EAttribute getParamType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType1#getValue()
	 * @see #getParamType1()
	 * @generated
	 */
	EAttribute getParamType1_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ParamType2 <em>Param Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type2</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType2
	 * @generated
	 */
	EClass getParamType2();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType2#getName()
	 * @see #getParamType2()
	 * @generated
	 */
	EAttribute getParamType2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ParamType2#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ParamType2#getValue()
	 * @see #getParamType2()
	 * @generated
	 */
	EAttribute getParamType2_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType <em>Pre Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Conditions Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType
	 * @generated
	 */
	EClass getPreConditionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getGroup()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getAnd()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOr()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getNot()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getDbms()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_Dbms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getRunningAs <em>Running As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running As</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getRunningAs()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_RunningAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getChangeSetExecuted <em>Change Set Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Set Executed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getChangeSetExecuted()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_ChangeSetExecuted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getTableExists <em>Table Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getTableExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_TableExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getColumnExists <em>Column Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getColumnExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_ColumnExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getSequenceExists <em>Sequence Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getSequenceExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_SequenceExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key Constraint Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getForeignKeyConstraintExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_ForeignKeyConstraintExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getIndexExists <em>Index Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getIndexExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_IndexExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getPrimaryKeyExists <em>Primary Key Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getPrimaryKeyExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_PrimaryKeyExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getViewExists <em>View Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getViewExists()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_ViewExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getTableIsEmpty <em>Table Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Is Empty</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getTableIsEmpty()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_TableIsEmpty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row Count</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getRowCount()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_RowCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getSqlCheck <em>Sql Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Check</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getSqlCheck()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_SqlCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Log Property Defined</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getChangeLogPropertyDefined()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_ChangeLogPropertyDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getExpectedQuotingStrategy()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_ExpectedQuotingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getCustomPrecondition <em>Custom Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Precondition</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getCustomPrecondition()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EReference getPreConditionsType_CustomPrecondition();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getAny()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Error</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnError()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_OnError();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnErrorMessage <em>On Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Error Message</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnErrorMessage()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_OnErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnFail <em>On Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Fail</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnFail()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_OnFail();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnFailMessage <em>On Fail Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Fail Message</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnFailMessage()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_OnFailMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnSqlOutput <em>On Sql Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sql Output</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType#getOnSqlOutput()
	 * @see #getPreConditionsType()
	 * @generated
	 */
	EAttribute getPreConditionsType_OnSqlOutput();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1 <em>Pre Conditions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Conditions Type1</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1
	 * @generated
	 */
	EClass getPreConditionsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getGroup()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getAnd()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOr()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getNot()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getDbms()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_Dbms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getRunningAs <em>Running As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running As</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getRunningAs()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_RunningAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getChangeSetExecuted <em>Change Set Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Set Executed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getChangeSetExecuted()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_ChangeSetExecuted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getTableExists <em>Table Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getTableExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_TableExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getColumnExists <em>Column Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getColumnExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_ColumnExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getSequenceExists <em>Sequence Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getSequenceExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_SequenceExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key Constraint Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getForeignKeyConstraintExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_ForeignKeyConstraintExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getIndexExists <em>Index Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getIndexExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_IndexExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getPrimaryKeyExists <em>Primary Key Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getPrimaryKeyExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_PrimaryKeyExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getViewExists <em>View Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Exists</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getViewExists()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_ViewExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getTableIsEmpty <em>Table Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Is Empty</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getTableIsEmpty()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_TableIsEmpty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getRowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row Count</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getRowCount()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_RowCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getSqlCheck <em>Sql Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Check</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getSqlCheck()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_SqlCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Log Property Defined</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getChangeLogPropertyDefined()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_ChangeLogPropertyDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getExpectedQuotingStrategy()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_ExpectedQuotingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getCustomPrecondition <em>Custom Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Precondition</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getCustomPrecondition()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EReference getPreConditionsType1_CustomPrecondition();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getAny()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Error</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnError()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_OnError();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnErrorMessage <em>On Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Error Message</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnErrorMessage()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_OnErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFail <em>On Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Fail</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFail()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_OnFail();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFailMessage <em>On Fail Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Fail Message</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnFailMessage()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_OnFailMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnSqlOutput <em>On Sql Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sql Output</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PreConditionsType1#getOnSqlOutput()
	 * @see #getPreConditionsType1()
	 * @generated
	 */
	EAttribute getPreConditionsType1_OnSqlOutput();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.PrependType <em>Prepend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepend Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrependType
	 * @generated
	 */
	EClass getPrependType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PrependType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrependType#getValue()
	 * @see #getPrependType()
	 * @generated
	 */
	EAttribute getPrependType_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType <em>Primary Key Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType
	 * @generated
	 */
	EClass getPrimaryKeyExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getCatalogName()
	 * @see #getPrimaryKeyExistsType()
	 * @generated
	 */
	EAttribute getPrimaryKeyExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getPrimaryKeyName <em>Primary Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getPrimaryKeyName()
	 * @see #getPrimaryKeyExistsType()
	 * @generated
	 */
	EAttribute getPrimaryKeyExistsType_PrimaryKeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getSchemaName()
	 * @see #getPrimaryKeyExistsType()
	 * @generated
	 */
	EAttribute getPrimaryKeyExistsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType#getTableName()
	 * @see #getPrimaryKeyExistsType()
	 * @generated
	 */
	EAttribute getPrimaryKeyExistsType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PropertyType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType#getContext()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PropertyType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType#getDbms()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PropertyType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType#getFile()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_File();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RegExpReplaceType <em>Reg Exp Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Exp Replace Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RegExpReplaceType
	 * @generated
	 */
	EClass getRegExpReplaceType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RegExpReplaceType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RegExpReplaceType#getReplace()
	 * @see #getRegExpReplaceType()
	 * @generated
	 */
	EAttribute getRegExpReplaceType_Replace();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RegExpReplaceType#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RegExpReplaceType#getWith()
	 * @see #getRegExpReplaceType()
	 * @generated
	 */
	EAttribute getRegExpReplaceType_With();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType <em>Rename Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Column Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType
	 * @generated
	 */
	EClass getRenameColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getCatalogName()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getColumnDataType()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_ColumnDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getNewColumnName <em>New Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getNewColumnName()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_NewColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getOldColumnName <em>Old Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Column Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getOldColumnName()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_OldColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getRemarks()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getSchemaName()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameColumnType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameColumnType#getTableName()
	 * @see #getRenameColumnType()
	 * @generated
	 */
	EAttribute getRenameColumnType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RenameTableType <em>Rename Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Table Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameTableType
	 * @generated
	 */
	EClass getRenameTableType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameTableType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameTableType#getCatalogName()
	 * @see #getRenameTableType()
	 * @generated
	 */
	EAttribute getRenameTableType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameTableType#getNewTableName <em>New Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameTableType#getNewTableName()
	 * @see #getRenameTableType()
	 * @generated
	 */
	EAttribute getRenameTableType_NewTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameTableType#getOldTableName <em>Old Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameTableType#getOldTableName()
	 * @see #getRenameTableType()
	 * @generated
	 */
	EAttribute getRenameTableType_OldTableName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameTableType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameTableType#getSchemaName()
	 * @see #getRenameTableType()
	 * @generated
	 */
	EAttribute getRenameTableType_SchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType <em>Rename View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename View Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameViewType
	 * @generated
	 */
	EClass getRenameViewType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameViewType#getCatalogName()
	 * @see #getRenameViewType()
	 * @generated
	 */
	EAttribute getRenameViewType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getNewViewName <em>New View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New View Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameViewType#getNewViewName()
	 * @see #getRenameViewType()
	 * @generated
	 */
	EAttribute getRenameViewType_NewViewName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getOldViewName <em>Old View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old View Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameViewType#getOldViewName()
	 * @see #getRenameViewType()
	 * @generated
	 */
	EAttribute getRenameViewType_OldViewName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RenameViewType#getSchemaName()
	 * @see #getRenameViewType()
	 * @generated
	 */
	EAttribute getRenameViewType_SchemaName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ReplaceType <em>Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ReplaceType
	 * @generated
	 */
	EClass getReplaceType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ReplaceType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ReplaceType#getReplace()
	 * @see #getReplaceType()
	 * @generated
	 */
	EAttribute getReplaceType_Replace();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ReplaceType#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ReplaceType#getWith()
	 * @see #getReplaceType()
	 * @generated
	 */
	EAttribute getReplaceType_With();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RollbackType <em>Rollback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rollback Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType
	 * @generated
	 */
	EClass getRollbackType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getMixed()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetChildren <em>Change Set Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Change Set Children</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetChildren()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_ChangeSetChildren();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getComment()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateTable <em>Create Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateTable()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_CreateTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropTable <em>Drop Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropTable()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateView <em>Create View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateView()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_CreateView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameView <em>Rename View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameView()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_RenameView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropView <em>Drop View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop View</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropView()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getInsert()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_Insert();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddColumn()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getSql()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_Sql();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateProcedure <em>Create Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Procedure</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateProcedure()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_CreateProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropProcedure <em>Drop Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Procedure</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropProcedure()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getSqlFile <em>Sql File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getSqlFile()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_SqlFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameTable()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_RenameTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRenameColumn()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_RenameColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropColumn <em>Drop Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropColumn()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getMergeColumns <em>Merge Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merge Columns</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getMergeColumns()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_MergeColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getModifyDataType <em>Modify Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Data Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getModifyDataType()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_ModifyDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateSequence <em>Create Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateSequence()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_CreateSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAlterSequence <em>Alter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alter Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAlterSequence()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AlterSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropSequence <em>Drop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Sequence</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropSequence()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateIndex <em>Create Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCreateIndex()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_CreateIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropIndex <em>Drop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Index</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropIndex()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddNotNullConstraint <em>Add Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Not Null Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddNotNullConstraint()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddNotNullConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Not Null Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropNotNullConstraint()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropNotNullConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Foreign Key Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddForeignKeyConstraint()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddForeignKeyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Foreign Key Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropForeignKeyConstraint()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropForeignKeyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop All Foreign Key Constraints</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropAllForeignKeyConstraints()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropAllForeignKeyConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddPrimaryKey()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropPrimaryKey <em>Drop Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Primary Key</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropPrimaryKey()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddLookupTable <em>Add Lookup Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Lookup Table</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddLookupTable()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddLookupTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddAutoIncrement <em>Add Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Auto Increment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddAutoIncrement()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddAutoIncrement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddDefaultValue <em>Add Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddDefaultValue()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddDefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropDefaultValue <em>Drop Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Default Value</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropDefaultValue()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropDefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAddUniqueConstraint <em>Add Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Unique Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAddUniqueConstraint()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_AddUniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDropUniqueConstraint <em>Drop Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drop Unique Constraint</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDropUniqueConstraint()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_DropUniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getCustomChange <em>Custom Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Change</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getCustomChange()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_CustomChange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getUpdate()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_Update();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getDelete()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_Delete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadData <em>Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Data</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadData()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_LoadData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadUpdateData <em>Load Update Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Update Data</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getLoadUpdateData()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_LoadUpdateData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getExecuteCommand <em>Execute Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute Command</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getExecuteCommand()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_ExecuteCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getStop()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_Stop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getRollback <em>Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rollback</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getRollback()
	 * @see #getRollbackType()
	 * @generated
	 */
	EReference getRollbackType_Rollback();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getAny()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetAuthor <em>Change Set Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Set Author</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetAuthor()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_ChangeSetAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetId <em>Change Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Set Id</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetId()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_ChangeSetId();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetPath <em>Change Set Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Set Path</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RollbackType#getChangeSetPath()
	 * @see #getRollbackType()
	 * @generated
	 */
	EAttribute getRollbackType_ChangeSetPath();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RowCountType <em>Row Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Count Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RowCountType
	 * @generated
	 */
	EClass getRowCountType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RowCountType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RowCountType#getCatalogName()
	 * @see #getRowCountType()
	 * @generated
	 */
	EAttribute getRowCountType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RowCountType#getExpectedRows <em>Expected Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Rows</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RowCountType#getExpectedRows()
	 * @see #getRowCountType()
	 * @generated
	 */
	EAttribute getRowCountType_ExpectedRows();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RowCountType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RowCountType#getSchemaName()
	 * @see #getRowCountType()
	 * @generated
	 */
	EAttribute getRowCountType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RowCountType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RowCountType#getTableName()
	 * @see #getRowCountType()
	 * @generated
	 */
	EAttribute getRowCountType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.RunningAsType <em>Running As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Running As Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RunningAsType
	 * @generated
	 */
	EClass getRunningAsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.RunningAsType#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.RunningAsType#getUsername()
	 * @see #getRunningAsType()
	 * @generated
	 */
	EAttribute getRunningAsType_Username();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType <em>Sequence Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SequenceExistsType
	 * @generated
	 */
	EClass getSequenceExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SequenceExistsType#getCatalogName()
	 * @see #getSequenceExistsType()
	 * @generated
	 */
	EAttribute getSequenceExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SequenceExistsType#getSchemaName()
	 * @see #getSequenceExistsType()
	 * @generated
	 */
	EAttribute getSequenceExistsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SequenceExistsType#getSequenceName()
	 * @see #getSequenceExistsType()
	 * @generated
	 */
	EAttribute getSequenceExistsType_SequenceName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.SqlCheckType <em>Sql Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Check Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlCheckType
	 * @generated
	 */
	EClass getSqlCheckType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.SqlCheckType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlCheckType#getMixed()
	 * @see #getSqlCheckType()
	 * @generated
	 */
	EAttribute getSqlCheckType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlCheckType#getExpectedResult <em>Expected Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Result</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlCheckType#getExpectedResult()
	 * @see #getSqlCheckType()
	 * @generated
	 */
	EAttribute getSqlCheckType_ExpectedResult();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType <em>Sql File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql File Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType
	 * @generated
	 */
	EClass getSqlFileType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getDbms()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getEncoding()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEndDelimiter <em>End Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Delimiter</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getEndDelimiter()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_EndDelimiter();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getPath()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getRelativeToChangelogFile <em>Relative To Changelog File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative To Changelog File</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getRelativeToChangelogFile()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_RelativeToChangelogFile();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getSplitStatements <em>Split Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Statements</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getSplitStatements()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_SplitStatements();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getStripComments <em>Strip Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strip Comments</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlFileType#getStripComments()
	 * @see #getSqlFileType()
	 * @generated
	 */
	EAttribute getSqlFileType_StripComments();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.SqlType <em>Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType
	 * @generated
	 */
	EClass getSqlType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType#getMixed()
	 * @see #getSqlType()
	 * @generated
	 */
	EAttribute getSqlType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType#getComment()
	 * @see #getSqlType()
	 * @generated
	 */
	EAttribute getSqlType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType#getDbms()
	 * @see #getSqlType()
	 * @generated
	 */
	EAttribute getSqlType_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getEndDelimiter <em>End Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Delimiter</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType#getEndDelimiter()
	 * @see #getSqlType()
	 * @generated
	 */
	EAttribute getSqlType_EndDelimiter();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getSplitStatements <em>Split Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Statements</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType#getSplitStatements()
	 * @see #getSqlType()
	 * @generated
	 */
	EAttribute getSqlType_SplitStatements();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.SqlType#getStripComments <em>Strip Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strip Comments</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.SqlType#getStripComments()
	 * @see #getSqlType()
	 * @generated
	 */
	EAttribute getSqlType_StripComments();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.StopType <em>Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.StopType
	 * @generated
	 */
	EClass getStopType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.StopType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.StopType#getMixed()
	 * @see #getStopType()
	 * @generated
	 */
	EAttribute getStopType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.TableExistsType <em>Table Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableExistsType
	 * @generated
	 */
	EClass getTableExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TableExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableExistsType#getCatalogName()
	 * @see #getTableExistsType()
	 * @generated
	 */
	EAttribute getTableExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TableExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableExistsType#getSchemaName()
	 * @see #getTableExistsType()
	 * @generated
	 */
	EAttribute getTableExistsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TableExistsType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableExistsType#getTableName()
	 * @see #getTableExistsType()
	 * @generated
	 */
	EAttribute getTableExistsType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType <em>Table Is Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Is Empty Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableIsEmptyType
	 * @generated
	 */
	EClass getTableIsEmptyType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableIsEmptyType#getCatalogName()
	 * @see #getTableIsEmptyType()
	 * @generated
	 */
	EAttribute getTableIsEmptyType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableIsEmptyType#getSchemaName()
	 * @see #getTableIsEmptyType()
	 * @generated
	 */
	EAttribute getTableIsEmptyType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TableIsEmptyType#getTableName()
	 * @see #getTableIsEmptyType()
	 * @generated
	 */
	EAttribute getTableIsEmptyType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.TagDatabaseType <em>Tag Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Database Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TagDatabaseType
	 * @generated
	 */
	EClass getTagDatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.TagDatabaseType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.TagDatabaseType#getTag()
	 * @see #getTagDatabaseType()
	 * @generated
	 */
	EAttribute getTagDatabaseType_Tag();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType
	 * @generated
	 */
	EClass getUpdateType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getMixed()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getColumn()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getWhere()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Where();

	/**
	 * Returns the meta object for the containment reference '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getWhereParams <em>Where Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Params</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getWhereParams()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_WhereParams();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getCatalogName()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getSchemaName()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.UpdateType#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.UpdateType#getTableName()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_TableName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ValidCheckSumType <em>Valid Check Sum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Check Sum Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ValidCheckSumType
	 * @generated
	 */
	EClass getValidCheckSumType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.ValidCheckSumType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ValidCheckSumType#getMixed()
	 * @see #getValidCheckSumType()
	 * @generated
	 */
	EAttribute getValidCheckSumType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ValidCheckSumType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ValidCheckSumType#getComment()
	 * @see #getValidCheckSumType()
	 * @generated
	 */
	EAttribute getValidCheckSumType_Comment();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.ViewExistsType <em>View Exists Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Exists Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ViewExistsType
	 * @generated
	 */
	EClass getViewExistsType();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ViewExistsType#getCatalogName <em>Catalog Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ViewExistsType#getCatalogName()
	 * @see #getViewExistsType()
	 * @generated
	 */
	EAttribute getViewExistsType_CatalogName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ViewExistsType#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ViewExistsType#getSchemaName()
	 * @see #getViewExistsType()
	 * @generated
	 */
	EAttribute getViewExistsType_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.liquibase.xml.ns.dbchangelog.ViewExistsType#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ViewExistsType#getViewName()
	 * @see #getViewExistsType()
	 * @generated
	 */
	EAttribute getViewExistsType_ViewName();

	/**
	 * Returns the meta object for class '{@link org.liquibase.xml.ns.dbchangelog.WhereParamsType <em>Where Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Params Type</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.WhereParamsType
	 * @generated
	 */
	EClass getWhereParamsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.liquibase.xml.ns.dbchangelog.WhereParamsType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.WhereParamsType#getMixed()
	 * @see #getWhereParamsType()
	 * @generated
	 */
	EAttribute getWhereParamsType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.liquibase.xml.ns.dbchangelog.WhereParamsType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.WhereParamsType#getParam()
	 * @see #getWhereParamsType()
	 * @generated
	 */
	EReference getWhereParamsType_Param();

	/**
	 * Returns the meta object for enum '{@link org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions <em>Fk Cascade Action Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fk Cascade Action Options</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @generated
	 */
	EEnum getFkCascadeActionOptions();

	/**
	 * Returns the meta object for enum '{@link org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy <em>Object Quoting Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Quoting Strategy</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @generated
	 */
	EEnum getObjectQuotingStrategy();

	/**
	 * Returns the meta object for enum '{@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail <em>On Change Log Precondition Error Or Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Change Log Precondition Error Or Fail</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @generated
	 */
	EEnum getOnChangeLogPreconditionErrorOrFail();

	/**
	 * Returns the meta object for enum '{@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput <em>On Change Log Precondition On Sql Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Change Log Precondition On Sql Output</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput
	 * @generated
	 */
	EEnum getOnChangeLogPreconditionOnSqlOutput();

	/**
	 * Returns the meta object for enum '{@link org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail <em>On Change Set Precondition Error Or Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Change Set Precondition Error Or Fail</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail
	 * @generated
	 */
	EEnum getOnChangeSetPreconditionErrorOrFail();

	/**
	 * Returns the meta object for enum '{@link org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail <em>On Change Set Validation Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Change Set Validation Fail</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail
	 * @generated
	 */
	EEnum getOnChangeSetValidationFail();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Exp</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='booleanExp' memberTypes='booleanExp_._member_._0 booleanExp_._member_._1'"
	 * @generated
	 */
	EDataType getBooleanExp();

	/**
	 * Returns the meta object for data type '<em>Boolean Exp Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Exp Member0</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='booleanExp_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getBooleanExpMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Exp Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Exp Member0 Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='booleanExp_._member_._0:Object' baseType='booleanExp_._member_._0'"
	 * @generated
	 */
	EDataType getBooleanExpMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Boolean Exp Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Exp Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='booleanExp_._member_._1' baseType='propertyExpression'"
	 * @generated
	 */
	EDataType getBooleanExpMember1();

	/**
	 * Returns the meta object for data type '{@link org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions <em>Fk Cascade Action Options Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fk Cascade Action Options Object</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions
	 * @model instanceClass="org.liquibase.xml.ns.dbchangelog.FkCascadeActionOptions"
	 *        extendedMetaData="name='fkCascadeActionOptions:Object' baseType='fkCascadeActionOptions'"
	 * @generated
	 */
	EDataType getFkCascadeActionOptionsObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Integer Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Exp</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='integerExp' memberTypes='integerExp_._member_._0 integerExp_._member_._1'"
	 * @generated
	 */
	EDataType getIntegerExp();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Integer Exp Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Exp Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='integerExp_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getIntegerExpMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Integer Exp Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Exp Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='integerExp_._member_._1' baseType='propertyExpression'"
	 * @generated
	 */
	EDataType getIntegerExpMember1();

	/**
	 * Returns the meta object for data type '{@link org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy <em>Object Quoting Strategy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Quoting Strategy Object</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy
	 * @model instanceClass="org.liquibase.xml.ns.dbchangelog.ObjectQuotingStrategy"
	 *        extendedMetaData="name='objectQuotingStrategy:Object' baseType='objectQuotingStrategy'"
	 * @generated
	 */
	EDataType getObjectQuotingStrategyObject();

	/**
	 * Returns the meta object for data type '{@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail <em>On Change Log Precondition Error Or Fail Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>On Change Log Precondition Error Or Fail Object</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail
	 * @model instanceClass="org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail"
	 *        extendedMetaData="name='onChangeLogPreconditionErrorOrFail:Object' baseType='onChangeLogPreconditionErrorOrFail'"
	 * @generated
	 */
	EDataType getOnChangeLogPreconditionErrorOrFailObject();

	/**
	 * Returns the meta object for data type '{@link org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput <em>On Change Log Precondition On Sql Output Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>On Change Log Precondition On Sql Output Object</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput
	 * @model instanceClass="org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionOnSqlOutput"
	 *        extendedMetaData="name='onChangeLogPreconditionOnSqlOutput:Object' baseType='onChangeLogPreconditionOnSqlOutput'"
	 * @generated
	 */
	EDataType getOnChangeLogPreconditionOnSqlOutputObject();

	/**
	 * Returns the meta object for data type '{@link org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail <em>On Change Set Precondition Error Or Fail Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>On Change Set Precondition Error Or Fail Object</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail
	 * @model instanceClass="org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail"
	 *        extendedMetaData="name='onChangeSetPreconditionErrorOrFail:Object' baseType='onChangeSetPreconditionErrorOrFail'"
	 * @generated
	 */
	EDataType getOnChangeSetPreconditionErrorOrFailObject();

	/**
	 * Returns the meta object for data type '{@link org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail <em>On Change Set Validation Fail Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>On Change Set Validation Fail Object</em>'.
	 * @see org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail
	 * @model instanceClass="org.liquibase.xml.ns.dbchangelog.OnChangeSetValidationFail"
	 *        extendedMetaData="name='onChangeSetValidationFail:Object' baseType='onChangeSetValidationFail'"
	 * @generated
	 */
	EDataType getOnChangeSetValidationFailObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='propertyExpression' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='$\\{[\\w\\.]+\\}'"
	 * @generated
	 */
	EDataType getPropertyExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbchangelogFactory getDbchangelogFactory();

} //DbchangelogPackage
