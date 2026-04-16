package Exercicio01;

import org.w3c.dom.ls.LSOutput;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor(
                "Logitech",
                "Parque industrial , 400",
                "11 44092-2992",
                5000.00,
                1200.50
        );

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereço: "  +f1.getEndereco());
        System.out.println("Telefone: " + f1.getTelefone());

        System.out.println("Crédito: R$" + f1.getValorCredito());
        System.out.println("Dívida: R$" + f1.getValorDivida());

        f1.setNome("Maria Silva");
        f1.setEndereco("Rua B, 456");
        f1.setTelefone("(11) 98888-7777");
        f1.setValorCredito(7000.0);
        f1.setValorDivida(2500.0);

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereco: " + f1.getEndereco());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Valor de credito: " + f1.getValorCredito());
        System.out.println("Valor da divida: " + f1.getValorDivida());
        System.out.println("Saldo: " + f1.obterSaldo());

    }
}
