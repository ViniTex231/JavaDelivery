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

        JButton botaoLogCli = new JButton("");
        botaoLogCli.setBounds(138,350, 359,66);
        botaoLogCli.setContentAreaFilled(false);
        botaoLogCli.setBorderPainted(false);
        botaoLogCli.setVisible(true);
        this.label.add(botaoLogCli);
        label.setVisible(true);

        JButton botaoCad = new JButton("");
        botaoCad.setBounds(266,425, 103,30);
        botaoCad.setContentAreaFilled(false);
        botaoCad.setBorderPainted(false);
        botaoCad.setVisible(true);
        this.label.add(botaoCad);
        label.setVisible(true);

    }
}
