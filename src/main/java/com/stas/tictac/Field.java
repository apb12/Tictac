package com.stas.tictac;

class Field {
    static void userFiled(int x, int y, char c) {

        System.out.println("Вы ввели X= " + x + " Y= " + y);
        while (true)
        if (Main.sss[x][y] != ' ') {
            System.out.println("Клетка занята ,введи новые координаты");
            x = Input.userInput();
            y = Input.userInput();

        } else {
            System.out.println("Наконец то ты справился))) X= "+x+" Y= "+y);
            Main.sss[x][y] = c;
            TicTac.field(Main.sss);
            break;
        }
    }
    static void machineField(int x,int y,char c){
        System.out.println("Теперь мой ход");
        while (true)
            if (Main.sss[x][y] != ' ') {
                System.out.println("Клетка занята ,ввожу новые координаты");
                x = Input.machineInput();
                y = Input.machineInput();

            } else {
                System.out.println("Извини,что я так долго вожусь ;) X= "+x+" Y= "+y);
                Main.sss[x][y] = c;
                TicTac.field(Main.sss);
                System.out.println("Вводи следующие координаты");
                break;
            }

    }
}