/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.entity.EntityPackage;
import org.xtext.example.entity.expression;
import org.xtext.example.entity.expression_unity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression unity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.entity.impl.expression_unityImpl#getMenos <em>Menos</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.expression_unityImpl#getExpressao_un <em>Expressao un</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.expression_unityImpl#getAbre_paren <em>Abre paren</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.expression_unityImpl#getExpressao <em>Expressao</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.expression_unityImpl#getFecha_paren <em>Fecha paren</em>}</li>
 *   <li>{@link org.xtext.example.entity.impl.expression_unityImpl#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expression_unityImpl extends MinimalEObjectImpl.Container implements expression_unity
{
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
   * The cached value of the '{@link #getExpressao_un() <em>Expressao un</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressao_un()
   * @generated
   * @ordered
   */
  protected expression_unity expressao_un;

  /**
   * The default value of the '{@link #getAbre_paren() <em>Abre paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbre_paren()
   * @generated
   * @ordered
   */
  protected static final String ABRE_PAREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbre_paren() <em>Abre paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbre_paren()
   * @generated
   * @ordered
   */
  protected String abre_paren = ABRE_PAREN_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressao() <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressao()
   * @generated
   * @ordered
   */
  protected expression expressao;

  /**
   * The default value of the '{@link #getFecha_paren() <em>Fecha paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFecha_paren()
   * @generated
   * @ordered
   */
  protected static final String FECHA_PAREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFecha_paren() <em>Fecha paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFecha_paren()
   * @generated
   * @ordered
   */
  protected String fecha_paren = FECHA_PAREN_EDEFAULT;

  /**
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final int VALOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected int valor = VALOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expression_unityImpl()
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
    return EntityPackage.Literals.EXPRESSION_UNITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__MENOS, oldMenos, menos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_unity getExpressao_un()
  {
    return expressao_un;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressao_un(expression_unity newExpressao_un, NotificationChain msgs)
  {
    expression_unity oldExpressao_un = expressao_un;
    expressao_un = newExpressao_un;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN, oldExpressao_un, newExpressao_un);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressao_un(expression_unity newExpressao_un)
  {
    if (newExpressao_un != expressao_un)
    {
      NotificationChain msgs = null;
      if (expressao_un != null)
        msgs = ((InternalEObject)expressao_un).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN, null, msgs);
      if (newExpressao_un != null)
        msgs = ((InternalEObject)newExpressao_un).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN, null, msgs);
      msgs = basicSetExpressao_un(newExpressao_un, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN, newExpressao_un, newExpressao_un));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbre_paren()
  {
    return abre_paren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbre_paren(String newAbre_paren)
  {
    String oldAbre_paren = abre_paren;
    abre_paren = newAbre_paren;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__ABRE_PAREN, oldAbre_paren, abre_paren));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpressao()
  {
    return expressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressao(expression newExpressao, NotificationChain msgs)
  {
    expression oldExpressao = expressao;
    expressao = newExpressao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__EXPRESSAO, oldExpressao, newExpressao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressao(expression newExpressao)
  {
    if (newExpressao != expressao)
    {
      NotificationChain msgs = null;
      if (expressao != null)
        msgs = ((InternalEObject)expressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.EXPRESSION_UNITY__EXPRESSAO, null, msgs);
      if (newExpressao != null)
        msgs = ((InternalEObject)newExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.EXPRESSION_UNITY__EXPRESSAO, null, msgs);
      msgs = basicSetExpressao(newExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__EXPRESSAO, newExpressao, newExpressao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFecha_paren()
  {
    return fecha_paren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFecha_paren(String newFecha_paren)
  {
    String oldFecha_paren = fecha_paren;
    fecha_paren = newFecha_paren;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__FECHA_PAREN, oldFecha_paren, fecha_paren));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(int newValor)
  {
    int oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EXPRESSION_UNITY__VALOR, oldValor, valor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN:
        return basicSetExpressao_un(null, msgs);
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO:
        return basicSetExpressao(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EntityPackage.EXPRESSION_UNITY__MENOS:
        return getMenos();
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN:
        return getExpressao_un();
      case EntityPackage.EXPRESSION_UNITY__ABRE_PAREN:
        return getAbre_paren();
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO:
        return getExpressao();
      case EntityPackage.EXPRESSION_UNITY__FECHA_PAREN:
        return getFecha_paren();
      case EntityPackage.EXPRESSION_UNITY__VALOR:
        return getValor();
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
      case EntityPackage.EXPRESSION_UNITY__MENOS:
        setMenos((String)newValue);
        return;
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN:
        setExpressao_un((expression_unity)newValue);
        return;
      case EntityPackage.EXPRESSION_UNITY__ABRE_PAREN:
        setAbre_paren((String)newValue);
        return;
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO:
        setExpressao((expression)newValue);
        return;
      case EntityPackage.EXPRESSION_UNITY__FECHA_PAREN:
        setFecha_paren((String)newValue);
        return;
      case EntityPackage.EXPRESSION_UNITY__VALOR:
        setValor((Integer)newValue);
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
      case EntityPackage.EXPRESSION_UNITY__MENOS:
        setMenos(MENOS_EDEFAULT);
        return;
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN:
        setExpressao_un((expression_unity)null);
        return;
      case EntityPackage.EXPRESSION_UNITY__ABRE_PAREN:
        setAbre_paren(ABRE_PAREN_EDEFAULT);
        return;
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO:
        setExpressao((expression)null);
        return;
      case EntityPackage.EXPRESSION_UNITY__FECHA_PAREN:
        setFecha_paren(FECHA_PAREN_EDEFAULT);
        return;
      case EntityPackage.EXPRESSION_UNITY__VALOR:
        setValor(VALOR_EDEFAULT);
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
      case EntityPackage.EXPRESSION_UNITY__MENOS:
        return MENOS_EDEFAULT == null ? menos != null : !MENOS_EDEFAULT.equals(menos);
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO_UN:
        return expressao_un != null;
      case EntityPackage.EXPRESSION_UNITY__ABRE_PAREN:
        return ABRE_PAREN_EDEFAULT == null ? abre_paren != null : !ABRE_PAREN_EDEFAULT.equals(abre_paren);
      case EntityPackage.EXPRESSION_UNITY__EXPRESSAO:
        return expressao != null;
      case EntityPackage.EXPRESSION_UNITY__FECHA_PAREN:
        return FECHA_PAREN_EDEFAULT == null ? fecha_paren != null : !FECHA_PAREN_EDEFAULT.equals(fecha_paren);
      case EntityPackage.EXPRESSION_UNITY__VALOR:
        return valor != VALOR_EDEFAULT;
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
    result.append(" (menos: ");
    result.append(menos);
    result.append(", abre_paren: ");
    result.append(abre_paren);
    result.append(", fecha_paren: ");
    result.append(fecha_paren);
    result.append(", valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //expression_unityImpl
