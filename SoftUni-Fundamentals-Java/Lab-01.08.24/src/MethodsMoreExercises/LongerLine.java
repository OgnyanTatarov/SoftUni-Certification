package MethodsMoreExercises;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        Point point3 = new Point(x3,y3);
        Point point4 = new Point(x4,y4);

        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point3,point4);

        Line longerLine = new Line().getLongerLine(line1,line2);
        findClosestPoint(longerLine.start,longerLine.end);
    }

    public static void findClosestPoint(Point point1, Point point2) {
        double point1Distance = point1.getDistanceToCenter();
        double point2Distance = point2.getDistanceToCenter();
        Line line = new Line();
        if (point2Distance < point1Distance){
            line = new Line(point2,point1);
            line.printLine();
        }
        else{
            line = new Line(point1,point2);
            line.printLine();
        }
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
    static class Line extends Point {
        Point start = new Point();
        Point end = new Point();
        int length = 0;

        public Line(){}

        public Line(Point start,Point end){
            this.start = start;
            this.end = end;
        }

        public double getLength() {
            double length = 0;
            length = Math.sqrt(Math.pow((this.end.x - this.start.x),2) + Math.pow((this.end.y - this.start.y),2));
            return length;
        }

        public Line getLongerLine(Line line1, Line line2){
            if (line1.getLength() < line2.getLength())return line2;
            else return line1;
        }

        public void printLine(){
            System.out.printf("(%d, %d)(%d, %d)",this.start.x,this.start.y,this.end.x,this.end.y);
        }
    }
}
