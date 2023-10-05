package entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String cnpj;
    private int posX;
    private int posY;
    private List<Lanche> cardapio;

    public Restaurante(String nome, String cnpj, int posX, int posY){
        this.nome = nome;
        this.cnpj = cnpj;
        this.posX = posX;
        this.posY = posY;
        this.cardapio = new ArrayList<>();
    }
    public void adicionarLanche(Lanche lanche){
        cardapio.add(lanche);
    }
    public void removerLanche(Lanche lanche){
        cardapio.remove(lanche);
    }
    public void imprimirCardapio(){
        for (Lanche lanche : cardapio){
            System.out.println("Nome: " + lanche.getNome() + ", Preço: " + lanche.getPreco());
        }
    }
    public String getNome(){
        return nome;
    }
}
