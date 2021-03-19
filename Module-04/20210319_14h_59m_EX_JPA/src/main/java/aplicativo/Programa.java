package aplicativo;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Programa {

    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        //Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        //Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        /*
        Abaixo, a instanciação do Entity Manager Factory, usando o nome que demos à persistence-unit do arquivo
        persistence.xml
         */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

        /*
        Agora posso instanciar o Entity Manager
         */

        EntityManager em = emf.createEntityManager();

        /*
        As instanciações acima me dão a conexão com o banco de dados e as questões de persistência de
        dados ficam resolvidas.
         */

        /*
        A seguir, codificaremos as operações para salvar as três pessoas criadas acima no banco de dados.
        Entretanto, nesse ponto mudamos os Id's 1, 2 e 3 das pessoas previamente criadas por 'null', pois
        será o próprio banco de dados que criará os Id's para elas.
         */

        //em.getTransaction().begin();
        //
        //em.persist(p1);  // O 'persist' é o comando que salva algo no banco de dados.
        //em.persist(p2);
        //em.persist(p3);
        //
        //em.getTransaction().commit();

        /*
        O 'getTransaction' quando o JPA faz uma operação que não é uma simples leitura do banco de dados,
        ele precisa fazer uma transação.
         */

        /*
        PARA BUSCAR ALGUM DADO NO BANCO DE DADOS, IMPLEMENTO AS LINHAS ABAIXO, MAS ANTES EU COMENTEI
        A INSTANCIAÇÃO DOS ELEMENTOS (p1, p2 3 p3) E AS LINHAS DE CÓDIGO DA TRANSAÇÃO DE SALVAMENTO
        DAS INSTÂNCIAS NA BASE DE DADOS
         */

        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println();
        System.out.println(p);
        System.out.println("Pronto.");

        /*
        O JPA só remove objetos monitorados, ou seja, aquele que acabamos de buscar e ainda quando não fechamos
        o manager. Então, para remover a pessoa de id 1, temos que fazer uma transação para isso, mas antes,
        precisamos instanciá-la.
         */

        Pessoa p2 = em.find(Pessoa.class, 1);

        em.getTransaction().begin();
        em.remove(p2);
        em.getTransaction().commit();

        System.out.println();
        System.out.println("Pronto.");

        em.close();
        emf.close();

    }

}
