package entities.screens;
import entities.Janela;
import javax.swing.*;
import java.util.Objects;

public class Cadastro extends Janela {

    public Cadastro(String title, ImageIcon background) {
        super(title, background, true);
        this.addButton();
        setVisible(true);
    }

    public void addButton(){
        JButton botaoCadRest = new JButton("");
        botaoCadRest.setBounds(138, 254, 359, 66);
        botaoCadRest.setBorderPainted(false);
        botaoCadRest.setContentAreaFilled(false);
        botaoCadRest.setVisible(true);
        botaoCadRest.addActionListener(e -> {
            CadRestaurante cadRestaurante = new CadRestaurante("Cadastrar Restaurante", new ImageIcon(Objects.requireNonNull(Cadastro.class.getResource("../../Image/cadRest.png"))), true);
            cadRestaurante.setVisible(true);
            this.dispose();
        });
        this.label.add(botaoCadRest);
        label.setVisible(true);
    }
}
