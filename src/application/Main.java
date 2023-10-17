package application;

import entities.*;
import entities.screens.Login;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Aplicativo aplicativo = new Aplicativo();
//        aplicativo.cadastrarRestaurante("Restaurante A", "1231233123", 10, 10);
//        aplicativo.cadastrarUsuario("Usuário 1", "12312312", 30, 30);
//
//        // Adicionar ao cardápio
//        Restaurante restaurante = aplicativo.getRestaurantes().get(0);
//        Lanche lanche1 = new Lanche("Hamburguer", 10.0);
//        Lanche lanche2 = new Lanche("Batata Frita", 5.0);
//        restaurante.adicionarLanche(lanche1);
//        restaurante.adicionarLanche(lanche2);
//
//        // Imprimir o cardápip
//        restaurante.imprimirCardapio();
//
//        // Fazer pedido
//        Usuario usuario = aplicativo.getUsuarios().get(0);
//        Pedido pedido = new Pedido(restaurante, usuario);
//        pedido.fazerPedido(lanche1);
//        pedido.fazerPedido(lanche2);
//        pedido.imprimirPedido();


        Login login;
        login = new Login("Login", new ImageIcon(Objects.requireNonNull(Main.class.getResource("../Image/Login.png"))));
    }
}
