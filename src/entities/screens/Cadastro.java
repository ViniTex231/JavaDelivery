package entities.screens;
import entities.Janela;
import javax.swing.*;

public class Cadastro extends Janela {

    public Cadastro(String title, ImageIcon background) {
        super(title, background);
        this.addButton();
        setVisible(true);
    }

    public void addButton(){
        JButton botaoCadRest = new JButton("");
        botaoCadRest.setBounds(138, 254, 359, 66);
        botaoCadRest.setBorderPainted(false);
        botaoCadRest.setContentAreaFilled(false);
        botaoCadRest.setVisible(true);
        this.label.add(botaoCadRest);
        label.setVisible(true);

        JButton botaoCadCli = new JButton("");
        botaoCadCli.setBounds(138, 350, 359, 66);
        botaoCadCli.setBorderPainted(false);
        botaoCadCli.setContentAreaFilled(false);
        botaoCadCli.setVisible(true);
        this.label.add(botaoCadCli);
        label.setVisible(true);
    }
}
