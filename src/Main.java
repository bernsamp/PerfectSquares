import java.util.Scanner;

public class Main{

    public static void perfectSquares(int a, float b){

        int number = (int) Math.ceil(Math.sqrt(a));

        int number2 = number * number;

        number = (number * 2) + 1;

        while ((number2 >= a && number2 <= b)){

            System.out.println(number2 + " - Perfect Square of " + (number/2));

            number2 += number;

            number += 2;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting range:");
        int startingRange = sc.nextInt();

        System.out.println("Enter ending range:");
        int endingRange = sc.nextInt();

        perfectSquares(startingRange, endingRange);
    }
}