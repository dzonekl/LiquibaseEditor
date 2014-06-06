/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Columns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn1Name <em>Column1 Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn2Name <em>Column2 Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnName <em>Final Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnType <em>Final Column Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getJoinString <em>Join String</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType()
 * @model extendedMetaData="name='mergeColumns_._type' kind='empty'"
 * @generated
 */
public interface MergeColumnsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Name</em>' attribute.
	 * @see #setCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Column1 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column1 Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column1 Name</em>' attribute.
	 * @see #setColumn1Name(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_Column1Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='column1Name'"
	 * @generated
	 */
	String getColumn1Name();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn1Name <em>Column1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column1 Name</em>' attribute.
	 * @see #getColumn1Name()
	 * @generated
	 */
	void setColumn1Name(String value);

	/**
	 * Returns the value of the '<em><b>Column2 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column2 Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column2 Name</em>' attribute.
	 * @see #setColumn2Name(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_Column2Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='column2Name'"
	 * @generated
	 */
	String getColumn2Name();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getColumn2Name <em>Column2 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column2 Name</em>' attribute.
	 * @see #getColumn2Name()
	 * @generated
	 */
	void setColumn2Name(String value);

	/**
	 * Returns the value of the '<em><b>Final Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Column Name</em>' attribute.
	 * @see #setFinalColumnName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_FinalColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='finalColumnName'"
	 * @generated
	 */
	String getFinalColumnName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnName <em>Final Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Column Name</em>' attribute.
	 * @see #getFinalColumnName()
	 * @generated
	 */
	void setFinalColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Final Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Column Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Column Type</em>' attribute.
	 * @see #setFinalColumnType(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_FinalColumnType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='finalColumnType'"
	 * @generated
	 */
	String getFinalColumnType();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getFinalColumnType <em>Final Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Column Type</em>' attribute.
	 * @see #getFinalColumnType()
	 * @generated
	 */
	void setFinalColumnType(String value);

	/**
	 * Returns the value of the '<em><b>Join String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join String</em>' attribute.
	 * @see #setJoinString(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_JoinString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='joinString'"
	 * @generated
	 */
	String getJoinString();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getJoinString <em>Join String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join String</em>' attribute.
	 * @see #getJoinString()
	 * @generated
	 */
	void setJoinString(String value);

	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getMergeColumnsType_TableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tableName'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.MergeColumnsType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // MergeColumnsType
