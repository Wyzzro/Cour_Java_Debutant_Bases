public class Main {

    /*
    Cette fonction prend en paramètre un tableau de boolean, ce tableau correspond à toutes les ventes faites, quand
    la valeur est à false la vente n'a pas été accomplie, quand il est à true la vente à réussie. Vous devez retourner
    le nombre de ventes réussites.
     */
    public static int countNbVentesReussites(boolean[] tableauxVentes) {
        //Exercice 1 : coder cette fonction ici !
        //Difficulté : Facile
    }

    /*
    Cette fonction prend en paramètre un tableau d'int, ce tableau contient tous les chiffres d'affaires de chaque mois
    sur 15 mois. Vous devez retourner le nombre de mois ou le chiffre d'affaires a été supérieur à 1200$.
     */
    public static int countNbChiffreAffaireSupperieurSmic(int[] tableauxChiffresAffaires) {
        //Exercice 2 : coder cette fonction ici !
        //Difficulté : Facile
    }

    public static void main(String[] args) {
        /*
        Ne modifiez pas le code ci-dessous, une fois vos fonctions codées exécutées le programme, la console vous diras 
        si vous avez réussie le test ou non !
        */
        boolean[] ventesReussites = {true, false, false, false, true, false, true, true, true, true, true, false, true, true};
        int[] chiffreAffaireParMois = { 954, 1207, 1675, 1184, 2205, 994, 1352, 2099, 650, 842, 1200, 1198, 754, 854, 3298};

        //Test exercidce Nombre Ventes Reussites
        if (countNbVentesReussites(ventesReussites) == 9) {
            System.out.println("Tu as reussi l'exercice sur le nombre de ventes reussites !");
        }
        else {
            System.out.println("Ho ho erreur, tu n'as pas réussie l'exercice du nombre de ventes réussites, réessaye !");
        }

        //Test exercidce Nombre Chiffre d'affaire supperieur a 1200
        if(countNbChiffreAffaireSupperieurSmic(chiffreAffaireParMois) == 7) {
            System.out.println("Tu as reussi l'exercice sur le nombre de chiffre d'affaire superieur a 1200 !");
        }
        else {
            System.out.println("Ho ho erreur, tu n'as pas réussie l'exercice du nombre de chiffre d'affaire superieur a 1200 !, réessaye !");
        }
    }

}
