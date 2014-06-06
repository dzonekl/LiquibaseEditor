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

import org.liquibase.xml.ns.dbchangelog.ConstraintsType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.ConstraintsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsTypeItemProvider
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
	public ConstraintsTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCheckConstraintPropertyDescriptor(object);
			addDeferrablePropertyDescriptor(object);
			addDeleteCascadePropertyDescriptor(object);
			addForeignKeyNamePropertyDescriptor(object);
			addInitiallyDeferredPropertyDescriptor(object);
			addNullablePropertyDescriptor(object);
			addPrimaryKeyPropertyDescriptor(object);
			addPrimaryKeyNamePropertyDescriptor(object);
			addPrimaryKeyTablespacePropertyDescriptor(object);
			addReferencedColumnNamesPropertyDescriptor(object);
			addReferencedTableNamePropertyDescriptor(object);
			addReferencesPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addUniqueConstraintNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Check Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_checkConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_checkConstraint_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_CheckConstraint(),
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
				 getString("_UI_ConstraintsType_deferrable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_deferrable_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_Deferrable(),
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
				 getString("_UI_ConstraintsType_deleteCascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_deleteCascade_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_DeleteCascade(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Foreign Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForeignKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_foreignKeyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_foreignKeyName_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_ForeignKeyName(),
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
				 getString("_UI_ConstraintsType_initiallyDeferred_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_initiallyDeferred_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_InitiallyDeferred(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nullable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_nullable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_nullable_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_Nullable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_primaryKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_primaryKey_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_PrimaryKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_primaryKeyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_primaryKeyName_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_PrimaryKeyName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Key Tablespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeyTablespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_primaryKeyTablespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_primaryKeyTablespace_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_PrimaryKeyTablespace(),
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
				 getString("_UI_ConstraintsType_referencedColumnNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_referencedColumnNames_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_ReferencedColumnNames(),
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
				 getString("_UI_ConstraintsType_referencedTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_referencedTableName_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_ReferencedTableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_references_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_references_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_References(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_unique_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_Unique(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique Constraint Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueConstraintNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintsType_uniqueConstraintName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintsType_uniqueConstraintName_feature", "_UI_ConstraintsType_type"),
				 DbchangelogPackage.eINSTANCE.getConstraintsType_UniqueConstraintName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ConstraintsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstraintsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConstraintsType)object).getForeignKeyName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConstraintsType_type") :
			getString("_UI_ConstraintsType_type") + " " + label;
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

		switch (notification.getFeatureID(ConstraintsType.class)) {
			case DbchangelogPackage.CONSTRAINTS_TYPE__CHECK_CONSTRAINT:
			case DbchangelogPackage.CONSTRAINTS_TYPE__DEFERRABLE:
			case DbchangelogPackage.CONSTRAINTS_TYPE__DELETE_CASCADE:
			case DbchangelogPackage.CONSTRAINTS_TYPE__FOREIGN_KEY_NAME:
			case DbchangelogPackage.CONSTRAINTS_TYPE__INITIALLY_DEFERRED:
			case DbchangelogPackage.CONSTRAINTS_TYPE__NULLABLE:
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY:
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_NAME:
			case DbchangelogPackage.CONSTRAINTS_TYPE__PRIMARY_KEY_TABLESPACE:
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_COLUMN_NAMES:
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCED_TABLE_NAME:
			case DbchangelogPackage.CONSTRAINTS_TYPE__REFERENCES:
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE:
			case DbchangelogPackage.CONSTRAINTS_TYPE__UNIQUE_CONSTRAINT_NAME:
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
