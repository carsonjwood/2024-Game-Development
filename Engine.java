//Author : Carson Wood, started Wednesday August 28th, 2024.
import java.util.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;


public class Engine {

    public int storyProgress;

    Engine() {

        storyProgress = 1;
        JFrame f = new JFrame("A JFrame");
        f.setSize(500, 500);
        f.setLocation(300,200);
        final JTextArea textArea = new JTextArea(5, 10);
        f.getContentPane().add(BorderLayout.NORTH, textArea);
    
    
        JPanel userCharacter = new JPanel();
        userCharacter.setSize(300,300);
        JPanel inputBar = new JPanel();
        f.getContentPane().add(BorderLayout.CENTER, userCharacter);
        f.getContentPane().add(BorderLayout.SOUTH, inputBar);
        final JButton button = new JButton("Click Me");
        inputBar.add(BorderLayout.WEST, button);
        final JButton button2 = new JButton("Click Me");
        inputBar.add(BorderLayout.EAST, button2);
        userCharacter.setBackground(Color.GRAY);
        final JButton button3 = new JButton("Click Me");
        inputBar.add(BorderLayout.EAST, button3);
        final JButton button4 = new JButton("Click Me");
        inputBar.add(BorderLayout.EAST, button4);


    //Frame 
    /* 
    ImageIcon image = new ImageIcon(getClass().getResource("AphexTwinLogo.gif"));
    JLabel displayField = new JLabel(image);
    userCharacter.add(displayField);
    displayField.setVisible(true);
        */

    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText(" ");
            //textArea.append(" THREE \n");         // <--- Old Command, kept for reference
            textArea.append(getText(storyProgress, 1));

        }
    });

    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText(" ");
            textArea.append(getText(storyProgress, 2));

        }
    });

    button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText(" ");
            textArea.append(getText(storyProgress, 3));

        }
    });

    button4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText(" ");
            textArea.append(getText(storyProgress, 4));

        }
    });

    f.setVisible(true);

    } //End Of Engine() Constructor

  public static void main(String[] args) {
        Engine start = new Engine();
        } // End of Main
  
  public class GUI {
    
  }

  public String getText(int timeLine, int button){
    String text = buttonSpecificText(timeLine, button);
    storyProgress ++;
    return text;
  }

  public String buttonSpecificText(int timeLine, int button){
    String text = "";

    if(button == 1){
        //Text Responses for button 1
        switch (timeLine) {
            case 1:
                text = "No fuck you";
              break;
            case 2:
                text = "Yeah";
              break;
            default:
              text = "Unsupported Switch";
          }

    } else if (button == 2){
        //Text Responses for button 2
        switch (timeLine) {
            case 1:
                text = "Maybe";
              break;
            case 2:
                text = "No";
              break;
            default:
              text = "Unsupported Switch";
          }

    } else if (button == 3){
        //Text responses for button 3
        switch (timeLine) {
            case 1:
                text = "perchance";
              break;
            case 2:
                text = "gilgamesh";
              break;
            default:
              text = "Unsupported Switch";
          }

    } else if (button == 4){
        //Text responses for button 4
        switch (timeLine) {
            case 1:
                text = "Shutup";
              break;
            case 2:
                text = "you liar";
              break;
            default:
              text = "Unsupported Switch";
          }

    } else {
        text = "Unsupported Boolean";
    }

    return text;
  }



}
