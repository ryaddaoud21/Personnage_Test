package org.example;

public class Personnage {
    private boolean mort;
    private int points;

    public Personnage(boolean m, int p){
        this.mort=m;
        this.points=p;
    }

    public boolean est_Mort(){
        return this.mort;
    }

    public void setMort(){ // je suppose qu'on ne peut que inverser vu que c'est un booleans
        this.mort= !mort;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void Tuer()
    {
        this.points = 0;
        this.mort = true;
    }

    public void attaquer(Personnage cible) {
        if (!this.est_Mort()) { // Vérifier si le personnage attaquant est vivant
            if (!cible.est_Mort()) { // Vérifier si le personnage cible est vivant
                // Réaliser l'attaque en soustrayant des points à la cible
                cible.setPoints(cible.getPoints() - 10); // Exemple de réduction de points
                // Vérifier si la cible est tuée
                if (cible.getPoints() <= 0) {
                    cible.Tuer();
                    System.out.println("Le personnage attaquant a tué le personnage cible !");
                } else {
                    System.out.println("Le personnage attaquant a attaqué le personnage cible !");
                }
            } else {
                System.out.println("Le personnage cible est déjà mort !");
            }
        } else {
            System.out.println("Le personnage attaquant est déjà mort !");
        }
    }
}