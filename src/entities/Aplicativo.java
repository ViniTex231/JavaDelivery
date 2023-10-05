package entities;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    private List<Restaurante> restaurantes;
    private List<Usuario> usuarios;
    private List<Pedido> pedidos;

    public Aplicativo(){
        this.restaurantes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    public void cadastrarRestaurante(String nome, String cnpj, int posX, int posY){
        Restaurante restaurante = new Restaurante(nome, cnpj, posX, posY);
        restaurantes.add(restaurante);
    }
    public void cadastrarUsuario(String nome, String cpf, int posX, int posY){
        Usuario usuario = new Usuario(nome, cpf, posX, posY);
        usuarios.add(usuario);
    }
    public List<Restaurante> getRestaurantes(){
        return restaurantes;
    }
    public List<Usuario> getUsuarios(){
        return usuarios;
    }
}
