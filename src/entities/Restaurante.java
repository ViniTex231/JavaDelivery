package entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String cnpj;
    private int posX;
    private int posY;
    private List<Lanche> cardapio = new ArrayList<>();

    public Restaurante(String nome, String cnpj, int posX, int posY) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.posX = posX;
        this.posY = posY;
        this.cardapio = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj(){
        return cnpj;
    }

    public Integer getPosX(){
        return posX;
    }

    public Integer getPosY(){
        return posY;
    }



    public void adicionarLanche(Lanche lanche) {
        cardapio.add(lanche);
    }

    public void removerLanche(Lanche lanche) {
        cardapio.remove(lanche);
    }

    public void imprimirCardapio() {
        for (Lanche lanche : cardapio) {
            System.out.println("Nome: " + lanche.getNome() + ", Preço: " + lanche.getPreco());
        }
    }

    public List<Lanche> getCardapio() {
        return cardapio;
    }
}