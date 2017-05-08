package br.com.eloi.cdi;

import java.util.concurrent.TimeUnit;

import javax.enterprise.event.ObservesAsync;

public class NotaFiscal {

	public void gera(@ObservesAsync CheckoutEvent event) throws InterruptedException {
		System.out.println("Gerando nota fiscal na Thread: " + Thread.currentThread().getName());
		
		TimeUnit.SECONDS.sleep(4); //Simulando chamada outro sistema
	}

}
