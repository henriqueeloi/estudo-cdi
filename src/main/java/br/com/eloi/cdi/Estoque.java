package br.com.eloi.cdi;

import java.util.concurrent.TimeUnit;

import javax.enterprise.event.ObservesAsync;

public class Estoque {

	public void remove(@ObservesAsync CheckoutEvent event) throws InterruptedException {
		System.out.println("Removendo do Estoque " + event.getProduto());
		
		TimeUnit.SECONDS.sleep(4); //Simulando chamada de um WS
	}

}
