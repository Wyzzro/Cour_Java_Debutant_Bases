import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        // Output - La ligne suivant permet d'ecrire dans la console
        System.out.println("Tapper quelque chose dans la console !");

        //Input - Les deux lignes precedentes permet de recuperer ce que l'utilisateur tape dans la console
        //Tant que rien n'est taper dans la console le programme est en pause
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entry = reader.readLine();
        System.out.println("Valeur taper dans la console = " + entry);
    }
}