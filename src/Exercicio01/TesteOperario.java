package Exercicio01;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario(
                "Lucas r",
                "rua bancok",
                "1194982929202",
                3,
                2500.0,
                8.0,
                10000.0,
                5.0
        );

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereco: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Codigo do setor: " + operario.getCodigoSetor());
        System.out.println("Salario base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da producao: " + operario.getValorProducao());
        System.out.println("Comissao: " + operario.getComissao() + "%");
        System.out.println("Salario final: " + operario.calcularSalario());

        operario.setNome("Paulo Santos");
        operario.setEndereco("Av. Industrial, 150");
        operario.setTelefone("(11) 92222-1111");
        operario.setCodigoSetor(4);
        operario.setSalarioBase(3000.0);
        operario.setImposto(10.0);
        operario.setValorProducao(15000.0);
        operario.setComissao(6.0);

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereco: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Codigo do setor: " + operario.getCodigoSetor());
        System.out.println("Salario base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da producao: " + operario.getValorProducao());
        System.out.println("Comissao: " + operario.getComissao() + "%");
        System.out.println("Salario final: " + operario.calcularSalario());


    }
}
