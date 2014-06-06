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

import org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddUniqueConstraintTypeItemProvider
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
	public AddUniqueConstraintTypeItemProvider(AdapterFactory adapterFactory) {
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
			addColumnNamesPropertyDescriptor(object);
			addConstraintNamePropertyDescriptor(object);
			addDeferrablePropertyDescriptor(object);
			addDisabledPropertyDescriptor(object);
			addInitiallyDeferredPropertyDescriptor(object);
			addSchemaNamePropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addTablespacePropertyDescriptor(object);
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
				 getString("_UI_AddUniqueConstraintType_catalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_catalogName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_CatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_columnNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_columnNames_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ColumnNames(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_AddUniqueConstraintType_constraintName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_constraintName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ConstraintName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deferrable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeferrablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_deferrable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_deferrable_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Deferrable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_disabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_disabled_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Disabled(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initially Deferred feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitiallyDeferredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_initiallyDeferred_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_initiallyDeferred_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_InitiallyDeferred(),
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
				 getString("_UI_AddUniqueConstraintType_schemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_schemaName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_SchemaName(),
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
				 getString("_UI_AddUniqueConstraintType_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_tableName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_TableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tablespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_tablespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_tablespace_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Tablespace(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AddUniqueConstraintType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddUniqueConstraintType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AddUniqueConstraintType)object).getCatalogName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddUniqueConstraintType_type") :
			getString("_UI_AddUniqueConstraintType_type") + " " + label;
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

		switch (notification.getFeatureID(AddUniqueConstraintType.class)) {
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE:
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
