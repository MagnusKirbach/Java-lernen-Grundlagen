package Ordnereins;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class SpielmitGUI {
    
    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 101);
    static Integer Versuche = 1;
    static JFrame frame = new JFrame("Rate die Zahl!");
    static JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!");
    static JLabel textTries = new JLabel("Versuch "+Versuche);
    static JTextField textField = new JTextField();
    static JButton button = new JButton("Raten!");

    public static void main(String[] args) {
        openUI();
       // nextRound();
    }

    public static void openUI() {
        frame.setSize(400,400);
        frame.setLocation(100,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);

        text.setBounds(50,50,350,30);
        textTries.setBounds(50,150,200,30);

        textField.setBounds(50,100,200,30);

        button.setBounds(50,200,200,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String textFromTextfield = textField.getText();
                    Integer number = Integer.parseInt(textFromTextfield);
                    guess(number);
                } catch (Exception error) {
                    text.setText("Bitte gebe eine Zahl ein!");
                }
            }
        });

        frame.add(text);
        frame.add(textTries);
        frame.add(textField);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void nextRound() {
        Versuche += 1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte gebe eine Zahl ein: ");
            Integer number = scanner.nextInt();
            guess(number);
        }
    }

    public static void guess(Integer number) {
        if(number == myNumber) {
            text.setText("Richtig geraten! Du hast "+Versuche+" Versuche gebraucht.");
            JButton buttonNewGame = new JButton("Neues Spiel?");
            buttonNewGame.setBounds(50,250,200,30);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent newGame) {
                    ;
                }
            });
            frame.add(buttonNewGame);

        } else {
            Versuche += 1;
            textTries.setText("Versuch "+Versuche);
            if(number<myNumber) {
                text.setText("Falsch geraten! Deine Zahl ist zu klein!");
            } else {
                text.setText("Falsch geraten! Deine Zahl ist zu groß!");
            }
            // nextRound();
            textField.setText("");
        }
    }
}