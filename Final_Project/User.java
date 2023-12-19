package Final_Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List <String> watchlist;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
        this.watchlist = new ArrayList <> ();
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    

    public List <String> getWatchList () {
        return watchlist;
    }
    public void add_to_WatchList (String movie_title) {
        watchlist.add(movie_title) ;

    }
    public void remove_from_WatchList (String movie_title){
        watchlist.remove(movie_title);
    }
    public void saveWatchlistToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(username + "_watchlist.txt"))) {
            for (String movieTitle : watchlist) {
                writer.write(movieTitle);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadWatchlistFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(username + "_watchlist.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                watchlist.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User createUserFromCredentials(String username, String password) {
        return new User(username, password);
    }

    public static User loadUserFromCredentials(String username, String password) {
        return new User(username, password);
    }

    public static void saveUserToFile(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userDatabase.txt", true))) {
            writer.write(user.getUsername() + "," + user.getPassword());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean validateUser(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("userDatabase.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
