/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement <em>Add Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn <em>Add Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue <em>Add Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable <em>Add Lookup Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint <em>Add Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey <em>Add Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint <em>Add Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence <em>Alter Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn <em>Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment <em>Comment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex <em>Create Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure <em>Create Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence <em>Create Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable <em>Create Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView <em>Create View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange <em>Custom Change</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog <em>Database Change Log</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn <em>Drop Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue <em>Drop Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex <em>Drop Index</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey <em>Drop Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure <em>Drop Procedure</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence <em>Drop Sequence</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable <em>Drop Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint <em>Drop Unique Constraint</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView <em>Drop View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand <em>Execute Command</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData <em>Load Update Data</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns <em>Merge Columns</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType <em>Modify Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn <em>Rename Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable <em>Rename Table</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView <em>Rename View</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql <em>Sql</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile <em>Sql File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop <em>Stop</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase <em>Tag Database</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams <em>Where Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Add Auto Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Auto Increment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Auto Increment</em>' containment reference.
	 * @see #setAddAutoIncrement(AddAutoIncrementType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddAutoIncrement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addAutoIncrement' namespace='##targetNamespace'"
	 * @generated
	 */
	AddAutoIncrementType getAddAutoIncrement();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddAutoIncrement <em>Add Auto Increment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Auto Increment</em>' containment reference.
	 * @see #getAddAutoIncrement()
	 * @generated
	 */
	void setAddAutoIncrement(AddAutoIncrementType value);

	/**
	 * Returns the value of the '<em><b>Add Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Column</em>' containment reference.
	 * @see #setAddColumn(AddColumnType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	AddColumnType getAddColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddColumn <em>Add Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Column</em>' containment reference.
	 * @see #getAddColumn()
	 * @generated
	 */
	void setAddColumn(AddColumnType value);

	/**
	 * Returns the value of the '<em><b>Add Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Default Value</em>' containment reference.
	 * @see #setAddDefaultValue(AddDefaultValueType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddDefaultValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addDefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDefaultValueType getAddDefaultValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddDefaultValue <em>Add Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Default Value</em>' containment reference.
	 * @see #getAddDefaultValue()
	 * @generated
	 */
	void setAddDefaultValue(AddDefaultValueType value);

	/**
	 * Returns the value of the '<em><b>Add Foreign Key Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Foreign Key Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Foreign Key Constraint</em>' containment reference.
	 * @see #setAddForeignKeyConstraint(AddForeignKeyConstraintType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddForeignKeyConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addForeignKeyConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	AddForeignKeyConstraintType getAddForeignKeyConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddForeignKeyConstraint <em>Add Foreign Key Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Foreign Key Constraint</em>' containment reference.
	 * @see #getAddForeignKeyConstraint()
	 * @generated
	 */
	void setAddForeignKeyConstraint(AddForeignKeyConstraintType value);

	/**
	 * Returns the value of the '<em><b>Add Lookup Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Lookup Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Lookup Table</em>' containment reference.
	 * @see #setAddLookupTable(AddLookupTableType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddLookupTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addLookupTable' namespace='##targetNamespace'"
	 * @generated
	 */
	AddLookupTableType getAddLookupTable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddLookupTable <em>Add Lookup Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Lookup Table</em>' containment reference.
	 * @see #getAddLookupTable()
	 * @generated
	 */
	void setAddLookupTable(AddLookupTableType value);

	/**
	 * Returns the value of the '<em><b>Add Not Null Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Not Null Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Not Null Constraint</em>' containment reference.
	 * @see #setAddNotNullConstraint(AddNotNullConstraintType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddNotNullConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addNotNullConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	AddNotNullConstraintType getAddNotNullConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddNotNullConstraint <em>Add Not Null Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Not Null Constraint</em>' containment reference.
	 * @see #getAddNotNullConstraint()
	 * @generated
	 */
	void setAddNotNullConstraint(AddNotNullConstraintType value);

	/**
	 * Returns the value of the '<em><b>Add Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Primary Key</em>' containment reference.
	 * @see #setAddPrimaryKey(AddPrimaryKeyType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddPrimaryKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addPrimaryKey' namespace='##targetNamespace'"
	 * @generated
	 */
	AddPrimaryKeyType getAddPrimaryKey();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddPrimaryKey <em>Add Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Primary Key</em>' containment reference.
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	void setAddPrimaryKey(AddPrimaryKeyType value);

	/**
	 * Returns the value of the '<em><b>Add Unique Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Unique Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Unique Constraint</em>' containment reference.
	 * @see #setAddUniqueConstraint(AddUniqueConstraintType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AddUniqueConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addUniqueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	AddUniqueConstraintType getAddUniqueConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAddUniqueConstraint <em>Add Unique Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Unique Constraint</em>' containment reference.
	 * @see #getAddUniqueConstraint()
	 * @generated
	 */
	void setAddUniqueConstraint(AddUniqueConstraintType value);

	/**
	 * Returns the value of the '<em><b>Alter Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alter Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter Sequence</em>' containment reference.
	 * @see #setAlterSequence(AlterSequenceType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_AlterSequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alterSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	AlterSequenceType getAlterSequence();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAlterSequence <em>Alter Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alter Sequence</em>' containment reference.
	 * @see #getAlterSequence()
	 * @generated
	 */
	void setAlterSequence(AlterSequenceType value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(AndType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_And()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace'"
	 * @generated
	 */
	AndType getAnd();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(AndType value);

	/**
	 * Returns the value of the '<em><b>Change Log Property Defined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Property Defined</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Property Defined</em>' containment reference.
	 * @see #setChangeLogPropertyDefined(ChangeLogPropertyDefinedType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ChangeLogPropertyDefined()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeLogPropertyDefined' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeLogPropertyDefinedType getChangeLogPropertyDefined();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Property Defined</em>' containment reference.
	 * @see #getChangeLogPropertyDefined()
	 * @generated
	 */
	void setChangeLogPropertyDefined(ChangeLogPropertyDefinedType value);

	/**
	 * Returns the value of the '<em><b>Change Set Executed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set Executed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Executed</em>' containment reference.
	 * @see #setChangeSetExecuted(ChangeSetExecutedType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ChangeSetExecuted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeSetExecuted' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeSetExecutedType getChangeSetExecuted();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getChangeSetExecuted <em>Change Set Executed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set Executed</em>' containment reference.
	 * @see #getChangeSetExecuted()
	 * @generated
	 */
	void setChangeSetExecuted(ChangeSetExecutedType value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(ColumnType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Column()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnType getColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Column Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Exists</em>' containment reference.
	 * @see #setColumnExists(ColumnExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ColumnExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='columnExists' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnExistsType getColumnExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getColumnExists <em>Column Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Exists</em>' containment reference.
	 * @see #getColumnExists()
	 * @generated
	 */
	void setColumnExists(ColumnExistsType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Constraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Create Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Index</em>' containment reference.
	 * @see #setCreateIndex(CreateIndexType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CreateIndex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateIndexType getCreateIndex();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateIndex <em>Create Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Index</em>' containment reference.
	 * @see #getCreateIndex()
	 * @generated
	 */
	void setCreateIndex(CreateIndexType value);

	/**
	 * Returns the value of the '<em><b>Create Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Procedure</em>' containment reference.
	 * @see #setCreateProcedure(CreateProcedureType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CreateProcedure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateProcedureType getCreateProcedure();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateProcedure <em>Create Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Procedure</em>' containment reference.
	 * @see #getCreateProcedure()
	 * @generated
	 */
	void setCreateProcedure(CreateProcedureType value);

	/**
	 * Returns the value of the '<em><b>Create Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Sequence</em>' containment reference.
	 * @see #setCreateSequence(CreateSequenceType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CreateSequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateSequenceType getCreateSequence();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateSequence <em>Create Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Sequence</em>' containment reference.
	 * @see #getCreateSequence()
	 * @generated
	 */
	void setCreateSequence(CreateSequenceType value);

	/**
	 * Returns the value of the '<em><b>Create Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Table</em>' containment reference.
	 * @see #setCreateTable(CreateTableType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CreateTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createTable' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateTableType getCreateTable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateTable <em>Create Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Table</em>' containment reference.
	 * @see #getCreateTable()
	 * @generated
	 */
	void setCreateTable(CreateTableType value);

	/**
	 * Returns the value of the '<em><b>Create View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create View</em>' containment reference.
	 * @see #setCreateView(CreateViewType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CreateView()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='createView' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateViewType getCreateView();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCreateView <em>Create View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create View</em>' containment reference.
	 * @see #getCreateView()
	 * @generated
	 */
	void setCreateView(CreateViewType value);

	/**
	 * Returns the value of the '<em><b>Custom Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Change</em>' containment reference.
	 * @see #setCustomChange(CustomChangeType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CustomChange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customChange' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomChangeType getCustomChange();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomChange <em>Custom Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Change</em>' containment reference.
	 * @see #getCustomChange()
	 * @generated
	 */
	void setCustomChange(CustomChangeType value);

	/**
	 * Returns the value of the '<em><b>Custom Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Precondition</em>' containment reference.
	 * @see #setCustomPrecondition(CustomPreconditionType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_CustomPrecondition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customPrecondition' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomPreconditionType getCustomPrecondition();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getCustomPrecondition <em>Custom Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Precondition</em>' containment reference.
	 * @see #getCustomPrecondition()
	 * @generated
	 */
	void setCustomPrecondition(CustomPreconditionType value);

	/**
	 * Returns the value of the '<em><b>Database Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Change Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Change Log</em>' containment reference.
	 * @see #setDatabaseChangeLog(DatabaseChangeLogType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DatabaseChangeLog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='databaseChangeLog' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseChangeLogType getDatabaseChangeLog();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDatabaseChangeLog <em>Database Change Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Change Log</em>' containment reference.
	 * @see #getDatabaseChangeLog()
	 * @generated
	 */
	void setDatabaseChangeLog(DatabaseChangeLogType value);

	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' containment reference.
	 * @see #setDbms(DbmsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Dbms()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dbms' namespace='##targetNamespace'"
	 * @generated
	 */
	DbmsType getDbms();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDbms <em>Dbms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbms</em>' containment reference.
	 * @see #getDbms()
	 * @generated
	 */
	void setDbms(DbmsType value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(DeleteType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Delete()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteType getDelete();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(DeleteType value);

	/**
	 * Returns the value of the '<em><b>Drop All Foreign Key Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop All Foreign Key Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop All Foreign Key Constraints</em>' containment reference.
	 * @see #setDropAllForeignKeyConstraints(DropAllForeignKeyConstraintsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropAllForeignKeyConstraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropAllForeignKeyConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	DropAllForeignKeyConstraintsType getDropAllForeignKeyConstraints();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropAllForeignKeyConstraints <em>Drop All Foreign Key Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop All Foreign Key Constraints</em>' containment reference.
	 * @see #getDropAllForeignKeyConstraints()
	 * @generated
	 */
	void setDropAllForeignKeyConstraints(DropAllForeignKeyConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Drop Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Column</em>' containment reference.
	 * @see #setDropColumn(DropColumnType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	DropColumnType getDropColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropColumn <em>Drop Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Column</em>' containment reference.
	 * @see #getDropColumn()
	 * @generated
	 */
	void setDropColumn(DropColumnType value);

	/**
	 * Returns the value of the '<em><b>Drop Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Default Value</em>' containment reference.
	 * @see #setDropDefaultValue(DropDefaultValueType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropDefaultValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropDefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DropDefaultValueType getDropDefaultValue();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropDefaultValue <em>Drop Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Default Value</em>' containment reference.
	 * @see #getDropDefaultValue()
	 * @generated
	 */
	void setDropDefaultValue(DropDefaultValueType value);

	/**
	 * Returns the value of the '<em><b>Drop Foreign Key Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Foreign Key Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Foreign Key Constraint</em>' containment reference.
	 * @see #setDropForeignKeyConstraint(DropForeignKeyConstraintType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropForeignKeyConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropForeignKeyConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	DropForeignKeyConstraintType getDropForeignKeyConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropForeignKeyConstraint <em>Drop Foreign Key Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Foreign Key Constraint</em>' containment reference.
	 * @see #getDropForeignKeyConstraint()
	 * @generated
	 */
	void setDropForeignKeyConstraint(DropForeignKeyConstraintType value);

	/**
	 * Returns the value of the '<em><b>Drop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Index</em>' containment reference.
	 * @see #setDropIndex(DropIndexType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropIndex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	DropIndexType getDropIndex();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropIndex <em>Drop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Index</em>' containment reference.
	 * @see #getDropIndex()
	 * @generated
	 */
	void setDropIndex(DropIndexType value);

	/**
	 * Returns the value of the '<em><b>Drop Not Null Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Not Null Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Not Null Constraint</em>' containment reference.
	 * @see #setDropNotNullConstraint(DropNotNullConstraintType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropNotNullConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropNotNullConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	DropNotNullConstraintType getDropNotNullConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropNotNullConstraint <em>Drop Not Null Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Not Null Constraint</em>' containment reference.
	 * @see #getDropNotNullConstraint()
	 * @generated
	 */
	void setDropNotNullConstraint(DropNotNullConstraintType value);

	/**
	 * Returns the value of the '<em><b>Drop Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Primary Key</em>' containment reference.
	 * @see #setDropPrimaryKey(DropPrimaryKeyType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropPrimaryKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropPrimaryKey' namespace='##targetNamespace'"
	 * @generated
	 */
	DropPrimaryKeyType getDropPrimaryKey();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropPrimaryKey <em>Drop Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Primary Key</em>' containment reference.
	 * @see #getDropPrimaryKey()
	 * @generated
	 */
	void setDropPrimaryKey(DropPrimaryKeyType value);

	/**
	 * Returns the value of the '<em><b>Drop Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Procedure</em>' containment reference.
	 * @see #setDropProcedure(DropProcedureType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropProcedure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	DropProcedureType getDropProcedure();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropProcedure <em>Drop Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Procedure</em>' containment reference.
	 * @see #getDropProcedure()
	 * @generated
	 */
	void setDropProcedure(DropProcedureType value);

	/**
	 * Returns the value of the '<em><b>Drop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Sequence</em>' containment reference.
	 * @see #setDropSequence(DropSequenceType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropSequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	DropSequenceType getDropSequence();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropSequence <em>Drop Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Sequence</em>' containment reference.
	 * @see #getDropSequence()
	 * @generated
	 */
	void setDropSequence(DropSequenceType value);

	/**
	 * Returns the value of the '<em><b>Drop Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Table</em>' containment reference.
	 * @see #setDropTable(DropTableType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropTable' namespace='##targetNamespace'"
	 * @generated
	 */
	DropTableType getDropTable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropTable <em>Drop Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Table</em>' containment reference.
	 * @see #getDropTable()
	 * @generated
	 */
	void setDropTable(DropTableType value);

	/**
	 * Returns the value of the '<em><b>Drop Unique Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Unique Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Unique Constraint</em>' containment reference.
	 * @see #setDropUniqueConstraint(DropUniqueConstraintType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropUniqueConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropUniqueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	DropUniqueConstraintType getDropUniqueConstraint();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropUniqueConstraint <em>Drop Unique Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Unique Constraint</em>' containment reference.
	 * @see #getDropUniqueConstraint()
	 * @generated
	 */
	void setDropUniqueConstraint(DropUniqueConstraintType value);

	/**
	 * Returns the value of the '<em><b>Drop View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop View</em>' containment reference.
	 * @see #setDropView(DropViewType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_DropView()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dropView' namespace='##targetNamespace'"
	 * @generated
	 */
	DropViewType getDropView();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getDropView <em>Drop View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop View</em>' containment reference.
	 * @see #getDropView()
	 * @generated
	 */
	void setDropView(DropViewType value);

	/**
	 * Returns the value of the '<em><b>Execute Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Command</em>' containment reference.
	 * @see #setExecuteCommand(ExecuteCommandType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ExecuteCommand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='executeCommand' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecuteCommandType getExecuteCommand();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExecuteCommand <em>Execute Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Command</em>' containment reference.
	 * @see #getExecuteCommand()
	 * @generated
	 */
	void setExecuteCommand(ExecuteCommandType value);

	/**
	 * Returns the value of the '<em><b>Expected Quoting Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Quoting Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Quoting Strategy</em>' containment reference.
	 * @see #setExpectedQuotingStrategy(ExpectedQuotingStrategyType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ExpectedQuotingStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expectedQuotingStrategy' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpectedQuotingStrategyType getExpectedQuotingStrategy();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Quoting Strategy</em>' containment reference.
	 * @see #getExpectedQuotingStrategy()
	 * @generated
	 */
	void setExpectedQuotingStrategy(ExpectedQuotingStrategyType value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Constraint Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Constraint Exists</em>' containment reference.
	 * @see #setForeignKeyConstraintExists(ForeignKeyConstraintExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ForeignKeyConstraintExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignKeyConstraintExists' namespace='##targetNamespace'"
	 * @generated
	 */
	ForeignKeyConstraintExistsType getForeignKeyConstraintExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Constraint Exists</em>' containment reference.
	 * @see #getForeignKeyConstraintExists()
	 * @generated
	 */
	void setForeignKeyConstraintExists(ForeignKeyConstraintExistsType value);

	/**
	 * Returns the value of the '<em><b>Index Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Exists</em>' containment reference.
	 * @see #setIndexExists(IndexExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_IndexExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexExists' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexExistsType getIndexExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getIndexExists <em>Index Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Exists</em>' containment reference.
	 * @see #getIndexExists()
	 * @generated
	 */
	void setIndexExists(IndexExistsType value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference.
	 * @see #setInsert(InsertType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Insert()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insert' namespace='##targetNamespace'"
	 * @generated
	 */
	InsertType getInsert();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getInsert <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' containment reference.
	 * @see #getInsert()
	 * @generated
	 */
	void setInsert(InsertType value);

	/**
	 * Returns the value of the '<em><b>Load Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Data</em>' containment reference.
	 * @see #setLoadData(LoadDataType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_LoadData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadData' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadDataType getLoadData();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadData <em>Load Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Data</em>' containment reference.
	 * @see #getLoadData()
	 * @generated
	 */
	void setLoadData(LoadDataType value);

	/**
	 * Returns the value of the '<em><b>Load Update Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Update Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Update Data</em>' containment reference.
	 * @see #setLoadUpdateData(LoadUpdateDataType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_LoadUpdateData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadUpdateData' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadUpdateDataType getLoadUpdateData();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getLoadUpdateData <em>Load Update Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Update Data</em>' containment reference.
	 * @see #getLoadUpdateData()
	 * @generated
	 */
	void setLoadUpdateData(LoadUpdateDataType value);

	/**
	 * Returns the value of the '<em><b>Merge Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Columns</em>' containment reference.
	 * @see #setMergeColumns(MergeColumnsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_MergeColumns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mergeColumns' namespace='##targetNamespace'"
	 * @generated
	 */
	MergeColumnsType getMergeColumns();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getMergeColumns <em>Merge Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Columns</em>' containment reference.
	 * @see #getMergeColumns()
	 * @generated
	 */
	void setMergeColumns(MergeColumnsType value);

	/**
	 * Returns the value of the '<em><b>Modify Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Data Type</em>' containment reference.
	 * @see #setModifyDataType(ModifyDataTypeType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ModifyDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modifyDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifyDataTypeType getModifyDataType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getModifyDataType <em>Modify Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Data Type</em>' containment reference.
	 * @see #getModifyDataType()
	 * @generated
	 */
	void setModifyDataType(ModifyDataTypeType value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(NotType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Not()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='not' namespace='##targetNamespace'"
	 * @generated
	 */
	NotType getNot();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(NotType value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(OrType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Or()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace'"
	 * @generated
	 */
	OrType getOr();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(OrType value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(ParamType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Param()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamType getParam();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ParamType value);

	/**
	 * Returns the value of the '<em><b>Primary Key Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Exists</em>' containment reference.
	 * @see #setPrimaryKeyExists(PrimaryKeyExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_PrimaryKeyExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primaryKeyExists' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaryKeyExistsType getPrimaryKeyExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getPrimaryKeyExists <em>Primary Key Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Exists</em>' containment reference.
	 * @see #getPrimaryKeyExists()
	 * @generated
	 */
	void setPrimaryKeyExists(PrimaryKeyExistsType value);

	/**
	 * Returns the value of the '<em><b>Rename Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename Column</em>' containment reference.
	 * @see #setRenameColumn(RenameColumnType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_RenameColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	RenameColumnType getRenameColumn();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameColumn <em>Rename Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename Column</em>' containment reference.
	 * @see #getRenameColumn()
	 * @generated
	 */
	void setRenameColumn(RenameColumnType value);

	/**
	 * Returns the value of the '<em><b>Rename Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename Table</em>' containment reference.
	 * @see #setRenameTable(RenameTableType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_RenameTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameTable' namespace='##targetNamespace'"
	 * @generated
	 */
	RenameTableType getRenameTable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameTable <em>Rename Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename Table</em>' containment reference.
	 * @see #getRenameTable()
	 * @generated
	 */
	void setRenameTable(RenameTableType value);

	/**
	 * Returns the value of the '<em><b>Rename View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename View</em>' containment reference.
	 * @see #setRenameView(RenameViewType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_RenameView()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='renameView' namespace='##targetNamespace'"
	 * @generated
	 */
	RenameViewType getRenameView();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRenameView <em>Rename View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename View</em>' containment reference.
	 * @see #getRenameView()
	 * @generated
	 */
	void setRenameView(RenameViewType value);

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference.
	 * @see #setRollback(RollbackType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Rollback()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace'"
	 * @generated
	 */
	RollbackType getRollback();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRollback <em>Rollback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback</em>' containment reference.
	 * @see #getRollback()
	 * @generated
	 */
	void setRollback(RollbackType value);

	/**
	 * Returns the value of the '<em><b>Row Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Count</em>' containment reference.
	 * @see #setRowCount(RowCountType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_RowCount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rowCount' namespace='##targetNamespace'"
	 * @generated
	 */
	RowCountType getRowCount();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRowCount <em>Row Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Count</em>' containment reference.
	 * @see #getRowCount()
	 * @generated
	 */
	void setRowCount(RowCountType value);

	/**
	 * Returns the value of the '<em><b>Running As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running As</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running As</em>' containment reference.
	 * @see #setRunningAs(RunningAsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_RunningAs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='runningAs' namespace='##targetNamespace'"
	 * @generated
	 */
	RunningAsType getRunningAs();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getRunningAs <em>Running As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running As</em>' containment reference.
	 * @see #getRunningAs()
	 * @generated
	 */
	void setRunningAs(RunningAsType value);

	/**
	 * Returns the value of the '<em><b>Sequence Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Exists</em>' containment reference.
	 * @see #setSequenceExists(SequenceExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_SequenceExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequenceExists' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceExistsType getSequenceExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSequenceExists <em>Sequence Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Exists</em>' containment reference.
	 * @see #getSequenceExists()
	 * @generated
	 */
	void setSequenceExists(SequenceExistsType value);

	/**
	 * Returns the value of the '<em><b>Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' containment reference.
	 * @see #setSql(SqlType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Sql()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace'"
	 * @generated
	 */
	SqlType getSql();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSql <em>Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql</em>' containment reference.
	 * @see #getSql()
	 * @generated
	 */
	void setSql(SqlType value);

	/**
	 * Returns the value of the '<em><b>Sql Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Check</em>' containment reference.
	 * @see #setSqlCheck(SqlCheckType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_SqlCheck()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlCheck' namespace='##targetNamespace'"
	 * @generated
	 */
	SqlCheckType getSqlCheck();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlCheck <em>Sql Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Check</em>' containment reference.
	 * @see #getSqlCheck()
	 * @generated
	 */
	void setSqlCheck(SqlCheckType value);

	/**
	 * Returns the value of the '<em><b>Sql File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql File</em>' containment reference.
	 * @see #setSqlFile(SqlFileType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_SqlFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlFile' namespace='##targetNamespace'"
	 * @generated
	 */
	SqlFileType getSqlFile();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getSqlFile <em>Sql File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql File</em>' containment reference.
	 * @see #getSqlFile()
	 * @generated
	 */
	void setSqlFile(SqlFileType value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference.
	 * @see #setStop(StopType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Stop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	StopType getStop();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getStop <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' containment reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(StopType value);

	/**
	 * Returns the value of the '<em><b>Table Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Exists</em>' containment reference.
	 * @see #setTableExists(TableExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_TableExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableExists' namespace='##targetNamespace'"
	 * @generated
	 */
	TableExistsType getTableExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableExists <em>Table Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Exists</em>' containment reference.
	 * @see #getTableExists()
	 * @generated
	 */
	void setTableExists(TableExistsType value);

	/**
	 * Returns the value of the '<em><b>Table Is Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Is Empty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Is Empty</em>' containment reference.
	 * @see #setTableIsEmpty(TableIsEmptyType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_TableIsEmpty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableIsEmpty' namespace='##targetNamespace'"
	 * @generated
	 */
	TableIsEmptyType getTableIsEmpty();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTableIsEmpty <em>Table Is Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Is Empty</em>' containment reference.
	 * @see #getTableIsEmpty()
	 * @generated
	 */
	void setTableIsEmpty(TableIsEmptyType value);

	/**
	 * Returns the value of the '<em><b>Tag Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Database</em>' containment reference.
	 * @see #setTagDatabase(TagDatabaseType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_TagDatabase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tagDatabase' namespace='##targetNamespace'"
	 * @generated
	 */
	TagDatabaseType getTagDatabase();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getTagDatabase <em>Tag Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Database</em>' containment reference.
	 * @see #getTagDatabase()
	 * @generated
	 */
	void setTagDatabase(TagDatabaseType value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(UpdateType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_Update()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='update' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdate();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(UpdateType value);

	/**
	 * Returns the value of the '<em><b>View Exists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Exists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Exists</em>' containment reference.
	 * @see #setViewExists(ViewExistsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_ViewExists()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewExists' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewExistsType getViewExists();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getViewExists <em>View Exists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Exists</em>' containment reference.
	 * @see #getViewExists()
	 * @generated
	 */
	void setViewExists(ViewExistsType value);

	/**
	 * Returns the value of the '<em><b>Where Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Params</em>' containment reference.
	 * @see #setWhereParams(WhereParamsType)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getDocumentRoot_WhereParams()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='whereParams' namespace='##targetNamespace'"
	 * @generated
	 */
	WhereParamsType getWhereParams();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.DocumentRoot#getWhereParams <em>Where Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Params</em>' containment reference.
	 * @see #getWhereParams()
	 * @generated
	 */
	void setWhereParams(WhereParamsType value);

} // DocumentRoot
