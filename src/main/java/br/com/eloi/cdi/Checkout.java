package br.com.eloi.cdi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.enterprise.event.Event;
import javax.inject.Inject;

//Class que esta declarando o membro ou declaring class
public class Checkout {
		
	@Inject
	private Pagamento pagamento;

	@Inject //Ponto de injetcao - InjectionPoint
	private MeuLogger logger; //Membro a ser injetado
		
	@Inject
	private Event<CheckoutEvent> event;
	
	//AOP -> Interceptors
	@Auditavel
	public void finaliza() {
		logger.log("Finalizando Checkout");
		pagamento.inicia();
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		event.fireAsync(new CheckoutEvent("iPad"), executorService)
		.thenApply(new Function<CheckoutEvent, String>() {

			@Override
			public String apply(CheckoutEvent t) {
				return "Sucesso no " + t.getProduto();
			}
		})
		.thenAccept(new Consumer<String>() {

			@Override
			public void accept(String produto) {
				System.out.println("Eniando email com o produto " + produto);
			}
		});
	}
}
