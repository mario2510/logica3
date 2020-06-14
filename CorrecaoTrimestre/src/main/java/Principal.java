import java.util.Scanner;
/**
 *
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Obrigado senhor.....
        Trimestre trimestre = new Trimestre();
        System.out.println("Digite um mes(numeral) : ");
        trimestre.setMes(scanner.nextInt());

        System.out.println(trimestre);


    }
}
