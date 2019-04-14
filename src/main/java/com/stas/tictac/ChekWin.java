package com.stas.tictac;

import java.util.ArrayList;
import java.util.List;

class ChekWin {
   static int x[][]={{0,3,6},
               {1,4,7},
               {2,5,8},
               {0,1,2},
               {3,4,5},
               {6,7,8},
               {0,4,8},
               {2,4,6}};

    static void isWin(char s, char c[][] ) {

        List<Character>list=new ArrayList<>();
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c[i].length ; j++) {
                char y=c[i][j];
                int count=0;

                list.add(count,y);
                count++;

            }

        }

        for (int i = 0; i <x.length ; i++) {
            if(list.get(x[i][0]).equals(s)&& list.get(x[i][1]).equals(s)&&list.get(x[i][2]).equals(s)){
                System.out.println("Game OVER ,"+s+" Win");
                System.exit(0);
            }else if(!list.contains(' ')){
                System.out.println("Поле заполнено никто не выйграл");
                System.exit(0);


            }

        }



    }
}




