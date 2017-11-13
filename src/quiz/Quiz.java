/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Quiz {

    private String titre;
    private ArrayList<Question> questions = new ArrayList<>();

    public void creerQuiz() {
        Scanner scanner = new Scanner(System.in);

//1 Saisie du titre du quiz
        System.out.println("Saisissez du titre du quiz : ");
        String titre = scanner.nextLine();
        this.titre = titre;// équivalent à this.titre = scanner.nextLine(); et en supprimant la ligné précédente
//2 Saisie questions et les 4 réposes associé et la bonne réponse
        boolean quitter = false;
        while (quitter == false) {
            System.out.println("Saisissez votre question :");
            String titreQuestion = scanner.nextLine();
            System.out.println("Saisissez réponse n°1 :");
            String reponse1 = scanner.nextLine();
            System.out.println("Saisissez réponse n°2 :");
            String reponse2 = scanner.nextLine();
            System.out.println("Saisissez réponse n°3 :");
            String reponse3 = scanner.nextLine();
            System.out.println("Saisissez réponse n°4 :");
            String reponse4 = scanner.nextLine();
            System.out.println("Saisissez la bonne réponse : ");
            int bonneReponse = Integer.valueOf( scanner.nextLine() );

            Question nouvelleQuestion = new Question();
            nouvelleQuestion.setTitreQuestion(titreQuestion);
            nouvelleQuestion.setReponse1(reponse1);
            nouvelleQuestion.setReponse2(reponse2);
            nouvelleQuestion.setReponse3(reponse3);
            nouvelleQuestion.setReponse4(reponse4);
            nouvelleQuestion.setNumRepCorrecte(bonneReponse);

//3 Ajouter cette nouvelle question réponse à la liste des questions du quiz
            this.questions.add(nouvelleQuestion);
            //4 Demander à l'utilisateur s'il veur entrer une nouvelle titreQuestion
            System.out.println("Voulez vous rentrer une nouvelle question ?");
            System.out.println("1 : Oui");
            System.out.println("2 : Non");
            String choix = scanner.nextLine();
            
            switch (choix) {
                case "1":
                    break;
                case "2":
                    quitter = true;
                    break;
                default:
                    System.out.println("Cette commande est inconnue");
                    break;
            }
        }
    }

    public void jouerQuiz() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

}
