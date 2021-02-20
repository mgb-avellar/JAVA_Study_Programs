import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
            podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
            bem como o total de imposto arrecadado.
            Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
            são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
            seguintes:
            Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
            renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
            destes gastos são abatidos no imposto.
            Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
            fica: (50000 * 25%) - (2000 * 50%) = 11500.00
            Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
            funcionários, ela paga 14% de imposto.
            Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
            400000 * 14% = 56000.00

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> listaContribuinte = new ArrayList<>();

        System.out.println();
        System.out.print("Entre com o número de contribuintes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Contribuinte #" + (i+1) + " data: ");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if ( resp == 'f' ) {

                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();

                Contribuinte contribuinte = new PessoaFisica(nome, renda, gastosSaude);

                listaContribuinte.add(contribuinte);
            }
            else if ( resp == 'j' ) {

                System.out.print("Número de funcionários: ");
                int numeroFuncionario = sc.nextInt();

                Contribuinte contribuinte = new PessoaJuridica(nome, renda, numeroFuncionario);

                listaContribuinte.add(contribuinte);
            }

        }

        System.out.println();
        System.out.println("IMPOSTO PAGO:");

        for (Contribuinte cont : listaContribuinte) {

            System.out.println(cont.getNomeContribuinte() + ": $ "
                    + String.format("%.2f", cont.impostoPago()));
        }

        double somaImpostos = 0.0;

        for (Contribuinte cont : listaContribuinte) {

            somaImpostos += cont.impostoPago();
        }

        System.out.println();
        System.out.println("IMPOSTO TOTAL: $ " + String.format("%.2f", somaImpostos));



        sc.close();

    }
}
