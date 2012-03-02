
package at.caks.eglipse.lang.glsl.interpreter;

import org.eclipse.emf.ecore.EObject;
import at.caks.eglipse.lang.glsl.glsl.*; 

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.AbstractStatementExecutor;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.logging.LogEntry;
import de.itemis.interpreter.AbstractExpressionEvaluator;


public abstract class AbstractGlslStatementExecutor extends AbstractStatementExecutor {

	public AbstractGlslStatementExecutor( ExecutionContext ctx ) {
		super(ctx);
	}

	public void execute( EObject statement, LogEntry parentLog ) throws InterpreterException {
		
		LogEntry localLog = log( statement, parentLog );
	
		
		if ( statement instanceof VariableDeclaration ) {
			executeVariableDeclaration( (VariableDeclaration)statement, localLog );
			return;
		}
		
		if ( statement instanceof SymbolRef ) {
			executeSymbolRef( (SymbolRef)statement, localLog );
			return;
		}
		
		if ( statement instanceof Return ) {
			executeReturn( (Return)statement, localLog );
			return;
		}
		
		if ( statement instanceof BlockStatement ) {
			executeBlockStatement( (BlockStatement)statement, localLog );
			return;
		}
		
		if ( statement instanceof JumpStatement ) {
			executeJumpStatement( (JumpStatement)statement, localLog );
			return;
		}
		
		if ( statement instanceof AssignmentStatement ) {
			executeAssignmentStatement( (AssignmentStatement)statement, localLog );
			return;
		}
		
		if ( statement instanceof IfStatement ) {
			executeIfStatement( (IfStatement)statement, localLog );
			return;
		}
		
		if ( statement instanceof WhileStatement ) {
			executeWhileStatement( (WhileStatement)statement, localLog );
			return;
		}
		
		if ( statement instanceof ForStatement ) {
			executeForStatement( (ForStatement)statement, localLog );
			return;
		}
		
		if ( statement instanceof SwitchStatement ) {
			executeSwitchStatement( (SwitchStatement)statement, localLog );
			return;
		}
		
		
		throw new InterpreterException(statement, "generated execute(...) method cannot handle type "+statement.eClass().getName());
		
	}

	
	
	protected void executeVariableDeclaration( VariableDeclaration s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeVariableDeclaration not implemented");
	} 
	
	protected void executeSymbolRef( SymbolRef s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeSymbolRef not implemented");
	} 
	
	protected void executeReturn( Return s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeReturn not implemented");
	} 
	
	protected void executeBlockStatement( BlockStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeBlockStatement not implemented");
	} 
	
	protected void executeJumpStatement( JumpStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeJumpStatement not implemented");
	} 
	
	protected void executeAssignmentStatement( AssignmentStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeAssignmentStatement not implemented");
	} 
	
	protected void executeIfStatement( IfStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeIfStatement not implemented");
	} 
	
	protected void executeWhileStatement( WhileStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeWhileStatement not implemented");
	} 
	
	protected void executeForStatement( ForStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeForStatement not implemented");
	} 
	
	protected void executeSwitchStatement( SwitchStatement s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeSwitchStatement not implemented");
	} 
	


}
