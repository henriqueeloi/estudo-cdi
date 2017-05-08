package br.com.eloi.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Auditavel
public class Auditor {
	
	@AroundInvoke 
	public Object audita(InvocationContext ic) throws Exception{
		System.out.println("Auditando..."); //Executa antes do seu metodo
		
		 Object resultadoDoMetodo = ic.proceed(); //Executa seu metodo
		
		System.out.println("Fim da Auditoria"); //Depois do seu metodo
	
		return resultadoDoMetodo;
	}
}
