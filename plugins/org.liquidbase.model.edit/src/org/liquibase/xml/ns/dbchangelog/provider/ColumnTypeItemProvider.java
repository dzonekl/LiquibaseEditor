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

import org.liquibase.xml.ns.dbchangelog.ColumnType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.ColumnType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnTypeItemProvider
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
	public ColumnTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAutoIncrementPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addDefaultValueBooleanPropertyDescriptor(object);
			addDefaultValueComputedPropertyDescriptor(object);
			addDefaultValueDatePropertyDescriptor(object);
			addDefaultValueNumericPropertyDescriptor(object);
			addDefaultValueSequenceCurrentPropertyDescriptor(object);
			addDefaultValueSequenceNextPropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addIncrementByPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRemarksPropertyDescriptor(object);
			addStartWithPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addValueBlobFilePropertyDescriptor(object);
			addValueBooleanPropertyDescriptor(object);
			addValueClobFilePropertyDescriptor(object);
			addValueComputedPropertyDescriptor(object);
			addValueDatePropertyDescriptor(object);
			addValueNumericPropertyDescriptor(object);
			addValueSequenceCurrentPropertyDescriptor(object);
			addValueSequenceNextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Increment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoIncrementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_autoIncrement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_autoIncrement_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_AutoIncrement(),
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
				 getString("_UI_ColumnType_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValue_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValue(),
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
				 getString("_UI_ColumnType_defaultValueBoolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValueBoolean_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValueBoolean(),
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
				 getString("_UI_ColumnType_defaultValueComputed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValueComputed_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValueComputed(),
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
				 getString("_UI_ColumnType_defaultValueDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValueDate_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValueDate(),
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
				 getString("_UI_ColumnType_defaultValueNumeric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValueNumeric_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValueNumeric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Sequence Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueSequenceCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_defaultValueSequenceCurrent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValueSequenceCurrent_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValueSequenceCurrent(),
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
				 getString("_UI_ColumnType_defaultValueSequenceNext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_defaultValueSequenceNext_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_DefaultValueSequenceNext(),
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
				 getString("_UI_ColumnType_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_encoding_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_Encoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Increment By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncrementByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_incrementBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_incrementBy_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_IncrementBy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_name_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remarks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_remarks_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_Remarks(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_startWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_startWith_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_StartWith(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_type_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_Type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_value_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_Value(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Blob File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueBlobFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueBlobFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueBlobFile_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueBlobFile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Boolean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueBooleanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueBoolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueBoolean_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueBoolean(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Clob File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueClobFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueClobFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueClobFile_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueClobFile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Computed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueComputedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueComputed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueComputed_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueComputed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueDate_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Numeric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueNumericPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueNumeric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueNumeric_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueNumeric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Sequence Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueSequenceCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueSequenceCurrent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueSequenceCurrent_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueSequenceCurrent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Sequence Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueSequenceNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColumnType_valueSequenceNext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColumnType_valueSequenceNext_feature", "_UI_ColumnType_type"),
				 DbchangelogPackage.eINSTANCE.getColumnType_ValueSequenceNext(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getColumnType_Mixed());
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
	 * This returns ColumnType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ColumnType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ColumnType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ColumnType_type") :
			getString("_UI_ColumnType_type") + " " + label;
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

		switch (notification.getFeatureID(ColumnType.class)) {
			case DbchangelogPackage.COLUMN_TYPE__AUTO_INCREMENT:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE_BOOLEAN:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE_COMPUTED:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE_DATE:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE_NUMERIC:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE_SEQUENCE_CURRENT:
			case DbchangelogPackage.COLUMN_TYPE__DEFAULT_VALUE_SEQUENCE_NEXT:
			case DbchangelogPackage.COLUMN_TYPE__ENCODING:
			case DbchangelogPackage.COLUMN_TYPE__INCREMENT_BY:
			case DbchangelogPackage.COLUMN_TYPE__NAME:
			case DbchangelogPackage.COLUMN_TYPE__REMARKS:
			case DbchangelogPackage.COLUMN_TYPE__START_WITH:
			case DbchangelogPackage.COLUMN_TYPE__TYPE:
			case DbchangelogPackage.COLUMN_TYPE__VALUE:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_BLOB_FILE:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_BOOLEAN:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_CLOB_FILE:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_COMPUTED:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_DATE:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_NUMERIC:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_SEQUENCE_CURRENT:
			case DbchangelogPackage.COLUMN_TYPE__VALUE_SEQUENCE_NEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.COLUMN_TYPE__MIXED:
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
				(DbchangelogPackage.eINSTANCE.getColumnType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getColumnType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getColumnType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getColumnType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getColumnType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getColumnType_Constraints(),
					 DbchangelogFactory.eINSTANCE.createConstraintsType())));
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
