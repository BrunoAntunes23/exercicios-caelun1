package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int cont;
      int n=0;
      int m3;
      /*for(cont=150;cont<=300;cont++){
          System.out.println("\n"+cont+"\n");
      }

        for(cont=1;cont<=1000;cont++){
            n+=1;
            System.out.println("\n"+n);

        }

        for(cont=1;cont<=100;cont++){
            if(cont%3==0){
             m3=cont;
                System.out.println("\n"+m3);
            }
        }

        long fat=1,i;
        long fimfat=20;
        for(i=fat;i<=fimfat;i++){
            fat*=i;
            System.out.println("valor fatorial :"+fat);
        }*/

        //sequencia de fibonnaci

        /*int x=1,y=0;
        while(x<=100){
            x=x+y;
            y=x-y;

            System.out.println("\n valor fibannaci :"+x);
        }*/

        int x;
        Scanner scan=new Scanner(System.in);
        System.out.println("insira o valor de x");
        x=scan.nextInt();
        while(x>1) {
            if (x % 2 == 0) {
                x = x / 2;


            } else {
                x = 3 * x + 1;
            }
            System.out.print( x+" ");
        }


    }
}
