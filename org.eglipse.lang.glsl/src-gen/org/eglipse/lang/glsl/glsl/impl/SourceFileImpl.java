/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eglipse.lang.glsl.glsl.FunctionDefinition;
import org.eglipse.lang.glsl.glsl.FunctionPrototype;
import org.eglipse.lang.glsl.glsl.GlslPackage;
import org.eglipse.lang.glsl.glsl.PrecompilerStatement;
import org.eglipse.lang.glsl.glsl.SourceFile;
import org.eglipse.lang.glsl.glsl.Symbol;
import org.eglipse.lang.glsl.glsl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl#getUniforms <em>Uniforms</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl#getAttribs <em>Attribs</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl#getPrototypes <em>Prototypes</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceFileImpl extends MinimalEObjectImpl.Container implements SourceFile
{
  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected EList<PrecompilerStatement> pre;

  /**
   * The cached value of the '{@link #getUniforms() <em>Uniforms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniforms()
   * @generated
   * @ordered
   */
  protected EList<Symbol> uniforms;

  /**
   * The cached value of the '{@link #getAttribs() <em>Attribs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribs()
   * @generated
   * @ordered
   */
  protected EList<Symbol> attribs;

  /**
   * The cached value of the '{@link #getPrototypes() <em>Prototypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrototypes()
   * @generated
   * @ordered
   */
  protected EList<FunctionPrototype> prototypes;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinition> functions;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SourceFileImpl()
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
    return GlslPackage.Literals.SOURCE_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PrecompilerStatement> getPre()
  {
    if (pre == null)
    {
      pre = new EObjectContainmentEList<PrecompilerStatement>(PrecompilerStatement.class, this, GlslPackage.SOURCE_FILE__PRE);
    }
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Symbol> getUniforms()
  {
    if (uniforms == null)
    {
      uniforms = new EObjectContainmentEList<Symbol>(Symbol.class, this, GlslPackage.SOURCE_FILE__UNIFORMS);
    }
    return uniforms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Symbol> getAttribs()
  {
    if (attribs == null)
    {
      attribs = new EObjectContainmentEList<Symbol>(Symbol.class, this, GlslPackage.SOURCE_FILE__ATTRIBS);
    }
    return attribs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionPrototype> getPrototypes()
  {
    if (prototypes == null)
    {
      prototypes = new EObjectContainmentEList<FunctionPrototype>(FunctionPrototype.class, this, GlslPackage.SOURCE_FILE__PROTOTYPES);
    }
    return prototypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDefinition> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<FunctionDefinition>(FunctionDefinition.class, this, GlslPackage.SOURCE_FILE__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, GlslPackage.SOURCE_FILE__VARIABLES);
    }
    return variables;
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
      case GlslPackage.SOURCE_FILE__PRE:
        return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
      case GlslPackage.SOURCE_FILE__UNIFORMS:
        return ((InternalEList<?>)getUniforms()).basicRemove(otherEnd, msgs);
      case GlslPackage.SOURCE_FILE__ATTRIBS:
        return ((InternalEList<?>)getAttribs()).basicRemove(otherEnd, msgs);
      case GlslPackage.SOURCE_FILE__PROTOTYPES:
        return ((InternalEList<?>)getPrototypes()).basicRemove(otherEnd, msgs);
      case GlslPackage.SOURCE_FILE__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case GlslPackage.SOURCE_FILE__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
      case GlslPackage.SOURCE_FILE__PRE:
        return getPre();
      case GlslPackage.SOURCE_FILE__UNIFORMS:
        return getUniforms();
      case GlslPackage.SOURCE_FILE__ATTRIBS:
        return getAttribs();
      case GlslPackage.SOURCE_FILE__PROTOTYPES:
        return getPrototypes();
      case GlslPackage.SOURCE_FILE__FUNCTIONS:
        return getFunctions();
      case GlslPackage.SOURCE_FILE__VARIABLES:
        return getVariables();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GlslPackage.SOURCE_FILE__PRE:
        getPre().clear();
        getPre().addAll((Collection<? extends PrecompilerStatement>)newValue);
        return;
      case GlslPackage.SOURCE_FILE__UNIFORMS:
        getUniforms().clear();
        getUniforms().addAll((Collection<? extends Symbol>)newValue);
        return;
      case GlslPackage.SOURCE_FILE__ATTRIBS:
        getAttribs().clear();
        getAttribs().addAll((Collection<? extends Symbol>)newValue);
        return;
      case GlslPackage.SOURCE_FILE__PROTOTYPES:
        getPrototypes().clear();
        getPrototypes().addAll((Collection<? extends FunctionPrototype>)newValue);
        return;
      case GlslPackage.SOURCE_FILE__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends FunctionDefinition>)newValue);
        return;
      case GlslPackage.SOURCE_FILE__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
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
      case GlslPackage.SOURCE_FILE__PRE:
        getPre().clear();
        return;
      case GlslPackage.SOURCE_FILE__UNIFORMS:
        getUniforms().clear();
        return;
      case GlslPackage.SOURCE_FILE__ATTRIBS:
        getAttribs().clear();
        return;
      case GlslPackage.SOURCE_FILE__PROTOTYPES:
        getPrototypes().clear();
        return;
      case GlslPackage.SOURCE_FILE__FUNCTIONS:
        getFunctions().clear();
        return;
      case GlslPackage.SOURCE_FILE__VARIABLES:
        getVariables().clear();
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
      case GlslPackage.SOURCE_FILE__PRE:
        return pre != null && !pre.isEmpty();
      case GlslPackage.SOURCE_FILE__UNIFORMS:
        return uniforms != null && !uniforms.isEmpty();
      case GlslPackage.SOURCE_FILE__ATTRIBS:
        return attribs != null && !attribs.isEmpty();
      case GlslPackage.SOURCE_FILE__PROTOTYPES:
        return prototypes != null && !prototypes.isEmpty();
      case GlslPackage.SOURCE_FILE__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case GlslPackage.SOURCE_FILE__VARIABLES:
        return variables != null && !variables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SourceFileImpl
