package RelationalOperator.src;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the positive Number");
        int no = Scanner.nextInt();
        if(no%2==0)
        {
            System.out.println("This is even Number");
        }
        else
        {
            System.out.println("This is Odd Number");
        }

    }
}