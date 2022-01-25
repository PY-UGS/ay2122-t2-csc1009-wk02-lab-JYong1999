import java.util.Scanner;

public class Lab2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //Calculate Area of Circle
            System.out.print("Enter a number for radius: ");
            float radius = input.nextFloat();
            double PI = 3.14159;
            double area = radius * radius * PI;
            System.out.println ("The area for the circle of radius "+radius+" is "+area);
            //Calculate Average
            System.out.print("Enter three numbers: ");
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float num3 = input.nextFloat();
            float avg = (num1+num2+num3)/3;
            System.out.print("The average of "+num1+" "+num2+" "+num3+" is "+avg);
            //Current Time
            long start = System.currentTimeMillis();
            long totalseconds = start / 1000;
            long currentseconds = totalseconds % 60;
            long totalmins = totalseconds/60;
            long currentmins = totalmins % 60;
            long totalhours = totalmins/60;
            long currenthours = totalhours%24;
            System.out.println("\nCurrent time is " + currenthours + ":" + currentmins + ":" + currentseconds + " GMT");
            //Zodiac Calculator
            System.out.print("Enter a year: ");
            int year = input.nextInt();
            int zodiac = year % 12;
            if (zodiac == 0)
                System.out.println("Monkey");
            if (zodiac == 1)
                System.out.println("Rooster");
            if (zodiac == 2)
                System.out.println("Dog");
            if (zodiac == 3)
                System.out.println("Pig");
            if (zodiac == 4)
                System.out.println("Rat");
            if (zodiac == 5)
                System.out.println("Ox");
            if (zodiac == 6)
                System.out.println("Tiger");
            if (zodiac == 7)
                System.out.println("Rabbit");
            if (zodiac == 8)
                System.out.println("Dragon");
            if (zodiac == 9)
                System.out.println("Snake");
            if (zodiac == 10)
                System.out.println("Horse");
            if (zodiac == 11)
                System.out.println("Sheep");
        }
}