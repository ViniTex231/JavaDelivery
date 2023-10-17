package entities.screens;
import entities.Janela;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CadCliente extends Janela {

    public CadCliente(String title, ImageIcon background) {
        super(title, background);
        this.addButton();
        this.addInput();
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

    public void addInput(){
        JTextField nome = new JTextField("");
        nome.setBounds(140, 215, 359, 66);
        nome.setOpaque(false);
        nome.setBorder(new EmptyBorder(0, 0, 0, 0));
        nome.setVisible(true);
        this.label.add(nome);
        label.setVisible(true);
    }
}
