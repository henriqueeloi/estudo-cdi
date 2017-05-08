package br.com.eloi.cdi;

public class CheckoutEvent {
	
	private String produto;
	
	public CheckoutEvent(String produto) {
		this.produto = produto;
	}
	
	public String getProduto() {
		return produto;
	}
}
