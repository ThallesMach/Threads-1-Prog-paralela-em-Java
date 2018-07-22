package br.com.alura.banco;

public class TarefaAcessoBanco implements Runnable {

	private PoolDeConnexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessoBanco(PoolDeConnexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		
		synchronized (pool) {
			System.out.println("Peguei a chave do Pool ");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("Començando gerencia a tx");
				tx.begin();
				
			}
			
		}
		
		
	}

}
