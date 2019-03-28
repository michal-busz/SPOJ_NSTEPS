package it.busz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for(;num>0;num--){
            String txt = input.nextLine();
            String []temp = txt.split(" ");
            System.out.println(getNumber(Integer.parseInt(temp[0]),Integer.parseInt(temp[1])));
        }
    }

    private static String getNumber(int x, int y){
        if(x-y==2)
        {
            return Integer.toString(calculate(2,y));
        } else if (x == y) {
            return Integer.toString(calculate(0,x));
        }
        else
            return "No Number";
    }
    private static int calculate(int base, int steps)
    {
        for(int i=0;i<steps;i++)
        {
            if(i%2==0)
                base+=1;
            else
                base+=3;
        }
        return base;
    }
}
