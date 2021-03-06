/*
* generated by Xtext
*/
package org.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.services.LetaGrammarAccess;

public class LetaParser extends AbstractContentAssistParser {
	
	@Inject
	private LetaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ui.contentassist.antlr.internal.InternalLetaParser createParser() {
		org.ui.contentassist.antlr.internal.InternalLetaParser result = new org.ui.contentassist.antlr.internal.InternalLetaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFactCompositeAccess().getAlternatives(), "rule__FactComposite__Alternatives");
					put(grammarAccess.getFactCompositeAccess().getAlternatives_0_0(), "rule__FactComposite__Alternatives_0_0");
					put(grammarAccess.getLogicalOperatorAccess().getAlternatives(), "rule__LogicalOperator__Alternatives");
					put(grammarAccess.getTermCompositeAccess().getAlternatives_1(), "rule__TermComposite__Alternatives_1");
					put(grammarAccess.getTermInstanceAccess().getAlternatives(), "rule__TermInstance__Alternatives");
					put(grammarAccess.getQuantifierAccess().getAlternatives(), "rule__Quantifier__Alternatives");
					put(grammarAccess.getFormulaExpressionAccess().getAlternatives(), "rule__FormulaExpression__Alternatives");
					put(grammarAccess.getFormulaItemAccess().getAlternatives(), "rule__FormulaItem__Alternatives");
					put(grammarAccess.getMathOperatorAccess().getAlternatives(), "rule__MathOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getListAccess().getAlternatives_0(), "rule__List__Alternatives_0");
					put(grammarAccess.getStringLiteralAccess().getAlternatives(), "rule__StringLiteral__Alternatives");
					put(grammarAccess.getOtherLiteralAccess().getAlternatives(), "rule__OtherLiteral__Alternatives");
					put(grammarAccess.getLetaAccess().getGroup(), "rule__Leta__Group__0");
					put(grammarAccess.getTestCaseAccess().getGroup(), "rule__TestCase__Group__0");
					put(grammarAccess.getVerifyClauseAccess().getGroup(), "rule__VerifyClause__Group__0");
					put(grammarAccess.getWhenClauseAccess().getGroup(), "rule__WhenClause__Group__0");
					put(grammarAccess.getSetClauseAccess().getGroup(), "rule__SetClause__Group__0");
					put(grammarAccess.getFactCompositeAccess().getGroup_0(), "rule__FactComposite__Group_0__0");
					put(grammarAccess.getFactCompositeAccess().getGroup_0_1(), "rule__FactComposite__Group_0_1__0");
					put(grammarAccess.getFactCompositeAccess().getGroup_1(), "rule__FactComposite__Group_1__0");
					put(grammarAccess.getFactCompositeAccess().getGroup_1_3(), "rule__FactComposite__Group_1_3__0");
					put(grammarAccess.getFactAccess().getGroup(), "rule__Fact__Group__0");
					put(grammarAccess.getFactAccess().getGroup_2(), "rule__Fact__Group_2__0");
					put(grammarAccess.getFactExtAccess().getGroup(), "rule__FactExt__Group__0");
					put(grammarAccess.getFactExtAccess().getGroup_1(), "rule__FactExt__Group_1__0");
					put(grammarAccess.getTermCompositeAccess().getGroup(), "rule__TermComposite__Group__0");
					put(grammarAccess.getTermInstanceAccess().getGroup_0(), "rule__TermInstance__Group_0__0");
					put(grammarAccess.getTermInstanceAccess().getGroup_1(), "rule__TermInstance__Group_1__0");
					put(grammarAccess.getTermWithAssociationAccess().getGroup(), "rule__TermWithAssociation__Group__0");
					put(grammarAccess.getQuantifierAccess().getGroup_0(), "rule__Quantifier__Group_0__0");
					put(grammarAccess.getQuantifierAccess().getGroup_1(), "rule__Quantifier__Group_1__0");
					put(grammarAccess.getQuantifierAccess().getGroup_2(), "rule__Quantifier__Group_2__0");
					put(grammarAccess.getQuantifierAccess().getGroup_3(), "rule__Quantifier__Group_3__0");
					put(grammarAccess.getFormulaAccess().getGroup(), "rule__Formula__Group__0");
					put(grammarAccess.getFormulaExpressionAccess().getGroup_0(), "rule__FormulaExpression__Group_0__0");
					put(grammarAccess.getFormulaExpressionAccess().getGroup_0_1(), "rule__FormulaExpression__Group_0_1__0");
					put(grammarAccess.getFormulaExpressionAccess().getGroup_1(), "rule__FormulaExpression__Group_1__0");
					put(grammarAccess.getFormulaExpressionAccess().getGroup_1_3(), "rule__FormulaExpression__Group_1_3__0");
					put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
					put(grammarAccess.getSetAccess().getGroup_3(), "rule__Set__Group_3__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getListAccess().getGroup_1(), "rule__List__Group_1__0");
					put(grammarAccess.getTestPackageAccess().getGroup(), "rule__TestPackage__Group__0");
					put(grammarAccess.getTestPackageAccess().getGroup_2(), "rule__TestPackage__Group_2__0");
					put(grammarAccess.getLetaAccess().getTpAssignment_0(), "rule__Leta__TpAssignment_0");
					put(grammarAccess.getLetaAccess().getTcAssignment_1(), "rule__Leta__TcAssignment_1");
					put(grammarAccess.getTestCaseAccess().getIdAssignment_1(), "rule__TestCase__IdAssignment_1");
					put(grammarAccess.getTestCaseAccess().getVAssignment_2(), "rule__TestCase__VAssignment_2");
					put(grammarAccess.getTestCaseAccess().getWAssignment_3(), "rule__TestCase__WAssignment_3");
					put(grammarAccess.getTestCaseAccess().getSAssignment_4(), "rule__TestCase__SAssignment_4");
					put(grammarAccess.getVerifyClauseAccess().getFcAssignment_1(), "rule__VerifyClause__FcAssignment_1");
					put(grammarAccess.getWhenClauseAccess().getFcAssignment_1(), "rule__WhenClause__FcAssignment_1");
					put(grammarAccess.getSetClauseAccess().getSAssignment_3(), "rule__SetClause__SAssignment_3");
					put(grammarAccess.getFactCompositeAccess().getFAssignment_0_0_0(), "rule__FactComposite__FAssignment_0_0_0");
					put(grammarAccess.getFactCompositeAccess().getFoAssignment_0_0_1(), "rule__FactComposite__FoAssignment_0_0_1");
					put(grammarAccess.getFactCompositeAccess().getOpAssignment_0_1_0(), "rule__FactComposite__OpAssignment_0_1_0");
					put(grammarAccess.getFactCompositeAccess().getFcAssignment_0_1_1(), "rule__FactComposite__FcAssignment_0_1_1");
					put(grammarAccess.getFactCompositeAccess().getFc1Assignment_1_1(), "rule__FactComposite__Fc1Assignment_1_1");
					put(grammarAccess.getFactCompositeAccess().getOpAssignment_1_3_0(), "rule__FactComposite__OpAssignment_1_3_0");
					put(grammarAccess.getFactCompositeAccess().getFc2Assignment_1_3_1(), "rule__FactComposite__Fc2Assignment_1_3_1");
					put(grammarAccess.getFactAccess().getTermCompositeAssignment_0(), "rule__Fact__TermCompositeAssignment_0");
					put(grammarAccess.getFactAccess().getComplementAssignment_1(), "rule__Fact__ComplementAssignment_1");
					put(grammarAccess.getFactAccess().getTermComposite2Assignment_2_0(), "rule__Fact__TermComposite2Assignment_2_0");
					put(grammarAccess.getFactAccess().getFactExtAssignment_2_1(), "rule__Fact__FactExtAssignment_2_1");
					put(grammarAccess.getFactExtAccess().getComplementAssignment_0(), "rule__FactExt__ComplementAssignment_0");
					put(grammarAccess.getFactExtAccess().getTermCompositeAssignment_1_0(), "rule__FactExt__TermCompositeAssignment_1_0");
					put(grammarAccess.getFactExtAccess().getFactExtAssignment_1_1(), "rule__FactExt__FactExtAssignment_1_1");
					put(grammarAccess.getTermCompositeAccess().getQuantifierAssignment_0(), "rule__TermComposite__QuantifierAssignment_0");
					put(grammarAccess.getTermCompositeAccess().getTermAssignment_1_0(), "rule__TermComposite__TermAssignment_1_0");
					put(grammarAccess.getTermCompositeAccess().getTermInstanceAssignment_1_1(), "rule__TermComposite__TermInstanceAssignment_1_1");
					put(grammarAccess.getTermCompositeAccess().getTermWithAssociationAssignment_1_2(), "rule__TermComposite__TermWithAssociationAssignment_1_2");
					put(grammarAccess.getTermAccess().getIdAssignment(), "rule__Term__IdAssignment");
					put(grammarAccess.getTermInstanceAccess().getTermAssignment_0_0(), "rule__TermInstance__TermAssignment_0_0");
					put(grammarAccess.getTermInstanceAccess().getNotEqualOperatorAssignment_0_1(), "rule__TermInstance__NotEqualOperatorAssignment_0_1");
					put(grammarAccess.getTermInstanceAccess().getStringLiteralAssignment_0_2(), "rule__TermInstance__StringLiteralAssignment_0_2");
					put(grammarAccess.getTermInstanceAccess().getTermAssignment_1_0(), "rule__TermInstance__TermAssignment_1_0");
					put(grammarAccess.getTermInstanceAccess().getRelationalOperatorAssignment_1_1(), "rule__TermInstance__RelationalOperatorAssignment_1_1");
					put(grammarAccess.getTermInstanceAccess().getOtherLiteralAssignment_1_2(), "rule__TermInstance__OtherLiteralAssignment_1_2");
					put(grammarAccess.getTermWithAssociationAccess().getTAssignment_0(), "rule__TermWithAssociation__TAssignment_0");
					put(grammarAccess.getTermWithAssociationAccess().getRoAssignment_1(), "rule__TermWithAssociation__RoAssignment_1");
					put(grammarAccess.getTermWithAssociationAccess().getIndexAssignment_3(), "rule__TermWithAssociation__IndexAssignment_3");
					put(grammarAccess.getQuantifierAccess().getVAssignment_0_1(), "rule__Quantifier__VAssignment_0_1");
					put(grammarAccess.getQuantifierAccess().getVAssignment_1_1(), "rule__Quantifier__VAssignment_1_1");
					put(grammarAccess.getQuantifierAccess().getVAssignment_2_1(), "rule__Quantifier__VAssignment_2_1");
					put(grammarAccess.getQuantifierAccess().getV1Assignment_3_1(), "rule__Quantifier__V1Assignment_3_1");
					put(grammarAccess.getQuantifierAccess().getV2Assignment_3_2(), "rule__Quantifier__V2Assignment_3_2");
					put(grammarAccess.getComplementAccess().getIdAssignment(), "rule__Complement__IdAssignment");
					put(grammarAccess.getFormulaAccess().getFiAssignment_0(), "rule__Formula__FiAssignment_0");
					put(grammarAccess.getFormulaAccess().getFeAssignment_2(), "rule__Formula__FeAssignment_2");
					put(grammarAccess.getFormulaExpressionAccess().getFiAssignment_0_0(), "rule__FormulaExpression__FiAssignment_0_0");
					put(grammarAccess.getFormulaExpressionAccess().getMoAssignment_0_1_0(), "rule__FormulaExpression__MoAssignment_0_1_0");
					put(grammarAccess.getFormulaExpressionAccess().getFeAssignment_0_1_1(), "rule__FormulaExpression__FeAssignment_0_1_1");
					put(grammarAccess.getFormulaExpressionAccess().getFe1Assignment_1_1(), "rule__FormulaExpression__Fe1Assignment_1_1");
					put(grammarAccess.getFormulaExpressionAccess().getMoAssignment_1_3_0(), "rule__FormulaExpression__MoAssignment_1_3_0");
					put(grammarAccess.getFormulaExpressionAccess().getFe2Assignment_1_3_1(), "rule__FormulaExpression__Fe2Assignment_1_3_1");
					put(grammarAccess.getFormulaItemAccess().getTAssignment_0(), "rule__FormulaItem__TAssignment_0");
					put(grammarAccess.getFormulaItemAccess().getTiAssignment_1(), "rule__FormulaItem__TiAssignment_1");
					put(grammarAccess.getFormulaItemAccess().getTwaAssignment_2(), "rule__FormulaItem__TwaAssignment_2");
					put(grammarAccess.getMathOperatorAccess().getSumAssignment_0(), "rule__MathOperator__SumAssignment_0");
					put(grammarAccess.getMathOperatorAccess().getSubtractAssignment_1(), "rule__MathOperator__SubtractAssignment_1");
					put(grammarAccess.getMathOperatorAccess().getDivideAssignment_2(), "rule__MathOperator__DivideAssignment_2");
					put(grammarAccess.getMathOperatorAccess().getMultiplyAssignment_3(), "rule__MathOperator__MultiplyAssignment_3");
					put(grammarAccess.getMathOperatorAccess().getRAssignment_4(), "rule__MathOperator__RAssignment_4");
					put(grammarAccess.getMathOperatorAccess().getPAssignment_5(), "rule__MathOperator__PAssignment_5");
					put(grammarAccess.getRelationalOperatorAccess().getOAssignment_0(), "rule__RelationalOperator__OAssignment_0");
					put(grammarAccess.getRelationalOperatorAccess().getOAssignment_1(), "rule__RelationalOperator__OAssignment_1");
					put(grammarAccess.getRelationalOperatorAccess().getOAssignment_2(), "rule__RelationalOperator__OAssignment_2");
					put(grammarAccess.getRelationalOperatorAccess().getOAssignment_3(), "rule__RelationalOperator__OAssignment_3");
					put(grammarAccess.getRelationalOperatorAccess().getNeoAssignment_4(), "rule__RelationalOperator__NeoAssignment_4");
					put(grammarAccess.getNotEqualOperatorAccess().getNeAssignment(), "rule__NotEqualOperator__NeAssignment");
					put(grammarAccess.getSetAccess().getLAssignment_1(), "rule__Set__LAssignment_1");
					put(grammarAccess.getSetAccess().getSAssignment_3_1(), "rule__Set__SAssignment_3_1");
					put(grammarAccess.getListAccess().getSlAssignment_0_0(), "rule__List__SlAssignment_0_0");
					put(grammarAccess.getListAccess().getOlAssignment_0_1(), "rule__List__OlAssignment_0_1");
					put(grammarAccess.getListAccess().getLAssignment_1_1(), "rule__List__LAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ui.contentassist.antlr.internal.InternalLetaParser typedParser = (org.ui.contentassist.antlr.internal.InternalLetaParser) parser;
			typedParser.entryRuleLeta();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LetaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LetaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
