package Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        int tries = 0;
        for (int letters = username.length()-1; letters >= 0 ; letters--) {
            password += username.charAt(letters);
        }
        String input = scanner.nextLine();
        while (!input.equals(password) && tries < 3) {
            tries++;
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (tries >= 3 && !input.equals(password) ) {
            System.out.printf("User %s blocked!",username);
            return;
        }else System.out.printf("User %s logged in.", username);
    }
}
