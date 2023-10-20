package JUnitBahia;

import java.util.ArrayList;
import java.util.List;

public class ECBahia {
    private String nome;
    private List<Jogador> jogadores;
    private List<Treinador> treinador_principal;
    private int proximaId;
    
    public ECBahia(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.treinador_principal = new ArrayList<>();
        this.proximaId = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Treinador> getTreinador() {
        return treinador_principal;
    }
   
    public List<Jogador> getJogadores() {
        return jogadores;
    }
    public void adicionarTreinador(Treinador treinador) {
    	treinador_principal.add(treinador);
    }

    public void removerTreinador(Treinador treinador) {
    	treinador_principal.remove(treinador);
    }

    public void adicionarJogador(Jogador jogador) {
    	jogador.setId(proximaId);
    	jogadores.add(jogador);
    	proximaId++;
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }
    public void pagarSalarios() {
        for (Jogador jogador : jogadores) {
            System.out.println("Salário pago para " + jogador.getNome() + " no valor de R$" + jogador.getSalario());
        }

        for (Treinador treinador : treinador_principal) {
            System.out.println("Salário pago para o treinador " + treinador.getNome() + " no valor de R$" + treinador.getSalario());
        }
    }

    public void listarPlantel() {
        System.out.println("Plantel do time " + nome + ":");
        System.out.println("Treinador:");
        for (Treinador treinador : treinador_principal) {
            System.out.println(treinador);
        }
        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }


    public static void main(String[] args) {
    	ECBahia meuTime = new ECBahia("EC Bahia");

        Jogador jogador1 = new Jogador("Cauly Oliveira",null, 8,"Titular", 500000, 28, "Brasil" +" / " + "Alemanha","Meia Ofensivo");
        Jogador jogador2 = new Jogador("Ademir da Silva","Fumacinha", 7,"Titular", 300000, 28, "Brasil", "Ponta Direita");
        Jogador jogador3 = new Jogador("Gabriel Teixeira", "Biel" ,10,"Titular", 400000, 22, "Brasil", "Ponta Esquerda");
        Jogador jogador4 = new Jogador("Rafael Rogério","Ratão", 11,"Titular", 400000, 27, "Brasil", "Ponta Esquerda");
        Jogador jogador5 = new Jogador("Thaciano da Silva",null, 16,"Titular", 300000, 28, "Brasil", "Meia Central");
        Jogador jogador6 = new Jogador("Júlio César","Rezende", 5,"Titular", 300000, 28, "Brasil", "Volante");
        Jogador jogador7 = new Jogador("Nicolás Acevedo",null, 26,"Reserva", 300000, 24, "Uruguai", "Volante");
        Jogador jogador8 = new Jogador("Gilberto Moraes",null, 2,"Titular", 400000, 30, "Brasil","Lateral Direito");
        Jogador jogador9 = new Jogador("Camilo Cándido",null, 38,"Titular", 400000, 28, "Uruguai","Lateral Esquerdo");
        Jogador jogador10 = new Jogador("Victor Hugo","Kanu", 4,"Titular", 500000, 26, "Brasil","Zagueiro");
        Jogador jogador11 = new Jogador("Everaldo Stum","Eve", 9,"Titular", 700000, 32, "Brasil", "Centroavante");
        Jogador jogador12 = new Jogador("Francisco Vitor","Jacaré", 29,"Reserva", 90000, 23, "Brasil", "Ponta Esquerda");
        Jogador jogador13 = new Jogador("Luciano Batista","Juba", 46,"Reserva", 300000, 24, "Brasil", "Ponta Esquerda");
        Jogador jogador14 = new Jogador("Marcos Felipe",null, 22,"Titular", 200000, 27, "Brasil", "Goleiro");
        Treinador treinador1 = new Treinador("Rogério Ceni",50, 1000000, "Brasil");

        meuTime.adicionarJogador(jogador1);
        meuTime.adicionarJogador(jogador2);
        meuTime.adicionarJogador(jogador3);
        meuTime.adicionarJogador(jogador4);
        meuTime.adicionarJogador(jogador5);
        meuTime.adicionarJogador(jogador6);
        meuTime.adicionarJogador(jogador7);
        meuTime.adicionarJogador(jogador8);
        meuTime.adicionarJogador(jogador9);
        meuTime.adicionarJogador(jogador10);
        meuTime.adicionarJogador(jogador11);
        meuTime.adicionarJogador(jogador12);
        meuTime.adicionarJogador(jogador13);
        meuTime.adicionarJogador(jogador14);
        meuTime.adicionarTreinador(treinador1);
        
        meuTime.listarPlantel();
                 
    }
}