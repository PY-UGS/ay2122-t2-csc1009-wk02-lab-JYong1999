import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println ("Hello, I am Joel Yong");
        System.out.println ("Enter module code:");
        Scanner scan = new Scanner(System.in);
        String module = scan.next();

        switch(module)
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating System");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Unknown Module");
                break;
        }
        System.out.println("After switch");

        for(int x = 102; x > 65; x = x - 1)
        {
            int y = x%2;
            if (y==1)
            {
                System.out.println("Value: " + x);
            }
        }
    }
}