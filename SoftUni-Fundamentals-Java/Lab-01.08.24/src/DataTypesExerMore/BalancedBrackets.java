package DataTypesExerMore;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endPoint = Integer.parseInt(scanner.nextLine());
        boolean areBalanced = false;
        int unbalancedCounter = 0;
        String lastBracket = "";
        for (int i = 0; i < endPoint; i++) {
            String input = scanner.nextLine();
            if (input.equals("(") && !lastBracket.equals("(")){
                lastBracket = "(";
                areBalanced = true;
            }else if (input.equals(")") && lastBracket.equals("(")){
                lastBracket = ")";
                areBalanced = true;
            }else if (!input.equals("(") && !input.equals(")")){
                continue;
            }else{
                areBalanced = false;
                unbalancedCounter +=1;
            }
        }
        if (areBalanced && unbalancedCounter == 0) System.out.println("BALANCED");
        else System.out.println("UNBALANCED");
    }
}
