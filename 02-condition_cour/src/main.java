import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("IF ELSE-IF ELSE PART");

        // Condition if else-if else
        // Attention l'ordre est tres important

        int[] notes = {8, 14, 14, 12, 11, 16, 6};
        int moyenne = Arrays.stream(notes).sum() / notes.length;
        //int moyenne = 9;
        if (moyenne >= 16) {
            System.out.println("Mention tres bien !");
        }
        else if (moyenne >= 14) {
            System.out.println("Mention bien !");
        }
        else if (moyenne >= 12) {
            System.out.println("Mention asser bien !");
        }
        else if (moyenne >= 10) {
            System.out.println("Tu a le bac");
        }
        else {
            System.out.println("Tu n'a pas le bas !");
        }

        System.out.println("==============================");
        System.out.println("&& ET || PART");

        // Condition && et ||
        int etVer = 15;
        if (etVer >= 10 && etVer <= 20) {
            System.out.println("La chiffre est entre 10 et 20 grace a la condition &&");
        }
        int ouVar = 5;
        if (ouVar == 2 || ouVar == 5) {
            System.out.println("Ton chiffre est 2 ou 5 grace a la condition ||");
        }

        // && = et
        // || = ou
        // ! = not

        System.out.println("==============================");
        System.out.println("BOOLEAN PART");

        // Condition avec boolean
        boolean boolVar = true;
        boolean boolVarDeux = false;
        if (boolVar) {
            System.out.println("La valeur de boolVar est positive");
        }
        if (!boolVarDeux) {
            System.out.println("La valeur de boolVar est negative");
        }

        System.out.println("==============================");
        System.out.println("SWITCH PART");

        // Condition avec switch
        int choix = 2;
        switch(choix){
            case 1:
                System.out.println("Bonjour");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Buenos dias");
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
        //Equivalent a un if else-if else
    }
}
