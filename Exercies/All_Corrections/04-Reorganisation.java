import java.util.Arrays;
import java.util.Collections;

public class Main {

    /*
    Cette fonction prend en paramètre un tableau d'int désordonné. Vous devez retourner un tableau contenant tous les
    chiffres de celui passer en paramètre, mais cette fois si tous les chiffres doivent être dans l'ordre descendant
    (le plus gros nombre en 1er et le plus petit nombre en dernier).
     */
    public static int[] reorderDesc(int[] disorganizeArray) {
        int[] badArray = disorganizeArray.clone();
        int[] newArray = disorganizeArray.clone();
        int temp = 0;
        int indexNewArray = 0;
        while (indexNewArray < 10) {
            int tempIndex = 0;
            for (int i = 0; i < badArray.length; i++) {
                if (i == 0 || badArray[i] > temp) {
                    temp = badArray[i];
                }
            }
            for (int i = 0; i < badArray.length; i++) {
                if (badArray[i] == temp) {
                    tempIndex = i;
                }
            }
            newArray[indexNewArray] = temp;
            badArray[tempIndex] = 0;
            indexNewArray++;
        }
        return newArray;
    }

    /*
    Cette fonction prend en paramètre le tableau d'int que vous avez réorganisé dans l'ordre descendant. Vous devez
    retourner ce tableau avec cette fois-ci les valeurs dans l'ordre ascendant. (du plus petit au plus grand).
    Forcément, vous devez avoir réussi l'exercice précédent pour commencer celui-ci !
    - Astuce : Vous avez juste à inverser les valeurs du tableau !
     */
    public static int[] reorderAsc(int[] arrayDesc) {
        int[] newArrayDesc = arrayDesc.clone();
        int[] goodArray = arrayDesc.clone();
        for (int i = 0; i < newArrayDesc.length; i++) {
            if (i == 0) {
                goodArray[i] = newArrayDesc[newArrayDesc.length - 1];
            }
            else {
                goodArray[i] = newArrayDesc[newArrayDesc.length - i - 1];
            }
        }
        return goodArray;
    }

    public static int[] reorganiseAscArrayBonusSolution(int[] disorganizeArray) {
        int[] newArray = disorganizeArray.clone();
        Arrays.sort(newArray);
        return newArray;
    }

    public static int[] reorganiseDescArrayBonusSolution(int[] disorganizeArray) {
        int[] newArray = disorganizeArray.clone();
        int[] arrDesc = Arrays.stream(newArray).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return newArray;
    }

    /*
        Ne modifiez rien au code suivant, c'est ce code qui permet de vous dire si vous avez réussi les exercices ou non !
     */
    public static void main(String[] args) {
        int[] disorganizeArray = { 5, 1, 14, 16, 7, 3, 21, 19, 32, 29};
        int[] userArrayDesc = reorderDesc(disorganizeArray);
        int[] userArrayAsc = reorderAsc(userArrayDesc);

        if (testSuccessDesc(userArrayDesc)) {
            System.out.println("Bravos, tu as reussi l'exercice dans le sens descendant !");
        }
        else {
            System.out.println("Mince, tu as une erreur sur le sens descendant, reessayes !");
        }

        if (testSuccessAsc(userArrayAsc)) {
            System.out.println("Bravos, tu as reussi l'exercice dans le sens ascendant !");
        }
        else {
            System.out.println("Mince, tu as une erreur sur le sens ascendant, reessayes !");
        }
    }

    public static boolean testSuccessDesc(int[] resultTab) {
        int[] GoodResult = { 32, 29, 21, 19, 16, 14, 7, 5, 3, 1};
        return Arrays.equals(resultTab, GoodResult);
    }

    public static boolean testSuccessAsc(int[] resultTab) {
        int[] GoodResult = { 1, 3, 5, 7, 14, 16, 19, 21, 29, 32};
        return Arrays.equals(resultTab, GoodResult);
    }
}
