/**
 */
package org.liquibase.xml.ns.dbchangelog.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

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

import org.liquibase.xml.ns.dbchangelog.ChangeSetType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.ChangeSetType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeSetTypeItemProvider
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
	public ChangeSetTypeItemProvider(AdapterFactory adapterFactory) {
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
			addAuthorPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addDbmsPropertyDescriptor(object);
			addFailOnErrorPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLogicalFilePathPropertyDescriptor(object);
			addObjectQuotingStrategyPropertyDescriptor(object);
			addOnValidationFailPropertyDescriptor(object);
			addRunAlwaysPropertyDescriptor(object);
			addRunInTransactionPropertyDescriptor(object);
			addRunOnChangePropertyDescriptor(object);
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
				 getString("_UI_ChangeSetType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_comment_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_author_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_Author(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_context_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_context_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_Context(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dbms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbmsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_dbms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_dbms_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_Dbms(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fail On Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailOnErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_failOnError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_failOnError_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_FailOnError(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_id_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_logicalFilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_logicalFilePath_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_LogicalFilePath(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Quoting Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectQuotingStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_objectQuotingStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_objectQuotingStrategy_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_ObjectQuotingStrategy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Validation Fail feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnValidationFailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_onValidationFail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_onValidationFail_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_OnValidationFail(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run Always feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunAlwaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_runAlways_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_runAlways_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_RunAlways(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run In Transaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunInTransactionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_runInTransaction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_runInTransaction_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_RunInTransaction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run On Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunOnChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChangeSetType_runOnChange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChangeSetType_runOnChange_feature", "_UI_ChangeSetType_type"),
				 DbchangelogPackage.eINSTANCE.getChangeSetType_RunOnChange(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getChangeSetType_ValidCheckSum());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getChangeSetType_PreConditions());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getChangeSetType_TagDatabase());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getChangeSetType_ModifySql());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getChangeSetType_AnyAttribute());
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
	 * This returns ChangeSetType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChangeSetType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ChangeSetType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ChangeSetType_type") :
			getString("_UI_ChangeSetType_type") + " " + label;
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

		switch (notification.getFeatureID(ChangeSetType.class)) {
			case DbchangelogPackage.CHANGE_SET_TYPE__COMMENT:
			case DbchangelogPackage.CHANGE_SET_TYPE__AUTHOR:
			case DbchangelogPackage.CHANGE_SET_TYPE__CONTEXT:
			case DbchangelogPackage.CHANGE_SET_TYPE__DBMS:
			case DbchangelogPackage.CHANGE_SET_TYPE__FAIL_ON_ERROR:
			case DbchangelogPackage.CHANGE_SET_TYPE__ID:
			case DbchangelogPackage.CHANGE_SET_TYPE__LOGICAL_FILE_PATH:
			case DbchangelogPackage.CHANGE_SET_TYPE__OBJECT_QUOTING_STRATEGY:
			case DbchangelogPackage.CHANGE_SET_TYPE__ON_VALIDATION_FAIL:
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ALWAYS:
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_IN_TRANSACTION:
			case DbchangelogPackage.CHANGE_SET_TYPE__RUN_ON_CHANGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.CHANGE_SET_TYPE__VALID_CHECK_SUM:
			case DbchangelogPackage.CHANGE_SET_TYPE__PRE_CONDITIONS:
			case DbchangelogPackage.CHANGE_SET_TYPE__TAG_DATABASE:
			case DbchangelogPackage.CHANGE_SET_TYPE__CHANGE_SET_CHILDREN:
			case DbchangelogPackage.CHANGE_SET_TYPE__MODIFY_SQL:
			case DbchangelogPackage.CHANGE_SET_TYPE__ANY_ATTRIBUTE:
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
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ValidCheckSum(),
				 DbchangelogFactory.eINSTANCE.createValidCheckSumType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_PreConditions(),
				 DbchangelogFactory.eINSTANCE.createPreConditionsType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_TagDatabase(),
				 DbchangelogFactory.eINSTANCE.createTagDatabaseType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Comment(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateTable(),
					 DbchangelogFactory.eINSTANCE.createCreateTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropTable(),
					 DbchangelogFactory.eINSTANCE.createDropTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateView(),
					 DbchangelogFactory.eINSTANCE.createCreateViewType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_RenameView(),
					 DbchangelogFactory.eINSTANCE.createRenameViewType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropView(),
					 DbchangelogFactory.eINSTANCE.createDropViewType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Insert(),
					 DbchangelogFactory.eINSTANCE.createInsertType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddColumn(),
					 DbchangelogFactory.eINSTANCE.createAddColumnType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Sql(),
					 DbchangelogFactory.eINSTANCE.createSqlType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateProcedure(),
					 DbchangelogFactory.eINSTANCE.createCreateProcedureType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropProcedure(),
					 DbchangelogFactory.eINSTANCE.createDropProcedureType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_SqlFile(),
					 DbchangelogFactory.eINSTANCE.createSqlFileType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_RenameTable(),
					 DbchangelogFactory.eINSTANCE.createRenameTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_RenameColumn(),
					 DbchangelogFactory.eINSTANCE.createRenameColumnType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropColumn(),
					 DbchangelogFactory.eINSTANCE.createDropColumnType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_MergeColumns(),
					 DbchangelogFactory.eINSTANCE.createMergeColumnsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_ModifyDataType(),
					 DbchangelogFactory.eINSTANCE.createModifyDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateSequence(),
					 DbchangelogFactory.eINSTANCE.createCreateSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AlterSequence(),
					 DbchangelogFactory.eINSTANCE.createAlterSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropSequence(),
					 DbchangelogFactory.eINSTANCE.createDropSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_CreateIndex(),
					 DbchangelogFactory.eINSTANCE.createCreateIndexType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropIndex(),
					 DbchangelogFactory.eINSTANCE.createDropIndexType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddNotNullConstraint(),
					 DbchangelogFactory.eINSTANCE.createAddNotNullConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropNotNullConstraint(),
					 DbchangelogFactory.eINSTANCE.createDropNotNullConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddForeignKeyConstraint(),
					 DbchangelogFactory.eINSTANCE.createAddForeignKeyConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropForeignKeyConstraint(),
					 DbchangelogFactory.eINSTANCE.createDropForeignKeyConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropAllForeignKeyConstraints(),
					 DbchangelogFactory.eINSTANCE.createDropAllForeignKeyConstraintsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddPrimaryKey(),
					 DbchangelogFactory.eINSTANCE.createAddPrimaryKeyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropPrimaryKey(),
					 DbchangelogFactory.eINSTANCE.createDropPrimaryKeyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddLookupTable(),
					 DbchangelogFactory.eINSTANCE.createAddLookupTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddAutoIncrement(),
					 DbchangelogFactory.eINSTANCE.createAddAutoIncrementType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddDefaultValue(),
					 DbchangelogFactory.eINSTANCE.createAddDefaultValueType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropDefaultValue(),
					 DbchangelogFactory.eINSTANCE.createDropDefaultValueType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_AddUniqueConstraint(),
					 DbchangelogFactory.eINSTANCE.createAddUniqueConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_DropUniqueConstraint(),
					 DbchangelogFactory.eINSTANCE.createDropUniqueConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_CustomChange(),
					 DbchangelogFactory.eINSTANCE.createCustomChangeType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Update(),
					 DbchangelogFactory.eINSTANCE.createUpdateType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Delete(),
					 DbchangelogFactory.eINSTANCE.createDeleteType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_LoadData(),
					 DbchangelogFactory.eINSTANCE.createLoadDataType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_LoadUpdateData(),
					 DbchangelogFactory.eINSTANCE.createLoadUpdateDataType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_ExecuteCommand(),
					 DbchangelogFactory.eINSTANCE.createExecuteCommandType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Stop(),
					 DbchangelogFactory.eINSTANCE.createStopType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ChangeSetChildren(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getChangeSetType_Rollback(),
					 DbchangelogFactory.eINSTANCE.createRollbackType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getChangeSetType_ModifySql(),
				 DbchangelogFactory.eINSTANCE.createModifySqlType()));
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
