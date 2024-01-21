package DataTypesExerMore;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
            String typeInput = "string";
            char character = input.charAt(0);
            if (input.equals("true") || input.equals("false"))typeInput = "boolean";
            else if (input.length() == 1 ){
                if ( character < 48 || character > 57 )typeInput = "character";
                else typeInput= "integer";
            }
            else if(character < 45 || character > 57 || character == 47){typeInput = "string";}
            else if (input.contains("."))typeInput = "floating point";
            else typeInput = "integer";

            System.out.printf("%s is %s type\n",input,typeInput);
            input = scanner.nextLine();
        }
    }
}
