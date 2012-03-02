package at.caks.eglipse.lang.glsl.serializer;

import at.caks.eglipse.lang.glsl.services.GlslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractGlslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GlslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Atomic_LeftParenthesisKeyword_5_0_a;
	protected AbstractElementAlias match_Atomic_LeftParenthesisKeyword_5_0_p;
	protected AbstractElementAlias match_FunctionPrototype_VOIDTerminalRuleCall_3_0_q;
	protected AbstractElementAlias match_JumpStatement___BREAKTerminalRuleCall_1_0_SEMICOLONTerminalRuleCall_1_1___or___CONTINUETerminalRuleCall_0_0_SEMICOLONTerminalRuleCall_0_1___or___DISCARDTerminalRuleCall_4_0_SEMICOLONTerminalRuleCall_4_1__;
	protected AbstractElementAlias match_Statement___LeftParenthesisKeyword_4_2_0_RightParenthesisKeyword_4_2_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GlslGrammarAccess) access;
		match_Atomic_LeftParenthesisKeyword_5_0_a = new TokenAlias(true, true, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_0());
		match_Atomic_LeftParenthesisKeyword_5_0_p = new TokenAlias(true, false, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_0());
		match_FunctionPrototype_VOIDTerminalRuleCall_3_0_q = new TokenAlias(false, true, grammarAccess.getFunctionPrototypeAccess().getVOIDTerminalRuleCall_3_0());
		match_JumpStatement___BREAKTerminalRuleCall_1_0_SEMICOLONTerminalRuleCall_1_1___or___CONTINUETerminalRuleCall_0_0_SEMICOLONTerminalRuleCall_0_1___or___DISCARDTerminalRuleCall_4_0_SEMICOLONTerminalRuleCall_4_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJumpStatementAccess().getBREAKTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJumpStatementAccess().getCONTINUETerminalRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJumpStatementAccess().getDISCARDTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_4_1())));
		match_Statement___LeftParenthesisKeyword_4_2_0_RightParenthesisKeyword_4_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getRightParenthesisKeyword_4_2_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBREAKRule())
			return getBREAKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCASERule())
			return getCASEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCONTINUERule())
			return getCONTINUEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDEFAULTRule())
			return getDEFAULTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDISCARDRule())
			return getDISCARDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDORule())
			return getDOToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFORRule())
			return getFORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFT_BRACERule())
			return getLEFT_BRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQUESTIONRule())
			return getQUESTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRETURNRule())
			return getRETURNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHT_BRACERule())
			return getRIGHT_BRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSWITCHRule())
			return getSWITCHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVOIDRule())
			return getVOIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWHILERule())
			return getWHILEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getBREAKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "break";
	}
	protected String getCASEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "case";
	}
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	protected String getCONTINUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "continue";
	}
	protected String getDEFAULTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "default";
	}
	protected String getDISCARDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "discard";
	}
	protected String getDOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "do";
	}
	protected String getELSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	protected String getFORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "for";
	}
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	protected String getLEFT_BRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	protected String getQUESTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?";
	}
	protected String getRETURNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "return";
	}
	protected String getRIGHT_BRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	protected String getSWITCHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "switch";
	}
	protected String getVOIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "void";
	}
	protected String getWHILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "while";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Atomic_LeftParenthesisKeyword_5_0_a.equals(syntax))
				emit_Atomic_LeftParenthesisKeyword_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Atomic_LeftParenthesisKeyword_5_0_p.equals(syntax))
				emit_Atomic_LeftParenthesisKeyword_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionPrototype_VOIDTerminalRuleCall_3_0_q.equals(syntax))
				emit_FunctionPrototype_VOIDTerminalRuleCall_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JumpStatement___BREAKTerminalRuleCall_1_0_SEMICOLONTerminalRuleCall_1_1___or___CONTINUETerminalRuleCall_0_0_SEMICOLONTerminalRuleCall_0_1___or___DISCARDTerminalRuleCall_4_0_SEMICOLONTerminalRuleCall_4_1__.equals(syntax))
				emit_JumpStatement___BREAKTerminalRuleCall_1_0_SEMICOLONTerminalRuleCall_1_1___or___CONTINUETerminalRuleCall_0_0_SEMICOLONTerminalRuleCall_0_1___or___DISCARDTerminalRuleCall_4_0_SEMICOLONTerminalRuleCall_4_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Statement___LeftParenthesisKeyword_4_2_0_RightParenthesisKeyword_4_2_3__q.equals(syntax))
				emit_Statement___LeftParenthesisKeyword_4_2_0_RightParenthesisKeyword_4_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Atomic_LeftParenthesisKeyword_5_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Atomic_LeftParenthesisKeyword_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VOID?
	 */
	protected void emit_FunctionPrototype_VOIDTerminalRuleCall_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (DISCARD SEMICOLON) | (CONTINUE SEMICOLON) | (BREAK SEMICOLON)
	 */
	protected void emit_JumpStatement___BREAKTerminalRuleCall_1_0_SEMICOLONTerminalRuleCall_1_1___or___CONTINUETerminalRuleCall_0_0_SEMICOLONTerminalRuleCall_0_1___or___DISCARDTerminalRuleCall_4_0_SEMICOLONTerminalRuleCall_4_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Statement___LeftParenthesisKeyword_4_2_0_RightParenthesisKeyword_4_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
