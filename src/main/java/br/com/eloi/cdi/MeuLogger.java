package br.com.eloi.cdi;

public class MeuLogger {

	private Class<?> classeDesejada;

	public MeuLogger(Class<?> classeDesejada){
		this.classeDesejada = classeDesejada;
		
	}
	
	public void log(String mensagem) {
		String simpleName = classeDesejada.getSimpleName();
		System.out.println("Classe: " + simpleName + " - " + mensagem);
	}

}
