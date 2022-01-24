package warm_up;

import javax.swing.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        q3();
    }

    public static void q1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer as radius of a circle");
        int radius = scanner.nextInt();
        double circum = (2*radius*Math.PI);
        double area = (radius*radius*Math.PI);
        System.out.println("Circumference: " + circum + "\nArea: " + area);
    }

    public static void q2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length side a");
        double a = scanner.nextDouble();
        System.out.println("Enter length side b");
        double b = scanner.nextDouble();
        System.out.println("Enter length side c");
        double c = scanner.nextDouble();
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is = " + area);
    }

    public static void q3(){
         String input;
         double c;
         double f;

         input = JOptionPane.showInputDialog("Enter temperature in Celcius");
         c = Double.parseDouble(input);
         f = 1.8 * c + 32;

         JOptionPane.showMessageDialog(null,"Temperature in Fahrenheit is " + f);
    }

}
