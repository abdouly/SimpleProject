/**
 * Created by rahamamane on 20/11/16.
 */
public class Etudiant {
    private String nom;
    private  String prenom;
    private int age;
    private long numEtudiant;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public long getNumEtudiant() {
        return numEtudiant;
    }

    public Etudiant(String nom, String prenom, int age, long numEtudiant) {

        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numEtudiant = numEtudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numEtudiant=" + numEtudiant +
                '}';
    }

    public int hashCode() {
        return nom.hashCode()+prenom.hashCode();
    }

    public static void main(String [] args) {
        Etudiant etudiant = new Etudiant("diallo","mariam",21,343445);
        System.out.println(etudiant.toString());
    }

    public void affichage() {

    }
}

