package entities.screens;
import entities.Janela;
import entities.Lanche;
import entities.Restaurante;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.Objects;

public class AddLanche extends Janela{

    JTextField nome;
    JTextField preco;

    public AddLanche(String title, ImageIcon background, boolean visible) {
        super(title, background, true);
        this.addButton();
        this.addInput();
        setVisible(true);
    }

    public void addButton(){
        JButton botaoCad = new JButton("");
        botaoCad.setBounds(138, 430, 119, 39);
        botaoCad.setBorderPainted(false);
        botaoCad.setContentAreaFilled(false);
        botaoCad.setVisible(true);
        botaoCad.addActionListener(e -> {
            String nomeText = nome.getText();
            String precoText = preco.getText();

            if (nomeText.isEmpty() || precoText.isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
                return;
            } try {
                int precoValue = Integer.parseInt(precoText);

                AddLanche addLanche = new AddLanche("Adicionar lanche", new ImageIcon(Objects.requireNonNull(AddLanche.class.getResource("../../Image/CadLanche.png"))), true);
                Lanche lanche = new Lanche(nomeText, precoValue);
                restauranteAtual.adicionarLanche(lanche);
                System.out.println("Lanche: " + lanche.getNome() + ", preço: " + lanche.getPreco());
                addLanche.setVisible(true);
                this.dispose();
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "O preço precisa ser um número");
            }
        });
        this.label.add(botaoCad);
        label.setVisible(true);

        JButton botaoFin = new JButton("");
        botaoFin.setBounds(380, 430, 119, 39);
        botaoFin.setBorderPainted(false);
        botaoFin.setContentAreaFilled(false);
        botaoFin.setVisible(true);
        botaoFin.addActionListener(e -> {
            String nomeText = nome.getText();
            String precoText = preco.getText();

            if (nomeText.isEmpty() || precoText.isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
                return;
            } try {
                int precoValue = Integer.parseInt(precoText);

                CadCliente cadCliente = new CadCliente("Cadastrar cliente", new ImageIcon(Objects.requireNonNull(AddLanche.class.getResource("../../Image/cadCliente.png"))), true);
                Lanche lanche = new Lanche(nomeText, precoValue);
                restauranteAtual.adicionarLanche(lanche);
                System.out.println("Lanche: " + lanche.getNome() + ", preço: " + lanche.getPreco());
                cadCliente.setVisible(true);
                this.dispose();
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "O preço precisa ser um número");
            }
        });
        this.label.add(botaoFin);
        label.setVisible(true);
    }

    public void addInput(){
        nome = new JTextField("");
        nome.setBounds(140, 140, 359, 66);
        nome.setOpaque(false);
        nome.setBorder(new EmptyBorder(0, 0, 0, 0));
        nome.setVisible(true);
        this.label.add(nome);
        label.setVisible(true);

        preco = new JTextField("");
        preco.setBounds(140, 230, 359, 66);
        preco.setOpaque(false);
        preco.setBorder(new EmptyBorder(0, 0, 0, 0));
        preco.setVisible(true);
        this.label.add(preco);
        label.setVisible(true);
    }
}
