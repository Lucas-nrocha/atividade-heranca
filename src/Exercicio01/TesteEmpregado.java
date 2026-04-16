package Exercicio01;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado(
                "Lucas rocha2",
                "Rua boa hancokk",
                "11988494901",
                10,
                3000.0,
                15.0
        );

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereco: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Codigo do setor: " + empregado.getCodigoSetor());
        System.out.println("Salario base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salario liquido: " + empregado.calcularSalario());


        empregado.setNome("Ana Souza");
        empregado.setEndereco("Rua Y, 200");
        empregado.setTelefone("(11) 96666-5555");
        empregado.setCodigoSetor(20);
        empregado.setSalarioBase(4500.0);
        empregado.setImposto(12.0);

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereco: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Codigo do setor: " + empregado.getCodigoSetor());
        System.out.println("Salario base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salario liquido: " + empregado.calcularSalario());

    }
}
