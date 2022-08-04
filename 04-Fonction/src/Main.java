public class Main {
    public static void HelloWorld() {
        System.out.println("Hello World depuis la fonction HelloWorld()");
    }

    public static float getMoyenne(float[] notes) {
        float moyenne = 0;
        for (float note : notes) {
            moyenne += note;
        }
        return moyenne /= notes.length;
    }

    public static int additionEntier(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        HelloWorld();
        float[] arrayNotes = {10, 20};
        float moyenneResult = getMoyenne(arrayNotes);
        System.out.println("La fonction getMoyenne ma calculer une moyenne depuis un tableau de float, moyenne = " + moyenneResult + "/20");
        int resultAdditionEntier = additionEntier(2, 5);
        System.out.println("La fonction additionEntier ma calculer l'addition des deux entiers, resultat = " + resultAdditionEntier);
    }
}
