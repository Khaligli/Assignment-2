package Final_Project;

import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MovieAppGUI extends JFrame {
    private MovieDatabase movieDatabase;
    private User currentUser;



    movieDatabase = new MovieDatabase();
        // Initialize GUI components here
        // ...

        // Example button for adding a movie to the database
        JButton addMovieButton = new JButton("Add Movie");
        addMovieButton.addActionListener new ActionListener() {
            @Override
            public void actionPerformed(ActionMap e) {
                // Code to add a movie to the database
                // ...
            }
        }
    }
}


