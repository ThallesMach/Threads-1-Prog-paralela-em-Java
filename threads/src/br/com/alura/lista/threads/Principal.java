
package br.com.alura.lista.threads;

import java.util.List;
import java.util.Vector;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
//		List<String> lista = new ArrayList<>();	// 1 jeito
//		List<String> lista = Collections.synchronizedList(new ArrayList<String>() );  // 2 jeito
		
		List<String> lista = new Vector<>();	// 3 jeito
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(new TarefaAdicionaElemento(lista, i) ).start();
				
		}
		
		Thread.sleep(2000);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i) );
			
		}
	}

}
