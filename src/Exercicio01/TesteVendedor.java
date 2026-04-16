package Exercicio01;

import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
                "Lucas .r",
                "rua labubu",
                "11 99289242",
                7,
                2500.0,
                10.0,
                18000.0,
                5.0
        );

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereco: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Codigo do setor: " + vendedor.getCodigoSetor());
        System.out.println("Salario base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das vendas: " + vendedor.getValorVendas());
        System.out.println("Comissao: " + vendedor.getComissao() + "%");
        System.out.println("Salario final: " + vendedor.calcularSalario());

        vendedor.setNome("Mariana Costa");
        vendedor.setEndereco("Av. Central, 450");
        vendedor.setTelefone("(11) 97777-4321");
        vendedor.setCodigoSetor(9);
        vendedor.setSalarioBase(3200.0);
        vendedor.setImposto(12.0);
        vendedor.setValorVendas(25000.0);
        vendedor.setComissao(6.0);

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereco: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Codigo do setor: " + vendedor.getCodigoSetor());
        System.out.println("Salario base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das vendas: " + vendedor.getValorVendas());
        System.out.println("Comissao: " + vendedor.getComissao() + "%");
        System.out.println("Salario final: " + vendedor.calcularSalario());

    }
}
