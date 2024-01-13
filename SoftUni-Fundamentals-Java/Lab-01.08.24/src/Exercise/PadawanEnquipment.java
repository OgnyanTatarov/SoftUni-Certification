package Exercise;

import java.util.Scanner;

public class PadawanEnquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double availableMoney = scanner.nextDouble();
        int studentsCount = scanner.nextInt();
        double lightsaberPrice = scanner.nextDouble();
        double robePrice = scanner.nextDouble();
        double beltPrice = scanner.nextDouble();
        double moneyNeeded = 0;
        int freeBelts = studentsCount / 6;
        double priceLighsabers , priceRobes,priceBelts;
        priceLighsabers = Math.ceil(studentsCount * 1.1) * lightsaberPrice;
        priceBelts = (studentsCount - freeBelts) * beltPrice;
        priceRobes = studentsCount * robePrice;

        moneyNeeded = priceLighsabers + priceBelts + priceRobes;
        if (moneyNeeded <= availableMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",moneyNeeded);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",moneyNeeded - availableMoney);
        }
    }
}
