package JUnitBahia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ECBahiaTest {
    private ECBahia meuTime;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;
    private Jogador jogador4;
    private Jogador jogador5;
    private Jogador jogador6;
    private Jogador jogador7;
    private Jogador jogador8;
    private Jogador jogador9;
    private Jogador jogador10;
    private Jogador jogador11;
    private Jogador jogador12;
    private Jogador jogador13;
    private Jogador jogador14;
    private Treinador treinador1;

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        meuTime = new ECBahia("EC Bahia");
        jogador1 = new Jogador("Cauly Oliveira",null, 8,"Titular", 500000, 28, "Brasil" +" / " + "Alemanha","Meia Ofensivo");
        jogador2 = new Jogador("Ademir da Silva","Fumacinha", 7,"Titular", 300000, 28, "Brasil", "Ponta Direita");
        jogador3 = new Jogador("Gabriel Teixeira", "Biel" ,10,"Titular", 400000, 22, "Brasil", "Ponta Esquerda");
        jogador4 = new Jogador("Rafael Rogério","Ratão", 11,"Titular", 400000, 27, "Brasil", "Ponta Esquerda");
        jogador5 = new Jogador("Thaciano da Silva",null, 16,"Titular", 300000, 28, "Brasil", "Meia Central");
        jogador6 = new Jogador("Júlio César","Rezende", 5,"Titular", 300000, 28, "Brasil", "Volante");
        jogador7 = new Jogador("Nicolás Acevedo",null, 26,"Reserva", 300000, 24, "Uruguai", "Volante");
        jogador8 = new Jogador("Gilberto Moraes",null, 2,"Titular", 400000, 30, "Brasil","Lateral Direito");
        jogador9 = new Jogador("Camilo Cándido",null, 38,"Titular", 400000, 28, "Uruguai","Lateral Esquerdo");
        jogador10 = new Jogador("Victor Hugo","Kanu", 4,"Titular", 500000, 26, "Brasil","Zagueiro");
        jogador11 = new Jogador("Everaldo Stum","Eve", 9,"Titular", 700000, 32, "Brasil", "Centroavante");
        jogador12 = new Jogador("Francisco Vitor","Jacaré", 29,"Reserva", 90000, 23, "Brasil", "Ponta Esquerda");
        jogador13 = new Jogador("Luciano Batista","Juba", 46,"Reserva", 300000, 24, "Brasil", "Ponta Esquerda");
        jogador14 = new Jogador("Marcos Felipe",null, 22,"Titular", 200000, 27, "Brasil", "Goleiro");
        treinador1 = new Treinador("Rogério Ceni",50, 1000000, "Brasil");

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


        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testPagarSalarios() {
        meuTime.pagarSalarios();

        String output = outputStream.toString().trim();

        assertTrue(output.contains("Salário pago para Cauly Oliveira no valor de R$500000"));
        assertTrue(output.contains("Salário pago para Ademir da Silva no valor de R$300000"));
        assertTrue(output.contains("Salário pago para Gabriel Teixeira no valor de R$400000"));
        assertTrue(output.contains("Salário pago para Rafael Rogério no valor de R$400000"));
        assertTrue(output.contains("Salário pago para Thaciano da Silva no valor de R$300000"));
        assertTrue(output.contains("Salário pago para Júlio César no valor de R$300000"));
        assertTrue(output.contains("Salário pago para Nicolás Acevedo no valor de R$300000"));
        assertTrue(output.contains("Salário pago para Gilberto Moraes no valor de R$400000"));
        assertTrue(output.contains("Salário pago para Camilo Cándido no valor de R$400000"));
        assertTrue(output.contains("Salário pago para Victor Hugo no valor de R$500000"));
        assertTrue(output.contains("Salário pago para Everaldo Stum no valor de R$700000"));
        assertTrue(output.contains("Salário pago para Francisco Vitor no valor de R$90000"));
        assertTrue(output.contains("Salário pago para Luciano Batista no valor de R$300000"));
        assertTrue(output.contains("Salário pago para Marcos Felipe no valor de R$200000"));
        assertTrue(output.contains("Salário pago para o treinador Rogério Ceni no valor de R$1000000"));

    }
}
