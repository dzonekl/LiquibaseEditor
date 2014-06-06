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

import org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.DatabaseChangeLogType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseChangeLogTypeItemProvider
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
	public DatabaseChangeLogTypeItemProvider(AdapterFactory adapterFactory) {
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

			addLogicalFilePathPropertyDescriptor(object);
			addObjectQuotingStrategyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_DatabaseChangeLogType_logicalFilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseChangeLogType_logicalFilePath_feature", "_UI_DatabaseChangeLogType_type"),
				 DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_LogicalFilePath(),
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
				 getString("_UI_DatabaseChangeLogType_objectQuotingStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatabaseChangeLogType_objectQuotingStrategy_feature", "_UI_DatabaseChangeLogType_type"),
				 DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_ObjectQuotingStrategy(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Property());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_PreConditions());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Group());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_AnyAttribute());
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
	 * This returns DatabaseChangeLogType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatabaseChangeLogType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DatabaseChangeLogType)object).getLogicalFilePath();
		return label == null || label.length() == 0 ?
			getString("_UI_DatabaseChangeLogType_type") :
			getString("_UI_DatabaseChangeLogType_type") + " " + label;
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

		switch (notification.getFeatureID(DatabaseChangeLogType.class)) {
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__LOGICAL_FILE_PATH:
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__OBJECT_QUOTING_STRATEGY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PROPERTY:
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__PRE_CONDITIONS:
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__GROUP:
			case DbchangelogPackage.DATABASE_CHANGE_LOG_TYPE__ANY_ATTRIBUTE:
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
				(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Property(),
				 DbchangelogFactory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_PreConditions(),
				 DbchangelogFactory.eINSTANCE.createPreConditionsType1()));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_ChangeSet(),
					 DbchangelogFactory.eINSTANCE.createChangeSetType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Include(),
					 DbchangelogFactory.eINSTANCE.createIncludeType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getDatabaseChangeLogType_IncludeAll(),
					 DbchangelogFactory.eINSTANCE.createIncludeAllType())));
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
