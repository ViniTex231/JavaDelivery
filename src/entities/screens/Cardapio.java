package entities.screens;
import entities.Janela;
import entities.Lanche;
import entities.Restaurante;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Cardapio extends Janela {

    private Restaurante restaurante;

    public Cardapio(String title, ImageIcon background, boolean visible, Restaurante restaurante){
        super(title, background, true);
        this.restaurante = restaurante;
        this.showMenu();
    }

    public void showMenu(){
        JTextArea menuTextArea = new JTextArea();
        menuTextArea.setEditable(false);
        menuTextArea.setBounds(50, 50, 500, 500);

        StringBuilder menuText = new StringBuilder("Cardápio:\n");
        for (Lanche lanche : restaurante.getCardapio()){
            menuText.append("Nome: ").append(lanche.getNome()).append(", Preço: ").append(lanche.getPreco()).append("\n");
        }
        menuTextArea.setText(menuText.toString());
        this.label.add(menuTextArea);
    }
}
