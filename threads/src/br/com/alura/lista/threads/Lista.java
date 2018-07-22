
package br.com.alura.lista.threads;


public class Lista {
	
	private String[] elementos = new String[1000];
	private int indice = 0;

	public 	synchronized void adicionaElementos(String elemento ) {
			this.elementos[indice] = elemento;
			this.indice++;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(this.indice == this.elementos.length) {
				System.out.println("Lista tá Cheia, Notificando");
				this.notify();
			}
	}
	
	
	
//	public void adicionaElementos(String elemento ) {
//		synchronized (this) {
//
//			this.elementos[indice] = elemento;
//			this.indice++;
//		}
//	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegaElmentos(int posicao) {
		return this.elementos[posicao];
	}


	public boolean estaCheia() {
		return this.indice == this.tamanho();
	}
	
	

}
