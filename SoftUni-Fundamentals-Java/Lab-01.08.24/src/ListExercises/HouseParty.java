package ListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandCount = Integer.parseInt(scanner.nextLine());
        List<String> quests = new ArrayList<>();
        for (int i = 0; i < commandCount; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];
            if (command.length == 3){
                if (!quests.contains(name)) quests.add(name);
                else System.out.println(name + " is already in the list!");

            }else{
                if (!quests.contains(name)) System.out.println(name + " is not in the list!");
                else quests.remove(String.valueOf(name));
            }
        }

        for (String name:quests
             ) {
            System.out.println(name);
        }

    }
}
