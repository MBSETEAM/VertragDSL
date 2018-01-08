/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vertrag#getMindestvertragslaufzeit <em>Mindestvertragslaufzeit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vertrag#getDatenvolumen <em>Datenvolumen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vertrag#getMonatl_kosten <em>Monatl kosten</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vertrag#getNetzanbieter <em>Netzanbieter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vertrag#getInternetseite <em>Internetseite</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVertrag()
 * @model
 * @generated
 */
public interface Vertrag extends Element
{
  /**
   * Returns the value of the '<em><b>Mindestvertragslaufzeit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mindestvertragslaufzeit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mindestvertragslaufzeit</em>' attribute.
   * @see #setMindestvertragslaufzeit(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVertrag_Mindestvertragslaufzeit()
   * @model
   * @generated
   */
  int getMindestvertragslaufzeit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Vertrag#getMindestvertragslaufzeit <em>Mindestvertragslaufzeit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mindestvertragslaufzeit</em>' attribute.
   * @see #getMindestvertragslaufzeit()
   * @generated
   */
  void setMindestvertragslaufzeit(int value);

  /**
   * Returns the value of the '<em><b>Datenvolumen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datenvolumen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datenvolumen</em>' attribute.
   * @see #setDatenvolumen(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVertrag_Datenvolumen()
   * @model
   * @generated
   */
  int getDatenvolumen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Vertrag#getDatenvolumen <em>Datenvolumen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datenvolumen</em>' attribute.
   * @see #getDatenvolumen()
   * @generated
   */
  void setDatenvolumen(int value);

  /**
   * Returns the value of the '<em><b>Monatl kosten</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monatl kosten</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monatl kosten</em>' attribute.
   * @see #setMonatl_kosten(float)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVertrag_Monatl_kosten()
   * @model
   * @generated
   */
  float getMonatl_kosten();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Vertrag#getMonatl_kosten <em>Monatl kosten</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monatl kosten</em>' attribute.
   * @see #getMonatl_kosten()
   * @generated
   */
  void setMonatl_kosten(float value);

  /**
   * Returns the value of the '<em><b>Netzanbieter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Netzanbieter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Netzanbieter</em>' attribute.
   * @see #setNetzanbieter(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVertrag_Netzanbieter()
   * @model
   * @generated
   */
  String getNetzanbieter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Vertrag#getNetzanbieter <em>Netzanbieter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Netzanbieter</em>' attribute.
   * @see #getNetzanbieter()
   * @generated
   */
  void setNetzanbieter(String value);

  /**
   * Returns the value of the '<em><b>Internetseite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internetseite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internetseite</em>' attribute.
   * @see #setInternetseite(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVertrag_Internetseite()
   * @model
   * @generated
   */
  String getInternetseite();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Vertrag#getInternetseite <em>Internetseite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internetseite</em>' attribute.
   * @see #getInternetseite()
   * @generated
   */
  void setInternetseite(String value);

} // Vertrag
