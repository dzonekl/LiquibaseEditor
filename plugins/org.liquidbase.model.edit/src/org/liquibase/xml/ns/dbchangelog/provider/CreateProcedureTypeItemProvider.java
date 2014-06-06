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

import org.liquibase.xml.ns.dbchangelog.CreateProcedureType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.CreateProcedureType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateProcedureTypeItemProvider
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
	public CreateProcedureTypeItemProvider(AdapterFactory adapterFactory) {
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
			addCatalogNamePropertyDescriptor(object);
			addDbmsPropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addProcedureNamePropertyDescriptor(object);
			addRelativeToChangelogFilePropertyDescriptor(object);
			addSchemaNamePropertyDescriptor(object);
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
				 getString("_UI_CreateProcedureType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_comment_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_CreateProcedureType_catalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_catalogName_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_CatalogName(),
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
				 getString("_UI_CreateProcedureType_dbms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_dbms_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_Dbms(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateProcedureType_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_encoding_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_Encoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateProcedureType_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_path_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_Path(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Procedure Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcedureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateProcedureType_procedureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_procedureName_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_ProcedureName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative To Changelog File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeToChangelogFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CreateProcedureType_relativeToChangelogFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_relativeToChangelogFile_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_RelativeToChangelogFile(),
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
				 getString("_UI_CreateProcedureType_schemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateProcedureType_schemaName_feature", "_UI_CreateProcedureType_type"),
				 DbchangelogPackage.eINSTANCE.getCreateProcedureType_SchemaName(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed());
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
	 * This returns CreateProcedureType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateProcedureType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CreateProcedureType)object).getCatalogName();
		return label == null || label.length() == 0 ?
			getString("_UI_CreateProcedureType_type") :
			getString("_UI_CreateProcedureType_type") + " " + label;
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

		switch (notification.getFeatureID(CreateProcedureType.class)) {
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__COMMENT:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__CATALOG_NAME:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__DBMS:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__ENCODING:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PATH:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__PROCEDURE_NAME:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__RELATIVE_TO_CHANGELOG_FILE:
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__SCHEMA_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.CREATE_PROCEDURE_TYPE__MIXED:
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
				(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getCreateProcedureType_Comment(),
					 "")));
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
