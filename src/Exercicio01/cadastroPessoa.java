package Exercicio01;

public class cadastroPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Lucas");
        p1.setEndereco("Rua boa hancook");
        p1.setTelefone("11 9999-9000");

        Pessoa p2 = new Pessoa("João", "Rua boa hancook", "1199902852");

        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());
    }
}
