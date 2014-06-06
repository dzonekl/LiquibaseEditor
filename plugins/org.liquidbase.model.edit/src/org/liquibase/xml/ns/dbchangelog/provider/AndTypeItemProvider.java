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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.liquibase.xml.ns.dbchangelog.AndType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.AndType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AndTypeItemProvider
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
	public AndTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getAndType_Group());
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
	 * This returns AndType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AndType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AndType_type");
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

		switch (notification.getFeatureID(AndType.class)) {
			case DbchangelogPackage.AND_TYPE__GROUP:
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
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_And(),
					 DbchangelogFactory.eINSTANCE.createAndType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_Or(),
					 DbchangelogFactory.eINSTANCE.createOrType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_Not(),
					 DbchangelogFactory.eINSTANCE.createNotType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_Dbms(),
					 DbchangelogFactory.eINSTANCE.createDbmsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_RunningAs(),
					 DbchangelogFactory.eINSTANCE.createRunningAsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_ChangeSetExecuted(),
					 DbchangelogFactory.eINSTANCE.createChangeSetExecutedType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_TableExists(),
					 DbchangelogFactory.eINSTANCE.createTableExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_ColumnExists(),
					 DbchangelogFactory.eINSTANCE.createColumnExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_SequenceExists(),
					 DbchangelogFactory.eINSTANCE.createSequenceExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_ForeignKeyConstraintExists(),
					 DbchangelogFactory.eINSTANCE.createForeignKeyConstraintExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_IndexExists(),
					 DbchangelogFactory.eINSTANCE.createIndexExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_PrimaryKeyExists(),
					 DbchangelogFactory.eINSTANCE.createPrimaryKeyExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_ViewExists(),
					 DbchangelogFactory.eINSTANCE.createViewExistsType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_TableIsEmpty(),
					 DbchangelogFactory.eINSTANCE.createTableIsEmptyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_RowCount(),
					 DbchangelogFactory.eINSTANCE.createRowCountType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_SqlCheck(),
					 DbchangelogFactory.eINSTANCE.createSqlCheckType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_ChangeLogPropertyDefined(),
					 DbchangelogFactory.eINSTANCE.createChangeLogPropertyDefinedType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_ExpectedQuotingStrategy(),
					 DbchangelogFactory.eINSTANCE.createExpectedQuotingStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getAndType_Group(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getAndType_CustomPrecondition(),
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
