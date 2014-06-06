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

import org.liquibase.xml.ns.dbchangelog.AddDefaultValueType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.AddDefaultValueType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddDefaultValueTypeItemProvider
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
	public AddDefaultValueTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCatalogNamePropertyDescriptor(object);
			addColumnDataTypePropertyDescriptor(object);
			addColumnNamePropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addDefaultValueBooleanPropertyDescriptor(object);
			addDefaultValueComputedPropertyDescriptor(object);
			addDefaultValueDatePropertyDescriptor(object);
			addDefaultValueNumericPropertyDescriptor(object);
			addDefaultValueSequenceNextPropertyDescriptor(object);
			addSchemaNamePropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_catalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_catalogName_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_CatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_columnDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_columnDataType_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_ColumnDataType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_columnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_columnName_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_ColumnName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_defaultValue_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_DefaultValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Boolean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueBooleanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_defaultValueBoolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_defaultValueBoolean_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_DefaultValueBoolean(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Computed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueComputedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_defaultValueComputed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_defaultValueComputed_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_DefaultValueComputed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_defaultValueDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_defaultValueDate_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_DefaultValueDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Numeric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueNumericPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_defaultValueNumeric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_defaultValueNumeric_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_DefaultValueNumeric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Sequence Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueSequenceNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_defaultValueSequenceNext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_defaultValueSequenceNext_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_DefaultValueSequenceNext(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_schemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_schemaName_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_SchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddDefaultValueType_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddDefaultValueType_tableName_feature", "_UI_AddDefaultValueType_type"),
				 DbchangelogPackage.eINSTANCE.getAddDefaultValueType_TableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AddDefaultValueType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddDefaultValueType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AddDefaultValueType)object).getCatalogName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddDefaultValueType_type") :
			getString("_UI_AddDefaultValueType_type") + " " + label;
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

		switch (notification.getFeatureID(AddDefaultValueType.class)) {
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__CATALOG_NAME:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_DATA_TYPE:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__COLUMN_NAME:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_BOOLEAN:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_COMPUTED:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_DATE:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_NUMERIC:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__SCHEMA_NAME:
			case DbchangelogPackage.ADD_DEFAULT_VALUE_TYPE__TABLE_NAME:
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
