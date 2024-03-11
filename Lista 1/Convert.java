import java.util.Scanner;
public class Convert {
    public static void main(String[] args){

        float real;

        Scanner leitor = new Scanner(System.in);

        real = leitor.nextFloat();

        float dolar = real / 5.17f;
        float euro = real / 6.14f;
        float peso = real / 0.05f;

        System.out.println("\n ----- \n");
        System.out.println("Dólar: " + dolar);
        System.out.println("Euro: " + euro);
        System.out.println("Peso: " + peso);

        leitor.close();

    }
}
