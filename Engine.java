//Author : Carson Wood, started Wednesday August 28th, 2024.
import java.util.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Engine {

  public static void main(String[] args) {

    JFrame f = new JFrame("A JFrame");
    f.setSize(500, 500);
    f.setLocation(300,200);
    final JTextArea textArea = new JTextArea(1, 10);
    f.getContentPane().add(BorderLayout.WEST, textArea);
    final JButton button = new JButton("Click Me");
    f.getContentPane().add(BorderLayout.SOUTH, button);

    JPanel userCharacter = new JPanel();
    userCharacter.setSize(300,500);
    f.getContentPane().add(BorderLayout.EAST, userCharacter);
    userCharacter.setBackground(Color.black);

    button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("Button was clicked\n");

        }
    });

    f.setVisible(true);

  }

}