package Fixação;

import java.util.Scanner;

public class fix3 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int mat, x;
        String nom;
        int[] not = new int[5];

        System.out.println("[matricula]");
        mat = leitor.nextInt();
        System.out.println("[nome]");
        nom = leitor.nextLine();
        nom = leitor.nextLine();
        for(x=0;x<5;x++){
            System.out.println("[nota " + (x+1) + "]");
            not[x] = leitor.nextInt();
        }
        System.out.println("-----\n[matricula] = " + mat);
        System.out.println("[nome] = " + nom);
        for(x=0;x<5;x++){
            System.out.println("[nota " + (x+1) + "] = " + not[x]);
        }

        leitor.close();

    }
}
