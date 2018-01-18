/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.Vertrag
import org.xtext.example.mydsl.myDsl.MyDslPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	
	
//	public static val INVALID_NAME = 'invalidName'
//  Hier ist fuer Constraints
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def Check(Vertrag vertrag) {
		if(vertrag.datenvolumen <= 0) {
			warning('Datenvolumen muss >= 0', MyDslPackage.Literals.VERTRAG__DATENVOLUMEN,'invalidName');
		}
	}
	
	
}
