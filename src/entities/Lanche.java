package entities;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, Integer preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return preco;
    }
}
