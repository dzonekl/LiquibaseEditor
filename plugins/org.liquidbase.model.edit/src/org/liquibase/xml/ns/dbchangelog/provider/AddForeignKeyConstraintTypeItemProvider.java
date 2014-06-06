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

import org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.AddForeignKeyConstraintType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddForeignKeyConstraintTypeItemProvider
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
	public AddForeignKeyConstraintTypeItemProvider(AdapterFactory adapterFactory) {
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

			addBaseColumnNamesPropertyDescriptor(object);
			addBaseTableCatalogNamePropertyDescriptor(object);
			addBaseTableNamePropertyDescriptor(object);
			addBaseTableSchemaNamePropertyDescriptor(object);
			addConstraintNamePropertyDescriptor(object);
			addDeferrablePropertyDescriptor(object);
			addDeleteCascadePropertyDescriptor(object);
			addInitiallyDeferredPropertyDescriptor(object);
			addOnDeletePropertyDescriptor(object);
			addOnUpdatePropertyDescriptor(object);
			addReferencedColumnNamesPropertyDescriptor(object);
			addReferencedTableCatalogNamePropertyDescriptor(object);
			addReferencedTableNamePropertyDescriptor(object);
			addReferencedTableSchemaNamePropertyDescriptor(object);
			addReferencesUniqueColumnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Column Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseColumnNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_baseColumnNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_baseColumnNames_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_BaseColumnNames(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Table Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTableCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_baseTableCatalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_baseTableCatalogName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_BaseTableCatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_baseTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_baseTableName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_BaseTableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Table Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTableSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_baseTableSchemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_baseTableSchemaName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_BaseTableSchemaName(),
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
				 getString("_UI_AddForeignKeyConstraintType_constraintName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_constraintName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_ConstraintName(),
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
				 getString("_UI_AddForeignKeyConstraintType_deferrable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_deferrable_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_Deferrable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Cascade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteCascadePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_deleteCascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_deleteCascade_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_DeleteCascade(),
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
				 getString("_UI_AddForeignKeyConstraintType_initiallyDeferred_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_initiallyDeferred_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_InitiallyDeferred(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_onDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_onDelete_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_OnDelete(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_onUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_onUpdate_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_OnUpdate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Column Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedColumnNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_referencedColumnNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_referencedColumnNames_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_ReferencedColumnNames(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Table Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedTableCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_referencedTableCatalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_referencedTableCatalogName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_ReferencedTableCatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_referencedTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_referencedTableName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_ReferencedTableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Table Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedTableSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_referencedTableSchemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_referencedTableSchemaName_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_ReferencedTableSchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the References Unique Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencesUniqueColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddForeignKeyConstraintType_referencesUniqueColumn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddForeignKeyConstraintType_referencesUniqueColumn_feature", "_UI_AddForeignKeyConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddForeignKeyConstraintType_ReferencesUniqueColumn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AddForeignKeyConstraintType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddForeignKeyConstraintType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AddForeignKeyConstraintType)object).getBaseTableCatalogName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddForeignKeyConstraintType_type") :
			getString("_UI_AddForeignKeyConstraintType_type") + " " + label;
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

		switch (notification.getFeatureID(AddForeignKeyConstraintType.class)) {
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_COLUMN_NAMES:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_CATALOG_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__BASE_TABLE_SCHEMA_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__CONSTRAINT_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DEFERRABLE:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__DELETE_CASCADE:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_DELETE:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__ON_UPDATE:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_COLUMN_NAMES:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_CATALOG_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCED_TABLE_SCHEMA_NAME:
			case DbchangelogPackage.ADD_FOREIGN_KEY_CONSTRAINT_TYPE__REFERENCES_UNIQUE_COLUMN:
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
