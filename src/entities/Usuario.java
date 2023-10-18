package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuario implements ActionListener {
    private String nome;
    private String cpf;
    private int posX;
    private int posY;

    public Usuario(String nome, String cpf, int posX, int posY) {
        this.nome = nome;
        this.cpf = cpf;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
