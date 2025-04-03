package model;

public class Paciente extends Pessoa {
    private int id;

    // Construtor
    public Paciente(int id, String nome, String sobrenome, String cpf, String email, String telefone) {
        super(nome, sobrenome, cpf, email, telefone); // Chama o construtor da classe Pessoa
        this.id = id;
    }

    // Getter e Setter para ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Sobrescrita do método para exibir informações
    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        super.exibirInformacoes();
    }
}
