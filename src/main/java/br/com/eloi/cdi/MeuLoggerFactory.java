package br.com.eloi.cdi;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

// Ensinar CDI a injetar o MeuLogger
public class MeuLoggerFactory {

	@Produces
	public MeuLogger criaLogger(InjectionPoint ip){
		Class<?> classeDesejada = ip.getMember().getDeclaringClass();
		return new MeuLogger(classeDesejada);
	}
}
