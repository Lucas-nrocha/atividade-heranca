package Exercicio01;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador(
                "Lucas rocha3",
                "rua boa banckc",
                "11 9984827579",
                1,
                6000.0,
                10.0,
                800.0
        );

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereco: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Codigo do setor: " + administrador.getCodigoSetor());
        System.out.println("Salario base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salario final: " + administrador.calcularSalario());


        administrador.setNome("Fernanda Lima");
        administrador.setEndereco("Av. Brasil, 700");
        administrador.setTelefone("(11) 94444-3333");
        administrador.setCodigoSetor(2);
        administrador.setSalarioBase(7500.0);
        administrador.setImposto(12.0);
        administrador.setAjudaDeCusto(1200.0);

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereco: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Codigo do setor: " + administrador.getCodigoSetor());
        System.out.println("Salario base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salario final: " + administrador.calcularSalario());

    }
}
