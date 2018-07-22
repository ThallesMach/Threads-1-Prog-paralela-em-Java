package br.com.alura.banco;

public class PrincipalBanco {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConnexao pool = new PoolDeConnexao();
        
        new Thread(new TarefaAcessoBanco(pool,tx) ).start();
        new Thread(new TarefaAcessoBancoProcidemento(pool,tx) ).start();


    }
}