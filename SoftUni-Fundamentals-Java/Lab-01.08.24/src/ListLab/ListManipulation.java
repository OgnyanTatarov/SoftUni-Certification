package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] command = scanner.nextLine().split(" ");
        while(!command[0].equals("end")){
            switch (command[0]){

                case "Add":
                    int number =Integer.parseInt(command[1]);
                    inputList.add(number);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(command[1]);
                    inputList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(command[1]);
                    inputList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int indexToInsert = Integer.parseInt(command[2]);
                    inputList.add(indexToInsert,numberToInsert);
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        System.out.println(inputList.toString() . replaceAll("[\\[\\],]",""));



    }
}
