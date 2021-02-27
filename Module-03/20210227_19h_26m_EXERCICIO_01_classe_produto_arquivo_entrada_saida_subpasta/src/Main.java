import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Fazer um programa para ler o caminho de um arquivo .csv
            contendo os dados de itens vendidos. Cada item possui um
            nome, preço unitário e quantidade, separados por vírgula. Você
            deve gerar um novo arquivo chamado "summary.csv", localizado
            em uma subpasta chamada "outFolder" a partir da pasta original do
            arquivo de origem, contendo apenas o nome e o valor total para
            aquele item (preço unitário multiplicado pela quantidade),
            conforme exemplo.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Preciso ler uma lista de produtos de um arquivo de entrada e jogar algumas informações
        //   em um arquivo de saída dentro de um subdiretório

        List<Product> productList = new ArrayList<>(); // Aqui serão armazenados os produtos lidos.

        /*
        O caminho para o exercício será:

         /home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/20210227_19h_26m_EXERCICIO_01_classe_produto_arquivo_entrada_saida_subpasta/src/productListInputFile.csv

         */

        System.out.println("Enter file path: ");
        String inputFilePath = sc.nextLine();

        // Preparo o esqueleto do arquivo de saída e a subpasta onde ele será gravado

        String inputFolderPath = (new File(inputFilePath)).getParent();  // Eu poderia ter colocado o new File(inputFilePath) fora,
                                                                         //    instanciando uma outra variável

        boolean success = new File(inputFolderPath + "/outFolder").mkdir();  // criando o diretório para armazenar o arquivo de saída

        String outputFilePath = inputFolderPath + "/outFolder/summary.csv";  // caminho do arquivo de saída


        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {

            // As linhas do arquivo de entrada vão para uma String

            String productInfo = br.readLine(); // leio a primeira linha do arquivo de entrada

            while (productInfo != null) { // percorro a string com a lista de produtos

                // Jogo os campos separados por vírgula, cada um, numa posição de um vetor de strings

                String[] productFields = productInfo.split(",");

                String name = productFields[0]; // nome do produto na posição zero
                double price = Double.parseDouble(productFields[1]); // preço do produto na posição um
                int quantity = Integer.parseInt(productFields[2]); // quantidade do produto na posição dois

                productList.add(new Product(name, price, quantity)); // jogo cada item na lista, instanciando-o.

                productInfo = br.readLine(); // leio a próxima linha do arquivo de entrada e fico nesse while até a última linha (null)

            }

            // Gravando as saídas

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

                for (Product item : productList) {
                    bw.write(item.getProductName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(outputFilePath + " created successfully!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }


        } catch (IOException e) {

            System.out.println("Error reading file: " + e.getMessage());
        }


    }
}
