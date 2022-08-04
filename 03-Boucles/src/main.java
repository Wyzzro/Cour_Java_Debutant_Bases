import java.io.*;

public class main {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("BOUCLES FOR CONCEPT");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("==============================");
        System.out.println("BOUCLES FOR EXEMPLE CONCRET");
        int[] notes = {14, 12, 16, 15, 11, 8, 12, 17, 6};
        int moyenne = 0;
        for (int i = 0; i < notes.length - 1; i++) {
            moyenne += notes[i];
        }
        moyenne /= notes.length;
        System.out.println("la boucle for a parcourue le tableau pour calculer la moyenne qui est de " + moyenne + "/20");

        System.out.println("==============================");
        System.out.println("BOUCLES FOREACH");
        int[] notesForeach = {16, 18, 16, 18, 16, 18, 16, 18, 16};
        float moyenneForeach = 0;
        for (int note : notesForeach) {
            moyenneForeach += note;
        }
        moyenneForeach /= notesForeach.length;
        System.out.println("La boucle foreach est similaire a la boucle for mais a une meilleur syntax, elle a calculer une moyenne de " + moyenneForeach + "/20");

        System.out.println("==============================");
        System.out.println("BOUCLES WHILE");

        int nbMoutons = 0;
        System.out.print("Je compte ");
        // Execute tant que la condition est valider
        while (nbMoutons < 13) {
            nbMoutons += 1;
            if (nbMoutons < 10) {
                System.out.print(nbMoutons + " mouton, ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.println(", Je me suis endormi !");

        System.out.println("==============================");
        System.out.println("BOUCLES DO WHILE");

        int dovar = 10;
        // Execute obligatoirement une fois la boucle puis ensuite uniquement si la condition est respecter
        do {
            dovar++;
            System.out.println(dovar);
        } while (dovar < 10);
    }
}
