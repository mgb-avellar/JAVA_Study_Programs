import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
    /home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/listaUrnas.txt
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // estrutura de leitura de arquivo
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String candidate = fields[0];
                int numberVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(candidate)) {
                    int votesSoFar = votes.get(candidate);
                    votes.put(candidate, numberVotes + votesSoFar);
                }
                else {
                    votes.put(candidate, numberVotes);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();



    }
}
