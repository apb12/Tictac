package com.stas.tictac;

import java.util.Scanner;

class Main {

    static String string;
    static char ch;
    static char chMachine;
    static char[][]sss={{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете кретик или нолик");
        System.out.println('X' + " у/n ?");
        if (scanner.next().equalsIgnoreCase("y")) {
            ch = 'X';
            chMachine='O';
        } else {
            ch = 'O';
            chMachine = 'X';
        }
        System.out.println("Вы выбрали : "+ch);
        string = scanner.nextLine();


        TicTac.field(sss);
        System.out.println("Начнем игру,введите координаты в формате X,Y,где X это координата по горизонтали ,а Y по вертикали,от 0 до 2");


        Field.userFiled(Input.userInput(),Input.userInput(),ch);
        Field.machineField(Input.machineInput(), Input.machineInput(),chMachine);
        Field.userFiled(Input.userInput(),Input.userInput(),ch);
        Field.machineField(Input.machineInput(), Input.machineInput(),chMachine);
        Field.userFiled(Input.userInput(),Input.userInput(),ch);
        Field.machineField(Input.machineInput(), Input.machineInput(),chMachine);
        ChekWin.isWin(ch,sss);
        ChekWin.isWin(chMachine,sss);
        Field.userFiled(Input.userInput(),Input.userInput(),ch);
        Field.machineField(Input.machineInput(), Input.machineInput(),chMachine);
        ChekWin.isWin(ch,sss);
        ChekWin.isWin(chMachine,sss);
        Field.userFiled(Input.userInput(),Input.userInput(),ch);
        ChekWin.isWin(ch,sss);
        ChekWin.isWin(chMachine,sss);







    }
}



















