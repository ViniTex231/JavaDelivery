package entities;
import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame{

    public static Restaurante restauranteAtual;

    public JLabel label;

    public Janela(String title, ImageIcon background, boolean visible) {
        super(title);
        label = new JLabel(background);
        setBounds(0, 0, 650, 650);
        setVisible(visible);

        add(label);

    }

    public static void setRestauranteAtual(Restaurante restauranteAtual) {
        Janela.restauranteAtual = restauranteAtual;
    }

    public static Restaurante getRestauranteAtual() {
        return restauranteAtual;
    }
}
