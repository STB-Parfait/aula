package Fixação;

import java.util.Scanner;

public class fix1 {
    public static void main(String[] args){

        int matricula;
        String nome;
        float a,b,f;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira [matricula]");
        matricula = leitor.nextInt();

        System.out.println("Insira [nome]");
        nome = leitor.nextLine();
        nome = leitor.nextLine();

        System.out.println("Insira [nota A]");
        a = leitor.nextFloat();

        System.out.println("Insira [nota B]");
        b = leitor.nextFloat();

        f = (a+b)/2;

        if(f>=6){
            System.out.println("-----\n[matricula] " + matricula + "\n[nome] " + nome + "\n[aprovado] [X]Sim [ ]Não" + "\n[nota final] " + f );
        }
        else{
            System.out.println("-----\n[matricula] " + matricula + "\n[nome] " + nome + "\n[aprovado] [ ]Sim [X]Não" + "\n[nota final] " + f );
        }

        leitor.close();

    }
}
