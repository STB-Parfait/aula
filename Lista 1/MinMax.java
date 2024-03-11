import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int a,b;

        a = leitor.nextInt();
        b = leitor.nextInt();

        if(a>b){
            System.out.println("A é maior que B");
        }
        else if(b>a){
            System.out.println("B é maior que A");
        }
        else{
            System.out.println("Os dois números são iguais");
        }

        leitor.close();
    }
}
