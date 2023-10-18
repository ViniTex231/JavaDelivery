package entities.screens;
import entities.Janela;
import entities.Restaurante;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.Objects;

public class CadRestaurante extends Janela{

    JTextField nome;
    JTextField cnpj;
    JTextField x;
    JTextField y;

    public CadRestaurante(String title, ImageIcon background, boolean visible) {
        super(title, background, visible);
        this.addButton();
        this.addInput();
//        setVisible(true);
    }

    public void addButton(){
        JButton botao = new JButton("");
        botao.setBounds(260, 490, 119, 39);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setVisible(true);
        botao.addActionListener(e -> {
            String nomeText = nome.getText();
            String cnpjText = cnpj.getText();
            String xText = x.getText();
            String yText = y.getText();

            if (nomeText.isEmpty() || cnpjText.isEmpty() || xText.isEmpty() || yText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
                return;
            } try {
                int xValue = Integer.parseInt(xText);
                int yValue = Integer.parseInt(yText);
                AddLanche addLanche = new AddLanche("Adicionar lanche", new ImageIcon(Objects.requireNonNull(AddLanche.class.getResource("../../Image/CadLanche.png"))), true);
                Restaurante restaurante = new Restaurante(nomeText, cnpjText, xValue, yValue);
                restauranteAtual = restaurante;
                System.out.println("Usuario: " + restaurante.getNome() + ", CNPJ: " + restaurante.getCnpj() + ", X: " + restaurante.getPosX() + ", Y: " + restaurante.getPosY());
                addLanche.setVisible(true);
                this.dispose();
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "As coordenadas devem ser números");
            }
        });
        this.label.add(botao);
        label.setVisible(true);
    }

    public void addInput(){
        nome = new JTextField("");
        nome.setBounds(140, 215, 359, 66);
        nome.setOpaque(false);
        nome.setBorder(new EmptyBorder(0, 0, 0, 0));
        nome.setVisible(true);
        this.label.add(nome);
        label.setVisible(true);

        cnpj = new JTextField("");
        cnpj.setBounds(140, 300, 359, 66);
        cnpj.setOpaque(false);
        cnpj.setBorder(new EmptyBorder(0, 0, 0, 0));
        cnpj.setVisible(true);
        this.label.add(cnpj);
        label.setVisible(true);

        x = new JTextField("");
        x.setBounds(140, 400, 150, 66);
        x.setOpaque(false);
        x.setBorder(new EmptyBorder(0, 0, 0, 0));
        x.setVisible(true);
        this.label.add(x);
        label.setVisible(true);

        y = new JTextField("");
        y.setBounds(350, 400, 150, 66);
        y.setOpaque(false);
        y.setBorder(new EmptyBorder(0, 0, 0, 0));
        y.setVisible(true);
        this.label.add(y);
        label.setVisible(true);
    }
}
