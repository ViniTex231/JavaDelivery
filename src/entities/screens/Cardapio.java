package entities.screens;
import entities.Janela;
import entities.Lanche;
import entities.Restaurante;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Cardapio extends Janela {

    private Restaurante restaurante;
    private JTextField[] quantidadeFields;

    public Cardapio(String title, ImageIcon background, boolean visible, Restaurante restaurante){
        super(title, background, true);
        this.restaurante = restaurante;
        this.addButton();
        this.showMenu();
    }

    public void showMenu(){
        JTextArea menuTextArea = new JTextArea();
        menuTextArea.setEditable(false);
        menuTextArea.setBounds(50, 70, 300, 300);

        StringBuilder menuText = new StringBuilder("Cardápio:\n");

        for (Lanche lanche : restaurante.getCardapio()){
            JTextField quantidadeField = new JTextField(5);
            menuText.append("Nome: ").append(lanche.getNome()).append(", Preço: ").append(lanche.getPreco()).append("\n");
        }
        menuTextArea.setText(menuText.toString());
        this.label.add(menuTextArea);
    }

    public void addButton(){
        JButton botao = new JButton("");
        botao.setBounds(505, 485, 90, 90);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setVisible(true);
        botao.addActionListener(e -> {
            for (int i = 0; i < quantidadeFields.length; i++){
                String quantidadeText = quantidadeFields[i].getText();
                if (!quantidadeText.isEmpty()){
                    int quantidade = Integer.parseInt(quantidadeText);
                    System.out.println(quantidade);
                }
            }
        });
        this.label.add(botao);
        label.setVisible(true);
    }
}
