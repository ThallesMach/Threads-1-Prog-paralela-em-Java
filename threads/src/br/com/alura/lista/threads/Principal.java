
package br.com.alura.lista.threads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
//		List<String> lista = new ArrayList<>();
		List<String> lista = Collections.synchronizedList(new ArrayList<String>() );
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(new TarefaAdicionaElemento(lista, i) ).start();
				
		}
		
		Thread.sleep(2000);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i) );
			
		}
	}

}
