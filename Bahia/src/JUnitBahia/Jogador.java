package JUnitBahia;

public class Jogador {
    private String nome;
    private String apelido;
    private int numeroCamisa;
    private String status;
    private double salario;
    private int idade;
    private String nacionalidade;
    private String posicao;

    private int id;
    

    public Jogador(String nome, String apelido, int numeroCamisa,String status, double salario, int idade, String nacionalidade, String posicao) {
    	this.nome = nome;
        this.apelido = apelido;
        this.numeroCamisa = numeroCamisa;
        this.status = status;
        this.salario = salario;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;   
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }
    public String getPosicao() {
        return posicao;
    }

    public String getNome() {
        return nome;
    }
    public String getStatus() {
        return status;
    }
    public String getApelido() {
        return apelido;
    }
    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    
	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	  @Override
	    public String toString() {
	        return "id= " + id +
	                " / Nome= " + nome +
	                (apelido != null ? " / Apelido= " + apelido : "") +
	                " / Número da Camisa= " + numeroCamisa +
	                " / Status= " + status +	                
	                " / Salário= R$ " + salario +
	                " / Idade= " + idade +
	                " / Nacionalidade= " + nacionalidade +
	                " / Posição= " + posicao;
	    
}
}
