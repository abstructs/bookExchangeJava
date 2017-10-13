/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.ArrayList;
/**
 *
 * @author 101069860
 */
public class Account {
    private String username;
    private String password;
    private ArrayList<Book> books;
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return String.format("Username: %s.\nPassword: %s.\n", username, password);
    }
    
    public Boolean isPassword(String password) {
        return this.password.equals(password);
    }
    
}   
