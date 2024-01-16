package DataTypesLab;

import java.util.Scanner;

public class RefactorVolumePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double lengthPyramid = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double widthPyramid = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double heightPyramid = Double.parseDouble(scanner.nextLine());
        double volumePyramid = (lengthPyramid * widthPyramid * heightPyramid) / 3;
        System.out.printf("Pyramid Volume: %.2f", volumePyramid);
    }
}
