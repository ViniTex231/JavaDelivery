package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Restaurante restaurante;
    private Usuario usuario;
    private List<Lanche> itens;

    public Pedido(Restaurante restaurante, Usuario usuario){
        this.restaurante = restaurante;
        this.usuario = usuario;
        this.itens = new ArrayList<>();
    }
    public void fazerPedido(Lanche lanche){
        itens.add(lanche);
    }
    public void imprimirPedido(){
        System.out.println("Pedido do usuário " + usuario.getNome() + "no restaurante " + restaurante.getNome() + ":");
        for (Lanche lanche : itens){
            System.out.println("Nome: " + lanche.getNome() + ", Preço: " + lanche.getPreco());
        }
    }
}
