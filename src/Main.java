import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite números (digite -1 para parar):");

        int numero;
        while (true) {
            numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }

        int soma = calcularSoma(numeros);
        System.out.println("A soma é: " + soma);
    }

    public static int calcularSoma(List<Integer> numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }
}
