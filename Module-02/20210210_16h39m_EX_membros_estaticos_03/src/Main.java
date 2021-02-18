import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Versão 3 - programa com classe estática (membros estáticos)

        Fazer um programa para ler um valor numérico qualquer, e daí mostrar
           quanto seria o valor de uma circunferência e do volume de uma esfera
           para um raio daquele valor. Informar também o valor de PI com duas
           casas decimais.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
           Como os membros da classe Calculator não são estaticos (tiramos os static's)
           sou obrigado a instanciar os objetos para poder usá-la.

         */

        // note que não preciso instanciar o objeto com Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); // uso diretamente o nome da classe estática Calculator
        double v = Calculator.volume(radius); // uso diretamente o nome da classe estática Calculator

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI); // uso diretamente o nome da classe estática Calculator

        sc.close();
    }

    /*

        ESSE TIPO DE ABORDAGEM É MUITO ÚTIL QUANDO LIDAMOS COM CLASSES UTILITÁRIAS
        QUE SERVEM APENAS PARA OPERAÇÕES SOBRE VALORES, COMO CALCULADORAS, E ASSIM
        NÃO PRECISAMOS INSTANCIAR OBJETOS; BASTA CHAMAR AS OPERAÇÕES PELA CLASSE
        DIRETAMENTE.

     */
}
