package tp2_titre.matheo.deknuydt.services;

import tp2_titre.matheo.deknuydt.domaine.Titre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServiceTitres {
    private List<Titre> laListe;

    public ServiceTitres() {
        laListe = new ArrayList<Titre>();
    }

    public void ajouteTitre(Titre ptitre) throws Exception{
        if (this.laListe.size() > 10) {
            throw new Exception("Vous ne pouvez pas ajouter plus de 10 titres");
        } else if (this.existeTitre(ptitre.getLibelle())) {
            throw new Exception("Le titre que vous avez saisi est déja enregistré");
        } else {
            this.laListe.add(ptitre);
        }
    }

    public boolean existeTitre(String plibelle) throws Exception {
        boolean result = false;

        if (this.laListe.isEmpty()) {
            return result;
        } else {
            Iterator tabL = this.laListe.iterator();
            Titre titre;

            do {
                if (!tabL.hasNext())
                    return result;

                titre = (Titre)tabL.next();
            } while (!plibelle.equals(titre.getLibelle()));

            return true;
        }
    }

    public List<Titre> tousLesTitres() throws Exception {
        return this.laListe;
    }

    public List<String> lesCategories() throws Exception {
        List<String> lesCateg = new ArrayList();
        Iterator tabL2 = this.tousLesTitres().iterator();

        while (tabL2.hasNext()) {
            Titre tt1 = (Titre)tabL2.next();
            String cate = tt1.getCategorie();
            if (!lesCateg.contains(cate)) {
                lesCateg.add(cate);
            }
        }

        return lesCateg;
    }

    public List<Titre> lesTitresDeLaCategorie(String pcat) throws Exception {
        List<Titre> listR = new ArrayList();
        int i = 0;

        for (Iterator lalst = this.laListe.iterator(); lalst.hasNext(); ++i) {
            Titre tt2 = (Titre)lalst.next();
            if (pcat.equals(tt2.getCategorie()))
                listR.add(tt2);
        }

        return listR;
    }
}
