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

//1 Saisie du titreDuQuiz du quiz
        System.out.println("Saisissez du titre du quiz : ");
        String titreDuQuiz = scanner.nextLine();
        this.titre = titreDuQuiz;// équivalent à this.titreDuQuiz = scanner.nextLine(); et en supprimant la ligné précédente
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
            int bonneReponse = Integer.valueOf(scanner.nextLine());//Integer.valueOf permet de lire du int en String.
//            int bonneReponse = scanner.nextInt();

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
            //String choix = new Scanner(System.in).nextLine();
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

        String nom;
        int score;

        //0: Titre du quiz
        System.out.println("vous jouer maintenant au quiz : " + this.titre);

        //1: Saisie nom du nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer votre nom: ");
        nom = scanner.nextLine();

        //2: Initialise score EGAL 0
        score = 0;

        //3: Répondre question ( à toutes les questions, une à une )
        for (Question question : questions) {

            System.out.println(question.getTitreQuestion());
            System.out.println("");
            System.out.println("1: " + question.getReponse1());
            System.out.println("2: " + question.getReponse2());
            System.out.println("3: " + question.getReponse3());
            System.out.println("4: " + question.getReponse4());
            System.out.print("Taper votre réponse : ");
            int reponse = scanner.nextInt();

            //4: Incrément scrore (point si bn réponse ou passer à la question suivante)
            if (question.getNumRepCorrecte() == reponse) {
                score++; // ou : score = scrore +1;
            }
        }
        //5: Afficher score
        System.out.println("votre score final est de : " + score);
        System.out.println("");
        System.out.println("Veillez taper sur une touche pour retourner au menu principal.");
        scanner.nextLine();
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
