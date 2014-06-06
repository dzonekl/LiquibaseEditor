/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Update Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getFile <em>File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getQuotchar <em>Quotchar</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType()
 * @model extendedMetaData="name='loadUpdateData_._type' kind='mixed'"
 * @generated
 */
public interface LoadUpdateDataType extends EObject {
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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ColumnType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_Column()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnType1> getColumn();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"UTF-8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_Encoding()
	 * @model default="UTF-8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(String)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(String)
	 * @generated
	 */
	boolean isSetEncoding();

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='file'"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_PrimaryKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='primaryKey'"
	 * @generated
	 */
	String getPrimaryKey();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(String value);

	/**
	 * Returns the value of the '<em><b>Quotchar</b></em>' attribute.
	 * The default value is <code>"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quotchar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotchar</em>' attribute.
	 * @see #isSetQuotchar()
	 * @see #unsetQuotchar()
	 * @see #setQuotchar(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_Quotchar()
	 * @model default="\"" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quotchar'"
	 * @generated
	 */
	String getQuotchar();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getQuotchar <em>Quotchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quotchar</em>' attribute.
	 * @see #isSetQuotchar()
	 * @see #unsetQuotchar()
	 * @see #getQuotchar()
	 * @generated
	 */
	void setQuotchar(String value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getQuotchar <em>Quotchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuotchar()
	 * @see #getQuotchar()
	 * @see #setQuotchar(String)
	 * @generated
	 */
	void unsetQuotchar();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getQuotchar <em>Quotchar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quotchar</em>' attribute is set.
	 * @see #unsetQuotchar()
	 * @see #getQuotchar()
	 * @see #setQuotchar(String)
	 * @generated
	 */
	boolean isSetQuotchar();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * The default value is <code>","</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #isSetSeparator()
	 * @see #unsetSeparator()
	 * @see #setSeparator(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_Separator()
	 * @model default="," unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='separator'"
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #isSetSeparator()
	 * @see #unsetSeparator()
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

	/**
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeparator()
	 * @see #getSeparator()
	 * @see #setSeparator(String)
	 * @generated
	 */
	void unsetSeparator();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getSeparator <em>Separator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Separator</em>' attribute is set.
	 * @see #unsetSeparator()
	 * @see #getSeparator()
	 * @see #setSeparator(String)
	 * @generated
	 */
	boolean isSetSeparator();

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getLoadUpdateDataType_TableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tableName'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.LoadUpdateDataType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // LoadUpdateDataType
