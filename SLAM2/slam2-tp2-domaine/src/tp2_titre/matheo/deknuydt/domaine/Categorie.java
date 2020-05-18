package tp2_titre.matheo.deknuydt.domaine;

import tp2_titre.domaine.utilitaires.GenereIds;

public class Categorie {
    private int id;
    private String libelle;
    private String abreviation;

    public Categorie(String plibelle, String pabreviation) {
        this.id = GenereIds.getId();
        this.libelle = plibelle;
        this.abreviation = pabreviation;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getId() {
        return id;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
