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

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.OnChangeSetPreconditionErrorOrFail;
import org.liquibase.xml.ns.dbchangelog.PreConditionsType;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.PreConditionsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PreConditionsTypeItemProvider
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
	public PreConditionsTypeItemProvider(AdapterFactory adapterFactory) {
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

			addOnErrorPropertyDescriptor(object);
			addOnErrorMessagePropertyDescriptor(object);
			addOnFailPropertyDescriptor(object);
			addOnFailMessagePropertyDescriptor(object);
			addOnSqlOutputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PreConditionsType_onError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType_onError_feature", "_UI_PreConditionsType_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType_OnError(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Error Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnErrorMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PreConditionsType_onErrorMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType_onErrorMessage_feature", "_UI_PreConditionsType_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType_OnErrorMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Fail feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnFailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PreConditionsType_onFail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType_onFail_feature", "_UI_PreConditionsType_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType_OnFail(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Fail Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnFailMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PreConditionsType_onFailMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType_onFailMessage_feature", "_UI_PreConditionsType_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType_OnFailMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Sql Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnSqlOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PreConditionsType_onSqlOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType_onSqlOutput_feature", "_UI_PreConditionsType_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType_OnSqlOutput(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group());
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
	 * This returns PreConditionsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PreConditionsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		OnChangeSetPreconditionErrorOrFail labelValue = ((PreConditionsType)object).getOnError();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PreConditionsType_type") :
			getString("_UI_PreConditionsType_type") + " " + label;
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

		switch (notification.getFeatureID(PreConditionsType.class)) {
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_ERROR_MESSAGE:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_FAIL_MESSAGE:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__ON_SQL_OUTPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE__GROUP:
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
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_And(),
					 DbchangelogFactory.eINSTANCE.createAndType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_Or(),
					 DbchangelogFactory.eINSTANCE.createOrType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_Not(),
					 DbchangelogFactory.eINSTANCE.createNotType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_Dbms(),
					 DbchangelogFactory.eINSTANCE.createDbmsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_RunningAs(),
					 DbchangelogFactory.eINSTANCE.createRunningAsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_ChangeSetExecuted(),
					 DbchangelogFactory.eINSTANCE.createChangeSetExecutedType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_TableExists(),
					 DbchangelogFactory.eINSTANCE.createTableExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_ColumnExists(),
					 DbchangelogFactory.eINSTANCE.createColumnExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_SequenceExists(),
					 DbchangelogFactory.eINSTANCE.createSequenceExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_ForeignKeyConstraintExists(),
					 DbchangelogFactory.eINSTANCE.createForeignKeyConstraintExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_IndexExists(),
					 DbchangelogFactory.eINSTANCE.createIndexExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_PrimaryKeyExists(),
					 DbchangelogFactory.eINSTANCE.createPrimaryKeyExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_ViewExists(),
					 DbchangelogFactory.eINSTANCE.createViewExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_TableIsEmpty(),
					 DbchangelogFactory.eINSTANCE.createTableIsEmptyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_RowCount(),
					 DbchangelogFactory.eINSTANCE.createRowCountType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_SqlCheck(),
					 DbchangelogFactory.eINSTANCE.createSqlCheckType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_ChangeLogPropertyDefined(),
					 DbchangelogFactory.eINSTANCE.createChangeLogPropertyDefinedType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_ExpectedQuotingStrategy(),
					 DbchangelogFactory.eINSTANCE.createExpectedQuotingStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType_CustomPrecondition(),
					 DbchangelogFactory.eINSTANCE.createCustomPreconditionType())));
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
