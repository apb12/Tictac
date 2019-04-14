package com.stas.tictac;

import java.util.Scanner;

public class Input {


    public static int userInput(){
        int d=0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            if (!scanner.hasNextInt()) {
                System.out.println("Неправильный ввод,введите число от  до 2");
                scanner.nextLine();
            }
            else {

               d = scanner.nextInt();
                if (d <= 2 && d >= 0) {

                        break;
                    }


                else System.out.println("Неправильный ввод,введите число от 0 до 2");


            }


        }return d;

    }

    public static int machineInput(){
       return (int)((Math.random())*3);
    }
}
