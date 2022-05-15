/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @author p2009302
 */

public class Mafenetre extends JFrame implements ActionListener, FocusListener {

    JButton visuGrille[][];
    JButton btRejouer;
    JLabel joueur;
    boolean j;

    public Mafenetre() {
        this.setTitle("Morpion");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initialisation();

        // ajout des listener
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                visuGrille[i][j].addActionListener(this);
            }
        }

        //txt.addFocusListener(this);

    }

    private void initialisation() {
        // creation des composants
        btRejouer = new JButton("Nouvelle Partie");

        j=true;

        joueur = new JLabel("Lorem ipsum");
        //label.setBorder(new BevelBorder(1));
        //label.setBackground(Color.blue);

        visuGrille = new JButton[3][3];
        ImageIcon imageCroix = new ImageIcon(getClass().getResource("icones/fondBlanc.png"));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                visuGrille[i][j] = new JButton();
                visuGrille[i][j].setIcon(imageCroix);
            }
        }

        //recupere le panneau par defaut
        this.getContentPane();

        //creation panneau
        JPanel pano = new JPanel();

        // ajout du gestionnaire de placement
        pano.setLayout(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();

        //placement des composant
        //cont.fill=GridBagConstraints.BOTH;


        cont.gridx = 0;
        cont.gridy = 0;
        pano.add(joueur, cont);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cont.gridx = i;
                cont.gridy = j + 1;
                pano.add(visuGrille[i][j], cont);
            }
        }

        cont.gridx = 0;
        cont.gridy = 4;
        cont.gridwidth = 3;
        pano.add(btRejouer, cont);

        //placer le panneau dans la Jframe
        this.setContentPane(pano);
        this.pack();
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(e.getSource()==visuGrille[i][j]){
                    if(this.j==true)
                    {

                    }

                }

            }
        }

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}


