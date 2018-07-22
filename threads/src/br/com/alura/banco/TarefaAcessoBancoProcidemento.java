package br.com.alura.banco;

public class TarefaAcessoBancoProcidemento implements Runnable {

	private PoolDeConnexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessoBancoProcidemento(PoolDeConnexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Peguei a conexao");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("Começando a tx");
				tx.begin();
			}
		}

	}

}
