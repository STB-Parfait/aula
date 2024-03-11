import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args){

        int x,y;

        Scanner leitor = new Scanner(System.in);

        x = leitor.nextInt();
        y = leitor.nextInt();

        int area=x*y;

        System.out.println("A área do retângulo é: " + area);

        leitor.close();
    }

}
