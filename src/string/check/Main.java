package string.check;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String txt1,txt2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку:\n");
        txt1 = scanner.nextLine();
        System.out.print("Введите вторую строку:\n");
        txt2 = scanner.nextLine();
        if (txt1.equals(txt2)) System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }
}
