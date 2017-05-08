package br.com.eloi.cdi;

import javax.inject.Inject;

public class Pagamento {

	@Inject
	private MeuLogger logger;
	
	public void inicia() {
		logger.log("Iniciando pagamento");
	}
	
}
