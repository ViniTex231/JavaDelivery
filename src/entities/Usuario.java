package entities;

public class Usuario {
    private String nome;
    private String cpf;
    private int posX;
    private int posY;

    public Usuario(String nome, String cpf, int posX, int posY){
        this.nome = nome;
        this.cpf = cpf;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNome() {
        return nome;
    }
}
