package XE;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        Subject sb=new Subject();
        new USD(sb);
        new GBP(sb);
        new Euro(sb);
        System.out.println("Enter INR value");
        double I=sc.nextDouble();
        sb.setINR(I);
    }

}
