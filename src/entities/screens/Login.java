package entities.screens;
import entities.Janela;

import javax.swing.*;

public class Login extends Janela {


    public Login(String title, ImageIcon background) {
        super(title, background);
        this.addButton();
        setVisible(true);
    }

    public void addButton(){
        JButton botaoLogRest = new JButton("");
        botaoLogRest.setBounds(138, 254, 359, 66);
        botaoLogRest.setContentAreaFilled(false);
        botaoLogRest.setBorderPainted(false);
        botaoLogRest.setVisible(true);
        this.label.add(botaoLogRest);
        label.setVisible(true);

        JButton

    }
}
