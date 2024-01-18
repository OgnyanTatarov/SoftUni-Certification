package DataTypesExer;

import java.util.Scanner;


public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokeMonePower = scanner.nextInt();
        int distanceTarget = scanner.nextInt();
        int exhaustionFactor = scanner.nextInt();
        int countPokes = 0, totalPokesWithoutDivision = pokeMonePower / distanceTarget,
        totalPokePowerUsed = totalPokesWithoutDivision / 2 * distanceTarget, initialPower = pokeMonePower;
// Doing the task by using maths
        if ( totalPokePowerUsed == pokeMonePower * 0.5 ){
            countPokes += totalPokesWithoutDivision / 2 ;
            if (isDevisionPosible(pokeMonePower - totalPokePowerUsed,exhaustionFactor)){
                pokeMonePower -= (countPokes * distanceTarget);
                pokeMonePower /= exhaustionFactor;
                int currentPokes = countPokes;
                countPokes += pokeMonePower / distanceTarget;
                pokeMonePower -= (countPokes - currentPokes) * distanceTarget;
            }
            else {
                pokeMonePower -= (countPokes * distanceTarget);
                int currentPokes = countPokes;
                countPokes += pokeMonePower / distanceTarget;
                pokeMonePower -= (countPokes - currentPokes) * distanceTarget;
            }
        }else
        {
            countPokes += totalPokesWithoutDivision;
            pokeMonePower -= countPokes * distanceTarget;
        }

// Doing the task using while loop
//        while(pokeMonePower >= distanceTarget){
//            if (pokeMonePower == initialPower * 0.5 && isDevisionPosible(pokeMonePower,exhaustionFactor))
//            {
//                pokeMonePower/=exhaustionFactor;
//                continue;
//            }
//            countPokes++;
//            pokeMonePower -= distanceTarget;
//        }
        System.out.println(pokeMonePower);
        System.out.println(countPokes);
    }

    private static boolean isDevisionPosible(int number,int divider) {
        if (number >= divider && divider != 0)return true;
        else return false;
    }
}
