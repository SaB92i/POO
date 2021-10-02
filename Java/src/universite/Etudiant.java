package universite;
public class Etudiant{
    int netu;
    String nom;
    String prenom;
    String mail;
    String tel;
    public Etudiant(){
    }
    public Etudiant(int Netu,String Nom,String Prenom, String Mail,String Tel) {
    netu=Netu;
    nom=Nom;
    prenom=Prenom;
    mail=Mail;    
    tel=Tel;
    }
    public int getnetu() {
    return netu;
    }
    public String getnom() {
    return nom;
    }
    public String getprenom() {
    return prenom;
    }
    public String getmail() {
    return mail;
    }
    public String gettel() {
    return tel;
    }
    public void setMail(String mail){
    this.mail=mail;    
    }
    public void setTel(String tel){
    this.tel=tel;   
    }
    public void afficher(){
    System.out.println("Numero etudiant : " + netu + " nom : " + nom + " prenom : " + prenom + " mail : " + mail + " numero de telephone" + tel);
    }












}
