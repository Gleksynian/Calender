package calender;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите ваш год рождения -->");
        int bornyear = scanner.nextInt();

        int color = bornyear - (bornyear/10)*10;
        int animal = bornyear%12;

        System.out.print("Вы родились в год ");

        switch (animal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
                if (color == 0 || color == 1) {
                    System.out.print("белой");
                } else if (color == 2 || color == 3){
                    System.out.print("черной ");
                } else if (color == 4 || color == 5) {
                    System.out.print("зеленой ");
                } else if (color == 6 || color == 7) {
                    System.out.print("красной ");
                } else if (color == 8 || color == 9) {
                    System.out.print("желтой ");
                }
                break;
            
            case 6:
            case 7:
            case 8:
                if (color == 0 || color == 1) {
                    System.out.print("белого ");
                } else if (color == 2 || color == 3){
                    System.out.print("черного ");
                } else if (color == 4 || color == 5) {
                    System.out.print("зеленого ");
                } else if (color == 6 || color == 7) {
                    System.out.print("красного ");
                } else if (color == 8 || color == 9) {
                    System.out.print("желтого ");
                }
                break;
        }

        switch (animal) {
            case 0:
                System.out.println("обезьяны");
                break;
            case 1:
                System.out.println("курицы");
                break;
            case 2:
                System.out.println("собаки");
                break;
            case 3:
                System.out.println("свиньи");
                break;
            case 4:
                System.out.println("крысы");
                break;
            case 5:
                System.out.println("коровы");
                break;
            case 6:
                System.out.println("тигра");
                break;
            case 7:
                System.out.println("зайца");
                break;
            case 8:
                System.out.println("дракона");
                break;
            case 9:
                System.out.println("змеи");
                break;
            case 10:
                System.out.println("лошади");
                break;
            case 11:
                System.out.println("овцы");
                break;
        }
    }
}