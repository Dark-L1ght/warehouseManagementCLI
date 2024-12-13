import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int main;

        System.out.println("Sistem Warehouse Management");
        System.out.println("===========================");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        Scanner input = new Scanner(System.in);
        main = input.nextInt();
        
    if (main == 1) {
        if (validateLogin()) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    } else if (main == 2) {
        System.out.println("Exiting...");
    } else {
        System.out.println("Invalid option!");
    }
}

private static boolean validateLogin() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = input.nextLine();
    System.out.print("Enter password: ");
    String password = input.nextLine();

    try {
        File file = new File("users.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String[] credentials = fileScanner.nextLine().split(",");
            if (credentials.length == 2 && credentials[0].equals(username) && credentials[1].equals(password)) {
                fileScanner.close();
                return true;
            }
        }

        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error: users.txt file not found.");
    }

    return false;

    }
}