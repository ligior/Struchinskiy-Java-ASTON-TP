package binary.calc;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scaner.nextInt();
        System.out.print("Введите число b: ");
        int b = scaner.nextInt();
        int sum, dif_a,dif_b, exp;
        double part_a,part_b;
        if(a>b){
            System.out.println("a>b");
        } else if (a<b) {
            System.out.println("a<b");
        }
        else {
            System.out.println("a=b");
        }
        sum = a+b;
        System.out.println("Сумма равна: "+sum);
        dif_a = a-b;
        System.out.println("Разность a и b равна: "+dif_a);
        dif_b = b-a;
        System.out.println("Разность b и a равна: "+dif_b);
        exp = a*b;
        System.out.println("Произведение равно: "+exp);
        if (b==0) System.out.println("На b делить нельзя, b равно нулю");
        else {
            part_a = (double) a/b;
            System.out.println("Частное a и b равно: "+part_a);
        }
        if (a==0) System.out.println("На a делить нельзя, a равно нулю");
        else {
            part_b= (double) b/a;
            System.out.println("Частное b и a равно: "+part_b);
        }

    }
}
