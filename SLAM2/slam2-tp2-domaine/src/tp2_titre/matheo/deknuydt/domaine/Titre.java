package tp2_titre.matheo.deknuydt.domaine;

public class Titre {
    private int repere;
    private String libelle;
    private Categorie categorie;

    public Titre(int prepere, String plibelle, Categorie pcategorie) {
        this.repere = prepere;
        this.libelle = plibelle;
        this.categorie = pcategorie;
    }

    public int getRepere() {
        return this.repere;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getCategorie() { return this.categorie.getLibelle(); }

    public void setRepere(int prepere) {
        this.repere = prepere;
    }

    public void setLibelle(String plibelle) {
        this.libelle = plibelle;
    }

    public void setCategorie(Categorie pcategorie) {
        this.categorie = pcategorie;
    }
}
