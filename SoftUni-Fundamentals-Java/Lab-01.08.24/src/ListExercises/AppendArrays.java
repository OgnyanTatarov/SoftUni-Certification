package ListExercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfArrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(listOfArrays);
        String output = listOfArrays.toString()
                .replace("[","")
                .replace("]","")
                .replace(",","")
                .replaceAll("\\s+"," ")
                .trim();
        System.out.println(output);
    }
}
