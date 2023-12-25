package Final_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieAppGUI_ {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Movie Browser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Components for Browsing Movies
        JLabel label1 = new JLabel("Enter a movie title:");
        JTextField textField1 = new JTextField();
        JButton button1 = new JButton("Search");

        panel.add(label1);
        panel.add(textField1);
        panel.add(button1);

        // Action for the 'Search' button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movieTitle = textField1.getText();
                // Add code here to search for movies by the given title
                // You can use a web API like The Movie Database (TMDb) API for this
            }
        });

        // Components for Adding/Removing Movies from Watchlist
        JLabel label2 = new JLabel("Enter a movie title:");
        JTextField textField2 = new JTextField();
        JButton button2 = new JButton("Add to Watchlist");
        JButton button3 = new JButton("Remove from Watchlist");

        panel.add(label2);
        panel.add(textField2);
        panel.add(button2);
        panel.add(button3);

        // Action for the 'Add to Watchlist' button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movieTitle = textField2.getText();
                // Add code here to add the movie to the user's watchlist
                // You can use a database to store this information
            }
        });

        // Action for the 'Remove from Watchlist' button
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movieTitle = textField2.getText();
                // Add code here to remove the movie from the user's watchlist
                // You can use a database to store this information
            }
        });

        container.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

