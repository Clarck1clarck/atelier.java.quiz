/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Administrateur
 */
public class Question {
    
    private String titreQuestion;
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String reponse4;
    private int numRepCorrecte;
   
    public void repondreQuestion(){
        
    }

    public String getTitreQuestion() {
        return titreQuestion;
    }

    public void setTitreQuestion(String titreQuestion) {
        this.titreQuestion = titreQuestion;
    }

    public String getReponse1() {
        return reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
    }

    public String getReponse2() {
        return reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
    }

    public String getReponse3() {
        return reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
    }

    public String getReponse4() {
        return reponse4;
    }

    public void setReponse4(String reponse4) {
        this.reponse4 = reponse4;
    }

    public int getNumRepCorrecte() {
        return numRepCorrecte;
    }

    public void setNumRepCorrecte(int numRepCorrecte) {
        this.numRepCorrecte = numRepCorrecte;
    }
    
}

