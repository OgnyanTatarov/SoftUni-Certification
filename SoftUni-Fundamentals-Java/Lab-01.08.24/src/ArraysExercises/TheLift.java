package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int state = 0,lenght = lift.length;
        while(peopleWaiting > 0 && state <= lenght -1){
                if (lift[state] < 4) {
                    if (peopleWaiting >= 4) {
                        peopleWaiting -= (4 - lift[state]);
                        lift[state] += (4 - lift[state]);
                    }else {
                        lift[state] +=peopleWaiting;
                        peopleWaiting = 0;
                    }
                    state++;
                }else{

                    peopleWaiting -= (4 - lift[state]);
                    lift[state] +=(4 - lift[state]) ;
                    state++;
                }
        }

        if (lift[state-1] < 4  && peopleWaiting == 0 ){
            System.out.println("The lift has empty spots!");
        }
        else if (state == lift.length  && peopleWaiting > 0){
            System.out.printf("There isn't enough space! %d people in a queue!\n",peopleWaiting);
        }

        for (int i = 0; i < lift.length; i++) {
            System.out.printf("%d ",lift[i]);
        }

    }
}
