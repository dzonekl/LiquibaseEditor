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
import org.liquibase.xml.ns.dbchangelog.OnChangeLogPreconditionErrorOrFail;
import org.liquibase.xml.ns.dbchangelog.PreConditionsType1;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.PreConditionsType1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PreConditionsType1ItemProvider
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
	public PreConditionsType1ItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_PreConditionsType1_onError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType1_onError_feature", "_UI_PreConditionsType1_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType1_OnError(),
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
				 getString("_UI_PreConditionsType1_onErrorMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType1_onErrorMessage_feature", "_UI_PreConditionsType1_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType1_OnErrorMessage(),
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
				 getString("_UI_PreConditionsType1_onFail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType1_onFail_feature", "_UI_PreConditionsType1_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType1_OnFail(),
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
				 getString("_UI_PreConditionsType1_onFailMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType1_onFailMessage_feature", "_UI_PreConditionsType1_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType1_OnFailMessage(),
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
				 getString("_UI_PreConditionsType1_onSqlOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PreConditionsType1_onSqlOutput_feature", "_UI_PreConditionsType1_type"),
				 DbchangelogPackage.eINSTANCE.getPreConditionsType1_OnSqlOutput(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group());
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
	 * This returns PreConditionsType1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PreConditionsType1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		OnChangeLogPreconditionErrorOrFail labelValue = ((PreConditionsType1)object).getOnError();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PreConditionsType1_type") :
			getString("_UI_PreConditionsType1_type") + " " + label;
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

		switch (notification.getFeatureID(PreConditionsType1.class)) {
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1__ON_ERROR:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1__ON_ERROR_MESSAGE:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1__ON_FAIL:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1__ON_FAIL_MESSAGE:
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1__ON_SQL_OUTPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.PRE_CONDITIONS_TYPE1__GROUP:
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
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_And(),
					 DbchangelogFactory.eINSTANCE.createAndType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Or(),
					 DbchangelogFactory.eINSTANCE.createOrType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Not(),
					 DbchangelogFactory.eINSTANCE.createNotType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Dbms(),
					 DbchangelogFactory.eINSTANCE.createDbmsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_RunningAs(),
					 DbchangelogFactory.eINSTANCE.createRunningAsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_ChangeSetExecuted(),
					 DbchangelogFactory.eINSTANCE.createChangeSetExecutedType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_TableExists(),
					 DbchangelogFactory.eINSTANCE.createTableExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_ColumnExists(),
					 DbchangelogFactory.eINSTANCE.createColumnExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_SequenceExists(),
					 DbchangelogFactory.eINSTANCE.createSequenceExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_ForeignKeyConstraintExists(),
					 DbchangelogFactory.eINSTANCE.createForeignKeyConstraintExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_IndexExists(),
					 DbchangelogFactory.eINSTANCE.createIndexExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_PrimaryKeyExists(),
					 DbchangelogFactory.eINSTANCE.createPrimaryKeyExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_ViewExists(),
					 DbchangelogFactory.eINSTANCE.createViewExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_TableIsEmpty(),
					 DbchangelogFactory.eINSTANCE.createTableIsEmptyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_RowCount(),
					 DbchangelogFactory.eINSTANCE.createRowCountType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_SqlCheck(),
					 DbchangelogFactory.eINSTANCE.createSqlCheckType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_ChangeLogPropertyDefined(),
					 DbchangelogFactory.eINSTANCE.createChangeLogPropertyDefinedType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_ExpectedQuotingStrategy(),
					 DbchangelogFactory.eINSTANCE.createExpectedQuotingStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getPreConditionsType1_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getPreConditionsType1_CustomPrecondition(),
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
