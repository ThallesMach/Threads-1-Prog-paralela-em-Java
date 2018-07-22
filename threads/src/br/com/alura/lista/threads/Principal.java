
package br.com.alura.lista.threads;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
//		List<String> lista = new ArrayList<>();	// 1 jeito
//		List<String> lista = Collections.synchronizedList(new ArrayList<String>() );  // 2 jeito		
//		List<String> lista = new Vector<>();	// 3 jeito

		Lista lista = new Lista();	// 4 jeito
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionaElemento(lista, i) ).start();
		}
		
		new Thread(new TarefaImprimir(lista) ).start();
		
		
	}

}
