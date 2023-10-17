package entities;
import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame{

    public JLabel label;

    public Janela(String title, ImageIcon background) {
        super(title);
        label = new JLabel(background);
        setBounds(0, 0, 650, 650);

        add(label);

    }
}
