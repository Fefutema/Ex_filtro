package br.com.fiap.bean;

import java.time.LocalDateTime;

public class AcessoBean {

	private LocalDateTime primeiroAcesso;
	private LocalDateTime ultimoAcesso;
	public LocalDateTime getPrimeiroAcesso() {
		return primeiroAcesso;
	}
	public void setPrimeiroAcesso(LocalDateTime primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}
	public LocalDateTime getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	
}
