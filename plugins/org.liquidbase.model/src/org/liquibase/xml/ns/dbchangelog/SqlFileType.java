/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEndDelimiter <em>End Delimiter</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getPath <em>Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getRelativeToChangelogFile <em>Relative To Changelog File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getSplitStatements <em>Split Statements</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getStripComments <em>Strip Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType()
 * @model extendedMetaData="name='sqlFile_._type' kind='empty'"
 * @generated
 */
public interface SqlFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' attribute.
	 * @see #setDbms(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_Dbms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dbms'"
	 * @generated
	 */
	String getDbms();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getDbms <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbms</em>' attribute.
	 * @see #getDbms()
	 * @generated
	 */
	void setDbms(String value);

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
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_Encoding()
	 * @model default="UTF-8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEncoding <em>Encoding</em>}' attribute.
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
	 * Unsets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(String)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEncoding <em>Encoding</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>End Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Delimiter</em>' attribute.
	 * @see #setEndDelimiter(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_EndDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endDelimiter'"
	 * @generated
	 */
	String getEndDelimiter();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getEndDelimiter <em>End Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Delimiter</em>' attribute.
	 * @see #getEndDelimiter()
	 * @generated
	 */
	void setEndDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Relative To Changelog File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative To Changelog File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative To Changelog File</em>' attribute.
	 * @see #setRelativeToChangelogFile(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_RelativeToChangelogFile()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='relativeToChangelogFile'"
	 * @generated
	 */
	Object getRelativeToChangelogFile();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getRelativeToChangelogFile <em>Relative To Changelog File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative To Changelog File</em>' attribute.
	 * @see #getRelativeToChangelogFile()
	 * @generated
	 */
	void setRelativeToChangelogFile(Object value);

	/**
	 * Returns the value of the '<em><b>Split Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Statements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Statements</em>' attribute.
	 * @see #setSplitStatements(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_SplitStatements()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='splitStatements'"
	 * @generated
	 */
	Object getSplitStatements();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getSplitStatements <em>Split Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Statements</em>' attribute.
	 * @see #getSplitStatements()
	 * @generated
	 */
	void setSplitStatements(Object value);

	/**
	 * Returns the value of the '<em><b>Strip Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strip Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip Comments</em>' attribute.
	 * @see #setStripComments(Object)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getSqlFileType_StripComments()
	 * @model dataType="org.liquibase.xml.ns.dbchangelog.BooleanExp"
	 *        extendedMetaData="kind='attribute' name='stripComments'"
	 * @generated
	 */
	Object getStripComments();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.SqlFileType#getStripComments <em>Strip Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strip Comments</em>' attribute.
	 * @see #getStripComments()
	 * @generated
	 */
	void setStripComments(Object value);

} // SqlFileType
