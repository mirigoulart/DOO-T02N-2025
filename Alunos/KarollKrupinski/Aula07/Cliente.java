package Aula07;

public class Cliente extends Pessoa {
    public Cliente(String nome, int idade, Endereco endereco) {
        super(nome, idade, endereco);
    }

    @Override
    public void apresentarse() {
        System.out.println("Olá, sou o cliente " + nome + ", tenho " + idade + " anos.");
    }
}