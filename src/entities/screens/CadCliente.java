package entities.screens;
import entities.Janela;
import entities.Usuario;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

public class CadCliente extends Janela {


    JTextField nome;
    JTextField cpf;
    JTextField x;
    JTextField y;

    public CadCliente(String title, ImageIcon background, boolean visible) {
        super(title, background, false);
        this.addInput();
        this.addButton();
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
            String cpfText = cpf.getText();
            String xText = x.getText();
            String yText = y.getText();

            if (nomeText.isEmpty() || cpfText.isEmpty() || xText.isEmpty() || yText.isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
                return;
            } try {
                int xValue = Integer.parseInt(xText);
                int yValue = Integer.parseInt(yText);
                Cardapio cardapio = new Cardapio("Cardapio", new ImageIcon(Objects.requireNonNull(CadCliente.class.getResource("../../Image/cardapio.png"))), true, restauranteAtual);
                Usuario usuario = new Usuario(nomeText, cpfText, xValue, yValue);
                System.out.println("Usuario: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + ", X: " + usuario.getPosX() + ", Y: " + usuario.getPosY());
                cardapio.setVisible(true);
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

        cpf = new JTextField("");
        cpf.setBounds(140, 300, 359, 66);
        cpf.setOpaque(false);
        cpf.setBorder(new EmptyBorder(0, 0, 0, 0));
        cpf.setVisible(true);
        this.label.add(cpf);
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
