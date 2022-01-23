package warm_up;

import java.util.Scanner;

public class Loops {

    //http://www.beginwithjava.com/java/loops/questions.html

    public static void main(String[] args) {
        question5();
    }

    public static void question1(){
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }

    public static void question2(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
           sum += i;
        }
        System.out.println(sum);
    }

    public static void question3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a positive integer");
        int input = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d \n", input, i, input * i);
        }
    }

    public static void question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a positive integer");
        int input = scanner.nextInt();
        int fact = 1;

        for (int i = 1; i<= input; i++){
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void question5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two positive integer");
        int input = scanner.nextInt();
        int input2= scanner.nextInt();
        int raised = 1;

        for (int i = 1; i <= input2; i++) {
            raised *= input;
        }
        System.out.println(raised);
    }
}
