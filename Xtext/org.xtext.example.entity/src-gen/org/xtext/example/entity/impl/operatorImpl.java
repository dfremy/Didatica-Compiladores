/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.entity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.entity.EntityPackage;
import org.xtext.example.entity.operator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.entity.impl.operatorImpl#getMais <em>Mais</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.operatorImpl#getMenos <em>Menos</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.operatorImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.operatorImpl#getDiv <em>Div</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class operatorImpl extends MinimalEObjectImpl.Container implements operator
{
  /**
   * The default value of the '{@link #getMais() <em>Mais</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMais()
   * @generated
   * @ordered
   */
  protected static final String MAIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMais() <em>Mais</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMais()
   * @generated
   * @ordered
   */
  protected String mais = MAIS_EDEFAULT;

  /**
   * The default value of the '{@link #getMenos() <em>Menos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenos()
   * @generated
   * @ordered
   */
  protected static final String MENOS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMenos() <em>Menos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenos()
   * @generated
   * @ordered
   */
  protected String menos = MENOS_EDEFAULT;

  /**
   * The default value of the '{@link #getMult() <em>Mult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMult()
   * @generated
   * @ordered
   */
  protected static final String MULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMult() <em>Mult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMult()
   * @generated
   * @ordered
   */
  protected String mult = MULT_EDEFAULT;

  /**
   * The default value of the '{@link #getDiv() <em>Div</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiv()
   * @generated
   * @ordered
   */
  protected static final String DIV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiv() <em>Div</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiv()
   * @generated
   * @ordered
   */
  protected String div = DIV_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected operatorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EntityPackage.Literals.OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMais()
  {
    return mais;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMais(String newMais)
  {
    String oldMais = mais;
    mais = newMais;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATOR__MAIS, oldMais, mais));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMenos()
  {
    return menos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenos(String newMenos)
  {
    String oldMenos = menos;
    menos = newMenos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATOR__MENOS, oldMenos, menos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMult()
  {
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMult(String newMult)
  {
    String oldMult = mult;
    mult = newMult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATOR__MULT, oldMult, mult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDiv()
  {
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiv(String newDiv)
  {
    String oldDiv = div;
    div = newDiv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.OPERATOR__DIV, oldDiv, div));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EntityPackage.OPERATOR__MAIS:
        return getMais();
      case EntityPackage.OPERATOR__MENOS:
        return getMenos();
      case EntityPackage.OPERATOR__MULT:
        return getMult();
      case EntityPackage.OPERATOR__DIV:
        return getDiv();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EntityPackage.OPERATOR__MAIS:
        setMais((String)newValue);
        return;
      case EntityPackage.OPERATOR__MENOS:
        setMenos((String)newValue);
        return;
      case EntityPackage.OPERATOR__MULT:
        setMult((String)newValue);
        return;
      case EntityPackage.OPERATOR__DIV:
        setDiv((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EntityPackage.OPERATOR__MAIS:
        setMais(MAIS_EDEFAULT);
        return;
      case EntityPackage.OPERATOR__MENOS:
        setMenos(MENOS_EDEFAULT);
        return;
      case EntityPackage.OPERATOR__MULT:
        setMult(MULT_EDEFAULT);
        return;
      case EntityPackage.OPERATOR__DIV:
        setDiv(DIV_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EntityPackage.OPERATOR__MAIS:
        return MAIS_EDEFAULT == null ? mais != null : !MAIS_EDEFAULT.equals(mais);
      case EntityPackage.OPERATOR__MENOS:
        return MENOS_EDEFAULT == null ? menos != null : !MENOS_EDEFAULT.equals(menos);
      case EntityPackage.OPERATOR__MULT:
        return MULT_EDEFAULT == null ? mult != null : !MULT_EDEFAULT.equals(mult);
      case EntityPackage.OPERATOR__DIV:
        return DIV_EDEFAULT == null ? div != null : !DIV_EDEFAULT.equals(div);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mais: ");
    result.append(mais);
    result.append(", menos: ");
    result.append(menos);
    result.append(", mult: ");
    result.append(mult);
    result.append(", div: ");
    result.append(div);
    result.append(')');
    return result.toString();
  }

} //operatorImpl