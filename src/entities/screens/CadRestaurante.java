package entities.screens;
import entities.Janela;
import javax.swing.*;

public class CadRestaurante extends Janela{

    public CadRestaurante(String title, ImageIcon background) {
        super(title, background);
        this.addButton();
        setVisible(true);
    }

    public void addButton(){
        JButton botao = new JButton("");
        botao.setBounds(260, 490, 119, 39);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setVisible(true);
        this.label.add(botao);
        label.setVisible(true);
    }
}
