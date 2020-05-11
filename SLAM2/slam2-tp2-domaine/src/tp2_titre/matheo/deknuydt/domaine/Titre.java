package tp2_titre.matheo.deknuydt.domaine;

public class Titre {
    private int repere;
    private String libelle;
    private Categorie categorie;

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

    public Categorie getCategorie() { return this.categorie; }

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
