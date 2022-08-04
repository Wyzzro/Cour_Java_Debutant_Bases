import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("Variables values");
        System.out.println("========================================");

        int age = 18; //Entier
        boolean majeur = true;//Boolean donc true ou false
        String nom = "Ethan"; //Chaine de caractere
        double prix = 15.98; //nombre a virgule
        final double pi = 3.14; //constante, ne peut plus etre modifier grace a final
        System.out.println("age = " + age);
        System.out.println("majeur = " + majeur);
        System.out.println("nom = " + nom);
        System.out.println("prix = " + prix);
        System.out.println("pi = " + pi);

        System.out.println("========================================");
        System.out.println("Calcules");
        System.out.println("========================================");

        int calcul = 15 + 8;
        int varPlusUn = calcul++;
        int calculeAvecVar = calcul + varPlusUn;
        double calculAvirgule = 7.0 / 2.0;
        double calculSansVirgule = 7 / 2;

        System.out.println("varPlusUn = " + varPlusUn);
        System.out.println("calculAvirgule = " + calculAvirgule);
        System.out.println("calculeAvecVar = " + calculeAvecVar);
        System.out.println("calculSansVirgule = " + calculSansVirgule);

        System.out.println("========================================");
        System.out.println("Tableaux");
        System.out.println("========================================");

        int[] notes = {14, 8, 16, 11, 11, 12, 6, 15};
        String[] eleves = {"Benoit", "Francois", "Julien", "Camille", "Lisa"};

        int sommesNotes = notes[0] + notes[1] + notes[2] + notes[3] + notes[4] + notes[5] + notes[6] + notes[7];
        int moyenneNotes = sommesNotes / notes.length;

        System.out.println("1ere note du tableau = " + notes[0]);
        System.out.println("3eme note du tableau = " + notes[2]);
        System.out.println("nombres de notes dans le tableau = " + notes.length);
        System.out.println("moyenne des notes = " + moyenneNotes);
        System.out.println("dernier eleve du tableau = " + eleves[eleves.length - 1]);
    }
}
