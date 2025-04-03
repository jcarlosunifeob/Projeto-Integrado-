package model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Criando um Paciente
        Paciente paciente1 = new Paciente(1, "Carlos", "Silva", "123.456.789-00", "carlos@email.com", "11999999999");

        
        // Criando um Profissional (correção na sintaxe)
        Profissional profissional1 = new Profissional(1, "Dra. Juliana Souza", "Cardiologista", "123.456.789-01", "juliana@email.com", "11988887777", "Cardiologista");

        // Criando um Usuário vinculado ao Profissional
        Usuario usuario1 = new Usuario(1, "Juliana Souza", "juliana@email.com", "senhaSegura123", "Profissional", profissional1.getIdProfissional());

        // Criando um Pagamento
        Pagamento pagamento1 = new Pagamento(1, paciente1, profissional1, 200.00, "Pix");

        // Criando uma lista de pacientes
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(paciente1);

        // Criando uma lista de profissionais
        ArrayList<Profissional> listaProfissionais = new ArrayList<>();
        listaProfissionais.add(profissional1);

        // Criando uma lista de pagamentos
        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();
        listaPagamentos.add(pagamento1);

        // Exibindo as informações dos objetos criados
        System.out.println("=== Paciente Cadastrado ===");
        paciente1.exibirInformacoes();

        System.out.println("\n=== Profissional Cadastrado ===");
        profissional1.exibirInformacoes();

        System.out.println("\n=== Usuário Vinculado ao Profissional ===");
        usuario1.exibirUsuario();

        System.out.println("\n=== Detalhes do Pagamento ===");
        pagamento1.exibirPagamento();
    }
}


