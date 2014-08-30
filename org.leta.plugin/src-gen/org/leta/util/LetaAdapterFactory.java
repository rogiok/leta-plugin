/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.leta.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.leta.LetaPackage
 * @generated
 */
public class LetaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LetaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LetaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LetaSwitch<Adapter> modelSwitch =
    new LetaSwitch<Adapter>()
    {
      @Override
      public Adapter caseLeta(Leta object)
      {
        return createLetaAdapter();
      }
      @Override
      public Adapter caseTestCase(TestCase object)
      {
        return createTestCaseAdapter();
      }
      @Override
      public Adapter caseVerifyClause(VerifyClause object)
      {
        return createVerifyClauseAdapter();
      }
      @Override
      public Adapter caseWhenClause(WhenClause object)
      {
        return createWhenClauseAdapter();
      }
      @Override
      public Adapter caseSetClause(SetClause object)
      {
        return createSetClauseAdapter();
      }
      @Override
      public Adapter caseFactComposite(FactComposite object)
      {
        return createFactCompositeAdapter();
      }
      @Override
      public Adapter caseFact(Fact object)
      {
        return createFactAdapter();
      }
      @Override
      public Adapter caseFactExt(FactExt object)
      {
        return createFactExtAdapter();
      }
      @Override
      public Adapter caseTermComposite(TermComposite object)
      {
        return createTermCompositeAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseTermInstance(TermInstance object)
      {
        return createTermInstanceAdapter();
      }
      @Override
      public Adapter caseTermWithAssociation(TermWithAssociation object)
      {
        return createTermWithAssociationAdapter();
      }
      @Override
      public Adapter caseQuantifier(Quantifier object)
      {
        return createQuantifierAdapter();
      }
      @Override
      public Adapter caseComplement(Complement object)
      {
        return createComplementAdapter();
      }
      @Override
      public Adapter caseFormula(Formula object)
      {
        return createFormulaAdapter();
      }
      @Override
      public Adapter caseFormulaExpression(FormulaExpression object)
      {
        return createFormulaExpressionAdapter();
      }
      @Override
      public Adapter caseFormulaItem(FormulaItem object)
      {
        return createFormulaItemAdapter();
      }
      @Override
      public Adapter caseMathOperator(MathOperator object)
      {
        return createMathOperatorAdapter();
      }
      @Override
      public Adapter caseRelationalOperator(RelationalOperator object)
      {
        return createRelationalOperatorAdapter();
      }
      @Override
      public Adapter caseNotEqualOperator(NotEqualOperator object)
      {
        return createNotEqualOperatorAdapter();
      }
      @Override
      public Adapter caseSet(Set object)
      {
        return createSetAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.leta.Leta <em>Leta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Leta
   * @generated
   */
  public Adapter createLetaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.TestCase <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.TestCase
   * @generated
   */
  public Adapter createTestCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.VerifyClause <em>Verify Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.VerifyClause
   * @generated
   */
  public Adapter createVerifyClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.WhenClause <em>When Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.WhenClause
   * @generated
   */
  public Adapter createWhenClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.SetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.SetClause
   * @generated
   */
  public Adapter createSetClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.FactComposite <em>Fact Composite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.FactComposite
   * @generated
   */
  public Adapter createFactCompositeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Fact
   * @generated
   */
  public Adapter createFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.FactExt <em>Fact Ext</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.FactExt
   * @generated
   */
  public Adapter createFactExtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.TermComposite <em>Term Composite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.TermComposite
   * @generated
   */
  public Adapter createTermCompositeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.TermInstance <em>Term Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.TermInstance
   * @generated
   */
  public Adapter createTermInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.TermWithAssociation <em>Term With Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.TermWithAssociation
   * @generated
   */
  public Adapter createTermWithAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Quantifier
   * @generated
   */
  public Adapter createQuantifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.Complement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Complement
   * @generated
   */
  public Adapter createComplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Formula
   * @generated
   */
  public Adapter createFormulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.FormulaExpression <em>Formula Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.FormulaExpression
   * @generated
   */
  public Adapter createFormulaExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.FormulaItem <em>Formula Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.FormulaItem
   * @generated
   */
  public Adapter createFormulaItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.MathOperator <em>Math Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.MathOperator
   * @generated
   */
  public Adapter createMathOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.RelationalOperator <em>Relational Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.RelationalOperator
   * @generated
   */
  public Adapter createRelationalOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.NotEqualOperator <em>Not Equal Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.NotEqualOperator
   * @generated
   */
  public Adapter createNotEqualOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.Set
   * @generated
   */
  public Adapter createSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.leta.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.leta.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LetaAdapterFactory
