package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHand = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(!firstHand.isEmpty() && !secondHand.isEmpty()){

            if (firstHand.get(0) > secondHand.get(0)){
                int winningCard = firstHand.get(0);
                firstHand.remove(0);
                int losingHand = secondHand.get(0);
                secondHand.remove(0);
                firstHand.add(winningCard);
                firstHand.add(losingHand);
            }else if(firstHand.get(0) < secondHand.get(0))
            {
                int winningCard = secondHand.get(0);
                secondHand.remove(0);
                int losingHand = firstHand.get(0);
                firstHand.remove(0);
                secondHand.add(winningCard);
                secondHand.add(losingHand);
            }else{
                firstHand.remove(0);
                secondHand.remove(0);
            }
        }
        if (firstHand.size() > 0){
            System.out.printf("First player wins! Sum: %d",firstHand.stream().reduce(0,(a,b)-> a + b));
        }else{
            System.out.printf("Second player wins! Sum: %d",secondHand.stream().reduce(0,(a,b)-> a + b));
        }




    }
}
