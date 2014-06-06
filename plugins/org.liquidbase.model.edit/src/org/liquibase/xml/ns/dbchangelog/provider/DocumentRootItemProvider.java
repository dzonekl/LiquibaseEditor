/**
 */
package org.liquibase.xml.ns.dbchangelog.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.DocumentRoot;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_comment_feature", "_UI_DocumentRoot_type"),
				 DbchangelogPackage.eINSTANCE.getDocumentRoot_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddAutoIncrement());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddColumn());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddDefaultValue());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddForeignKeyConstraint());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddLookupTable());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddNotNullConstraint());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddPrimaryKey());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddUniqueConstraint());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_AlterSequence());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_And());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeLogPropertyDefined());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeSetExecuted());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Column());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ColumnExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Constraints());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateIndex());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateProcedure());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateSequence());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateTable());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateView());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomChange());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomPrecondition());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DatabaseChangeLog());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Dbms());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Delete());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropAllForeignKeyConstraints());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropColumn());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropDefaultValue());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropForeignKeyConstraint());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropIndex());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropNotNullConstraint());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropPrimaryKey());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropProcedure());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropSequence());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropTable());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropUniqueConstraint());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropView());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExecuteCommand());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExpectedQuotingStrategy());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ForeignKeyConstraintExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_IndexExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Insert());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadData());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadUpdateData());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_MergeColumns());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ModifyDataType());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Not());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Or());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Param());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_PrimaryKeyExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameColumn());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameTable());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameView());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Rollback());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_RowCount());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_RunningAs());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_SequenceExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Sql());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlCheck());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlFile());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Stop());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableIsEmpty());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_TagDatabase());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_Update());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_ViewExists());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDocumentRoot_WhereParams());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case DbchangelogPackage.DOCUMENT_ROOT__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_AUTO_INCREMENT:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_COLUMN:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_DEFAULT_VALUE:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_FOREIGN_KEY_CONSTRAINT:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_LOOKUP_TABLE:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_NOT_NULL_CONSTRAINT:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_PRIMARY_KEY:
			case DbchangelogPackage.DOCUMENT_ROOT__ADD_UNIQUE_CONSTRAINT:
			case DbchangelogPackage.DOCUMENT_ROOT__ALTER_SEQUENCE:
			case DbchangelogPackage.DOCUMENT_ROOT__AND:
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_LOG_PROPERTY_DEFINED:
			case DbchangelogPackage.DOCUMENT_ROOT__CHANGE_SET_EXECUTED:
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN:
			case DbchangelogPackage.DOCUMENT_ROOT__COLUMN_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__CONSTRAINTS:
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_INDEX:
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_PROCEDURE:
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_SEQUENCE:
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_TABLE:
			case DbchangelogPackage.DOCUMENT_ROOT__CREATE_VIEW:
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_CHANGE:
			case DbchangelogPackage.DOCUMENT_ROOT__CUSTOM_PRECONDITION:
			case DbchangelogPackage.DOCUMENT_ROOT__DATABASE_CHANGE_LOG:
			case DbchangelogPackage.DOCUMENT_ROOT__DBMS:
			case DbchangelogPackage.DOCUMENT_ROOT__DELETE:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_ALL_FOREIGN_KEY_CONSTRAINTS:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_COLUMN:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_DEFAULT_VALUE:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_FOREIGN_KEY_CONSTRAINT:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_INDEX:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_NOT_NULL_CONSTRAINT:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PRIMARY_KEY:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_PROCEDURE:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_SEQUENCE:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_TABLE:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_UNIQUE_CONSTRAINT:
			case DbchangelogPackage.DOCUMENT_ROOT__DROP_VIEW:
			case DbchangelogPackage.DOCUMENT_ROOT__EXECUTE_COMMAND:
			case DbchangelogPackage.DOCUMENT_ROOT__EXPECTED_QUOTING_STRATEGY:
			case DbchangelogPackage.DOCUMENT_ROOT__FOREIGN_KEY_CONSTRAINT_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__INDEX_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__INSERT:
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_DATA:
			case DbchangelogPackage.DOCUMENT_ROOT__LOAD_UPDATE_DATA:
			case DbchangelogPackage.DOCUMENT_ROOT__MERGE_COLUMNS:
			case DbchangelogPackage.DOCUMENT_ROOT__MODIFY_DATA_TYPE:
			case DbchangelogPackage.DOCUMENT_ROOT__NOT:
			case DbchangelogPackage.DOCUMENT_ROOT__OR:
			case DbchangelogPackage.DOCUMENT_ROOT__PARAM:
			case DbchangelogPackage.DOCUMENT_ROOT__PRIMARY_KEY_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_COLUMN:
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_TABLE:
			case DbchangelogPackage.DOCUMENT_ROOT__RENAME_VIEW:
			case DbchangelogPackage.DOCUMENT_ROOT__ROLLBACK:
			case DbchangelogPackage.DOCUMENT_ROOT__ROW_COUNT:
			case DbchangelogPackage.DOCUMENT_ROOT__RUNNING_AS:
			case DbchangelogPackage.DOCUMENT_ROOT__SEQUENCE_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__SQL:
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_CHECK:
			case DbchangelogPackage.DOCUMENT_ROOT__SQL_FILE:
			case DbchangelogPackage.DOCUMENT_ROOT__STOP:
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__TABLE_IS_EMPTY:
			case DbchangelogPackage.DOCUMENT_ROOT__TAG_DATABASE:
			case DbchangelogPackage.DOCUMENT_ROOT__UPDATE:
			case DbchangelogPackage.DOCUMENT_ROOT__VIEW_EXISTS:
			case DbchangelogPackage.DOCUMENT_ROOT__WHERE_PARAMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddAutoIncrement(),
				 DbchangelogFactory.eINSTANCE.createAddAutoIncrementType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddColumn(),
				 DbchangelogFactory.eINSTANCE.createAddColumnType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddDefaultValue(),
				 DbchangelogFactory.eINSTANCE.createAddDefaultValueType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddForeignKeyConstraint(),
				 DbchangelogFactory.eINSTANCE.createAddForeignKeyConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddLookupTable(),
				 DbchangelogFactory.eINSTANCE.createAddLookupTableType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddNotNullConstraint(),
				 DbchangelogFactory.eINSTANCE.createAddNotNullConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddPrimaryKey(),
				 DbchangelogFactory.eINSTANCE.createAddPrimaryKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AddUniqueConstraint(),
				 DbchangelogFactory.eINSTANCE.createAddUniqueConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_AlterSequence(),
				 DbchangelogFactory.eINSTANCE.createAlterSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_And(),
				 DbchangelogFactory.eINSTANCE.createAndType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeLogPropertyDefined(),
				 DbchangelogFactory.eINSTANCE.createChangeLogPropertyDefinedType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ChangeSetExecuted(),
				 DbchangelogFactory.eINSTANCE.createChangeSetExecutedType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Column(),
				 DbchangelogFactory.eINSTANCE.createColumnType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ColumnExists(),
				 DbchangelogFactory.eINSTANCE.createColumnExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Constraints(),
				 DbchangelogFactory.eINSTANCE.createConstraintsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateIndex(),
				 DbchangelogFactory.eINSTANCE.createCreateIndexType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateProcedure(),
				 DbchangelogFactory.eINSTANCE.createCreateProcedureType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateSequence(),
				 DbchangelogFactory.eINSTANCE.createCreateSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateTable(),
				 DbchangelogFactory.eINSTANCE.createCreateTableType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CreateView(),
				 DbchangelogFactory.eINSTANCE.createCreateViewType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomChange(),
				 DbchangelogFactory.eINSTANCE.createCustomChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_CustomPrecondition(),
				 DbchangelogFactory.eINSTANCE.createCustomPreconditionType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DatabaseChangeLog(),
				 DbchangelogFactory.eINSTANCE.createDatabaseChangeLogType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Dbms(),
				 DbchangelogFactory.eINSTANCE.createDbmsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Delete(),
				 DbchangelogFactory.eINSTANCE.createDeleteType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropAllForeignKeyConstraints(),
				 DbchangelogFactory.eINSTANCE.createDropAllForeignKeyConstraintsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropColumn(),
				 DbchangelogFactory.eINSTANCE.createDropColumnType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropDefaultValue(),
				 DbchangelogFactory.eINSTANCE.createDropDefaultValueType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropForeignKeyConstraint(),
				 DbchangelogFactory.eINSTANCE.createDropForeignKeyConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropIndex(),
				 DbchangelogFactory.eINSTANCE.createDropIndexType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropNotNullConstraint(),
				 DbchangelogFactory.eINSTANCE.createDropNotNullConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropPrimaryKey(),
				 DbchangelogFactory.eINSTANCE.createDropPrimaryKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropProcedure(),
				 DbchangelogFactory.eINSTANCE.createDropProcedureType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropSequence(),
				 DbchangelogFactory.eINSTANCE.createDropSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropTable(),
				 DbchangelogFactory.eINSTANCE.createDropTableType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropUniqueConstraint(),
				 DbchangelogFactory.eINSTANCE.createDropUniqueConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_DropView(),
				 DbchangelogFactory.eINSTANCE.createDropViewType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExecuteCommand(),
				 DbchangelogFactory.eINSTANCE.createExecuteCommandType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ExpectedQuotingStrategy(),
				 DbchangelogFactory.eINSTANCE.createExpectedQuotingStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ForeignKeyConstraintExists(),
				 DbchangelogFactory.eINSTANCE.createForeignKeyConstraintExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_IndexExists(),
				 DbchangelogFactory.eINSTANCE.createIndexExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Insert(),
				 DbchangelogFactory.eINSTANCE.createInsertType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadData(),
				 DbchangelogFactory.eINSTANCE.createLoadDataType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_LoadUpdateData(),
				 DbchangelogFactory.eINSTANCE.createLoadUpdateDataType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_MergeColumns(),
				 DbchangelogFactory.eINSTANCE.createMergeColumnsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ModifyDataType(),
				 DbchangelogFactory.eINSTANCE.createModifyDataTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Not(),
				 DbchangelogFactory.eINSTANCE.createNotType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Or(),
				 DbchangelogFactory.eINSTANCE.createOrType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Param(),
				 DbchangelogFactory.eINSTANCE.createParamType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_PrimaryKeyExists(),
				 DbchangelogFactory.eINSTANCE.createPrimaryKeyExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameColumn(),
				 DbchangelogFactory.eINSTANCE.createRenameColumnType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameTable(),
				 DbchangelogFactory.eINSTANCE.createRenameTableType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_RenameView(),
				 DbchangelogFactory.eINSTANCE.createRenameViewType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Rollback(),
				 DbchangelogFactory.eINSTANCE.createRollbackType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_RowCount(),
				 DbchangelogFactory.eINSTANCE.createRowCountType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_RunningAs(),
				 DbchangelogFactory.eINSTANCE.createRunningAsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_SequenceExists(),
				 DbchangelogFactory.eINSTANCE.createSequenceExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Sql(),
				 DbchangelogFactory.eINSTANCE.createSqlType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlCheck(),
				 DbchangelogFactory.eINSTANCE.createSqlCheckType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_SqlFile(),
				 DbchangelogFactory.eINSTANCE.createSqlFileType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Stop(),
				 DbchangelogFactory.eINSTANCE.createStopType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableExists(),
				 DbchangelogFactory.eINSTANCE.createTableExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_TableIsEmpty(),
				 DbchangelogFactory.eINSTANCE.createTableIsEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_TagDatabase(),
				 DbchangelogFactory.eINSTANCE.createTagDatabaseType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_Update(),
				 DbchangelogFactory.eINSTANCE.createUpdateType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_ViewExists(),
				 DbchangelogFactory.eINSTANCE.createViewExistsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDocumentRoot_WhereParams(),
				 DbchangelogFactory.eINSTANCE.createWhereParamsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DbchangelogEditPlugin.INSTANCE;
	}

}
