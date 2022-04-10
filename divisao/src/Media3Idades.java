import java.util.Scanner;

/**
 * Esse algoritmo tem como objetivo efetuar o cálculo do exercício abaixo:
 * A média da idade de pessoa a + pessoa b = x
 * a média da idade de pessoa a + pessoa b + pessoa c = y
 * qual a idade a pessoa c?
 *
 * @author Nayara Coca
 */
public class Media3Idades {

    public static void main(String[] args) {
        //média da idade das primeiras 2 pessoas
        int a;
        //média da idade das 3 pessoas
        int b;
        //resultado do cálculo
        int r;

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a média da idade de 2 pessoas: ");
        a = ler.nextInt();
        System.out.println("Insira a média da idade de 3 pessoas: ");
        b = ler.nextInt();
        //cálculo da idade da terceira pessoa

        r = (b*3) - (a*2);
        System.out.println("A idade da terceira pessoa é :\n" + r);
}}
