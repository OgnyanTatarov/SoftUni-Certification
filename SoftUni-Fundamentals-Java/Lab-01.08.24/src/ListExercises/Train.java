package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");
        while(!input[0].equals("end")){
            if (input[0].equals("Add")){
                int passengers = Integer.parseInt(input[1]);
                wagons.add(passengers);
            }else{
                int passengers = Integer.parseInt(input[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + passengers <= maxPassengers){
                        currentWagon += passengers;
                        wagons.set(i,currentWagon);
                    break;
                    }
                }
            }

            input = scanner.nextLine().split(" ");
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));


    }
}
