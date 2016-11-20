import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahamamane on 20/11/16.
 */
public class Matiere {
    private String nom;
    private  int coef;
    private List<Etudiant> etudiants = new ArrayList<>() ;

    public String getNom() {
        return nom;
    }

    public int getCoef() {
        return coef;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public Matiere(String nom, int coef) {

        this.nom = nom;
        this.coef = coef;
    }

    public String ensembleEtudiantsInscrit() {
        String ens = new String("");
        for(Etudiant etu : etudiants){
            ens += etu.getNom()+" "+etu.getPrenom()+"\n";
        }
        return ens;
    }
}
