package tp2_titre.matheo.deknuydt.domaine;

public class Titre {
    private int repere;
    private String libelle;
    private String categorie;

    public Titre(int prepere, String plibelle) {
        this.repere = prepere;
        this.libelle = plibelle;
    }

    public int getRepere() {
        return this.repere;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setRepere(int prepere) {
        this.repere = prepere;
    }

    public void setLibelle(String plibelle) {
        this.libelle = plibelle;
    }

    public void setCategorie(String pcategorie) {
        this.categorie = pcategorie;
    }
}
