/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class PointEntree {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
////        System.out.println("");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
//        scanner.nextLine();
//        
//    }
    public static void main(String[] args) {
        // TODO code application logic here

        //Afficher menue principal avec while
        boolean quitter = false;
        while (quitter == false) {
            //1.Afficher les options possibles
            System.out.println("Menu principal");
            System.out.println("-----------");
            System.out.println("1: Créer quiz");
            System.out.println("2: Jouer quiz");
            System.out.println("3: Quitter");
            //2.scanne
            Scanner scanner = new Scanner(System.in);
            String choix = scanner.nextLine();
            //3.switch
            Quiz quiz = new Quiz();
            switch (choix) {
                case "1":
                    quiz.creerQuiz();
                    break;
                case "2":
                    quiz.jouerQuiz();
                    break;
                case "3":
                    quitter = true;
                    break;
                default:
                    System.out.println("Commande inconue");
                    break;
            }
        }
    }
    

}
