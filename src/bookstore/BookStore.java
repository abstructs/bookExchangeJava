/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.Scanner;
/**
 *
 * @author 101069860
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String username;
        String password;
        
        while(true) {
            System.out.println("Please enter your username: ");
            username = s.nextLine();
            if(username.length() != 0) {
                break;
            }
        }
        
        while(true) {
            System.out.println("Please enter your password: ");
            password = s.nextLine();
            if(password.length() != 0) {
                break;
            }
        }
        
        Account acc1 = new Account(username, password);
        Boolean runProgram = true;
        while(runProgram) {
            System.out.println("View username: 1.");
            System.out.println("Change username: 2.");
            System.out.println("Change password: 3.");
            System.out.println("Exit the program: 4.");
            switch(s.nextLine()) {
                case "1":
                    System.out.println(acc1.getUsername());
                    break;
                case "2":
                    acc1.setUsername(getInput("Enter new username: "));
                    break;
                case "3":
                    getInput("Enter old password", acc1);
                    System.out.println("Enter new password: ");
                    acc1.setPassword(s.nextLine());
                    break;
                case "4":
                    System.out.println("Exiting program.");
                    runProgram = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        }
        
        System.out.println(acc1);
    }
    
    private static String getInput(String message) {
        Scanner s = new Scanner(System.in);
        String input;
        
        while(true) {
            System.out.println("\n" + message + "\n");
            input = s.nextLine();
            if(input.length() != 0) {
                break;
            }
        }
        return input;
    }
    
    private static String getInput(String message, Account acc) {
        Scanner s = new Scanner(System.in);
        String input;
        
        while(true) {
            System.out.println("\n" + message + "\n");
            input = s.nextLine();
            if(acc.isPassword(input)) {
                break;
            }
            System.out.println("\nInvalid Password.\n");
        }
        return input;
    }
}
