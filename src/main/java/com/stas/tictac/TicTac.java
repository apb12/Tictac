package com.stas.tictac;

class TicTac {
    static void field(char c[][]){
        char line[][]= {{'|', ' ', c[0][0], ' ', c[0][1], ' ', c[0][2], ' ', '|'},
                        {'|', ' ', c[1][0], ' ', c[1][1], ' ', c[1][2], ' ', '|'},
                        {'|', ' ', c[2][0], ' ', c[2][1], ' ', c[2][2], ' ', '|'}
        };
        System.out.println("---------");
        System.out.println(line[2]);
        System.out.println(line[1]);
        System.out.println(line[0]);
        System.out.println("---------");

    }
}

