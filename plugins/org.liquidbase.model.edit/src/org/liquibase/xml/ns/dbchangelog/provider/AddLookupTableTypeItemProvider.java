/**
 */
package org.liquibase.xml.ns.dbchangelog.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.liquibase.xml.ns.dbchangelog.AddLookupTableType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.AddLookupTableType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddLookupTableTypeItemProvider
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
	public AddLookupTableTypeItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintNamePropertyDescriptor(object);
			addExistingColumnNamePropertyDescriptor(object);
			addExistingTableCatalogNamePropertyDescriptor(object);
			addExistingTableNamePropertyDescriptor(object);
			addExistingTableSchemaNamePropertyDescriptor(object);
			addNewColumnDataTypePropertyDescriptor(object);
			addNewColumnNamePropertyDescriptor(object);
			addNewTableCatalogNamePropertyDescriptor(object);
			addNewTableNamePropertyDescriptor(object);
			addNewTableSchemaNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constraint Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_constraintName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_constraintName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_ConstraintName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Existing Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_existingColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_existingColumnName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_ExistingColumnName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Existing Table Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingTableCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_existingTableCatalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_existingTableCatalogName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_ExistingTableCatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Existing Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_existingTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_existingTableName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_ExistingTableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Existing Table Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingTableSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_existingTableSchemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_existingTableSchemaName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_ExistingTableSchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Column Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewColumnDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_newColumnDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_newColumnDataType_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_NewColumnDataType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_newColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_newColumnName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_NewColumnName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Table Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTableCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_newTableCatalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_newTableCatalogName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_NewTableCatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_newTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_newTableName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_NewTableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Table Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTableSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddLookupTableType_newTableSchemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddLookupTableType_newTableSchemaName_feature", "_UI_AddLookupTableType_type"),
				 DbchangelogPackage.eINSTANCE.getAddLookupTableType_NewTableSchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AddLookupTableType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddLookupTableType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AddLookupTableType)object).getConstraintName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddLookupTableType_type") :
			getString("_UI_AddLookupTableType_type") + " " + label;
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

		switch (notification.getFeatureID(AddLookupTableType.class)) {
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__CONSTRAINT_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_COLUMN_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_CATALOG_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__EXISTING_TABLE_SCHEMA_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_DATA_TYPE:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_COLUMN_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_CATALOG_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_NAME:
			case DbchangelogPackage.ADD_LOOKUP_TABLE_TYPE__NEW_TABLE_SCHEMA_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
