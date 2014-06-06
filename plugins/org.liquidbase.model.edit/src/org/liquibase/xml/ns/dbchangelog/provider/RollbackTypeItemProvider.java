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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import org.liquibase.xml.ns.dbchangelog.RollbackType;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.RollbackType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RollbackTypeItemProvider
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
	public RollbackTypeItemProvider(AdapterFactory adapterFactory) {
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
			addChangeSetAuthorPropertyDescriptor(object);
			addChangeSetIdPropertyDescriptor(object);
			addChangeSetPathPropertyDescriptor(object);
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
				 getString("_UI_RollbackType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RollbackType_comment_feature", "_UI_RollbackType_type"),
				 DbchangelogPackage.eINSTANCE.getRollbackType_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Set Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeSetAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RollbackType_changeSetAuthor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RollbackType_changeSetAuthor_feature", "_UI_RollbackType_type"),
				 DbchangelogPackage.eINSTANCE.getRollbackType_ChangeSetAuthor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Set Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeSetIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RollbackType_changeSetId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RollbackType_changeSetId_feature", "_UI_RollbackType_type"),
				 DbchangelogPackage.eINSTANCE.getRollbackType_ChangeSetId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Set Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeSetPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RollbackType_changeSetPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RollbackType_changeSetPath_feature", "_UI_RollbackType_type"),
				 DbchangelogPackage.eINSTANCE.getRollbackType_ChangeSetPath(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed());
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
	 * This returns RollbackType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RollbackType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RollbackType)object).getChangeSetAuthor();
		return label == null || label.length() == 0 ?
			getString("_UI_RollbackType_type") :
			getString("_UI_RollbackType_type") + " " + label;
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

		switch (notification.getFeatureID(RollbackType.class)) {
			case DbchangelogPackage.ROLLBACK_TYPE__COMMENT:
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_AUTHOR:
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_ID:
			case DbchangelogPackage.ROLLBACK_TYPE__CHANGE_SET_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.ROLLBACK_TYPE__MIXED:
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
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Comment(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_CreateTable(),
					 DbchangelogFactory.eINSTANCE.createCreateTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropTable(),
					 DbchangelogFactory.eINSTANCE.createDropTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_CreateView(),
					 DbchangelogFactory.eINSTANCE.createCreateViewType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_RenameView(),
					 DbchangelogFactory.eINSTANCE.createRenameViewType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropView(),
					 DbchangelogFactory.eINSTANCE.createDropViewType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Insert(),
					 DbchangelogFactory.eINSTANCE.createInsertType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddColumn(),
					 DbchangelogFactory.eINSTANCE.createAddColumnType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Sql(),
					 DbchangelogFactory.eINSTANCE.createSqlType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_CreateProcedure(),
					 DbchangelogFactory.eINSTANCE.createCreateProcedureType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropProcedure(),
					 DbchangelogFactory.eINSTANCE.createDropProcedureType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_SqlFile(),
					 DbchangelogFactory.eINSTANCE.createSqlFileType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_RenameTable(),
					 DbchangelogFactory.eINSTANCE.createRenameTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_RenameColumn(),
					 DbchangelogFactory.eINSTANCE.createRenameColumnType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropColumn(),
					 DbchangelogFactory.eINSTANCE.createDropColumnType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_MergeColumns(),
					 DbchangelogFactory.eINSTANCE.createMergeColumnsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_ModifyDataType(),
					 DbchangelogFactory.eINSTANCE.createModifyDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_CreateSequence(),
					 DbchangelogFactory.eINSTANCE.createCreateSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AlterSequence(),
					 DbchangelogFactory.eINSTANCE.createAlterSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropSequence(),
					 DbchangelogFactory.eINSTANCE.createDropSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_CreateIndex(),
					 DbchangelogFactory.eINSTANCE.createCreateIndexType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropIndex(),
					 DbchangelogFactory.eINSTANCE.createDropIndexType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddNotNullConstraint(),
					 DbchangelogFactory.eINSTANCE.createAddNotNullConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropNotNullConstraint(),
					 DbchangelogFactory.eINSTANCE.createDropNotNullConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddForeignKeyConstraint(),
					 DbchangelogFactory.eINSTANCE.createAddForeignKeyConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropForeignKeyConstraint(),
					 DbchangelogFactory.eINSTANCE.createDropForeignKeyConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropAllForeignKeyConstraints(),
					 DbchangelogFactory.eINSTANCE.createDropAllForeignKeyConstraintsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddPrimaryKey(),
					 DbchangelogFactory.eINSTANCE.createAddPrimaryKeyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropPrimaryKey(),
					 DbchangelogFactory.eINSTANCE.createDropPrimaryKeyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddLookupTable(),
					 DbchangelogFactory.eINSTANCE.createAddLookupTableType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddAutoIncrement(),
					 DbchangelogFactory.eINSTANCE.createAddAutoIncrementType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddDefaultValue(),
					 DbchangelogFactory.eINSTANCE.createAddDefaultValueType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropDefaultValue(),
					 DbchangelogFactory.eINSTANCE.createDropDefaultValueType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_AddUniqueConstraint(),
					 DbchangelogFactory.eINSTANCE.createAddUniqueConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_DropUniqueConstraint(),
					 DbchangelogFactory.eINSTANCE.createDropUniqueConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_CustomChange(),
					 DbchangelogFactory.eINSTANCE.createCustomChangeType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Update(),
					 DbchangelogFactory.eINSTANCE.createUpdateType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Delete(),
					 DbchangelogFactory.eINSTANCE.createDeleteType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_LoadData(),
					 DbchangelogFactory.eINSTANCE.createLoadDataType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_LoadUpdateData(),
					 DbchangelogFactory.eINSTANCE.createLoadUpdateDataType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_ExecuteCommand(),
					 DbchangelogFactory.eINSTANCE.createExecuteCommandType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Stop(),
					 DbchangelogFactory.eINSTANCE.createStopType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getRollbackType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getRollbackType_Rollback(),
					 DbchangelogFactory.eINSTANCE.createRollbackType())));
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
