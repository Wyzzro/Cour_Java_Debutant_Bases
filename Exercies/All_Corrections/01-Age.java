import java.io.*;

public class Age {
    public static void main(String[] args) throws IOException {
        System.out.println("Quel age à tu ?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entry = reader.readLine();
        int age = Integer.parseInt(entry);

        if(age > 18) {
            System.out.println("Tu est Majeur");
        } else if (age == 18) {
            System.out.println("Bravo tu viens d'etre majeur !");
        }
        else {
            System.out.println("Tu est encore mineur !");
        }
    }
}
