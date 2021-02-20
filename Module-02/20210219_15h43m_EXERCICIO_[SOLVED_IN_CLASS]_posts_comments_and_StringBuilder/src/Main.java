import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        /*
            Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
na tela do terminal, conforme exemplo.

Traveling to New Zealand
12 Likes - 21/06/2018 13:05:44
I'm going to visit this wonderful country!
Comments:
Have a nice trip
Wow that's awesome!

Good night guys
5 Likes - 28/07/2018 23:14:19
See you tomorrow
Comments:
Good night
May the Force be with you

         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc =  new Scanner(System.in);

        // Comment c1 = new Comment("Have a nice trip!");
        // Comment c2 = new Comment("Wow that's awesome!");

        /*
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
         */

        Comment c1 = new Comment();
        Comment c2 = new Comment();

        System.out.println("Entre com o primeiro comentário: ");
        String comment1 = sc.nextLine();
        System.out.println("Entre com o segundo comentário: ");
        String comment2 = sc.nextLine();

        c1.setText(comment1);
        c2.setText(comment2);


        System.out.print("Data (DD/MM/YYYY HH:mm:ss): ");
        String postDate = sc.nextLine();
        System.out.println("Entre com o título do post: ");
        String postTitle = sc.nextLine();
        System.out.println("Entre com o conteúdo do post: ");
        String postContent = sc.nextLine();
        System.out.println("Entre com o número de likes do post: ");
        int likes = sc.nextInt();
        sc.nextLine();

        Post p1 = new Post(
                sdf.parse(postDate),
                postTitle,
                postContent,
                likes);


        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

        sc.close();
    }
}
