package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");

        while(!commands[0].equals("End")){

            if (commands[0].equals("Add"))inputList.add(Integer.parseInt(commands[1]));
            else if (commands[0].equals("Insert")){
                int index = Integer.parseInt(commands[2]);
                if (index >= 0 && index <= inputList.size()) inputList.add(index,Integer.parseInt(commands[1]));
                else System.out.println("Invalid index");
            }
            else if (commands[0].equals("Remove")){
                int index = Integer.parseInt(commands[1]);
                if (index >= 0 && index < inputList.size()) inputList.remove(index);
                else System.out.println("Invalid index");
            }
            else if (commands[1].equals("left")){
                int count = Integer.parseInt(commands[2]);
                for (int i = 0; i < count; i++) {
                    int temp = inputList.remove(0);
                    inputList.add(temp);
                }
            }
            else{
                int count = Integer.parseInt(commands[2]);
                List<Integer> shiftedNumbers = new ArrayList<>(inputList.subList(inputList.size() - count, inputList.size()));
                shiftedNumbers.addAll(inputList.subList(0, inputList.size() - count));
                inputList.clear();
                inputList.addAll(shiftedNumbers);

            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));
    }
}
