package tp2_titres.matheo.deknuydt.programs;

import tp2_titre.matheo.deknuydt.domaine.Titre;
import tp2_titre.matheo.deknuydt.services.ServiceTitres;
import java.util.List;

public class ProgrammePrincipalV_1_0 {
    public static void main(String[] args) {
        // Création des objets
        Titre titre1 = new Titre(1, "Mon Titre");
        Titre titre2 = new Titre(2, "Mon Nouveau 2e Titre");
        Titre titreM = new Titre(13, "Matheo Titre");
        ServiceTitres serviceTitre = new ServiceTitres();

        // Variables et utilisations méthodes de la classe Titre
        String libelle = titre1.getLibelle();
        String categorie = titre2.getCategorie();
        int repere = titre1.getRepere();
        titre1.setCategorie("Nouvelle Catégorie");
        titre2.setLibelle("Mon nouveau Super Titre");
        titre1.setRepere(3);

        System.out.println("Libellé de titre1 : " + libelle);
        System.out.println("Catégorie de titre2 : " + categorie);
        System.out.println("Repère de titre1 : " + repere);

        // Variables et utilisations méthodes de la classe ServiceTitres
        try {
            serviceTitre.ajouteTitre(titre2);
            serviceTitre.ajouteTitre(new Titre(4, "Titre nouveau1"));
            serviceTitre.ajouteTitre(new Titre(5, "Titre nouveau2"));
            serviceTitre.ajouteTitre(new Titre(6, "Titre nouveau3"));
            serviceTitre.ajouteTitre(new Titre(7, "Titre nouveau4"));
            serviceTitre.ajouteTitre(new Titre(8, "Titre nouveau5"));
            serviceTitre.ajouteTitre(new Titre(9, "Titre nouveau6"));
            serviceTitre.ajouteTitre(new Titre(10, "Titre nouveau7"));
            serviceTitre.ajouteTitre(new Titre(11, "Titre nouveau8"));
            serviceTitre.ajouteTitre(new Titre(12, "Titre nouveau9"));
            serviceTitre.ajouteTitre(new Titre(14, "Titre nouveau10"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean existe = false;
        try {
            existe = serviceTitre.existeTitre(libelle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List categories = null;
        try {
            categories = serviceTitre.lesCategories();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List titresCategories = null;
        try {
            titresCategories = serviceTitre.lesTitresDeLaCategorie(titre1.getCategorie());
        } catch (Exception e) {
            e.printStackTrace();
        }
        List tousTitre = null;
        try {
            tousTitre = serviceTitre.tousLesTitres();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(existe);
        System.out.println("Les catégories : " + categories);
        System.out.println("Les titres de la catégorie : " + titresCategories);
        System.out.println("Tous les titres : " + tousTitre);
    }
}
