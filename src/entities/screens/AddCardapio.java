package entities.screens;
import entities.Janela;
import entities.Restaurante;
import entities.Lanche;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddCardapio extends Janela{
    public AddCardapio(String title, ImageIcon background, boolean visible){
        super(title, background, true);
        setVisible(true);
    }
}