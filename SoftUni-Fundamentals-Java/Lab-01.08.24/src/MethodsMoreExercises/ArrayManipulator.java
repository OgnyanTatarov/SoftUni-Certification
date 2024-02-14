package MethodsMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String [] input = scanner.nextLine().split(" ");
        while(!input.equals("end"))
        {
            switch (input[0]){
                case "exchange":
                    int index = Integer.parseInt(input[1]);
                    if (index >= array.length)
                    {
                        System.out.println("Invalid index.");
                        return;
                    }
                    else{
                        spitArrayAfterIndex(array,index);
                    }
                    break;
                case "max":
                    String inputType = scanner.nextLine();
                    index = scanner.nextInt();
                    returnMaxEvenOdd(inputType,index);

            }



            input = scanner.nextLine().split(" ");
        }


    }

    private static void spitArrayAfterIndex(int[] array, int index) {
        int j = index + 1 ;
        for (int i = 0; i <= index - 1 ; i++) {
            int tempNumber = array[i];
            array[i] = array[j];
            array[j] = tempNumber;
            j++;
        }
        for (int i = index; i < array.length-1; i++) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

    }
    private static void returnMaxEvenOdd(String typeIndex,int index){

    }
}
