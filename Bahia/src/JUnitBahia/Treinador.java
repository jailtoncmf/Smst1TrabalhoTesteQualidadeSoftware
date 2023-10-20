package JUnitBahia;

public class Treinador {
    private String nome;
    private int idade;
    private double salario;
    private String nacionalidade;

    public Treinador(String nome, int idade, double salario, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.nacionalidade = nacionalidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public double getSalario() {
        return salario;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    @Override
    public String toString() {
        return  "Nome=" + nome  +
                " / Idade=" + idade +
                " / Salário= R$ " + salario +
                " / Nacionalidade= " + nacionalidade;
    }
}
