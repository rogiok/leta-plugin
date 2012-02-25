package org.validation;

import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.xtext.validation.Check;
import org.leta.Fact;
import org.leta.FactExt;
import org.leta.LetaPackage;
import org.leta.TermComposite;
import org.leta.TermInstance;
import org.leta.VerifyClause;
import org.leta.factComposite;

public class LetaJavaValidator extends AbstractLetaJavaValidator {
    
    public final static String INCOMPLETE_FACT = "Incomplete fact";
    public final static String INCOMPLETE_TERM_COMPOSITE = "INCOMPLETE_TERM_COMPOSITE";

    // @Check
    // public void checkGreetingStartsWithCapital(Greeting greeting) {
    // if (!Character.isUpperCase(greeting.getName().charAt(0))) {
    // warning("Name should start with a capital",
    // MyDslPackage.Literals.GREETING__NAME);
    // }
    // }

    @Check
    public void checkGreetingStartsWithCapital(Fact fact) {
	
//	if (fact.getTermComposite() == null) {
//	    error("The term, or operator or literal is incorrect.", LetaPackage.Literals.FACT__TERM_COMPOSITE, 1, INCOMPLETE_TERM_COMPOSITE, "10");   
//	}

//	if (fact.getTermComposite2() == null) {
//	    error("The term, or operator or literal is incorrect.", LetaPackage.Literals.FACT__TERM_COMPOSITE2, 1, INCOMPLETE_TERM_COMPOSITE, "10");   
//	}

//	if (fact.getC() == null) {
//	    warning("Name should start with a capital", LetaPackage.Literals.FACT__C, 10);
//	}
	
	System.out.println("Fact");
    }

    @Check
    public void checkFactExt(FactExt factExt) {
	
	System.out.println("FactExt");
	
	if (factExt.getTermComposite() == null) {
	    error("The term is incorrect.", LetaPackage.Literals.FACT_EXT__TERM_COMPOSITE, 1, INCOMPLETE_TERM_COMPOSITE, "10");   
	}
    }

    @Check
    public void checkFactComposite(factComposite fact) {
    }

    @Check
    public void checkVerify(VerifyClause verify) {
	if (verify.getFc() == null) {
	    error("Incomplete fact, verify it has a term and complement, or remove invalid characters.", LetaPackage.Literals.VERIFY_CLAUSE__FC, 1, INCOMPLETE_FACT, "10");
	}
    }

    @Check
    public void checkTermInstance(TermInstance termInstance) {
    }

    @Check
    public void checkTermComposite(TermComposite termComposite) {
//	if (termComposite.getTermInstance() == null) {
//	     error("The term, or operator or literal is incorrect.", LetaPackage.Literals.TERM_COMPOSITE__TERM_INSTANCE, 1, INCOMPLETE_TERM_COMPOSITE, "10");
//	}
    }

    public static class Feature extends EStructuralFeatureImpl {

	public Feature(String name) {
	    super();
	    
	    this.setName(name);
	}

    }

}
