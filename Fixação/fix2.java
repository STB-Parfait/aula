
package Fixação;

import java.util.Scanner;

public class fix2 {
    public static void main(String[] srgs){

        Scanner leitor = new Scanner(System.in);

        int[] mat = new int[5];
        String[] nom = new String[5];
        float[] notA = new float[5];
        float[] notB = new float[5];
        float[] notF = new float[5];

        int x;

        for(x=0;x<5;x++){
            System.out.println("-----\nInsira [matricula]");
            mat[x] = leitor.nextInt();

            System.out.println("Insira [nome]");
            nom[x] = leitor.nextLine();
            nom[x] = leitor.nextLine();

            System.out.println("Insira [nota A]");
            notA[x] = leitor.nextFloat();

            System.out.println("Insira [nota B]");
            notB[x] = leitor.nextFloat();

            notF[x] = (notA[x]+notB[x])/2;
        }

        for(x=0;x<5;x++){
            if(notF[x]>=6){
                System.out.println("-----\n[matricula] " + mat[x] + "\n[nome] " + nom[x] + "\n[aprovado] [X]Sim [ ]Não" + "\n[nota final] " + notF[x] );
            }
            else{
                System.out.println("-----\n[matricula] " + mat[x] + "\n[nome] " + nom[x] + "\n[aprovado] [ ]Sim [X]Não" + "\n[nota final] " + notF[x] );
            }
        }

        leitor.close();

    }
}
