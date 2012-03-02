
package at.caks.eglipse.lang.glsl.interpreter;

import org.eclipse.emf.ecore.EObject;
import at.caks.eglipse.lang.glsl.glsl.*; 

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.AbstractExpressionEvaluator;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.logging.LogEntry;


public abstract class AbstractGlslExpressionEvaluator extends AbstractExpressionEvaluator {

	public AbstractGlslExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
	}

	public Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException {

		LogEntry localLog = parentLog.child(LogEntry.Kind.eval, expr, "evaluating "+expr.eClass().getName());

		
		if ( expr instanceof SymbolRef ) {
			return evalSymbolRef( (SymbolRef)expr, localLog );
		}
		
		if ( expr instanceof InlineIfExp ) {
			return evalInlineIfExp( (InlineIfExp)expr, localLog );
		}
		
		if ( expr instanceof LogicExp ) {
			return evalLogicExp( (LogicExp)expr, localLog );
		}
		
		if ( expr instanceof AddExp ) {
			return evalAddExp( (AddExp)expr, localLog );
		}
		
		if ( expr instanceof MulExp ) {
			return evalMulExp( (MulExp)expr, localLog );
		}
		
		if ( expr instanceof SymbolRefInvocation ) {
			return evalSymbolRefInvocation( (SymbolRefInvocation)expr, localLog );
		}
		
		if ( expr instanceof SymbolRefMember ) {
			return evalSymbolRefMember( (SymbolRefMember)expr, localLog );
		}
		
		if ( expr instanceof Constructor ) {
			return evalConstructor( (Constructor)expr, localLog );
		}
		
		if ( expr instanceof IntegerLiteral ) {
			return evalIntegerLiteral( (IntegerLiteral)expr, localLog );
		}
		
		if ( expr instanceof UIntegerLiteral ) {
			return evalUIntegerLiteral( (UIntegerLiteral)expr, localLog );
		}
		
		if ( expr instanceof FloatLiteral ) {
			return evalFloatLiteral( (FloatLiteral)expr, localLog );
		}
		
		if ( expr instanceof BoolLiteral ) {
			return evalBoolLiteral( (BoolLiteral)expr, localLog );
		}
		
		
		throw new InterpreterException(expr, "generated eval(...) method cannot handle type "+expr.eClass().getName());
	}

	
	
	protected Object evalSymbolRef( SymbolRef expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolRef not implemented");
	} 
	
	protected Object evalInlineIfExp( InlineIfExp expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalInlineIfExp not implemented");
	} 
	
	protected Object evalLogicExp( LogicExp expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalLogicExp not implemented");
	} 
	
	protected Object evalAddExp( AddExp expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalAddExp not implemented");
	} 
	
	protected Object evalMulExp( MulExp expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalMulExp not implemented");
	} 
	
	protected Object evalSymbolRefInvocation( SymbolRefInvocation expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolRefInvocation not implemented");
	} 
	
	protected Object evalSymbolRefMember( SymbolRefMember expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolRefMember not implemented");
	} 
	
	protected Object evalConstructor( Constructor expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalConstructor not implemented");
	} 
	
	protected Object evalIntegerLiteral( IntegerLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalIntegerLiteral not implemented");
	} 
	
	protected Object evalUIntegerLiteral( UIntegerLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalUIntegerLiteral not implemented");
	} 
	
	protected Object evalFloatLiteral( FloatLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalFloatLiteral not implemented");
	} 
	
	protected Object evalBoolLiteral( BoolLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalBoolLiteral not implemented");
	} 
	


}
