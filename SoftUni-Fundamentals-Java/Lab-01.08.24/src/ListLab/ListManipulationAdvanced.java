package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] command = scanner.nextLine().split(" ");
        while(!command[0].equals("end")){
            switch (command[0]){
                case "Contains":
                    int targetNumber = Integer.parseInt(command[1]);
                    if (inputList.contains(targetNumber)) System.out.println("Yes");
                    else System.out.println("No such number");
                    break;
                case "Print":
                    if (command[1].equals("even")){
                        List<Integer> evenNumbers = inputList.stream()
                                .filter(num -> num % 2 == 0)
                                .collect(Collectors.toList());

                        System.out.println(evenNumbers.toString().replaceAll("[\\[\\],]",""));
                    }
                    else{
                        List<Integer> oddNumbers = inputList.stream()
                                .filter(num -> num % 2 != 0)
                                .collect(Collectors.toList());
                        System.out.println(oddNumbers.toString().replaceAll("[\\[\\],]",""));
                    }

                    break;
                case "Get":
                        int sum = inputList.stream().reduce(0, (a, b) -> a + b);
                    System.out.println(sum);
                    break;
                case "Filter":
                    List<Integer> FilterdNumbers = new ArrayList<>();
                    final int filteringNumber = Integer.parseInt(command[2]);
                    switch (command[1])
                    {
                        case ">":
                            FilterdNumbers = inputList.stream()
                                    .filter(num -> num > filteringNumber)
                                    .collect(Collectors.toList());
                            break;

                        case "<":
                            FilterdNumbers = inputList.stream()
                                    .filter(num -> num < filteringNumber)
                                    .collect(Collectors.toList());
                            break;

                        case ">=":
                            FilterdNumbers = inputList.stream()
                                    .filter(num -> num >= filteringNumber)
                                    .collect(Collectors.toList());
                            break;

                        case "<=":
                            FilterdNumbers = inputList.stream()
                                    .filter(num -> num <= filteringNumber)
                                    .collect(Collectors.toList());
                            break;
                    }
                    System.out.println(FilterdNumbers.toString().replaceAll("[\\[\\],]",""));
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        //System.out.println(inputList.toString() . replaceAll("[\\[\\],]",""));
    }
}
