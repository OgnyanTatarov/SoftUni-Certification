package MethodsMoreExercises;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        findClosestPoint(point1,point2);


    }

    private static void findClosestPoint(Point point1, Point point2) {
        double point1Distance = point1.getDistanceToCenter();
        double point2Distance = point2.getDistanceToCenter();
        if (point2Distance < point1Distance)point2.printPoint();
        else point1.printPoint();
    }

    public static class Point{

        public int x = 0;

        public int y = 0;

        public Point(){}

        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        public double getDistanceToCenter() {
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }

        public void printPoint(){
            System.out.printf("(%d, %d)",this.x,this.y);
        }

    }
}
