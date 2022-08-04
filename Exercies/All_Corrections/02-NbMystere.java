import java.io.*;
import java.util.Random;

public class NbMystere {
    public static void main(String[] args) throws IOException {
        Random rand = new Random(); //instance of random class
        final int nb_mystery = rand.nextInt(250);
        int nb_user = 0;

        while (nb_user != nb_mystery) {
            System.out.println("Doner un nombre");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String entry = reader.readLine();
            nb_user = Integer.parseInt(entry);
            if(nb_user < nb_mystery) {
                System.out.println("Le nombre mystere est plus grand !");
            } else if (nb_user > nb_mystery) {
                System.out.println("Le nombre mystère est plus petit !");
            }
        }
        System.out.println("Bravo tu a trouver le nombre mystere !");
        System.out.println("Nombre mystere = " + nb_mystery);
    }
}
