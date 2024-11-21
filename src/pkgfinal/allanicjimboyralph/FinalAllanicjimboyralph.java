/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.allanicjimboyralph;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class FinalAllanicjimboyralph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Subclass graph = new Subclass();
        Scanner scn = new Scanner(System.in);
 
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Social Network System:");
        System.out.println("1. Add User");
        System.out.println("2. Add Friendship");
        System.out.println("3. Display Friends");
        System.out.println("4. Get Recommended Friends");
        System.out.println("5. Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 
        while (true) {
 
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Social Network System:");
        System.out.println("1. Add User");
        System.out.println("2. Add Friendship");
        System.out.println("3. Display Friends");
        System.out.println("4. Get Recommended Friends");
        System.out.println("5. Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("\nEnter your choice: ");
            int choice = scn.nextInt();
            scn.nextLine();
 
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the user to add: ");
                    String user = scn.nextLine();
                    graph.addUser(user);
                    System.out.println("User " + user + " added.");
                    break;
 
                case 2:
                    System.out.print("Enter the name of the first user: ");
                    String user1 = scn.nextLine();
                    System.out.print("Enter the name of the second user: ");
                    String user2 = scn.nextLine();
                    graph.addFriend(user1, user2);
                    System.out.println("Friendship added between " + user1 + " and " + user2 + ".");
                    break;
 
                case 3:
                    System.out.println("Displaying all users and their friends:");
                    graph.displayFriends();
                    break;
 
                case 4:
                    System.out.print("Enter the name of the user to get recommendations for: ");
                    String targetUser = scn.nextLine();
                    Set<String> recommendedFriends = graph.getRecommendedFriends(targetUser);
                    if (recommendedFriends.isEmpty()) {
                        System.out.println("No recommended friends for " + targetUser + ".");
                    } else {
                        System.out.println("Recommended friends for " + targetUser + ": " + recommendedFriends);
                    }
                    break;
 
                case 5:
                    System.out.println("Thank you...");
                    scn.close();
                    return;
 
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}